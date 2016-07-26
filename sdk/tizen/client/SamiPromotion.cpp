
#include "SamiPromotion.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiPromotion::SamiPromotion() {
    init();
}

SamiPromotion::~SamiPromotion() {
    this->cleanup();
}

void
SamiPromotion::init() {
    pID = null;
pCode = null;
pName = null;
pUsagesRemaining = null;
pDescription = null;
pFinePrint = null;
pStartDate = null;
pExpirationDate = null;
pEligibleExpression = null;
pValueExpression = null;
pCanCombine = null;
pXp = null;
}

void
SamiPromotion::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pCode != null) {
        
        delete pCode;
        pCode = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pUsagesRemaining != null) {
        
        delete pUsagesRemaining;
        pUsagesRemaining = null;
    }
if(pDescription != null) {
        
        delete pDescription;
        pDescription = null;
    }
if(pFinePrint != null) {
        
        delete pFinePrint;
        pFinePrint = null;
    }
if(pStartDate != null) {
        
        delete pStartDate;
        pStartDate = null;
    }
if(pExpirationDate != null) {
        
        delete pExpirationDate;
        pExpirationDate = null;
    }
if(pEligibleExpression != null) {
        
        delete pEligibleExpression;
        pEligibleExpression = null;
    }
if(pValueExpression != null) {
        
        delete pValueExpression;
        pValueExpression = null;
    }
