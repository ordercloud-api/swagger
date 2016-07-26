
#include "SamiBuyerAddress.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiBuyerAddress::SamiBuyerAddress() {
    init();
}

SamiBuyerAddress::~SamiBuyerAddress() {
    this->cleanup();
}

void
SamiBuyerAddress::init() {
    pShipping = null;
pBilling = null;
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
SamiBuyerAddress::cleanup() {
    if(pShipping != null) {
        
        delete pShipping;
        pShipping = null;
    }
if(pBilling != null) {
        
        delete pBilling;
        pBilling = null;
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


SamiBuyerAddress*
SamiBuyerAddress::fromJson(String* json) {
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
SamiBuyerAddress::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pShippingKey = new JsonString(L"Shipping");
        IJsonValue* pShippingVal = null;
        pJsonObject->GetValue(pShippingKey, pShippingVal);
        if(pShippingVal != null) {
            
            pShipping = new Boolean(false);
            jsonToValue(pShipping, pShippingVal, L"Boolean", L"Boolean");
        }
        delete pShippingKey;
JsonString* pBillingKey = new JsonString(L"Billing");
        IJsonValue* pBillingVal = null;
        pJsonObject->GetValue(pBillingKey, pBillingVal);
        if(pBillingVal != null) {
            
            pBilling = new Boolean(false);
            jsonToValue(pBilling, pBillingVal, L"Boolean", L"Boolean");
        }
        delete pBillingKey;
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

SamiBuyerAddress::SamiBuyerAddress(String* json) {
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
SamiBuyerAddress::asJson ()
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
SamiBuyerAddress::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pShippingKey = new JsonString(L"Shipping");
    pJsonObject->Add(pShippingKey, toJson(getPShipping(), "Boolean", ""));

    JsonString *pBillingKey = new JsonString(L"Billing");
    pJsonObject->Add(pBillingKey, toJson(getPBilling(), "Boolean", ""));

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

Boolean*
SamiBuyerAddress::getPShipping() {
    return pShipping;
}
void
SamiBuyerAddress::setPShipping(Boolean* pShipping) {
    this->pShipping = pShipping;
}

Boolean*
SamiBuyerAddress::getPBilling() {
    return pBilling;
}
void
SamiBuyerAddress::setPBilling(Boolean* pBilling) {
    this->pBilling = pBilling;
}

String*
SamiBuyerAddress::getPCompanyName() {
    return pCompanyName;
}
void
SamiBuyerAddress::setPCompanyName(String* pCompanyName) {
    this->pCompanyName = pCompanyName;
}

String*
SamiBuyerAddress::getPFirstName() {
    return pFirstName;
}
void
SamiBuyerAddress::setPFirstName(String* pFirstName) {
    this->pFirstName = pFirstName;
}

String*
SamiBuyerAddress::getPLastName() {
    return pLastName;
}
void
SamiBuyerAddress::setPLastName(String* pLastName) {
    this->pLastName = pLastName;
}

String*
SamiBuyerAddress::getPStreet1() {
    return pStreet1;
}
void
SamiBuyerAddress::setPStreet1(String* pStreet1) {
    this->pStreet1 = pStreet1;
}

String*
SamiBuyerAddress::getPStreet2() {
    return pStreet2;
}
void
SamiBuyerAddress::setPStreet2(String* pStreet2) {
    this->pStreet2 = pStreet2;
}

String*
SamiBuyerAddress::getPCity() {
    return pCity;
}
void
SamiBuyerAddress::setPCity(String* pCity) {
    this->pCity = pCity;
}

String*
SamiBuyerAddress::getPState() {
    return pState;
}
void
SamiBuyerAddress::setPState(String* pState) {
    this->pState = pState;
}

String*
SamiBuyerAddress::getPZip() {
    return pZip;
}
void
SamiBuyerAddress::setPZip(String* pZip) {
    this->pZip = pZip;
}

String*
SamiBuyerAddress::getPCountry() {
    return pCountry;
}
void
SamiBuyerAddress::setPCountry(String* pCountry) {
    this->pCountry = pCountry;
}

String*
SamiBuyerAddress::getPPhone() {
    return pPhone;
}
void
SamiBuyerAddress::setPPhone(String* pPhone) {
    this->pPhone = pPhone;
}

String*
SamiBuyerAddress::getPAddressName() {
    return pAddressName;
}
void
SamiBuyerAddress::setPAddressName(String* pAddressName) {
    this->pAddressName = pAddressName;
}

SamiObject*
SamiBuyerAddress::getPXp() {
    return pXp;
}
void
SamiBuyerAddress::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

