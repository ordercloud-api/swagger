#import "SWGApprovalRule.h"

@implementation SWGApprovalRule

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Name": @"name", @"Description": @"_description", @"ApprovingGroupID": @"approvingGroupID", @"RuleExpression": @"ruleExpression", @"Scope": @"scope", @"ScopeTimeUnit": @"scopeTimeUnit", @"ScopeTimeNumber": @"scopeTimeNumber", @"ScopeStartDate": @"scopeStartDate", @"ExpireAfterTimeUnit": @"expireAfterTimeUnit", @"ExpireAfterNumber": @"expireAfterNumber", @"ApproveOnExpire": @"approveOnExpire", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"name", @"_description", @"approvingGroupID", @"ruleExpression", @"scope", @"scopeTimeUnit", @"scopeTimeNumber", @"scopeStartDate", @"expireAfterTimeUnit", @"expireAfterNumber", @"approveOnExpire", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
