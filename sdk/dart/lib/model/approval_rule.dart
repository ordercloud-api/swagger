part of swagger.api;


@Entity()
class ApprovalRule {
  
  @Property(name: 'ID')
  String ID = null;
  

  @Property(name: 'Name')
  String name = null;
  

  @Property(name: 'Description')
  String description = null;
  

  @Property(name: 'ApprovingGroupID')
  String approvingGroupID = null;
  

  @Property(name: 'RuleExpression')
  String ruleExpression = null;
  

  @Property(name: 'Scope')
  String scope = null;
  

  @Property(name: 'ScopeTimeUnit')
  String scopeTimeUnit = null;
  

  @Property(name: 'ScopeTimeNumber')
  int scopeTimeNumber = null;
  

  @Property(name: 'ScopeStartDate')
  DateTime scopeStartDate = null;
  

  @Property(name: 'ExpireAfterTimeUnit')
  String expireAfterTimeUnit = null;
  

  @Property(name: 'ExpireAfterNumber')
  int expireAfterNumber = null;
  

  @Property(name: 'ApproveOnExpire')
  bool approveOnExpire = null;
  

  @Property(name: 'xp')
  Object xp = null;
  
  ApprovalRule();

  @override
  String toString()  {
    return 'ApprovalRule[ID=$ID, name=$name, description=$description, approvingGroupID=$approvingGroupID, ruleExpression=$ruleExpression, scope=$scope, scopeTimeUnit=$scopeTimeUnit, scopeTimeNumber=$scopeTimeNumber, scopeStartDate=$scopeStartDate, expireAfterTimeUnit=$expireAfterTimeUnit, expireAfterNumber=$expireAfterNumber, approveOnExpire=$approveOnExpire, xp=$xp, ]';
  }

}

