package io.swagger.api;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

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

@Api(value = "promotions", description = "the promotions API")
public interface PromotionsApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions",
        method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Promotion promo);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/promotions/{promotionID}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> delete(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/promotions/{promotionID}/assignments",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,@ApiParam(value = "ID of the buyer.", required = true) @RequestParam(value = "buyerID", required = true) String buyerID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions/{promotionID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Word or phrase to search for.") @RequestParam(value = "search", required = false) String search,@ApiParam(value = "Comma-delimited list of fields to search on.") @RequestParam(value = "searchOn", required = false) String searchOn,@ApiParam(value = "Comma-delimited list of fields to sort by.") @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions/assignments",
        method = RequestMethod.GET)
    ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.", required = true) @RequestParam(value = "buyerID", required = true) String buyerID,@ApiParam(value = "ID of the promotion.") @RequestParam(value = "promotionID", required = false) String promotionID,@ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,@ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,@ApiParam(value = "Level of the promotion.") @RequestParam(value = "level", required = false) String level,@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions/{promotionID}",
        method = RequestMethod.PATCH)
    ResponseEntity<Object> patch(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,@ApiParam(value = "" ,required=true ) @RequestBody Promotion partialPromotion);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/promotions/assignments",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveAssignment(@ApiParam(value = "" ,required=true ) @RequestBody PromotionAssignment assignment);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "Promotion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/promotions/{promotionID}",
        method = RequestMethod.PUT)
    ResponseEntity<Object> update(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,@ApiParam(value = "" ,required=true ) @RequestBody Promotion promo);

}
