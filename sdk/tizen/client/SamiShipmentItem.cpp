
#include "SamiShipmentItem.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiShipmentItem::SamiShipmentItem() {
    init();
}

SamiShipmentItem::~SamiShipmentItem() {
    this->cleanup();
}

void
SamiShipmentItem::init() {
    pOrderID = null;
pLineItemID = null;
pQuantityShipped = null;
}

void
SamiShipmentItem::cleanup() {
    if(pOrderID != null) {
        
        delete pOrderID;
        pOrderID = null;
    }
if(pLineItemID != null) {
        
        delete pLineItemID;
        pLineItemID = null;
    }
if(pQuantityShipped != null) {
        
        delete pQuantityShipped;
        pQuantityShipped = null;
    }
}


SamiShipmentItem*
SamiShipmentItem::fromJson(String* json) {
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
SamiShipmentItem::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pOrderIDKey = new JsonString(L"OrderID");
        IJsonValue* pOrderIDVal = null;
        pJsonObject->GetValue(pOrderIDKey, pOrderIDVal);
        if(pOrderIDVal != null) {
            
            pOrderID = new String();
            jsonToValue(pOrderID, pOrderIDVal, L"String", L"String");
        }
        delete pOrderIDKey;
JsonString* pLineItemIDKey = new JsonString(L"LineItemID");
        IJsonValue* pLineItemIDVal = null;
        pJsonObject->GetValue(pLineItemIDKey, pLineItemIDVal);
        if(pLineItemIDVal != null) {
            
            pLineItemID = new String();
            jsonToValue(pLineItemID, pLineItemIDVal, L"String", L"String");
        }
        delete pLineItemIDKey;
JsonString* pQuantityShippedKey = new JsonString(L"QuantityShipped");
        IJsonValue* pQuantityShippedVal = null;
        pJsonObject->GetValue(pQuantityShippedKey, pQuantityShippedVal);
        if(pQuantityShippedVal != null) {
            
            pQuantityShipped = null;
            jsonToValue(pQuantityShipped, pQuantityShippedVal, L"Integer", L"Integer");
        }
        delete pQuantityShippedKey;
    }
}

SamiShipmentItem::SamiShipmentItem(String* json) {
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
SamiShipmentItem::asJson ()
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
SamiShipmentItem::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pOrderIDKey = new JsonString(L"OrderID");
    pJsonObject->Add(pOrderIDKey, toJson(getPOrderID(), "String", ""));

    JsonString *pLineItemIDKey = new JsonString(L"LineItemID");
    pJsonObject->Add(pLineItemIDKey, toJson(getPLineItemID(), "String", ""));

    JsonString *pQuantityShippedKey = new JsonString(L"QuantityShipped");
    pJsonObject->Add(pQuantityShippedKey, toJson(getPQuantityShipped(), "Integer", ""));

    return pJsonObject;
}

String*
SamiShipmentItem::getPOrderID() {
    return pOrderID;
}
void
SamiShipmentItem::setPOrderID(String* pOrderID) {
    this->pOrderID = pOrderID;
}

String*
SamiShipmentItem::getPLineItemID() {
    return pLineItemID;
}
void
SamiShipmentItem::setPLineItemID(String* pLineItemID) {
    this->pLineItemID = pLineItemID;
}

Integer*
SamiShipmentItem::getPQuantityShipped() {
    return pQuantityShipped;
}
void
SamiShipmentItem::setPQuantityShipped(Integer* pQuantityShipped) {
    this->pQuantityShipped = pQuantityShipped;
}



} /* namespace Swagger */

