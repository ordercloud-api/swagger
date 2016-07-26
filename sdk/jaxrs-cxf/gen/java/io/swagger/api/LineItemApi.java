package io.swagger.api;

import io.swagger.model.LineItem;
import io.swagger.model.Address;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface LineItemApi  {
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems")
    
    
    public Response create(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,LineItem lineItem);
    @DELETE
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,LineItem partialLineItem);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    public Response patchShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,Address address);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    public Response setShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,Address address);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,LineItem lineItem);
}

