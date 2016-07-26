part of swagger.api;


@Entity()
class SpendingAccountAssignment {
  
  @Property(name: 'SpendingAccountID')
  String spendingAccountID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  

  @Property(name: 'AllowExceed')
  bool allowExceed = null;
  
  SpendingAccountAssignment();

  @override
  String toString()  {
    return 'SpendingAccountAssignment[spendingAccountID=$spendingAccountID, userID=$userID, userGroupID=$userGroupID, allowExceed=$allowExceed, ]';
  }

}

