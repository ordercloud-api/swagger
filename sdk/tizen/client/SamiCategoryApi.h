#ifndef SamiCategoryApi_H_
#define SamiCategoryApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiCategory.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
#include "SamiCategoryAssignment.h"
#include "SamiCategoryProductAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiCategoryApi {
public:
  SamiCategoryApi();
  virtual ~SamiCategoryApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiCategory* category, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* categoryID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* categoryID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  void 
  deleteProductAssignmentWithCompletion(String* buyerID, String* categoryID, String* productID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* categoryID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* parentID, String* depth, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* categoryID, String* userID, String* userGroupID, String* level, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listChildrenWithCompletion(String* buyerID, String* parentID, String* search, String* depth, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listProductAssignmentsWithCompletion(String* buyerID, String* categoryID, String* productID, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* buyerID, String* categoryID, SamiCategory* category, void(* handler)(SamiError*));
  void 
  saveAssignmentWithCompletion(String* buyerID, SamiCategoryAssignment* categoryAssignment, void(* handler)(SamiError*));
  void 
  saveProductAssignmentWithCompletion(String* buyerID, SamiCategoryProductAssignment* productAssignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* categoryID, SamiCategory* category, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiCategoryApi_H_ */
