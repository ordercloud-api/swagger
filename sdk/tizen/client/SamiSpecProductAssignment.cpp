
#include "SamiSpecProductAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiSpecProductAssignment::SamiSpecProductAssignment() {
    init();
}

SamiSpecProductAssignment::~SamiSpecProductAssignment() {
    this->cleanup();
}

void
SamiSpecProductAssignment::init() {
    pSpecID = null;
pProductID = null;
pDefinesVariant = null;
}

void
SamiSpecProductAssignment::cleanup() {
    if(pSpecID != null) {
        
        delete pSpecID;
        pSpecID = null;
    }
if(pProductID != null) {
        
        delete pProductID;
        pProductID = null;
    }
if(pDefinesVariant != null) {
        
        delete pDefinesVariant;
        pDefinesVariant = null;
    }
}


SamiSpecProductAssignment*
SamiSpecProductAssignment::fromJson(String* json) {
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
SamiSpecProductAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pSpecIDKey = new JsonString(L"SpecID");
        IJsonValue* pSpecIDVal = null;
        pJsonObject->GetValue(pSpecIDKey, pSpecIDVal);
        if(pSpecIDVal != null) {
            
            pSpecID = new String();
            jsonToValue(pSpecID, pSpecIDVal, L"String", L"String");
        }
        delete pSpecIDKey;
JsonString* pProductIDKey = new JsonString(L"ProductID");
        IJsonValue* pProductIDVal = null;
        pJsonObject->GetValue(pProductIDKey, pProductIDVal);
        if(pProductIDVal != null) {
            
            pProductID = new String();
            jsonToValue(pProductID, pProductIDVal, L"String", L"String");
        }
        delete pProductIDKey;
JsonString* pDefinesVariantKey = new JsonString(L"DefinesVariant");
        IJsonValue* pDefinesVariantVal = null;
        pJsonObject->GetValue(pDefinesVariantKey, pDefinesVariantVal);
        if(pDefinesVariantVal != null) {
            
            pDefinesVariant = new Boolean(false);
            jsonToValue(pDefinesVariant, pDefinesVariantVal, L"Boolean", L"Boolean");
        }
        delete pDefinesVariantKey;
    }
}

SamiSpecProductAssignment::SamiSpecProductAssignment(String* json) {
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
SamiSpecProductAssignment::asJson ()
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
SamiSpecProductAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pSpecIDKey = new JsonString(L"SpecID");
    pJsonObject->Add(pSpecIDKey, toJson(getPSpecID(), "String", ""));

    JsonString *pProductIDKey = new JsonString(L"ProductID");
    pJsonObject->Add(pProductIDKey, toJson(getPProductID(), "String", ""));

    JsonString *pDefinesVariantKey = new JsonString(L"DefinesVariant");
    pJsonObject->Add(pDefinesVariantKey, toJson(getPDefinesVariant(), "Boolean", ""));

    return pJsonObject;
}

String*
SamiSpecProductAssignment::getPSpecID() {
    return pSpecID;
}
void
SamiSpecProductAssignment::setPSpecID(String* pSpecID) {
    this->pSpecID = pSpecID;
}

String*
SamiSpecProductAssignment::getPProductID() {
    return pProductID;
}
void
SamiSpecProductAssignment::setPProductID(String* pProductID) {
    this->pProductID = pProductID;
}

Boolean*
SamiSpecProductAssignment::getPDefinesVariant() {
    return pDefinesVariant;
}
void
SamiSpecProductAssignment::setPDefinesVariant(Boolean* pDefinesVariant) {
    this->pDefinesVariant = pDefinesVariant;
}



} /* namespace Swagger */

