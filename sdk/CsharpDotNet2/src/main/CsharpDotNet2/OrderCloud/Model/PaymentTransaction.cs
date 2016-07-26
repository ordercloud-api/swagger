using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace OrderCloud.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class PaymentTransaction {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="Type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Type")]
    public string Type { get; set; }

    /// <summary>
    /// Gets or Sets DateExecuted
    /// </summary>
    [DataMember(Name="DateExecuted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DateExecuted")]
    public DateTime? DateExecuted { get; set; }

    /// <summary>
    /// Gets or Sets Amount
    /// </summary>
    [DataMember(Name="Amount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Amount")]
    public double? Amount { get; set; }

    /// <summary>
    /// Gets or Sets Succeeded
    /// </summary>
    [DataMember(Name="Succeeded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Succeeded")]
    public bool? Succeeded { get; set; }

    /// <summary>
    /// Gets or Sets ResultCode
    /// </summary>
    [DataMember(Name="ResultCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ResultCode")]
    public string ResultCode { get; set; }

    /// <summary>
    /// Gets or Sets ResultMessage
    /// </summary>
    [DataMember(Name="ResultMessage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ResultMessage")]
    public string ResultMessage { get; set; }

    /// <summary>
    /// Gets or Sets Xp
    /// </summary>
    [DataMember(Name="xp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xp")]
    public Object Xp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PaymentTransaction {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  DateExecuted: ").Append(DateExecuted).Append("\n");
      sb.Append("  Amount: ").Append(Amount).Append("\n");
      sb.Append("  Succeeded: ").Append(Succeeded).Append("\n");
      sb.Append("  ResultCode: ").Append(ResultCode).Append("\n");
      sb.Append("  ResultMessage: ").Append(ResultMessage).Append("\n");
      sb.Append("  Xp: ").Append(Xp).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
