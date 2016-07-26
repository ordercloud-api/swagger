
#include "SamiPriceBreak.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPriceBreak::SamiPriceBreak() {
    init();
}

SamiPriceBreak::~SamiPriceBreak() {
    this->cleanup();
}

void
SamiPriceBreak::init() {
    pQuantity = null;
pPrice = null;
}

void
SamiPriceBreak::cleanup() {
    if(pQuantity != null) {
        
        delete pQuantity;
        pQuantity = null;
    }
if(pPrice != null) {
        
        delete pPrice;
        pPrice = null;
    }
}


SamiPriceBreak*
SamiPriceBreak::fromJson(String* json) {
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
SamiPriceBreak::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pQuantityKey = new JsonString(L"Quantity");
        IJsonValue* pQuantityVal = null;
        pJsonObject->GetValue(pQuantityKey, pQuantityVal);
        if(pQuantityVal != null) {
            
            pQuantity = null;
            jsonToValue(pQuantity, pQuantityVal, L"Integer", L"Integer");
        }
        delete pQuantityKey;
JsonString* pPriceKey = new JsonString(L"Price");
        IJsonValue* pPriceVal = null;
        pJsonObject->GetValue(pPriceKey, pPriceVal);
        if(pPriceVal != null) {
            
            pPrice = new Long();
            jsonToValue(pPrice, pPriceVal, L"Long", L"Long");
        }
        delete pPriceKey;
    }
}

SamiPriceBreak::SamiPriceBreak(String* json) {
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
SamiPriceBreak::asJson ()
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
SamiPriceBreak::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pQuantityKey = new JsonString(L"Quantity");
    pJsonObject->Add(pQuantityKey, toJson(getPQuantity(), "Integer", ""));

    JsonString *pPriceKey = new JsonString(L"Price");
    pJsonObject->Add(pPriceKey, toJson(getPPrice(), "Long", ""));

    return pJsonObject;
}

Integer*
SamiPriceBreak::getPQuantity() {
    return pQuantity;
}
void
SamiPriceBreak::setPQuantity(Integer* pQuantity) {
    this->pQuantity = pQuantity;
}

Long*
SamiPriceBreak::getPPrice() {
    return pPrice;
}
void
SamiPriceBreak::setPPrice(Long* pPrice) {
    this->pPrice = pPrice;
}



} /* namespace Swagger */

