#import "SWGSpendingAccount.h"

@implementation SWGSpendingAccount

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Name": @"name", @"Balance": @"balance", @"AllowAsPaymentMethod": @"allowAsPaymentMethod", @"RedemptionCode": @"redemptionCode", @"StartDate": @"startDate", @"EndDate": @"endDate", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"name", @"balance", @"allowAsPaymentMethod", @"redemptionCode", @"startDate", @"endDate", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
