
#include "SamiSpendingAccount.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiSpendingAccount::SamiSpendingAccount() {
    init();
}

SamiSpendingAccount::~SamiSpendingAccount() {
    this->cleanup();
}

void
SamiSpendingAccount::init() {
    pID = null;
pName = null;
pBalance = null;
pAllowAsPaymentMethod = null;
pRedemptionCode = null;
pStartDate = null;
pEndDate = null;
pXp = null;
}

void
SamiSpendingAccount::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pBalance != null) {
        
        delete pBalance;
        pBalance = null;
    }
if(pAllowAsPaymentMethod != null) {
        
        delete pAllowAsPaymentMethod;
        pAllowAsPaymentMethod = null;
    }
if(pRedemptionCode != null) {
        
        delete pRedemptionCode;
        pRedemptionCode = null;
    }
if(pStartDate != null) {
        
        delete pStartDate;
        pStartDate = null;
    }
if(pEndDate != null) {
        
        delete pEndDate;
        pEndDate = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiSpendingAccount*
SamiSpendingAccount::fromJson(String* json) {
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
SamiSpendingAccount::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pNameKey = new JsonString(L"Name");
        IJsonValue* pNameVal = null;
        pJsonObject->GetValue(pNameKey, pNameVal);
        if(pNameVal != null) {
            
            pName = new String();
            jsonToValue(pName, pNameVal, L"String", L"String");
        }
        delete pNameKey;
JsonString* pBalanceKey = new JsonString(L"Balance");
        IJsonValue* pBalanceVal = null;
        pJsonObject->GetValue(pBalanceKey, pBalanceVal);
        if(pBalanceVal != null) {
            
            pBalance = new Long();
            jsonToValue(pBalance, pBalanceVal, L"Long", L"Long");
        }
        delete pBalanceKey;
JsonString* pAllowAsPaymentMethodKey = new JsonString(L"AllowAsPaymentMethod");
        IJsonValue* pAllowAsPaymentMethodVal = null;
        pJsonObject->GetValue(pAllowAsPaymentMethodKey, pAllowAsPaymentMethodVal);
        if(pAllowAsPaymentMethodVal != null) {
            
            pAllowAsPaymentMethod = new Boolean(false);
            jsonToValue(pAllowAsPaymentMethod, pAllowAsPaymentMethodVal, L"Boolean", L"Boolean");
        }
        delete pAllowAsPaymentMethodKey;
JsonString* pRedemptionCodeKey = new JsonString(L"RedemptionCode");
        IJsonValue* pRedemptionCodeVal = null;
        pJsonObject->GetValue(pRedemptionCodeKey, pRedemptionCodeVal);
        if(pRedemptionCodeVal != null) {
            
            pRedemptionCode = new String();
            jsonToValue(pRedemptionCode, pRedemptionCodeVal, L"String", L"String");
        }
        delete pRedemptionCodeKey;
JsonString* pStartDateKey = new JsonString(L"StartDate");
        IJsonValue* pStartDateVal = null;
        pJsonObject->GetValue(pStartDateKey, pStartDateVal);
        if(pStartDateVal != null) {
            
            pStartDate = new DateTime();
            jsonToValue(pStartDate, pStartDateVal, L"SamiDate", L"SamiDate");
        }
        delete pStartDateKey;
JsonString* pEndDateKey = new JsonString(L"EndDate");
        IJsonValue* pEndDateVal = null;
        pJsonObject->GetValue(pEndDateKey, pEndDateVal);
        if(pEndDateVal != null) {
            
            pEndDate = new DateTime();
            jsonToValue(pEndDate, pEndDateVal, L"SamiDate", L"SamiDate");
        }
        delete pEndDateKey;
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

SamiSpendingAccount::SamiSpendingAccount(String* json) {
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
SamiSpendingAccount::asJson ()
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
SamiSpendingAccount::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pBalanceKey = new JsonString(L"Balance");
    pJsonObject->Add(pBalanceKey, toJson(getPBalance(), "Long", ""));

    JsonString *pAllowAsPaymentMethodKey = new JsonString(L"AllowAsPaymentMethod");
    pJsonObject->Add(pAllowAsPaymentMethodKey, toJson(getPAllowAsPaymentMethod(), "Boolean", ""));

    JsonString *pRedemptionCodeKey = new JsonString(L"RedemptionCode");
    pJsonObject->Add(pRedemptionCodeKey, toJson(getPRedemptionCode(), "String", ""));

    JsonString *pStartDateKey = new JsonString(L"StartDate");
    pJsonObject->Add(pStartDateKey, toJson(getPStartDate(), "SamiDate", ""));

    JsonString *pEndDateKey = new JsonString(L"EndDate");
    pJsonObject->Add(pEndDateKey, toJson(getPEndDate(), "SamiDate", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiSpendingAccount::getPID() {
    return pID;
}
void
SamiSpendingAccount::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiSpendingAccount::getPName() {
    return pName;
}
void
SamiSpendingAccount::setPName(String* pName) {
    this->pName = pName;
}

Long*
SamiSpendingAccount::getPBalance() {
    return pBalance;
}
void
SamiSpendingAccount::setPBalance(Long* pBalance) {
    this->pBalance = pBalance;
}

Boolean*
SamiSpendingAccount::getPAllowAsPaymentMethod() {
    return pAllowAsPaymentMethod;
}
void
SamiSpendingAccount::setPAllowAsPaymentMethod(Boolean* pAllowAsPaymentMethod) {
    this->pAllowAsPaymentMethod = pAllowAsPaymentMethod;
}

String*
SamiSpendingAccount::getPRedemptionCode() {
    return pRedemptionCode;
}
void
SamiSpendingAccount::setPRedemptionCode(String* pRedemptionCode) {
    this->pRedemptionCode = pRedemptionCode;
}

SamiDate*
SamiSpendingAccount::getPStartDate() {
    return pStartDate;
}
void
SamiSpendingAccount::setPStartDate(SamiDate* pStartDate) {
    this->pStartDate = pStartDate;
}

SamiDate*
SamiSpendingAccount::getPEndDate() {
    return pEndDate;
}
void
SamiSpendingAccount::setPEndDate(SamiDate* pEndDate) {
    this->pEndDate = pEndDate;
}

SamiObject*
SamiSpendingAccount::getPXp() {
    return pXp;
}
void
SamiSpendingAccount::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

