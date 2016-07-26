package io.swagger.api.factories;

import io.swagger.api.BuyersApiService;
import io.swagger.api.impl.BuyersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class BuyersApiServiceFactory {
    private final static BuyersApiService service = new BuyersApiServiceImpl();

    public static BuyersApiService getBuyersApi() {
        return service;
    }
}
