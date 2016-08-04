# OrderCloud Swagger

This is a repository for the OrderCloud API [Swagger Spec](http://swagger.io/specification) and all the generated SDK's. 

# Folder Structure 

The `sdk` folder includes all the languages that have generated sdk's. This is only a sample and may not be up to date.

The `templates` folder contains any custom templates made to generate the OrderCloud sdk's (such as for tweaking syntax or adding in built-in authentication or other things specific to our API)

# How to Regenerate 

To generate and SDK library, the first step is to download and install the [Swagger-Codegen](https://github.com/swagger-api/swagger-codegen) project. (The easiest way is through Docker).

Once that is done, you can generate the `python` sdk, for example, by running:

```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ordercloud_swagger.json -l python -o output/python -t templates/python -DpackageName=OrderCloud
```

Where `ordercloud_swagger.json` is the Swagger spec for the API. (This can be generated from the C# code on BitBucket).

This will output the sdk to the `output/python` directory, and it will use the templates in `templates/python`. If you want to generate another language, just replace `python` with your language of choice.

You can find a full list of supported languages here: [generator.swagger.io](http://generator.swagger.io/)

# Creating a new SDK

While Swagger can generate dozens of clients from a single spec, there is some aditional work needed to be done to get an SDK ready for use:

1. Copy the default Swagger templates from `swagger-codegen/modules/swagger-codegen/src/main/resources/[your_lang]`
2. **Unwrap the filters object**. The OrderCloud API can take some free-form query params when searching, but this isn't supported by default with Swagger. You have to add some code into the templates to convert that filters object into the key/value pairs. You can see an example of this in the Python templates [here](https://github.com/Four51/ordercloud-swagger/blob/master/templates/python/api_client.mustache#L153_L159)
3. **Add the configuration/auth methods**. By default, the generated Swagger clients will expect you to pass in an access token manually. We want to support that, but also have a convenient way to just login and have it automatically acquire and save the access token. Each client library has a `Configuration` class. You'll want to add properties like the `client_id` and `scopes` array. (Example in Python [here](https://github.com/Four51/ordercloud-swagger/blob/master/templates/python/configuration.mustache#L88_L91)). As well as a login method (again, example [here](https://github.com/Four51/ordercloud-swagger/blob/master/templates/python/configuration.mustache#L254_L280))
4. **Polish up the generated docs**. By default, the code examples will ask the user to manually insert their access token, but we want that to use our login/configuration methods. You can edit the generated docs the same way you edit the generated code. Find the `api_doc.mustache` file and edit that as you wish. You should also polish up the Readme. 
5. Make sure to link to the official API docs in case something is broken or unclear with the generated SDK.

And that's it! The next steps would just be to publish your new library on whatever package manager or registry this language uses.  