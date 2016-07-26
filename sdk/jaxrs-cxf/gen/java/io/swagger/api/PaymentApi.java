package io.swagger.api;

import io.swagger.model.Payment;
import io.swagger.model.PaymentTransaction;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface PaymentApi  {
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/payments")
    
    
    public Response create(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Payment payment);
    @POST
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions")
    
    
    public Response createTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,PaymentTransaction transaction);
    @DELETE
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response delete(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID);
    @DELETE
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response deleteTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response get(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID);
    @GET
    @Path("/buyers/{buyerID}/orders/{orderID}/payments")
    
    
    public Response list(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,Payment partialPayment);
    @PATCH
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response patchTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID,PaymentTransaction partialTransaction);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response update(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,Payment payment);
    @PUT
    @Path("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response updateTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID,PaymentTransaction transaction);
}

