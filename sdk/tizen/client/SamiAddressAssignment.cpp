
#include "SamiAddressAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiAddressAssignment::SamiAddressAssignment() {
    init();
}

SamiAddressAssignment::~SamiAddressAssignment() {
    this->cleanup();
}

void
SamiAddressAssignment::init() {
    pAddressID = null;
pUserID = null;
pUserGroupID = null;
pIsShipping = null;
pIsBilling = null;
}

void
SamiAddressAssignment::cleanup() {
    if(pAddressID != null) {
        
        delete pAddressID;
        pAddressID = null;
    }
if(pUserID != null) {
        
        delete pUserID;
        pUserID = null;
    }
if(pUserGroupID != null) {
        
        delete pUserGroupID;
        pUserGroupID = null;
    }
if(pIsShipping != null) {
        
        delete pIsShipping;
        pIsShipping = null;
    }
if(pIsBilling != null) {
        
        delete pIsBilling;
        pIsBilling = null;
    }
}


SamiAddressAssignment*
SamiAddressAssignment::fromJson(String* json) {
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
SamiAddressAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pAddressIDKey = new JsonString(L"AddressID");
        IJsonValue* pAddressIDVal = null;
        pJsonObject->GetValue(pAddressIDKey, pAddressIDVal);
        if(pAddressIDVal != null) {
            
            pAddressID = new String();
            jsonToValue(pAddressID, pAddressIDVal, L"String", L"String");
        }
        delete pAddressIDKey;
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
JsonString* pIsShippingKey = new JsonString(L"IsShipping");
        IJsonValue* pIsShippingVal = null;
        pJsonObject->GetValue(pIsShippingKey, pIsShippingVal);
        if(pIsShippingVal != null) {
            
            pIsShipping = new Boolean(false);
            jsonToValue(pIsShipping, pIsShippingVal, L"Boolean", L"Boolean");
        }
        delete pIsShippingKey;
JsonString* pIsBillingKey = new JsonString(L"IsBilling");
        IJsonValue* pIsBillingVal = null;
        pJsonObject->GetValue(pIsBillingKey, pIsBillingVal);
        if(pIsBillingVal != null) {
            
            pIsBilling = new Boolean(false);
            jsonToValue(pIsBilling, pIsBillingVal, L"Boolean", L"Boolean");
        }
        delete pIsBillingKey;
    }
}

SamiAddressAssignment::SamiAddressAssignment(String* json) {
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
SamiAddressAssignment::asJson ()
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
SamiAddressAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pAddressIDKey = new JsonString(L"AddressID");
    pJsonObject->Add(pAddressIDKey, toJson(getPAddressID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    JsonString *pIsShippingKey = new JsonString(L"IsShipping");
    pJsonObject->Add(pIsShippingKey, toJson(getPIsShipping(), "Boolean", ""));

    JsonString *pIsBillingKey = new JsonString(L"IsBilling");
    pJsonObject->Add(pIsBillingKey, toJson(getPIsBilling(), "Boolean", ""));

    return pJsonObject;
}

String*
SamiAddressAssignment::getPAddressID() {
    return pAddressID;
}
void
SamiAddressAssignment::setPAddressID(String* pAddressID) {
    this->pAddressID = pAddressID;
}

String*
SamiAddressAssignment::getPUserID() {
    return pUserID;
}
void
SamiAddressAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiAddressAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiAddressAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}

Boolean*
SamiAddressAssignment::getPIsShipping() {
    return pIsShipping;
}
void
SamiAddressAssignment::setPIsShipping(Boolean* pIsShipping) {
    this->pIsShipping = pIsShipping;
}

Boolean*
SamiAddressAssignment::getPIsBilling() {
    return pIsBilling;
}
void
SamiAddressAssignment::setPIsBilling(Boolean* pIsBilling) {
    this->pIsBilling = pIsBilling;
}



} /* namespace Swagger */

