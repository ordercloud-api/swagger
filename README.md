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

