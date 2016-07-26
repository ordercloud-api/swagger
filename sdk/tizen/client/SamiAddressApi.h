#ifndef SamiAddressApi_H_
#define SamiAddressApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiAddress.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
using Tizen::Base::Boolean;
#include "SamiAddressAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiAddressApi {
public:
  SamiAddressApi();
  virtual ~SamiAddressApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* addressID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* addressID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* addressID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* addressID, String* userID, String* userGroupID, String* level, Boolean* isShipping, Boolean* isBilling, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* addressID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(String* buyerID, SamiAddressAssignment* assignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* addressID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiAddressApi_H_ */
