
#include "SamiAddress.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiAddress::SamiAddress() {
    init();
}

SamiAddress::~SamiAddress() {
    this->cleanup();
}

void
SamiAddress::init() {
    pID = null;
pCompanyName = null;
pFirstName = null;
pLastName = null;
pStreet1 = null;
pStreet2 = null;
pCity = null;
pState = null;
pZip = null;
pCountry = null;
pPhone = null;
pAddressName = null;
pXp = null;
}

void
SamiAddress::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pCompanyName != null) {
        
        delete pCompanyName;
        pCompanyName = null;
    }
if(pFirstName != null) {
        
        delete pFirstName;
        pFirstName = null;
    }
if(pLastName != null) {
        
        delete pLastName;
        pLastName = null;
    }
if(pStreet1 != null) {
        
        delete pStreet1;
        pStreet1 = null;
    }
if(pStreet2 != null) {
        
        delete pStreet2;
        pStreet2 = null;
    }
if(pCity != null) {
        
        delete pCity;
        pCity = null;
    }
if(pState != null) {
        
        delete pState;
        pState = null;
    }
if(pZip != null) {
        
        delete pZip;
        pZip = null;
    }
if(pCountry != null) {
        
        delete pCountry;
        pCountry = null;
    }
if(pPhone != null) {
        
        delete pPhone;
        pPhone = null;
    }
