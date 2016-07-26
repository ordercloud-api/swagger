
#include "SamiCostCenterAssignment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCostCenterAssignment::SamiCostCenterAssignment() {
    init();
}

SamiCostCenterAssignment::~SamiCostCenterAssignment() {
    this->cleanup();
}

void
SamiCostCenterAssignment::init() {
    pCostCenterID = null;
pUserID = null;
pUserGroupID = null;
}

void
SamiCostCenterAssignment::cleanup() {
    if(pCostCenterID != null) {
        
        delete pCostCenterID;
        pCostCenterID = null;
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


SamiCostCenterAssignment*
SamiCostCenterAssignment::fromJson(String* json) {
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
SamiCostCenterAssignment::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pCostCenterIDKey = new JsonString(L"CostCenterID");
        IJsonValue* pCostCenterIDVal = null;
        pJsonObject->GetValue(pCostCenterIDKey, pCostCenterIDVal);
        if(pCostCenterIDVal != null) {
            
            pCostCenterID = new String();
            jsonToValue(pCostCenterID, pCostCenterIDVal, L"String", L"String");
        }
        delete pCostCenterIDKey;
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

SamiCostCenterAssignment::SamiCostCenterAssignment(String* json) {
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
SamiCostCenterAssignment::asJson ()
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
SamiCostCenterAssignment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pCostCenterIDKey = new JsonString(L"CostCenterID");
    pJsonObject->Add(pCostCenterIDKey, toJson(getPCostCenterID(), "String", ""));

    JsonString *pUserIDKey = new JsonString(L"UserID");
    pJsonObject->Add(pUserIDKey, toJson(getPUserID(), "String", ""));

    JsonString *pUserGroupIDKey = new JsonString(L"UserGroupID");
    pJsonObject->Add(pUserGroupIDKey, toJson(getPUserGroupID(), "String", ""));

    return pJsonObject;
}

String*
SamiCostCenterAssignment::getPCostCenterID() {
    return pCostCenterID;
}
void
SamiCostCenterAssignment::setPCostCenterID(String* pCostCenterID) {
    this->pCostCenterID = pCostCenterID;
}

String*
SamiCostCenterAssignment::getPUserID() {
    return pUserID;
}
void
SamiCostCenterAssignment::setPUserID(String* pUserID) {
    this->pUserID = pUserID;
}

String*
SamiCostCenterAssignment::getPUserGroupID() {
    return pUserGroupID;
}
void
SamiCostCenterAssignment::setPUserGroupID(String* pUserGroupID) {
    this->pUserGroupID = pUserGroupID;
}



} /* namespace Swagger */

