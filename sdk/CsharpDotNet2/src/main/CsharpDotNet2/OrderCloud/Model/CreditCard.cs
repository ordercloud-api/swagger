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
  public class CreditCard {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Token
    /// </summary>
    [DataMember(Name="Token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Token")]
    public string Token { get; set; }

    /// <summary>
    /// Gets or Sets CardType
    /// </summary>
    [DataMember(Name="CardType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CardType")]
    public string CardType { get; set; }

    /// <summary>
    /// Gets or Sets PartialAccountNumber
    /// </summary>
    [DataMember(Name="PartialAccountNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PartialAccountNumber")]
    public string PartialAccountNumber { get; set; }

    /// <summary>
    /// Gets or Sets CardholderName
    /// </summary>
    [DataMember(Name="CardholderName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CardholderName")]
    public string CardholderName { get; set; }

    /// <summary>
    /// Gets or Sets ExpirationDate
    /// </summary>
    [DataMember(Name="ExpirationDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ExpirationDate")]
    public DateTime? ExpirationDate { get; set; }

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
      sb.Append("class CreditCard {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Token: ").Append(Token).Append("\n");
      sb.Append("  CardType: ").Append(CardType).Append("\n");
      sb.Append("  PartialAccountNumber: ").Append(PartialAccountNumber).Append("\n");
      sb.Append("  CardholderName: ").Append(CardholderName).Append("\n");
      sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
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
