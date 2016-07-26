package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PriceschedulesApiService;
import io.swagger.api.factories.PriceschedulesApiServiceFactory;

import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/priceschedules")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PriceschedulesApi  {
   private final PriceschedulesApiService delegate = PriceschedulesApiServiceFactory.getPriceschedulesApi();

    @POST
    
    
    
    public Response create( PriceSchedule priceSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(priceSchedule,securityContext);
    }
    @DELETE
    @Path("/{priceScheduleID}")
    
    
    public Response delete( @PathParam("priceScheduleID") String priceScheduleID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(priceScheduleID,securityContext);
    }
    @DELETE
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    public Response deletePriceBreak( @PathParam("priceScheduleID") String priceScheduleID, @QueryParam("quantity") Integer quantity,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePriceBreak(priceScheduleID,quantity,securityContext);
    }
    @GET
    @Path("/{priceScheduleID}")
    
    
    public Response get( @PathParam("priceScheduleID") String priceScheduleID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(priceScheduleID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{priceScheduleID}")
    
    
    public Response patch( @PathParam("priceScheduleID") String priceScheduleID, PriceSchedule priceSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(priceScheduleID,priceSchedule,securityContext);
    }
    @POST
    @Path("/{priceScheduleID}/PriceBreaks")
    
    
    public Response savePriceBreak( @PathParam("priceScheduleID") String priceScheduleID, PriceBreak priceBreak,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.savePriceBreak(priceScheduleID,priceBreak,securityContext);
    }
    @PUT
    @Path("/{priceScheduleID}")
    
    
    public Response update( @PathParam("priceScheduleID") String priceScheduleID, PriceSchedule priceSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(priceScheduleID,priceSchedule,securityContext);
    }
}
