
#include "SamiShipment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiShipment::SamiShipment() {
    init();
}

SamiShipment::~SamiShipment() {
    this->cleanup();
}

void
SamiShipment::init() {
    pID = null;
pShipper = null;
pDateShipped = null;
pTrackingNumber = null;
pCost = null;
pItems = null;
pXp = null;
}

void
SamiShipment::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pShipper != null) {
        
        delete pShipper;
        pShipper = null;
    }
if(pDateShipped != null) {
        
        delete pDateShipped;
        pDateShipped = null;
    }
if(pTrackingNumber != null) {
        
        delete pTrackingNumber;
        pTrackingNumber = null;
    }
if(pCost != null) {
        
        delete pCost;
        pCost = null;
    }
if(pItems != null) {
        pItems->RemoveAll(true);
        delete pItems;
        pItems = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiShipment*
SamiShipment::fromJson(String* json) {
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
SamiShipment::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pShipperKey = new JsonString(L"Shipper");
        IJsonValue* pShipperVal = null;
        pJsonObject->GetValue(pShipperKey, pShipperVal);
        if(pShipperVal != null) {
            
            pShipper = new String();
            jsonToValue(pShipper, pShipperVal, L"String", L"String");
        }
        delete pShipperKey;
JsonString* pDateShippedKey = new JsonString(L"DateShipped");
        IJsonValue* pDateShippedVal = null;
        pJsonObject->GetValue(pDateShippedKey, pDateShippedVal);
        if(pDateShippedVal != null) {
            
            pDateShipped = new DateTime();
            jsonToValue(pDateShipped, pDateShippedVal, L"SamiDate", L"SamiDate");
        }
        delete pDateShippedKey;
JsonString* pTrackingNumberKey = new JsonString(L"TrackingNumber");
        IJsonValue* pTrackingNumberVal = null;
        pJsonObject->GetValue(pTrackingNumberKey, pTrackingNumberVal);
        if(pTrackingNumberVal != null) {
            
            pTrackingNumber = new String();
            jsonToValue(pTrackingNumber, pTrackingNumberVal, L"String", L"String");
        }
        delete pTrackingNumberKey;
JsonString* pCostKey = new JsonString(L"Cost");
        IJsonValue* pCostVal = null;
        pJsonObject->GetValue(pCostKey, pCostVal);
        if(pCostVal != null) {
            
            pCost = new Long();
            jsonToValue(pCost, pCostVal, L"Long", L"Long");
        }
        delete pCostKey;
JsonString* pItemsKey = new JsonString(L"Items");
        IJsonValue* pItemsVal = null;
        pJsonObject->GetValue(pItemsKey, pItemsVal);
        if(pItemsVal != null) {
            pItems = new ArrayList();
            
            jsonToValue(pItems, pItemsVal, L"IList", L"SamiShipmentItem");
        }
        delete pItemsKey;
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

SamiShipment::SamiShipment(String* json) {
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
SamiShipment::asJson ()
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
SamiShipment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pShipperKey = new JsonString(L"Shipper");
    pJsonObject->Add(pShipperKey, toJson(getPShipper(), "String", ""));

    JsonString *pDateShippedKey = new JsonString(L"DateShipped");
    pJsonObject->Add(pDateShippedKey, toJson(getPDateShipped(), "SamiDate", ""));

    JsonString *pTrackingNumberKey = new JsonString(L"TrackingNumber");
    pJsonObject->Add(pTrackingNumberKey, toJson(getPTrackingNumber(), "String", ""));

    JsonString *pCostKey = new JsonString(L"Cost");
    pJsonObject->Add(pCostKey, toJson(getPCost(), "Long", ""));

    JsonString *pItemsKey = new JsonString(L"Items");
    pJsonObject->Add(pItemsKey, toJson(getPItems(), "SamiShipmentItem", "array"));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiShipment::getPID() {
    return pID;
}
void
SamiShipment::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiShipment::getPShipper() {
    return pShipper;
}
void
SamiShipment::setPShipper(String* pShipper) {
    this->pShipper = pShipper;
}

SamiDate*
SamiShipment::getPDateShipped() {
    return pDateShipped;
}
void
SamiShipment::setPDateShipped(SamiDate* pDateShipped) {
    this->pDateShipped = pDateShipped;
}

String*
SamiShipment::getPTrackingNumber() {
    return pTrackingNumber;
}
void
SamiShipment::setPTrackingNumber(String* pTrackingNumber) {
    this->pTrackingNumber = pTrackingNumber;
}

Long*
SamiShipment::getPCost() {
    return pCost;
}
void
SamiShipment::setPCost(Long* pCost) {
    this->pCost = pCost;
}

IList*
SamiShipment::getPItems() {
    return pItems;
}
void
SamiShipment::setPItems(IList* pItems) {
    this->pItems = pItems;
}

SamiObject*
SamiShipment::getPXp() {
    return pXp;
}
void
SamiShipment::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

