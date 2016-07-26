package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class SpecsApiService {
      public abstract Response create(Spec spec,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response createOption(String specID,SpecOption option,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response delete(String specID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteOption(String specID,String optionID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteProductAssignment(String specID,String productID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response get(String specID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getOption(String specID,String optionID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response list(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listOptions(String specID,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response listProductAssignments(String specID,String productID,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patch(String specID,Spec spec,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patchOption(String specID,String optionID,SpecOption option,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response saveProductAssignment(SpecProductAssignment productAssignment,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response update(String specID,Spec spec,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateOption(String specID,String optionID,SpecOption option,SecurityContext securityContext)
      throws NotFoundException;
}
