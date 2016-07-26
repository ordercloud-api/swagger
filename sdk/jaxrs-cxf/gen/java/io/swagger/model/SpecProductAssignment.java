package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SpecProductAssignment", propOrder =
	{ "specID", "productID", "definesVariant"
})

@XmlRootElement(name="SpecProductAssignment")
public class SpecProductAssignment  {
  

  @XmlElement(name="SpecID")
  private String specID = null;

  @XmlElement(name="ProductID")
  private String productID = null;

  @XmlElement(name="DefinesVariant")
  private Boolean definesVariant = null;

  /**
   **/
  
  public String getSpecID() {
    return specID;
  }
  public void setSpecID(String specID) {
    this.specID = specID;
  }
  /**
   **/
  
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }
  /**
   **/
  
  public Boolean getDefinesVariant() {
    return definesVariant;
  }
  public void setDefinesVariant(Boolean definesVariant) {
    this.definesVariant = definesVariant;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecProductAssignment {\n");
    
    sb.append("    specID: ").append(toIndentedString(specID)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    definesVariant: ").append(toIndentedString(definesVariant)).append("\n");
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