if(pCanCombine != null) {
        
        delete pCanCombine;
        pCanCombine = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiPromotion*
SamiPromotion::fromJson(String* json) {
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
SamiPromotion::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pCodeKey = new JsonString(L"Code");
        IJsonValue* pCodeVal = null;
        pJsonObject->GetValue(pCodeKey, pCodeVal);
        if(pCodeVal != null) {
            
            pCode = new String();
            jsonToValue(pCode, pCodeVal, L"String", L"String");
        }
        delete pCodeKey;
JsonString* pNameKey = new JsonString(L"Name");
        IJsonValue* pNameVal = null;
        pJsonObject->GetValue(pNameKey, pNameVal);
        if(pNameVal != null) {
            
            pName = new String();
            jsonToValue(pName, pNameVal, L"String", L"String");
        }
        delete pNameKey;
JsonString* pUsagesRemainingKey = new JsonString(L"UsagesRemaining");
        IJsonValue* pUsagesRemainingVal = null;
        pJsonObject->GetValue(pUsagesRemainingKey, pUsagesRemainingVal);
        if(pUsagesRemainingVal != null) {
            
            pUsagesRemaining = null;
            jsonToValue(pUsagesRemaining, pUsagesRemainingVal, L"Integer", L"Integer");
        }
        delete pUsagesRemainingKey;
JsonString* pDescriptionKey = new JsonString(L"Description");
        IJsonValue* pDescriptionVal = null;
        pJsonObject->GetValue(pDescriptionKey, pDescriptionVal);
        if(pDescriptionVal != null) {
            
            pDescription = new String();
            jsonToValue(pDescription, pDescriptionVal, L"String", L"String");
        }
        delete pDescriptionKey;
JsonString* pFinePrintKey = new JsonString(L"FinePrint");
        IJsonValue* pFinePrintVal = null;
        pJsonObject->GetValue(pFinePrintKey, pFinePrintVal);
        if(pFinePrintVal != null) {
            
            pFinePrint = new String();
            jsonToValue(pFinePrint, pFinePrintVal, L"String", L"String");
        }
        delete pFinePrintKey;
JsonString* pStartDateKey = new JsonString(L"StartDate");
        IJsonValue* pStartDateVal = null;
        pJsonObject->GetValue(pStartDateKey, pStartDateVal);
        if(pStartDateVal != null) {
            
            pStartDate = new DateTime();
            jsonToValue(pStartDate, pStartDateVal, L"SamiDate", L"SamiDate");
        }
        delete pStartDateKey;
JsonString* pExpirationDateKey = new JsonString(L"ExpirationDate");
        IJsonValue* pExpirationDateVal = null;
        pJsonObject->GetValue(pExpirationDateKey, pExpirationDateVal);
        if(pExpirationDateVal != null) {
            
            pExpirationDate = new DateTime();
            jsonToValue(pExpirationDate, pExpirationDateVal, L"SamiDate", L"SamiDate");
        }
        delete pExpirationDateKey;
JsonString* pEligibleExpressionKey = new JsonString(L"EligibleExpression");
        IJsonValue* pEligibleExpressionVal = null;
        pJsonObject->GetValue(pEligibleExpressionKey, pEligibleExpressionVal);
        if(pEligibleExpressionVal != null) {
            
            pEligibleExpression = new String();
            jsonToValue(pEligibleExpression, pEligibleExpressionVal, L"String", L"String");
        }
        delete pEligibleExpressionKey;
JsonString* pValueExpressionKey = new JsonString(L"ValueExpression");
        IJsonValue* pValueExpressionVal = null;
        pJsonObject->GetValue(pValueExpressionKey, pValueExpressionVal);
        if(pValueExpressionVal != null) {
            
            pValueExpression = new String();
            jsonToValue(pValueExpression, pValueExpressionVal, L"String", L"String");
        }
        delete pValueExpressionKey;
JsonString* pCanCombineKey = new JsonString(L"CanCombine");
        IJsonValue* pCanCombineVal = null;
        pJsonObject->GetValue(pCanCombineKey, pCanCombineVal);
        if(pCanCombineVal != null) {
            
            pCanCombine = new Boolean(false);
            jsonToValue(pCanCombine, pCanCombineVal, L"Boolean", L"Boolean");
        }
        delete pCanCombineKey;
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

SamiPromotion::SamiPromotion(String* json) {
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
SamiPromotion::asJson ()
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
SamiPromotion::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pCodeKey = new JsonString(L"Code");
    pJsonObject->Add(pCodeKey, toJson(getPCode(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pUsagesRemainingKey = new JsonString(L"UsagesRemaining");
    pJsonObject->Add(pUsagesRemainingKey, toJson(getPUsagesRemaining(), "Integer", ""));

    JsonString *pDescriptionKey = new JsonString(L"Description");
    pJsonObject->Add(pDescriptionKey, toJson(getPDescription(), "String", ""));

    JsonString *pFinePrintKey = new JsonString(L"FinePrint");
    pJsonObject->Add(pFinePrintKey, toJson(getPFinePrint(), "String", ""));

    JsonString *pStartDateKey = new JsonString(L"StartDate");
    pJsonObject->Add(pStartDateKey, toJson(getPStartDate(), "SamiDate", ""));

    JsonString *pExpirationDateKey = new JsonString(L"ExpirationDate");
    pJsonObject->Add(pExpirationDateKey, toJson(getPExpirationDate(), "SamiDate", ""));

    JsonString *pEligibleExpressionKey = new JsonString(L"EligibleExpression");
    pJsonObject->Add(pEligibleExpressionKey, toJson(getPEligibleExpression(), "String", ""));

    JsonString *pValueExpressionKey = new JsonString(L"ValueExpression");
    pJsonObject->Add(pValueExpressionKey, toJson(getPValueExpression(), "String", ""));

    JsonString *pCanCombineKey = new JsonString(L"CanCombine");
    pJsonObject->Add(pCanCombineKey, toJson(getPCanCombine(), "Boolean", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiPromotion::getPID() {
    return pID;
}
void
SamiPromotion::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiPromotion::getPCode() {
    return pCode;
}
void
SamiPromotion::setPCode(String* pCode) {
    this->pCode = pCode;
}

String*
SamiPromotion::getPName() {
    return pName;
}
void
SamiPromotion::setPName(String* pName) {
    this->pName = pName;
}

Integer*
SamiPromotion::getPUsagesRemaining() {
    return pUsagesRemaining;
}
void
SamiPromotion::setPUsagesRemaining(Integer* pUsagesRemaining) {
    this->pUsagesRemaining = pUsagesRemaining;
}

String*
SamiPromotion::getPDescription() {
    return pDescription;
}
void
SamiPromotion::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

String*
SamiPromotion::getPFinePrint() {
    return pFinePrint;
}
void
SamiPromotion::setPFinePrint(String* pFinePrint) {
    this->pFinePrint = pFinePrint;
}

SamiDate*
SamiPromotion::getPStartDate() {
    return pStartDate;
}
void
SamiPromotion::setPStartDate(SamiDate* pStartDate) {
    this->pStartDate = pStartDate;
}

SamiDate*
SamiPromotion::getPExpirationDate() {
    return pExpirationDate;
}
void
SamiPromotion::setPExpirationDate(SamiDate* pExpirationDate) {
    this->pExpirationDate = pExpirationDate;
}

String*
SamiPromotion::getPEligibleExpression() {
    return pEligibleExpression;
}
void
SamiPromotion::setPEligibleExpression(String* pEligibleExpression) {
    this->pEligibleExpression = pEligibleExpression;
}

String*
SamiPromotion::getPValueExpression() {
    return pValueExpression;
}
void
SamiPromotion::setPValueExpression(String* pValueExpression) {
    this->pValueExpression = pValueExpression;
}

Boolean*
SamiPromotion::getPCanCombine() {
    return pCanCombine;
}
void
SamiPromotion::setPCanCombine(Boolean* pCanCombine) {
    this->pCanCombine = pCanCombine;
}

SamiObject*
SamiPromotion::getPXp() {
    return pXp;
}
void
SamiPromotion::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

