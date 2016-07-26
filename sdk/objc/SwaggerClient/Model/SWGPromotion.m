#import "SWGPromotion.h"

@implementation SWGPromotion

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Code": @"code", @"Name": @"name", @"UsagesRemaining": @"usagesRemaining", @"Description": @"_description", @"FinePrint": @"finePrint", @"StartDate": @"startDate", @"ExpirationDate": @"expirationDate", @"EligibleExpression": @"eligibleExpression", @"ValueExpression": @"valueExpression", @"CanCombine": @"canCombine", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"code", @"name", @"usagesRemaining", @"_description", @"finePrint", @"startDate", @"expirationDate", @"eligibleExpression", @"valueExpression", @"canCombine", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
