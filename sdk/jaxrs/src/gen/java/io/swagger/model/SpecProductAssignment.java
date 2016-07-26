package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class SpecProductAssignment   {
  
  private String specID = null;
  private String productID = null;
  private Boolean definesVariant = null;

  /**
   **/
  public SpecProductAssignment specID(String specID) {
    this.specID = specID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SpecID")
  public String getSpecID() {
    return specID;
  }
  public void setSpecID(String specID) {
    this.specID = specID;
  }

  /**
   **/
  public SpecProductAssignment productID(String productID) {
    this.productID = productID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ProductID")
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }

  /**
   **/
  public SpecProductAssignment definesVariant(Boolean definesVariant) {
    this.definesVariant = definesVariant;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DefinesVariant")
  public Boolean getDefinesVariant() {
    return definesVariant;
  }
  public void setDefinesVariant(Boolean definesVariant) {
    this.definesVariant = definesVariant;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecProductAssignment specProductAssignment = (SpecProductAssignment) o;
    return Objects.equals(specID, specProductAssignment.specID) &&
        Objects.equals(productID, specProductAssignment.productID) &&
        Objects.equals(definesVariant, specProductAssignment.definesVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specID, productID, definesVariant);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

