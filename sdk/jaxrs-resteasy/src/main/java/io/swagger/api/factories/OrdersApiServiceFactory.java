package io.swagger.api.factories;

import io.swagger.api.OrdersApiService;
import io.swagger.api.impl.OrdersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class OrdersApiServiceFactory {

   private final static OrdersApiService service = new OrdersApiServiceImpl();

   public static OrdersApiService getOrdersApi()
   {
      return service;
   }
}
