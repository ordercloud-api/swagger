package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PromotionsApiService;
import io.swagger.api.factories.PromotionsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/promotions")


@io.swagger.annotations.Api(description = "the promotions API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class PromotionsApi  {
   private final PromotionsApiService delegate = PromotionsApiServiceFactory.getPromotionsApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) Promotion promo
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(promo,securityContext);
    }
    @DELETE
    @Path("/{promotionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(promotionID,securityContext);
    }
    @DELETE
    @Path("/{promotionID}/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@ApiParam(value = "ID of the buyer.",required=true) @QueryParam("buyerID") String buyerID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(promotionID,buyerID,userID,userGroupID,securityContext);
    }
    @GET
    @Path("/{promotionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(promotionID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@ApiParam(value = "ID of the buyer.",required=true) @QueryParam("buyerID") String buyerID
,@ApiParam(value = "ID of the promotion.") @QueryParam("promotionID") String promotionID
,@ApiParam(value = "ID of the user.") @QueryParam("userID") String userID
,@ApiParam(value = "ID of the user group.") @QueryParam("userGroupID") String userGroupID
,@ApiParam(value = "Level of the promotion.") @QueryParam("level") String level
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(buyerID,promotionID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{promotionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@ApiParam(value = "" ,required=true) Promotion partialPromotion
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(promotionID,partialPromotion,securityContext);
    }
    @POST
    @Path("/assignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(@ApiParam(value = "" ,required=true) PromotionAssignment assignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(assignment,securityContext);
    }
    @PUT
    @Path("/{promotionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the promotion.",required=true) @PathParam("promotionID") String promotionID
,@ApiParam(value = "" ,required=true) Promotion promo
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(promotionID,promo,securityContext);
    }
}
