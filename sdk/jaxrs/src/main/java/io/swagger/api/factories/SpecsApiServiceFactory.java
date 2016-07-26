package io.swagger.api.factories;

import io.swagger.api.SpecsApiService;
import io.swagger.api.impl.SpecsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class SpecsApiServiceFactory {
    private final static SpecsApiService service = new SpecsApiServiceImpl();

    public static SpecsApiService getSpecsApi() {
        return service;
    }
}
