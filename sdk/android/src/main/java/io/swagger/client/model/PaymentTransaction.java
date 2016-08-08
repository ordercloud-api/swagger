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

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentTransaction  {
  
  @SerializedName("ID")
  private String ID = null;
  @SerializedName("Type")
  private String type = null;
  @SerializedName("DateExecuted")
  private Date dateExecuted = null;
  @SerializedName("Amount")
  private BigDecimal amount = null;
  @SerializedName("Succeeded")
  private Boolean succeeded = null;
  @SerializedName("ResultCode")
  private String resultCode = null;
  @SerializedName("ResultMessage")
  private String resultMessage = null;
  @SerializedName("xp")
  private Object xp = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDateExecuted() {
    return dateExecuted;
  }
  public void setDateExecuted(Date dateExecuted) {
    this.dateExecuted = dateExecuted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResultCode() {
    return resultCode;
  }
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResultMessage() {
    return resultMessage;
  }
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    PaymentTransaction paymentTransaction = (PaymentTransaction) o;
    return (ID == null ? paymentTransaction.ID == null : ID.equals(paymentTransaction.ID)) &&
        (type == null ? paymentTransaction.type == null : type.equals(paymentTransaction.type)) &&
        (dateExecuted == null ? paymentTransaction.dateExecuted == null : dateExecuted.equals(paymentTransaction.dateExecuted)) &&
        (amount == null ? paymentTransaction.amount == null : amount.equals(paymentTransaction.amount)) &&
        (succeeded == null ? paymentTransaction.succeeded == null : succeeded.equals(paymentTransaction.succeeded)) &&
        (resultCode == null ? paymentTransaction.resultCode == null : resultCode.equals(paymentTransaction.resultCode)) &&
        (resultMessage == null ? paymentTransaction.resultMessage == null : resultMessage.equals(paymentTransaction.resultMessage)) &&
        (xp == null ? paymentTransaction.xp == null : xp.equals(paymentTransaction.xp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (ID == null ? 0: ID.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    result = 31 * result + (dateExecuted == null ? 0: dateExecuted.hashCode());
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (succeeded == null ? 0: succeeded.hashCode());
    result = 31 * result + (resultCode == null ? 0: resultCode.hashCode());
    result = 31 * result + (resultMessage == null ? 0: resultMessage.hashCode());
    result = 31 * result + (xp == null ? 0: xp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction {\n");
    
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  dateExecuted: ").append(dateExecuted).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  succeeded: ").append(succeeded).append("\n");
    sb.append("  resultCode: ").append(resultCode).append("\n");
    sb.append("  resultMessage: ").append(resultMessage).append("\n");
    sb.append("  xp: ").append(xp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}