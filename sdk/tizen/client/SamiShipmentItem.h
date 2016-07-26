/*
 * SamiShipmentItem.h
 * 
 * 
 */

#ifndef SamiShipmentItem_H_
#define SamiShipmentItem_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiShipmentItem: public SamiObject {
public:
    SamiShipmentItem();
    SamiShipmentItem(String* json);
    virtual ~SamiShipmentItem();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiShipmentItem* fromJson(String* obj);

    String* getPOrderID();
    void setPOrderID(String* pOrderID);
    String* getPLineItemID();
    void setPLineItemID(String* pLineItemID);
    Integer* getPQuantityShipped();
    void setPQuantityShipped(Integer* pQuantityShipped);

private:
    String* pOrderID;
String* pLineItemID;
Integer* pQuantityShipped;
};

} /* namespace Swagger */

#endif /* SamiShipmentItem_H_ */
