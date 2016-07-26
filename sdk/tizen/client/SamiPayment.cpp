
#include "SamiPayment.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPayment::SamiPayment() {
    init();
}

SamiPayment::~SamiPayment() {
    this->cleanup();
}

void
SamiPayment::init() {
    pID = null;
pType = null;
pCreditCardID = null;
pSpendingAccountID = null;
pDescription = null;
pAmount = null;
pXp = null;
}

void
SamiPayment::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pType != null) {
        
        delete pType;
        pType = null;
    }
if(pCreditCardID != null) {
        
        delete pCreditCardID;
        pCreditCardID = null;
    }
if(pSpendingAccountID != null) {
        
        delete pSpendingAccountID;
        pSpendingAccountID = null;
    }
if(pDescription != null) {
        
        delete pDescription;
        pDescription = null;
    }
if(pAmount != null) {
        
        delete pAmount;
        pAmount = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiPayment*
SamiPayment::fromJson(String* json) {
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
SamiPayment::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pCreditCardIDKey = new JsonString(L"CreditCardID");
        IJsonValue* pCreditCardIDVal = null;
        pJsonObject->GetValue(pCreditCardIDKey, pCreditCardIDVal);
        if(pCreditCardIDVal != null) {
            
            pCreditCardID = new String();
            jsonToValue(pCreditCardID, pCreditCardIDVal, L"String", L"String");
        }
        delete pCreditCardIDKey;
JsonString* pSpendingAccountIDKey = new JsonString(L"SpendingAccountID");
        IJsonValue* pSpendingAccountIDVal = null;
        pJsonObject->GetValue(pSpendingAccountIDKey, pSpendingAccountIDVal);
        if(pSpendingAccountIDVal != null) {
            
            pSpendingAccountID = new String();
            jsonToValue(pSpendingAccountID, pSpendingAccountIDVal, L"String", L"String");
        }
        delete pSpendingAccountIDKey;
JsonString* pDescriptionKey = new JsonString(L"Description");
        IJsonValue* pDescriptionVal = null;
        pJsonObject->GetValue(pDescriptionKey, pDescriptionVal);
        if(pDescriptionVal != null) {
            
            pDescription = new String();
            jsonToValue(pDescription, pDescriptionVal, L"String", L"String");
        }
        delete pDescriptionKey;
JsonString* pAmountKey = new JsonString(L"Amount");
        IJsonValue* pAmountVal = null;
        pJsonObject->GetValue(pAmountKey, pAmountVal);
        if(pAmountVal != null) {
            
            pAmount = new Long();
            jsonToValue(pAmount, pAmountVal, L"Long", L"Long");
        }
        delete pAmountKey;
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

SamiPayment::SamiPayment(String* json) {
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
SamiPayment::asJson ()
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
SamiPayment::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pTypeKey = new JsonString(L"Type");
    pJsonObject->Add(pTypeKey, toJson(getPType(), "String", ""));

    JsonString *pCreditCardIDKey = new JsonString(L"CreditCardID");
    pJsonObject->Add(pCreditCardIDKey, toJson(getPCreditCardID(), "String", ""));

    JsonString *pSpendingAccountIDKey = new JsonString(L"SpendingAccountID");
    pJsonObject->Add(pSpendingAccountIDKey, toJson(getPSpendingAccountID(), "String", ""));

    JsonString *pDescriptionKey = new JsonString(L"Description");
    pJsonObject->Add(pDescriptionKey, toJson(getPDescription(), "String", ""));

    JsonString *pAmountKey = new JsonString(L"Amount");
    pJsonObject->Add(pAmountKey, toJson(getPAmount(), "Long", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiPayment::getPID() {
    return pID;
}
void
SamiPayment::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiPayment::getPType() {
    return pType;
}
void
SamiPayment::setPType(String* pType) {
    this->pType = pType;
}

String*
SamiPayment::getPCreditCardID() {
    return pCreditCardID;
}
void
SamiPayment::setPCreditCardID(String* pCreditCardID) {
    this->pCreditCardID = pCreditCardID;
}

String*
SamiPayment::getPSpendingAccountID() {
    return pSpendingAccountID;
}
void
SamiPayment::setPSpendingAccountID(String* pSpendingAccountID) {
    this->pSpendingAccountID = pSpendingAccountID;
}

String*
SamiPayment::getPDescription() {
    return pDescription;
}
void
SamiPayment::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

Long*
SamiPayment::getPAmount() {
    return pAmount;
}
void
SamiPayment::setPAmount(Long* pAmount) {
    this->pAmount = pAmount;
}

SamiObject*
SamiPayment::getPXp() {
    return pXp;
}
void
SamiPayment::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

