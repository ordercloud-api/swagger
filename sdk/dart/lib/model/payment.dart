part of swagger.api;


@Entity()
class Payment {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Type')
  String type = null;
  

  @Property(name: 'CreditCardID')
  String creditCardID = null;
  

  @Property(name: 'SpendingAccountID')
  String spendingAccountID = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'Amount')
  Number amount = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Payment();

  @override
  String toString()  {
    return 'Payment[ID=$ID, type=$type, creditCardID=$creditCardID, spendingAccountID=$spendingAccountID, description=$description, amount=$amount, xp=$xp, ]';
  }

}

