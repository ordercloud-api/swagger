package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PromotionsApiService;
import io.swagger.api.factories.PromotionsApiServiceFactory;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/promotions")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PromotionsApi  {
   private final PromotionsApiService delegate = PromotionsApiServiceFactory.getPromotionsApi();

    @POST
    
    
    
    public Response create( Promotion promo,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(promo,securityContext);
    }
    @DELETE
    @Path("/{promotionID}")
    
    
    public Response delete( @PathParam("promotionID") String promotionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(promotionID,securityContext);
    }
    @DELETE
    @Path("/{promotionID}/assignments")
    
    
    public Response deleteAssignment( @PathParam("promotionID") String promotionID, @QueryParam("buyerID") String buyerID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAssignment(promotionID,buyerID,userID,userGroupID,securityContext);
    }
    @GET
    @Path("/{promotionID}")
    
    
    public Response get( @PathParam("promotionID") String promotionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(promotionID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/assignments")
    
    
    public Response listAssignments( @QueryParam("buyerID") String buyerID, @QueryParam("promotionID") String promotionID, @QueryParam("userID") String userID, @QueryParam("userGroupID") String userGroupID, @QueryParam("level") String level, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAssignments(buyerID,promotionID,userID,userGroupID,level,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{promotionID}")
    
    
    public Response patch( @PathParam("promotionID") String promotionID, Promotion partialPromotion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(promotionID,partialPromotion,securityContext);
    }
    @POST
    @Path("/assignments")
    
    
    public Response saveAssignment( PromotionAssignment assignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveAssignment(assignment,securityContext);
    }
    @PUT
    @Path("/{promotionID}")
    
    
    public Response update( @PathParam("promotionID") String promotionID, Promotion promo,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(promotionID,promo,securityContext);
    }
}
