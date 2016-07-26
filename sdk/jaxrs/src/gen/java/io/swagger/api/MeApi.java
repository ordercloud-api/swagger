package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeApiService;
import io.swagger.api.factories.MeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/me")


@io.swagger.annotations.Api(description = "the me API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class MeApi  {
   private final MeApiService delegate = MeApiServiceFactory.getMeApi();

    @POST
    @Path("/addresses")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    public Response createAddress(@ApiParam(value = "" ,required=true) BuyerAddress address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAddress(address,securityContext);
    }
    @POST
    @Path("/creditcards")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    public Response createCreditCard(@ApiParam(value = "" ,required=true) BuyerCreditCard creditCard
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCreditCard(creditCard,securityContext);
    }
    @DELETE
    @Path("/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response deleteAddress(@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAddress(addressID,securityContext);
    }
    @DELETE
    @Path("/creditcards/{creditcardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response deleteCreditCard(@ApiParam(value = "ID of the creditcard.",required=true) @PathParam("creditcardID") String creditcardID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCreditCard(creditcardID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(securityContext);
    }
    @GET
    @Path("/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getAddress(@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAddress(addressID,securityContext);
    }
    @GET
    @Path("/creditcards/{creditcardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getCreditCard(@ApiParam(value = "ID of the creditcard.",required=true) @PathParam("creditcardID") String creditcardID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCreditCard(creditcardID,securityContext);
    }
    @GET
    @Path("/orders/{orderID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getOrder(@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrder(orderID,securityContext);
    }
    @GET
    @Path("/products/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getProduct(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProduct(productID,securityContext);
    }
    @GET
    @Path("/promotions/{promotionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getPromotion(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPromotion(promotionID,securityContext);
    }
    @GET
    @Path("/products/{productID}/specs/{specID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response getSpec(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSpec(productID,specID,securityContext);
    }
    @GET
    @Path("/addresses")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listAddresses(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAddresses(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/categories")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCategories(@ApiParam(value = "Depth of the category.") @QueryParam("depth") String depth
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCategories(depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/costcenters")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCostCenters(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCostCenters(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/creditcards")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listCreditCards(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCreditCards(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/orders/incoming")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listIncomingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @QueryParam("from") String from
,@ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @QueryParam("to") String to
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listIncomingOrders(from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/orders/outgoing")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listOutgoingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @QueryParam("from") String from
,@ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @QueryParam("to") String to
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOutgoingOrders(from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/products")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listProducts(@ApiParam(value = "ID of the category.") @QueryParam("categoryID") String categoryID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProducts(categoryID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/promotions")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listPromotions(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPromotions(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/products/{productID}/specs")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listSpecs(@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listSpecs(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/categories/{parentID}/categories")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listSubcategories(@ApiParam(value = "ID of the parent.",required=true) @PathParam("parentID") String parentID
,@ApiParam(value = "Depth of the category.") @QueryParam("depth") String depth
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listSubcategories(parentID,depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/usergroups")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response listUserGroups(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserGroups(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(user,securityContext);
    }
    @PATCH
    @Path("/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response patchAddress(@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@ApiParam(value = "" ,required=true) BuyerAddress address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchAddress(addressID,address,securityContext);
    }
    @PATCH
    @Path("/creditcards/{creditcardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Only available to Buyer Users.", response = void.class) })
    public Response patchCreditCard(@ApiParam(value = "ID of the creditcard.",required=true) @PathParam("creditcardID") String creditcardID
,@ApiParam(value = "" ,required=true) BuyerCreditCard creditCard
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchCreditCard(creditcardID,creditCard,securityContext);
    }
    @PUT
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(user,securityContext);
    }
    @PUT
    @Path("/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response updateAddress(@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@ApiParam(value = "" ,required=true) BuyerAddress address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAddress(addressID,address,securityContext);
    }
    @PUT
    @Path("/creditcards/{creditcardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Me", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    public Response updateCreditCard(@ApiParam(value = "ID of the creditcard.",required=true) @PathParam("creditcardID") String creditcardID
,@ApiParam(value = "" ,required=true) BuyerCreditCard creditCard
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCreditCard(creditcardID,creditCard,securityContext);
    }
}
