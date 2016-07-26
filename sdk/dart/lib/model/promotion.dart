part of swagger.api;


@Entity()
class Promotion {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Code')
  String code = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'UsagesRemaining')
  int usagesRemaining = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'FinePrint')
  String finePrint = null;
  

  @Property(name: 'StartDate')
  DateTime startDate = null;
  

  @Property(name: 'ExpirationDate')
  DateTime expirationDate = null;
  

  @Property(name: 'EligibleExpression')
  String eligibleExpression = null;
  

  @Property(name: 'ValueExpression')
  String valueExpression = null;
  

  @Property(name: 'CanCombine')
  bool canCombine = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Promotion();

  @override
  String toString()  {
    return 'Promotion[ID=$ID, code=$code, name=$name, usagesRemaining=$usagesRemaining, description=$description, finePrint=$finePrint, startDate=$startDate, expirationDate=$expirationDate, eligibleExpression=$eligibleExpression, valueExpression=$valueExpression, canCombine=$canCombine, xp=$xp, ]';
  }

}

