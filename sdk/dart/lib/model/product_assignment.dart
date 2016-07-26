part of swagger.api;


@Entity()
class ProductAssignment {
  
  @Property(name: 'ProductID')
  String productID = null;
  

  @Property(name: 'StandardPriceScheduleID')
  String standardPriceScheduleID = null;
  

  @Property(name: 'ReplenishmentPriceScheduleID')
  String replenishmentPriceScheduleID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  

  @Property(name: 'BuyerID')
  String buyerID = null;
  
  ProductAssignment();

  @override
  String toString()  {
    return 'ProductAssignment[productID=$productID, standardPriceScheduleID=$standardPriceScheduleID, replenishmentPriceScheduleID=$replenishmentPriceScheduleID, userID=$userID, userGroupID=$userGroupID, buyerID=$buyerID, ]';
  }

}

