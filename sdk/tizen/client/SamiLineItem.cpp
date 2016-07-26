
#include "SamiLineItem.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiLineItem::SamiLineItem() {
    init();
}

SamiLineItem::~SamiLineItem() {
    this->cleanup();
}

void
SamiLineItem::init() {
    pID = null;
pProductID = null;
pQuantity = null;
pUnitPrice = null;
pCostCenter = null;
pDateNeeded = null;
pShippingAccount = null;
pShippingAddressID = null;
pShipfromAddressID = null;
pShipperID = null;
pSpecs = null;
pXp = null;
}

void
SamiLineItem::cleanup() {
    if(pID != null) {
        
        delete pID;
        pID = null;
    }
if(pProductID != null) {
        
        delete pProductID;
        pProductID = null;
    }
if(pQuantity != null) {
        
        delete pQuantity;
        pQuantity = null;
    }
if(pUnitPrice != null) {
        
        delete pUnitPrice;
        pUnitPrice = null;
    }
if(pCostCenter != null) {
        
        delete pCostCenter;
        pCostCenter = null;
    }
if(pDateNeeded != null) {
        
        delete pDateNeeded;
        pDateNeeded = null;
    }
if(pShippingAccount != null) {
        
        delete pShippingAccount;
        pShippingAccount = null;
    }
if(pShippingAddressID != null) {
        
        delete pShippingAddressID;
        pShippingAddressID = null;
    }
if(pShipfromAddressID != null) {
        
        delete pShipfromAddressID;
        pShipfromAddressID = null;
    }
if(pShipperID != null) {
        
        delete pShipperID;
        pShipperID = null;
    }
if(pSpecs != null) {
        pSpecs->RemoveAll(true);
        delete pSpecs;
        pSpecs = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
}


SamiLineItem*
SamiLineItem::fromJson(String* json) {
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
SamiLineItem::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pProductIDKey = new JsonString(L"ProductID");
        IJsonValue* pProductIDVal = null;
        pJsonObject->GetValue(pProductIDKey, pProductIDVal);
        if(pProductIDVal != null) {
            
            pProductID = new String();
            jsonToValue(pProductID, pProductIDVal, L"String", L"String");
        }
        delete pProductIDKey;
JsonString* pQuantityKey = new JsonString(L"Quantity");
        IJsonValue* pQuantityVal = null;
        pJsonObject->GetValue(pQuantityKey, pQuantityVal);
        if(pQuantityVal != null) {
            
            pQuantity = null;
            jsonToValue(pQuantity, pQuantityVal, L"Integer", L"Integer");
        }
        delete pQuantityKey;
JsonString* pUnitPriceKey = new JsonString(L"UnitPrice");
        IJsonValue* pUnitPriceVal = null;
        pJsonObject->GetValue(pUnitPriceKey, pUnitPriceVal);
        if(pUnitPriceVal != null) {
            
            pUnitPrice = new Long();
            jsonToValue(pUnitPrice, pUnitPriceVal, L"Long", L"Long");
        }
        delete pUnitPriceKey;
JsonString* pCostCenterKey = new JsonString(L"CostCenter");
        IJsonValue* pCostCenterVal = null;
        pJsonObject->GetValue(pCostCenterKey, pCostCenterVal);
        if(pCostCenterVal != null) {
            
            pCostCenter = new String();
            jsonToValue(pCostCenter, pCostCenterVal, L"String", L"String");
        }
        delete pCostCenterKey;
JsonString* pDateNeededKey = new JsonString(L"DateNeeded");
        IJsonValue* pDateNeededVal = null;
        pJsonObject->GetValue(pDateNeededKey, pDateNeededVal);
        if(pDateNeededVal != null) {
            
            pDateNeeded = new DateTime();
            jsonToValue(pDateNeeded, pDateNeededVal, L"SamiDate", L"SamiDate");
        }
        delete pDateNeededKey;
JsonString* pShippingAccountKey = new JsonString(L"ShippingAccount");
        IJsonValue* pShippingAccountVal = null;
        pJsonObject->GetValue(pShippingAccountKey, pShippingAccountVal);
        if(pShippingAccountVal != null) {
            
            pShippingAccount = new String();
            jsonToValue(pShippingAccount, pShippingAccountVal, L"String", L"String");
        }
        delete pShippingAccountKey;
JsonString* pShippingAddressIDKey = new JsonString(L"ShippingAddressID");
        IJsonValue* pShippingAddressIDVal = null;
        pJsonObject->GetValue(pShippingAddressIDKey, pShippingAddressIDVal);
        if(pShippingAddressIDVal != null) {
            
            pShippingAddressID = new String();
            jsonToValue(pShippingAddressID, pShippingAddressIDVal, L"String", L"String");
        }
        delete pShippingAddressIDKey;
JsonString* pShipfromAddressIDKey = new JsonString(L"ShipfromAddressID");
        IJsonValue* pShipfromAddressIDVal = null;
        pJsonObject->GetValue(pShipfromAddressIDKey, pShipfromAddressIDVal);
        if(pShipfromAddressIDVal != null) {
            
            pShipfromAddressID = new String();
            jsonToValue(pShipfromAddressID, pShipfromAddressIDVal, L"String", L"String");
        }
        delete pShipfromAddressIDKey;
JsonString* pShipperIDKey = new JsonString(L"ShipperID");
        IJsonValue* pShipperIDVal = null;
        pJsonObject->GetValue(pShipperIDKey, pShipperIDVal);
        if(pShipperIDVal != null) {
            
            pShipperID = new String();
            jsonToValue(pShipperID, pShipperIDVal, L"String", L"String");
        }
        delete pShipperIDKey;
JsonString* pSpecsKey = new JsonString(L"Specs");
        IJsonValue* pSpecsVal = null;
        pJsonObject->GetValue(pSpecsKey, pSpecsVal);
        if(pSpecsVal != null) {
            pSpecs = new ArrayList();
            
            jsonToValue(pSpecs, pSpecsVal, L"IList", L"SamiShipmentItem");
        }
        delete pSpecsKey;
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

SamiLineItem::SamiLineItem(String* json) {
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
SamiLineItem::asJson ()
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
SamiLineItem::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pProductIDKey = new JsonString(L"ProductID");
    pJsonObject->Add(pProductIDKey, toJson(getPProductID(), "String", ""));

    JsonString *pQuantityKey = new JsonString(L"Quantity");
    pJsonObject->Add(pQuantityKey, toJson(getPQuantity(), "Integer", ""));

    JsonString *pUnitPriceKey = new JsonString(L"UnitPrice");
    pJsonObject->Add(pUnitPriceKey, toJson(getPUnitPrice(), "Long", ""));

    JsonString *pCostCenterKey = new JsonString(L"CostCenter");
    pJsonObject->Add(pCostCenterKey, toJson(getPCostCenter(), "String", ""));

    JsonString *pDateNeededKey = new JsonString(L"DateNeeded");
    pJsonObject->Add(pDateNeededKey, toJson(getPDateNeeded(), "SamiDate", ""));

    JsonString *pShippingAccountKey = new JsonString(L"ShippingAccount");
    pJsonObject->Add(pShippingAccountKey, toJson(getPShippingAccount(), "String", ""));

    JsonString *pShippingAddressIDKey = new JsonString(L"ShippingAddressID");
    pJsonObject->Add(pShippingAddressIDKey, toJson(getPShippingAddressID(), "String", ""));

    JsonString *pShipfromAddressIDKey = new JsonString(L"ShipfromAddressID");
    pJsonObject->Add(pShipfromAddressIDKey, toJson(getPShipfromAddressID(), "String", ""));

    JsonString *pShipperIDKey = new JsonString(L"ShipperID");
    pJsonObject->Add(pShipperIDKey, toJson(getPShipperID(), "String", ""));

    JsonString *pSpecsKey = new JsonString(L"Specs");
    pJsonObject->Add(pSpecsKey, toJson(getPSpecs(), "SamiShipmentItem", "array"));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    return pJsonObject;
}

String*
SamiLineItem::getPID() {
    return pID;
}
void
SamiLineItem::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiLineItem::getPProductID() {
    return pProductID;
}
void
SamiLineItem::setPProductID(String* pProductID) {
    this->pProductID = pProductID;
}

Integer*
SamiLineItem::getPQuantity() {
    return pQuantity;
}
void
SamiLineItem::setPQuantity(Integer* pQuantity) {
    this->pQuantity = pQuantity;
}

Long*
SamiLineItem::getPUnitPrice() {
    return pUnitPrice;
}
void
SamiLineItem::setPUnitPrice(Long* pUnitPrice) {
    this->pUnitPrice = pUnitPrice;
}

String*
SamiLineItem::getPCostCenter() {
    return pCostCenter;
}
void
SamiLineItem::setPCostCenter(String* pCostCenter) {
    this->pCostCenter = pCostCenter;
}

SamiDate*
SamiLineItem::getPDateNeeded() {
    return pDateNeeded;
}
void
SamiLineItem::setPDateNeeded(SamiDate* pDateNeeded) {
    this->pDateNeeded = pDateNeeded;
}

String*
SamiLineItem::getPShippingAccount() {
    return pShippingAccount;
}
void
SamiLineItem::setPShippingAccount(String* pShippingAccount) {
    this->pShippingAccount = pShippingAccount;
}

String*
SamiLineItem::getPShippingAddressID() {
    return pShippingAddressID;
}
void
SamiLineItem::setPShippingAddressID(String* pShippingAddressID) {
    this->pShippingAddressID = pShippingAddressID;
}

String*
SamiLineItem::getPShipfromAddressID() {
    return pShipfromAddressID;
}
void
SamiLineItem::setPShipfromAddressID(String* pShipfromAddressID) {
    this->pShipfromAddressID = pShipfromAddressID;
}

String*
SamiLineItem::getPShipperID() {
    return pShipperID;
}
void
SamiLineItem::setPShipperID(String* pShipperID) {
    this->pShipperID = pShipperID;
}

IList*
SamiLineItem::getPSpecs() {
    return pSpecs;
}
void
SamiLineItem::setPSpecs(IList* pSpecs) {
    this->pSpecs = pSpecs;
}

SamiObject*
SamiLineItem::getPXp() {
    return pXp;
}
void
SamiLineItem::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}



} /* namespace Swagger */

