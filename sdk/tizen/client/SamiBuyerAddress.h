/*
 * SamiBuyerAddress.h
 * 
 * 
 */

#ifndef SamiBuyerAddress_H_
#define SamiBuyerAddress_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Boolean;
using Tizen::Base::String;


namespace Swagger {

class SamiBuyerAddress: public SamiObject {
public:
    SamiBuyerAddress();
    SamiBuyerAddress(String* json);
    virtual ~SamiBuyerAddress();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiBuyerAddress* fromJson(String* obj);

    Boolean* getPShipping();
    void setPShipping(Boolean* pShipping);
    Boolean* getPBilling();
    void setPBilling(Boolean* pBilling);
    String* getPCompanyName();
    void setPCompanyName(String* pCompanyName);
    String* getPFirstName();
    void setPFirstName(String* pFirstName);
    String* getPLastName();
    void setPLastName(String* pLastName);
    String* getPStreet1();
    void setPStreet1(String* pStreet1);
    String* getPStreet2();
    void setPStreet2(String* pStreet2);
    String* getPCity();
    void setPCity(String* pCity);
    String* getPState();
    void setPState(String* pState);
    String* getPZip();
    void setPZip(String* pZip);
    String* getPCountry();
    void setPCountry(String* pCountry);
    String* getPPhone();
    void setPPhone(String* pPhone);
    String* getPAddressName();
    void setPAddressName(String* pAddressName);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    Boolean* pShipping;
Boolean* pBilling;
String* pCompanyName;
String* pFirstName;
String* pLastName;
String* pStreet1;
String* pStreet2;
String* pCity;
String* pState;
String* pZip;
String* pCountry;
String* pPhone;
String* pAddressName;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiBuyerAddress_H_ */
