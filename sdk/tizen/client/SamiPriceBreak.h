/*
 * SamiPriceBreak.h
 * 
 * 
 */

#ifndef SamiPriceBreak_H_
#define SamiPriceBreak_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Integer;
using Tizen::Base::Long;


namespace Swagger {

class SamiPriceBreak: public SamiObject {
public:
    SamiPriceBreak();
    SamiPriceBreak(String* json);
    virtual ~SamiPriceBreak();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPriceBreak* fromJson(String* obj);

    Integer* getPQuantity();
    void setPQuantity(Integer* pQuantity);
    Long* getPPrice();
    void setPPrice(Long* pPrice);

private:
    Integer* pQuantity;
Long* pPrice;
};

} /* namespace Swagger */

#endif /* SamiPriceBreak_H_ */
