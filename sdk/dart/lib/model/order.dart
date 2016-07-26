part of swagger.api;


@Entity()
class Order {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Type')
  String type = null;
  

  @Property(name: 'FromUserID')
  String fromUserID = null;
  

  @Property(name: 'BillingAddressID')
  String billingAddressID = null;
  

  @Property(name: 'ShippingAddressID')
  String shippingAddressID = null;
  

  @Property(name: 'Comments')
  String comments = null;
  

  @Property(name: 'ShippingCost')
  Number shippingCost = null;
  

  @Property(name: 'TaxCost')
  Number taxCost = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Order();

  @override
  String toString()  {
    return 'Order[ID=$ID, type=$type, fromUserID=$fromUserID, billingAddressID=$billingAddressID, shippingAddressID=$shippingAddressID, comments=$comments, shippingCost=$shippingCost, taxCost=$taxCost, xp=$xp, ]';
  }

}

