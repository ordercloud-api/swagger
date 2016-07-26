#ifndef SamiCostCenterApi_H_
#define SamiCostCenterApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiCostCenter.h"
using Tizen::Base::Integer;
#include "SamiCostCenterAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiCostCenterApi {
public:
  SamiCostCenterApi();
  virtual ~SamiCostCenterApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiCostCenter* costCenter, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* costCenterID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* costCenterID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* costCenterID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* costCenterID, String* userID, String* userGroupID, String* level, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* costCenterID, SamiCostCenter* costCenter, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(String* buyerID, SamiCostCenterAssignment* assignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* costCenterID, SamiCostCenter* costCenter, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiCostCenterApi_H_ */
