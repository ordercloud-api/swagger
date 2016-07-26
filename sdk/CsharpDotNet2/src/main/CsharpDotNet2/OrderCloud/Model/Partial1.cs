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
  public class Partial1 {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="Username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Username")]
    public string Username { get; set; }

    /// <summary>
    /// Gets or Sets Password
    /// </summary>
    [DataMember(Name="Password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Password")]
    public string Password { get; set; }

    /// <summary>
    /// Gets or Sets FirstName
    /// </summary>
    [DataMember(Name="FirstName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FirstName")]
    public string FirstName { get; set; }

    /// <summary>
    /// Gets or Sets LastName
    /// </summary>
    [DataMember(Name="LastName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "LastName")]
    public string LastName { get; set; }

    /// <summary>
    /// Gets or Sets Email
    /// </summary>
    [DataMember(Name="Email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Email")]
    public string Email { get; set; }

    /// <summary>
    /// Gets or Sets Phone
    /// </summary>
    [DataMember(Name="Phone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Phone")]
    public string Phone { get; set; }

    /// <summary>
    /// Gets or Sets TermsAccepted
    /// </summary>
    [DataMember(Name="TermsAccepted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "TermsAccepted")]
    public DateTime? TermsAccepted { get; set; }

    /// <summary>
    /// Gets or Sets Active
    /// </summary>
    [DataMember(Name="Active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Active")]
    public bool? Active { get; set; }

    /// <summary>
    /// Gets or Sets Xp
    /// </summary>
    [DataMember(Name="xp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xp")]
    public Object Xp { get; set; }

    /// <summary>
    /// Gets or Sets SecurityProfileID
    /// </summary>
    [DataMember(Name="SecurityProfileID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SecurityProfileID")]
    public string SecurityProfileID { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Partial1 {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
      sb.Append("  FirstName: ").Append(FirstName).Append("\n");
      sb.Append("  LastName: ").Append(LastName).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  TermsAccepted: ").Append(TermsAccepted).Append("\n");
      sb.Append("  Active: ").Append(Active).Append("\n");
      sb.Append("  Xp: ").Append(Xp).Append("\n");
      sb.Append("  SecurityProfileID: ").Append(SecurityProfileID).Append("\n");
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
