package io.swagger.api.factories;

import io.swagger.api.BuyersApiService;
import io.swagger.api.impl.BuyersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class BuyersApiServiceFactory {

   private final static BuyersApiService service = new BuyersApiServiceImpl();

   public static BuyersApiService getBuyersApi()
   {
      return service;
   }
}
