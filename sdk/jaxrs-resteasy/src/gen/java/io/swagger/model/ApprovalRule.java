package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class ApprovalRule   {
  
  private String ID = null;
  private String name = null;
  private String description = null;
  private String approvingGroupID = null;
  private String ruleExpression = null;
  private String scope = null;
  private String scopeTimeUnit = null;
  private Integer scopeTimeNumber = null;
  private Date scopeStartDate = null;
  private String expireAfterTimeUnit = null;
  private Integer expireAfterNumber = null;
  private Boolean approveOnExpire = null;
  private Object xp = null;

  /**
   **/
  
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @JsonProperty("ApprovingGroupID")
  public String getApprovingGroupID() {
    return approvingGroupID;
  }
  public void setApprovingGroupID(String approvingGroupID) {
    this.approvingGroupID = approvingGroupID;
  }

  /**
   **/
  
  @JsonProperty("RuleExpression")
  public String getRuleExpression() {
    return ruleExpression;
  }
  public void setRuleExpression(String ruleExpression) {
    this.ruleExpression = ruleExpression;
  }

  /**
   **/
  
  @JsonProperty("Scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   **/
  
  @JsonProperty("ScopeTimeUnit")
  public String getScopeTimeUnit() {
    return scopeTimeUnit;
  }
  public void setScopeTimeUnit(String scopeTimeUnit) {
    this.scopeTimeUnit = scopeTimeUnit;
  }

  /**
   **/
  
  @JsonProperty("ScopeTimeNumber")
  public Integer getScopeTimeNumber() {
    return scopeTimeNumber;
  }
  public void setScopeTimeNumber(Integer scopeTimeNumber) {
    this.scopeTimeNumber = scopeTimeNumber;
  }

  /**
   **/
  
  @JsonProperty("ScopeStartDate")
  public Date getScopeStartDate() {
    return scopeStartDate;
  }
  public void setScopeStartDate(Date scopeStartDate) {
    this.scopeStartDate = scopeStartDate;
  }

  /**
   **/
  
  @JsonProperty("ExpireAfterTimeUnit")
  public String getExpireAfterTimeUnit() {
    return expireAfterTimeUnit;
  }
  public void setExpireAfterTimeUnit(String expireAfterTimeUnit) {
    this.expireAfterTimeUnit = expireAfterTimeUnit;
  }

  /**
   **/
  
  @JsonProperty("ExpireAfterNumber")
  public Integer getExpireAfterNumber() {
    return expireAfterNumber;
  }
  public void setExpireAfterNumber(Integer expireAfterNumber) {
    this.expireAfterNumber = expireAfterNumber;
  }

  /**
   **/
  
  @JsonProperty("ApproveOnExpire")
  public Boolean getApproveOnExpire() {
    return approveOnExpire;
  }
  public void setApproveOnExpire(Boolean approveOnExpire) {
    this.approveOnExpire = approveOnExpire;
  }

  /**
   **/
  
  @JsonProperty("xp")
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRule approvalRule = (ApprovalRule) o;
    return Objects.equals(ID, approvalRule.ID) &&
        Objects.equals(name, approvalRule.name) &&
        Objects.equals(description, approvalRule.description) &&
        Objects.equals(approvingGroupID, approvalRule.approvingGroupID) &&
        Objects.equals(ruleExpression, approvalRule.ruleExpression) &&
        Objects.equals(scope, approvalRule.scope) &&
        Objects.equals(scopeTimeUnit, approvalRule.scopeTimeUnit) &&
        Objects.equals(scopeTimeNumber, approvalRule.scopeTimeNumber) &&
        Objects.equals(scopeStartDate, approvalRule.scopeStartDate) &&
        Objects.equals(expireAfterTimeUnit, approvalRule.expireAfterTimeUnit) &&
        Objects.equals(expireAfterNumber, approvalRule.expireAfterNumber) &&
        Objects.equals(approveOnExpire, approvalRule.approveOnExpire) &&
        Objects.equals(xp, approvalRule.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, description, approvingGroupID, ruleExpression, scope, scopeTimeUnit, scopeTimeNumber, scopeStartDate, expireAfterTimeUnit, expireAfterNumber, approveOnExpire, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRule {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    approvingGroupID: ").append(toIndentedString(approvingGroupID)).append("\n");
    sb.append("    ruleExpression: ").append(toIndentedString(ruleExpression)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeTimeUnit: ").append(toIndentedString(scopeTimeUnit)).append("\n");
    sb.append("    scopeTimeNumber: ").append(toIndentedString(scopeTimeNumber)).append("\n");
    sb.append("    scopeStartDate: ").append(toIndentedString(scopeStartDate)).append("\n");
    sb.append("    expireAfterTimeUnit: ").append(toIndentedString(expireAfterTimeUnit)).append("\n");
    sb.append("    expireAfterNumber: ").append(toIndentedString(expireAfterNumber)).append("\n");
    sb.append("    approveOnExpire: ").append(toIndentedString(approveOnExpire)).append("\n");
    sb.append("    xp: ").append(toIndentedString(xp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

