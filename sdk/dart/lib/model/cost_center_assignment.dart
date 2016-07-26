part of swagger.api;


@Entity()
class CostCenterAssignment {
  
  @Property(name: 'CostCenterID')
  String costCenterID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  
  CostCenterAssignment();

  @override
  String toString()  {
    return 'CostCenterAssignment[costCenterID=$costCenterID, userID=$userID, userGroupID=$userGroupID, ]';
  }

}

