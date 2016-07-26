package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/SecurityProfiles")

@Api(description = "the SecurityProfiles API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class SecurityProfilesApi  {

    @GET
    @Path("/{securityProfileID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SecurityProfile",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("securityProfileID") String securityProfileID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SecurityProfile" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }
}

