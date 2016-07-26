part of swagger.api;


@Entity()
class SpecOption {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Value')
  String value = null;
  

  @Property(name: 'ListOrder')
  int listOrder = null;
  

  @Property(name: 'IsOpenText')
  bool isOpenText = null;
  

  @Property(name: 'PriceMarkupType')
  String priceMarkupType = null;
  

  @Property(name: 'PriceMarkup')
  Number priceMarkup = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  SpecOption();

  @override
  String toString()  {
    return 'SpecOption[ID=$ID, value=$value, listOrder=$listOrder, isOpenText=$isOpenText, priceMarkupType=$priceMarkupType, priceMarkup=$priceMarkup, xp=$xp, ]';
  }

}

