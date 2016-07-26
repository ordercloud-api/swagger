package io.swagger.api;

import io.swagger.model.Shipment;
import io.swagger.model.ShipmentItem;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface ShipmentApi  {
    @POST
    @Path("/buyers/{buyerID}/shipments")
    
    
    public Response create(@PathParam("buyerID") String buyerID,Shipment shipment);
    @DELETE
    @Path("/buyers/{buyerID}/shipments/{shipmentID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID);
    @DELETE
    @Path("/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}")
    
    
    public Response deleteItem(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID);
    @GET
    @Path("/buyers/{buyerID}/shipments/{shipmentID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID);
    @GET
    @Path("/buyers/{buyerID}/shipments")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@QueryParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/shipments/{shipmentID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,Shipment shipment);
    @POST
    @Path("/buyers/{buyerID}/shipments/{shipmentID}/items")
    
    
    public Response saveItem(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,ShipmentItem item);
    @PUT
    @Path("/buyers/{buyerID}/shipments/{shipmentID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,Shipment shipment);
}

