#import "SWGUser.h"

@implementation SWGUser

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Username": @"username", @"Password": @"password", @"FirstName": @"firstName", @"LastName": @"lastName", @"Email": @"email", @"Phone": @"phone", @"TermsAccepted": @"termsAccepted", @"Active": @"active", @"xp": @"xp", @"SecurityProfileID": @"securityProfileID" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"username", @"password", @"firstName", @"lastName", @"email", @"phone", @"termsAccepted", @"active", @"xp", @"securityProfileID"];
  return [optionalProperties containsObject:propertyName];
}

@end
