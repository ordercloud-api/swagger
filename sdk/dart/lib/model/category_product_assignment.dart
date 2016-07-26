part of swagger.api;


@Entity()
class CategoryProductAssignment {
  
  @Property(name: 'CategoryID')
  String categoryID = null;
  

  @Property(name: 'ProductID')
  String productID = null;
  

  @Property(name: 'ListOrder')
  int listOrder = null;
  
  CategoryProductAssignment();

  @override
  String toString()  {
    return 'CategoryProductAssignment[categoryID=$categoryID, productID=$productID, listOrder=$listOrder, ]';
  }

}

