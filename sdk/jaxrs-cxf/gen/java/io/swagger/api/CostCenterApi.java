package io.swagger.api;

import io.swagger.model.CostCenter;
import io.swagger.model.CostCenterAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface CostCenterApi  {
    @POST
    @Path("/buyers/{buyerID}/costcenters")
    
    
    public Response create(@PathParam("buyerID") String buyerID,CostCenter costCenter);
    @DELETE
    @Path("/buyers/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID);
    @DELETE
    @Path("/buyers/{buyerID}/costcenters/{costCenterID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @GET
    @Path("/buyers/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID);
    @GET
    @Path("/buyers/{buyerID}/costcenters")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/costcenters/assignments")
    
    
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("costCenterID") String costCenterID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,CostCenter costCenter);
    @POST
    @Path("/buyers/{buyerID}/costcenters/assignments")
    
    
    public Response saveAssignment(@PathParam("buyerID") String buyerID,CostCenterAssignment assignment);
    @PUT
    @Path("/buyers/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,CostCenter costCenter);
}

