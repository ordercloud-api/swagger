package io.swagger.handler;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import io.swagger.model.*;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
public class BuyersController  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Direclty to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext addPromotion(RequestContext request , String buyerID, String orderID, String promoCode) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext approve(RequestContext request , String buyerID, String orderID, String comments) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext cancel(RequestContext request , String buyerID, String orderID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , Buyer company) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, ApprovalRule approvalRule) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, Category category) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, CostCenter costCenter) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, CreditCard card) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, Order order) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, String orderID, LineItem lineItem) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, String orderID, Payment payment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, Shipment shipment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, SpendingAccount spendingAccount) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, UserGroup group) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext create(RequestContext request , String buyerID, User user) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createTransaction(RequestContext request , String buyerID, String orderID, String paymentID, PaymentTransaction transaction) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext decline(RequestContext request , String buyerID, String orderID, String comments) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String addressID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String approvalRuleID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String categoryID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String costCenterID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String creditCardID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String orderID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String orderID, String lineItemID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String orderID, String paymentID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String shipmentID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String spendingAccountID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext delete(RequestContext request , String buyerID, String userID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteAssignment(RequestContext request , String buyerID, String addressID, String userID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteAssignment(RequestContext request , String buyerID, String categoryID, String userID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteAssignment(RequestContext request , String buyerID, String costCenterID, String userID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteAssignment(RequestContext request , String buyerID, String creditCardID, String userID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteAssignment(RequestContext request , String buyerID, String spendingAccountID, String userID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteItem(RequestContext request , String buyerID, String shipmentID, String orderID, String lineItemID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteProductAssignment(RequestContext request , String buyerID, String categoryID, String productID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteTransaction(RequestContext request , String buyerID, String orderID, String paymentID, String transactionID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteUserAssignment(RequestContext request , String buyerID, String userGroupID, String userID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String addressID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String approvalRuleID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String categoryID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String costCenterID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String creditCardID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String emailTemplateType) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String orderID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String orderID, String lineItemID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String orderID, String paymentID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String shipmentID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String spendingAccountID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String userGroupID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext get(RequestContext request , String buyerID, String userID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAccessToken(RequestContext request , String buyerID, String userID, ImpersonateTokenRequest tokenRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String search, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String parentID, String depth, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext list(RequestContext request , String buyerID, String userGroupID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listApprovals(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listAssignments(RequestContext request , String buyerID, String addressID, String userID, String userGroupID, String level, Boolean isShipping, Boolean isBilling, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listAssignments(RequestContext request , String buyerID, String categoryID, String userID, String userGroupID, String level, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listAssignments(RequestContext request , String buyerID, String costCenterID, String userID, String userGroupID, String level, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listAssignments(RequestContext request , String buyerID, String creditCardID, String userID, String userGroupID, String level, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listAssignments(RequestContext request , String buyerID, String spendingAccountID, String userID, String userGroupID, String level, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listChildren(RequestContext request , String buyerID, String parentID, String search, String depth, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listEligibleApprovers(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listProductAssignments(RequestContext request , String buyerID, String categoryID, String productID, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listPromotions(RequestContext request , String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext listUserAssignments(RequestContext request , String buyerID, String userGroupID, String userID, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String addressID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String approvalRuleID, ApprovalRule partialApprovalRule) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String categoryID, Category category) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String costCenterID, CostCenter costCenter) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String creditCardID, CreditCard card) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String emailTemplateType, EmailTemplate emailTemplate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String orderID, Order partialOrder) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String orderID, String lineItemID, LineItem partialLineItem) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String orderID, String paymentID, Payment partialPayment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String shipmentID, Shipment shipment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String spendingAccountID, SpendingAccount spendingAccount) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String userGroupID, UserGroup group) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patch(RequestContext request , String buyerID, String userID, User user) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patchBillingAddress(RequestContext request , String buyerID, String orderID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patchShippingAddress(RequestContext request , String buyerID, String orderID, String lineItemID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patchShippingAddress(RequestContext request , String buyerID, String orderID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patchTransaction(RequestContext request , String buyerID, String orderID, String paymentID, String transactionID, PaymentTransaction partialTransaction) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext removePromotion(RequestContext request , String buyerID, String orderID, String promoCode) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext resetToDefault(RequestContext request , String buyerID, String emailTemplateType) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveAssignment(RequestContext request , String buyerID, AddressAssignment assignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveAssignment(RequestContext request , String buyerID, CategoryAssignment categoryAssignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveAssignment(RequestContext request , String buyerID, CostCenterAssignment assignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveAssignment(RequestContext request , String buyerID, CreditCardAssignment assignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveAssignment(RequestContext request , String buyerID, SpendingAccountAssignment assignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveItem(RequestContext request , String buyerID, String shipmentID, ShipmentItem item) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveProductAssignment(RequestContext request , String buyerID, CategoryProductAssignment productAssignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext saveUserAssignment(RequestContext request , String buyerID, UserGroupAssignment userGroupAssignment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setBillingAddress(RequestContext request , String buyerID, String orderID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setShippingAddress(RequestContext request , String buyerID, String orderID, String lineItemID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setShippingAddress(RequestContext request , String buyerID, String orderID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext ship(RequestContext request , String buyerID, String orderID, Shipment shipment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext submit(RequestContext request , String buyerID, String orderID) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext transferTempUserOrder(RequestContext request , String buyerID, String tempUserToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, Buyer company) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String addressID, Address address) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String approvalRuleID, ApprovalRule approvalRule) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String categoryID, Category category) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String costCenterID, CostCenter costCenter) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String creditCardID, CreditCard card) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String emailTemplateType, EmailTemplate emailTemplate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String orderID, Order order) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String orderID, String lineItemID, LineItem lineItem) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String orderID, String paymentID, Payment payment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String shipmentID, Shipment shipment) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String spendingAccountID, SpendingAccount spendingAccount) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String userGroupID, UserGroup group) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext update(RequestContext request , String buyerID, String userID, User user) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateTransaction(RequestContext request , String buyerID, String orderID, String paymentID, String transactionID, PaymentTransaction transaction) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

