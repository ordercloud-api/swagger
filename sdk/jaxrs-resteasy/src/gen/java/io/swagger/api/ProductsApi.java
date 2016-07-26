package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProductsApiService;
import io.swagger.api.factories.ProductsApiServiceFactory;

import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/products")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class ProductsApi  {
   private final ProductsApiService delegate = ProductsApiServiceFactory.getProductsApi();

    @POST
    
    
    
    public Response create( Product product,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(product,securityContext);
    }
    @DELETE
    @Path("/{productID}")
    
    
    public Response delete( @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(productID,securityContext);
    }
    @DELETE
    @Path("/{productID}/assignments/{buyerID}")
    
    
    public Response deleteAssignment( @PathParam("buyerID") String buyerID, @PathParam("productID") String productID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(buyerID,productID,userID,userGroupID,securityContext);
    }
    @POST
    @Path("/{productID}/variants/generate")
    
    
    public Response generateVariants( @PathParam("productID") String productID, @QueryParam("overwriteExisting") Boolean overwriteExisting,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.generateVariants(productID,overwriteExisting,securityContext);
    }
    @GET
    @Path("/{productID}")
    
    
    public Response get( @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(productID,securityContext);
    }
    @GET
    @Path("/{productID}/inventory")
    
    
    public Response getInventory( @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInventory(productID,securityContext);
    }
    @GET
    @Path("/{productID}/variants/{variantID}")
    
    
    public Response getVariant( @PathParam("productID") String productID, @PathParam("variantID") String variantID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVariant(productID,variantID,securityContext);
    }
    @GET
    @Path("/{productID}/variants/inventory/{variantID}")
    
    
    public Response getVariantInventory( @PathParam("productID") String productID, @PathParam("variantID") String variantID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVariantInventory(productID,variantID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/assignments")
    
    
    public Response listAssignments( @QueryParam("productID") String productID, @QueryParam("buyerID") String buyerID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("priceScheduleID") String priceScheduleID, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(productID,buyerID,userID,userGroupID,level,priceScheduleID,page,pageSize,securityContext);
    }
    @GET
    @Path("/inventory")
    
    
    public Response listInventory( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listInventory(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{productID}/variants/inventory")
    
    
    public Response listVariantInventory( @PathParam("productID") String productID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVariantInventory(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{productID}/variants")
    
    
    public Response listVariants( @PathParam("productID") String productID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVariants(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{productID}")
    
    
    public Response patch( @PathParam("productID") String productID, Product product,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(productID,product,securityContext);
    }
    @PATCH
    @Path("/{productID}/variants/{variantID}")
    
    
    public Response patchVariant( @PathParam("productID") String productID, @PathParam("variantID") String variantID, Variant variant,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchVariant(productID,variantID,variant,securityContext);
    }
    @POST
    @Path("/assignments")
    
    
    public Response saveAssignment( ProductAssignment productAssignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(productAssignment,securityContext);
    }
    @PUT
    @Path("/{productID}")
    
    
    public Response update( @PathParam("productID") String productID, Product product,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(productID,product,securityContext);
    }
    @PUT
    @Path("/{productID}/inventory/{inventory}")
    
    
    public Response updateInventory( @PathParam("productID") String productID, @PathParam("inventory") Integer inventory,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateInventory(productID,inventory,securityContext);
    }
    @PUT
    @Path("/{productID}/variants/{variantID}")
    
    
    public Response updateVariant( @PathParam("productID") String productID, @PathParam("variantID") String variantID, Variant variant,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVariant(productID,variantID,variant,securityContext);
    }
    @PUT
    @Path("/{productID}/variants/inventory/{variantID}/{inventory}")
    
    
    public Response updateVariantInventory( @PathParam("productID") String productID, @PathParam("variantID") String variantID, @PathParam("inventory") Integer inventory,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVariantInventory(productID,variantID,inventory,securityContext);
    }
}
