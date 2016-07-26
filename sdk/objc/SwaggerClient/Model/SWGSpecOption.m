#import "SWGSpecOption.h"

@implementation SWGSpecOption

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Value": @"value", @"ListOrder": @"listOrder", @"IsOpenText": @"isOpenText", @"PriceMarkupType": @"priceMarkupType", @"PriceMarkup": @"priceMarkup", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"value", @"listOrder", @"isOpenText", @"priceMarkupType", @"priceMarkup", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
