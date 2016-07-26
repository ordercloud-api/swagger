
#include "SamiSpendingAccountAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiSpendingAccountAssignment::SamiSpendingAccountAssignment() {
    init();
}

SamiSpendingAccountAssignment::~SamiSpendingAccountAssignment() {
    this->cleanup();
}

void
SamiSpendingAccountAssignment::init() {
    pSpendingAccountID = null;
pUserID = null;
pUserGroupID = null;
pAllowExceed = null;
}

void
SamiSpendingAccountAssignment::cleanup() {
    if(pSpendingAccountID != null) {
        
        delete pSpendingAccountID;
        pSpendingAccountID = null;
    }
if(pUserID != null) {
        
        delete pUserID;
        pUserID = null;
    }
if(pUserGroupID != null) {
        
        delete pUserGroupID;
        pUserGroupID = null;
    }
if(pAllowExceed != null) {
        
        delete pAllowExceed;
        pAllowExceed = null;
    }
}


SamiSpendingAccountAssignment*
SamiSpendingAccountAssignment::fromJson(String* json) {
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
SamiSpendingAccountAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pSpendingAccountIDKey = new JsonString(L"SpendingAccountID");
        IJsonValue* pSpendingAccountIDVal = null;
        pJsonObject->GetValue(pSpendingAccountIDKey, pSpendingAccountIDVal);
        if(pSpendingAccountIDVal != null) {
            
            pSpendingAccountID = new String();
            jsonToValue(pSpendingAccountID, pSpendingAccountIDVal, L"String", L"String");
        }
        delete pSpendingAccountIDKey;
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
JsonString* pAllowExceedKey = new JsonString(L"AllowExceed");
        IJsonValue* pAllowExceedVal = null;
        pJsonObject->GetValue(pAllowExceedKey, pAllowExceedVal);
        if(pAllowExceedVal != null) {
            
            pAllowExceed = new Boolean(false);
            jsonToValue(pAllowExceed, pAllowExceedVal, L"Boolean", L"Boolean");
        }
        delete pAllowExceedKey;
    }
}

SamiSpendingAccountAssignment::SamiSpendingAccountAssignment(String* json) {
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
SamiSpendingAccountAssignment::asJson ()
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
SamiSpendingAccountAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pSpendingAccountIDKey = new JsonString(L"SpendingAccountID");
    pJsonObject->Add(pSpendingAccountIDKey, toJson(getPSpendingAccountID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    JsonString *pAllowExceedKey = new JsonString(L"AllowExceed");
    pJsonObject->Add(pAllowExceedKey, toJson(getPAllowExceed(), "Boolean", ""));

    return pJsonObject;
}

String*
SamiSpendingAccountAssignment::getPSpendingAccountID() {
    return pSpendingAccountID;
}
void
SamiSpendingAccountAssignment::setPSpendingAccountID(String* pSpendingAccountID) {
    this->pSpendingAccountID = pSpendingAccountID;
}

String*
SamiSpendingAccountAssignment::getPUserID() {
    return pUserID;
}
void
SamiSpendingAccountAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiSpendingAccountAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiSpendingAccountAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}

Boolean*
SamiSpendingAccountAssignment::getPAllowExceed() {
    return pAllowExceed;
}
void
SamiSpendingAccountAssignment::setPAllowExceed(Boolean* pAllowExceed) {
    this->pAllowExceed = pAllowExceed;
}



} /* namespace Swagger */

