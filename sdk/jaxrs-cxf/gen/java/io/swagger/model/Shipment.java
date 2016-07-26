package io.swagger.model;

import io.swagger.model.ShipmentItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Shipment", propOrder =
	{ "ID", "shipper", "dateShipped", "trackingNumber", "cost", "items", "xp"
})

@XmlRootElement(name="Shipment")
public class Shipment  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Shipper")
  private String shipper = null;

  @XmlElement(name="DateShipped")
  private LocalDate dateShipped = null;

  @XmlElement(name="TrackingNumber")
  private String trackingNumber = null;

  @XmlElement(name="Cost")
  private BigDecimal cost = null;

  @XmlElement(name="Items")
  private List<ShipmentItem> items = new ArrayList<ShipmentItem>();

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
  
  public String getShipper() {
    return shipper;
  }
  public void setShipper(String shipper) {
    this.shipper = shipper;
  }
  /**
   **/
  
  public LocalDate getDateShipped() {
    return dateShipped;
  }
  public void setDateShipped(LocalDate dateShipped) {
    this.dateShipped = dateShipped;
  }
  /**
   **/
  
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }
  /**
   **/
  
  public BigDecimal getCost() {
    return cost;
  }
  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }
  /**
   **/
  
  public List<ShipmentItem> getItems() {
    return items;
  }
  public void setItems(List<ShipmentItem> items) {
    this.items = items;
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
    sb.append("class Shipment {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    dateShipped: ").append(toIndentedString(dateShipped)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

