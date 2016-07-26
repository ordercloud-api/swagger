package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Promotion;
import io.swagger.model.PromotionAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class PromotionsApiService {
      public abstract Response create(Promotion promo,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response delete(String promotionID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteAssignment(String promotionID,String buyerID,String userID,String userGroupID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response get(String promotionID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response list(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listAssignments(String buyerID,String promotionID,String userID,String userGroupID,String level,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patch(String promotionID,Promotion partialPromotion,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response saveAssignment(PromotionAssignment assignment,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response update(String promotionID,Promotion promo,SecurityContext securityContext)
      throws NotFoundException;
}
