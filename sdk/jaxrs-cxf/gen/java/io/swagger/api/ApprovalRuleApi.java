package io.swagger.api;

import io.swagger.model.ApprovalRule;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface ApprovalRuleApi  {
    @POST
    @Path("/buyers/{buyerID}/approvalrules")
    
    
    public Response create(@PathParam("buyerID") String buyerID,ApprovalRule approvalRule);
    @DELETE
    @Path("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID);
    @GET
    @Path("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID);
    @GET
    @Path("/buyers/{buyerID}/approvalrules")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID,ApprovalRule partialApprovalRule);
    @PUT
    @Path("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID,ApprovalRule approvalRule);
}

