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
  public class Product {
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
    /// Gets or Sets QuantityMultiplier
    /// </summary>
    [DataMember(Name="QuantityMultiplier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "QuantityMultiplier")]
    public int? QuantityMultiplier { get; set; }

    /// <summary>
    /// Gets or Sets ShipWeight
    /// </summary>
    [DataMember(Name="ShipWeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ShipWeight")]
    public double? ShipWeight { get; set; }

    /// <summary>
    /// Gets or Sets Active
    /// </summary>
    [DataMember(Name="Active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Active")]
    public bool? Active { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="Type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Type")]
    public string Type { get; set; }

    /// <summary>
    /// Gets or Sets InventoryEnabled
    /// </summary>
    [DataMember(Name="InventoryEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "InventoryEnabled")]
    public bool? InventoryEnabled { get; set; }

    /// <summary>
    /// Gets or Sets InventoryNotificationPoint
    /// </summary>
    [DataMember(Name="InventoryNotificationPoint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "InventoryNotificationPoint")]
    public int? InventoryNotificationPoint { get; set; }

    /// <summary>
    /// Gets or Sets VariantLevelInventory
    /// </summary>
    [DataMember(Name="VariantLevelInventory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "VariantLevelInventory")]
    public bool? VariantLevelInventory { get; set; }

    /// <summary>
    /// Gets or Sets Xp
    /// </summary>
    [DataMember(Name="xp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xp")]
    public Object Xp { get; set; }

    /// <summary>
    /// Gets or Sets AllowOrderExceedInventory
    /// </summary>
    [DataMember(Name="AllowOrderExceedInventory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AllowOrderExceedInventory")]
    public bool? AllowOrderExceedInventory { get; set; }

    /// <summary>
    /// Gets or Sets InventoryVisible
    /// </summary>
    [DataMember(Name="InventoryVisible", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "InventoryVisible")]
    public bool? InventoryVisible { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Product {\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  QuantityMultiplier: ").Append(QuantityMultiplier).Append("\n");
      sb.Append("  ShipWeight: ").Append(ShipWeight).Append("\n");
      sb.Append("  Active: ").Append(Active).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  InventoryEnabled: ").Append(InventoryEnabled).Append("\n");
      sb.Append("  InventoryNotificationPoint: ").Append(InventoryNotificationPoint).Append("\n");
      sb.Append("  VariantLevelInventory: ").Append(VariantLevelInventory).Append("\n");
      sb.Append("  Xp: ").Append(Xp).Append("\n");
      sb.Append("  AllowOrderExceedInventory: ").Append(AllowOrderExceedInventory).Append("\n");
      sb.Append("  InventoryVisible: ").Append(InventoryVisible).Append("\n");
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
