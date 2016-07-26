/*
 * SamiCostCenterAssignment.h
 * 
 * 
 */

#ifndef SamiCostCenterAssignment_H_
#define SamiCostCenterAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiCostCenterAssignment: public SamiObject {
public:
    SamiCostCenterAssignment();
    SamiCostCenterAssignment(String* json);
    virtual ~SamiCostCenterAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCostCenterAssignment* fromJson(String* obj);

    String* getPCostCenterID();
    void setPCostCenterID(String* pCostCenterID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);

private:
    String* pCostCenterID;
String* pUserID;
String* pUserGroupID;
};

} /* namespace Swagger */

#endif /* SamiCostCenterAssignment_H_ */
