/*
 * SamiAddressAssignment.h
 * 
 * 
 */

#ifndef SamiAddressAssignment_H_
#define SamiAddressAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Boolean;
using Tizen::Base::String;


namespace Swagger {

class SamiAddressAssignment: public SamiObject {
public:
    SamiAddressAssignment();
    SamiAddressAssignment(String* json);
    virtual ~SamiAddressAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiAddressAssignment* fromJson(String* obj);

    String* getPAddressID();
    void setPAddressID(String* pAddressID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);
    Boolean* getPIsShipping();
    void setPIsShipping(Boolean* pIsShipping);
    Boolean* getPIsBilling();
    void setPIsBilling(Boolean* pIsBilling);

private:
    String* pAddressID;
String* pUserID;
String* pUserGroupID;
Boolean* pIsShipping;
Boolean* pIsBilling;
};

} /* namespace Swagger */

#endif /* SamiAddressAssignment_H_ */
