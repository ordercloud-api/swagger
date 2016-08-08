/**
 * OrderCloud
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.client.model.ShipmentItem;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ImpersonateTokenRequest  {
  
  @SerializedName("ClientID")
  private String clientID = null;
  @SerializedName("Claims")
  private List<ShipmentItem> claims = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientID() {
    return clientID;
  }
  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (clientID == null ? impersonateTokenRequest.clientID == null : clientID.equals(impersonateTokenRequest.clientID)) &&
        (claims == null ? impersonateTokenRequest.claims == null : claims.equals(impersonateTokenRequest.claims));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (clientID == null ? 0: clientID.hashCode());
    result = 31 * result + (claims == null ? 0: claims.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonateTokenRequest {\n");
    
    sb.append("  clientID: ").append(clientID).append("\n");
    sb.append("  claims: ").append(claims).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}