part of swagger.api;


@Entity()
class Category {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'xp')
  Object xp = null;
  

  @Property(name: 'ListOrder')
  int listOrder = null;
  

  @Property(name: 'Active')
  bool active = null;
  

  @Property(name: 'ParentID')
  String parentID = null;
  
  Category();

  @override
  String toString()  {
    return 'Category[ID=$ID, name=$name, description=$description, xp=$xp, listOrder=$listOrder, active=$active, parentID=$parentID, ]';
  }

}

