part of swagger.api;


@Entity()
class Spec {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'ListOrder')
  int listOrder = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'DefaultValue')
  String defaultValue = null;
  

  @Property(name: 'Required')
  bool required = null;
  

  @Property(name: 'AllowOpenText')
  bool allowOpenText = null;
  

  @Property(name: 'DefaultOptionID')
  String defaultOptionID = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Spec();

  @override
  String toString()  {
    return 'Spec[ID=$ID, listOrder=$listOrder, name=$name, defaultValue=$defaultValue, required=$required, allowOpenText=$allowOpenText, defaultOptionID=$defaultOptionID, xp=$xp, ]';
  }

}

