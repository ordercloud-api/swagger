/*
 * SamiLineItem.h
 * 
 * 
 */

#ifndef SamiLineItem_H_
#define SamiLineItem_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiDate.h"
#include "SamiObject.h"
#include "SamiShipmentItem.h"
using Tizen::Base::Collection::IList;
using Tizen::Base::Integer;
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiLineItem: public SamiObject {
public:
    SamiLineItem();
    SamiLineItem(String* json);
    virtual ~SamiLineItem();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiLineItem* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPProductID();
    void setPProductID(String* pProductID);
    Integer* getPQuantity();
    void setPQuantity(Integer* pQuantity);
    Long* getPUnitPrice();
    void setPUnitPrice(Long* pUnitPrice);
    String* getPCostCenter();
    void setPCostCenter(String* pCostCenter);
    SamiDate* getPDateNeeded();
    void setPDateNeeded(SamiDate* pDateNeeded);
    String* getPShippingAccount();
    void setPShippingAccount(String* pShippingAccount);
    String* getPShippingAddressID();
    void setPShippingAddressID(String* pShippingAddressID);
    String* getPShipfromAddressID();
    void setPShipfromAddressID(String* pShipfromAddressID);
    String* getPShipperID();
    void setPShipperID(String* pShipperID);
    IList* getPSpecs();
    void setPSpecs(IList* pSpecs);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pProductID;
Integer* pQuantity;
Long* pUnitPrice;
String* pCostCenter;
SamiDate* pDateNeeded;
String* pShippingAccount;
String* pShippingAddressID;
String* pShipfromAddressID;
String* pShipperID;
IList* pSpecs;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiLineItem_H_ */
