part of swagger.api;


@Entity()
class UserGroup {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  UserGroup();

  @override
  String toString()  {
    return 'UserGroup[ID=$ID, name=$name, description=$description, xp=$xp, ]';
  }

}

