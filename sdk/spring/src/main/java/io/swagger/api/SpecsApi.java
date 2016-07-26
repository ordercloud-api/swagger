package io.swagger.api;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

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

@Api(value = "specs", description = "the specs API")
public interface SpecsApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/specs",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Spec spec);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "A Spec can have multiple Options-- for example, if the spec is called 'Color', the options might be 'Blue', 'Red', and 'Green'. ", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}/options",
        method = RequestMethod.POST)
    ResponseEntity<Object> createOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "" ,required=true ) @RequestBody SpecOption option);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/specs/{specID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/specs/{specID}/options/{optionID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/specs/{specID}/productassignments/{productID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProductAssignment(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}/options/{optionID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> getOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}/options",
        method = RequestMethod.GET)
    ResponseEntity<Object> listOptions(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/productassignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listProductAssignments(@ApiParam(value = "ID of the spec.") @RequestParam(value = "specID", required = false) String specID,@ApiParam(value = "ID of the product.") @RequestParam(value = "productID", required = false) String productID,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "" ,required=true ) @RequestBody Spec spec);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}/options/{optionID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patchOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID,@ApiParam(value = "" ,required=true ) @RequestBody SpecOption option);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "While DefinesVariant is an optional parameter, if it is set to 'False', generating product variants will not generate variants with that spec. This is useful for things like custom logos, where you don't want a defined variant product for each logo, but you do want to capture a product customization.", response = Void.class) })
    @RequestMapping(value = "/specs/productassignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveProductAssignment(@ApiParam(value = "" ,required=true ) @RequestBody SpecProductAssignment productAssignment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "" ,required=true ) @RequestBody Spec spec);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Spec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/specs/{specID}/options/{optionID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,@ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID,@ApiParam(value = "" ,required=true ) @RequestBody SpecOption option);

}
