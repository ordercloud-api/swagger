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
  public class Promotion {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Code
    /// </summary>
    [DataMember(Name="Code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Code")]
    public string Code { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="Name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets UsagesRemaining
    /// </summary>
    [DataMember(Name="UsagesRemaining", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UsagesRemaining")]
    public int? UsagesRemaining { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="Description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets FinePrint
    /// </summary>
    [DataMember(Name="FinePrint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FinePrint")]
    public string FinePrint { get; set; }

    /// <summary>
    /// Gets or Sets StartDate
    /// </summary>
    [DataMember(Name="StartDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "StartDate")]
    public DateTime? StartDate { get; set; }

    /// <summary>
    /// Gets or Sets ExpirationDate
    /// </summary>
    [DataMember(Name="ExpirationDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ExpirationDate")]
    public DateTime? ExpirationDate { get; set; }

    /// <summary>
    /// Gets or Sets EligibleExpression
    /// </summary>
    [DataMember(Name="EligibleExpression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "EligibleExpression")]
    public string EligibleExpression { get; set; }

    /// <summary>
    /// Gets or Sets ValueExpression
    /// </summary>
    [DataMember(Name="ValueExpression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ValueExpression")]
    public string ValueExpression { get; set; }

    /// <summary>
    /// Gets or Sets CanCombine
    /// </summary>
    [DataMember(Name="CanCombine", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CanCombine")]
    public bool? CanCombine { get; set; }

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
      sb.Append("class Promotion {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  UsagesRemaining: ").Append(UsagesRemaining).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  FinePrint: ").Append(FinePrint).Append("\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
      sb.Append("  EligibleExpression: ").Append(EligibleExpression).Append("\n");
      sb.Append("  ValueExpression: ").Append(ValueExpression).Append("\n");
      sb.Append("  CanCombine: ").Append(CanCombine).Append("\n");
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
