package io.swagger.api.factories;

import io.swagger.api.PasswordApiService;
import io.swagger.api.impl.PasswordApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class PasswordApiServiceFactory {
    private final static PasswordApiService service = new PasswordApiServiceImpl();

    public static PasswordApiService getPasswordApi() {
        return service;
    }
}
