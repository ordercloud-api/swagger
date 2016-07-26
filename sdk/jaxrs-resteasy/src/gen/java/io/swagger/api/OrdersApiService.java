package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class OrdersApiService {
      public abstract Response listIncoming(String buyerID,String from,String to,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listOutgoing(String buyerID,String from,String to,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
}
