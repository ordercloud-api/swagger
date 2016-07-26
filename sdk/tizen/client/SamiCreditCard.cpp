
#include "SamiCreditCard.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiCreditCard::SamiCreditCard() {
    init();
}

SamiCreditCard::~SamiCreditCard() {
    this->cleanup();
}

void
SamiCreditCard::init() {
    pID = null;
pToken = null;
pCardType = null;
pPartialAccountNumber = null;
pCardholderName = null;
pExpirationDate = null;
pXp = null;
}

void
SamiCreditCard::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pToken != null) {
        
        delete pToken;
        pToken = null;
    }
if(pCardType != null) {
        
        delete pCardType;
        pCardType = null;
    }
if(pPartialAccountNumber != null) {
        
        delete pPartialAccountNumber;
        pPartialAccountNumber = null;
    }
if(pCardholderName != null) {
        
        delete pCardholderName;
        pCardholderName = null;
    }
if(pExpirationDate != null) {
        
        delete pExpirationDate;
        pExpirationDate = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiCreditCard*
SamiCreditCard::fromJson(String* json) {
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
SamiCreditCard::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pTokenKey = new JsonString(L"Token");
        IJsonValue* pTokenVal = null;
        pJsonObject->GetValue(pTokenKey, pTokenVal);
        if(pTokenVal != null) {
            
            pToken = new String();
            jsonToValue(pToken, pTokenVal, L"String", L"String");
        }
        delete pTokenKey;
JsonString* pCardTypeKey = new JsonString(L"CardType");
        IJsonValue* pCardTypeVal = null;
        pJsonObject->GetValue(pCardTypeKey, pCardTypeVal);
        if(pCardTypeVal != null) {
            
            pCardType = new String();
            jsonToValue(pCardType, pCardTypeVal, L"String", L"String");
        }
        delete pCardTypeKey;
JsonString* pPartialAccountNumberKey = new JsonString(L"PartialAccountNumber");
        IJsonValue* pPartialAccountNumberVal = null;
        pJsonObject->GetValue(pPartialAccountNumberKey, pPartialAccountNumberVal);
        if(pPartialAccountNumberVal != null) {
            
            pPartialAccountNumber = new String();
            jsonToValue(pPartialAccountNumber, pPartialAccountNumberVal, L"String", L"String");
        }
        delete pPartialAccountNumberKey;
JsonString* pCardholderNameKey = new JsonString(L"CardholderName");
        IJsonValue* pCardholderNameVal = null;
        pJsonObject->GetValue(pCardholderNameKey, pCardholderNameVal);
        if(pCardholderNameVal != null) {
            
            pCardholderName = new String();
            jsonToValue(pCardholderName, pCardholderNameVal, L"String", L"String");
        }
        delete pCardholderNameKey;
JsonString* pExpirationDateKey = new JsonString(L"ExpirationDate");
        IJsonValue* pExpirationDateVal = null;
        pJsonObject->GetValue(pExpirationDateKey, pExpirationDateVal);
        if(pExpirationDateVal != null) {
            
            pExpirationDate = new DateTime();
            jsonToValue(pExpirationDate, pExpirationDateVal, L"SamiDate", L"SamiDate");
        }
        delete pExpirationDateKey;
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

SamiCreditCard::SamiCreditCard(String* json) {
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
SamiCreditCard::asJson ()
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
SamiCreditCard::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pTokenKey = new JsonString(L"Token");
    pJsonObject->Add(pTokenKey, toJson(getPToken(), "String", ""));

    JsonString *pCardTypeKey = new JsonString(L"CardType");
    pJsonObject->Add(pCardTypeKey, toJson(getPCardType(), "String", ""));

    JsonString *pPartialAccountNumberKey = new JsonString(L"PartialAccountNumber");
    pJsonObject->Add(pPartialAccountNumberKey, toJson(getPPartialAccountNumber(), "String", ""));

    JsonString *pCardholderNameKey = new JsonString(L"CardholderName");
    pJsonObject->Add(pCardholderNameKey, toJson(getPCardholderName(), "String", ""));

    JsonString *pExpirationDateKey = new JsonString(L"ExpirationDate");
    pJsonObject->Add(pExpirationDateKey, toJson(getPExpirationDate(), "SamiDate", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiCreditCard::getPID() {
    return pID;
}
void
SamiCreditCard::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiCreditCard::getPToken() {
    return pToken;
}
void
SamiCreditCard::setPToken(String* pToken) {
    this->pToken = pToken;
}

String*
SamiCreditCard::getPCardType() {
    return pCardType;
}
void
SamiCreditCard::setPCardType(String* pCardType) {
    this->pCardType = pCardType;
}

String*
SamiCreditCard::getPPartialAccountNumber() {
    return pPartialAccountNumber;
}
void
SamiCreditCard::setPPartialAccountNumber(String* pPartialAccountNumber) {
    this->pPartialAccountNumber = pPartialAccountNumber;
}

String*
SamiCreditCard::getPCardholderName() {
    return pCardholderName;
}
void
SamiCreditCard::setPCardholderName(String* pCardholderName) {
    this->pCardholderName = pCardholderName;
}

SamiDate*
SamiCreditCard::getPExpirationDate() {
    return pExpirationDate;
}
void
SamiCreditCard::setPExpirationDate(SamiDate* pExpirationDate) {
    this->pExpirationDate = pExpirationDate;
}

SamiObject*
SamiCreditCard::getPXp() {
    return pXp;
}
void
SamiCreditCard::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

