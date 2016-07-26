package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

public class Partial1   {
  
  private String ID = null;
  private String username = null;
  private String password = null;
  private String firstName = null;
  private String lastName = null;
  private String email = null;
  private String phone = null;
  private LocalDate termsAccepted = null;
  private Boolean active = null;
  private Object xp = null;
  private String securityProfileID = null;

  /**
   **/
  public Partial1 ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public Partial1 username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public Partial1 password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  public Partial1 firstName(String firstName) {
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
  public Partial1 lastName(String lastName) {
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
  public Partial1 email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public Partial1 phone(String phone) {
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
  public Partial1 termsAccepted(LocalDate termsAccepted) {
    this.termsAccepted = termsAccepted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TermsAccepted")
  public LocalDate getTermsAccepted() {
    return termsAccepted;
  }
  public void setTermsAccepted(LocalDate termsAccepted) {
    this.termsAccepted = termsAccepted;
  }

  /**
   **/
  public Partial1 active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  public Partial1 xp(Object xp) {
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

  /**
   **/
  public Partial1 securityProfileID(String securityProfileID) {
    this.securityProfileID = securityProfileID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SecurityProfileID")
  public String getSecurityProfileID() {
    return securityProfileID;
  }
  public void setSecurityProfileID(String securityProfileID) {
    this.securityProfileID = securityProfileID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partial1 partial1 = (Partial1) o;
    return Objects.equals(ID, partial1.ID) &&
        Objects.equals(username, partial1.username) &&
        Objects.equals(password, partial1.password) &&
        Objects.equals(firstName, partial1.firstName) &&
        Objects.equals(lastName, partial1.lastName) &&
        Objects.equals(email, partial1.email) &&
        Objects.equals(phone, partial1.phone) &&
        Objects.equals(termsAccepted, partial1.termsAccepted) &&
        Objects.equals(active, partial1.active) &&
        Objects.equals(xp, partial1.xp) &&
        Objects.equals(securityProfileID, partial1.securityProfileID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, username, password, firstName, lastName, email, phone, termsAccepted, active, xp, securityProfileID);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

