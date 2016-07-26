package io.swagger.api;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/promotions")

@Api(description = "the promotions API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class PromotionsApi  {

    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(Promotion promo) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{promotionID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@PathParam("promotionID") String promotionID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{promotionID}/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteAssignment(@PathParam("promotionID") String promotionID,@QueryParam("buyerID") String buyerID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{promotionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("promotionID") String promotionID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listAssignments(@QueryParam("buyerID") String buyerID,@QueryParam("promotionID") String promotionID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{promotionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@PathParam("promotionID") String promotionID,Promotion partialPromotion) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/assignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response saveAssignment(PromotionAssignment assignment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{promotionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Promotion" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@PathParam("promotionID") String promotionID,Promotion promo) {
    	return Response.ok().entity("magic!").build();
    }
}

