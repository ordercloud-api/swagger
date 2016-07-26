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
  public class SpendingAccount {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="Name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Balance
    /// </summary>
    [DataMember(Name="Balance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Balance")]
    public double? Balance { get; set; }

    /// <summary>
    /// Gets or Sets AllowAsPaymentMethod
    /// </summary>
    [DataMember(Name="AllowAsPaymentMethod", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AllowAsPaymentMethod")]
    public bool? AllowAsPaymentMethod { get; set; }

    /// <summary>
    /// Gets or Sets RedemptionCode
    /// </summary>
    [DataMember(Name="RedemptionCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "RedemptionCode")]
    public string RedemptionCode { get; set; }

    /// <summary>
    /// Gets or Sets StartDate
    /// </summary>
    [DataMember(Name="StartDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "StartDate")]
    public DateTime? StartDate { get; set; }

    /// <summary>
    /// Gets or Sets EndDate
    /// </summary>
    [DataMember(Name="EndDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "EndDate")]
    public DateTime? EndDate { get; set; }

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
      sb.Append("class SpendingAccount {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Balance: ").Append(Balance).Append("\n");
      sb.Append("  AllowAsPaymentMethod: ").Append(AllowAsPaymentMethod).Append("\n");
      sb.Append("  RedemptionCode: ").Append(RedemptionCode).Append("\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  EndDate: ").Append(EndDate).Append("\n");
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
