
#include "SamiProduct.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiProduct::SamiProduct() {
    init();
}

SamiProduct::~SamiProduct() {
    this->cleanup();
}

void
SamiProduct::init() {
    pID = null;
pName = null;
pDescription = null;
pQuantityMultiplier = null;
pShipWeight = null;
pActive = null;
pType = null;
pInventoryEnabled = null;
pInventoryNotificationPoint = null;
pVariantLevelInventory = null;
pXp = null;
pAllowOrderExceedInventory = null;
pInventoryVisible = null;
}

void
SamiProduct::cleanup() {
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
if(pQuantityMultiplier != null) {
        
        delete pQuantityMultiplier;
        pQuantityMultiplier = null;
    }
if(pShipWeight != null) {
        
        delete pShipWeight;
        pShipWeight = null;
    }
if(pActive != null) {
        
        delete pActive;
        pActive = null;
    }
if(pType != null) {
        
        delete pType;
        pType = null;
    }
if(pInventoryEnabled != null) {
        
        delete pInventoryEnabled;
        pInventoryEnabled = null;
    }
if(pInventoryNotificationPoint != null) {
        
        delete pInventoryNotificationPoint;
        pInventoryNotificationPoint = null;
    }
if(pVariantLevelInventory != null) {
        
        delete pVariantLevelInventory;
        pVariantLevelInventory = null;
    }
if(pXp != null) {
        
        delete pXp;
        pXp = null;
    }
if(pAllowOrderExceedInventory != null) {
        
        delete pAllowOrderExceedInventory;
        pAllowOrderExceedInventory = null;
    }
if(pInventoryVisible != null) {
        
        delete pInventoryVisible;
        pInventoryVisible = null;
    }
}


