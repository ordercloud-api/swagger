package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BuyersApiService;
import io.swagger.api.factories.BuyersApiServiceFactory;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/buyers")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class BuyersApi  {
   private final BuyersApiService delegate = BuyersApiServiceFactory.getBuyersApi();

    @POST
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    public Response addPromotion( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPromotion(buyerID,orderID,promoCode,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/approve")
    
    
    public Response approve( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("comments") String comments,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.approve(buyerID,orderID,comments,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/cancel")
    
    
    public Response cancel( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancel(buyerID,orderID,securityContext);
    }
    @POST
    
    
    
    public Response create( Buyer company,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(company,securityContext);
    }
    @POST
    @Path("/{buyerID}/addresses")
    
    
    public Response create_1( @PathParam("buyerID") String buyerID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_1(buyerID,address,securityContext);
    }
    @POST
    @Path("/{buyerID}/approvalrules")
    
    
    public Response create_2( @PathParam("buyerID") String buyerID, ApprovalRule approvalRule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_2(buyerID,approvalRule,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories")
    
    
    public Response create_3( @PathParam("buyerID") String buyerID, Category category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_3(buyerID,category,securityContext);
    }
    @POST
    @Path("/{buyerID}/costcenters")
    
    
    public Response create_4( @PathParam("buyerID") String buyerID, CostCenter costCenter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_4(buyerID,costCenter,securityContext);
    }
    @POST
    @Path("/{buyerID}/creditcards")
    
    
    public Response create_5( @PathParam("buyerID") String buyerID, CreditCard card,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_5(buyerID,card,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders")
    
    
    public Response create_6( @PathParam("buyerID") String buyerID, Order order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_6(buyerID,order,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    public Response create_7( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, LineItem lineItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_7(buyerID,orderID,lineItem,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    public Response create_8( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Payment payment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_8(buyerID,orderID,payment,securityContext);
    }
    @POST
    @Path("/{buyerID}/shipments")
    
    
    public Response create_9( @PathParam("buyerID") String buyerID, Shipment shipment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_9(buyerID,shipment,securityContext);
    }
    @POST
    @Path("/{buyerID}/spendingaccounts")
    
    
    public Response create_10( @PathParam("buyerID") String buyerID, SpendingAccount spendingAccount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_10(buyerID,spendingAccount,securityContext);
    }
    @POST
    @Path("/{buyerID}/usergroups")
    
    
    public Response create_11( @PathParam("buyerID") String buyerID, UserGroup group,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_11(buyerID,group,securityContext);
    }
    @POST
    @Path("/{buyerID}/users")
    
    
    public Response create_12( @PathParam("buyerID") String buyerID, User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create_12(buyerID,user,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions")
    
    
    public Response createTransaction( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, PaymentTransaction transaction,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTransaction(buyerID,orderID,paymentID,transaction,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/decline")
    
    
    public Response decline( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("comments") String comments,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.decline(buyerID,orderID,comments,securityContext);
    }
    @DELETE
    @Path("/{buyerID}")
    
    
    public Response delete( @PathParam("buyerID") String buyerID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(buyerID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    public Response delete_13( @PathParam("buyerID") String buyerID, @PathParam("addressID") String addressID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_13(buyerID,addressID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response delete_14( @PathParam("buyerID") String buyerID, @PathParam("approvalRuleID") String approvalRuleID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_14(buyerID,approvalRuleID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    public Response delete_15( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_15(buyerID,categoryID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response delete_16( @PathParam("buyerID") String buyerID, @PathParam("costCenterID") String costCenterID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_16(buyerID,costCenterID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response delete_17( @PathParam("buyerID") String buyerID, @PathParam("creditCardID") String creditCardID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_17(buyerID,creditCardID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}")
    
    
    public Response delete_18( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_18(buyerID,orderID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response delete_19( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_19(buyerID,orderID,lineItemID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response delete_20( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_20(buyerID,orderID,paymentID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    public Response delete_21( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_21(buyerID,shipmentID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response delete_22( @PathParam("buyerID") String buyerID, @PathParam("spendingAccountID") String spendingAccountID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_22(buyerID,spendingAccountID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response delete_23( @PathParam("buyerID") String buyerID, @PathParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_23(buyerID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/users/{userID}")
    
    
    public Response delete_24( @PathParam("buyerID") String buyerID, @PathParam("userID") String userID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete_24(buyerID,userID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/addresses/{addressID}/assignments")
    
    
    public Response deleteAssignment( @PathParam("buyerID") String buyerID, @PathParam("addressID") String addressID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(buyerID,addressID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/assignments")
    
    
    public Response deleteAssignment_25( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_25(buyerID,categoryID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/costcenters/{costCenterID}/assignments")
    
    
    public Response deleteAssignment_26( @PathParam("buyerID") String buyerID, @PathParam("costCenterID") String costCenterID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_26(buyerID,costCenterID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/creditcards/{creditCardID}/assignments")
    
    
    public Response deleteAssignment_27( @PathParam("buyerID") String buyerID, @PathParam("creditCardID") String creditCardID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_27(buyerID,creditCardID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}/assignments")
    
    
    public Response deleteAssignment_28( @PathParam("buyerID") String buyerID, @PathParam("spendingAccountID") String spendingAccountID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment_28(buyerID,spendingAccountID,userID,userGroupID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}")
    
    
    public Response deleteItem( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteItem(buyerID,shipmentID,orderID,lineItemID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/categories/{categoryID}/productassignments/{productID}")
    
    
    public Response deleteProductAssignment( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID, @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProductAssignment(buyerID,categoryID,productID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response deleteTransaction( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, @PathParam("transactionID") String transactionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTransaction(buyerID,orderID,paymentID,transactionID,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/usergroups/{userGroupID}/assignments/{userID}")
    
    
    public Response deleteUserAssignment( @PathParam("buyerID") String buyerID, @PathParam("userGroupID") String userGroupID, @PathParam("userID") String userID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUserAssignment(buyerID,userGroupID,userID,securityContext);
    }
    @GET
    @Path("/{buyerID}")
    
    
    public Response get( @PathParam("buyerID") String buyerID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(buyerID,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    public Response get_29( @PathParam("buyerID") String buyerID, @PathParam("addressID") String addressID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_29(buyerID,addressID,securityContext);
    }
    @GET
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response get_30( @PathParam("buyerID") String buyerID, @PathParam("approvalRuleID") String approvalRuleID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_30(buyerID,approvalRuleID,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    public Response get_31( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_31(buyerID,categoryID,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response get_32( @PathParam("buyerID") String buyerID, @PathParam("costCenterID") String costCenterID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_32(buyerID,costCenterID,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response get_33( @PathParam("buyerID") String buyerID, @PathParam("creditCardID") String creditCardID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_33(buyerID,creditCardID,securityContext);
    }
    @GET
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response get_34( @PathParam("buyerID") String buyerID, @PathParam("emailTemplateType") String emailTemplateType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_34(buyerID,emailTemplateType,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}")
    
    
    public Response get_35( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_35(buyerID,orderID,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response get_36( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_36(buyerID,orderID,lineItemID,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response get_37( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_37(buyerID,orderID,paymentID,securityContext);
    }
    @GET
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    public Response get_38( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_38(buyerID,shipmentID,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response get_39( @PathParam("buyerID") String buyerID, @PathParam("spendingAccountID") String spendingAccountID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_39(buyerID,spendingAccountID,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response get_40( @PathParam("buyerID") String buyerID, @PathParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_40(buyerID,userGroupID,securityContext);
    }
    @GET
    @Path("/{buyerID}/users/{userID}")
    
    
    public Response get_41( @PathParam("buyerID") String buyerID, @PathParam("userID") String userID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get_41(buyerID,userID,securityContext);
    }
    @POST
    @Path("/{buyerID}/users/{userID}/accesstoken")
    
    
    public Response getAccessToken( @PathParam("buyerID") String buyerID, @PathParam("userID") String userID, ImpersonateTokenRequest tokenRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccessToken(buyerID,userID,tokenRequest,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses")
    
    
    public Response list_42( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_42(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/approvalrules")
    
    
    public Response list_43( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_43(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories")
    
    
    public Response list_44( @PathParam("buyerID") String buyerID, @QueryParam("parentID") String parentID, @QueryParam("depth") String depth, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_44(buyerID,parentID,depth,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters")
    
    
    public Response list_45( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_45(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards")
    
    
    public Response list_46( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_46(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/lineitems")
    
    
    public Response list_47( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_47(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/payments")
    
    
    public Response list_48( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_48(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/shipments")
    
    
    public Response list_49( @PathParam("buyerID") String buyerID, @QueryParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_49(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts")
    
    
    public Response list_50( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_50(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups")
    
    
    public Response list_51( @PathParam("buyerID") String buyerID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_51(buyerID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/users")
    
    
    public Response list_52( @PathParam("buyerID") String buyerID, @QueryParam("userGroupID") String userGroupID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list_52(buyerID,userGroupID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/approvals")
    
    
    public Response listApprovals( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listApprovals(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/addresses/assignments")
    
    
    public Response listAssignments( @PathParam("buyerID") String buyerID, @QueryParam("addressID") String addressID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("isShipping") Boolean isShipping, @QueryParam("isBilling") Boolean isBilling, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(buyerID,addressID,userID,userGroupID,level,isShipping,isBilling,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/assignments")
    
    
    public Response listAssignments_53( @PathParam("buyerID") String buyerID, @QueryParam("categoryID") String categoryID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_53(buyerID,categoryID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/costcenters/assignments")
    
    
    public Response listAssignments_54( @PathParam("buyerID") String buyerID, @QueryParam("costCenterID") String costCenterID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_54(buyerID,costCenterID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/creditcards/assignments")
    
    
    public Response listAssignments_55( @PathParam("buyerID") String buyerID, @QueryParam("creditCardID") String creditCardID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_55(buyerID,creditCardID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    public Response listAssignments_56( @PathParam("buyerID") String buyerID, @QueryParam("spendingAccountID") String spendingAccountID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments_56(buyerID,spendingAccountID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/{parentID}/categories")
    
    
    public Response listChildren( @PathParam("buyerID") String buyerID, @PathParam("parentID") String parentID, @QueryParam("search") String search, @QueryParam("depth") String depth, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listChildren(buyerID,parentID,search,depth,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/eligibleapprovers")
    
    
    public Response listEligibleApprovers( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listEligibleApprovers(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/categories/productassignments")
    
    
    public Response listProductAssignments( @PathParam("buyerID") String buyerID, @QueryParam("categoryID") String categoryID, @QueryParam("productID") String productID, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProductAssignments(buyerID,categoryID,productID,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/orders/{orderID}/promotions")
    
    
    public Response listPromotions( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPromotions(buyerID,orderID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{buyerID}/usergroups/assignments")
    
    
    public Response listUserAssignments( @PathParam("buyerID") String buyerID, @QueryParam("userGroupID") String userGroupID, @QueryParam("userID") String userID, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserAssignments(buyerID,userGroupID,userID,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    public Response patch( @PathParam("buyerID") String buyerID, @PathParam("addressID") String addressID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(buyerID,addressID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response patch_57( @PathParam("buyerID") String buyerID, @PathParam("approvalRuleID") String approvalRuleID, ApprovalRule partialApprovalRule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_57(buyerID,approvalRuleID,partialApprovalRule,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    public Response patch_58( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID, Category category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_58(buyerID,categoryID,category,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response patch_59( @PathParam("buyerID") String buyerID, @PathParam("costCenterID") String costCenterID, CostCenter costCenter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_59(buyerID,costCenterID,costCenter,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response patch_60( @PathParam("buyerID") String buyerID, @PathParam("creditCardID") String creditCardID, CreditCard card,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_60(buyerID,creditCardID,card,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response patch_61( @PathParam("buyerID") String buyerID, @PathParam("emailTemplateType") String emailTemplateType, EmailTemplate emailTemplate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_61(buyerID,emailTemplateType,emailTemplate,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}")
    
    
    public Response patch_62( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Order partialOrder,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_62(buyerID,orderID,partialOrder,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response patch_63( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID, LineItem partialLineItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_63(buyerID,orderID,lineItemID,partialLineItem,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response patch_64( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, Payment partialPayment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_64(buyerID,orderID,paymentID,partialPayment,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    public Response patch_65( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID, Shipment shipment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_65(buyerID,shipmentID,shipment,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response patch_66( @PathParam("buyerID") String buyerID, @PathParam("spendingAccountID") String spendingAccountID, SpendingAccount spendingAccount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_66(buyerID,spendingAccountID,spendingAccount,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response patch_67( @PathParam("buyerID") String buyerID, @PathParam("userGroupID") String userGroupID, UserGroup group,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_67(buyerID,userGroupID,group,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/users/{userID}")
    
    
    public Response patch_68( @PathParam("buyerID") String buyerID, @PathParam("userID") String userID, User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch_68(buyerID,userID,user,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    public Response patchBillingAddress( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchBillingAddress(buyerID,orderID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    public Response patchShippingAddress( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchShippingAddress(buyerID,orderID,lineItemID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    public Response patchShippingAddress_69( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchShippingAddress_69(buyerID,orderID,address,securityContext);
    }
    @PATCH
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response patchTransaction( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, @PathParam("transactionID") String transactionID, PaymentTransaction partialTransaction,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchTransaction(buyerID,orderID,paymentID,transactionID,partialTransaction,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/orders/{orderID}/promotions/{promoCode}")
    
    
    public Response removePromotion( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removePromotion(buyerID,orderID,promoCode,securityContext);
    }
    @DELETE
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response resetToDefault( @PathParam("buyerID") String buyerID, @PathParam("emailTemplateType") String emailTemplateType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resetToDefault(buyerID,emailTemplateType,securityContext);
    }
    @POST
    @Path("/{buyerID}/addresses/assignments")
    
    
    public Response saveAssignment( @PathParam("buyerID") String buyerID, AddressAssignment assignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories/assignments")
    
    
    public Response saveAssignment_70( @PathParam("buyerID") String buyerID, CategoryAssignment categoryAssignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_70(buyerID,categoryAssignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/costcenters/assignments")
    
    
    public Response saveAssignment_71( @PathParam("buyerID") String buyerID, CostCenterAssignment assignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_71(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/creditcards/assignments")
    
    
    public Response saveAssignment_72( @PathParam("buyerID") String buyerID, CreditCardAssignment assignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_72(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/spendingaccounts/assignments")
    
    
    public Response saveAssignment_73( @PathParam("buyerID") String buyerID, SpendingAccountAssignment assignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment_73(buyerID,assignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/shipments/{shipmentID}/items")
    
    
    public Response saveItem( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID, ShipmentItem item,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveItem(buyerID,shipmentID,item,securityContext);
    }
    @POST
    @Path("/{buyerID}/categories/productassignments")
    
    
    public Response saveProductAssignment( @PathParam("buyerID") String buyerID, CategoryProductAssignment productAssignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveProductAssignment(buyerID,productAssignment,securityContext);
    }
    @POST
    @Path("/{buyerID}/usergroups/assignments")
    
    
    public Response saveUserAssignment( @PathParam("buyerID") String buyerID, UserGroupAssignment userGroupAssignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveUserAssignment(buyerID,userGroupAssignment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/billto")
    
    
    public Response setBillingAddress( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setBillingAddress(buyerID,orderID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
    
    
    public Response setShippingAddress( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setShippingAddress(buyerID,orderID,lineItemID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/shipto")
    
    
    public Response setShippingAddress_74( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setShippingAddress_74(buyerID,orderID,address,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/ship")
    
    
    public Response ship( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Shipment shipment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ship(buyerID,orderID,shipment,securityContext);
    }
    @POST
    @Path("/{buyerID}/orders/{orderID}/submit")
    
    
    public Response submit( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submit(buyerID,orderID,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders")
    
    
    public Response transferTempUserOrder( @PathParam("buyerID") String buyerID, @QueryParam("tempUserToken") String tempUserToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferTempUserOrder(buyerID,tempUserToken,securityContext);
    }
    @PUT
    @Path("/{buyerID}")
    
    
    public Response update( @PathParam("buyerID") String buyerID, Buyer company,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(buyerID,company,securityContext);
    }
    @PUT
    @Path("/{buyerID}/addresses/{addressID}")
    
    
    public Response update_75( @PathParam("buyerID") String buyerID, @PathParam("addressID") String addressID, Address address,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_75(buyerID,addressID,address,securityContext);
    }
    @PUT
    @Path("/{buyerID}/approvalrules/{approvalRuleID}")
    
    
    public Response update_76( @PathParam("buyerID") String buyerID, @PathParam("approvalRuleID") String approvalRuleID, ApprovalRule approvalRule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_76(buyerID,approvalRuleID,approvalRule,securityContext);
    }
    @PUT
    @Path("/{buyerID}/categories/{categoryID}")
    
    
    public Response update_77( @PathParam("buyerID") String buyerID, @PathParam("categoryID") String categoryID, Category category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_77(buyerID,categoryID,category,securityContext);
    }
    @PUT
    @Path("/{buyerID}/costcenters/{costCenterID}")
    
    
    public Response update_78( @PathParam("buyerID") String buyerID, @PathParam("costCenterID") String costCenterID, CostCenter costCenter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_78(buyerID,costCenterID,costCenter,securityContext);
    }
    @PUT
    @Path("/{buyerID}/creditcards/{creditCardID}")
    
    
    public Response update_79( @PathParam("buyerID") String buyerID, @PathParam("creditCardID") String creditCardID, CreditCard card,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_79(buyerID,creditCardID,card,securityContext);
    }
    @PUT
    @Path("/{buyerID}/emailtemplates/{emailTemplateType}")
    
    
    public Response update_80( @PathParam("buyerID") String buyerID, @PathParam("emailTemplateType") String emailTemplateType, EmailTemplate emailTemplate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_80(buyerID,emailTemplateType,emailTemplate,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}")
    
    
    public Response update_81( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, Order order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_81(buyerID,orderID,order,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
    
    
    public Response update_82( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("lineItemID") String lineItemID, LineItem lineItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_82(buyerID,orderID,lineItemID,lineItem,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}")
    
    
    public Response update_83( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, Payment payment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_83(buyerID,orderID,paymentID,payment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/shipments/{shipmentID}")
    
    
    public Response update_84( @PathParam("buyerID") String buyerID, @PathParam("shipmentID") String shipmentID, Shipment shipment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_84(buyerID,shipmentID,shipment,securityContext);
    }
    @PUT
    @Path("/{buyerID}/spendingaccounts/{spendingAccountID}")
    
    
    public Response update_85( @PathParam("buyerID") String buyerID, @PathParam("spendingAccountID") String spendingAccountID, SpendingAccount spendingAccount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_85(buyerID,spendingAccountID,spendingAccount,securityContext);
    }
    @PUT
    @Path("/{buyerID}/usergroups/{userGroupID}")
    
    
    public Response update_86( @PathParam("buyerID") String buyerID, @PathParam("userGroupID") String userGroupID, UserGroup group,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_86(buyerID,userGroupID,group,securityContext);
    }
    @PUT
    @Path("/{buyerID}/users/{userID}")
    
    
    public Response update_87( @PathParam("buyerID") String buyerID, @PathParam("userID") String userID, User user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update_87(buyerID,userID,user,securityContext);
    }
    @PUT
    @Path("/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
    
    
    public Response updateTransaction( @PathParam("buyerID") String buyerID, @PathParam("orderID") String orderID, @PathParam("paymentID") String paymentID, @PathParam("transactionID") String transactionID, PaymentTransaction transaction,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTransaction(buyerID,orderID,paymentID,transactionID,transaction,securityContext);
    }
}
