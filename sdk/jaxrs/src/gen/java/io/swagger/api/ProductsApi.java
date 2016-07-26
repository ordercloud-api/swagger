package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProductsApiService;
import io.swagger.api.factories.ProductsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/products")


@io.swagger.annotations.Api(description = "the products API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class ProductsApi  {
   private final ProductsApiService delegate = ProductsApiServiceFactory.getProductsApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) Product product
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(product,securityContext);
    }
    @DELETE
    @Path("/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(productID,securityContext);
    }
    @DELETE
    @Path("/{productID}/assignments/{buyerID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "As price schedules aren't assigned to a party without their accompanying product, you don't use Delete Assignment to delete a price schedule. If you need to remove a price schedule assignment, update the assignment to have the price schedule ID as a null. ", response = void.class) })
    public Response deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(buyerID,productID,userID,userGroupID,securityContext);
    }
    @POST
    @Path("/{productID}/variants/generate")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response generateVariants(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "Overwrite existing of the product.") @QueryParam("overwriteExisting") Boolean overwriteExisting
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.generateVariants(productID,overwriteExisting,securityContext);
    }
    @GET
    @Path("/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(productID,securityContext);
    }
    @GET
    @Path("/{productID}/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Getting the Inventory on an Inventory-enabled product returns two things: the Avalible inventory, and the Reserved inventory. When an Order includes a product on the a lineitem, the total amount of that product is reserved. When that Order is submitted, the products previously reserved for that order are removed from the total inventory and the reserved ammount.", response = Object.class) })
    public Response getInventory(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInventory(productID,securityContext);
    }
    @GET
    @Path("/{productID}/variants/{variantID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getVariant(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the variant.",required=true) @PathParam("variantID") String variantID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVariant(productID,variantID,securityContext);
    }
    @GET
    @Path("/{productID}/variants/inventory/{variantID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Getting the Variant Inventory will return the Name, Available Inventory and Reserved Inventory for a specific product variant based on the ProductID and VariantID specified. ", response = Object.class) })
    public Response getVariantInventory(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the variant.",required=true) @PathParam("variantID") String variantID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVariantInventory(productID,variantID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@ApiParam(value = "ID of the product.") @QueryParam("productID") String productID
,@ApiParam(value = "ID of the buyer.") @QueryParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the product.") @QueryParam("level") String level
,@ApiParam(value = "ID of the price schedule.") @QueryParam("priceScheduleID") String priceScheduleID
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(productID,buyerID,userID,userGroupID,level,priceScheduleID,page,pageSize,securityContext);
    }
    @GET
    @Path("/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listInventory(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listInventory(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{productID}/variants/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Listing the Variant Inventory will return a list of all variants under a specific product and each variant's available and reserved inventory.", response = Object.class) })
    public Response listVariantInventory(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVariantInventory(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{productID}/variants")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listVariants(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVariants(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "" ,required=true) Product product
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(productID,product,securityContext);
    }
    @PATCH
    @Path("/{productID}/variants/{variantID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchVariant(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the variant.",required=true) @PathParam("variantID") String variantID
,@ApiParam(value = "" ,required=true) Variant variant
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchVariant(productID,variantID,variant,securityContext);
    }
    @POST
    @Path("/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(@ApiParam(value = "" ,required=true) ProductAssignment productAssignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(productAssignment,securityContext);
    }
    @PUT
    @Path("/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "" ,required=true) Product product
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(productID,product,securityContext);
    }
    @PUT
    @Path("/{productID}/inventory/{inventory}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateInventory(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "Inventory of the product.",required=true) @PathParam("inventory") Integer inventory
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateInventory(productID,inventory,securityContext);
    }
    @PUT
    @Path("/{productID}/variants/{variantID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateVariant(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the variant.",required=true) @PathParam("variantID") String variantID
,@ApiParam(value = "" ,required=true) Variant variant
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVariant(productID,variantID,variant,securityContext);
    }
    @PUT
    @Path("/{productID}/variants/inventory/{variantID}/{inventory}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateVariantInventory(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the variant.",required=true) @PathParam("variantID") String variantID
,@ApiParam(value = "Inventory of the product.",required=true) @PathParam("inventory") Integer inventory
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVariantInventory(productID,variantID,inventory,securityContext);
    }
}
