/*
 * SamiProduct.h
 * 
 * 
 */

#ifndef SamiProduct_H_
#define SamiProduct_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Boolean;
using Tizen::Base::Integer;
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiProduct: public SamiObject {
public:
    SamiProduct();
    SamiProduct(String* json);
    virtual ~SamiProduct();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiProduct* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    String* getPDescription();
    void setPDescription(String* pDescription);
    Integer* getPQuantityMultiplier();
    void setPQuantityMultiplier(Integer* pQuantityMultiplier);
    Long* getPShipWeight();
    void setPShipWeight(Long* pShipWeight);
    Boolean* getPActive();
    void setPActive(Boolean* pActive);
    String* getPType();
    void setPType(String* pType);
    Boolean* getPInventoryEnabled();
    void setPInventoryEnabled(Boolean* pInventoryEnabled);
    Integer* getPInventoryNotificationPoint();
    void setPInventoryNotificationPoint(Integer* pInventoryNotificationPoint);
    Boolean* getPVariantLevelInventory();
    void setPVariantLevelInventory(Boolean* pVariantLevelInventory);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);
    Boolean* getPAllowOrderExceedInventory();
    void setPAllowOrderExceedInventory(Boolean* pAllowOrderExceedInventory);
    Boolean* getPInventoryVisible();
    void setPInventoryVisible(Boolean* pInventoryVisible);

private:
    String* pID;
String* pName;
String* pDescription;
Integer* pQuantityMultiplier;
Long* pShipWeight;
Boolean* pActive;
String* pType;
Boolean* pInventoryEnabled;
Integer* pInventoryNotificationPoint;
Boolean* pVariantLevelInventory;
SamiObject* pXp;
Boolean* pAllowOrderExceedInventory;
Boolean* pInventoryVisible;
};

} /* namespace Swagger */

#endif /* SamiProduct_H_ */
