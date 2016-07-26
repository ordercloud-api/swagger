
#include "SamiPromotionAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPromotionAssignment::SamiPromotionAssignment() {
    init();
}

SamiPromotionAssignment::~SamiPromotionAssignment() {
    this->cleanup();
}

void
SamiPromotionAssignment::init() {
    pPromotionID = null;
pBuyerID = null;
pUserID = null;
pUserGroupID = null;
}

void
SamiPromotionAssignment::cleanup() {
    if(pPromotionID != null) {
        
        delete pPromotionID;
        pPromotionID = null;
    }
if(pBuyerID != null) {
        
        delete pBuyerID;
        pBuyerID = null;
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


SamiPromotionAssignment*
SamiPromotionAssignment::fromJson(String* json) {
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
SamiPromotionAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pPromotionIDKey = new JsonString(L"PromotionID");
        IJsonValue* pPromotionIDVal = null;
        pJsonObject->GetValue(pPromotionIDKey, pPromotionIDVal);
        if(pPromotionIDVal != null) {
            
            pPromotionID = new String();
            jsonToValue(pPromotionID, pPromotionIDVal, L"String", L"String");
        }
        delete pPromotionIDKey;
JsonString* pBuyerIDKey = new JsonString(L"BuyerID");
        IJsonValue* pBuyerIDVal = null;
        pJsonObject->GetValue(pBuyerIDKey, pBuyerIDVal);
        if(pBuyerIDVal != null) {
            
            pBuyerID = new String();
            jsonToValue(pBuyerID, pBuyerIDVal, L"String", L"String");
        }
        delete pBuyerIDKey;
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

SamiPromotionAssignment::SamiPromotionAssignment(String* json) {
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
SamiPromotionAssignment::asJson ()
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
SamiPromotionAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pPromotionIDKey = new JsonString(L"PromotionID");
    pJsonObject->Add(pPromotionIDKey, toJson(getPPromotionID(), "String", ""));

    JsonString *pBuyerIDKey = new JsonString(L"BuyerID");
    pJsonObject->Add(pBuyerIDKey, toJson(getPBuyerID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    return pJsonObject;
}

String*
SamiPromotionAssignment::getPPromotionID() {
    return pPromotionID;
}
void
SamiPromotionAssignment::setPPromotionID(String* pPromotionID) {
    this->pPromotionID = pPromotionID;
}

String*
SamiPromotionAssignment::getPBuyerID() {
    return pBuyerID;
}
void
SamiPromotionAssignment::setPBuyerID(String* pBuyerID) {
    this->pBuyerID = pBuyerID;
}

String*
SamiPromotionAssignment::getPUserID() {
    return pUserID;
}
void
SamiPromotionAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiPromotionAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiPromotionAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}



} /* namespace Swagger */

