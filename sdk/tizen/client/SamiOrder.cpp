
#include "SamiOrder.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiOrder::SamiOrder() {
    init();
}

SamiOrder::~SamiOrder() {
    this->cleanup();
}

void
SamiOrder::init() {
    pID = null;
pType = null;
pFromUserID = null;
pBillingAddressID = null;
pShippingAddressID = null;
pComments = null;
pShippingCost = null;
pTaxCost = null;
pXp = null;
}

void
SamiOrder::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pType != null) {
        
        delete pType;
        pType = null;
    }
if(pFromUserID != null) {
        
        delete pFromUserID;
        pFromUserID = null;
    }
if(pBillingAddressID != null) {
        
        delete pBillingAddressID;
        pBillingAddressID = null;
    }
if(pShippingAddressID != null) {
        
        delete pShippingAddressID;
        pShippingAddressID = null;
    }
if(pComments != null) {
        
        delete pComments;
        pComments = null;
    }
if(pShippingCost != null) {
        
        delete pShippingCost;
        pShippingCost = null;
    }
if(pTaxCost != null) {
        
        delete pTaxCost;
        pTaxCost = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiOrder*
SamiOrder::fromJson(String* json) {
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
SamiOrder::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pIDKey = new JsonString(L"ID");
        IJsonValue* pIDVal = null;
        pJsonObject->GetValue(pIDKey, pIDVal);
        if(pIDVal != null) {
            
            pID = new String();
            jsonToValue(pID, pIDVal, L"String", L"String");
        }
        delete pIDKey;
JsonString* pTypeKey = new JsonString(L"Type");
        IJsonValue* pTypeVal = null;
        pJsonObject->GetValue(pTypeKey, pTypeVal);
        if(pTypeVal != null) {
            
            pType = new String();
            jsonToValue(pType, pTypeVal, L"String", L"String");
        }
        delete pTypeKey;
JsonString* pFromUserIDKey = new JsonString(L"FromUserID");
        IJsonValue* pFromUserIDVal = null;
        pJsonObject->GetValue(pFromUserIDKey, pFromUserIDVal);
        if(pFromUserIDVal != null) {
            
            pFromUserID = new String();
            jsonToValue(pFromUserID, pFromUserIDVal, L"String", L"String");
        }
        delete pFromUserIDKey;
JsonString* pBillingAddressIDKey = new JsonString(L"BillingAddressID");
        IJsonValue* pBillingAddressIDVal = null;
        pJsonObject->GetValue(pBillingAddressIDKey, pBillingAddressIDVal);
        if(pBillingAddressIDVal != null) {
            
            pBillingAddressID = new String();
            jsonToValue(pBillingAddressID, pBillingAddressIDVal, L"String", L"String");
        }
        delete pBillingAddressIDKey;
JsonString* pShippingAddressIDKey = new JsonString(L"ShippingAddressID");
        IJsonValue* pShippingAddressIDVal = null;
        pJsonObject->GetValue(pShippingAddressIDKey, pShippingAddressIDVal);
        if(pShippingAddressIDVal != null) {
            
            pShippingAddressID = new String();
            jsonToValue(pShippingAddressID, pShippingAddressIDVal, L"String", L"String");
        }
        delete pShippingAddressIDKey;
JsonString* pCommentsKey = new JsonString(L"Comments");
        IJsonValue* pCommentsVal = null;
        pJsonObject->GetValue(pCommentsKey, pCommentsVal);
        if(pCommentsVal != null) {
            
            pComments = new String();
            jsonToValue(pComments, pCommentsVal, L"String", L"String");
        }
        delete pCommentsKey;
JsonString* pShippingCostKey = new JsonString(L"ShippingCost");
        IJsonValue* pShippingCostVal = null;
        pJsonObject->GetValue(pShippingCostKey, pShippingCostVal);
        if(pShippingCostVal != null) {
            
            pShippingCost = new Long();
            jsonToValue(pShippingCost, pShippingCostVal, L"Long", L"Long");
        }
        delete pShippingCostKey;
JsonString* pTaxCostKey = new JsonString(L"TaxCost");
        IJsonValue* pTaxCostVal = null;
        pJsonObject->GetValue(pTaxCostKey, pTaxCostVal);
        if(pTaxCostVal != null) {
            
            pTaxCost = new Long();
            jsonToValue(pTaxCost, pTaxCostVal, L"Long", L"Long");
        }
        delete pTaxCostKey;
JsonString* pXpKey = new JsonString(L"xp");
        IJsonValue* pXpVal = null;
        pJsonObject->GetValue(pXpKey, pXpVal);
        if(pXpVal != null) {
            
            pXp = null;
            jsonToValue(pXp, pXpVal, L"SamiObject", L"SamiObject");
        }
        delete pXpKey;
    }
}

SamiOrder::SamiOrder(String* json) {
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
SamiOrder::asJson ()
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
SamiOrder::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pTypeKey = new JsonString(L"Type");
    pJsonObject->Add(pTypeKey, toJson(getPType(), "String", ""));

    JsonString *pFromUserIDKey = new JsonString(L"FromUserID");
    pJsonObject->Add(pFromUserIDKey, toJson(getPFromUserID(), "String", ""));

    JsonString *pBillingAddressIDKey = new JsonString(L"BillingAddressID");
    pJsonObject->Add(pBillingAddressIDKey, toJson(getPBillingAddressID(), "String", ""));

    JsonString *pShippingAddressIDKey = new JsonString(L"ShippingAddressID");
    pJsonObject->Add(pShippingAddressIDKey, toJson(getPShippingAddressID(), "String", ""));

    JsonString *pCommentsKey = new JsonString(L"Comments");
    pJsonObject->Add(pCommentsKey, toJson(getPComments(), "String", ""));

    JsonString *pShippingCostKey = new JsonString(L"ShippingCost");
    pJsonObject->Add(pShippingCostKey, toJson(getPShippingCost(), "Long", ""));

    JsonString *pTaxCostKey = new JsonString(L"TaxCost");
    pJsonObject->Add(pTaxCostKey, toJson(getPTaxCost(), "Long", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiOrder::getPID() {
    return pID;
}
void
SamiOrder::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiOrder::getPType() {
    return pType;
}
void
SamiOrder::setPType(String* pType) {
    this->pType = pType;
}

String*
SamiOrder::getPFromUserID() {
    return pFromUserID;
}
void
SamiOrder::setPFromUserID(String* pFromUserID) {
    this->pFromUserID = pFromUserID;
}

String*
SamiOrder::getPBillingAddressID() {
    return pBillingAddressID;
}
void
SamiOrder::setPBillingAddressID(String* pBillingAddressID) {
    this->pBillingAddressID = pBillingAddressID;
}

String*
SamiOrder::getPShippingAddressID() {
    return pShippingAddressID;
}
void
SamiOrder::setPShippingAddressID(String* pShippingAddressID) {
    this->pShippingAddressID = pShippingAddressID;
}

String*
SamiOrder::getPComments() {
    return pComments;
}
void
SamiOrder::setPComments(String* pComments) {
    this->pComments = pComments;
}

Long*
SamiOrder::getPShippingCost() {
    return pShippingCost;
}
void
SamiOrder::setPShippingCost(Long* pShippingCost) {
    this->pShippingCost = pShippingCost;
}

Long*
SamiOrder::getPTaxCost() {
    return pTaxCost;
}
void
SamiOrder::setPTaxCost(Long* pTaxCost) {
    this->pTaxCost = pTaxCost;
}

SamiObject*
SamiOrder::getPXp() {
    return pXp;
}
void
SamiOrder::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

