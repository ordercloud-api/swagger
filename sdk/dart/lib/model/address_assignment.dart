part of swagger.api;


@Entity()
class AddressAssignment {
  
  @Property(name: 'AddressID')
  String addressID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  

  @Property(name: 'IsShipping')
  bool isShipping = null;
  

  @Property(name: 'IsBilling')
  bool isBilling = null;
  
  AddressAssignment();

  @override
  String toString()  {
    return 'AddressAssignment[addressID=$addressID, userID=$userID, userGroupID=$userGroupID, isShipping=$isShipping, isBilling=$isBilling, ]';
  }

}

