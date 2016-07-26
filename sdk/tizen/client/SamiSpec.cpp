
#include "SamiSpec.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiSpec::SamiSpec() {
    init();
}

SamiSpec::~SamiSpec() {
    this->cleanup();
}

void
SamiSpec::init() {
    pID = null;
pListOrder = null;
pName = null;
pDefaultValue = null;
pRequired = null;
pAllowOpenText = null;
pDefaultOptionID = null;
pXp = null;
}

void
SamiSpec::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pListOrder != null) {
        
        delete pListOrder;
        pListOrder = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pDefaultValue != null) {
        
        delete pDefaultValue;
        pDefaultValue = null;
    }
if(pRequired != null) {
        
        delete pRequired;
        pRequired = null;
    }
if(pAllowOpenText != null) {
        
        delete pAllowOpenText;
        pAllowOpenText = null;
    }
if(pDefaultOptionID != null) {
        
        delete pDefaultOptionID;
        pDefaultOptionID = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiSpec*
SamiSpec::fromJson(String* json) {
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
SamiSpec::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pListOrderKey = new JsonString(L"ListOrder");
        IJsonValue* pListOrderVal = null;
        pJsonObject->GetValue(pListOrderKey, pListOrderVal);
        if(pListOrderVal != null) {
            
            pListOrder = null;
            jsonToValue(pListOrder, pListOrderVal, L"Integer", L"Integer");
        }
        delete pListOrderKey;
JsonString* pNameKey = new JsonString(L"Name");
        IJsonValue* pNameVal = null;
        pJsonObject->GetValue(pNameKey, pNameVal);
        if(pNameVal != null) {
            
            pName = new String();
            jsonToValue(pName, pNameVal, L"String", L"String");
        }
        delete pNameKey;
JsonString* pDefaultValueKey = new JsonString(L"DefaultValue");
        IJsonValue* pDefaultValueVal = null;
        pJsonObject->GetValue(pDefaultValueKey, pDefaultValueVal);
        if(pDefaultValueVal != null) {
            
            pDefaultValue = new String();
            jsonToValue(pDefaultValue, pDefaultValueVal, L"String", L"String");
        }
        delete pDefaultValueKey;
JsonString* pRequiredKey = new JsonString(L"Required");
        IJsonValue* pRequiredVal = null;
        pJsonObject->GetValue(pRequiredKey, pRequiredVal);
        if(pRequiredVal != null) {
            
            pRequired = new Boolean(false);
            jsonToValue(pRequired, pRequiredVal, L"Boolean", L"Boolean");
        }
        delete pRequiredKey;
JsonString* pAllowOpenTextKey = new JsonString(L"AllowOpenText");
        IJsonValue* pAllowOpenTextVal = null;
        pJsonObject->GetValue(pAllowOpenTextKey, pAllowOpenTextVal);
        if(pAllowOpenTextVal != null) {
            
            pAllowOpenText = new Boolean(false);
            jsonToValue(pAllowOpenText, pAllowOpenTextVal, L"Boolean", L"Boolean");
        }
        delete pAllowOpenTextKey;
JsonString* pDefaultOptionIDKey = new JsonString(L"DefaultOptionID");
        IJsonValue* pDefaultOptionIDVal = null;
        pJsonObject->GetValue(pDefaultOptionIDKey, pDefaultOptionIDVal);
        if(pDefaultOptionIDVal != null) {
            
            pDefaultOptionID = new String();
            jsonToValue(pDefaultOptionID, pDefaultOptionIDVal, L"String", L"String");
        }
        delete pDefaultOptionIDKey;
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

SamiSpec::SamiSpec(String* json) {
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
SamiSpec::asJson ()
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
SamiSpec::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pListOrderKey = new JsonString(L"ListOrder");
    pJsonObject->Add(pListOrderKey, toJson(getPListOrder(), "Integer", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pDefaultValueKey = new JsonString(L"DefaultValue");
    pJsonObject->Add(pDefaultValueKey, toJson(getPDefaultValue(), "String", ""));

    JsonString *pRequiredKey = new JsonString(L"Required");
    pJsonObject->Add(pRequiredKey, toJson(getPRequired(), "Boolean", ""));

    JsonString *pAllowOpenTextKey = new JsonString(L"AllowOpenText");
    pJsonObject->Add(pAllowOpenTextKey, toJson(getPAllowOpenText(), "Boolean", ""));

    JsonString *pDefaultOptionIDKey = new JsonString(L"DefaultOptionID");
    pJsonObject->Add(pDefaultOptionIDKey, toJson(getPDefaultOptionID(), "String", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiSpec::getPID() {
    return pID;
}
void
SamiSpec::setPID(String* pID) {
    this->pID = pID;
}

Integer*
SamiSpec::getPListOrder() {
    return pListOrder;
}
void
SamiSpec::setPListOrder(Integer* pListOrder) {
    this->pListOrder = pListOrder;
}

String*
SamiSpec::getPName() {
    return pName;
}
void
SamiSpec::setPName(String* pName) {
    this->pName = pName;
}

String*
SamiSpec::getPDefaultValue() {
    return pDefaultValue;
}
void
SamiSpec::setPDefaultValue(String* pDefaultValue) {
    this->pDefaultValue = pDefaultValue;
}

Boolean*
SamiSpec::getPRequired() {
    return pRequired;
}
void
SamiSpec::setPRequired(Boolean* pRequired) {
    this->pRequired = pRequired;
}

Boolean*
SamiSpec::getPAllowOpenText() {
    return pAllowOpenText;
}
void
SamiSpec::setPAllowOpenText(Boolean* pAllowOpenText) {
    this->pAllowOpenText = pAllowOpenText;
}

String*
SamiSpec::getPDefaultOptionID() {
    return pDefaultOptionID;
}
void
SamiSpec::setPDefaultOptionID(String* pDefaultOptionID) {
    this->pDefaultOptionID = pDefaultOptionID;
}

SamiObject*
SamiSpec::getPXp() {
    return pXp;
}
void
SamiSpec::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

