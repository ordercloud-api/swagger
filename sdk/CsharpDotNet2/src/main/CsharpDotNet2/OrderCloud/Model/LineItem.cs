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
  public class LineItem {
    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }

    /// <summary>
    /// Gets or Sets ProductID
    /// </summary>
    [DataMember(Name="ProductID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ProductID")]
    public string ProductID { get; set; }

    /// <summary>
    /// Gets or Sets Quantity
    /// </summary>
    [DataMember(Name="Quantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Quantity")]
    public int? Quantity { get; set; }

    /// <summary>
    /// Gets or Sets UnitPrice
    /// </summary>
    [DataMember(Name="UnitPrice", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UnitPrice")]
    public double? UnitPrice { get; set; }

    /// <summary>
    /// Gets or Sets CostCenter
    /// </summary>
    [DataMember(Name="CostCenter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CostCenter")]
    public string CostCenter { get; set; }

    /// <summary>
    /// Gets or Sets DateNeeded
    /// </summary>
    [DataMember(Name="DateNeeded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "DateNeeded")]
    public DateTime? DateNeeded { get; set; }

    /// <summary>
    /// Gets or Sets ShippingAccount
    /// </summary>
    [DataMember(Name="ShippingAccount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShippingAccount")]
    public string ShippingAccount { get; set; }

    /// <summary>
    /// Gets or Sets ShippingAddressID
    /// </summary>
    [DataMember(Name="ShippingAddressID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShippingAddressID")]
    public string ShippingAddressID { get; set; }

    /// <summary>
    /// Gets or Sets ShipfromAddressID
    /// </summary>
    [DataMember(Name="ShipfromAddressID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShipfromAddressID")]
    public string ShipfromAddressID { get; set; }

    /// <summary>
    /// Gets or Sets ShipperID
    /// </summary>
    [DataMember(Name="ShipperID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShipperID")]
    public string ShipperID { get; set; }

    /// <summary>
    /// Gets or Sets Specs
    /// </summary>
    [DataMember(Name="Specs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Specs")]
    public List<ShipmentItem> Specs { get; set; }

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
      sb.Append("class LineItem {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  ProductID: ").Append(ProductID).Append("\n");
      sb.Append("  Quantity: ").Append(Quantity).Append("\n");
      sb.Append("  UnitPrice: ").Append(UnitPrice).Append("\n");
      sb.Append("  CostCenter: ").Append(CostCenter).Append("\n");
      sb.Append("  DateNeeded: ").Append(DateNeeded).Append("\n");
      sb.Append("  ShippingAccount: ").Append(ShippingAccount).Append("\n");
      sb.Append("  ShippingAddressID: ").Append(ShippingAddressID).Append("\n");
      sb.Append("  ShipfromAddressID: ").Append(ShipfromAddressID).Append("\n");
      sb.Append("  ShipperID: ").Append(ShipperID).Append("\n");
      sb.Append("  Specs: ").Append(Specs).Append("\n");
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
