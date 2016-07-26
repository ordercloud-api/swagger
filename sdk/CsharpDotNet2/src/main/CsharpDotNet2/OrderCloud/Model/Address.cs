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
  public class Address {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets CompanyName
    /// </summary>
    [DataMember(Name="CompanyName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CompanyName")]
    public string CompanyName { get; set; }

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
    /// Gets or Sets Street1
    /// </summary>
    [DataMember(Name="Street1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Street1")]
    public string Street1 { get; set; }

    /// <summary>
    /// Gets or Sets Street2
    /// </summary>
    [DataMember(Name="Street2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Street2")]
    public string Street2 { get; set; }

    /// <summary>
    /// Gets or Sets City
    /// </summary>
    [DataMember(Name="City", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "City")]
    public string City { get; set; }

    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="State", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "State")]
    public string State { get; set; }

    /// <summary>
    /// Gets or Sets Zip
    /// </summary>
    [DataMember(Name="Zip", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Zip")]
    public string Zip { get; set; }

    /// <summary>
    /// Gets or Sets Country
    /// </summary>
    [DataMember(Name="Country", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Country")]
    public string Country { get; set; }

    /// <summary>
    /// Gets or Sets Phone
    /// </summary>
    [DataMember(Name="Phone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Phone")]
    public string Phone { get; set; }

    /// <summary>
    /// Gets or Sets AddressName
    /// </summary>
    [DataMember(Name="AddressName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AddressName")]
    public string AddressName { get; set; }

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
      sb.Append("class Address {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  CompanyName: ").Append(CompanyName).Append("\n");
      sb.Append("  FirstName: ").Append(FirstName).Append("\n");
      sb.Append("  LastName: ").Append(LastName).Append("\n");
      sb.Append("  Street1: ").Append(Street1).Append("\n");
      sb.Append("  Street2: ").Append(Street2).Append("\n");
      sb.Append("  City: ").Append(City).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  Zip: ").Append(Zip).Append("\n");
      sb.Append("  Country: ").Append(Country).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  AddressName: ").Append(AddressName).Append("\n");
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
