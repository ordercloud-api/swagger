package io.swagger.model;

import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ApprovalRule", propOrder =
	{ "ID", "name", "description", "approvingGroupID", "ruleExpression", "scope", "scopeTimeUnit", "scopeTimeNumber", "scopeStartDate", "expireAfterTimeUnit", "expireAfterNumber", "approveOnExpire", "xp"
})

@XmlRootElement(name="ApprovalRule")
public class ApprovalRule  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="Description")
  private String description = null;

  @XmlElement(name="ApprovingGroupID")
  private String approvingGroupID = null;

  @XmlElement(name="RuleExpression")
  private String ruleExpression = null;

  @XmlElement(name="Scope")
  private String scope = null;

  @XmlElement(name="ScopeTimeUnit")
  private String scopeTimeUnit = null;

  @XmlElement(name="ScopeTimeNumber")
  private Integer scopeTimeNumber = null;

  @XmlElement(name="ScopeStartDate")
  private LocalDate scopeStartDate = null;

  @XmlElement(name="ExpireAfterTimeUnit")
  private String expireAfterTimeUnit = null;

  @XmlElement(name="ExpireAfterNumber")
  private Integer expireAfterNumber = null;

  @XmlElement(name="ApproveOnExpire")
  private Boolean approveOnExpire = null;

  @XmlElement(name="xp")
  private Object xp = null;

  /**
   **/
  
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }
  /**
   **/
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  /**
   **/
  
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  /**
   **/
  
  public String getApprovingGroupID() {
    return approvingGroupID;
  }
  public void setApprovingGroupID(String approvingGroupID) {
    this.approvingGroupID = approvingGroupID;
  }
  /**
   **/
  
  public String getRuleExpression() {
    return ruleExpression;
  }
  public void setRuleExpression(String ruleExpression) {
    this.ruleExpression = ruleExpression;
  }
  /**
   **/
  
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }
  /**
   **/
  
  public String getScopeTimeUnit() {
    return scopeTimeUnit;
  }
  public void setScopeTimeUnit(String scopeTimeUnit) {
    this.scopeTimeUnit = scopeTimeUnit;
  }
  /**
   **/
  
  public Integer getScopeTimeNumber() {
    return scopeTimeNumber;
  }
  public void setScopeTimeNumber(Integer scopeTimeNumber) {
    this.scopeTimeNumber = scopeTimeNumber;
  }
  /**
   **/
  
  public LocalDate getScopeStartDate() {
    return scopeStartDate;
  }
  public void setScopeStartDate(LocalDate scopeStartDate) {
    this.scopeStartDate = scopeStartDate;
  }
  /**
   **/
  
  public String getExpireAfterTimeUnit() {
    return expireAfterTimeUnit;
  }
  public void setExpireAfterTimeUnit(String expireAfterTimeUnit) {
    this.expireAfterTimeUnit = expireAfterTimeUnit;
  }
  /**
   **/
  
  public Integer getExpireAfterNumber() {
    return expireAfterNumber;
  }
  public void setExpireAfterNumber(Integer expireAfterNumber) {
    this.expireAfterNumber = expireAfterNumber;
  }
  /**
   **/
  
  public Boolean getApproveOnExpire() {
    return approveOnExpire;
  }
  public void setApproveOnExpire(Boolean approveOnExpire) {
    this.approveOnExpire = approveOnExpire;
  }
  /**
   **/
  
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

