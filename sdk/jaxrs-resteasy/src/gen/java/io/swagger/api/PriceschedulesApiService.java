package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.PriceSchedule;
import io.swagger.model.PriceBreak;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class PriceschedulesApiService {
      public abstract Response create(PriceSchedule priceSchedule,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response delete(String priceScheduleID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deletePriceBreak(String priceScheduleID,Integer quantity,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response get(String priceScheduleID,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response list(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response patch(String priceScheduleID,PriceSchedule priceSchedule,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response savePriceBreak(String priceScheduleID,PriceBreak priceBreak,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response update(String priceScheduleID,PriceSchedule priceSchedule,SecurityContext securityContext)
      throws NotFoundException;
}
