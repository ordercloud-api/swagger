package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdminusersApiService;
import io.swagger.api.factories.AdminusersApiServiceFactory;

import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/adminusers")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class AdminusersApi  {
   private final AdminusersApiService delegate = AdminusersApiServiceFactory.getAdminusersApi();

    @POST
    
    
    
    public Response create( User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(user,securityContext);
    }
    @DELETE
    @Path("/{userID}")
    
    
    public Response delete( @PathParam("userID") String userID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(userID,securityContext);
    }
    @GET
    @Path("/{userID}")
    
    
    public Response get( @PathParam("userID") String userID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(userID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{userID}")
    
    
    public Response patch( @PathParam("userID") String userID, User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(userID,user,securityContext);
    }
    @PUT
    @Path("/{userID}")
    
    
    public Response update( @PathParam("userID") String userID, User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(userID,user,securityContext);
    }
}
