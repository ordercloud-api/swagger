#include "SamiApprovalRuleApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {


SamiApprovalRuleApi::SamiApprovalRuleApi() {

}

SamiApprovalRuleApi::~SamiApprovalRuleApi() {

}

void
createProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiApprovalRuleApi::createWithCompletion(String* buyerID, SamiApprovalRule* approvalRule, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&createProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(approvalRule != null) {
    mBody = new String(approvalRule->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/approvalrules");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "POST", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
deleteProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiApprovalRuleApi::deleteWithCompletion(String* buyerID, String* approvalRuleID, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&deleteProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/approvalrules/{approvalRuleID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_approvalRuleID(L"{");
  s_approvalRuleID.Append(L"approvalRuleID");
  s_approvalRuleID.Append(L"}");
  url.Replace(s_approvalRuleID, stringify(approvalRuleID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "DELETE", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
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
SamiApprovalRuleApi::getWithCompletion(String* buyerID, String* approvalRuleID, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&getProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/approvalrules/{approvalRuleID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_approvalRuleID(L"{");
  s_approvalRuleID.Append(L"approvalRuleID");
  s_approvalRuleID.Append(L"}");
  url.Replace(s_approvalRuleID, stringify(approvalRuleID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
listProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiApprovalRuleApi::listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&listProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
    queryParams->Add(new String("search"), search);

    queryParams->Add(new String("searchOn"), searchOn);

    queryParams->Add(new String("sortBy"), sortBy);

    queryParams->Add(new String("page"), page);

    queryParams->Add(new String("pageSize"), pageSize);

  String* mBody = null;


  String url(L"/buyers/{buyerID}/approvalrules");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
patchProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiApprovalRuleApi::patchWithCompletion(String* buyerID, String* approvalRuleID, SamiApprovalRule* partialApprovalRule, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&patchProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(partialApprovalRule != null) {
    mBody = new String(partialApprovalRule->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/approvalrules/{approvalRuleID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_approvalRuleID(L"{");
  s_approvalRuleID.Append(L"approvalRuleID");
  s_approvalRuleID.Append(L"}");
  url.Replace(s_approvalRuleID, stringify(approvalRuleID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "PATCH", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
updateProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiApprovalRuleApi::updateWithCompletion(String* buyerID, String* approvalRuleID, SamiApprovalRule* approvalRule, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&updateProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(approvalRule != null) {
    mBody = new String(approvalRule->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/approvalrules/{approvalRuleID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_approvalRuleID(L"{");
  s_approvalRuleID.Append(L"approvalRuleID");
  s_approvalRuleID.Append(L"}");
  url.Replace(s_approvalRuleID, stringify(approvalRuleID, L"String*"));

  client->execute(SamiApprovalRuleApi::getBasePath(), url, "PUT", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}


} /* namespace Swagger */