/*
 * SamiUserGroupAssignment.h
 * 
 * 
 */

#ifndef SamiUserGroupAssignment_H_
#define SamiUserGroupAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiUserGroupAssignment: public SamiObject {
public:
    SamiUserGroupAssignment();
    SamiUserGroupAssignment(String* json);
    virtual ~SamiUserGroupAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiUserGroupAssignment* fromJson(String* obj);

    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);
    String* getPUserID();
    void setPUserID(String* pUserID);

private:
    String* pUserGroupID;
String* pUserID;
};

} /* namespace Swagger */

#endif /* SamiUserGroupAssignment_H_ */
