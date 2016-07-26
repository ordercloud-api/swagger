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
  public class ImpersonateTokenRequest {
    /// <summary>
    /// Gets or Sets ClientID
    /// </summary>
    [DataMember(Name="ClientID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ClientID")]
    public string ClientID { get; set; }

    /// <summary>
    /// Gets or Sets Claims
    /// </summary>
    [DataMember(Name="Claims", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Claims")]
    public List<ShipmentItem> Claims { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ImpersonateTokenRequest {\n");
      sb.Append("  ClientID: ").Append(ClientID).Append("\n");
      sb.Append("  Claims: ").Append(Claims).Append("\n");
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
