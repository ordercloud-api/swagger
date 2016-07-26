#import "SWGAddress.h"

@implementation SWGAddress

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"ID": @"_iD", @"CompanyName": @"companyName", @"FirstName": @"firstName", @"LastName": @"lastName", @"Street1": @"street1", @"Street2": @"street2", @"City": @"city", @"State": @"state", @"Zip": @"zip", @"Country": @"country", @"Phone": @"phone", @"AddressName": @"addressName", @"xp": @"xp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_iD", @"companyName", @"firstName", @"lastName", @"street1", @"street2", @"city", @"state", @"zip", @"country", @"phone", @"addressName", @"xp"];
  return [optionalProperties containsObject:propertyName];
}

@end
