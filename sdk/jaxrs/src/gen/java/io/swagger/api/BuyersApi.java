package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BuyersApiService;
import io.swagger.api.factories.BuyersApiServiceFactory;

import io.swagger.annotations.ApiParam;

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

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/buyers")


@io.swagger.annotations.Api(description = "the buyers API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class BuyersApi  {
   private final BuyersApiService delegate = BuyersApiServiceFactory.getBuyersApi();

    @POST
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Add a Promotion to an Order.", response = Object.class) })
    public Response addPromotion(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Promo code of the order.",required=true) @PathParam("promoCode") String promoCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPromotion(buyerID,orderID,promoCode,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/approve")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response approve(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Comments to be saved with the order approval.") @QueryParam("comments") String comments
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.approve(buyerID,orderID,comments,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/cancel")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response cancel(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancel(buyerID,orderID,securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) Buyer company
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(company,securityContext);
    }
    @POST
    @Path("/{buyerID}/addresses")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_1(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_1(buyerID,address,securityContext);
    }
    @POST
    @Path("/{buyerID}/approvalrules")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_2(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) ApprovalRule approvalRule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_2(buyerID,approvalRule,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_3(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) Category category
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_3(buyerID,category,securityContext);
    }
    @POST
    @Path("/{buyerID}/costcenters")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_4(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CostCenter costCenter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_4(buyerID,costCenter,securityContext);
    }
    @POST
    @Path("/{buyerID}/creditcards")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_5(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CreditCard card
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_5(buyerID,card,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_6(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) Order order
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_6(buyerID,order,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_7(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) LineItem lineItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_7(buyerID,orderID,lineItem,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_8(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Payment payment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_8(buyerID,orderID,payment,securityContext);
    }
    @POST
    @Path("/{buyerID}/shipments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_9(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) Shipment shipment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_9(buyerID,shipment,securityContext);
    }
    @POST
    @Path("/{buyerID}/spendingaccounts")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_10(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) SpendingAccount spendingAccount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_10(buyerID,spendingAccount,securityContext);
    }
    @POST
    @Path("/{buyerID}/usergroups")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_11(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) UserGroup group
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_11(buyerID,group,securityContext);
    }
    @POST
    @Path("/{buyerID}/users")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create_12(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_12(buyerID,user,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response createTransaction(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "" ,required=true) PaymentTransaction transaction
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTransaction(buyerID,orderID,paymentID,transaction,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/decline")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response decline(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Comments to be saved with the order denial.") @QueryParam("comments") String comments
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.decline(buyerID,orderID,comments,securityContext);
    }
    @DELETE
    @Path("/{buyerID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(buyerID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_13(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_13(buyerID,addressID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_14(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the approval rule.",required=true) @PathParam("approvalRuleID") String approvalRuleID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_14(buyerID,approvalRuleID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_15(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_15(buyerID,categoryID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_16(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.",required=true) @PathParam("costCenterID") String costCenterID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_16(buyerID,costCenterID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_17(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.",required=true) @PathParam("creditCardID") String creditCardID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_17(buyerID,creditCardID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_18(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_18(buyerID,orderID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_19(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_19(buyerID,orderID,lineItemID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_20(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_20(buyerID,orderID,paymentID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_21(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_21(buyerID,shipmentID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_22(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.",required=true) @PathParam("spendingAccountID") String spendingAccountID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_22(buyerID,spendingAccountID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_23(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.",required=true) @PathParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_23(buyerID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/users/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete_24(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_24(buyerID,userID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/addresses/{addressID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(buyerID,addressID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_25(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_25(buyerID,categoryID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_26(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.",required=true) @PathParam("costCenterID") String costCenterID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_26(buyerID,costCenterID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_27(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.",required=true) @PathParam("creditCardID") String creditCardID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_27(buyerID,creditCardID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment_28(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.",required=true) @PathParam("spendingAccountID") String spendingAccountID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_28(buyerID,spendingAccountID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response deleteItem(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteItem(buyerID,shipmentID,orderID,lineItemID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/productassignments/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteProductAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProductAssignment(buyerID,categoryID,productID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteTransaction(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "ID of the transaction.",required=true) @PathParam("transactionID") String transactionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTransaction(buyerID,orderID,paymentID,transactionID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}/assignments/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteUserAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.",required=true) @PathParam("userGroupID") String userGroupID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUserAssignment(buyerID,userGroupID,userID,securityContext);
    }
    @GET
    @Path("/{buyerID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(buyerID,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_29(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_29(buyerID,addressID,securityContext);
    }
    @GET
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_30(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the approval rule.",required=true) @PathParam("approvalRuleID") String approvalRuleID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_30(buyerID,approvalRuleID,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_31(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_31(buyerID,categoryID,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_32(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.",required=true) @PathParam("costCenterID") String costCenterID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_32(buyerID,costCenterID,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_33(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.",required=true) @PathParam("creditCardID") String creditCardID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_33(buyerID,creditCardID,securityContext);
    }
    @GET
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_34(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true) @PathParam("emailTemplateType") String emailTemplateType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_34(buyerID,emailTemplateType,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_35(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_35(buyerID,orderID,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_36(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_36(buyerID,orderID,lineItemID,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_37(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_37(buyerID,orderID,paymentID,securityContext);
    }
    @GET
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_38(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_38(buyerID,shipmentID,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_39(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.",required=true) @PathParam("spendingAccountID") String spendingAccountID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_39(buyerID,spendingAccountID,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_40(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.",required=true) @PathParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_40(buyerID,userGroupID,securityContext);
    }
    @GET
    @Path("/{buyerID}/users/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get_41(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_41(buyerID,userID,securityContext);
    }
    @POST
    @Path("/{buyerID}/users/{userID}/accesstoken")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getAccessToken(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@ApiParam(value = "" ,required=true) ImpersonateTokenRequest tokenRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccessToken(buyerID,userID,tokenRequest,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_42(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_42(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/approvalrules")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_43(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_43(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_44(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the parent.") @QueryParam("parentID") String parentID
,@ApiParam(value = "Depth of the category.") @QueryParam("depth") String depth
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_44(buyerID,parentID,depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_45(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_45(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_46(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_46(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_47(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_47(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_48(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_48(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/shipments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_49(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.") @QueryParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_49(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_50(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_50(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_51(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_51(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/users")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list_52(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_52(buyerID,userGroupID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/approvals")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all Approvals associated with the Order.", response = Object.class) })
    public Response listApprovals(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listApprovals(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.") @QueryParam("addressID") String addressID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the address.") @QueryParam("level") String level
,@ApiParam(value = "Is shipping of the address.") @QueryParam("isShipping") Boolean isShipping
,@ApiParam(value = "Is billing of the address.") @QueryParam("isBilling") Boolean isBilling
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(buyerID,addressID,userID,userGroupID,level,isShipping,isBilling,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_53(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.") @QueryParam("categoryID") String categoryID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the category.") @QueryParam("level") String level
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_53(buyerID,categoryID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_54(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.") @QueryParam("costCenterID") String costCenterID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the cost center.") @QueryParam("level") String level
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_54(buyerID,costCenterID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_55(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.") @QueryParam("creditCardID") String creditCardID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the credit card.") @QueryParam("level") String level
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_55(buyerID,creditCardID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments_56(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.") @QueryParam("spendingAccountID") String spendingAccountID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the spending account.") @QueryParam("level") String level
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_56(buyerID,spendingAccountID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/{parentID}/categories")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listChildren(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the parent.",required=true) @PathParam("parentID") String parentID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Depth of the category.") @QueryParam("depth") String depth
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listChildren(buyerID,parentID,search,depth,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/eligibleapprovers")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all Users who can approve or decline this order (but have not done so).", response = Object.class) })
    public Response listEligibleApprovers(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listEligibleApprovers(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/productassignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listProductAssignments(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.") @QueryParam("categoryID") String categoryID
,@ApiParam(value = "ID of the product.") @QueryParam("productID") String productID
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProductAssignments(buyerID,categoryID,productID,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/promotions")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listPromotions(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPromotions(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listUserAssignments(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserAssignments(buyerID,userGroupID,userID,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(buyerID,addressID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_57(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the approval rule.",required=true) @PathParam("approvalRuleID") String approvalRuleID
,@ApiParam(value = "" ,required=true) ApprovalRule partialApprovalRule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_57(buyerID,approvalRuleID,partialApprovalRule,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_58(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@ApiParam(value = "" ,required=true) Category category
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_58(buyerID,categoryID,category,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_59(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.",required=true) @PathParam("costCenterID") String costCenterID
,@ApiParam(value = "" ,required=true) CostCenter costCenter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_59(buyerID,costCenterID,costCenter,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_60(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.",required=true) @PathParam("creditCardID") String creditCardID
,@ApiParam(value = "" ,required=true) CreditCard card
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_60(buyerID,creditCardID,card,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_61(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true) @PathParam("emailTemplateType") String emailTemplateType
,@ApiParam(value = "" ,required=true) EmailTemplate emailTemplate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_61(buyerID,emailTemplateType,emailTemplate,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_62(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Order partialOrder
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_62(buyerID,orderID,partialOrder,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_63(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@ApiParam(value = "" ,required=true) LineItem partialLineItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_63(buyerID,orderID,lineItemID,partialLineItem,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_64(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "" ,required=true) Payment partialPayment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_64(buyerID,orderID,paymentID,partialPayment,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_65(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@ApiParam(value = "" ,required=true) Shipment shipment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_65(buyerID,shipmentID,shipment,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch_66(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.",required=true) @PathParam("spendingAccountID") String spendingAccountID
,@ApiParam(value = "" ,required=true) SpendingAccount spendingAccount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_66(buyerID,spendingAccountID,spendingAccount,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_67(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.",required=true) @PathParam("userGroupID") String userGroupID
,@ApiParam(value = "" ,required=true) UserGroup group
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_67(buyerID,userGroupID,group,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/users/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response patch_68(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_68(buyerID,userID,user,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Partially update the Billing Address of the Order. Not allowed on unsubmitted Orders where BillingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchBillingAddress(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchBillingAddress(buyerID,orderID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Partially update the Shipping Address of the Line Item. Not allowed on unsubmitted Line Items where ShippingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchShippingAddress(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchShippingAddress(buyerID,orderID,lineItemID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Partially update the Shipping Address of all Line Items on the Order. Not allowed on unsubmitted orders where ShippingAddressID has been set on any Line Items. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    public Response patchShippingAddress_69(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchShippingAddress_69(buyerID,orderID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchTransaction(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "ID of the transaction.",required=true) @PathParam("transactionID") String transactionID
,@ApiParam(value = "" ,required=true) PaymentTransaction partialTransaction
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchTransaction(buyerID,orderID,paymentID,transactionID,partialTransaction,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Remove Promotion from Order.", response = Object.class) })
    public Response removePromotion(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "Promo code of the order.",required=true) @PathParam("promoCode") String promoCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removePromotion(buyerID,orderID,promoCode,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response resetToDefault(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true) @PathParam("emailTemplateType") String emailTemplateType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resetToDefault(buyerID,emailTemplateType,securityContext);
    }
    @POST
    @Path("/{buyerID}/addresses/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) AddressAssignment assignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_70(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CategoryAssignment categoryAssignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_70(buyerID,categoryAssignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/costcenters/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_71(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CostCenterAssignment assignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_71(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/creditcards/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_72(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CreditCardAssignment assignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_72(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment_73(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) SpendingAccountAssignment assignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_73(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/shipments/{shipmentID}/items")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response saveItem(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@ApiParam(value = "" ,required=true) ShipmentItem item
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveItem(buyerID,shipmentID,item,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories/productassignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveProductAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) CategoryProductAssignment productAssignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveProductAssignment(buyerID,productAssignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/usergroups/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveUserAssignment(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) UserGroupAssignment userGroupAssignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveUserAssignment(buyerID,userGroupAssignment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Set the Billing Address of the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's BillingAddressID property instead.", response = Object.class) })
    public Response setBillingAddress(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setBillingAddress(buyerID,orderID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Set the Shipping Address of the Line Item. Appropriate only when the Address is not to be saved/reused. To use a Saved Address (i.e. from the Addresses resource), PATCH the Line Item's ShippingAddressID property instead.", response = Object.class) })
    public Response setShippingAddress(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setShippingAddress(buyerID,orderID,lineItemID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Set the Shipping Address of all Line Items on the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's ShippingAddressID property instead.", response = Object.class) })
    public Response setShippingAddress_74(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setShippingAddress_74(buyerID,orderID,address,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/ship")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Create a new Shipment containing all Line Items from this Order.", response = Object.class) })
    public Response ship(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Shipment shipment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ship(buyerID,orderID,shipment,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/submit")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response submit(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submit(buyerID,orderID,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response transferTempUserOrder(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Temp user token of the order.",required=true) @QueryParam("tempUserToken") String tempUserToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferTempUserOrder(buyerID,tempUserToken,securityContext);
    }
    @PUT
    @Path("/{buyerID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Buyer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "" ,required=true) Buyer company
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(buyerID,company,securityContext);
    }
    @PUT
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Address", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_75(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the address.",required=true) @PathParam("addressID") String addressID
,@ApiParam(value = "" ,required=true) Address address
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_75(buyerID,addressID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "ApprovalRule", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_76(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the approval rule.",required=true) @PathParam("approvalRuleID") String approvalRuleID
,@ApiParam(value = "" ,required=true) ApprovalRule approvalRule
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_76(buyerID,approvalRuleID,approvalRule,securityContext);
    }
    @PUT
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_77(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the category.",required=true) @PathParam("categoryID") String categoryID
,@ApiParam(value = "" ,required=true) Category category
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_77(buyerID,categoryID,category,securityContext);
    }
    @PUT
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CostCenter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_78(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the cost center.",required=true) @PathParam("costCenterID") String costCenterID
,@ApiParam(value = "" ,required=true) CostCenter costCenter
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_78(buyerID,costCenterID,costCenter,securityContext);
    }
    @PUT
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "CreditCard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_79(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the credit card.",required=true) @PathParam("creditCardID") String creditCardID
,@ApiParam(value = "" ,required=true) CreditCard card
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_79(buyerID,creditCardID,card,securityContext);
    }
    @PUT
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "EmailTemplate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response update_80(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true) @PathParam("emailTemplateType") String emailTemplateType
,@ApiParam(value = "" ,required=true) EmailTemplate emailTemplate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_80(buyerID,emailTemplateType,emailTemplate,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_81(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "" ,required=true) Order order
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_81(buyerID,orderID,order,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "LineItem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_82(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the line item.",required=true) @PathParam("lineItemID") String lineItemID
,@ApiParam(value = "" ,required=true) LineItem lineItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_82(buyerID,orderID,lineItemID,lineItem,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_83(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "" ,required=true) Payment payment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_83(buyerID,orderID,paymentID,payment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_84(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the shipment.",required=true) @PathParam("shipmentID") String shipmentID
,@ApiParam(value = "" ,required=true) Shipment shipment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_84(buyerID,shipmentID,shipment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "SpendingAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_85(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the spending account.",required=true) @PathParam("spendingAccountID") String spendingAccountID
,@ApiParam(value = "" ,required=true) SpendingAccount spendingAccount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_85(buyerID,spendingAccountID,spendingAccount,securityContext);
    }
    @PUT
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "UserGroup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_86(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user group.",required=true) @PathParam("userGroupID") String userGroupID
,@ApiParam(value = "" ,required=true) UserGroup group
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_86(buyerID,userGroupID,group,securityContext);
    }
    @PUT
    @Path("/{buyerID}/users/{userID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update_87(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userID") String userID
,@ApiParam(value = "" ,required=true) User user
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_87(buyerID,userID,user,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Payment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateTransaction(@ApiParam(value = "ID of the buyer.",required=true) @PathParam("buyerID") String buyerID
,@ApiParam(value = "ID of the order.",required=true) @PathParam("orderID") String orderID
,@ApiParam(value = "ID of the payment.",required=true) @PathParam("paymentID") String paymentID
,@ApiParam(value = "ID of the transaction.",required=true) @PathParam("transactionID") String transactionID
,@ApiParam(value = "" ,required=true) PaymentTransaction transaction
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTransaction(buyerID,orderID,paymentID,transactionID,transaction,securityContext);
    }
}
