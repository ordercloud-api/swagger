part of swagger.api;


@Entity()
class BuyerCreditCard {
  
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
  
  BuyerCreditCard();

  @override
  String toString()  {
    return 'BuyerCreditCard[token=$token, cardType=$cardType, partialAccountNumber=$partialAccountNumber, cardholderName=$cardholderName, expirationDate=$expirationDate, xp=$xp, ]';
  }

}

