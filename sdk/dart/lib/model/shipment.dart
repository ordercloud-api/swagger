part of swagger.api;


@Entity()
class Shipment {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Shipper')
  String shipper = null;
  

  @Property(name: 'DateShipped')
  DateTime dateShipped = null;
  

  @Property(name: 'TrackingNumber')
  String trackingNumber = null;
  

  @Property(name: 'Cost')
  Number cost = null;
  

  @Property(name: 'Items')
  List<ShipmentItem> items = [];
  

  @Property(name: 'xp')
  Object xp = null;
  
  Shipment();

  @override
  String toString()  {
    return 'Shipment[ID=$ID, shipper=$shipper, dateShipped=$dateShipped, trackingNumber=$trackingNumber, cost=$cost, items=$items, xp=$xp, ]';
  }

}

