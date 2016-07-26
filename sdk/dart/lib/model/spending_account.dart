part of swagger.api;


@Entity()
class SpendingAccount {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Balance')
  Number balance = null;
  

  @Property(name: 'AllowAsPaymentMethod')
  bool allowAsPaymentMethod = null;
  

  @Property(name: 'RedemptionCode')
  String redemptionCode = null;
  

  @Property(name: 'StartDate')
  DateTime startDate = null;
  

  @Property(name: 'EndDate')
  DateTime endDate = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  SpendingAccount();

  @override
  String toString()  {
    return 'SpendingAccount[ID=$ID, name=$name, balance=$balance, allowAsPaymentMethod=$allowAsPaymentMethod, redemptionCode=$redemptionCode, startDate=$startDate, endDate=$endDate, xp=$xp, ]';
  }

}

