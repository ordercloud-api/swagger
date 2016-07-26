#include "SamiPaymentApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {


SamiPaymentApi::SamiPaymentApi() {

}

SamiPaymentApi::~SamiPaymentApi() {

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
SamiPaymentApi::createWithCompletion(String* buyerID, String* orderID, SamiPayment* payment, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&createProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(payment != null) {
    mBody = new String(payment->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "POST", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
createTransactionProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiPaymentApi::createTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPaymentTransaction* transaction, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&createTransactionProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(transaction != null) {
    mBody = new String(transaction->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "POST", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
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
SamiPaymentApi::deleteWithCompletion(String* buyerID, String* orderID, String* paymentID, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&deleteProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "DELETE", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
}

void
deleteTransactionProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiPaymentApi::deleteTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, void(*success)(SamiError*)) {
  client = new SamiApiClient();

  client->success(&deleteTransactionProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));
  String s_transactionID(L"{");
  s_transactionID.Append(L"transactionID");
  s_transactionID.Append(L"}");
  url.Replace(s_transactionID, stringify(transactionID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "DELETE", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  
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
SamiPaymentApi::getWithCompletion(String* buyerID, String* orderID, String* paymentID, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&getProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;


  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
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
SamiPaymentApi::listWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* success)(SamiObject*, SamiError*)) {
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


  String url(L"/buyers/{buyerID}/orders/{orderID}/payments");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
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
SamiPaymentApi::patchWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPayment* partialPayment, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&patchProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(partialPayment != null) {
    mBody = new String(partialPayment->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "PATCH", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
patchTransactionProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiPaymentApi::patchTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, SamiPaymentTransaction* partialTransaction, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&patchTransactionProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(partialTransaction != null) {
    mBody = new String(partialTransaction->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));
  String s_transactionID(L"{");
  s_transactionID.Append(L"transactionID");
  s_transactionID.Append(L"}");
  url.Replace(s_transactionID, stringify(transactionID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "PATCH", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
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
SamiPaymentApi::updateWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPayment* payment, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&updateProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(payment != null) {
    mBody = new String(payment->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "PUT", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}

void
updateTransactionProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
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
SamiPaymentApi::updateTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, SamiPaymentTransaction* transaction, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&updateTransactionProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  
  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
  String* mBody = null;

  if(transaction != null) {
    mBody = new String(transaction->asJson());
    headerParams->Add(new String("Content-Type"), new String("application/json"));
  }

  String url(L"/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}");

  String s_buyerID(L"{");
  s_buyerID.Append(L"buyerID");
  s_buyerID.Append(L"}");
  url.Replace(s_buyerID, stringify(buyerID, L"String*"));
  String s_orderID(L"{");
  s_orderID.Append(L"orderID");
  s_orderID.Append(L"}");
  url.Replace(s_orderID, stringify(orderID, L"String*"));
  String s_paymentID(L"{");
  s_paymentID.Append(L"paymentID");
  s_paymentID.Append(L"}");
  url.Replace(s_paymentID, stringify(paymentID, L"String*"));
  String s_transactionID(L"{");
  s_transactionID.Append(L"transactionID");
  s_transactionID.Append(L"}");
  url.Replace(s_transactionID, stringify(transactionID, L"String*"));

  client->execute(SamiPaymentApi::getBasePath(), url, "PUT", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}


} /* namespace Swagger */
