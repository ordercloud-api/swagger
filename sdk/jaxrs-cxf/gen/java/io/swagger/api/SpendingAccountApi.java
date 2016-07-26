package io.swagger.api;

import io.swagger.model.SpendingAccount;
import io.swagger.model.SpendingAccountAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface SpendingAccountApi  {
    @POST
    @Path("/buyers/{buyerID}/spendingaccounts")
    
    
    public Response create(@PathParam("buyerID") String buyerID,SpendingAccount spendingAccount);
    @DELETE
    @Path("/buyers/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID);
    @DELETE
    @Path("/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @GET
    @Path("/buyers/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID);
    @GET
    @Path("/buyers/{buyerID}/spendingaccounts")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/spendingaccounts/assignments")
    
    
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("spendingAccountID") String spendingAccountID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,SpendingAccount spendingAccount);
    @POST
    @Path("/buyers/{buyerID}/spendingaccounts/assignments")
    
    
    public Response saveAssignment(@PathParam("buyerID") String buyerID,SpendingAccountAssignment assignment);
    @PUT
    @Path("/buyers/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,SpendingAccount spendingAccount);
}

