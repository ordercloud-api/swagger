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

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Api(value = "buyers", description = "the buyers API")
public interface BuyersApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Add a Promotion to an Order.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}",
        method = RequestMethod.POST)
    ResponseEntity<Object> addPromotion(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Promo code of the order.",required=true ) @PathVariable("promoCode") String promoCode);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/approve",
        method = RequestMethod.POST)
    ResponseEntity<Object> approve(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Comments to be saved with the order approval.") @RequestParam(value = "comments", required = false) String comments);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/cancel",
        method = RequestMethod.POST)
    ResponseEntity<Object> cancel(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Buyer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Buyer company);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule approvalRule);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody Category category);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CreditCard card);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody Order order);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody LineItem lineItem);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Payment payment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody UserGroup group);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody User user);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions",
        method = RequestMethod.POST)
    ResponseEntity<Object> createTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction transaction);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/decline",
        method = RequestMethod.POST)
    ResponseEntity<Object> decline(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Comments to be saved with the order denial.") @RequestParam(value = "comments", required = false) String comments);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Buyer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/{addressID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules/{approvalRuleID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/{costCenterID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/{creditCardID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/{userGroupID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users/{userID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/{addressID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/{costCenterID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/{creditCardID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Object> deleteItem(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProductAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Buyer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/{addressID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules/{approvalRuleID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/{costCenterID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/{creditCardID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "EmailTemplate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/{userGroupID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users/{userID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users/{userID}/accesstoken",
        method = RequestMethod.POST)
    ResponseEntity<Object> getAccessToken(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,@ApiParam(value = "" ,required=true ) @RequestBody ImpersonateTokenRequest tokenRequest);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Buyer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the parent.") @RequestParam(value = "parentID", required = false) String parentID,@ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.") @RequestParam(value = "orderID", required = false) String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all Approvals associated with the Order.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/approvals",
        method = RequestMethod.GET)
    ResponseEntity<Object> listApprovals(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.") @RequestParam(value = "addressID", required = false) String addressID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the address.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Is shipping of the address.") @RequestParam(value = "isShipping", required = false) Boolean isShipping,@ApiParam(value = "Is billing of the address.") @RequestParam(value = "isBilling", required = false) Boolean isBilling,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the category.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.") @RequestParam(value = "costCenterID", required = false) String costCenterID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the cost center.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.") @RequestParam(value = "creditCardID", required = false) String creditCardID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the credit card.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.") @RequestParam(value = "spendingAccountID", required = false) String spendingAccountID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the spending account.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{parentID}/categories",
        method = RequestMethod.GET)
    ResponseEntity<Object> listChildren(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the parent.",required=true ) @PathVariable("parentID") String parentID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all Users who can approve or decline this order (but have not done so).", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/eligibleapprovers",
        method = RequestMethod.GET)
    ResponseEntity<Object> listEligibleApprovers(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/productassignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listProductAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,@ApiParam(value = "ID of the product.") @RequestParam(value = "productID", required = false) String productID,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/promotions",
        method = RequestMethod.GET)
    ResponseEntity<Object> listPromotions(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listUserAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/{addressID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules/{approvalRuleID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID,@ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule partialApprovalRule);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,@ApiParam(value = "" ,required=true ) @RequestBody Category category);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/{costCenterID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,@ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/{creditCardID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,@ApiParam(value = "" ,required=true ) @RequestBody CreditCard card);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "EmailTemplate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType,@ApiParam(value = "" ,required=true ) @RequestBody EmailTemplate emailTemplate);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Order partialOrder);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,@ApiParam(value = "" ,required=true ) @RequestBody LineItem partialLineItem);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "" ,required=true ) @RequestBody Payment partialPayment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,@ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,@ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/{userGroupID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,@ApiParam(value = "" ,required=true ) @RequestBody UserGroup group);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users/{userID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,@ApiParam(value = "" ,required=true ) @RequestBody User user);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Billing Address of the Order. Not allowed on unsubmitted Orders where BillingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/billto",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchBillingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Shipping Address of the Line Item. Not allowed on unsubmitted Line Items where ShippingAddressID has been set. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Partially update the Shipping Address of all Line Items on the Order. Not allowed on unsubmitted orders where ShippingAddressID has been set on any Line Items. In that case, use the Addresses resource to update the Saved Address.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/shipto",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID,@ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction partialTransaction);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Remove Promotion from Order.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}",
        method = RequestMethod.DELETE)
    ResponseEntity<Object> removePromotion(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "Promo code of the order.",required=true ) @PathVariable("promoCode") String promoCode);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "EmailTemplate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> resetToDefault(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody AddressAssignment assignment);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CategoryAssignment categoryAssignment);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CostCenterAssignment assignment);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CreditCardAssignment assignment);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody SpendingAccountAssignment assignment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}/items",
        method = RequestMethod.POST)
    ResponseEntity<Object> saveItem(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,@ApiParam(value = "" ,required=true ) @RequestBody ShipmentItem item);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/productassignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveProductAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody CategoryProductAssignment productAssignment);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveUserAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody UserGroupAssignment userGroupAssignment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Billing Address of the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's BillingAddressID property instead.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/billto",
        method = RequestMethod.PUT)
    ResponseEntity<Object> setBillingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Shipping Address of the Line Item. Appropriate only when the Address is not to be saved/reused. To use a Saved Address (i.e. from the Addresses resource), PATCH the Line Item's ShippingAddressID property instead.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto",
        method = RequestMethod.PUT)
    ResponseEntity<Object> setShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Set the Shipping Address of all Line Items on the Order. Appropriate only when the address is not to be saved/reused. To use a saved Address (i.e. from the Addresses resource), PATCH the Order's ShippingAddressID property instead.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/shipto",
        method = RequestMethod.PUT)
    ResponseEntity<Object> setShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Create a new Shipment containing all Line Items from this Order.", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/ship",
        method = RequestMethod.POST)
    ResponseEntity<Object> ship(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/submit",
        method = RequestMethod.POST)
    ResponseEntity<Object> submit(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders",
        method = RequestMethod.PUT)
    ResponseEntity<Void> transferTempUserOrder(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Temp user token of the order.", required = true) @RequestParam(value = "tempUserToken", required = true) String tempUserToken);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Buyer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "" ,required=true ) @RequestBody Buyer company);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Address", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/addresses/{addressID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,@ApiParam(value = "" ,required=true ) @RequestBody Address address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "ApprovalRule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/approvalrules/{approvalRuleID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID,@ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule approvalRule);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/categories/{categoryID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,@ApiParam(value = "" ,required=true ) @RequestBody Category category);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CostCenter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/costcenters/{costCenterID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,@ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "CreditCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/creditcards/{creditCardID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,@ApiParam(value = "" ,required=true ) @RequestBody CreditCard card);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "EmailTemplate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType,@ApiParam(value = "" ,required=true ) @RequestBody EmailTemplate emailTemplate);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "" ,required=true ) @RequestBody Order order);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "LineItem", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,@ApiParam(value = "" ,required=true ) @RequestBody LineItem lineItem);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "" ,required=true ) @RequestBody Payment payment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/shipments/{shipmentID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,@ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "SpendingAccount", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,@ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "UserGroup", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/usergroups/{userGroupID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,@ApiParam(value = "" ,required=true ) @RequestBody UserGroup group);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/users/{userID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,@ApiParam(value = "" ,required=true ) @RequestBody User user);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Payment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,@ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,@ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID,@ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction transaction);

}
