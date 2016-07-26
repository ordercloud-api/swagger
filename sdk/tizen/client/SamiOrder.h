/*
 * SamiOrder.h
 * 
 * 
 */

#ifndef SamiOrder_H_
#define SamiOrder_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiOrder: public SamiObject {
public:
    SamiOrder();
    SamiOrder(String* json);
    virtual ~SamiOrder();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiOrder* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPType();
    void setPType(String* pType);
    String* getPFromUserID();
    void setPFromUserID(String* pFromUserID);
    String* getPBillingAddressID();
    void setPBillingAddressID(String* pBillingAddressID);
    String* getPShippingAddressID();
    void setPShippingAddressID(String* pShippingAddressID);
    String* getPComments();
    void setPComments(String* pComments);
    Long* getPShippingCost();
    void setPShippingCost(Long* pShippingCost);
    Long* getPTaxCost();
    void setPTaxCost(Long* pTaxCost);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pType;
String* pFromUserID;
String* pBillingAddressID;
String* pShippingAddressID;
String* pComments;
Long* pShippingCost;
Long* pTaxCost;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiOrder_H_ */
