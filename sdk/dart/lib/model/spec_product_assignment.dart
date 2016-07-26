part of swagger.api;


@Entity()
class SpecProductAssignment {
  
  @Property(name: 'SpecID')
  String specID = null;
  

  @Property(name: 'ProductID')
  String productID = null;
  

  @Property(name: 'DefinesVariant')
  bool definesVariant = null;
  
  SpecProductAssignment();

  @override
  String toString()  {
    return 'SpecProductAssignment[specID=$specID, productID=$productID, definesVariant=$definesVariant, ]';
  }

}

