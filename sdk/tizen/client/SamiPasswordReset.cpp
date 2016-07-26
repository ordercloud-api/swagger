
#include "SamiPasswordReset.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPasswordReset::SamiPasswordReset() {
    init();
}

SamiPasswordReset::~SamiPasswordReset() {
    this->cleanup();
}

void
SamiPasswordReset::init() {
    pClientID = null;
pUsername = null;
pPassword = null;
}

void
SamiPasswordReset::cleanup() {
    if(pClientID != null) {
        
        delete pClientID;
        pClientID = null;
    }
if(pUsername != null) {
        
        delete pUsername;
        pUsername = null;
    }
if(pPassword != null) {
        
        delete pPassword;
        pPassword = null;
    }
}


SamiPasswordReset*
SamiPasswordReset::fromJson(String* json) {
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
SamiPasswordReset::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pClientIDKey = new JsonString(L"ClientID");
        IJsonValue* pClientIDVal = null;
        pJsonObject->GetValue(pClientIDKey, pClientIDVal);
        if(pClientIDVal != null) {
            
            pClientID = new String();
            jsonToValue(pClientID, pClientIDVal, L"String", L"String");
        }
        delete pClientIDKey;
JsonString* pUsernameKey = new JsonString(L"Username");
        IJsonValue* pUsernameVal = null;
        pJsonObject->GetValue(pUsernameKey, pUsernameVal);
        if(pUsernameVal != null) {
            
            pUsername = new String();
            jsonToValue(pUsername, pUsernameVal, L"String", L"String");
        }
        delete pUsernameKey;
JsonString* pPasswordKey = new JsonString(L"Password");
        IJsonValue* pPasswordVal = null;
        pJsonObject->GetValue(pPasswordKey, pPasswordVal);
        if(pPasswordVal != null) {
            
            pPassword = new String();
            jsonToValue(pPassword, pPasswordVal, L"String", L"String");
        }
        delete pPasswordKey;
    }
}

SamiPasswordReset::SamiPasswordReset(String* json) {
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
SamiPasswordReset::asJson ()
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
SamiPasswordReset::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pClientIDKey = new JsonString(L"ClientID");
    pJsonObject->Add(pClientIDKey, toJson(getPClientID(), "String", ""));

    JsonString *pUsernameKey = new JsonString(L"Username");
    pJsonObject->Add(pUsernameKey, toJson(getPUsername(), "String", ""));

    JsonString *pPasswordKey = new JsonString(L"Password");
    pJsonObject->Add(pPasswordKey, toJson(getPPassword(), "String", ""));

    return pJsonObject;
}

String*
SamiPasswordReset::getPClientID() {
    return pClientID;
}
void
SamiPasswordReset::setPClientID(String* pClientID) {
    this->pClientID = pClientID;
}

String*
SamiPasswordReset::getPUsername() {
    return pUsername;
}
void
SamiPasswordReset::setPUsername(String* pUsername) {
    this->pUsername = pUsername;
}

String*
SamiPasswordReset::getPPassword() {
    return pPassword;
}
void
SamiPasswordReset::setPPassword(String* pPassword) {
    this->pPassword = pPassword;
}



} /* namespace Swagger */

