/*
 * SamiProductAssignment.h
 * 
 * 
 */

#ifndef SamiProductAssignment_H_
#define SamiProductAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiProductAssignment: public SamiObject {
public:
    SamiProductAssignment();
    SamiProductAssignment(String* json);
    virtual ~SamiProductAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiProductAssignment* fromJson(String* obj);

    String* getPProductID();
    void setPProductID(String* pProductID);
    String* getPStandardPriceScheduleID();
    void setPStandardPriceScheduleID(String* pStandardPriceScheduleID);
    String* getPReplenishmentPriceScheduleID();
    void setPReplenishmentPriceScheduleID(String* pReplenishmentPriceScheduleID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);
    String* getPBuyerID();
    void setPBuyerID(String* pBuyerID);

private:
    String* pProductID;
String* pStandardPriceScheduleID;
String* pReplenishmentPriceScheduleID;
String* pUserID;
String* pUserGroupID;
String* pBuyerID;
};

} /* namespace Swagger */

#endif /* SamiProductAssignment_H_ */
