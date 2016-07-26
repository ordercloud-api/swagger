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
  public class CategoryProductAssignment {
    /// <summary>
    /// Gets or Sets CategoryID
    /// </summary>
    [DataMember(Name="CategoryID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CategoryID")]
    public string CategoryID { get; set; }

    /// <summary>
    /// Gets or Sets ProductID
    /// </summary>
    [DataMember(Name="ProductID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ProductID")]
    public string ProductID { get; set; }

    /// <summary>
    /// Gets or Sets ListOrder
    /// </summary>
    [DataMember(Name="ListOrder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ListOrder")]
    public int? ListOrder { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CategoryProductAssignment {\n");
      sb.Append("  CategoryID: ").Append(CategoryID).Append("\n");
      sb.Append("  ProductID: ").Append(ProductID).Append("\n");
      sb.Append("  ListOrder: ").Append(ListOrder).Append("\n");
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
