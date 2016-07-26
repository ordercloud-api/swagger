
#include "SamiSpecOption.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiSpecOption::SamiSpecOption() {
    init();
}

SamiSpecOption::~SamiSpecOption() {
    this->cleanup();
}

void
SamiSpecOption::init() {
    pID = null;
pValue = null;
pListOrder = null;
pIsOpenText = null;
pPriceMarkupType = null;
pPriceMarkup = null;
pXp = null;
}

void
SamiSpecOption::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pValue != null) {
        
        delete pValue;
        pValue = null;
    }
if(pListOrder != null) {
        
        delete pListOrder;
        pListOrder = null;
    }
if(pIsOpenText != null) {
        
        delete pIsOpenText;
        pIsOpenText = null;
    }
if(pPriceMarkupType != null) {
        
        delete pPriceMarkupType;
        pPriceMarkupType = null;
    }
if(pPriceMarkup != null) {
        
        delete pPriceMarkup;
        pPriceMarkup = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiSpecOption*
SamiSpecOption::fromJson(String* json) {
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
SamiSpecOption::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pValueKey = new JsonString(L"Value");
        IJsonValue* pValueVal = null;
        pJsonObject->GetValue(pValueKey, pValueVal);
        if(pValueVal != null) {
            
            pValue = new String();
            jsonToValue(pValue, pValueVal, L"String", L"String");
        }
        delete pValueKey;
JsonString* pListOrderKey = new JsonString(L"ListOrder");
        IJsonValue* pListOrderVal = null;
        pJsonObject->GetValue(pListOrderKey, pListOrderVal);
        if(pListOrderVal != null) {
            
            pListOrder = null;
            jsonToValue(pListOrder, pListOrderVal, L"Integer", L"Integer");
        }
        delete pListOrderKey;
JsonString* pIsOpenTextKey = new JsonString(L"IsOpenText");
        IJsonValue* pIsOpenTextVal = null;
        pJsonObject->GetValue(pIsOpenTextKey, pIsOpenTextVal);
        if(pIsOpenTextVal != null) {
            
            pIsOpenText = new Boolean(false);
            jsonToValue(pIsOpenText, pIsOpenTextVal, L"Boolean", L"Boolean");
        }
        delete pIsOpenTextKey;
JsonString* pPriceMarkupTypeKey = new JsonString(L"PriceMarkupType");
        IJsonValue* pPriceMarkupTypeVal = null;
        pJsonObject->GetValue(pPriceMarkupTypeKey, pPriceMarkupTypeVal);
        if(pPriceMarkupTypeVal != null) {
            
            pPriceMarkupType = new String();
            jsonToValue(pPriceMarkupType, pPriceMarkupTypeVal, L"String", L"String");
        }
        delete pPriceMarkupTypeKey;
JsonString* pPriceMarkupKey = new JsonString(L"PriceMarkup");
        IJsonValue* pPriceMarkupVal = null;
        pJsonObject->GetValue(pPriceMarkupKey, pPriceMarkupVal);
        if(pPriceMarkupVal != null) {
            
            pPriceMarkup = new Long();
            jsonToValue(pPriceMarkup, pPriceMarkupVal, L"Long", L"Long");
        }
        delete pPriceMarkupKey;
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

SamiSpecOption::SamiSpecOption(String* json) {
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
SamiSpecOption::asJson ()
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
SamiSpecOption::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pValueKey = new JsonString(L"Value");
    pJsonObject->Add(pValueKey, toJson(getPValue(), "String", ""));

    JsonString *pListOrderKey = new JsonString(L"ListOrder");
    pJsonObject->Add(pListOrderKey, toJson(getPListOrder(), "Integer", ""));

    JsonString *pIsOpenTextKey = new JsonString(L"IsOpenText");
    pJsonObject->Add(pIsOpenTextKey, toJson(getPIsOpenText(), "Boolean", ""));

    JsonString *pPriceMarkupTypeKey = new JsonString(L"PriceMarkupType");
    pJsonObject->Add(pPriceMarkupTypeKey, toJson(getPPriceMarkupType(), "String", ""));

    JsonString *pPriceMarkupKey = new JsonString(L"PriceMarkup");
    pJsonObject->Add(pPriceMarkupKey, toJson(getPPriceMarkup(), "Long", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiSpecOption::getPID() {
    return pID;
}
void
SamiSpecOption::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiSpecOption::getPValue() {
    return pValue;
}
void
SamiSpecOption::setPValue(String* pValue) {
    this->pValue = pValue;
}

Integer*
SamiSpecOption::getPListOrder() {
    return pListOrder;
}
void
SamiSpecOption::setPListOrder(Integer* pListOrder) {
    this->pListOrder = pListOrder;
}

Boolean*
SamiSpecOption::getPIsOpenText() {
    return pIsOpenText;
}
void
SamiSpecOption::setPIsOpenText(Boolean* pIsOpenText) {
    this->pIsOpenText = pIsOpenText;
}

String*
SamiSpecOption::getPPriceMarkupType() {
    return pPriceMarkupType;
}
void
SamiSpecOption::setPPriceMarkupType(String* pPriceMarkupType) {
    this->pPriceMarkupType = pPriceMarkupType;
}

Long*
SamiSpecOption::getPPriceMarkup() {
    return pPriceMarkup;
}
void
SamiSpecOption::setPPriceMarkup(Long* pPriceMarkup) {
    this->pPriceMarkup = pPriceMarkup;
}

SamiObject*
SamiSpecOption::getPXp() {
    return pXp;
}
void
SamiSpecOption::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

