
#include "SamiProductAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiProductAssignment::SamiProductAssignment() {
    init();
}

SamiProductAssignment::~SamiProductAssignment() {
    this->cleanup();
}

void
SamiProductAssignment::init() {
    pProductID = null;
pStandardPriceScheduleID = null;
pReplenishmentPriceScheduleID = null;
pUserID = null;
pUserGroupID = null;
pBuyerID = null;
}

void
SamiProductAssignment::cleanup() {
    if(pProductID != null) {
        
        delete pProductID;
        pProductID = null;
    }
if(pStandardPriceScheduleID != null) {
        
        delete pStandardPriceScheduleID;
        pStandardPriceScheduleID = null;
    }
if(pReplenishmentPriceScheduleID != null) {
        
        delete pReplenishmentPriceScheduleID;
        pReplenishmentPriceScheduleID = null;
    }
if(pUserID != null) {
        
        delete pUserID;
        pUserID = null;
    }
if(pUserGroupID != null) {
        
        delete pUserGroupID;
        pUserGroupID = null;
    }
if(pBuyerID != null) {
        
        delete pBuyerID;
        pBuyerID = null;
    }
}


SamiProductAssignment*
SamiProductAssignment::fromJson(String* json) {
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
SamiProductAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pProductIDKey = new JsonString(L"ProductID");
        IJsonValue* pProductIDVal = null;
        pJsonObject->GetValue(pProductIDKey, pProductIDVal);
        if(pProductIDVal != null) {
            
            pProductID = new String();
            jsonToValue(pProductID, pProductIDVal, L"String", L"String");
        }
        delete pProductIDKey;
JsonString* pStandardPriceScheduleIDKey = new JsonString(L"StandardPriceScheduleID");
        IJsonValue* pStandardPriceScheduleIDVal = null;
        pJsonObject->GetValue(pStandardPriceScheduleIDKey, pStandardPriceScheduleIDVal);
        if(pStandardPriceScheduleIDVal != null) {
            
            pStandardPriceScheduleID = new String();
            jsonToValue(pStandardPriceScheduleID, pStandardPriceScheduleIDVal, L"String", L"String");
        }
        delete pStandardPriceScheduleIDKey;
JsonString* pReplenishmentPriceScheduleIDKey = new JsonString(L"ReplenishmentPriceScheduleID");
        IJsonValue* pReplenishmentPriceScheduleIDVal = null;
        pJsonObject->GetValue(pReplenishmentPriceScheduleIDKey, pReplenishmentPriceScheduleIDVal);
        if(pReplenishmentPriceScheduleIDVal != null) {
            
            pReplenishmentPriceScheduleID = new String();
            jsonToValue(pReplenishmentPriceScheduleID, pReplenishmentPriceScheduleIDVal, L"String", L"String");
        }
        delete pReplenishmentPriceScheduleIDKey;
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
JsonString* pBuyerIDKey = new JsonString(L"BuyerID");
        IJsonValue* pBuyerIDVal = null;
        pJsonObject->GetValue(pBuyerIDKey, pBuyerIDVal);
        if(pBuyerIDVal != null) {
            
            pBuyerID = new String();
            jsonToValue(pBuyerID, pBuyerIDVal, L"String", L"String");
        }
        delete pBuyerIDKey;
    }
}

SamiProductAssignment::SamiProductAssignment(String* json) {
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
SamiProductAssignment::asJson ()
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
SamiProductAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pProductIDKey = new JsonString(L"ProductID");
    pJsonObject->Add(pProductIDKey, toJson(getPProductID(), "String", ""));

    JsonString *pStandardPriceScheduleIDKey = new JsonString(L"StandardPriceScheduleID");
    pJsonObject->Add(pStandardPriceScheduleIDKey, toJson(getPStandardPriceScheduleID(), "String", ""));

    JsonString *pReplenishmentPriceScheduleIDKey = new JsonString(L"ReplenishmentPriceScheduleID");
    pJsonObject->Add(pReplenishmentPriceScheduleIDKey, toJson(getPReplenishmentPriceScheduleID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    JsonString *pBuyerIDKey = new JsonString(L"BuyerID");
    pJsonObject->Add(pBuyerIDKey, toJson(getPBuyerID(), "String", ""));

    return pJsonObject;
}

String*
SamiProductAssignment::getPProductID() {
    return pProductID;
}
void
SamiProductAssignment::setPProductID(String* pProductID) {
    this->pProductID = pProductID;
}

String*
SamiProductAssignment::getPStandardPriceScheduleID() {
    return pStandardPriceScheduleID;
}
void
SamiProductAssignment::setPStandardPriceScheduleID(String* pStandardPriceScheduleID) {
    this->pStandardPriceScheduleID = pStandardPriceScheduleID;
}

String*
SamiProductAssignment::getPReplenishmentPriceScheduleID() {
    return pReplenishmentPriceScheduleID;
}
void
SamiProductAssignment::setPReplenishmentPriceScheduleID(String* pReplenishmentPriceScheduleID) {
    this->pReplenishmentPriceScheduleID = pReplenishmentPriceScheduleID;
}

String*
SamiProductAssignment::getPUserID() {
    return pUserID;
}
void
SamiProductAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiProductAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiProductAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}

String*
SamiProductAssignment::getPBuyerID() {
    return pBuyerID;
}
void
SamiProductAssignment::setPBuyerID(String* pBuyerID) {
    this->pBuyerID = pBuyerID;
}



} /* namespace Swagger */

