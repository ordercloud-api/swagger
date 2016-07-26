package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class Promotion {

    String ID = null

    String code = null

    String name = null

    Integer usagesRemaining = null

    String description = null

    String finePrint = null

    Date startDate = null

    Date expirationDate = null

    String eligibleExpression = null

    String valueExpression = null

    Boolean canCombine = null

    Object xp = null
  

}

