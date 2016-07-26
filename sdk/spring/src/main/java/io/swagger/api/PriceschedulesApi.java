package io.swagger.api;

import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

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

@Api(value = "priceschedules", description = "the priceschedules API")
public interface PriceschedulesApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody PriceSchedule priceSchedule);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}/PriceBreaks",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePriceBreak(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID,@ApiParam(value = "Quantity of the price schedule.", required = true) @RequestParam(value = "quantity", required = true) Integer quantity);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID,@ApiParam(value = "" ,required=true ) @RequestBody PriceSchedule priceSchedule);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}/PriceBreaks",
        method = RequestMethod.POST)
    ResponseEntity<Object> savePriceBreak(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID,@ApiParam(value = "" ,required=true ) @RequestBody PriceBreak priceBreak);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PriceSchedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/priceschedules/{priceScheduleID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the price schedule.",required=true ) @PathVariable("priceScheduleID") String priceScheduleID,@ApiParam(value = "" ,required=true ) @RequestBody PriceSchedule priceSchedule);

}
