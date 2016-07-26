package io.swagger.api;

import io.swagger.model.CreditCard;
import io.swagger.model.CreditCardAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface CreditCardApi  {
    @POST
    @Path("/buyers/{buyerID}/creditcards")
    
    
    public Response create(@PathParam("buyerID") String buyerID,CreditCard card);
    @DELETE
    @Path("/buyers/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID);
    @DELETE
    @Path("/buyers/{buyerID}/creditcards/{creditCardID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @GET
    @Path("/buyers/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID);
    @GET
    @Path("/buyers/{buyerID}/creditcards")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/creditcards/assignments")
    
    
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("creditCardID") String creditCardID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,CreditCard card);
    @POST
    @Path("/buyers/{buyerID}/creditcards/assignments")
    
    
    public Response saveAssignment(@PathParam("buyerID") String buyerID,CreditCardAssignment assignment);
    @PUT
    @Path("/buyers/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,CreditCard card);
}

