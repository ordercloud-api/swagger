
#include "SamiCostCenter.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCostCenter::SamiCostCenter() {
    init();
}

SamiCostCenter::~SamiCostCenter() {
    this->cleanup();
}

void
SamiCostCenter::init() {
    pID = null;
pName = null;
pDescription = null;
pXp = null;
}

void
SamiCostCenter::cleanup() {
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
}


SamiCostCenter*
SamiCostCenter::fromJson(String* json) {
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
SamiCostCenter::fromJsonObject(IJsonValue* pJson) {
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
    }
}

SamiCostCenter::SamiCostCenter(String* json) {
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
SamiCostCenter::asJson ()
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
SamiCostCenter::asJsonObject() {
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

    return pJsonObject;
}

String*
SamiCostCenter::getPID() {
    return pID;
}
void
SamiCostCenter::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiCostCenter::getPName() {
    return pName;
}
void
SamiCostCenter::setPName(String* pName) {
    this->pName = pName;
}

String*
SamiCostCenter::getPDescription() {
    return pDescription;
}
void
SamiCostCenter::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

SamiObject*
SamiCostCenter::getPXp() {
    return pXp;
}
void
SamiCostCenter::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

