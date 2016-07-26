#import "SWGPayment.h"

@implementation SWGPayment

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Type": @"type", @"CreditCardID": @"creditCardID", @"SpendingAccountID": @"spendingAccountID", @"Description": @"_description", @"Amount": @"amount", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"type", @"creditCardID", @"spendingAccountID", @"_description", @"amount", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
