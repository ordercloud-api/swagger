package io.swagger.api;

import io.swagger.model.Buyer;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface BuyerApi  {
    @POST
    @Path("/buyers")
    
    
    public Response create(Buyer company);
    @DELETE
    @Path("/buyers/{buyerID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID);
    @GET
    @Path("/buyers/{buyerID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID);
    @GET
    @Path("/buyers")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PUT
    @Path("/buyers/{buyerID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,Buyer company);
}

