package io.swagger.model;

import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Partial1", propOrder =
	{ "ID", "username", "password", "firstName", "lastName", "email", "phone", "termsAccepted", "active", "xp", "securityProfileID"
})

@XmlRootElement(name="Partial1")
public class Partial1  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Username")
  private String username = null;

  @XmlElement(name="Password")
  private String password = null;

  @XmlElement(name="FirstName")
  private String firstName = null;

  @XmlElement(name="LastName")
  private String lastName = null;

  @XmlElement(name="Email")
  private String email = null;

  @XmlElement(name="Phone")
  private String phone = null;

  @XmlElement(name="TermsAccepted")
  private LocalDate termsAccepted = null;

  @XmlElement(name="Active")
  private Boolean active = null;

  @XmlElement(name="xp")
  private Object xp = null;

  @XmlElement(name="SecurityProfileID")
  private String securityProfileID = null;

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
  
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  /**
   **/
  
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
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
  
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  
  public LocalDate getTermsAccepted() {
    return termsAccepted;
  }
  public void setTermsAccepted(LocalDate termsAccepted) {
    this.termsAccepted = termsAccepted;
  }
  /**
   **/
  
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }
  /**
   **/
  
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }
  /**
   **/
  
  public String getSecurityProfileID() {
    return securityProfileID;
  }
  public void setSecurityProfileID(String securityProfileID) {
    this.securityProfileID = securityProfileID;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partial1 {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    termsAccepted: ").append(toIndentedString(termsAccepted)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    xp: ").append(toIndentedString(xp)).append("\n");
    sb.append("    securityProfileID: ").append(toIndentedString(securityProfileID)).append("\n");
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

