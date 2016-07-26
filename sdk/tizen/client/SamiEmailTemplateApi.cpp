#include "SamiEmailTemplateApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {


SamiEmailTemplateApi::SamiEmailTemplateApi() {

}

SamiEmailTemplateApi::~SamiEmailTemplateApi() {

}

void
getProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    ByteBuffer* pBuffer = pHttpResponse->ReadBodyN();
    IJsonValue* pJson = JsonParser::ParseN(*pBuffer);

    SamiObject* out = null;
    jsonToValue(out, pJson, L"SamiObject*", L"SamiObject");

    if (pJson) {
      if (pJson->GetType() == JSON_TYPE_OBJECT) {
         JsonObject* pObject = static_cast< JsonObject* >(pJson);
         pObject->RemoveAll(true);
      }
      else if (pJson->GetType() == JSON_TYPE_ARRAY) {
         JsonArray* pArray = static_cast< JsonArray* >(pJson);
         pArray->RemoveAll(true);
      }
      handler(out, null);
    }
    else {
      SamiError* error = new SamiError(0, new String(L"No parsable response received"));
      handler(null, error);
    }
    
  }
  else {
    SamiError* error = new SamiError(code, new String(pHttpResponse->GetStatusText()));
    handler(null, error);
    
  }
}

SamiObject* 
SamiEmailTemplateApi::getWithCompletion(String* buyerID, String* emailTemplateType, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&getProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/emailtemplates/{emailTemplateType}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_emailTemplateType(L"{");
  s_emailTemplateType.Append(L"emailTemplateType");
  s_emailTemplateType.Append(L"}");
  url.Replace(s_emailTemplateType, stringify(emailTemplateType, L"String*"));

  client->execute(SamiEmailTemplateApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
patchProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiEmailTemplateApi::patchWithCompletion(String* buyerID, String* emailTemplateType, SamiEmailTemplate* emailTemplate, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&patchProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(emailTemplate != null) {
    mBody = new String(emailTemplate->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/emailtemplates/{emailTemplateType}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_emailTemplateType(L"{");
  s_emailTemplateType.Append(L"emailTemplateType");
  s_emailTemplateType.Append(L"}");
  url.Replace(s_emailTemplateType, stringify(emailTemplateType, L"String*"));

  client->execute(SamiEmailTemplateApi::getBasePath(), url, "PATCH", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}

void
resetToDefaultProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiEmailTemplateApi::resetToDefaultWithCompletion(String* buyerID, String* emailTemplateType, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&resetToDefaultProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/emailtemplates/{emailTemplateType}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_emailTemplateType(L"{");
  s_emailTemplateType.Append(L"emailTemplateType");
  s_emailTemplateType.Append(L"}");
  url.Replace(s_emailTemplateType, stringify(emailTemplateType, L"String*"));

  client->execute(SamiEmailTemplateApi::getBasePath(), url, "DELETE", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}

void
updateProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiEmailTemplateApi::updateWithCompletion(String* buyerID, String* emailTemplateType, SamiEmailTemplate* emailTemplate, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&updateProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(emailTemplate != null) {
    mBody = new String(emailTemplate->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/emailtemplates/{emailTemplateType}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_emailTemplateType(L"{");
  s_emailTemplateType.Append(L"emailTemplateType");
  s_emailTemplateType.Append(L"}");
  url.Replace(s_emailTemplateType, stringify(emailTemplateType, L"String*"));

  client->execute(SamiEmailTemplateApi::getBasePath(), url, "PUT", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}


} /* namespace Swagger */
