package io.swagger.api;

import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface PriceScheduleApi  {
    @POST
    @Path("/priceschedules")
    
    
    public Response create(PriceSchedule priceSchedule);
    @DELETE
    @Path("/priceschedules/{priceScheduleID}")
    
    
    public Response delete(@PathParam("priceScheduleID") String priceScheduleID);
    @DELETE
    @Path("/priceschedules/{priceScheduleID}/PriceBreaks")
    
    
    public Response deletePriceBreak(@PathParam("priceScheduleID") String priceScheduleID,@QueryParam("quantity") Integer quantity);
    @GET
    @Path("/priceschedules/{priceScheduleID}")
    
    
    public Response get(@PathParam("priceScheduleID") String priceScheduleID);
    @GET
    @Path("/priceschedules")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/priceschedules/{priceScheduleID}")
    
    
    public Response patch(@PathParam("priceScheduleID") String priceScheduleID,PriceSchedule priceSchedule);
    @POST
    @Path("/priceschedules/{priceScheduleID}/PriceBreaks")
    
    
    public Response savePriceBreak(@PathParam("priceScheduleID") String priceScheduleID,PriceBreak priceBreak);
    @PUT
    @Path("/priceschedules/{priceScheduleID}")
    
    
    public Response update(@PathParam("priceScheduleID") String priceScheduleID,PriceSchedule priceSchedule);
}

