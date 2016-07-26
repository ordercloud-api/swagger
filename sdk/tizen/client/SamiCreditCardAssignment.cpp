
#include "SamiCreditCardAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCreditCardAssignment::SamiCreditCardAssignment() {
    init();
}

SamiCreditCardAssignment::~SamiCreditCardAssignment() {
    this->cleanup();
}

void
SamiCreditCardAssignment::init() {
    pCreditCardID = null;
pUserID = null;
pUserGroupID = null;
}

void
SamiCreditCardAssignment::cleanup() {
    if(pCreditCardID != null) {
        
        delete pCreditCardID;
        pCreditCardID = null;
    }
if(pUserID != null) {
        
        delete pUserID;
        pUserID = null;
    }
if(pUserGroupID != null) {
        
        delete pUserGroupID;
        pUserGroupID = null;
    }
}


SamiCreditCardAssignment*
SamiCreditCardAssignment::fromJson(String* json) {
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
SamiCreditCardAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pCreditCardIDKey = new JsonString(L"CreditCardID");
        IJsonValue* pCreditCardIDVal = null;
        pJsonObject->GetValue(pCreditCardIDKey, pCreditCardIDVal);
        if(pCreditCardIDVal != null) {
            
            pCreditCardID = new String();
            jsonToValue(pCreditCardID, pCreditCardIDVal, L"String", L"String");
        }
        delete pCreditCardIDKey;
JsonString* pUserIDKey = new JsonString(L"UserID");
        IJsonValue* pUserIDVal = null;
        pJsonObject->GetValue(pUserIDKey, pUserIDVal);
        if(pUserIDVal != null) {
            
            pUserID = new String();
            jsonToValue(pUserID, pUserIDVal, L"String", L"String");
        }
        delete pUserIDKey;
JsonString* pUserGroupIDKey = new JsonString(L"UserGroupID");
        IJsonValue* pUserGroupIDVal = null;
        pJsonObject->GetValue(pUserGroupIDKey, pUserGroupIDVal);
        if(pUserGroupIDVal != null) {
            
            pUserGroupID = new String();
            jsonToValue(pUserGroupID, pUserGroupIDVal, L"String", L"String");
        }
        delete pUserGroupIDKey;
    }
}

SamiCreditCardAssignment::SamiCreditCardAssignment(String* json) {
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
SamiCreditCardAssignment::asJson ()
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
SamiCreditCardAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pCreditCardIDKey = new JsonString(L"CreditCardID");
    pJsonObject->Add(pCreditCardIDKey, toJson(getPCreditCardID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    return pJsonObject;
}

String*
SamiCreditCardAssignment::getPCreditCardID() {
    return pCreditCardID;
}
void
SamiCreditCardAssignment::setPCreditCardID(String* pCreditCardID) {
    this->pCreditCardID = pCreditCardID;
}

String*
SamiCreditCardAssignment::getPUserID() {
    return pUserID;
}
void
SamiCreditCardAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiCreditCardAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiCreditCardAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}



} /* namespace Swagger */

