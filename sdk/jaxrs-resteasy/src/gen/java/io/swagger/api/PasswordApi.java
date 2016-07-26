package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PasswordApiService;
import io.swagger.api.factories.PasswordApiServiceFactory;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/password")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PasswordApi  {
   private final PasswordApiService delegate = PasswordApiServiceFactory.getPasswordApi();

    @PUT
    @Path("/reset/{verificationCode}")
    
    
    public Response resetPassword( @PathParam("verificationCode") String verificationCode, PasswordReset passwordReset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resetPassword(verificationCode,passwordReset,securityContext);
    }
    @POST
    @Path("/reset")
    
    
    public Response sendVerificationCode( PasswordResetRequest passwordResetRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendVerificationCode(passwordResetRequest,securityContext);
    }
}
