package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Product;
import io.swagger.model.Variant;
import io.swagger.model.ProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class ProductsApiService {
      public abstract Response create(Product product,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response delete(String productID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteAssignment(String buyerID,String productID,String userID,String userGroupID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response generateVariants(String productID,Boolean overwriteExisting,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response get(String productID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getInventory(String productID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getVariant(String productID,String variantID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getVariantInventory(String productID,String variantID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response list(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listAssignments(String productID,String buyerID,String userID,String userGroupID,String level,String priceScheduleID,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listInventory(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listVariantInventory(String productID,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listVariants(String productID,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patch(String productID,Product product,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patchVariant(String productID,String variantID,Variant variant,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response saveAssignment(ProductAssignment productAssignment,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response update(String productID,Product product,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateInventory(String productID,Integer inventory,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateVariant(String productID,String variantID,Variant variant,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateVariantInventory(String productID,String variantID,Integer inventory,SecurityContext securityContext)
      throws NotFoundException;
}
