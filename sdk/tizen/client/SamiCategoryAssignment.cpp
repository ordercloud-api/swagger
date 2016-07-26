
#include "SamiCategoryAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCategoryAssignment::SamiCategoryAssignment() {
    init();
}

SamiCategoryAssignment::~SamiCategoryAssignment() {
    this->cleanup();
}

void
SamiCategoryAssignment::init() {
    pCategoryID = null;
pUserID = null;
pUserGroupID = null;
}

void
SamiCategoryAssignment::cleanup() {
    if(pCategoryID != null) {
        
        delete pCategoryID;
        pCategoryID = null;
    }
if(pUserID != null) {
        
        delete pUserID;
        pUserID = null;
    }
if(pUserGroupID != null) {
        
        delete pUserGroupID;
        pUserGroupID = null;
    }
}


SamiCategoryAssignment*
SamiCategoryAssignment::fromJson(String* json) {
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
SamiCategoryAssignment::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pUserIDKey = new JsonString(L"UserID");
        IJsonValue* pUserIDVal = null;
        pJsonObject->GetValue(pUserIDKey, pUserIDVal);
        if(pUserIDVal != null) {
            
            pUserID = new String();
            jsonToValue(pUserID, pUserIDVal, L"String", L"String");
        }
        delete pUserIDKey;
JsonString* pUserGroupIDKey = new JsonString(L"UserGroupID");
        IJsonValue* pUserGroupIDVal = null;
        pJsonObject->GetValue(pUserGroupIDKey, pUserGroupIDVal);
        if(pUserGroupIDVal != null) {
            
            pUserGroupID = new String();
            jsonToValue(pUserGroupID, pUserGroupIDVal, L"String", L"String");
        }
        delete pUserGroupIDKey;
    }
}

SamiCategoryAssignment::SamiCategoryAssignment(String* json) {
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
SamiCategoryAssignment::asJson ()
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
SamiCategoryAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pCategoryIDKey = new JsonString(L"CategoryID");
    pJsonObject->Add(pCategoryIDKey, toJson(getPCategoryID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    return pJsonObject;
}

String*
SamiCategoryAssignment::getPCategoryID() {
    return pCategoryID;
}
void
SamiCategoryAssignment::setPCategoryID(String* pCategoryID) {
    this->pCategoryID = pCategoryID;
}

String*
SamiCategoryAssignment::getPUserID() {
    return pUserID;
}
void
SamiCategoryAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiCategoryAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiCategoryAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}



} /* namespace Swagger */

