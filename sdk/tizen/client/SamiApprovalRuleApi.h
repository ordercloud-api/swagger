#ifndef SamiApprovalRuleApi_H_
#define SamiApprovalRuleApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiApprovalRule.h"
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiApprovalRuleApi {
public:
  SamiApprovalRuleApi();
  virtual ~SamiApprovalRuleApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiApprovalRule* approvalRule, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* approvalRuleID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* approvalRuleID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* approvalRuleID, SamiApprovalRule* partialApprovalRule, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* approvalRuleID, SamiApprovalRule* approvalRule, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiApprovalRuleApi_H_ */
