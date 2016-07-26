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
  public class SpendingAccountAssignment {
    /// <summary>
    /// Gets or Sets SpendingAccountID
    /// </summary>
    [DataMember(Name="SpendingAccountID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SpendingAccountID")]
    public string SpendingAccountID { get; set; }

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
    /// Gets or Sets AllowExceed
    /// </summary>
    [DataMember(Name="AllowExceed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AllowExceed")]
    public bool? AllowExceed { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SpendingAccountAssignment {\n");
      sb.Append("  SpendingAccountID: ").Append(SpendingAccountID).Append("\n");
      sb.Append("  UserID: ").Append(UserID).Append("\n");
      sb.Append("  UserGroupID: ").Append(UserGroupID).Append("\n");
      sb.Append("  AllowExceed: ").Append(AllowExceed).Append("\n");
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
