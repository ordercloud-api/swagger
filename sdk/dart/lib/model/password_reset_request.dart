part of swagger.api;


@Entity()
class PasswordResetRequest {
  
  @Property(name: 'ClientID')
  String clientID = null;
  

  @Property(name: 'Email')
  String email = null;
  

  @Property(name: 'Username')
  String username = null;
  

  @Property(name: 'URL')
  String URL = null;
  
  PasswordResetRequest();

  @override
  String toString()  {
    return 'PasswordResetRequest[clientID=$clientID, email=$email, username=$username, URL=$URL, ]';
  }

}

