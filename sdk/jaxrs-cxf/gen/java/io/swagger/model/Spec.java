package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Spec", propOrder =
	{ "ID", "listOrder", "name", "defaultValue", "required", "allowOpenText", "defaultOptionID", "xp"
})

@XmlRootElement(name="Spec")
public class Spec  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="ListOrder")
  private Integer listOrder = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="DefaultValue")
  private String defaultValue = null;

  @XmlElement(name="Required")
  private Boolean required = null;

  @XmlElement(name="AllowOpenText")
  private Boolean allowOpenText = null;

  @XmlElement(name="DefaultOptionID")
  private String defaultOptionID = null;

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
  
  public Integer getListOrder() {
    return listOrder;
  }
  public void setListOrder(Integer listOrder) {
    this.listOrder = listOrder;
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
  
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  /**
   **/
  
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }
  /**
   **/
  
  public Boolean getAllowOpenText() {
    return allowOpenText;
  }
  public void setAllowOpenText(Boolean allowOpenText) {
    this.allowOpenText = allowOpenText;
  }
  /**
   **/
  
  public String getDefaultOptionID() {
    return defaultOptionID;
  }
  public void setDefaultOptionID(String defaultOptionID) {
    this.defaultOptionID = defaultOptionID;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

