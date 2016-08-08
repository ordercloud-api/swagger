/**
 * OrderCloud
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * ShipmentItem.h
 * 
 * 
 */

#ifndef ShipmentItem_H_
#define ShipmentItem_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ShipmentItem
	: public ModelBase
{
public:
    ShipmentItem();
    virtual ~ShipmentItem();

	/////////////////////////////////////////////
	/// ModelBase overrides
	
    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;
    
 	/////////////////////////////////////////////
	/// ShipmentItem members
	   
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getOrderID() const;
    void setOrderID(utility::string_t value);
    bool OrderIDIsSet() const;
    void unsetOrderID();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLineItemID() const;
    void setLineItemID(utility::string_t value);
    bool LineItemIDIsSet() const;
    void unsetLineItemID();
    /// <summary>
    /// 
    /// </summary>
    int32_t getQuantityShipped() const;
    void setQuantityShipped(int32_t value);
    bool QuantityShippedIsSet() const;
    void unsetQuantityShipped();
    
protected:
    utility::string_t m_OrderID;
    bool m_OrderIDIsSet;
utility::string_t m_LineItemID;
    bool m_LineItemIDIsSet;
int32_t m_QuantityShipped;
    bool m_QuantityShippedIsSet;
};

}
}
}
}

#endif /* ShipmentItem_H_ */