part of swagger.api;


@Entity()
class CategoryAssignment {
  
  @Property(name: 'CategoryID')
  String categoryID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  
  CategoryAssignment();

  @override
  String toString()  {
    return 'CategoryAssignment[categoryID=$categoryID, userID=$userID, userGroupID=$userGroupID, ]';
  }

}

