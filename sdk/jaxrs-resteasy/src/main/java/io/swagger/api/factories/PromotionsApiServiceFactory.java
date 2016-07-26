package io.swagger.api.factories;

import io.swagger.api.PromotionsApiService;
import io.swagger.api.impl.PromotionsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PromotionsApiServiceFactory {

   private final static PromotionsApiService service = new PromotionsApiServiceImpl();

   public static PromotionsApiService getPromotionsApi()
   {
      return service;
   }
}
