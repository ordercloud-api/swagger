package io.swagger.api;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface PasswordResetApi  {
    @PUT
    @Path("/password/reset/{verificationCode}")
    
    
    public Response resetPassword(@PathParam("verificationCode") String verificationCode,PasswordReset passwordReset);
    @POST
    @Path("/password/reset")
    
    
    public Response sendVerificationCode(PasswordResetRequest passwordResetRequest);
}

