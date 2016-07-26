package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrdersApiService;
import io.swagger.api.factories.OrdersApiServiceFactory;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/orders")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class OrdersApi  {
   private final OrdersApiService delegate = OrdersApiServiceFactory.getOrdersApi();

    @GET
    @Path("/incoming")
    
    
    public Response listIncoming( @QueryParam("buyerID") String buyerID, @QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listIncoming(buyerID,from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/outgoing")
    
    
    public Response listOutgoing( @QueryParam("buyerID") String buyerID, @QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOutgoing(buyerID,from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
}
