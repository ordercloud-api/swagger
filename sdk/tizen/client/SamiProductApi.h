#ifndef SamiProductApi_H_
#define SamiProductApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
#include "SamiProduct.h"
using Tizen::Base::String;
using Tizen::Base::Boolean;
using Tizen::Base::Integer;
#include "SamiVariant.h"
#include "SamiProductAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiProductApi {
public:
  SamiProductApi();
  virtual ~SamiProductApi();

  SamiObject* 
  createWithCompletion(SamiProduct* product, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* productID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* productID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  generateVariantsWithCompletion(String* productID, Boolean* overwriteExisting, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getWithCompletion(String* productID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getInventoryWithCompletion(String* productID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getVariantWithCompletion(String* productID, String* variantID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getVariantInventoryWithCompletion(String* productID, String* variantID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* productID, String* buyerID, String* userID, String* userGroupID, String* level, String* priceScheduleID, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listInventoryWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listVariantInventoryWithCompletion(String* productID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listVariantsWithCompletion(String* productID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* productID, SamiProduct* product, void(* handler)(SamiError*));
  SamiObject* 
  patchVariantWithCompletion(String* productID, String* variantID, SamiVariant* variant, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(SamiProductAssignment* productAssignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* productID, SamiProduct* product, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateInventoryWithCompletion(String* productID, Integer* inventory, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateVariantWithCompletion(String* productID, String* variantID, SamiVariant* variant, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateVariantInventoryWithCompletion(String* productID, String* variantID, Integer* inventory, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiProductApi_H_ */
