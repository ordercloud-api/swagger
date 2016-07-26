package io.swagger.api;


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

@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/orders/incoming",
        method = RequestMethod.GET)
    ResponseEntity<Object> listIncoming(@ApiParam(value = "ID of the buyer.") @RequestParam(value = "buyerID", required = false) String buyerID,@ApiParam(value = "Lower bound of date range that the order was submitted.") @RequestParam(value = "from", required = false) String from,@ApiParam(value = "Upper bound of date range that the order was submitted.") @RequestParam(value = "to", required = false) String to,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/orders/outgoing",
        method = RequestMethod.GET)
    ResponseEntity<Object> listOutgoing(@ApiParam(value = "ID of the buyer.") @RequestParam(value = "buyerID", required = false) String buyerID,@ApiParam(value = "Lower bound of date range that the order was created.") @RequestParam(value = "from", required = false) String from,@ApiParam(value = "Upper bound of date range that the order was created.") @RequestParam(value = "to", required = false) String to,@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);

}
