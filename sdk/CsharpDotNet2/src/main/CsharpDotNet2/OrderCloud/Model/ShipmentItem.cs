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
  public class ShipmentItem {
    /// <summary>
    /// Gets or Sets OrderID
    /// </summary>
    [DataMember(Name="OrderID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "OrderID")]
    public string OrderID { get; set; }

    /// <summary>
    /// Gets or Sets LineItemID
    /// </summary>
    [DataMember(Name="LineItemID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "LineItemID")]
    public string LineItemID { get; set; }

    /// <summary>
    /// Gets or Sets QuantityShipped
    /// </summary>
    [DataMember(Name="QuantityShipped", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "QuantityShipped")]
    public int? QuantityShipped { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ShipmentItem {\n");
      sb.Append("  OrderID: ").Append(OrderID).Append("\n");
      sb.Append("  LineItemID: ").Append(LineItemID).Append("\n");
      sb.Append("  QuantityShipped: ").Append(QuantityShipped).Append("\n");
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
