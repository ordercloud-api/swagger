package io.swagger.api;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface MeApi  {
    @POST
    @Path("/me/addresses")
    
    
    public Response createAddress(BuyerAddress address);
    @POST
    @Path("/me/creditcards")
    
    
    public Response createCreditCard(BuyerCreditCard creditCard);
    @DELETE
    @Path("/me/addresses/{addressID}")
    
    
    public Response deleteAddress(@PathParam("addressID") String addressID);
    @DELETE
    @Path("/me/creditcards/{creditcardID}")
    
    
    public Response deleteCreditCard(@PathParam("creditcardID") String creditcardID);
    @GET
    @Path("/me")
    
    
    public Response get();
    @GET
    @Path("/me/addresses/{addressID}")
    
    
    public Response getAddress(@PathParam("addressID") String addressID);
    @GET
    @Path("/me/creditcards/{creditcardID}")
    
    
    public Response getCreditCard(@PathParam("creditcardID") String creditcardID);
    @GET
    @Path("/me/orders/{orderID}")
    
    
    public Response getOrder(@PathParam("orderID") String orderID);
    @GET
    @Path("/me/products/{productID}")
    
    
    public Response getProduct(@PathParam("productID") String productID);
    @GET
    @Path("/me/promotions/{promotionID}")
    
    
    public Response getPromotion(@PathParam("promotionID") String promotionID);
    @GET
    @Path("/me/products/{productID}/specs/{specID}")
    
    
    public Response getSpec(@PathParam("productID") String productID,@PathParam("specID") String specID);
    @GET
    @Path("/me/addresses")
    
    
    public Response listAddresses(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/categories")
    
    
    public Response listCategories(@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/costcenters")
    
    
    public Response listCostCenters(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/creditcards")
    
    
    public Response listCreditCards(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/orders/incoming")
    
    
    public Response listIncomingOrders(@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/orders/outgoing")
    
    
    public Response listOutgoingOrders(@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/products")
    
    
    public Response listProducts(@QueryParam("categoryID") String categoryID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/promotions")
    
    
    public Response listPromotions(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/products/{productID}/specs")
    
    
    public Response listSpecs(@PathParam("productID") String productID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/categories/{parentID}/categories")
    
    
    public Response listSubcategories(@PathParam("parentID") String parentID,@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/me/usergroups")
    
    
    public Response listUserGroups(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/me")
    
    
    public Response patch(User user);
    @PATCH
    @Path("/me/addresses/{addressID}")
    
    
    public Response patchAddress(@PathParam("addressID") String addressID,BuyerAddress address);
    @PATCH
    @Path("/me/creditcards/{creditcardID}")
    
    
    public Response patchCreditCard(@PathParam("creditcardID") String creditcardID,BuyerCreditCard creditCard);
    @PUT
    @Path("/me")
    
    
    public Response update(User user);
    @PUT
    @Path("/me/addresses/{addressID}")
    
    
    public Response updateAddress(@PathParam("addressID") String addressID,BuyerAddress address);
    @PUT
    @Path("/me/creditcards/{creditcardID}")
    
    
    public Response updateCreditCard(@PathParam("creditcardID") String creditcardID,BuyerCreditCard creditCard);
}

