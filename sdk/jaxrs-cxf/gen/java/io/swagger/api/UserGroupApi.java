package io.swagger.api;

import io.swagger.model.UserGroup;
import io.swagger.model.UserGroupAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface UserGroupApi  {
    @POST
    @Path("/buyers/{buyerID}/usergroups")
    
    
    public Response create(@PathParam("buyerID") String buyerID,UserGroup group);
    @DELETE
    @Path("/buyers/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID);
    @DELETE
    @Path("/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}")
    
    
    public Response deleteUserAssignment(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,@PathParam("userID") String userID);
    @GET
    @Path("/buyers/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID);
    @GET
    @Path("/buyers/{buyerID}/usergroups")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/usergroups/assignments")
    
    
    public Response listUserAssignments(@PathParam("buyerID") String buyerID,@QueryParam("userGroupID") String userGroupID,@QueryParam("userID") String userID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,UserGroup group);
    @POST
    @Path("/buyers/{buyerID}/usergroups/assignments")
    
    
    public Response saveUserAssignment(@PathParam("buyerID") String buyerID,UserGroupAssignment userGroupAssignment);
    @PUT
    @Path("/buyers/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,UserGroup group);
}