SamiProduct*
SamiProduct::fromJson(String* json) {
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
SamiProduct::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pQuantityMultiplierKey = new JsonString(L"QuantityMultiplier");
        IJsonValue* pQuantityMultiplierVal = null;
        pJsonObject->GetValue(pQuantityMultiplierKey, pQuantityMultiplierVal);
        if(pQuantityMultiplierVal != null) {
            
            pQuantityMultiplier = null;
            jsonToValue(pQuantityMultiplier, pQuantityMultiplierVal, L"Integer", L"Integer");
        }
        delete pQuantityMultiplierKey;
JsonString* pShipWeightKey = new JsonString(L"ShipWeight");
        IJsonValue* pShipWeightVal = null;
        pJsonObject->GetValue(pShipWeightKey, pShipWeightVal);
        if(pShipWeightVal != null) {
            
            pShipWeight = new Long();
            jsonToValue(pShipWeight, pShipWeightVal, L"Long", L"Long");
        }
        delete pShipWeightKey;
JsonString* pActiveKey = new JsonString(L"Active");
        IJsonValue* pActiveVal = null;
        pJsonObject->GetValue(pActiveKey, pActiveVal);
        if(pActiveVal != null) {
            
            pActive = new Boolean(false);
            jsonToValue(pActive, pActiveVal, L"Boolean", L"Boolean");
        }
        delete pActiveKey;
JsonString* pTypeKey = new JsonString(L"Type");
        IJsonValue* pTypeVal = null;
        pJsonObject->GetValue(pTypeKey, pTypeVal);
        if(pTypeVal != null) {
            
            pType = new String();
            jsonToValue(pType, pTypeVal, L"String", L"String");
        }
        delete pTypeKey;
JsonString* pInventoryEnabledKey = new JsonString(L"InventoryEnabled");
        IJsonValue* pInventoryEnabledVal = null;
        pJsonObject->GetValue(pInventoryEnabledKey, pInventoryEnabledVal);
        if(pInventoryEnabledVal != null) {
            
            pInventoryEnabled = new Boolean(false);
            jsonToValue(pInventoryEnabled, pInventoryEnabledVal, L"Boolean", L"Boolean");
        }
        delete pInventoryEnabledKey;
JsonString* pInventoryNotificationPointKey = new JsonString(L"InventoryNotificationPoint");
        IJsonValue* pInventoryNotificationPointVal = null;
        pJsonObject->GetValue(pInventoryNotificationPointKey, pInventoryNotificationPointVal);
        if(pInventoryNotificationPointVal != null) {
            
            pInventoryNotificationPoint = null;
            jsonToValue(pInventoryNotificationPoint, pInventoryNotificationPointVal, L"Integer", L"Integer");
        }
        delete pInventoryNotificationPointKey;
JsonString* pVariantLevelInventoryKey = new JsonString(L"VariantLevelInventory");
        IJsonValue* pVariantLevelInventoryVal = null;
        pJsonObject->GetValue(pVariantLevelInventoryKey, pVariantLevelInventoryVal);
        if(pVariantLevelInventoryVal != null) {
            
            pVariantLevelInventory = new Boolean(false);
            jsonToValue(pVariantLevelInventory, pVariantLevelInventoryVal, L"Boolean", L"Boolean");
        }
        delete pVariantLevelInventoryKey;
JsonString* pXpKey = new JsonString(L"xp");
        IJsonValue* pXpVal = null;
        pJsonObject->GetValue(pXpKey, pXpVal);
        if(pXpVal != null) {
            
            pXp = null;
            jsonToValue(pXp, pXpVal, L"SamiObject", L"SamiObject");
        }
        delete pXpKey;
JsonString* pAllowOrderExceedInventoryKey = new JsonString(L"AllowOrderExceedInventory");
        IJsonValue* pAllowOrderExceedInventoryVal = null;
        pJsonObject->GetValue(pAllowOrderExceedInventoryKey, pAllowOrderExceedInventoryVal);
        if(pAllowOrderExceedInventoryVal != null) {
            
            pAllowOrderExceedInventory = new Boolean(false);
            jsonToValue(pAllowOrderExceedInventory, pAllowOrderExceedInventoryVal, L"Boolean", L"Boolean");
        }
        delete pAllowOrderExceedInventoryKey;
JsonString* pInventoryVisibleKey = new JsonString(L"InventoryVisible");
        IJsonValue* pInventoryVisibleVal = null;
        pJsonObject->GetValue(pInventoryVisibleKey, pInventoryVisibleVal);
        if(pInventoryVisibleVal != null) {
            
            pInventoryVisible = new Boolean(false);
            jsonToValue(pInventoryVisible, pInventoryVisibleVal, L"Boolean", L"Boolean");
        }
        delete pInventoryVisibleKey;
    }
}

