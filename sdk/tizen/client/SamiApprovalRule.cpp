
#include "SamiApprovalRule.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiApprovalRule::SamiApprovalRule() {
    init();
}

SamiApprovalRule::~SamiApprovalRule() {
    this->cleanup();
}

void
SamiApprovalRule::init() {
    pID = null;
pName = null;
pDescription = null;
pApprovingGroupID = null;
pRuleExpression = null;
pScope = null;
pScopeTimeUnit = null;
pScopeTimeNumber = null;
pScopeStartDate = null;
pExpireAfterTimeUnit = null;
pExpireAfterNumber = null;
pApproveOnExpire = null;
pXp = null;
}

void
SamiApprovalRule::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pName != null) {
        
        delete pName;
        pName = null;
    }
if(pDescription != null) {
        
        delete pDescription;
        pDescription = null;
    }
if(pApprovingGroupID != null) {
        
        delete pApprovingGroupID;
        pApprovingGroupID = null;
    }
if(pRuleExpression != null) {
        
        delete pRuleExpression;
        pRuleExpression = null;
    }
if(pScope != null) {
        
        delete pScope;
        pScope = null;
    }
if(pScopeTimeUnit != null) {
        
        delete pScopeTimeUnit;
        pScopeTimeUnit = null;
    }
if(pScopeTimeNumber != null) {
        
        delete pScopeTimeNumber;
        pScopeTimeNumber = null;
    }
if(pScopeStartDate != null) {
        
        delete pScopeStartDate;
        pScopeStartDate = null;
    }
if(pExpireAfterTimeUnit != null) {
        
        delete pExpireAfterTimeUnit;
        pExpireAfterTimeUnit = null;
    }
if(pExpireAfterNumber != null) {
        
        delete pExpireAfterNumber;
        pExpireAfterNumber = null;
    }
