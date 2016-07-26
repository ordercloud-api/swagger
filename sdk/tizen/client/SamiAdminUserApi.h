#ifndef SamiAdminUserApi_H_
#define SamiAdminUserApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiAdminUserApi {
public:
  SamiAdminUserApi();
  virtual ~SamiAdminUserApi();

  SamiObject* 
  createWithCompletion(SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* userID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* userID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* userID, SamiUser* user, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* userID, SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiAdminUserApi_H_ */
