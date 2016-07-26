package io.swagger.api;

import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface PromotionApi  {
    @POST
    @Path("/promotions")
    
    
    public Response create(Promotion promo);
    @DELETE
    @Path("/promotions/{promotionID}")
    
    
    public Response delete(@PathParam("promotionID") String promotionID);
    @DELETE
    @Path("/promotions/{promotionID}/assignments")
    
    
    public Response deleteAssignment(@PathParam("promotionID") String promotionID,@QueryParam("buyerID") String buyerID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID);
    @GET
    @Path("/promotions/{promotionID}")
    
    
    public Response get(@PathParam("promotionID") String promotionID);
    @GET
    @Path("/promotions")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/promotions/assignments")
    
    
    public Response listAssignments(@QueryParam("buyerID") String buyerID,@QueryParam("promotionID") String promotionID,@QueryParam("userID") String userID,@QueryParam("userGroupID") String userGroupID,@QueryParam("level") String level,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/promotions/{promotionID}")
    
    
    public Response patch(@PathParam("promotionID") String promotionID,Promotion partialPromotion);
    @POST
    @Path("/promotions/assignments")
    
    
    public Response saveAssignment(PromotionAssignment assignment);
    @PUT
    @Path("/promotions/{promotionID}")
    
    
    public Response update(@PathParam("promotionID") String promotionID,Promotion promo);
}

