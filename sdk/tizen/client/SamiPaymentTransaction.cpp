
#include "SamiPaymentTransaction.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPaymentTransaction::SamiPaymentTransaction() {
    init();
}

SamiPaymentTransaction::~SamiPaymentTransaction() {
    this->cleanup();
}

void
SamiPaymentTransaction::init() {
    pID = null;
pType = null;
pDateExecuted = null;
pAmount = null;
pSucceeded = null;
pResultCode = null;
pResultMessage = null;
pXp = null;
}

void
SamiPaymentTransaction::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pType != null) {
        
        delete pType;
        pType = null;
    }
if(pDateExecuted != null) {
        
        delete pDateExecuted;
        pDateExecuted = null;
    }
if(pAmount != null) {
        
        delete pAmount;
        pAmount = null;
    }
if(pSucceeded != null) {
        
        delete pSucceeded;
        pSucceeded = null;
    }
if(pResultCode != null) {
        
        delete pResultCode;
        pResultCode = null;
    }
if(pResultMessage != null) {
        
        delete pResultMessage;
        pResultMessage = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiPaymentTransaction*
SamiPaymentTransaction::fromJson(String* json) {
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
SamiPaymentTransaction::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pTypeKey = new JsonString(L"Type");
        IJsonValue* pTypeVal = null;
        pJsonObject->GetValue(pTypeKey, pTypeVal);
        if(pTypeVal != null) {
            
            pType = new String();
            jsonToValue(pType, pTypeVal, L"String", L"String");
        }
        delete pTypeKey;
JsonString* pDateExecutedKey = new JsonString(L"DateExecuted");
        IJsonValue* pDateExecutedVal = null;
        pJsonObject->GetValue(pDateExecutedKey, pDateExecutedVal);
        if(pDateExecutedVal != null) {
            
            pDateExecuted = new DateTime();
            jsonToValue(pDateExecuted, pDateExecutedVal, L"SamiDate", L"SamiDate");
        }
        delete pDateExecutedKey;
JsonString* pAmountKey = new JsonString(L"Amount");
        IJsonValue* pAmountVal = null;
        pJsonObject->GetValue(pAmountKey, pAmountVal);
        if(pAmountVal != null) {
            
            pAmount = new Long();
            jsonToValue(pAmount, pAmountVal, L"Long", L"Long");
        }
        delete pAmountKey;
JsonString* pSucceededKey = new JsonString(L"Succeeded");
        IJsonValue* pSucceededVal = null;
        pJsonObject->GetValue(pSucceededKey, pSucceededVal);
        if(pSucceededVal != null) {
            
            pSucceeded = new Boolean(false);
            jsonToValue(pSucceeded, pSucceededVal, L"Boolean", L"Boolean");
        }
        delete pSucceededKey;
JsonString* pResultCodeKey = new JsonString(L"ResultCode");
        IJsonValue* pResultCodeVal = null;
        pJsonObject->GetValue(pResultCodeKey, pResultCodeVal);
        if(pResultCodeVal != null) {
            
            pResultCode = new String();
            jsonToValue(pResultCode, pResultCodeVal, L"String", L"String");
        }
        delete pResultCodeKey;
JsonString* pResultMessageKey = new JsonString(L"ResultMessage");
        IJsonValue* pResultMessageVal = null;
        pJsonObject->GetValue(pResultMessageKey, pResultMessageVal);
        if(pResultMessageVal != null) {
            
            pResultMessage = new String();
            jsonToValue(pResultMessage, pResultMessageVal, L"String", L"String");
        }
        delete pResultMessageKey;
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

SamiPaymentTransaction::SamiPaymentTransaction(String* json) {
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
SamiPaymentTransaction::asJson ()
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
SamiPaymentTransaction::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pTypeKey = new JsonString(L"Type");
    pJsonObject->Add(pTypeKey, toJson(getPType(), "String", ""));

    JsonString *pDateExecutedKey = new JsonString(L"DateExecuted");
    pJsonObject->Add(pDateExecutedKey, toJson(getPDateExecuted(), "SamiDate", ""));

    JsonString *pAmountKey = new JsonString(L"Amount");
    pJsonObject->Add(pAmountKey, toJson(getPAmount(), "Long", ""));

    JsonString *pSucceededKey = new JsonString(L"Succeeded");
    pJsonObject->Add(pSucceededKey, toJson(getPSucceeded(), "Boolean", ""));

    JsonString *pResultCodeKey = new JsonString(L"ResultCode");
    pJsonObject->Add(pResultCodeKey, toJson(getPResultCode(), "String", ""));

    JsonString *pResultMessageKey = new JsonString(L"ResultMessage");
    pJsonObject->Add(pResultMessageKey, toJson(getPResultMessage(), "String", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiPaymentTransaction::getPID() {
    return pID;
}
void
SamiPaymentTransaction::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiPaymentTransaction::getPType() {
    return pType;
}
void
SamiPaymentTransaction::setPType(String* pType) {
    this->pType = pType;
}

SamiDate*
SamiPaymentTransaction::getPDateExecuted() {
    return pDateExecuted;
}
void
SamiPaymentTransaction::setPDateExecuted(SamiDate* pDateExecuted) {
    this->pDateExecuted = pDateExecuted;
}

Long*
SamiPaymentTransaction::getPAmount() {
    return pAmount;
}
void
SamiPaymentTransaction::setPAmount(Long* pAmount) {
    this->pAmount = pAmount;
}

Boolean*
SamiPaymentTransaction::getPSucceeded() {
    return pSucceeded;
}
void
SamiPaymentTransaction::setPSucceeded(Boolean* pSucceeded) {
    this->pSucceeded = pSucceeded;
}

String*
SamiPaymentTransaction::getPResultCode() {
    return pResultCode;
}
void
SamiPaymentTransaction::setPResultCode(String* pResultCode) {
    this->pResultCode = pResultCode;
}

String*
SamiPaymentTransaction::getPResultMessage() {
    return pResultMessage;
}
void
SamiPaymentTransaction::setPResultMessage(String* pResultMessage) {
    this->pResultMessage = pResultMessage;
}

SamiObject*
SamiPaymentTransaction::getPXp() {
    return pXp;
}
void
SamiPaymentTransaction::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

