package io.swagger.api;

import io.swagger.model.User;
import io.swagger.model.ImpersonateTokenRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface UserApi  {
    @POST
    @Path("/buyers/{buyerID}/users")
    
    
    public Response create(@PathParam("buyerID") String buyerID,User user);
    @DELETE
    @Path("/buyers/{buyerID}/users/{userID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID);
    @GET
    @Path("/buyers/{buyerID}/users/{userID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID);
    @POST
    @Path("/buyers/{buyerID}/users/{userID}/accesstoken")
    
    
    public Response getAccessToken(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,ImpersonateTokenRequest tokenRequest);
    @GET
    @Path("/buyers/{buyerID}/users")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("userGroupID") String userGroupID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/users/{userID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,User user);
    @PUT
    @Path("/buyers/{buyerID}/users/{userID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,User user);
}

