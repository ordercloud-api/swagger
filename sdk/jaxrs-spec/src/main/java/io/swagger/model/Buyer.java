package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Buyer   {
  
  private String ID = null;
  private String name = null;
  private Boolean active = null;
  private Object xp = null;

  /**
   **/
  public Buyer ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public Buyer name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Buyer active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  public Buyer xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
    Buyer buyer = (Buyer) o;
    return Objects.equals(ID, buyer.ID) &&
        Objects.equals(name, buyer.name) &&
        Objects.equals(active, buyer.active) &&
        Objects.equals(xp, buyer.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, active, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buyer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
