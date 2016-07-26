#import "SWGPasswordResetRequest.h"

@implementation SWGPasswordResetRequest

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ClientID": @"clientID", @"Email": @"email", @"Username": @"username", @"URL": @"uRL" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clientID", @"email", @"username", @"uRL"];
  return [optionalProperties containsObject:propertyName];
}

@end
