part of swagger.api;


@Entity()
class LineItem {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'ProductID')
  String productID = null;
  

  @Property(name: 'Quantity')
  int quantity = null;
  

  @Property(name: 'UnitPrice')
  Number unitPrice = null;
  

  @Property(name: 'CostCenter')
  String costCenter = null;
  

  @Property(name: 'DateNeeded')
  DateTime dateNeeded = null;
  

  @Property(name: 'ShippingAccount')
  String shippingAccount = null;
  

  @Property(name: 'ShippingAddressID')
  String shippingAddressID = null;
  

  @Property(name: 'ShipfromAddressID')
  String shipfromAddressID = null;
  

  @Property(name: 'ShipperID')
  String shipperID = null;
  

  @Property(name: 'Specs')
  List<ShipmentItem> specs = [];
  

  @Property(name: 'xp')
  Object xp = null;
  
  LineItem();

  @override
  String toString()  {
    return 'LineItem[ID=$ID, productID=$productID, quantity=$quantity, unitPrice=$unitPrice, costCenter=$costCenter, dateNeeded=$dateNeeded, shippingAccount=$shippingAccount, shippingAddressID=$shippingAddressID, shipfromAddressID=$shipfromAddressID, shipperID=$shipperID, specs=$specs, xp=$xp, ]';
  }

}