if(pApproveOnExpire != null) {
        
        delete pApproveOnExpire;
        pApproveOnExpire = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiApprovalRule*
SamiApprovalRule::fromJson(String* json) {
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
SamiApprovalRule::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pDescriptionKey = new JsonString(L"Description");
        IJsonValue* pDescriptionVal = null;
        pJsonObject->GetValue(pDescriptionKey, pDescriptionVal);
        if(pDescriptionVal != null) {
            
            pDescription = new String();
            jsonToValue(pDescription, pDescriptionVal, L"String", L"String");
        }
        delete pDescriptionKey;
JsonString* pApprovingGroupIDKey = new JsonString(L"ApprovingGroupID");
        IJsonValue* pApprovingGroupIDVal = null;
        pJsonObject->GetValue(pApprovingGroupIDKey, pApprovingGroupIDVal);
        if(pApprovingGroupIDVal != null) {
            
            pApprovingGroupID = new String();
            jsonToValue(pApprovingGroupID, pApprovingGroupIDVal, L"String", L"String");
        }
        delete pApprovingGroupIDKey;
JsonString* pRuleExpressionKey = new JsonString(L"RuleExpression");
        IJsonValue* pRuleExpressionVal = null;
        pJsonObject->GetValue(pRuleExpressionKey, pRuleExpressionVal);
        if(pRuleExpressionVal != null) {
            
            pRuleExpression = new String();
            jsonToValue(pRuleExpression, pRuleExpressionVal, L"String", L"String");
        }
        delete pRuleExpressionKey;
JsonString* pScopeKey = new JsonString(L"Scope");
        IJsonValue* pScopeVal = null;
        pJsonObject->GetValue(pScopeKey, pScopeVal);
        if(pScopeVal != null) {
            
            pScope = new String();
            jsonToValue(pScope, pScopeVal, L"String", L"String");
        }
        delete pScopeKey;
JsonString* pScopeTimeUnitKey = new JsonString(L"ScopeTimeUnit");
        IJsonValue* pScopeTimeUnitVal = null;
        pJsonObject->GetValue(pScopeTimeUnitKey, pScopeTimeUnitVal);
        if(pScopeTimeUnitVal != null) {
            
            pScopeTimeUnit = new String();
            jsonToValue(pScopeTimeUnit, pScopeTimeUnitVal, L"String", L"String");
        }
        delete pScopeTimeUnitKey;
JsonString* pScopeTimeNumberKey = new JsonString(L"ScopeTimeNumber");
        IJsonValue* pScopeTimeNumberVal = null;
        pJsonObject->GetValue(pScopeTimeNumberKey, pScopeTimeNumberVal);
        if(pScopeTimeNumberVal != null) {
            
            pScopeTimeNumber = null;
            jsonToValue(pScopeTimeNumber, pScopeTimeNumberVal, L"Integer", L"Integer");
        }
        delete pScopeTimeNumberKey;
JsonString* pScopeStartDateKey = new JsonString(L"ScopeStartDate");
        IJsonValue* pScopeStartDateVal = null;
        pJsonObject->GetValue(pScopeStartDateKey, pScopeStartDateVal);
        if(pScopeStartDateVal != null) {
            
            pScopeStartDate = new DateTime();
            jsonToValue(pScopeStartDate, pScopeStartDateVal, L"SamiDate", L"SamiDate");
        }
        delete pScopeStartDateKey;
JsonString* pExpireAfterTimeUnitKey = new JsonString(L"ExpireAfterTimeUnit");
        IJsonValue* pExpireAfterTimeUnitVal = null;
        pJsonObject->GetValue(pExpireAfterTimeUnitKey, pExpireAfterTimeUnitVal);
        if(pExpireAfterTimeUnitVal != null) {
            
            pExpireAfterTimeUnit = new String();
            jsonToValue(pExpireAfterTimeUnit, pExpireAfterTimeUnitVal, L"String", L"String");
        }
        delete pExpireAfterTimeUnitKey;
JsonString* pExpireAfterNumberKey = new JsonString(L"ExpireAfterNumber");
        IJsonValue* pExpireAfterNumberVal = null;
        pJsonObject->GetValue(pExpireAfterNumberKey, pExpireAfterNumberVal);
        if(pExpireAfterNumberVal != null) {
            
            pExpireAfterNumber = null;
            jsonToValue(pExpireAfterNumber, pExpireAfterNumberVal, L"Integer", L"Integer");
        }
        delete pExpireAfterNumberKey;
JsonString* pApproveOnExpireKey = new JsonString(L"ApproveOnExpire");
        IJsonValue* pApproveOnExpireVal = null;
        pJsonObject->GetValue(pApproveOnExpireKey, pApproveOnExpireVal);
        if(pApproveOnExpireVal != null) {
            
            pApproveOnExpire = new Boolean(false);
            jsonToValue(pApproveOnExpire, pApproveOnExpireVal, L"Boolean", L"Boolean");
        }
        delete pApproveOnExpireKey;
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

SamiApprovalRule::SamiApprovalRule(String* json) {
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
SamiApprovalRule::asJson ()
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
SamiApprovalRule::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pDescriptionKey = new JsonString(L"Description");
    pJsonObject->Add(pDescriptionKey, toJson(getPDescription(), "String", ""));

    JsonString *pApprovingGroupIDKey = new JsonString(L"ApprovingGroupID");
    pJsonObject->Add(pApprovingGroupIDKey, toJson(getPApprovingGroupID(), "String", ""));

    JsonString *pRuleExpressionKey = new JsonString(L"RuleExpression");
    pJsonObject->Add(pRuleExpressionKey, toJson(getPRuleExpression(), "String", ""));

    JsonString *pScopeKey = new JsonString(L"Scope");
    pJsonObject->Add(pScopeKey, toJson(getPScope(), "String", ""));

    JsonString *pScopeTimeUnitKey = new JsonString(L"ScopeTimeUnit");
    pJsonObject->Add(pScopeTimeUnitKey, toJson(getPScopeTimeUnit(), "String", ""));

    JsonString *pScopeTimeNumberKey = new JsonString(L"ScopeTimeNumber");
    pJsonObject->Add(pScopeTimeNumberKey, toJson(getPScopeTimeNumber(), "Integer", ""));

    JsonString *pScopeStartDateKey = new JsonString(L"ScopeStartDate");
    pJsonObject->Add(pScopeStartDateKey, toJson(getPScopeStartDate(), "SamiDate", ""));

    JsonString *pExpireAfterTimeUnitKey = new JsonString(L"ExpireAfterTimeUnit");
    pJsonObject->Add(pExpireAfterTimeUnitKey, toJson(getPExpireAfterTimeUnit(), "String", ""));

    JsonString *pExpireAfterNumberKey = new JsonString(L"ExpireAfterNumber");
    pJsonObject->Add(pExpireAfterNumberKey, toJson(getPExpireAfterNumber(), "Integer", ""));

    JsonString *pApproveOnExpireKey = new JsonString(L"ApproveOnExpire");
    pJsonObject->Add(pApproveOnExpireKey, toJson(getPApproveOnExpire(), "Boolean", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiApprovalRule::getPID() {
    return pID;
}
void
SamiApprovalRule::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiApprovalRule::getPName() {
    return pName;
}
void
SamiApprovalRule::setPName(String* pName) {
    this->pName = pName;
}

String*
SamiApprovalRule::getPDescription() {
    return pDescription;
}
void
SamiApprovalRule::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

String*
SamiApprovalRule::getPApprovingGroupID() {
    return pApprovingGroupID;
}
void
SamiApprovalRule::setPApprovingGroupID(String* pApprovingGroupID) {
    this->pApprovingGroupID = pApprovingGroupID;
}

String*
SamiApprovalRule::getPRuleExpression() {
    return pRuleExpression;
}
void
SamiApprovalRule::setPRuleExpression(String* pRuleExpression) {
    this->pRuleExpression = pRuleExpression;
}

String*
SamiApprovalRule::getPScope() {
    return pScope;
}
void
SamiApprovalRule::setPScope(String* pScope) {
    this->pScope = pScope;
}

String*
SamiApprovalRule::getPScopeTimeUnit() {
    return pScopeTimeUnit;
}
void
SamiApprovalRule::setPScopeTimeUnit(String* pScopeTimeUnit) {
    this->pScopeTimeUnit = pScopeTimeUnit;
}

Integer*
SamiApprovalRule::getPScopeTimeNumber() {
    return pScopeTimeNumber;
}
void
SamiApprovalRule::setPScopeTimeNumber(Integer* pScopeTimeNumber) {
    this->pScopeTimeNumber = pScopeTimeNumber;
}

SamiDate*
SamiApprovalRule::getPScopeStartDate() {
    return pScopeStartDate;
}
void
SamiApprovalRule::setPScopeStartDate(SamiDate* pScopeStartDate) {
    this->pScopeStartDate = pScopeStartDate;
}

String*
SamiApprovalRule::getPExpireAfterTimeUnit() {
    return pExpireAfterTimeUnit;
}
void
SamiApprovalRule::setPExpireAfterTimeUnit(String* pExpireAfterTimeUnit) {
    this->pExpireAfterTimeUnit = pExpireAfterTimeUnit;
}

Integer*
SamiApprovalRule::getPExpireAfterNumber() {
    return pExpireAfterNumber;
}
void
SamiApprovalRule::setPExpireAfterNumber(Integer* pExpireAfterNumber) {
    this->pExpireAfterNumber = pExpireAfterNumber;
}

Boolean*
SamiApprovalRule::getPApproveOnExpire() {
    return pApproveOnExpire;
}
void
SamiApprovalRule::setPApproveOnExpire(Boolean* pApproveOnExpire) {
    this->pApproveOnExpire = pApproveOnExpire;
}

SamiObject*
SamiApprovalRule::getPXp() {
    return pXp;
}
void
SamiApprovalRule::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

