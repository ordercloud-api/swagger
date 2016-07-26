
#include "SamiUser.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiUser::SamiUser() {
    init();
}

SamiUser::~SamiUser() {
    this->cleanup();
}

void
SamiUser::init() {
    pID = null;
pUsername = null;
pPassword = null;
pFirstName = null;
pLastName = null;
pEmail = null;
pPhone = null;
pTermsAccepted = null;
pActive = null;
pXp = null;
pSecurityProfileID = null;
}

void
SamiUser::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pUsername != null) {
        
        delete pUsername;
        pUsername = null;
    }
if(pPassword != null) {
        
        delete pPassword;
        pPassword = null;
    }
if(pFirstName != null) {
        
        delete pFirstName;
        pFirstName = null;
    }
if(pLastName != null) {
        
        delete pLastName;
        pLastName = null;
    }
if(pEmail != null) {
        
        delete pEmail;
        pEmail = null;
    }
if(pPhone != null) {
        
        delete pPhone;
        pPhone = null;
    }
if(pTermsAccepted != null) {
        
        delete pTermsAccepted;
        pTermsAccepted = null;
    }
if(pActive != null) {
        
        delete pActive;
        pActive = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
if(pSecurityProfileID != null) {
        
        delete pSecurityProfileID;
        pSecurityProfileID = null;
    }
}


SamiUser*
SamiUser::fromJson(String* json) {
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
SamiUser::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pFirstNameKey = new JsonString(L"FirstName");
        IJsonValue* pFirstNameVal = null;
        pJsonObject->GetValue(pFirstNameKey, pFirstNameVal);
        if(pFirstNameVal != null) {
            
            pFirstName = new String();
            jsonToValue(pFirstName, pFirstNameVal, L"String", L"String");
        }
        delete pFirstNameKey;
JsonString* pLastNameKey = new JsonString(L"LastName");
        IJsonValue* pLastNameVal = null;
        pJsonObject->GetValue(pLastNameKey, pLastNameVal);
        if(pLastNameVal != null) {
            
            pLastName = new String();
            jsonToValue(pLastName, pLastNameVal, L"String", L"String");
        }
        delete pLastNameKey;
JsonString* pEmailKey = new JsonString(L"Email");
        IJsonValue* pEmailVal = null;
        pJsonObject->GetValue(pEmailKey, pEmailVal);
        if(pEmailVal != null) {
            
            pEmail = new String();
            jsonToValue(pEmail, pEmailVal, L"String", L"String");
        }
        delete pEmailKey;
JsonString* pPhoneKey = new JsonString(L"Phone");
        IJsonValue* pPhoneVal = null;
        pJsonObject->GetValue(pPhoneKey, pPhoneVal);
        if(pPhoneVal != null) {
            
            pPhone = new String();
            jsonToValue(pPhone, pPhoneVal, L"String", L"String");
        }
        delete pPhoneKey;
JsonString* pTermsAcceptedKey = new JsonString(L"TermsAccepted");
        IJsonValue* pTermsAcceptedVal = null;
        pJsonObject->GetValue(pTermsAcceptedKey, pTermsAcceptedVal);
        if(pTermsAcceptedVal != null) {
            
            pTermsAccepted = new DateTime();
            jsonToValue(pTermsAccepted, pTermsAcceptedVal, L"SamiDate", L"SamiDate");
        }
        delete pTermsAcceptedKey;
JsonString* pActiveKey = new JsonString(L"Active");
        IJsonValue* pActiveVal = null;
        pJsonObject->GetValue(pActiveKey, pActiveVal);
        if(pActiveVal != null) {
            
            pActive = new Boolean(false);
            jsonToValue(pActive, pActiveVal, L"Boolean", L"Boolean");
        }
        delete pActiveKey;
JsonString* pXpKey = new JsonString(L"xp");
        IJsonValue* pXpVal = null;
        pJsonObject->GetValue(pXpKey, pXpVal);
        if(pXpVal != null) {
            
            pXp = null;
            jsonToValue(pXp, pXpVal, L"SamiObject", L"SamiObject");
        }
        delete pXpKey;
JsonString* pSecurityProfileIDKey = new JsonString(L"SecurityProfileID");
        IJsonValue* pSecurityProfileIDVal = null;
        pJsonObject->GetValue(pSecurityProfileIDKey, pSecurityProfileIDVal);
        if(pSecurityProfileIDVal != null) {
            
            pSecurityProfileID = new String();
            jsonToValue(pSecurityProfileID, pSecurityProfileIDVal, L"String", L"String");
        }
        delete pSecurityProfileIDKey;
    }
}

