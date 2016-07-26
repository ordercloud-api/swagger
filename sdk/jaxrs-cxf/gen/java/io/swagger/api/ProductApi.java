package io.swagger.api;

import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface ProductApi  {
    @POST
    @Path("/products")
    
    
    public Response create(Product product);
    @DELETE
    @Path("/products/{productID}")
    
    
    public Response delete(@PathParam("productID") String productID);
    @DELETE
    @Path("/products/{productID}/assignments/{buyerID}")
    
    
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("productID") String productID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @POST
    @Path("/products/{productID}/variants/generate")
    
    
    public Response generateVariants(@PathParam("productID") String productID,@QueryParam("overwriteExisting") Boolean overwriteExisting);
    @GET
    @Path("/products/{productID}")
    
    
    public Response get(@PathParam("productID") String productID);
    @GET
    @Path("/products/{productID}/inventory")
    
    
    public Response getInventory(@PathParam("productID") String productID);
    @GET
    @Path("/products/{productID}/variants/{variantID}")
    
    
    public Response getVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID);
    @GET
    @Path("/products/{productID}/variants/inventory/{variantID}")
    
    
    public Response getVariantInventory(@PathParam("productID") String productID,@PathParam("variantID") String variantID);
    @GET
    @Path("/products")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/products/assignments")
    
    
    public Response listAssignments(@QueryParam("productID") String productID,@QueryParam("buyerID") String buyerID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("priceScheduleID") String priceScheduleID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/products/inventory")
    
    
    public Response listInventory(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/products/{productID}/variants/inventory")
    
    
    public Response listVariantInventory(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/products/{productID}/variants")
    
    
    public Response listVariants(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/products/{productID}")
    
    
    public Response patch(@PathParam("productID") String productID,Product product);
    @PATCH
    @Path("/products/{productID}/variants/{variantID}")
    
    
    public Response patchVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID,Variant variant);
    @POST
    @Path("/products/assignments")
    
    
    public Response saveAssignment(ProductAssignment productAssignment);
    @PUT
    @Path("/products/{productID}")
    
    
    public Response update(@PathParam("productID") String productID,Product product);
    @PUT
    @Path("/products/{productID}/inventory/{inventory}")
    
    
    public Response updateInventory(@PathParam("productID") String productID,@PathParam("inventory") Integer inventory);
    @PUT
    @Path("/products/{productID}/variants/{variantID}")
    
    
    public Response updateVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID,Variant variant);
    @PUT
    @Path("/products/{productID}/variants/inventory/{variantID}/{inventory}")
    
    
    public Response updateVariantInventory(@PathParam("productID") String productID,@PathParam("variantID") String variantID,@PathParam("inventory") Integer inventory);
}

