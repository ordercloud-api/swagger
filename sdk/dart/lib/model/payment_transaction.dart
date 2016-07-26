part of swagger.api;


@Entity()
class PaymentTransaction {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Type')
  String type = null;
  

  @Property(name: 'DateExecuted')
  DateTime dateExecuted = null;
  

  @Property(name: 'Amount')
  Number amount = null;
  

  @Property(name: 'Succeeded')
  bool succeeded = null;
  

  @Property(name: 'ResultCode')
  String resultCode = null;
  

  @Property(name: 'ResultMessage')
  String resultMessage = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  PaymentTransaction();

  @override
  String toString()  {
    return 'PaymentTransaction[ID=$ID, type=$type, dateExecuted=$dateExecuted, amount=$amount, succeeded=$succeeded, resultCode=$resultCode, resultMessage=$resultMessage, xp=$xp, ]';
  }

}

