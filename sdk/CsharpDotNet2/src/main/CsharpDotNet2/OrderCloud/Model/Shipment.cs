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
  public class Shipment {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Shipper
    /// </summary>
    [DataMember(Name="Shipper", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Shipper")]
    public string Shipper { get; set; }

    /// <summary>
    /// Gets or Sets DateShipped
    /// </summary>
    [DataMember(Name="DateShipped", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DateShipped")]
    public DateTime? DateShipped { get; set; }

    /// <summary>
    /// Gets or Sets TrackingNumber
    /// </summary>
    [DataMember(Name="TrackingNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "TrackingNumber")]
    public string TrackingNumber { get; set; }

    /// <summary>
    /// Gets or Sets Cost
    /// </summary>
    [DataMember(Name="Cost", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Cost")]
    public double? Cost { get; set; }

    /// <summary>
    /// Gets or Sets Items
    /// </summary>
    [DataMember(Name="Items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Items")]
    public List<ShipmentItem> Items { get; set; }

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
      sb.Append("class Shipment {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Shipper: ").Append(Shipper).Append("\n");
      sb.Append("  DateShipped: ").Append(DateShipped).Append("\n");
      sb.Append("  TrackingNumber: ").Append(TrackingNumber).Append("\n");
      sb.Append("  Cost: ").Append(Cost).Append("\n");
      sb.Append("  Items: ").Append(Items).Append("\n");
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
