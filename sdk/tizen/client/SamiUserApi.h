#ifndef SamiUserApi_H_
#define SamiUserApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"
#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiImpersonateTokenRequest.h"
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiUserApi {
public:
  SamiUserApi();
  virtual ~SamiUserApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* userID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* userID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getAccessTokenWithCompletion(String* buyerID, String* userID, SamiImpersonateTokenRequest* tokenRequest, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* userGroupID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* buyerID, String* userID, SamiUser* user, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* userID, SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiUserApi_H_ */
