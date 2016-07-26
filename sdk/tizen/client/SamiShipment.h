/*
 * SamiShipment.h
 * 
 * 
 */

#ifndef SamiShipment_H_
#define SamiShipment_H_

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
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiShipment: public SamiObject {
public:
    SamiShipment();
    SamiShipment(String* json);
    virtual ~SamiShipment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiShipment* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPShipper();
    void setPShipper(String* pShipper);
    SamiDate* getPDateShipped();
    void setPDateShipped(SamiDate* pDateShipped);
    String* getPTrackingNumber();
    void setPTrackingNumber(String* pTrackingNumber);
    Long* getPCost();
    void setPCost(Long* pCost);
    IList* getPItems();
    void setPItems(IList* pItems);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pShipper;
SamiDate* pDateShipped;
String* pTrackingNumber;
Long* pCost;
IList* pItems;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiShipment_H_ */
