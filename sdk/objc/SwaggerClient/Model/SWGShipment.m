#import "SWGShipment.h"

@implementation SWGShipment

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"Shipper": @"shipper", @"DateShipped": @"dateShipped", @"TrackingNumber": @"trackingNumber", @"Cost": @"cost", @"Items": @"items", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"shipper", @"dateShipped", @"trackingNumber", @"cost", @"items", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
