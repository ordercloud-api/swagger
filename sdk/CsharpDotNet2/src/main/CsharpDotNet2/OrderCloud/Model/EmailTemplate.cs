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
  public class EmailTemplate {
    /// <summary>
    /// Gets or Sets Subject
    /// </summary>
    [DataMember(Name="Subject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Subject")]
    public string Subject { get; set; }

    /// <summary>
    /// Gets or Sets Body
    /// </summary>
    [DataMember(Name="Body", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Body")]
    public string Body { get; set; }

    /// <summary>
    /// Gets or Sets ReplyEmail
    /// </summary>
    [DataMember(Name="ReplyEmail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ReplyEmail")]
    public string ReplyEmail { get; set; }

    /// <summary>
    /// Gets or Sets SendMessageType
    /// </summary>
    [DataMember(Name="SendMessageType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SendMessageType")]
    public bool? SendMessageType { get; set; }

    /// <summary>
    /// Gets or Sets EmailFormatType
    /// </summary>
    [DataMember(Name="EmailFormatType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "EmailFormatType")]
    public string EmailFormatType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EmailTemplate {\n");
      sb.Append("  Subject: ").Append(Subject).Append("\n");
      sb.Append("  Body: ").Append(Body).Append("\n");
      sb.Append("  ReplyEmail: ").Append(ReplyEmail).Append("\n");
      sb.Append("  SendMessageType: ").Append(SendMessageType).Append("\n");
      sb.Append("  EmailFormatType: ").Append(EmailFormatType).Append("\n");
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
