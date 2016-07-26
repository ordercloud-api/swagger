
#include "SamiCategory.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCategory::SamiCategory() {
    init();
}

SamiCategory::~SamiCategory() {
    this->cleanup();
}

void
SamiCategory::init() {
    pID = null;
pName = null;
pDescription = null;
pXp = null;
pListOrder = null;
pActive = null;
pParentID = null;
}

void
SamiCategory::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pDescription != null) {
        
        delete pDescription;
        pDescription = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
if(pListOrder != null) {
        
        delete pListOrder;
        pListOrder = null;
    }
if(pActive != null) {
        
        delete pActive;
        pActive = null;
    }
if(pParentID != null) {
        
        delete pParentID;
        pParentID = null;
    }
}


SamiCategory*
SamiCategory::fromJson(String* json) {
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
SamiCategory::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pDescriptionKey = new JsonString(L"Description");
        IJsonValue* pDescriptionVal = null;
        pJsonObject->GetValue(pDescriptionKey, pDescriptionVal);
        if(pDescriptionVal != null) {
            
            pDescription = new String();
            jsonToValue(pDescription, pDescriptionVal, L"String", L"String");
        }
        delete pDescriptionKey;
JsonString* pXpKey = new JsonString(L"xp");
        IJsonValue* pXpVal = null;
        pJsonObject->GetValue(pXpKey, pXpVal);
        if(pXpVal != null) {
            
            pXp = null;
            jsonToValue(pXp, pXpVal, L"SamiObject", L"SamiObject");
        }
        delete pXpKey;
JsonString* pListOrderKey = new JsonString(L"ListOrder");
        IJsonValue* pListOrderVal = null;
        pJsonObject->GetValue(pListOrderKey, pListOrderVal);
        if(pListOrderVal != null) {
            
            pListOrder = null;
            jsonToValue(pListOrder, pListOrderVal, L"Integer", L"Integer");
        }
        delete pListOrderKey;
JsonString* pActiveKey = new JsonString(L"Active");
        IJsonValue* pActiveVal = null;
        pJsonObject->GetValue(pActiveKey, pActiveVal);
        if(pActiveVal != null) {
            
            pActive = new Boolean(false);
            jsonToValue(pActive, pActiveVal, L"Boolean", L"Boolean");
        }
        delete pActiveKey;
JsonString* pParentIDKey = new JsonString(L"ParentID");
        IJsonValue* pParentIDVal = null;
        pJsonObject->GetValue(pParentIDKey, pParentIDVal);
        if(pParentIDVal != null) {
            
            pParentID = new String();
            jsonToValue(pParentID, pParentIDVal, L"String", L"String");
        }
        delete pParentIDKey;
    }
}

SamiCategory::SamiCategory(String* json) {
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
SamiCategory::asJson ()
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
SamiCategory::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pDescriptionKey = new JsonString(L"Description");
    pJsonObject->Add(pDescriptionKey, toJson(getPDescription(), "String", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    JsonString *pListOrderKey = new JsonString(L"ListOrder");
    pJsonObject->Add(pListOrderKey, toJson(getPListOrder(), "Integer", ""));

    JsonString *pActiveKey = new JsonString(L"Active");
    pJsonObject->Add(pActiveKey, toJson(getPActive(), "Boolean", ""));

    JsonString *pParentIDKey = new JsonString(L"ParentID");
    pJsonObject->Add(pParentIDKey, toJson(getPParentID(), "String", ""));

    return pJsonObject;
}

String*
SamiCategory::getPID() {
    return pID;
}
void
SamiCategory::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiCategory::getPName() {
    return pName;
}
void
SamiCategory::setPName(String* pName) {
    this->pName = pName;
}

String*
SamiCategory::getPDescription() {
    return pDescription;
}
void
SamiCategory::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

SamiObject*
SamiCategory::getPXp() {
    return pXp;
}
void
SamiCategory::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}

Integer*
SamiCategory::getPListOrder() {
    return pListOrder;
}
void
SamiCategory::setPListOrder(Integer* pListOrder) {
    this->pListOrder = pListOrder;
}

Boolean*
SamiCategory::getPActive() {
    return pActive;
}
void
SamiCategory::setPActive(Boolean* pActive) {
    this->pActive = pActive;
}

String*
SamiCategory::getPParentID() {
    return pParentID;
}
void
SamiCategory::setPParentID(String* pParentID) {
    this->pParentID = pParentID;
}



} /* namespace Swagger */

