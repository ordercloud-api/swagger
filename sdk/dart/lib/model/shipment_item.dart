part of swagger.api;


@Entity()
class ShipmentItem {
  
  @Property(name: 'OrderID')
  String orderID = null;
  

  @Property(name: 'LineItemID')
  String lineItemID = null;
  

  @Property(name: 'QuantityShipped')
  int quantityShipped = null;
  
  ShipmentItem();

  @override
  String toString()  {
    return 'ShipmentItem[orderID=$orderID, lineItemID=$lineItemID, quantityShipped=$quantityShipped, ]';
  }

}

