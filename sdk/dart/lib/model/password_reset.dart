part of swagger.api;


@Entity()
class PasswordReset {
  
  @Property(name: 'ClientID')
  String clientID = null;
  

  @Property(name: 'Username')
  String username = null;
  

  @Property(name: 'Password')
  String password = null;
  
  PasswordReset();

  @override
  String toString()  {
    return 'PasswordReset[clientID=$clientID, username=$username, password=$password, ]';
  }

}

