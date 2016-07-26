package io.swagger.api.factories;

import io.swagger.api.ProductsApiService;
import io.swagger.api.impl.ProductsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class ProductsApiServiceFactory {
    private final static ProductsApiService service = new ProductsApiServiceImpl();

    public static ProductsApiService getProductsApi() {
        return service;
    }
}
