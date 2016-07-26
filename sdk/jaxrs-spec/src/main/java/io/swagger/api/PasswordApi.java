package io.swagger.api;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/password")

@Api(description = "the password API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class PasswordApi  {

    @PUT
    @Path("/reset/{verificationCode}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PasswordReset",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response resetPassword(@PathParam("verificationCode") String verificationCode,PasswordReset passwordReset) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/reset")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PasswordReset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Sends a temporary verification code via email, which must subsequently be passed in a Reset Password call.", response = void.class) })
    public Response sendVerificationCode(PasswordResetRequest passwordResetRequest) {
    	return Response.ok().entity("magic!").build();
    }
}

