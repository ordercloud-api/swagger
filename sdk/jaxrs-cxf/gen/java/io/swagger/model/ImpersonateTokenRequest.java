package io.swagger.model;

import io.swagger.model.ShipmentItem;
import java.util.ArrayList;
import java.util.List;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ImpersonateTokenRequest", propOrder =
	{ "clientID", "claims"
})

@XmlRootElement(name="ImpersonateTokenRequest")
public class ImpersonateTokenRequest  {
  

  @XmlElement(name="ClientID")
  private String clientID = null;

  @XmlElement(name="Claims")
  private List<ShipmentItem> claims = new ArrayList<ShipmentItem>();

  /**
   **/
  
  public String getClientID() {
    return clientID;
  }
  public void setClientID(String clientID) {
    this.clientID = clientID;
  }
  /**
   **/
  
  public List<ShipmentItem> getClaims() {
    return claims;
  }
  public void setClaims(List<ShipmentItem> claims) {
    this.claims = claims;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

