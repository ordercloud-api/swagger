part of swagger.api;


@Entity()
class Buyer {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Active')
  bool active = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Buyer();

  @override
  String toString()  {
    return 'Buyer[ID=$ID, name=$name, active=$active, xp=$xp, ]';
  }

}

