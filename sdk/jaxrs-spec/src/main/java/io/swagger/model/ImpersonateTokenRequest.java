package io.swagger.model;

import io.swagger.model.ShipmentItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ImpersonateTokenRequest   {
  
  private String clientID = null;
  private List<ShipmentItem> claims = new ArrayList<ShipmentItem>();

  /**
   **/
  public ImpersonateTokenRequest clientID(String clientID) {
    this.clientID = clientID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClientID() {
    return clientID;
  }
  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  /**
   **/
  public ImpersonateTokenRequest claims(List<ShipmentItem> claims) {
    this.claims = claims;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ShipmentItem> getClaims() {
    return claims;
  }
  public void setClaims(List<ShipmentItem> claims) {
    this.claims = claims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpersonateTokenRequest impersonateTokenRequest = (ImpersonateTokenRequest) o;
    return Objects.equals(clientID, impersonateTokenRequest.clientID) &&
        Objects.equals(claims, impersonateTokenRequest.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientID, claims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonateTokenRequest {\n");
    
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
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
