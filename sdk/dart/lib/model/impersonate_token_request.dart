part of swagger.api;


@Entity()
class ImpersonateTokenRequest {
  
  @Property(name: 'ClientID')
  String clientID = null;
  

  @Property(name: 'Claims')
  List<ShipmentItem> claims = [];
  
  ImpersonateTokenRequest();

  @override
  String toString()  {
    return 'ImpersonateTokenRequest[clientID=$clientID, claims=$claims, ]';
  }

}

