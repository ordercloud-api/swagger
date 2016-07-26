#import "SWGPaymentTransaction.h"

@implementation SWGPaymentTransaction

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Type": @"type", @"DateExecuted": @"dateExecuted", @"Amount": @"amount", @"Succeeded": @"succeeded", @"ResultCode": @"resultCode", @"ResultMessage": @"resultMessage", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"type", @"dateExecuted", @"amount", @"succeeded", @"resultCode", @"resultMessage", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
