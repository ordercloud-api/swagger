package io.swagger.api;

import io.swagger.model.Buyer;
import io.swagger.model.Address;
import io.swagger.model.ApprovalRule;
import io.swagger.model.Category;
import io.swagger.model.CostCenter;
import io.swagger.model.CreditCard;
import io.swagger.model.Order;
import io.swagger.model.LineItem;
import io.swagger.model.Payment;
import io.swagger.model.Shipment;
import io.swagger.model.SpendingAccount;
import io.swagger.model.UserGroup;
import io.swagger.model.User;
import io.swagger.model.PaymentTransaction;
import io.swagger.model.ImpersonateTokenRequest;
import io.swagger.model.EmailTemplate;
import io.swagger.model.AddressAssignment;
import io.swagger.model.CategoryAssignment;
import io.swagger.model.CostCenterAssignment;
import io.swagger.model.CreditCardAssignment;
import io.swagger.model.SpendingAccountAssignment;
import io.swagger.model.ShipmentItem;
import io.swagger.model.CategoryProductAssignment;
import io.swagger.model.UserGroupAssignment;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/buyers")

@Api(description = "the buyers API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class BuyersApi  {

    @POST
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Add a Promotion to an Order.", response = Object.class) })
    public Response addPromotion(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("promoCode") String promoCode) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/approve")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response approve(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("comments") String comments) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/cancel")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response cancel(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(Buyer company) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/addresses")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_1(@PathParam("buyerID") String buyerID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/approvalrules")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_2(@PathParam("buyerID") String buyerID,ApprovalRule approvalRule) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/categories")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_3(@PathParam("buyerID") String buyerID,Category category) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/costcenters")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_4(@PathParam("buyerID") String buyerID,CostCenter costCenter) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/creditcards")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_5(@PathParam("buyerID") String buyerID,CreditCard card) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_6(@PathParam("buyerID") String buyerID,Order order) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_7(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,LineItem lineItem) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_8(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Payment payment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/shipments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_9(@PathParam("buyerID") String buyerID,Shipment shipment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/spendingaccounts")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_10(@PathParam("buyerID") String buyerID,SpendingAccount spendingAccount) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/usergroups")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_11(@PathParam("buyerID") String buyerID,UserGroup group) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/users")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_12(@PathParam("buyerID") String buyerID,User user) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response createTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,PaymentTransaction transaction) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/decline")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response decline(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("comments") String comments) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@PathParam("buyerID") String buyerID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_13(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_14(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_15(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_16(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_17(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_18(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_19(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_20(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_21(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_22(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_23(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/users/{userID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_24(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/addresses/{addressID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_25(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_26(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_27(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_28(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response deleteItem(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/productassignments/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteProductAssignment(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}/assignments/{userID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteUserAssignment(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,@PathParam("userID") String userID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("buyerID") String buyerID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_29(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_30(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_31(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_32(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_33(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_34(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_35(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_36(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_37(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_38(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_39(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_40(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/users/{userID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_41(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/users/{userID}/accesstoken")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getAccessToken(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,ImpersonateTokenRequest tokenRequest) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/addresses")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_42(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/approvalrules")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_43(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/categories")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_44(@PathParam("buyerID") String buyerID,@QueryParam("parentID") String parentID,@QueryParam("depth") String depth,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/costcenters")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_45(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/creditcards")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_46(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_47(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_48(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/shipments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_49(@PathParam("buyerID") String buyerID,@QueryParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/spendingaccounts")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_50(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/usergroups")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_51(@PathParam("buyerID") String buyerID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/users")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_52(@PathParam("buyerID") String buyerID,@QueryParam("userGroupID") String userGroupID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/approvals")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all Approvals associated with the Order.", response = Object.class) })
    public Response listApprovals(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/addresses/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@PathParam("buyerID") String buyerID,@QueryParam("addressID") String addressID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("isShipping") Boolean isShipping,@QueryParam("isBilling") Boolean isBilling,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/categories/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_53(@PathParam("buyerID") String buyerID,@QueryParam("categoryID") String categoryID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/costcenters/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_54(@PathParam("buyerID") String buyerID,@QueryParam("costCenterID") String costCenterID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/creditcards/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_55(@PathParam("buyerID") String buyerID,@QueryParam("creditCardID") String creditCardID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_56(@PathParam("buyerID") String buyerID,@QueryParam("spendingAccountID") String spendingAccountID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/categories/{parentID}/categories")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listChildren(@PathParam("buyerID") String buyerID,@PathParam("parentID") String parentID,@QueryParam("search") String search,@QueryParam("depth") String depth,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/eligibleapprovers")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all Users who can approve or decline this order (but have not done so).", response = Object.class) })
    public Response listEligibleApprovers(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/categories/productassignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listProductAssignments(@PathParam("buyerID") String buyerID,@QueryParam("categoryID") String categoryID,@QueryParam("productID") String productID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/orders/{orderID}/promotions")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listPromotions(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{buyerID}/usergroups/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listUserAssignments(@PathParam("buyerID") String buyerID,@QueryParam("userGroupID") String userGroupID,@QueryParam("userID") String userID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_57(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID,ApprovalRule partialApprovalRule) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_58(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,Category category) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_59(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,CostCenter costCenter) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_60(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,CreditCard card) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_61(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType,EmailTemplate emailTemplate) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_62(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Order partialOrder) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_63(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,LineItem partialLineItem) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_64(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,Payment partialPayment) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_65(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,Shipment shipment) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_66(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,SpendingAccount spendingAccount) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_67(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,UserGroup group) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/users/{userID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_68(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,User user) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Billing Address of the Order. Not allowed on unsubmitted Orders where BillingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchBillingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Shipping Address of the Line Item. Not allowed on unsubmitted Line Items where ShippingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Shipping Address of all Line Items on the Order. Not allowed on unsubmitted orders where ShippingAddressID has been set on any Line Items. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchShippingAddress_69(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID,PaymentTransaction partialTransaction) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Remove Promotion from Order.", response = Object.class) })
    public Response removePromotion(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("promoCode") String promoCode) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response resetToDefault(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/addresses/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(@PathParam("buyerID") String buyerID,AddressAssignment assignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/categories/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_70(@PathParam("buyerID") String buyerID,CategoryAssignment categoryAssignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/costcenters/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_71(@PathParam("buyerID") String buyerID,CostCenterAssignment assignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/creditcards/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_72(@PathParam("buyerID") String buyerID,CreditCardAssignment assignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_73(@PathParam("buyerID") String buyerID,SpendingAccountAssignment assignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/shipments/{shipmentID}/items")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response saveItem(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,ShipmentItem item) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/categories/productassignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveProductAssignment(@PathParam("buyerID") String buyerID,CategoryProductAssignment productAssignment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/usergroups/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveUserAssignment(@PathParam("buyerID") String buyerID,UserGroupAssignment userGroupAssignment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Billing Address of the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's BillingAddressID property instead.", response = Object.class) })
    public Response setBillingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Shipping Address of the Line Item. Appropriate only when the Address is not to be saved/reused. To use a Saved Address (i.e. from the Addresses resource), PATCH the Line Item's ShippingAddressID property instead.", response = Object.class) })
    public Response setShippingAddress(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Shipping Address of all Line Items on the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's ShippingAddressID property instead.", response = Object.class) })
    public Response setShippingAddress_74(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/ship")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Create a new Shipment containing all Line Items from this Order.", response = Object.class) })
    public Response ship(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Shipment shipment) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{buyerID}/orders/{orderID}/submit")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response submit(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response transferTempUserOrder(@PathParam("buyerID") String buyerID,@QueryParam("tempUserToken") String tempUserToken) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@PathParam("buyerID") String buyerID,Buyer company) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_75(@PathParam("buyerID") String buyerID,@PathParam("addressID") String addressID,Address address) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_76(@PathParam("buyerID") String buyerID,@PathParam("approvalRuleID") String approvalRuleID,ApprovalRule approvalRule) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_77(@PathParam("buyerID") String buyerID,@PathParam("categoryID") String categoryID,Category category) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_78(@PathParam("buyerID") String buyerID,@PathParam("costCenterID") String costCenterID,CostCenter costCenter) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_79(@PathParam("buyerID") String buyerID,@PathParam("creditCardID") String creditCardID,CreditCard card) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response update_80(@PathParam("buyerID") String buyerID,@PathParam("emailTemplateType") String emailTemplateType,EmailTemplate emailTemplate) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_81(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,Order order) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_82(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("lineItemID") String lineItemID,LineItem lineItem) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_83(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,Payment payment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_84(@PathParam("buyerID") String buyerID,@PathParam("shipmentID") String shipmentID,Shipment shipment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_85(@PathParam("buyerID") String buyerID,@PathParam("spendingAccountID") String spendingAccountID,SpendingAccount spendingAccount) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_86(@PathParam("buyerID") String buyerID,@PathParam("userGroupID") String userGroupID,UserGroup group) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/users/{userID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_87(@PathParam("buyerID") String buyerID,@PathParam("userID") String userID,User user) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateTransaction(@PathParam("buyerID") String buyerID,@PathParam("orderID") String orderID,@PathParam("paymentID") String paymentID,@PathParam("transactionID") String transactionID,PaymentTransaction transaction) {
    	return Response.ok().entity("magic!").build();
    }
}

