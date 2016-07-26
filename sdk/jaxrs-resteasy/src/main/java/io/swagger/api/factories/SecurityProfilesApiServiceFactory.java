package io.swagger.api.factories;

import io.swagger.api.SecurityProfilesApiService;
import io.swagger.api.impl.SecurityProfilesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class SecurityProfilesApiServiceFactory {

   private final static SecurityProfilesApiService service = new SecurityProfilesApiServiceImpl();

   public static SecurityProfilesApiService getSecurityProfilesApi()
   {
      return service;
   }
}
