
#include "SamiPriceSchedule.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPriceSchedule::SamiPriceSchedule() {
    init();
}

SamiPriceSchedule::~SamiPriceSchedule() {
    this->cleanup();
}

void
SamiPriceSchedule::init() {
    pID = null;
pName = null;
pApplyTax = null;
pApplyShipping = null;
pMaxQuantity = null;
pUseCumulativeQuantity = null;
pRestrictedQuantity = null;
pOrderType = null;
pPriceBreaks = null;
pXp = null;
}

void
SamiPriceSchedule::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pApplyTax != null) {
        
        delete pApplyTax;
        pApplyTax = null;
    }
if(pApplyShipping != null) {
        
        delete pApplyShipping;
        pApplyShipping = null;
    }
if(pMaxQuantity != null) {
        
        delete pMaxQuantity;
        pMaxQuantity = null;
    }
if(pUseCumulativeQuantity != null) {
        
        delete pUseCumulativeQuantity;
        pUseCumulativeQuantity = null;
    }
if(pRestrictedQuantity != null) {
        
        delete pRestrictedQuantity;
        pRestrictedQuantity = null;
    }
if(pOrderType != null) {
        
        delete pOrderType;
        pOrderType = null;
    }
if(pPriceBreaks != null) {
        pPriceBreaks->RemoveAll(true);
        delete pPriceBreaks;
        pPriceBreaks = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiPriceSchedule*
SamiPriceSchedule::fromJson(String* json) {
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
SamiPriceSchedule::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pNameKey = new JsonString(L"Name");
        IJsonValue* pNameVal = null;
        pJsonObject->GetValue(pNameKey, pNameVal);
        if(pNameVal != null) {
            
            pName = new String();
            jsonToValue(pName, pNameVal, L"String", L"String");
        }
        delete pNameKey;
JsonString* pApplyTaxKey = new JsonString(L"ApplyTax");
        IJsonValue* pApplyTaxVal = null;
        pJsonObject->GetValue(pApplyTaxKey, pApplyTaxVal);
        if(pApplyTaxVal != null) {
            
            pApplyTax = new Boolean(false);
            jsonToValue(pApplyTax, pApplyTaxVal, L"Boolean", L"Boolean");
        }
        delete pApplyTaxKey;
JsonString* pApplyShippingKey = new JsonString(L"ApplyShipping");
        IJsonValue* pApplyShippingVal = null;
        pJsonObject->GetValue(pApplyShippingKey, pApplyShippingVal);
        if(pApplyShippingVal != null) {
            
            pApplyShipping = new Boolean(false);
            jsonToValue(pApplyShipping, pApplyShippingVal, L"Boolean", L"Boolean");
        }
        delete pApplyShippingKey;
JsonString* pMaxQuantityKey = new JsonString(L"MaxQuantity");
        IJsonValue* pMaxQuantityVal = null;
        pJsonObject->GetValue(pMaxQuantityKey, pMaxQuantityVal);
        if(pMaxQuantityVal != null) {
            
            pMaxQuantity = null;
            jsonToValue(pMaxQuantity, pMaxQuantityVal, L"Integer", L"Integer");
        }
        delete pMaxQuantityKey;
JsonString* pUseCumulativeQuantityKey = new JsonString(L"UseCumulativeQuantity");
        IJsonValue* pUseCumulativeQuantityVal = null;
        pJsonObject->GetValue(pUseCumulativeQuantityKey, pUseCumulativeQuantityVal);
        if(pUseCumulativeQuantityVal != null) {
            
            pUseCumulativeQuantity = new Boolean(false);
            jsonToValue(pUseCumulativeQuantity, pUseCumulativeQuantityVal, L"Boolean", L"Boolean");
        }
        delete pUseCumulativeQuantityKey;
JsonString* pRestrictedQuantityKey = new JsonString(L"RestrictedQuantity");
        IJsonValue* pRestrictedQuantityVal = null;
        pJsonObject->GetValue(pRestrictedQuantityKey, pRestrictedQuantityVal);
        if(pRestrictedQuantityVal != null) {
            
            pRestrictedQuantity = new Boolean(false);
            jsonToValue(pRestrictedQuantity, pRestrictedQuantityVal, L"Boolean", L"Boolean");
        }
        delete pRestrictedQuantityKey;
JsonString* pOrderTypeKey = new JsonString(L"OrderType");
        IJsonValue* pOrderTypeVal = null;
        pJsonObject->GetValue(pOrderTypeKey, pOrderTypeVal);
        if(pOrderTypeVal != null) {
            
            pOrderType = new String();
            jsonToValue(pOrderType, pOrderTypeVal, L"String", L"String");
        }
        delete pOrderTypeKey;
JsonString* pPriceBreaksKey = new JsonString(L"PriceBreaks");
        IJsonValue* pPriceBreaksVal = null;
        pJsonObject->GetValue(pPriceBreaksKey, pPriceBreaksVal);
        if(pPriceBreaksVal != null) {
            pPriceBreaks = new ArrayList();
            
            jsonToValue(pPriceBreaks, pPriceBreaksVal, L"IList", L"SamiShipmentItem");
        }
        delete pPriceBreaksKey;
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

SamiPriceSchedule::SamiPriceSchedule(String* json) {
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
SamiPriceSchedule::asJson ()
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
SamiPriceSchedule::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pApplyTaxKey = new JsonString(L"ApplyTax");
    pJsonObject->Add(pApplyTaxKey, toJson(getPApplyTax(), "Boolean", ""));

    JsonString *pApplyShippingKey = new JsonString(L"ApplyShipping");
    pJsonObject->Add(pApplyShippingKey, toJson(getPApplyShipping(), "Boolean", ""));

    JsonString *pMaxQuantityKey = new JsonString(L"MaxQuantity");
    pJsonObject->Add(pMaxQuantityKey, toJson(getPMaxQuantity(), "Integer", ""));

    JsonString *pUseCumulativeQuantityKey = new JsonString(L"UseCumulativeQuantity");
    pJsonObject->Add(pUseCumulativeQuantityKey, toJson(getPUseCumulativeQuantity(), "Boolean", ""));

    JsonString *pRestrictedQuantityKey = new JsonString(L"RestrictedQuantity");
    pJsonObject->Add(pRestrictedQuantityKey, toJson(getPRestrictedQuantity(), "Boolean", ""));

    JsonString *pOrderTypeKey = new JsonString(L"OrderType");
    pJsonObject->Add(pOrderTypeKey, toJson(getPOrderType(), "String", ""));

    JsonString *pPriceBreaksKey = new JsonString(L"PriceBreaks");
    pJsonObject->Add(pPriceBreaksKey, toJson(getPPriceBreaks(), "SamiShipmentItem", "array"));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiPriceSchedule::getPID() {
    return pID;
}
void
SamiPriceSchedule::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiPriceSchedule::getPName() {
    return pName;
}
void
SamiPriceSchedule::setPName(String* pName) {
    this->pName = pName;
}

Boolean*
SamiPriceSchedule::getPApplyTax() {
    return pApplyTax;
}
void
SamiPriceSchedule::setPApplyTax(Boolean* pApplyTax) {
    this->pApplyTax = pApplyTax;
}

Boolean*
SamiPriceSchedule::getPApplyShipping() {
    return pApplyShipping;
}
void
SamiPriceSchedule::setPApplyShipping(Boolean* pApplyShipping) {
    this->pApplyShipping = pApplyShipping;
}

Integer*
SamiPriceSchedule::getPMaxQuantity() {
    return pMaxQuantity;
}
void
SamiPriceSchedule::setPMaxQuantity(Integer* pMaxQuantity) {
    this->pMaxQuantity = pMaxQuantity;
}

Boolean*
SamiPriceSchedule::getPUseCumulativeQuantity() {
    return pUseCumulativeQuantity;
}
void
SamiPriceSchedule::setPUseCumulativeQuantity(Boolean* pUseCumulativeQuantity) {
    this->pUseCumulativeQuantity = pUseCumulativeQuantity;
}

Boolean*
SamiPriceSchedule::getPRestrictedQuantity() {
    return pRestrictedQuantity;
}
void
SamiPriceSchedule::setPRestrictedQuantity(Boolean* pRestrictedQuantity) {
    this->pRestrictedQuantity = pRestrictedQuantity;
}

String*
SamiPriceSchedule::getPOrderType() {
    return pOrderType;
}
void
SamiPriceSchedule::setPOrderType(String* pOrderType) {
    this->pOrderType = pOrderType;
}

IList*
SamiPriceSchedule::getPPriceBreaks() {
    return pPriceBreaks;
}
void
SamiPriceSchedule::setPPriceBreaks(IList* pPriceBreaks) {
    this->pPriceBreaks = pPriceBreaks;
}

SamiObject*
SamiPriceSchedule::getPXp() {
    return pXp;
}
void
SamiPriceSchedule::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

