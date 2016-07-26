package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class BuyerAddress   {
  
  private Boolean shipping = null;
  private Boolean billing = null;
  private String companyName = null;
  private String firstName = null;
  private String lastName = null;
  private String street1 = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String country = null;
  private String phone = null;
  private String addressName = null;
  private Object xp = null;

  /**
   **/
  public BuyerAddress shipping(Boolean shipping) {
    this.shipping = shipping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Shipping")
  public Boolean getShipping() {
    return shipping;
  }
  public void setShipping(Boolean shipping) {
    this.shipping = shipping;
  }

  /**
   **/
  public BuyerAddress billing(Boolean billing) {
    this.billing = billing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Billing")
  public Boolean getBilling() {
    return billing;
  }
  public void setBilling(Boolean billing) {
    this.billing = billing;
  }

  /**
   **/
  public BuyerAddress companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CompanyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   **/
  public BuyerAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public BuyerAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  public BuyerAddress street1(String street1) {
    this.street1 = street1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  /**
   **/
  public BuyerAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  /**
   **/
  public BuyerAddress city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("City")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public BuyerAddress state(String state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("State")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  public BuyerAddress zip(String zip) {
    this.zip = zip;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   **/
  public BuyerAddress country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public BuyerAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  public BuyerAddress addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AddressName")
  public String getAddressName() {
    return addressName;
  }
  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  /**
   **/
  public BuyerAddress xp(Object xp) {
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
    BuyerAddress buyerAddress = (BuyerAddress) o;
    return Objects.equals(shipping, buyerAddress.shipping) &&
        Objects.equals(billing, buyerAddress.billing) &&
        Objects.equals(companyName, buyerAddress.companyName) &&
        Objects.equals(firstName, buyerAddress.firstName) &&
        Objects.equals(lastName, buyerAddress.lastName) &&
        Objects.equals(street1, buyerAddress.street1) &&
        Objects.equals(street2, buyerAddress.street2) &&
        Objects.equals(city, buyerAddress.city) &&
        Objects.equals(state, buyerAddress.state) &&
        Objects.equals(zip, buyerAddress.zip) &&
        Objects.equals(country, buyerAddress.country) &&
        Objects.equals(phone, buyerAddress.phone) &&
        Objects.equals(addressName, buyerAddress.addressName) &&
        Objects.equals(xp, buyerAddress.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, billing, companyName, firstName, lastName, street1, street2, city, state, zip, country, phone, addressName, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerAddress {\n");
    
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
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

