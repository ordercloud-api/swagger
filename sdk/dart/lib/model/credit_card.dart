part of swagger.api;


@Entity()
class CreditCard {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Token')
  String token = null;
  

  @Property(name: 'CardType')
  String cardType = null;
  

  @Property(name: 'PartialAccountNumber')
  String partialAccountNumber = null;
  

  @Property(name: 'CardholderName')
  String cardholderName = null;
  

  @Property(name: 'ExpirationDate')
  DateTime expirationDate = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  CreditCard();

  @override
  String toString()  {
    return 'CreditCard[ID=$ID, token=$token, cardType=$cardType, partialAccountNumber=$partialAccountNumber, cardholderName=$cardholderName, expirationDate=$expirationDate, xp=$xp, ]';
  }

}

