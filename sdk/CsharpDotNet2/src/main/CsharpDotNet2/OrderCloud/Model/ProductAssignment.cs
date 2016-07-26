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
  public class ProductAssignment {
    /// <summary>
    /// Gets or Sets ProductID
    /// </summary>
    [DataMember(Name="ProductID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ProductID")]
    public string ProductID { get; set; }

    /// <summary>
    /// Gets or Sets StandardPriceScheduleID
    /// </summary>
    [DataMember(Name="StandardPriceScheduleID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "StandardPriceScheduleID")]
    public string StandardPriceScheduleID { get; set; }

    /// <summary>
    /// Gets or Sets ReplenishmentPriceScheduleID
    /// </summary>
    [DataMember(Name="ReplenishmentPriceScheduleID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ReplenishmentPriceScheduleID")]
    public string ReplenishmentPriceScheduleID { get; set; }

    /// <summary>
    /// Gets or Sets UserID
    /// </summary>
    [DataMember(Name="UserID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UserID")]
    public string UserID { get; set; }

    /// <summary>
    /// Gets or Sets UserGroupID
    /// </summary>
    [DataMember(Name="UserGroupID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UserGroupID")]
    public string UserGroupID { get; set; }

    /// <summary>
    /// Gets or Sets BuyerID
    /// </summary>
    [DataMember(Name="BuyerID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "BuyerID")]
    public string BuyerID { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProductAssignment {\n");
      sb.Append("  ProductID: ").Append(ProductID).Append("\n");
      sb.Append("  StandardPriceScheduleID: ").Append(StandardPriceScheduleID).Append("\n");
      sb.Append("  ReplenishmentPriceScheduleID: ").Append(ReplenishmentPriceScheduleID).Append("\n");
      sb.Append("  UserID: ").Append(UserID).Append("\n");
      sb.Append("  UserGroupID: ").Append(UserGroupID).Append("\n");
      sb.Append("  BuyerID: ").Append(BuyerID).Append("\n");
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