SamiUser::SamiUser(String* json) {
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
SamiUser::asJson ()
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
SamiUser::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pUsernameKey = new JsonString(L"Username");
    pJsonObject->Add(pUsernameKey, toJson(getPUsername(), "String", ""));

    JsonString *pPasswordKey = new JsonString(L"Password");
    pJsonObject->Add(pPasswordKey, toJson(getPPassword(), "String", ""));

    JsonString *pFirstNameKey = new JsonString(L"FirstName");
    pJsonObject->Add(pFirstNameKey, toJson(getPFirstName(), "String", ""));

    JsonString *pLastNameKey = new JsonString(L"LastName");
    pJsonObject->Add(pLastNameKey, toJson(getPLastName(), "String", ""));

    JsonString *pEmailKey = new JsonString(L"Email");
    pJsonObject->Add(pEmailKey, toJson(getPEmail(), "String", ""));

    JsonString *pPhoneKey = new JsonString(L"Phone");
    pJsonObject->Add(pPhoneKey, toJson(getPPhone(), "String", ""));

    JsonString *pTermsAcceptedKey = new JsonString(L"TermsAccepted");
    pJsonObject->Add(pTermsAcceptedKey, toJson(getPTermsAccepted(), "SamiDate", ""));

    JsonString *pActiveKey = new JsonString(L"Active");
    pJsonObject->Add(pActiveKey, toJson(getPActive(), "Boolean", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    JsonString *pSecurityProfileIDKey = new JsonString(L"SecurityProfileID");
    pJsonObject->Add(pSecurityProfileIDKey, toJson(getPSecurityProfileID(), "String", ""));

    return pJsonObject;
}

String*
SamiUser::getPID() {
    return pID;
}
void
SamiUser::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiUser::getPUsername() {
    return pUsername;
}
void
SamiUser::setPUsername(String* pUsername) {
    this->pUsername = pUsername;
}

String*
SamiUser::getPPassword() {
    return pPassword;
}
void
SamiUser::setPPassword(String* pPassword) {
    this->pPassword = pPassword;
}

String*
SamiUser::getPFirstName() {
    return pFirstName;
}
void
SamiUser::setPFirstName(String* pFirstName) {
    this->pFirstName = pFirstName;
}

String*
SamiUser::getPLastName() {
    return pLastName;
}
void
SamiUser::setPLastName(String* pLastName) {
    this->pLastName = pLastName;
}

String*
SamiUser::getPEmail() {
    return pEmail;
}
void
SamiUser::setPEmail(String* pEmail) {
    this->pEmail = pEmail;
}

String*
SamiUser::getPPhone() {
    return pPhone;
}
void
SamiUser::setPPhone(String* pPhone) {
    this->pPhone = pPhone;
}

SamiDate*
SamiUser::getPTermsAccepted() {
    return pTermsAccepted;
}
void
SamiUser::setPTermsAccepted(SamiDate* pTermsAccepted) {
    this->pTermsAccepted = pTermsAccepted;
}

Boolean*
SamiUser::getPActive() {
    return pActive;
}
void
SamiUser::setPActive(Boolean* pActive) {
    this->pActive = pActive;
}

SamiObject*
SamiUser::getPXp() {
    return pXp;
}
void
SamiUser::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}

String*
SamiUser::getPSecurityProfileID() {
    return pSecurityProfileID;
}
void
SamiUser::setPSecurityProfileID(String* pSecurityProfileID) {
    this->pSecurityProfileID = pSecurityProfileID;
}



} /* namespace Swagger */

