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
  public class ApprovalRule {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="Name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="Description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets ApprovingGroupID
    /// </summary>
    [DataMember(Name="ApprovingGroupID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ApprovingGroupID")]
    public string ApprovingGroupID { get; set; }

    /// <summary>
    /// Gets or Sets RuleExpression
    /// </summary>
    [DataMember(Name="RuleExpression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "RuleExpression")]
    public string RuleExpression { get; set; }

    /// <summary>
    /// Gets or Sets Scope
    /// </summary>
    [DataMember(Name="Scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Scope")]
    public string Scope { get; set; }

    /// <summary>
    /// Gets or Sets ScopeTimeUnit
    /// </summary>
    [DataMember(Name="ScopeTimeUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ScopeTimeUnit")]
    public string ScopeTimeUnit { get; set; }

    /// <summary>
    /// Gets or Sets ScopeTimeNumber
    /// </summary>
    [DataMember(Name="ScopeTimeNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ScopeTimeNumber")]
    public int? ScopeTimeNumber { get; set; }

    /// <summary>
    /// Gets or Sets ScopeStartDate
    /// </summary>
    [DataMember(Name="ScopeStartDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ScopeStartDate")]
    public DateTime? ScopeStartDate { get; set; }

    /// <summary>
    /// Gets or Sets ExpireAfterTimeUnit
    /// </summary>
    [DataMember(Name="ExpireAfterTimeUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ExpireAfterTimeUnit")]
    public string ExpireAfterTimeUnit { get; set; }

    /// <summary>
    /// Gets or Sets ExpireAfterNumber
    /// </summary>
    [DataMember(Name="ExpireAfterNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ExpireAfterNumber")]
    public int? ExpireAfterNumber { get; set; }

    /// <summary>
    /// Gets or Sets ApproveOnExpire
    /// </summary>
    [DataMember(Name="ApproveOnExpire", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ApproveOnExpire")]
    public bool? ApproveOnExpire { get; set; }

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
      sb.Append("class ApprovalRule {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  ApprovingGroupID: ").Append(ApprovingGroupID).Append("\n");
      sb.Append("  RuleExpression: ").Append(RuleExpression).Append("\n");
      sb.Append("  Scope: ").Append(Scope).Append("\n");
      sb.Append("  ScopeTimeUnit: ").Append(ScopeTimeUnit).Append("\n");
      sb.Append("  ScopeTimeNumber: ").Append(ScopeTimeNumber).Append("\n");
      sb.Append("  ScopeStartDate: ").Append(ScopeStartDate).Append("\n");
      sb.Append("  ExpireAfterTimeUnit: ").Append(ExpireAfterTimeUnit).Append("\n");
      sb.Append("  ExpireAfterNumber: ").Append(ExpireAfterNumber).Append("\n");
      sb.Append("  ApproveOnExpire: ").Append(ApproveOnExpire).Append("\n");
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
