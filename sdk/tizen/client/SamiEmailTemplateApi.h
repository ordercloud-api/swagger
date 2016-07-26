#ifndef SamiEmailTemplateApi_H_
#define SamiEmailTemplateApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiEmailTemplate.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiEmailTemplateApi {
public:
  SamiEmailTemplateApi();
  virtual ~SamiEmailTemplateApi();

  SamiObject* 
  getWithCompletion(String* buyerID, String* emailTemplateType, void (* handler)(SamiObject*, SamiError*));
  void 
  patchWithCompletion(String* buyerID, String* emailTemplateType, SamiEmailTemplate* emailTemplate, void(* handler)(SamiError*));
  void 
  resetToDefaultWithCompletion(String* buyerID, String* emailTemplateType, void(* handler)(SamiError*));
  void 
  updateWithCompletion(String* buyerID, String* emailTemplateType, SamiEmailTemplate* emailTemplate, void(* handler)(SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiEmailTemplateApi_H_ */
