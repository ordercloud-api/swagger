#ifndef SamiUserGroupApi_H_
#define SamiUserGroupApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiUserGroup.h"
using Tizen::Base::Integer;
#include "SamiUserGroupAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiUserGroupApi {
public:
  SamiUserGroupApi();
  virtual ~SamiUserGroupApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiUserGroup* group, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* userGroupID, void(* handler)(SamiError*));
  void 
  deleteUserAssignmentWithCompletion(String* buyerID, String* userGroupID, String* userID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* userGroupID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listUserAssignmentsWithCompletion(String* buyerID, String* userGroupID, String* userID, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* buyerID, String* userGroupID, SamiUserGroup* group, void(* handler)(SamiError*));
  void 
  saveUserAssignmentWithCompletion(String* buyerID, SamiUserGroupAssignment* userGroupAssignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* userGroupID, SamiUserGroup* group, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiUserGroupApi_H_ */
