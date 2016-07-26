part of swagger.api;


@Entity()
class PriceBreak {
  
  @Property(name: 'Quantity')
  int quantity = null;
  

  @Property(name: 'Price')
  Number price = null;
  
  PriceBreak();

  @override
  String toString()  {
    return 'PriceBreak[quantity=$quantity, price=$price, ]';
  }

}

