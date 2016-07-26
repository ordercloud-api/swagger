package io.swagger.api;

import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

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

@Api(value = "products", description = "the products API")
public interface ProductsApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/products",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Product product);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/products/{productID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "As price schedules aren't assigned to a party without their accompanying product, you don't use Delete Assignment to delete a price schedule. If you need to remove a price schedule assignment, update the assignment to have the price schedule ID as a null. ", response = Void.class) })
    @RequestMapping(value = "/products/{productID}/assignments/{buyerID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the buyer.",required=true ) @PathVariable("buyerID") String buyerID,@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/generate",
        method = RequestMethod.POST)
    ResponseEntity<Object> generateVariants(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "Overwrite existing of the product.") @RequestParam(value = "overwriteExisting", required = false) Boolean overwriteExisting);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Getting the Inventory on an Inventory-enabled product returns two things: the Avalible inventory, and the Reserved inventory. When an Order includes a product on the a lineitem, the total amount of that product is reserved. When that Order is submitted, the products previously reserved for that order are removed from the total inventory and the reserved ammount.", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/inventory",
        method = RequestMethod.GET)
    ResponseEntity<Object> getInventory(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/{variantID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getVariant(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the variant.",required=true ) @PathVariable("variantID") String variantID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Getting the Variant Inventory will return the Name, Available Inventory and Reserved Inventory for a specific product variant based on the ProductID and VariantID specified. ", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/inventory/{variantID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getVariantInventory(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the variant.",required=true ) @PathVariable("variantID") String variantID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the product.") @RequestParam(value = "productID", required = false) String productID,@ApiParam(value = "ID of the buyer.") @RequestParam(value = "buyerID", required = false) String buyerID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the product.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "ID of the price schedule.") @RequestParam(value = "priceScheduleID", required = false) String priceScheduleID,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/inventory",
        method = RequestMethod.GET)
    ResponseEntity<Object> listInventory(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Listing the Variant Inventory will return a list of all variants under a specific product and each variant's available and reserved inventory.", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/inventory",
        method = RequestMethod.GET)
    ResponseEntity<Object> listVariantInventory(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants",
        method = RequestMethod.GET)
    ResponseEntity<Object> listVariants(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/products/{productID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> patch(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "" ,required=true ) @RequestBody Product product);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/{variantID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchVariant(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the variant.",required=true ) @PathVariable("variantID") String variantID,@ApiParam(value = "" ,required=true ) @RequestBody Variant variant);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/products/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "" ,required=true ) @RequestBody ProductAssignment productAssignment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "" ,required=true ) @RequestBody Product product);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/inventory/{inventory}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateInventory(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "Inventory of the product.",required=true ) @PathVariable("inventory") Integer inventory);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/{variantID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateVariant(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the variant.",required=true ) @PathVariable("variantID") String variantID,@ApiParam(value = "" ,required=true ) @RequestBody Variant variant);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/products/{productID}/variants/inventory/{variantID}/{inventory}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateVariantInventory(@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID,@ApiParam(value = "ID of the variant.",required=true ) @PathVariable("variantID") String variantID,@ApiParam(value = "Inventory of the product.",required=true ) @PathVariable("inventory") Integer inventory);

}
