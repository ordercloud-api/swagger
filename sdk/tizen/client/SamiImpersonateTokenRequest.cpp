
#include "SamiImpersonateTokenRequest.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiImpersonateTokenRequest::SamiImpersonateTokenRequest() {
    init();
}

SamiImpersonateTokenRequest::~SamiImpersonateTokenRequest() {
    this->cleanup();
}

void
SamiImpersonateTokenRequest::init() {
    pClientID = null;
pClaims = null;
}

void
SamiImpersonateTokenRequest::cleanup() {
    if(pClientID != null) {
        
        delete pClientID;
        pClientID = null;
    }
if(pClaims != null) {
        pClaims->RemoveAll(true);
        delete pClaims;
        pClaims = null;
    }
}


SamiImpersonateTokenRequest*
SamiImpersonateTokenRequest::fromJson(String* json) {
    this->cleanup();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
    return this;
}


void
SamiImpersonateTokenRequest::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pClientIDKey = new JsonString(L"ClientID");
        IJsonValue* pClientIDVal = null;
        pJsonObject->GetValue(pClientIDKey, pClientIDVal);
        if(pClientIDVal != null) {
            
            pClientID = new String();
            jsonToValue(pClientID, pClientIDVal, L"String", L"String");
        }
        delete pClientIDKey;
JsonString* pClaimsKey = new JsonString(L"Claims");
        IJsonValue* pClaimsVal = null;
        pJsonObject->GetValue(pClaimsKey, pClaimsVal);
        if(pClaimsVal != null) {
            pClaims = new ArrayList();
            
            jsonToValue(pClaims, pClaimsVal, L"IList", L"SamiShipmentItem");
        }
        delete pClaimsKey;
    }
}

SamiImpersonateTokenRequest::SamiImpersonateTokenRequest(String* json) {
    init();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
}

String
SamiImpersonateTokenRequest::asJson ()
{
    JsonObject* pJsonObject = asJsonObject();

    char *pComposeBuf = new char[256];
    JsonWriter::Compose(pJsonObject, pComposeBuf, 256);
    String s = String(pComposeBuf);

    delete pComposeBuf;
    pJsonObject->RemoveAll(true);
    delete pJsonObject;

    return s;
}

JsonObject*
SamiImpersonateTokenRequest::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pClientIDKey = new JsonString(L"ClientID");
    pJsonObject->Add(pClientIDKey, toJson(getPClientID(), "String", ""));

    JsonString *pClaimsKey = new JsonString(L"Claims");
    pJsonObject->Add(pClaimsKey, toJson(getPClaims(), "SamiShipmentItem", "array"));

    return pJsonObject;
}

String*
SamiImpersonateTokenRequest::getPClientID() {
    return pClientID;
}
void
SamiImpersonateTokenRequest::setPClientID(String* pClientID) {
    this->pClientID = pClientID;
}

IList*
SamiImpersonateTokenRequest::getPClaims() {
    return pClaims;
}
void
SamiImpersonateTokenRequest::setPClaims(IList* pClaims) {
    this->pClaims = pClaims;
}



} /* namespace Swagger */

