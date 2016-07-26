package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/orders")

@Api(description = "the orders API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class OrdersApi  {

    @GET
    @Path("/incoming")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listIncoming(@QueryParam("buyerID") String buyerID,@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/outgoing")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listOutgoing(@QueryParam("buyerID") String buyerID,@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }
}

