package io.swagger.api;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

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
public class PromotionsApiController implements PromotionsApi {

    public ResponseEntity<Object> create(@ApiParam(value = "" ,required=true ) @RequestBody Promotion promo) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAssignment(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,
        @ApiParam(value = "ID of the buyer.", required = true) @RequestParam(value = "buyerID", required = true) String buyerID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID) {
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

    public ResponseEntity<Object> listAssignments(@ApiParam(value = "ID of the buyer.", required = true) @RequestParam(value = "buyerID", required = true) String buyerID,
        @ApiParam(value = "ID of the promotion.") @RequestParam(value = "promotionID", required = false) String promotionID,
        @ApiParam(value = "ID of the user.") @RequestParam(value = "userID", required = false) String userID,
        @ApiParam(value = "ID of the user group.") @RequestParam(value = "userGroupID", required = false) String userGroupID,
        @ApiParam(value = "Level of the promotion.") @RequestParam(value = "level", required = false) String level,
        @ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> patch(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,
        @ApiParam(value = "" ,required=true ) @RequestBody Promotion partialPromotion) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Void> saveAssignment(@ApiParam(value = "" ,required=true ) @RequestBody PromotionAssignment assignment) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Object> update(@ApiParam(value = "ID of the promotion.",required=true ) @PathVariable("promotionID") String promotionID,
        @ApiParam(value = "" ,required=true ) @RequestBody Promotion promo) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
