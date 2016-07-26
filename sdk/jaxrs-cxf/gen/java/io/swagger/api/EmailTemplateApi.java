package io.swagger.api;

import io.swagger.model.EmailTemplate;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface EmailTemplateApi  {
    @GET
    @Path("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType);
    @PATCH
    @Path("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType,EmailTemplate emailTemplate);
    @DELETE
    @Path("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response resetToDefault(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType);
    @PUT
    @Path("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType,EmailTemplate emailTemplate);
}

