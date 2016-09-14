# OrderCloud Swagger

This is a repository for the OrderCloud API [Swagger Spec](http://swagger.io/specification) and all the generated SDK's.

# Folder Structure

- `templates` folder contains any custom templates made to generate the OrderCloud sdk's (such as for tweaking syntax or adding in built-in authentication or other things specific to our API)
- `config`: contains language specific configuration (e.g. gem name for Ruby, package name for Python etc)

# SDK Generation

To generate and SDK library, the first step is to download and install the [Swagger-Codegen](https://github.com/swagger-api/swagger-codegen) project. However, due to our implementation of `api_auth` custom templates we will download our own fork from GitHub:

```shell
git clone https://github.com/ordercloud-api/swagger-codegen
```

Clone this repository and change directory:

```shell
git clone https://github.com/ordercloud-api/ordercloud-swagger
cd ordercloud-swagger
```

The command to generate a SDK is the following:

```shell
java -jar /path/to/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ordercloud_swagger.json -l language -o output/language -t templates/language
```

For example, to generate the Python SDK:

```shell
java -jar /path/to/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ordercloud_swagger.json -l python -o output/python -t templates/python
```

This will output the sdk to the `output/python` directory, and it will use the templates in `templates/python`. If you want to generate another language, just replace `python` with your language of choice.

# Creating a new SDK

While Swagger can generate dozens of clients from a single spec, there is some aditional work needed to be done to get an SDK ready for use:

1. Clone the [ordercloud-api/swagger-codegen](https://github.com/ordercloud-api/swagger-codegen) fork.
2. Copy the default Swagger templates from `swagger-codegen/modules/swagger-codegen/src/main/resources/[your_lang]` to the `ordercloud-swagger/templates` folder
3. **Unwrap the filters object**. The OrderCloud API can take some free-form query params when searching, but this isn't supported by default with Swagger. You have to add some code into the templates to convert that filters object into the key/value pairs. You can see an example of this in the Python templates [here](https://github.com/Four51/ordercloud-swagger/blob/master/templates/python/api_client.mustache#L153_L159)
4. **Add an ApiAuth class** to provide authentication. By default, the generated Swagger clients will expect you to pass in an access token manually. We want to support that, but also have a convenient way to just login and have it automatically acquire and save the access token. Here are the steps:
  1. Add the following properties to the `Configuration` class:
    - `client_id`: string
    - `scopes`: array of string
    - `auth_url`: string
    - `impersonation_token`: string
  2. Create a new template file `api_auth.mustache` and its test file `api_auth_spec.mustache` in `ordercloud-swagger/templates/[language]`. See example [here](https://github.com/ordercloud-api/ordercloud-swagger/templates/ruby/api_auth.rb) and its related spec [here](https://github.com/ordercloud-api/ordercloud-swagger/templates/ruby/api_auth_spec.rb)
  3. Update the swagger-codegen generator for the desired target language. Edit the file related to your language at `swagger-codegen/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/[LANGUAGE]CodeGen.java` and add the new files in the supporting files and optional files. See [this commit](https://github.com/ordercloud-api/swagger-codegen/commit/43fc06f03be8d480ee126ee56001729a1eb1d429) for example.

  ```java
    supportingFiles.add(new SupportingFile("api_auth.mustache", gemFolder, "api_auth.[LANGUAGE_EXTENSION]"));
    writeOptional(outputFolder, new SupportingFile("api_auth_spec.mustache", specFolder, "api_auth_spec.[LANGUAGE_EXTENSION]"));
  ```

5. Add any language specific files. For example, the ruby sdk implements a specific `Rakefile` to facilitate development. Don't forget to add it to the `[LANGUAGE]CodeGen.java` file as well.
6. **Polish up the generated docs**. By default, the code examples will ask the user to manually insert their access token, but we want that to use our login/configuration methods. You can edit the generated docs the same way you edit the generated code. Find the `api_doc.mustache` file and edit that as you wish. You should also polish up the Readme.
7. Create a language specific file in `ordercloud-swagger/config/[LANGUAGE].json`. See example [here](https://github.com/ordercloud-api/ordercloud-swagger/config/ruby.json). You can find variables available for the language desired with `java -jar swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar config-help -l [LANGUUAGE]`
8. Make sure to link to the official API docs in case something is broken or unclear with the generated SDK.

And that's it! The next steps would just be to publish your new library on whatever package manager or registry this language uses.

# Development contribution

## Tips

To avoid having to re-type the generate command and copy and paste the following in your `~/.aliases` file and adapt it to your configuration:

```bash
generate_swagger_sdk() {
  java -jar /path/to/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
    -i ordercloud_swagger.json \
    -l $1 \
    -o output/$1 \
    -t templates/$1 \
    -c config/$1.json \
    --git-user-id "ordercloud-api" \
    --git-repo-id "ordercloud-$1-sdk" \
    --release-note "$2"
}

show_swagger_lang_help() {
  java -jar /path/to/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar config-help -l $1
}

alias swag-gen=generate_swagger_sdk
alias swag-conf=show_swagger_lang_help
```

Now run `source ~/.aliases` to reload your aliases configuration and you can now use the following commands:

```shell
cd ordercloud-swaggger
swag-conf [LANGUAGE]
swag-gen [LANGUAGE] "[RELEASE NOTE]"
```

## Ruby

To develop the Ruby SDK, go through the following steps in the Ruby SDK folder to have a proper environment:

1. Install the `bundler` gem with `gem install bundler`
2. Install the gem dependencies with `bundle install`
3. Run `bundle exec rake` to run all the tests.

## Python

N/A

## Php

N/A
