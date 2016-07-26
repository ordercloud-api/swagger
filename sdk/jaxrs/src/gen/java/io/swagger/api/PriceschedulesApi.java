package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PriceschedulesApiService;
import io.swagger.api.factories.PriceschedulesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/priceschedules")


@io.swagger.annotations.Api(description = "the priceschedules API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class PriceschedulesApi  {
   private final PriceschedulesApiService delegate = PriceschedulesApiServiceFactory.getPriceschedulesApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) PriceSchedule priceSchedule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(priceSchedule,securityContext);
    }
    @DELETE
    @Path("/{priceScheduleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(priceScheduleID,securityContext);
    }
    @DELETE
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deletePriceBreak(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@ApiParam(value = "Quantity of the price schedule.",required=true) @QueryParam("quantity") Integer quantity
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePriceBreak(priceScheduleID,quantity,securityContext);
    }
    @GET
    @Path("/{priceScheduleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(priceScheduleID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{priceScheduleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@ApiParam(value = "" ,required=true) PriceSchedule priceSchedule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(priceScheduleID,priceSchedule,securityContext);
    }
    @POST
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response savePriceBreak(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@ApiParam(value = "" ,required=true) PriceBreak priceBreak
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.savePriceBreak(priceScheduleID,priceBreak,securityContext);
    }
    @PUT
    @Path("/{priceScheduleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PriceSchedule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the price schedule.",required=true) @PathParam("priceScheduleID") String priceScheduleID
,@ApiParam(value = "" ,required=true) PriceSchedule priceSchedule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(priceScheduleID,priceSchedule,securityContext);
    }
}
