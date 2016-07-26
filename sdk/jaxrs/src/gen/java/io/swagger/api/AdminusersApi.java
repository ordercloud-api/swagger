package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdminusersApiService;
import io.swagger.api.factories.AdminusersApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/adminusers")


@io.swagger.annotations.Api(description = "the adminusers API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class AdminusersApi  {
   private final AdminusersApiService delegate = AdminusersApiServiceFactory.getAdminusersApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(user,securityContext);
    }
    @DELETE
    @Path("/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(userID,securityContext);
    }
    @GET
    @Path("/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(userID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch(@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(userID,user,securityContext);
    }
    @PUT
    @Path("/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "AdminUser", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(userID,user,securityContext);
    }
}
