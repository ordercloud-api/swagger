package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrdersApiService;
import io.swagger.api.factories.OrdersApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/orders")


@io.swagger.annotations.Api(description = "the orders API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class OrdersApi  {
   private final OrdersApiService delegate = OrdersApiServiceFactory.getOrdersApi();

    @GET
    @Path("/incoming")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listIncoming(@ApiParam(value = "ID of the buyer.") @QueryParam("buyerID") String buyerID
,@ApiParam(value = "Lower bound of date range that the order was submitted.") @QueryParam("from") String from
,@ApiParam(value = "Upper bound of date range that the order was submitted.") @QueryParam("to") String to
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listIncoming(buyerID,from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/outgoing")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listOutgoing(@ApiParam(value = "ID of the buyer.") @QueryParam("buyerID") String buyerID
,@ApiParam(value = "Lower bound of date range that the order was created.") @QueryParam("from") String from
,@ApiParam(value = "Upper bound of date range that the order was created.") @QueryParam("to") String to
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOutgoing(buyerID,from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
}
