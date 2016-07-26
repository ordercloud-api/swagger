part of swagger.api;


@Entity()
class PriceSchedule {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'ApplyTax')
  bool applyTax = null;
  

  @Property(name: 'ApplyShipping')
  bool applyShipping = null;
  

  @Property(name: 'MaxQuantity')
  int maxQuantity = null;
  

  @Property(name: 'UseCumulativeQuantity')
  bool useCumulativeQuantity = null;
  

  @Property(name: 'RestrictedQuantity')
  bool restrictedQuantity = null;
  

  @Property(name: 'OrderType')
  String orderType = null;
  

  @Property(name: 'PriceBreaks')
  List<ShipmentItem> priceBreaks = [];
  

  @Property(name: 'xp')
  Object xp = null;
  
  PriceSchedule();

  @override
  String toString()  {
    return 'PriceSchedule[ID=$ID, name=$name, applyTax=$applyTax, applyShipping=$applyShipping, maxQuantity=$maxQuantity, useCumulativeQuantity=$useCumulativeQuantity, restrictedQuantity=$restrictedQuantity, orderType=$orderType, priceBreaks=$priceBreaks, xp=$xp, ]';
  }

}

