/*
 * SamiPromotionAssignment.h
 * 
 * 
 */

#ifndef SamiPromotionAssignment_H_
#define SamiPromotionAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiPromotionAssignment: public SamiObject {
public:
    SamiPromotionAssignment();
    SamiPromotionAssignment(String* json);
    virtual ~SamiPromotionAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPromotionAssignment* fromJson(String* obj);

    String* getPPromotionID();
    void setPPromotionID(String* pPromotionID);
    String* getPBuyerID();
    void setPBuyerID(String* pBuyerID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);

private:
    String* pPromotionID;
String* pBuyerID;
String* pUserID;
String* pUserGroupID;
};

} /* namespace Swagger */

#endif /* SamiPromotionAssignment_H_ */
