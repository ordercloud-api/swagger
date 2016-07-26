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
  public class SpecOption {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Value
    /// </summary>
    [DataMember(Name="Value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Value")]
    public string Value { get; set; }

    /// <summary>
    /// Gets or Sets ListOrder
    /// </summary>
    [DataMember(Name="ListOrder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ListOrder")]
    public int? ListOrder { get; set; }

    /// <summary>
    /// Gets or Sets IsOpenText
    /// </summary>
    [DataMember(Name="IsOpenText", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsOpenText")]
    public bool? IsOpenText { get; set; }

    /// <summary>
    /// Gets or Sets PriceMarkupType
    /// </summary>
    [DataMember(Name="PriceMarkupType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PriceMarkupType")]
    public string PriceMarkupType { get; set; }

    /// <summary>
    /// Gets or Sets PriceMarkup
    /// </summary>
    [DataMember(Name="PriceMarkup", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PriceMarkup")]
    public double? PriceMarkup { get; set; }

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
      sb.Append("class SpecOption {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
      sb.Append("  ListOrder: ").Append(ListOrder).Append("\n");
      sb.Append("  IsOpenText: ").Append(IsOpenText).Append("\n");
      sb.Append("  PriceMarkupType: ").Append(PriceMarkupType).Append("\n");
      sb.Append("  PriceMarkup: ").Append(PriceMarkup).Append("\n");
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
