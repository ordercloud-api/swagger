package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ShipmentItem;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
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
  @JsonProperty("ClientID")
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
  @JsonProperty("Claims")
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

