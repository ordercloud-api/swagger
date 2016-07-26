part of swagger.api;


@Entity()
class CreditCardAssignment {
  
  @Property(name: 'CreditCardID')
  String creditCardID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  
  CreditCardAssignment();

  @override
  String toString()  {
    return 'CreditCardAssignment[creditCardID=$creditCardID, userID=$userID, userGroupID=$userGroupID, ]';
  }

}

