part of swagger.api;


@Entity()
class Product {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'QuantityMultiplier')
  int quantityMultiplier = null;
  

  @Property(name: 'ShipWeight')
  Number shipWeight = null;
  

  @Property(name: 'Active')
  bool active = null;
  

  @Property(name: 'Type')
  String type = null;
  

  @Property(name: 'InventoryEnabled')
  bool inventoryEnabled = null;
  

  @Property(name: 'InventoryNotificationPoint')
  int inventoryNotificationPoint = null;
  

  @Property(name: 'VariantLevelInventory')
  bool variantLevelInventory = null;
  

  @Property(name: 'xp')
  Object xp = null;
  

  @Property(name: 'AllowOrderExceedInventory')
  bool allowOrderExceedInventory = null;
  

  @Property(name: 'InventoryVisible')
  bool inventoryVisible = null;
  
  Product();

  @override
  String toString()  {
    return 'Product[ID=$ID, name=$name, description=$description, quantityMultiplier=$quantityMultiplier, shipWeight=$shipWeight, active=$active, type=$type, inventoryEnabled=$inventoryEnabled, inventoryNotificationPoint=$inventoryNotificationPoint, variantLevelInventory=$variantLevelInventory, xp=$xp, allowOrderExceedInventory=$allowOrderExceedInventory, inventoryVisible=$inventoryVisible, ]';
  }

}

