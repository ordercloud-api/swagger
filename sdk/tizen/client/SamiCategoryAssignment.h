/*
 * SamiCategoryAssignment.h
 * 
 * 
 */

#ifndef SamiCategoryAssignment_H_
#define SamiCategoryAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiCategoryAssignment: public SamiObject {
public:
    SamiCategoryAssignment();
    SamiCategoryAssignment(String* json);
    virtual ~SamiCategoryAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCategoryAssignment* fromJson(String* obj);

    String* getPCategoryID();
    void setPCategoryID(String* pCategoryID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);

private:
    String* pCategoryID;
String* pUserID;
String* pUserGroupID;
};

} /* namespace Swagger */

#endif /* SamiCategoryAssignment_H_ */
