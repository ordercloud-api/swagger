part of swagger.api;


@Entity()
class UserGroupAssignment {
  
  @Property(name: 'UserGroupID')
  String userGroupID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  
  UserGroupAssignment();

  @override
  String toString()  {
    return 'UserGroupAssignment[userGroupID=$userGroupID, userID=$userID, ]';
  }

}

