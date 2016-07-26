package io.swagger.api;

import io.swagger.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface AdminUserApi  {
    @POST
    @Path("/adminusers")
    
    
    public Response create(User user);
    @DELETE
    @Path("/adminusers/{userID}")
    
    
    public Response delete(@PathParam("userID") String userID);
    @GET
    @Path("/adminusers/{userID}")
    
    
    public Response get(@PathParam("userID") String userID);
    @GET
    @Path("/adminusers")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/adminusers/{userID}")
    
    
    public Response patch(@PathParam("userID") String userID,User user);
    @PUT
    @Path("/adminusers/{userID}")
    
    
    public Response update(@PathParam("userID") String userID,User user);
}

