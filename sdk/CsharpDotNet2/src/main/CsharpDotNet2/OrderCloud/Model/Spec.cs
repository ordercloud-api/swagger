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
  public class Spec {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets ListOrder
    /// </summary>
    [DataMember(Name="ListOrder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ListOrder")]
    public int? ListOrder { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="Name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets DefaultValue
    /// </summary>
    [DataMember(Name="DefaultValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DefaultValue")]
    public string DefaultValue { get; set; }

    /// <summary>
    /// Gets or Sets Required
    /// </summary>
    [DataMember(Name="Required", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Required")]
    public bool? Required { get; set; }

    /// <summary>
    /// Gets or Sets AllowOpenText
    /// </summary>
    [DataMember(Name="AllowOpenText", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AllowOpenText")]
    public bool? AllowOpenText { get; set; }

    /// <summary>
    /// Gets or Sets DefaultOptionID
    /// </summary>
    [DataMember(Name="DefaultOptionID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DefaultOptionID")]
    public string DefaultOptionID { get; set; }

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
      sb.Append("class Spec {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  ListOrder: ").Append(ListOrder).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  DefaultValue: ").Append(DefaultValue).Append("\n");
      sb.Append("  Required: ").Append(Required).Append("\n");
      sb.Append("  AllowOpenText: ").Append(AllowOpenText).Append("\n");
      sb.Append("  DefaultOptionID: ").Append(DefaultOptionID).Append("\n");
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
