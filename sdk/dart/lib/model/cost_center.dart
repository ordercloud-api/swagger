part of swagger.api;


@Entity()
class CostCenter {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  CostCenter();

  @override
  String toString()  {
    return 'CostCenter[ID=$ID, name=$name, description=$description, xp=$xp, ]';
  }

}

