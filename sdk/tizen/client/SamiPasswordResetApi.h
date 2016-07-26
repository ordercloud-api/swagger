#ifndef SamiPasswordResetApi_H_
#define SamiPasswordResetApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

using Tizen::Base::String;
#include "SamiPasswordReset.h"
#include "SamiPasswordResetRequest.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiPasswordResetApi {
public:
  SamiPasswordResetApi();
  virtual ~SamiPasswordResetApi();

  void 
  resetPasswordWithCompletion(String* verificationCode, SamiPasswordReset* passwordReset, void(* handler)(SamiError*));
  void 
  sendVerificationCodeWithCompletion(SamiPasswordResetRequest* passwordResetRequest, void(* handler)(SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiPasswordResetApi_H_ */
