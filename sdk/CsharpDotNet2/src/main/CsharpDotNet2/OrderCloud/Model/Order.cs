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
  public class Order {
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
    /// Gets or Sets FromUserID
    /// </summary>
    [DataMember(Name="FromUserID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FromUserID")]
    public string FromUserID { get; set; }

    /// <summary>
    /// Gets or Sets BillingAddressID
    /// </summary>
    [DataMember(Name="BillingAddressID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "BillingAddressID")]
    public string BillingAddressID { get; set; }

    /// <summary>
    /// Gets or Sets ShippingAddressID
    /// </summary>
    [DataMember(Name="ShippingAddressID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShippingAddressID")]
    public string ShippingAddressID { get; set; }

    /// <summary>
    /// Gets or Sets Comments
    /// </summary>
    [DataMember(Name="Comments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Comments")]
    public string Comments { get; set; }

    /// <summary>
    /// Gets or Sets ShippingCost
    /// </summary>
    [DataMember(Name="ShippingCost", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShippingCost")]
    public double? ShippingCost { get; set; }

    /// <summary>
    /// Gets or Sets TaxCost
    /// </summary>
    [DataMember(Name="TaxCost", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "TaxCost")]
    public double? TaxCost { get; set; }

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
      sb.Append("class Order {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  FromUserID: ").Append(FromUserID).Append("\n");
      sb.Append("  BillingAddressID: ").Append(BillingAddressID).Append("\n");
      sb.Append("  ShippingAddressID: ").Append(ShippingAddressID).Append("\n");
      sb.Append("  Comments: ").Append(Comments).Append("\n");
      sb.Append("  ShippingCost: ").Append(ShippingCost).Append("\n");
      sb.Append("  TaxCost: ").Append(TaxCost).Append("\n");
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