SamiProduct::SamiProduct(String* json) {
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
SamiProduct::asJson ()
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
SamiProduct::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pIDKey = new JsonString(L"ID");
    pJsonObject->Add(pIDKey, toJson(getPID(), "String", ""));

    JsonString *pNameKey = new JsonString(L"Name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    JsonString *pDescriptionKey = new JsonString(L"Description");
    pJsonObject->Add(pDescriptionKey, toJson(getPDescription(), "String", ""));

    JsonString *pQuantityMultiplierKey = new JsonString(L"QuantityMultiplier");
    pJsonObject->Add(pQuantityMultiplierKey, toJson(getPQuantityMultiplier(), "Integer", ""));

    JsonString *pShipWeightKey = new JsonString(L"ShipWeight");
    pJsonObject->Add(pShipWeightKey, toJson(getPShipWeight(), "Long", ""));

    JsonString *pActiveKey = new JsonString(L"Active");
    pJsonObject->Add(pActiveKey, toJson(getPActive(), "Boolean", ""));

    JsonString *pTypeKey = new JsonString(L"Type");
    pJsonObject->Add(pTypeKey, toJson(getPType(), "String", ""));

    JsonString *pInventoryEnabledKey = new JsonString(L"InventoryEnabled");
    pJsonObject->Add(pInventoryEnabledKey, toJson(getPInventoryEnabled(), "Boolean", ""));

    JsonString *pInventoryNotificationPointKey = new JsonString(L"InventoryNotificationPoint");
    pJsonObject->Add(pInventoryNotificationPointKey, toJson(getPInventoryNotificationPoint(), "Integer", ""));

    JsonString *pVariantLevelInventoryKey = new JsonString(L"VariantLevelInventory");
    pJsonObject->Add(pVariantLevelInventoryKey, toJson(getPVariantLevelInventory(), "Boolean", ""));

    JsonString *pXpKey = new JsonString(L"xp");
    pJsonObject->Add(pXpKey, toJson(getPXp(), "SamiObject", ""));

    JsonString *pAllowOrderExceedInventoryKey = new JsonString(L"AllowOrderExceedInventory");
    pJsonObject->Add(pAllowOrderExceedInventoryKey, toJson(getPAllowOrderExceedInventory(), "Boolean", ""));

    JsonString *pInventoryVisibleKey = new JsonString(L"InventoryVisible");
    pJsonObject->Add(pInventoryVisibleKey, toJson(getPInventoryVisible(), "Boolean", ""));

    return pJsonObject;
}

String*
SamiProduct::getPID() {
    return pID;
}
void
SamiProduct::setPID(String* pID) {
    this->pID = pID;
}

String*
SamiProduct::getPName() {
    return pName;
}
void
SamiProduct::setPName(String* pName) {
    this->pName = pName;
}

String*
SamiProduct::getPDescription() {
    return pDescription;
}
void
SamiProduct::setPDescription(String* pDescription) {
    this->pDescription = pDescription;
}

Integer*
SamiProduct::getPQuantityMultiplier() {
    return pQuantityMultiplier;
}
void
SamiProduct::setPQuantityMultiplier(Integer* pQuantityMultiplier) {
    this->pQuantityMultiplier = pQuantityMultiplier;
}

Long*
SamiProduct::getPShipWeight() {
    return pShipWeight;
}
void
SamiProduct::setPShipWeight(Long* pShipWeight) {
    this->pShipWeight = pShipWeight;
}

Boolean*
SamiProduct::getPActive() {
    return pActive;
}
void
SamiProduct::setPActive(Boolean* pActive) {
    this->pActive = pActive;
}

String*
SamiProduct::getPType() {
    return pType;
}
void
SamiProduct::setPType(String* pType) {
    this->pType = pType;
}

Boolean*
SamiProduct::getPInventoryEnabled() {
    return pInventoryEnabled;
}
void
SamiProduct::setPInventoryEnabled(Boolean* pInventoryEnabled) {
    this->pInventoryEnabled = pInventoryEnabled;
}

Integer*
SamiProduct::getPInventoryNotificationPoint() {
    return pInventoryNotificationPoint;
}
void
SamiProduct::setPInventoryNotificationPoint(Integer* pInventoryNotificationPoint) {
    this->pInventoryNotificationPoint = pInventoryNotificationPoint;
}

Boolean*
SamiProduct::getPVariantLevelInventory() {
    return pVariantLevelInventory;
}
void
SamiProduct::setPVariantLevelInventory(Boolean* pVariantLevelInventory) {
    this->pVariantLevelInventory = pVariantLevelInventory;
}

SamiObject*
SamiProduct::getPXp() {
    return pXp;
}
void
SamiProduct::setPXp(SamiObject* pXp) {
    this->pXp = pXp;
}

Boolean*
SamiProduct::getPAllowOrderExceedInventory() {
    return pAllowOrderExceedInventory;
}
void
SamiProduct::setPAllowOrderExceedInventory(Boolean* pAllowOrderExceedInventory) {
    this->pAllowOrderExceedInventory = pAllowOrderExceedInventory;
}

Boolean*
SamiProduct::getPInventoryVisible() {
    return pInventoryVisible;
}
void
SamiProduct::setPInventoryVisible(Boolean* pInventoryVisible) {
    this->pInventoryVisible = pInventoryVisible;
}



} /* namespace Swagger */

