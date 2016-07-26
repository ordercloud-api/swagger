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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Controller
public class BuyersApiController implements BuyersApi {

    public ResponseEntity<Object> addPromotion(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Promo code of the order.",required=true ) @PathVariable("promoCode") String promoCode) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> approve(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Comments to be saved with the order approval.") @RequestParam(value = "comments", required = false) String comments) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> cancel(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Buyer company) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule approvalRule) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody Category category) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CreditCard card) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody Order order) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody LineItem lineItem) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Payment payment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody UserGroup group) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> create(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> createTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction transaction) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> decline(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Comments to be saved with the order denial.") @RequestParam(value = "comments", required = false) String comments) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> deleteItem(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProductAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,
        @ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUserAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getAccessToken(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,
        @ApiParam(value = "" ,required=true ) @RequestBody ImpersonateTokenRequest tokenRequest) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the parent.") @RequestParam(value = "parentID", required = false) String parentID,
        @ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.") @RequestParam(value = "orderID", required = false) String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listApprovals(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.") @RequestParam(value = "addressID", required = false) String addressID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the address.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Is shipping of the address.") @RequestParam(value = "isShipping", required = false) Boolean isShipping,
        @ApiParam(value = "Is billing of the address.") @RequestParam(value = "isBilling", required = false) Boolean isBilling,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the category.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.") @RequestParam(value = "costCenterID", required = false) String costCenterID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the cost center.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.") @RequestParam(value = "creditCardID", required = false) String creditCardID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the credit card.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.") @RequestParam(value = "spendingAccountID", required = false) String spendingAccountID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the spending account.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listChildren(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the parent.",required=true ) @PathVariable("parentID") String parentID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listEligibleApprovers(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listProductAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,
        @ApiParam(value = "ID of the product.") @RequestParam(value = "productID", required = false) String productID,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listPromotions(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listUserAssignments(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID,
        @ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule partialApprovalRule) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,
        @ApiParam(value = "" ,required=true ) @RequestBody Category category) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,
        @ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,
        @ApiParam(value = "" ,required=true ) @RequestBody CreditCard card) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType,
        @ApiParam(value = "" ,required=true ) @RequestBody EmailTemplate emailTemplate) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Order partialOrder) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,
        @ApiParam(value = "" ,required=true ) @RequestBody LineItem partialLineItem) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "" ,required=true ) @RequestBody Payment partialPayment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,
        @ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,
        @ApiParam(value = "" ,required=true ) @RequestBody UserGroup group) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patch(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,
        @ApiParam(value = "" ,required=true ) @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patchBillingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patchShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patchShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patchTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID,
        @ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction partialTransaction) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> removePromotion(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "Promo code of the order.",required=true ) @PathVariable("promoCode") String promoCode) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> resetToDefault(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody AddressAssignment assignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CategoryAssignment categoryAssignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CostCenterAssignment assignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CreditCardAssignment assignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpendingAccountAssignment assignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> saveItem(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,
        @ApiParam(value = "" ,required=true ) @RequestBody ShipmentItem item) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveProductAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody CategoryProductAssignment productAssignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveUserAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody UserGroupAssignment userGroupAssignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> setBillingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> setShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> setShippingAddress(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> ship(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> submit(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> transferTempUserOrder(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Temp user token of the order.", required = true) @RequestParam(value = "tempUserToken", required = true) String tempUserToken) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "" ,required=true ) @RequestBody Buyer company) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,
        @ApiParam(value = "" ,required=true ) @RequestBody Address address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the approval rule.",required=true ) @PathVariable("approvalRuleID") String approvalRuleID,
        @ApiParam(value = "" ,required=true ) @RequestBody ApprovalRule approvalRule) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the category.",required=true ) @PathVariable("categoryID") String categoryID,
        @ApiParam(value = "" ,required=true ) @RequestBody Category category) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the cost center.",required=true ) @PathVariable("costCenterID") String costCenterID,
        @ApiParam(value = "" ,required=true ) @RequestBody CostCenter costCenter) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the credit card.",required=true ) @PathVariable("creditCardID") String creditCardID,
        @ApiParam(value = "" ,required=true ) @RequestBody CreditCard card) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",required=true ) @PathVariable("emailTemplateType") String emailTemplateType,
        @ApiParam(value = "" ,required=true ) @RequestBody EmailTemplate emailTemplate) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "" ,required=true ) @RequestBody Order order) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the line item.",required=true ) @PathVariable("lineItemID") String lineItemID,
        @ApiParam(value = "" ,required=true ) @RequestBody LineItem lineItem) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "" ,required=true ) @RequestBody Payment payment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the shipment.",required=true ) @PathVariable("shipmentID") String shipmentID,
        @ApiParam(value = "" ,required=true ) @RequestBody Shipment shipment) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the spending account.",required=true ) @PathVariable("spendingAccountID") String spendingAccountID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpendingAccount spendingAccount) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user group.",required=true ) @PathVariable("userGroupID") String userGroupID,
        @ApiParam(value = "" ,required=true ) @RequestBody UserGroup group) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userID") String userID,
        @ApiParam(value = "" ,required=true ) @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> updateTransaction(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,
        @ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID,
        @ApiParam(value = "ID of the payment.",required=true ) @PathVariable("paymentID") String paymentID,
        @ApiParam(value = "ID of the transaction.",required=true ) @PathVariable("transactionID") String transactionID,
        @ApiParam(value = "" ,required=true ) @RequestBody PaymentTransaction transaction) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
