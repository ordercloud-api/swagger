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
  public class AddressAssignment {
    /// <summary>
    /// Gets or Sets AddressID
    /// </summary>
    [DataMember(Name="AddressID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AddressID")]
    public string AddressID { get; set; }

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
    /// Gets or Sets IsShipping
    /// </summary>
    [DataMember(Name="IsShipping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsShipping")]
    public bool? IsShipping { get; set; }

    /// <summary>
    /// Gets or Sets IsBilling
    /// </summary>
    [DataMember(Name="IsBilling", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsBilling")]
    public bool? IsBilling { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddressAssignment {\n");
      sb.Append("  AddressID: ").Append(AddressID).Append("\n");
      sb.Append("  UserID: ").Append(UserID).Append("\n");
      sb.Append("  UserGroupID: ").Append(UserGroupID).Append("\n");
      sb.Append("  IsShipping: ").Append(IsShipping).Append("\n");
      sb.Append("  IsBilling: ").Append(IsBilling).Append("\n");
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
