#ifndef SamiSecurityProfileApi_H_
#define SamiSecurityProfileApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiSecurityProfileApi {
public:
  SamiSecurityProfileApi();
  virtual ~SamiSecurityProfileApi();

  SamiObject* 
  getWithCompletion(String* securityProfileID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiSecurityProfileApi_H_ */
