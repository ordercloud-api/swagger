package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PasswordApiService;
import io.swagger.api.factories.PasswordApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/password")


@io.swagger.annotations.Api(description = "the password API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class PasswordApi  {
   private final PasswordApiService delegate = PasswordApiServiceFactory.getPasswordApi();

    @PUT
    @Path("/reset/{verificationCode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PasswordReset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response resetPassword(@ApiParam(value = "Verification code of the forgotten password.",required=true) @PathParam("verificationCode") String verificationCode
,@ApiParam(value = "" ,required=true) PasswordReset passwordReset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resetPassword(verificationCode,passwordReset,securityContext);
    }
    @POST
    @Path("/reset")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "PasswordReset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Sends a temporary verification code via email, which must subsequently be passed in a Reset Password call.", response = void.class) })
    public Response sendVerificationCode(@ApiParam(value = "" ,required=true) PasswordResetRequest passwordResetRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendVerificationCode(passwordResetRequest,securityContext);
    }
}
