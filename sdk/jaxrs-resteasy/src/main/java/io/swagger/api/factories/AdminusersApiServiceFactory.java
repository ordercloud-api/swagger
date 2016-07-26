package io.swagger.api.factories;

import io.swagger.api.AdminusersApiService;
import io.swagger.api.impl.AdminusersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class AdminusersApiServiceFactory {

   private final static AdminusersApiService service = new AdminusersApiServiceImpl();

   public static AdminusersApiService getAdminusersApi()
   {
      return service;
   }
}
