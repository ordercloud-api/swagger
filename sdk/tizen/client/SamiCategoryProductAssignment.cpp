
#include "SamiCategoryProductAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCategoryProductAssignment::SamiCategoryProductAssignment() {
    init();
}

SamiCategoryProductAssignment::~SamiCategoryProductAssignment() {
    this->cleanup();
}

void
SamiCategoryProductAssignment::init() {
    pCategoryID = null;
pProductID = null;
pListOrder = null;
}

void
SamiCategoryProductAssignment::cleanup() {
    if(pCategoryID != null) {
        
        delete pCategoryID;
        pCategoryID = null;
    }
if(pProductID != null) {
        
        delete pProductID;
        pProductID = null;
    }
if(pListOrder != null) {
        
        delete pListOrder;
        pListOrder = null;
    }
}


SamiCategoryProductAssignment*
SamiCategoryProductAssignment::fromJson(String* json) {
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
SamiCategoryProductAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pCategoryIDKey = new JsonString(L"CategoryID");
        IJsonValue* pCategoryIDVal = null;
        pJsonObject->GetValue(pCategoryIDKey, pCategoryIDVal);
        if(pCategoryIDVal != null) {
            
            pCategoryID = new String();
            jsonToValue(pCategoryID, pCategoryIDVal, L"String", L"String");
        }
        delete pCategoryIDKey;
JsonString* pProductIDKey = new JsonString(L"ProductID");
        IJsonValue* pProductIDVal = null;
        pJsonObject->GetValue(pProductIDKey, pProductIDVal);
        if(pProductIDVal != null) {
            
            pProductID = new String();
            jsonToValue(pProductID, pProductIDVal, L"String", L"String");
        }
        delete pProductIDKey;
JsonString* pListOrderKey = new JsonString(L"ListOrder");
        IJsonValue* pListOrderVal = null;
        pJsonObject->GetValue(pListOrderKey, pListOrderVal);
        if(pListOrderVal != null) {
            
            pListOrder = null;
            jsonToValue(pListOrder, pListOrderVal, L"Integer", L"Integer");
        }
        delete pListOrderKey;
    }
}

SamiCategoryProductAssignment::SamiCategoryProductAssignment(String* json) {
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
SamiCategoryProductAssignment::asJson ()
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
SamiCategoryProductAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pCategoryIDKey = new JsonString(L"CategoryID");
    pJsonObject->Add(pCategoryIDKey, toJson(getPCategoryID(), "String", ""));

    JsonString *pProductIDKey = new JsonString(L"ProductID");
    pJsonObject->Add(pProductIDKey, toJson(getPProductID(), "String", ""));

    JsonString *pListOrderKey = new JsonString(L"ListOrder");
    pJsonObject->Add(pListOrderKey, toJson(getPListOrder(), "Integer", ""));

    return pJsonObject;
}

String*
SamiCategoryProductAssignment::getPCategoryID() {
    return pCategoryID;
}
void
SamiCategoryProductAssignment::setPCategoryID(String* pCategoryID) {
    this->pCategoryID = pCategoryID;
}

String*
SamiCategoryProductAssignment::getPProductID() {
    return pProductID;
}
void
SamiCategoryProductAssignment::setPProductID(String* pProductID) {
    this->pProductID = pProductID;
}

Integer*
SamiCategoryProductAssignment::getPListOrder() {
    return pListOrder;
}
void
SamiCategoryProductAssignment::setPListOrder(Integer* pListOrder) {
    this->pListOrder = pListOrder;
}



} /* namespace Swagger */

