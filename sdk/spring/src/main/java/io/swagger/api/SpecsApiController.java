package io.swagger.api;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

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
public class SpecsApiController implements SpecsApi {

    public ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Spec spec) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> createOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpecOption option) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProductAssignment(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "ID of the product.",required=true ) @PathVariable("productID") String productID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listOptions(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,
        @ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,
        @ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> listProductAssignments(@ApiParam(value = "ID of the spec.") @RequestParam(value = "specID", required = false) String specID,
        @ApiParam(value = "ID of the product.") @RequestParam(value = "productID", required = false) String productID,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "" ,required=true ) @RequestBody Spec spec) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patchOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpecOption option) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveProductAssignment(@ApiParam(value = "" ,required=true ) @RequestBody SpecProductAssignment productAssignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "" ,required=true ) @RequestBody Spec spec) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> updateOption(@ApiParam(value = "ID of the spec.",required=true ) @PathVariable("specID") String specID,
        @ApiParam(value = "ID of the option.",required=true ) @PathVariable("optionID") String optionID,
        @ApiParam(value = "" ,required=true ) @RequestBody SpecOption option) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
