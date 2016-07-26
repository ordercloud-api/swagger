package io.swagger.api;

import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/priceschedules")

@Api(description = "the priceschedules API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class PriceschedulesApi  {

    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(PriceSchedule priceSchedule) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{priceScheduleID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@PathParam("priceScheduleID") String priceScheduleID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deletePriceBreak(@PathParam("priceScheduleID") String priceScheduleID,@QueryParam("quantity") Integer quantity) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{priceScheduleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("priceScheduleID") String priceScheduleID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{priceScheduleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@PathParam("priceScheduleID") String priceScheduleID,PriceSchedule priceSchedule) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response savePriceBreak(@PathParam("priceScheduleID") String priceScheduleID,PriceBreak priceBreak) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{priceScheduleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@PathParam("priceScheduleID") String priceScheduleID,PriceSchedule priceSchedule) {
    	return Response.ok().entity("magic!").build();
    }
}

