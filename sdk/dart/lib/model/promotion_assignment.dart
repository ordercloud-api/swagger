part of swagger.api;


@Entity()
class PromotionAssignment {
  
  @Property(name: 'PromotionID')
  String promotionID = null;
  

  @Property(name: 'BuyerID')
  String buyerID = null;
  

  @Property(name: 'UserID')
  String userID = null;
  

  @Property(name: 'UserGroupID')
  String userGroupID = null;
  
  PromotionAssignment();

  @override
  String toString()  {
    return 'PromotionAssignment[promotionID=$promotionID, buyerID=$buyerID, userID=$userID, userGroupID=$userGroupID, ]';
  }

}

