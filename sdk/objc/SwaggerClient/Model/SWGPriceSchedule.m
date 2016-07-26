#import "SWGPriceSchedule.h"

@implementation SWGPriceSchedule

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Name": @"name", @"ApplyTax": @"applyTax", @"ApplyShipping": @"applyShipping", @"MaxQuantity": @"maxQuantity", @"UseCumulativeQuantity": @"useCumulativeQuantity", @"RestrictedQuantity": @"restrictedQuantity", @"OrderType": @"orderType", @"PriceBreaks": @"priceBreaks", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"name", @"applyTax", @"applyShipping", @"maxQuantity", @"useCumulativeQuantity", @"restrictedQuantity", @"orderType", @"priceBreaks", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
