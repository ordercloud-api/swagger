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
  public class SpecProductAssignment {
    /// <summary>
    /// Gets or Sets SpecID
    /// </summary>
    [DataMember(Name="SpecID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SpecID")]
    public string SpecID { get; set; }

    /// <summary>
    /// Gets or Sets ProductID
    /// </summary>
    [DataMember(Name="ProductID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ProductID")]
    public string ProductID { get; set; }

    /// <summary>
    /// Gets or Sets DefinesVariant
    /// </summary>
    [DataMember(Name="DefinesVariant", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DefinesVariant")]
    public bool? DefinesVariant { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SpecProductAssignment {\n");
      sb.Append("  SpecID: ").Append(SpecID).Append("\n");
      sb.Append("  ProductID: ").Append(ProductID).Append("\n");
      sb.Append("  DefinesVariant: ").Append(DefinesVariant).Append("\n");
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
