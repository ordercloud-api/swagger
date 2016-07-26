
#include "SamiPasswordResetRequest.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPasswordResetRequest::SamiPasswordResetRequest() {
    init();
}

SamiPasswordResetRequest::~SamiPasswordResetRequest() {
    this->cleanup();
}

void
SamiPasswordResetRequest::init() {
    pClientID = null;
pEmail = null;
pUsername = null;
pURL = null;
}

void
SamiPasswordResetRequest::cleanup() {
    if(pClientID != null) {
        
        delete pClientID;
        pClientID = null;
    }
if(pEmail != null) {
        
        delete pEmail;
        pEmail = null;
    }
if(pUsername != null) {
        
        delete pUsername;
        pUsername = null;
    }
if(pURL != null) {
        
        delete pURL;
        pURL = null;
    }
}


SamiPasswordResetRequest*
SamiPasswordResetRequest::fromJson(String* json) {
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
SamiPasswordResetRequest::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pEmailKey = new JsonString(L"Email");
        IJsonValue* pEmailVal = null;
        pJsonObject->GetValue(pEmailKey, pEmailVal);
        if(pEmailVal != null) {
            
            pEmail = new String();
            jsonToValue(pEmail, pEmailVal, L"String", L"String");
        }
        delete pEmailKey;
JsonString* pUsernameKey = new JsonString(L"Username");
        IJsonValue* pUsernameVal = null;
        pJsonObject->GetValue(pUsernameKey, pUsernameVal);
        if(pUsernameVal != null) {
            
            pUsername = new String();
            jsonToValue(pUsername, pUsernameVal, L"String", L"String");
        }
        delete pUsernameKey;
JsonString* pURLKey = new JsonString(L"URL");
        IJsonValue* pURLVal = null;
        pJsonObject->GetValue(pURLKey, pURLVal);
        if(pURLVal != null) {
            
            pURL = new String();
            jsonToValue(pURL, pURLVal, L"String", L"String");
        }
        delete pURLKey;
    }
}

SamiPasswordResetRequest::SamiPasswordResetRequest(String* json) {
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
SamiPasswordResetRequest::asJson ()
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
SamiPasswordResetRequest::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pClientIDKey = new JsonString(L"ClientID");
    pJsonObject->Add(pClientIDKey, toJson(getPClientID(), "String", ""));

    JsonString *pEmailKey = new JsonString(L"Email");
    pJsonObject->Add(pEmailKey, toJson(getPEmail(), "String", ""));

    JsonString *pUsernameKey = new JsonString(L"Username");
    pJsonObject->Add(pUsernameKey, toJson(getPUsername(), "String", ""));

    JsonString *pURLKey = new JsonString(L"URL");
    pJsonObject->Add(pURLKey, toJson(getPURL(), "String", ""));

    return pJsonObject;
}

String*
SamiPasswordResetRequest::getPClientID() {
    return pClientID;
}
void
SamiPasswordResetRequest::setPClientID(String* pClientID) {
    this->pClientID = pClientID;
}

String*
SamiPasswordResetRequest::getPEmail() {
    return pEmail;
}
void
SamiPasswordResetRequest::setPEmail(String* pEmail) {
    this->pEmail = pEmail;
}

String*
SamiPasswordResetRequest::getPUsername() {
    return pUsername;
}
void
SamiPasswordResetRequest::setPUsername(String* pUsername) {
    this->pUsername = pUsername;
}

String*
SamiPasswordResetRequest::getPURL() {
    return pURL;
}
void
SamiPasswordResetRequest::setPURL(String* pURL) {
    this->pURL = pURL;
}



} /* namespace Swagger */

