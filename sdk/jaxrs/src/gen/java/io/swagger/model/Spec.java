package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class Spec   {
  
  private String ID = null;
  private Integer listOrder = null;
  private String name = null;
  private String defaultValue = null;
  private Boolean required = null;
  private Boolean allowOpenText = null;
  private String defaultOptionID = null;
  private Object xp = null;

  /**
   **/
  public Spec ID(String ID) {
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
  public Spec listOrder(Integer listOrder) {
    this.listOrder = listOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ListOrder")
  public Integer getListOrder() {
    return listOrder;
  }
  public void setListOrder(Integer listOrder) {
    this.listOrder = listOrder;
  }

  /**
   **/
  public Spec name(String name) {
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
  public Spec defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DefaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   **/
  public Spec required(Boolean required) {
    this.required = required;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  public Spec allowOpenText(Boolean allowOpenText) {
    this.allowOpenText = allowOpenText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AllowOpenText")
  public Boolean getAllowOpenText() {
    return allowOpenText;
  }
  public void setAllowOpenText(Boolean allowOpenText) {
    this.allowOpenText = allowOpenText;
  }

  /**
   **/
  public Spec defaultOptionID(String defaultOptionID) {
    this.defaultOptionID = defaultOptionID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DefaultOptionID")
  public String getDefaultOptionID() {
    return defaultOptionID;
  }
  public void setDefaultOptionID(String defaultOptionID) {
    this.defaultOptionID = defaultOptionID;
  }

  /**
   **/
  public Spec xp(Object xp) {
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
    Spec spec = (Spec) o;
    return Objects.equals(ID, spec.ID) &&
        Objects.equals(listOrder, spec.listOrder) &&
        Objects.equals(name, spec.name) &&
        Objects.equals(defaultValue, spec.defaultValue) &&
        Objects.equals(required, spec.required) &&
        Objects.equals(allowOpenText, spec.allowOpenText) &&
        Objects.equals(defaultOptionID, spec.defaultOptionID) &&
        Objects.equals(xp, spec.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, listOrder, name, defaultValue, required, allowOpenText, defaultOptionID, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spec {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    allowOpenText: ").append(toIndentedString(allowOpenText)).append("\n");
    sb.append("    defaultOptionID: ").append(toIndentedString(defaultOptionID)).append("\n");
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

