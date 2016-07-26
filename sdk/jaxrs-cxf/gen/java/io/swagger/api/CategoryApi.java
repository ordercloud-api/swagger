package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.CategoryAssignment;
import io.swagger.model.CategoryProductAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface CategoryApi  {
    @POST
    @Path("/buyers/{buyerID}/categories")
    
    
    public Response create(@PathParam("buyerID") String buyerID,Category category);
    @DELETE
    @Path("/buyers/{buyerID}/categories/{categoryID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID);
    @DELETE
    @Path("/buyers/{buyerID}/categories/{categoryID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @DELETE
    @Path("/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}")
    
    
    public Response deleteProductAssignment(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,@PathParam("productID") String productID);
    @GET
    @Path("/buyers/{buyerID}/categories/{categoryID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID);
    @GET
    @Path("/buyers/{buyerID}/categories")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("parentID") String parentID,@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/categories/assignments")
    
    
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("categoryID") String categoryID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/categories/{parentID}/categories")
    
    
    public Response listChildren(@PathParam("buyerID") String buyerID,@PathParam("parentID") String parentID,@QueryParam("search") String search,@QueryParam("depth") String depth,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/categories/productassignments")
    
    
    public Response listProductAssignments(@PathParam("buyerID") String buyerID,@QueryParam("categoryID") String categoryID,@QueryParam("productID") String productID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/categories/{categoryID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,Category category);
    @POST
    @Path("/buyers/{buyerID}/categories/assignments")
    
    
    public Response saveAssignment(@PathParam("buyerID") String buyerID,CategoryAssignment categoryAssignment);
    @POST
    @Path("/buyers/{buyerID}/categories/productassignments")
    
    
    public Response saveProductAssignment(@PathParam("buyerID") String buyerID,CategoryProductAssignment productAssignment);
    @PUT
    @Path("/buyers/{buyerID}/categories/{categoryID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,Category category);
}

