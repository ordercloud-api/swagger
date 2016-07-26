#ifndef SamiSpendingAccountApi_H_
#define SamiSpendingAccountApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiSpendingAccount.h"
using Tizen::Base::Integer;
#include "SamiSpendingAccountAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiSpendingAccountApi {
public:
  SamiSpendingAccountApi();
  virtual ~SamiSpendingAccountApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiSpendingAccount* spendingAccount, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* spendingAccountID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* spendingAccountID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* spendingAccountID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* spendingAccountID, String* userID, String* userGroupID, String* level, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* spendingAccountID, SamiSpendingAccount* spendingAccount, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(String* buyerID, SamiSpendingAccountAssignment* assignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* spendingAccountID, SamiSpendingAccount* spendingAccount, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiSpendingAccountApi_H_ */
