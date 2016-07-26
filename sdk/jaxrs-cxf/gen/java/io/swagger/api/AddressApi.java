package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.AddressAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface AddressApi  {
    @POST
    @Path("/buyers/{buyerID}/addresses")
    
    
    public Response create(@PathParam("buyerID") String buyerID,Address address);
    @DELETE
    @Path("/buyers/{buyerID}/addresses/{addressID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID);
    @DELETE
    @Path("/buyers/{buyerID}/addresses/{addressID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @GET
    @Path("/buyers/{buyerID}/addresses/{addressID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID);
    @GET
    @Path("/buyers/{buyerID}/addresses")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/addresses/assignments")
    
    
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("addressID") String addressID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("isShipping") Boolean isShipping,@QueryParam("isBilling") Boolean isBilling,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/addresses/{addressID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,Address address);
    @POST
    @Path("/buyers/{buyerID}/addresses/assignments")
    
    
    public Response saveAssignment(@PathParam("buyerID") String buyerID,AddressAssignment assignment);
    @PUT
    @Path("/buyers/{buyerID}/addresses/{addressID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,Address address);
}

