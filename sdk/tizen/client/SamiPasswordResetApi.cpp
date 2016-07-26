#include "SamiPasswordResetApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {


SamiPasswordResetApi::SamiPasswordResetApi() {

}

SamiPasswordResetApi::~SamiPasswordResetApi() {

}

void
resetPasswordProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    handler(null, null);
  }
  else {
    SamiError* error = new SamiError(code, new String(pHttpResponse->GetStatusText()));
    
    handler(error, null);
  }
}

void 
SamiPasswordResetApi::resetPasswordWithCompletion(String* verificationCode, SamiPasswordReset* passwordReset, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&resetPasswordProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(passwordReset != null) {
    mBody = new String(passwordReset->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/password/reset/{verificationCode}");

  String s_verificationCode(L"{");
  s_verificationCode.Append(L"verificationCode");
  s_verificationCode.Append(L"}");
  url.Replace(s_verificationCode, stringify(verificationCode, L"String*"));

  client->execute(SamiPasswordResetApi::getBasePath(), url, "PUT", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}

void
sendVerificationCodeProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    handler(null, null);
  }
  else {
    SamiError* error = new SamiError(code, new String(pHttpResponse->GetStatusText()));
    
    handler(error, null);
  }
}

void 
SamiPasswordResetApi::sendVerificationCodeWithCompletion(SamiPasswordResetRequest* passwordResetRequest, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&sendVerificationCodeProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(passwordResetRequest != null) {
    mBody = new String(passwordResetRequest->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/password/reset");


  client->execute(SamiPasswordResetApi::getBasePath(), url, "POST", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}


} /* namespace Swagger */
