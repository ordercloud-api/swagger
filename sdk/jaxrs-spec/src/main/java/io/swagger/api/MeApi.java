package io.swagger.api;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/me")

@Api(description = "the me API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class MeApi  {

    @POST
    @Path("/addresses")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    public Response createAddress(BuyerAddress address) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/creditcards")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    public Response createCreditCard(BuyerCreditCard creditCard) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response deleteAddress(@PathParam("addressID") String addressID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/creditcards/{creditcardID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response deleteCreditCard(@PathParam("creditcardID") String creditcardID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get() {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getAddress(@PathParam("addressID") String addressID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/creditcards/{creditcardID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getCreditCard(@PathParam("creditcardID") String creditcardID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/orders/{orderID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getOrder(@PathParam("orderID") String orderID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/products/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getProduct(@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/promotions/{promotionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getPromotion(@PathParam("promotionID") String promotionID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/products/{productID}/specs/{specID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getSpec(@PathParam("productID") String productID,@PathParam("specID") String specID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/addresses")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listAddresses(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/categories")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCategories(@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/costcenters")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCostCenters(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/creditcards")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCreditCards(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/orders/incoming")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listIncomingOrders(@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/orders/outgoing")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listOutgoingOrders(@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/products")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listProducts(@QueryParam("categoryID") String categoryID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/promotions")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listPromotions(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/products/{productID}/specs")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listSpecs(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/categories/{parentID}/categories")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listSubcategories(@PathParam("parentID") String parentID,@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usergroups")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listUserGroups(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(User user) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response patchAddress(@PathParam("addressID") String addressID,BuyerAddress address) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/creditcards/{creditcardID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response patchCreditCard(@PathParam("creditcardID") String creditcardID,BuyerCreditCard creditCard) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(User user) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response updateAddress(@PathParam("addressID") String addressID,BuyerAddress address) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/creditcards/{creditcardID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response updateCreditCard(@PathParam("creditcardID") String creditcardID,BuyerCreditCard creditCard) {
    	return Response.ok().entity("magic!").build();
    }
}