if(pAddressName != null) {
        
        delete pAddressName;
        pAddressName = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiAddress*
SamiAddress::fromJson(String* json) {
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
SamiAddress::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pCompanyNameKey = new JsonString(L"CompanyName");
        IJsonValue* pCompanyNameVal = null;
        pJsonObject->GetValue(pCompanyNameKey, pCompanyNameVal);
        if(pCompanyNameVal != null) {
            
            pCompanyName = new String();
            jsonToValue(pCompanyName, pCompanyNameVal, L"String", L"String");
        }
        delete pCompanyNameKey;
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
JsonString* pStreet1Key = new JsonString(L"Street1");
        IJsonValue* pStreet1Val = null;
        pJsonObject->GetValue(pStreet1Key, pStreet1Val);
        if(pStreet1Val != null) {
            
            pStreet1 = new String();
            jsonToValue(pStreet1, pStreet1Val, L"String", L"String");
        }
        delete pStreet1Key;
JsonString* pStreet2Key = new JsonString(L"Street2");
        IJsonValue* pStreet2Val = null;
        pJsonObject->GetValue(pStreet2Key, pStreet2Val);
        if(pStreet2Val != null) {
            
            pStreet2 = new String();
            jsonToValue(pStreet2, pStreet2Val, L"String", L"String");
        }
        delete pStreet2Key;
JsonString* pCityKey = new JsonString(L"City");
        IJsonValue* pCityVal = null;
        pJsonObject->GetValue(pCityKey, pCityVal);
        if(pCityVal != null) {
            
            pCity = new String();
            jsonToValue(pCity, pCityVal, L"String", L"String");
        }
        delete pCityKey;
JsonString* pStateKey = new JsonString(L"State");
        IJsonValue* pStateVal = null;
        pJsonObject->GetValue(pStateKey, pStateVal);
        if(pStateVal != null) {
            
            pState = new String();
            jsonToValue(pState, pStateVal, L"String", L"String");
        }
        delete pStateKey;
JsonString* pZipKey = new JsonString(L"Zip");
        IJsonValue* pZipVal = null;
        pJsonObject->GetValue(pZipKey, pZipVal);
        if(pZipVal != null) {
            
            pZip = new String();
            jsonToValue(pZip, pZipVal, L"String", L"String");
        }
        delete pZipKey;
JsonString* pCountryKey = new JsonString(L"Country");
        IJsonValue* pCountryVal = null;
        pJsonObject->GetValue(pCountryKey, pCountryVal);
        if(pCountryVal != null) {
            
            pCountry = new String();
            jsonToValue(pCountry, pCountryVal, L"String", L"String");
        }
        delete pCountryKey;
JsonString* pPhoneKey = new JsonString(L"Phone");
        IJsonValue* pPhoneVal = null;
        pJsonObject->GetValue(pPhoneKey, pPhoneVal);
        if(pPhoneVal != null) {
            
            pPhone = new String();
            jsonToValue(pPhone, pPhoneVal, L"String", L"String");
        }
        delete pPhoneKey;
JsonString* pAddressNameKey = new JsonString(L"AddressName");
        IJsonValue* pAddressNameVal = null;
        pJsonObject->GetValue(pAddressNameKey, pAddressNameVal);
        if(pAddressNameVal != null) {
            
            pAddressName = new String();
            jsonToValue(pAddressName, pAddressNameVal, L"String", L"String");
        }
        delete pAddressNameKey;
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

SamiAddress::SamiAddress(String* json) {
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
SamiAddress::asJson ()
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
SamiAddress::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pCompanyNameKey = new JsonString(L"CompanyName");
    pJsonObject->Add(pCompanyNameKey, toJson(getPCompanyName(), "String", ""));

    JsonString *pFirstNameKey = new JsonString(L"FirstName");
    pJsonObject->Add(pFirstNameKey, toJson(getPFirstName(), "String", ""));

    JsonString *pLastNameKey = new JsonString(L"LastName");
    pJsonObject->Add(pLastNameKey, toJson(getPLastName(), "String", ""));

    JsonString *pStreet1Key = new JsonString(L"Street1");
    pJsonObject->Add(pStreet1Key, toJson(getPStreet1(), "String", ""));

    JsonString *pStreet2Key = new JsonString(L"Street2");
    pJsonObject->Add(pStreet2Key, toJson(getPStreet2(), "String", ""));

    JsonString *pCityKey = new JsonString(L"City");
    pJsonObject->Add(pCityKey, toJson(getPCity(), "String", ""));

    JsonString *pStateKey = new JsonString(L"State");
    pJsonObject->Add(pStateKey, toJson(getPState(), "String", ""));

    JsonString *pZipKey = new JsonString(L"Zip");
    pJsonObject->Add(pZipKey, toJson(getPZip(), "String", ""));

    JsonString *pCountryKey = new JsonString(L"Country");
    pJsonObject->Add(pCountryKey, toJson(getPCountry(), "String", ""));

    JsonString *pPhoneKey = new JsonString(L"Phone");
    pJsonObject->Add(pPhoneKey, toJson(getPPhone(), "String", ""));

    JsonString *pAddressNameKey = new JsonString(L"AddressName");
    pJsonObject->Add(pAddressNameKey, toJson(getPAddressName(), "String", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiAddress::getPID() {
    return pID;
}
void
SamiAddress::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiAddress::getPCompanyName() {
    return pCompanyName;
}
void
SamiAddress::setPCompanyName(String* pCompanyName) {
    this->pCompanyName = pCompanyName;
}

String*
SamiAddress::getPFirstName() {
    return pFirstName;
}
void
SamiAddress::setPFirstName(String* pFirstName) {
    this->pFirstName = pFirstName;
}

String*
SamiAddress::getPLastName() {
    return pLastName;
}
void
SamiAddress::setPLastName(String* pLastName) {
    this->pLastName = pLastName;
}

String*
SamiAddress::getPStreet1() {
    return pStreet1;
}
void
SamiAddress::setPStreet1(String* pStreet1) {
    this->pStreet1 = pStreet1;
}

String*
SamiAddress::getPStreet2() {
    return pStreet2;
}
void
SamiAddress::setPStreet2(String* pStreet2) {
    this->pStreet2 = pStreet2;
}

String*
SamiAddress::getPCity() {
    return pCity;
}
void
SamiAddress::setPCity(String* pCity) {
    this->pCity = pCity;
}

String*
SamiAddress::getPState() {
    return pState;
}
void
SamiAddress::setPState(String* pState) {
    this->pState = pState;
}

String*
SamiAddress::getPZip() {
    return pZip;
}
void
SamiAddress::setPZip(String* pZip) {
    this->pZip = pZip;
}

String*
SamiAddress::getPCountry() {
    return pCountry;
}
void
SamiAddress::setPCountry(String* pCountry) {
    this->pCountry = pCountry;
}

String*
SamiAddress::getPPhone() {
    return pPhone;
}
void
SamiAddress::setPPhone(String* pPhone) {
    this->pPhone = pPhone;
}

String*
SamiAddress::getPAddressName() {
    return pAddressName;
}
void
SamiAddress::setPAddressName(String* pAddressName) {
    this->pAddressName = pAddressName;
}

SamiObject*
SamiAddress::getPXp() {
    return pXp;
}
void
SamiAddress::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

