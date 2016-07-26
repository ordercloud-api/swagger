part of swagger.api;


@Entity()
class Variant {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'Active')
  bool active = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  Variant();

  @override
  String toString()  {
    return 'Variant[ID=$ID, name=$name, description=$description, active=$active, xp=$xp, ]';
  }

}

