/*
 * SamiAddress.h
 * 
 * 
 */

#ifndef SamiAddress_H_
#define SamiAddress_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::String;


namespace Swagger {

class SamiAddress: public SamiObject {
public:
    SamiAddress();
    SamiAddress(String* json);
    virtual ~SamiAddress();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiAddress* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
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
    String* pID;
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

#endif /* SamiAddress_H_ */
