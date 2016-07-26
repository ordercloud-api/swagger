package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

public class ApprovalRule   {
  
  private String ID = null;
  private String name = null;
  private String description = null;
  private String approvingGroupID = null;
  private String ruleExpression = null;
  private String scope = null;
  private String scopeTimeUnit = null;
  private Integer scopeTimeNumber = null;
  private LocalDate scopeStartDate = null;
  private String expireAfterTimeUnit = null;
  private Integer expireAfterNumber = null;
  private Boolean approveOnExpire = null;
  private Object xp = null;

  /**
   **/
  public ApprovalRule ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public ApprovalRule name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ApprovalRule description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ApprovalRule approvingGroupID(String approvingGroupID) {
    this.approvingGroupID = approvingGroupID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ApprovingGroupID")
  public String getApprovingGroupID() {
    return approvingGroupID;
  }
  public void setApprovingGroupID(String approvingGroupID) {
    this.approvingGroupID = approvingGroupID;
  }

  /**
   **/
  public ApprovalRule ruleExpression(String ruleExpression) {
    this.ruleExpression = ruleExpression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("RuleExpression")
  public String getRuleExpression() {
    return ruleExpression;
  }
  public void setRuleExpression(String ruleExpression) {
    this.ruleExpression = ruleExpression;
  }

  /**
   **/
  public ApprovalRule scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   **/
  public ApprovalRule scopeTimeUnit(String scopeTimeUnit) {
    this.scopeTimeUnit = scopeTimeUnit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ScopeTimeUnit")
  public String getScopeTimeUnit() {
    return scopeTimeUnit;
  }
  public void setScopeTimeUnit(String scopeTimeUnit) {
    this.scopeTimeUnit = scopeTimeUnit;
  }

  /**
   **/
  public ApprovalRule scopeTimeNumber(Integer scopeTimeNumber) {
    this.scopeTimeNumber = scopeTimeNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ScopeTimeNumber")
  public Integer getScopeTimeNumber() {
    return scopeTimeNumber;
  }
  public void setScopeTimeNumber(Integer scopeTimeNumber) {
    this.scopeTimeNumber = scopeTimeNumber;
  }

  /**
   **/
  public ApprovalRule scopeStartDate(LocalDate scopeStartDate) {
    this.scopeStartDate = scopeStartDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ScopeStartDate")
  public LocalDate getScopeStartDate() {
    return scopeStartDate;
  }
  public void setScopeStartDate(LocalDate scopeStartDate) {
    this.scopeStartDate = scopeStartDate;
  }

  /**
   **/
  public ApprovalRule expireAfterTimeUnit(String expireAfterTimeUnit) {
    this.expireAfterTimeUnit = expireAfterTimeUnit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ExpireAfterTimeUnit")
  public String getExpireAfterTimeUnit() {
    return expireAfterTimeUnit;
  }
  public void setExpireAfterTimeUnit(String expireAfterTimeUnit) {
    this.expireAfterTimeUnit = expireAfterTimeUnit;
  }

  /**
   **/
  public ApprovalRule expireAfterNumber(Integer expireAfterNumber) {
    this.expireAfterNumber = expireAfterNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ExpireAfterNumber")
  public Integer getExpireAfterNumber() {
    return expireAfterNumber;
  }
  public void setExpireAfterNumber(Integer expireAfterNumber) {
    this.expireAfterNumber = expireAfterNumber;
  }

  /**
   **/
  public ApprovalRule approveOnExpire(Boolean approveOnExpire) {
    this.approveOnExpire = approveOnExpire;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ApproveOnExpire")
  public Boolean getApproveOnExpire() {
    return approveOnExpire;
  }
  public void setApproveOnExpire(Boolean approveOnExpire) {
    this.approveOnExpire = approveOnExpire;
  }

  /**
   **/
  public ApprovalRule xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

