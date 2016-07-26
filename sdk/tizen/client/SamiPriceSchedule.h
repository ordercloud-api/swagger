/*
 * SamiPriceSchedule.h
 * 
 * 
 */

#ifndef SamiPriceSchedule_H_
#define SamiPriceSchedule_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
#include "SamiShipmentItem.h"
using Tizen::Base::Boolean;
using Tizen::Base::Collection::IList;
using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiPriceSchedule: public SamiObject {
public:
    SamiPriceSchedule();
    SamiPriceSchedule(String* json);
    virtual ~SamiPriceSchedule();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPriceSchedule* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    Boolean* getPApplyTax();
    void setPApplyTax(Boolean* pApplyTax);
    Boolean* getPApplyShipping();
    void setPApplyShipping(Boolean* pApplyShipping);
    Integer* getPMaxQuantity();
    void setPMaxQuantity(Integer* pMaxQuantity);
    Boolean* getPUseCumulativeQuantity();
    void setPUseCumulativeQuantity(Boolean* pUseCumulativeQuantity);
    Boolean* getPRestrictedQuantity();
    void setPRestrictedQuantity(Boolean* pRestrictedQuantity);
    String* getPOrderType();
    void setPOrderType(String* pOrderType);
    IList* getPPriceBreaks();
    void setPPriceBreaks(IList* pPriceBreaks);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
Boolean* pApplyTax;
Boolean* pApplyShipping;
Integer* pMaxQuantity;
Boolean* pUseCumulativeQuantity;
Boolean* pRestrictedQuantity;
String* pOrderType;
IList* pPriceBreaks;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiPriceSchedule_H_ */
