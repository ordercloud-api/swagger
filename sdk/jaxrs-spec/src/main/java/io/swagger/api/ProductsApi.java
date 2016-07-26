package io.swagger.api;

import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/products")

@Api(description = "the products API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class ProductsApi  {

    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(Product product) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{productID}/assignments/{buyerID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "As price schedules aren't assigned to a party without their accompanying product, you don't use Delete Assignment to delete a price schedule. If you need to remove a price schedule assignment, update the assignment to have the price schedule ID as a null. ", response = void.class) })
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("productID") String productID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{productID}/variants/generate")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response generateVariants(@PathParam("productID") String productID,@QueryParam("overwriteExisting") Boolean overwriteExisting) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}/inventory")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Getting the Inventory on an Inventory-enabled product returns two things: the Avalible inventory, and the Reserved inventory. When an Order includes a product on the a lineitem, the total amount of that product is reserved. When that Order is submitted, the products previously reserved for that order are removed from the total inventory and the reserved ammount.", response = Object.class) })
    public Response getInventory(@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}/variants/{variantID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}/variants/inventory/{variantID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Getting the Variant Inventory will return the Name, Available Inventory and Reserved Inventory for a specific product variant based on the ProductID and VariantID specified. ", response = Object.class) })
    public Response getVariantInventory(@PathParam("productID") String productID,@PathParam("variantID") String variantID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@QueryParam("productID") String productID,@QueryParam("buyerID") String buyerID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("priceScheduleID") String priceScheduleID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/inventory")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listInventory(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}/variants/inventory")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Listing the Variant Inventory will return a list of all variants under a specific product and each variant's available and reserved inventory.", response = Object.class) })
    public Response listVariantInventory(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{productID}/variants")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listVariants(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch(@PathParam("productID") String productID,Product product) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{productID}/variants/{variantID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID,Variant variant) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(ProductAssignment productAssignment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@PathParam("productID") String productID,Product product) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{productID}/inventory/{inventory}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateInventory(@PathParam("productID") String productID,@PathParam("inventory") Integer inventory) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{productID}/variants/{variantID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateVariant(@PathParam("productID") String productID,@PathParam("variantID") String variantID,Variant variant) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{productID}/variants/inventory/{variantID}/{inventory}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Product" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateVariantInventory(@PathParam("productID") String productID,@PathParam("variantID") String variantID,@PathParam("inventory") Integer inventory) {
    	return Response.ok().entity("magic!").build();
    }
}

