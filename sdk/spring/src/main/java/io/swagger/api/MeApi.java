package io.swagger.api;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

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

@Api(value = "me", description = "the me API")
public interface MeApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/addresses",
        method = RequestMethod.POST)
    ResponseEntity<Object> createAddress(@ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/creditcards",
        method = RequestMethod.POST)
    ResponseEntity<Object> createCreditCard(@ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = Void.class) })
    @RequestMapping(value = "/me/addresses/{addressID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = Void.class) })
    @RequestMapping(value = "/me/creditcards/{creditcardID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/me",
        method = RequestMethod.GET)
    ResponseEntity<Object> get();


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/addresses/{addressID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/creditcards/{creditcardID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/orders/{orderID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getOrder(@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/products/{productID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getProduct(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/promotions/{promotionID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getPromotion(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/products/{productID}/specs/{specID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getSpec(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/addresses",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAddresses(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/categories",
        method = RequestMethod.GET)
    ResponseEntity<Object> listCategories(@ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/costcenters",
        method = RequestMethod.GET)
    ResponseEntity<Object> listCostCenters(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/creditcards",
        method = RequestMethod.GET)
    ResponseEntity<Object> listCreditCards(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/orders/incoming",
        method = RequestMethod.GET)
    ResponseEntity<Object> listIncomingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "from", required = false) String from,@ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "to", required = false) String to,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/orders/outgoing",
        method = RequestMethod.GET)
    ResponseEntity<Object> listOutgoingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "from", required = false) String from,@ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "to", required = false) String to,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/products",
        method = RequestMethod.GET)
    ResponseEntity<Object> listProducts(@ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/promotions",
        method = RequestMethod.GET)
    ResponseEntity<Object> listPromotions(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/products/{productID}/specs",
        method = RequestMethod.GET)
    ResponseEntity<Object> listSpecs(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/categories/{parentID}/categories",
        method = RequestMethod.GET)
    ResponseEntity<Object> listSubcategories(@ApiParam(value = "ID of the parent.",required=true ) @PathVariable("parentID") String parentID,@ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/usergroups",
        method = RequestMethod.GET)
    ResponseEntity<Object> listUserGroups(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/me",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "" ,required=true ) @RequestBody User user);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = Void.class) })
    @RequestMapping(value = "/me/addresses/{addressID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patchAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,@ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Only available to Buyer Users.", response = Void.class) })
    @RequestMapping(value = "/me/creditcards/{creditcardID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patchCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID,@ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/me",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "" ,required=true ) @RequestBody User user);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/addresses/{addressID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,@ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Me", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Only available to Buyer Users.", response = Object.class) })
    @RequestMapping(value = "/me/creditcards/{creditcardID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID,@ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard);

}
