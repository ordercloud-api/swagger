package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SecurityProfilesApiService;
import io.swagger.api.factories.SecurityProfilesApiServiceFactory;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/SecurityProfiles")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class SecurityProfilesApi  {
   private final SecurityProfilesApiService delegate = SecurityProfilesApiServiceFactory.getSecurityProfilesApi();

    @GET
    @Path("/{securityProfileID}")
    
    
    public Response get( @PathParam("securityProfileID") String securityProfileID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(securityProfileID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
}
