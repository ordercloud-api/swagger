package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.model.Address;
import io.swagger.model.Shipment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface OrderApi  {
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    public Response addPromotion(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("promoCode") String promoCode);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/approve")
    
    
    public Response approve(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("comments") String comments);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/cancel")
    
    
    public Response cancel(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID);
    @POST
    @Path("/buyers/{buyerID}/orders")
    
    
    public Response create(@PathParam("buyerID") String buyerID,Order order);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/decline")
    
    
    public Response decline(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("comments") String comments);
    @DELETE
    @Path("/buyers/{buyerID}/orders/{orderID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/approvals")
    
    
    public Response listApprovals(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/eligibleapprovers")
    
    
    public Response listEligibleApprovers(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/orders/incoming")
    
    
    public Response listIncoming(@QueryParam("buyerID") String buyerID,@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/orders/outgoing")
    
    
    public Response listOutgoing(@QueryParam("buyerID") String buyerID,@QueryParam("from") String from,@QueryParam("to") String to,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/promotions")
    
    
    public Response listPromotions(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Order partialOrder);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/billto")
    
    
    public Response patchBillingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/shipto")
    
    
    public Response patchShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address);
    @DELETE
    @Path("/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    public Response removePromotion(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("promoCode") String promoCode);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/billto")
    
    
    public Response setBillingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/shipto")
    
    
    public Response setShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/ship")
    
    
    public Response ship(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Shipment shipment);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/submit")
    
    
    public Response submit(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID);
    @PUT
    @Path("/buyers/{buyerID}/orders")
    
    
    public Response transferTempUserOrder(@PathParam("buyerID") String buyerID,@QueryParam("tempUserToken") String tempUserToken);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Order order);
}

