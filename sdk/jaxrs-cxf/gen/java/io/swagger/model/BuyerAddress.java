package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "BuyerAddress", propOrder =
	{ "shipping", "billing", "companyName", "firstName", "lastName", "street1", "street2", "city", "state", "zip", "country", "phone", "addressName", "xp"
})

@XmlRootElement(name="BuyerAddress")
public class BuyerAddress  {
  

  @XmlElement(name="Shipping")
  private Boolean shipping = null;

  @XmlElement(name="Billing")
  private Boolean billing = null;

  @XmlElement(name="CompanyName")
  private String companyName = null;

  @XmlElement(name="FirstName")
  private String firstName = null;

  @XmlElement(name="LastName")
  private String lastName = null;

  @XmlElement(name="Street1")
  private String street1 = null;

  @XmlElement(name="Street2")
  private String street2 = null;

  @XmlElement(name="City")
  private String city = null;

  @XmlElement(name="State")
  private String state = null;

  @XmlElement(name="Zip")
  private String zip = null;

  @XmlElement(name="Country")
  private String country = null;

  @XmlElement(name="Phone")
  private String phone = null;

  @XmlElement(name="AddressName")
  private String addressName = null;

  @XmlElement(name="xp")
  private Object xp = null;

  /**
   **/
  
  public Boolean getShipping() {
    return shipping;
  }
  public void setShipping(Boolean shipping) {
    this.shipping = shipping;
  }
  /**
   **/
  
  public Boolean getBilling() {
    return billing;
  }
  public void setBilling(Boolean billing) {
    this.billing = billing;
  }
  /**
   **/
  
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
  /**
   **/
  
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  /**
   **/
  
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  /**
   **/
  
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }
  /**
   **/
  
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }
  /**
   **/
  
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  /**
   **/
  
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  /**
   **/
  
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  /**
   **/
  
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  /**
   **/
  
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   **/
  
  public String getAddressName() {
    return addressName;
  }
  public void setAddressName(String addressName) {
    this.addressName = addressName;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

