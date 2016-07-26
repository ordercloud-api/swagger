
#include "SamiEmailTemplate.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiEmailTemplate::SamiEmailTemplate() {
    init();
}

SamiEmailTemplate::~SamiEmailTemplate() {
    this->cleanup();
}

void
SamiEmailTemplate::init() {
    pSubject = null;
pBody = null;
pReplyEmail = null;
pSendMessageType = null;
pEmailFormatType = null;
}

void
SamiEmailTemplate::cleanup() {
    if(pSubject != null) {
        
        delete pSubject;
        pSubject = null;
    }
if(pBody != null) {
        
        delete pBody;
        pBody = null;
    }
if(pReplyEmail != null) {
        
        delete pReplyEmail;
        pReplyEmail = null;
    }
if(pSendMessageType != null) {
        
        delete pSendMessageType;
        pSendMessageType = null;
    }
if(pEmailFormatType != null) {
        
        delete pEmailFormatType;
        pEmailFormatType = null;
    }
}


SamiEmailTemplate*
SamiEmailTemplate::fromJson(String* json) {
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
SamiEmailTemplate::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pSubjectKey = new JsonString(L"Subject");
        IJsonValue* pSubjectVal = null;
        pJsonObject->GetValue(pSubjectKey, pSubjectVal);
        if(pSubjectVal != null) {
            
            pSubject = new String();
            jsonToValue(pSubject, pSubjectVal, L"String", L"String");
        }
        delete pSubjectKey;
JsonString* pBodyKey = new JsonString(L"Body");
        IJsonValue* pBodyVal = null;
        pJsonObject->GetValue(pBodyKey, pBodyVal);
        if(pBodyVal != null) {
            
            pBody = new String();
            jsonToValue(pBody, pBodyVal, L"String", L"String");
        }
        delete pBodyKey;
JsonString* pReplyEmailKey = new JsonString(L"ReplyEmail");
        IJsonValue* pReplyEmailVal = null;
        pJsonObject->GetValue(pReplyEmailKey, pReplyEmailVal);
        if(pReplyEmailVal != null) {
            
            pReplyEmail = new String();
            jsonToValue(pReplyEmail, pReplyEmailVal, L"String", L"String");
        }
        delete pReplyEmailKey;
JsonString* pSendMessageTypeKey = new JsonString(L"SendMessageType");
        IJsonValue* pSendMessageTypeVal = null;
        pJsonObject->GetValue(pSendMessageTypeKey, pSendMessageTypeVal);
        if(pSendMessageTypeVal != null) {
            
            pSendMessageType = new Boolean(false);
            jsonToValue(pSendMessageType, pSendMessageTypeVal, L"Boolean", L"Boolean");
        }
        delete pSendMessageTypeKey;
JsonString* pEmailFormatTypeKey = new JsonString(L"EmailFormatType");
        IJsonValue* pEmailFormatTypeVal = null;
        pJsonObject->GetValue(pEmailFormatTypeKey, pEmailFormatTypeVal);
        if(pEmailFormatTypeVal != null) {
            
            pEmailFormatType = new String();
            jsonToValue(pEmailFormatType, pEmailFormatTypeVal, L"String", L"String");
        }
        delete pEmailFormatTypeKey;
    }
}

SamiEmailTemplate::SamiEmailTemplate(String* json) {
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
SamiEmailTemplate::asJson ()
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
SamiEmailTemplate::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pSubjectKey = new JsonString(L"Subject");
    pJsonObject->Add(pSubjectKey, toJson(getPSubject(), "String", ""));

    JsonString *pBodyKey = new JsonString(L"Body");
    pJsonObject->Add(pBodyKey, toJson(getPBody(), "String", ""));

    JsonString *pReplyEmailKey = new JsonString(L"ReplyEmail");
    pJsonObject->Add(pReplyEmailKey, toJson(getPReplyEmail(), "String", ""));

    JsonString *pSendMessageTypeKey = new JsonString(L"SendMessageType");
    pJsonObject->Add(pSendMessageTypeKey, toJson(getPSendMessageType(), "Boolean", ""));

    JsonString *pEmailFormatTypeKey = new JsonString(L"EmailFormatType");
    pJsonObject->Add(pEmailFormatTypeKey, toJson(getPEmailFormatType(), "String", ""));

    return pJsonObject;
}

String*
SamiEmailTemplate::getPSubject() {
    return pSubject;
}
void
SamiEmailTemplate::setPSubject(String* pSubject) {
    this->pSubject = pSubject;
}

String*
SamiEmailTemplate::getPBody() {
    return pBody;
}
void
SamiEmailTemplate::setPBody(String* pBody) {
    this->pBody = pBody;
}

String*
SamiEmailTemplate::getPReplyEmail() {
    return pReplyEmail;
}
void
SamiEmailTemplate::setPReplyEmail(String* pReplyEmail) {
    this->pReplyEmail = pReplyEmail;
}

Boolean*
SamiEmailTemplate::getPSendMessageType() {
    return pSendMessageType;
}
void
SamiEmailTemplate::setPSendMessageType(Boolean* pSendMessageType) {
    this->pSendMessageType = pSendMessageType;
}

String*
SamiEmailTemplate::getPEmailFormatType() {
    return pEmailFormatType;
}
void
SamiEmailTemplate::setPEmailFormatType(String* pEmailFormatType) {
    this->pEmailFormatType = pEmailFormatType;
}



} /* namespace Swagger */

