package io.swagger.api.factories;

import io.swagger.api.PriceschedulesApiService;
import io.swagger.api.impl.PriceschedulesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PriceschedulesApiServiceFactory {

   private final static PriceschedulesApiService service = new PriceschedulesApiServiceImpl();

   public static PriceschedulesApiService getPriceschedulesApi()
   {
      return service;
   }
}
