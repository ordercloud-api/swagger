package io.swagger.api;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

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
public class MeApiController implements MeApi {

    public ResponseEntity<Object> createAddress(@ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> createCreditCard(@ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get() {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getOrder(@ApiParam(value = "ID of the order.",required=true ) @PathVariable("orderID") String orderID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getProduct(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getPromotion(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getSpec(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,
        @ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listAddresses(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listCategories(@ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listCostCenters(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listCreditCards(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listIncomingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "from", required = false) String from,
        @ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "to", required = false) String to,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listOutgoingOrders(@ApiParam(value = "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "from", required = false) String from,
        @ApiParam(value = "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).") @RequestParam(value = "to", required = false) String to,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listProducts(@ApiParam(value = "ID of the category.") @RequestParam(value = "categoryID", required = false) String categoryID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listPromotions(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listSpecs(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listSubcategories(@ApiParam(value = "ID of the parent.",required=true ) @PathVariable("parentID") String parentID,
        @ApiParam(value = "Depth of the category.") @RequestParam(value = "depth", required = false) String depth,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listUserGroups(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "" ,required=true ) @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patchAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,
        @ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> patchCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID,
        @ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "" ,required=true ) @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> updateAddress(@ApiParam(value = "ID of the address.",required=true ) @PathVariable("addressID") String addressID,
        @ApiParam(value = "" ,required=true ) @RequestBody BuyerAddress address) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> updateCreditCard(@ApiParam(value = "ID of the creditcard.",required=true ) @PathVariable("creditcardID") String creditcardID,
        @ApiParam(value = "" ,required=true ) @RequestBody BuyerCreditCard creditCard) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
