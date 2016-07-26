package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeApiService;
import io.swagger.api.factories.MeApiServiceFactory;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/me")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class MeApi  {
   private final MeApiService delegate = MeApiServiceFactory.getMeApi();

    @POST
    @Path("/addresses")
    
    
    public Response createAddress( BuyerAddress address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAddress(address,securityContext);
    }
    @POST
    @Path("/creditcards")
    
    
    public Response createCreditCard( BuyerCreditCard creditCard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCreditCard(creditCard,securityContext);
    }
    @DELETE
    @Path("/addresses/{addressID}")
    
    
    public Response deleteAddress( @PathParam("addressID") String addressID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAddress(addressID,securityContext);
    }
    @DELETE
    @Path("/creditcards/{creditcardID}")
    
    
    public Response deleteCreditCard( @PathParam("creditcardID") String creditcardID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCreditCard(creditcardID,securityContext);
    }
    @GET
    
    
    
    public Response get(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(securityContext);
    }
    @GET
    @Path("/addresses/{addressID}")
    
    
    public Response getAddress( @PathParam("addressID") String addressID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAddress(addressID,securityContext);
    }
    @GET
    @Path("/creditcards/{creditcardID}")
    
    
    public Response getCreditCard( @PathParam("creditcardID") String creditcardID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCreditCard(creditcardID,securityContext);
    }
    @GET
    @Path("/orders/{orderID}")
    
    
    public Response getOrder( @PathParam("orderID") String orderID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrder(orderID,securityContext);
    }
    @GET
    @Path("/products/{productID}")
    
    
    public Response getProduct( @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProduct(productID,securityContext);
    }
    @GET
    @Path("/promotions/{promotionID}")
    
    
    public Response getPromotion( @PathParam("promotionID") String promotionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPromotion(promotionID,securityContext);
    }
    @GET
    @Path("/products/{productID}/specs/{specID}")
    
    
    public Response getSpec( @PathParam("productID") String productID, @PathParam("specID") String specID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSpec(productID,specID,securityContext);
    }
    @GET
    @Path("/addresses")
    
    
    public Response listAddresses( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAddresses(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/categories")
    
    
    public Response listCategories( @QueryParam("depth") String depth, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCategories(depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/costcenters")
    
    
    public Response listCostCenters( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCostCenters(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/creditcards")
    
    
    public Response listCreditCards( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCreditCards(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/orders/incoming")
    
    
    public Response listIncomingOrders( @QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listIncomingOrders(from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/orders/outgoing")
    
    
    public Response listOutgoingOrders( @QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOutgoingOrders(from,to,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/products")
    
    
    public Response listProducts( @QueryParam("categoryID") String categoryID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProducts(categoryID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/promotions")
    
    
    public Response listPromotions( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPromotions(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/products/{productID}/specs")
    
    
    public Response listSpecs( @PathParam("productID") String productID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listSpecs(productID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/categories/{parentID}/categories")
    
    
    public Response listSubcategories( @PathParam("parentID") String parentID, @QueryParam("depth") String depth, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listSubcategories(parentID,depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/usergroups")
    
    
    public Response listUserGroups( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserGroups(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @PATCH
    
    
    
    public Response patch( User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(user,securityContext);
    }
    @PATCH
    @Path("/addresses/{addressID}")
    
    
    public Response patchAddress( @PathParam("addressID") String addressID, BuyerAddress address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchAddress(addressID,address,securityContext);
    }
    @PATCH
    @Path("/creditcards/{creditcardID}")
    
    
    public Response patchCreditCard( @PathParam("creditcardID") String creditcardID, BuyerCreditCard creditCard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchCreditCard(creditcardID,creditCard,securityContext);
    }
    @PUT
    
    
    
    public Response update( User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(user,securityContext);
    }
    @PUT
    @Path("/addresses/{addressID}")
    
    
    public Response updateAddress( @PathParam("addressID") String addressID, BuyerAddress address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAddress(addressID,address,securityContext);
    }
    @PUT
    @Path("/creditcards/{creditcardID}")
    
    
    public Response updateCreditCard( @PathParam("creditcardID") String creditcardID, BuyerCreditCard creditCard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCreditCard(creditcardID,creditCard,securityContext);
    }
}
