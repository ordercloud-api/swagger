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
  public class PriceSchedule {
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
    /// Gets or Sets ApplyTax
    /// </summary>
    [DataMember(Name="ApplyTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ApplyTax")]
    public bool? ApplyTax { get; set; }

    /// <summary>
    /// Gets or Sets ApplyShipping
    /// </summary>
    [DataMember(Name="ApplyShipping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ApplyShipping")]
    public bool? ApplyShipping { get; set; }

    /// <summary>
    /// Gets or Sets MaxQuantity
    /// </summary>
    [DataMember(Name="MaxQuantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MaxQuantity")]
    public int? MaxQuantity { get; set; }

    /// <summary>
    /// Gets or Sets UseCumulativeQuantity
    /// </summary>
    [DataMember(Name="UseCumulativeQuantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UseCumulativeQuantity")]
    public bool? UseCumulativeQuantity { get; set; }

    /// <summary>
    /// Gets or Sets RestrictedQuantity
    /// </summary>
    [DataMember(Name="RestrictedQuantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "RestrictedQuantity")]
    public bool? RestrictedQuantity { get; set; }

    /// <summary>
    /// Gets or Sets OrderType
    /// </summary>
    [DataMember(Name="OrderType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "OrderType")]
    public string OrderType { get; set; }

    /// <summary>
    /// Gets or Sets PriceBreaks
    /// </summary>
    [DataMember(Name="PriceBreaks", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PriceBreaks")]
    public List<ShipmentItem> PriceBreaks { get; set; }

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
      sb.Append("class PriceSchedule {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ApplyTax: ").Append(ApplyTax).Append("\n");
      sb.Append("  ApplyShipping: ").Append(ApplyShipping).Append("\n");
      sb.Append("  MaxQuantity: ").Append(MaxQuantity).Append("\n");
      sb.Append("  UseCumulativeQuantity: ").Append(UseCumulativeQuantity).Append("\n");
      sb.Append("  RestrictedQuantity: ").Append(RestrictedQuantity).Append("\n");
      sb.Append("  OrderType: ").Append(OrderType).Append("\n");
      sb.Append("  PriceBreaks: ").Append(PriceBreaks).Append("\n");
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
