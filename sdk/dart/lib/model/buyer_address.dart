part of swagger.api;


@Entity()
class BuyerAddress {
  
  @Property(name: 'Shipping')
  bool shipping = null;
  

  @Property(name: 'Billing')
  bool billing = null;
  

  @Property(name: 'CompanyName')
  String companyName = null;
  

  @Property(name: 'FirstName')
  String firstName = null;
  

  @Property(name: 'LastName')
  String lastName = null;
  

  @Property(name: 'Street1')
  String street1 = null;
  

  @Property(name: 'Street2')
  String street2 = null;
  

  @Property(name: 'City')
  String city = null;
  

  @Property(name: 'State')
  String state = null;
  

  @Property(name: 'Zip')
  String zip = null;
  

  @Property(name: 'Country')
  String country = null;
  

  @Property(name: 'Phone')
  String phone = null;
  

  @Property(name: 'AddressName')
  String addressName = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  BuyerAddress();

  @override
  String toString()  {
    return 'BuyerAddress[shipping=$shipping, billing=$billing, companyName=$companyName, firstName=$firstName, lastName=$lastName, street1=$street1, street2=$street2, city=$city, state=$state, zip=$zip, country=$country, phone=$phone, addressName=$addressName, xp=$xp, ]';
  }

}

