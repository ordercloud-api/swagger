package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class ApprovalRule {

    String ID = null

    String name = null

    String description = null

    String approvingGroupID = null

    String ruleExpression = null

    String scope = null

    String scopeTimeUnit = null

    Integer scopeTimeNumber = null

    Date scopeStartDate = null

    String expireAfterTimeUnit = null

    Integer expireAfterNumber = null

    Boolean approveOnExpire = null

    Object xp = null
  

}

