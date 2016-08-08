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



#include "ImpersonateTokenRequest.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

ImpersonateTokenRequest::ImpersonateTokenRequest()
{
    m_ClientID = U("");
    m_ClientIDIsSet = false;
    m_ClaimsIsSet = false;
    
}

ImpersonateTokenRequest::~ImpersonateTokenRequest()
{
}

void ImpersonateTokenRequest::validate() 
{
    // TODO: implement validation
}

web::json::value ImpersonateTokenRequest::toJson() const
{
    web::json::value val = web::json::value::object();
     
	if(m_ClientIDIsSet)
    {
        val[U("ClientID")] = ModelBase::toJson(m_ClientID);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Claims )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0) 
        {
            val[U("Claims")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void ImpersonateTokenRequest::fromJson(web::json::value& val)
{
    if(val.has_field(U("ClientID")))
    {
        setClientID(ModelBase::stringFromJson(val[U("ClientID")]));
                
    }
    {
        m_Claims.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("Claims")))
        {
        for( auto& item : val[U("Claims")].as_array() )
        {
            
            if(item.is_null()) 
            {
                m_Claims.push_back( std::shared_ptr<ShipmentItem>(nullptr) );
            }
            else
            {
                std::shared_ptr<ShipmentItem> newItem(new ShipmentItem());
                newItem->fromJson(item);
                m_Claims.push_back( newItem );
            }
            
        }
        }
    }
    
}

void ImpersonateTokenRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
	if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
	{
		namePrefix += U(".");
	}

	if(m_ClientIDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ClientID"), m_ClientID));
                
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Claims )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0) 
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("Claims"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void ImpersonateTokenRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
	if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
	{
		namePrefix += U(".");
	}

    if(multipart->hasContent(U("ClientID")))
    {
        setClientID(ModelBase::stringFromHttpContent(multipart->getContent(U("ClientID"))));
                
    }
    {
        m_Claims.clear();
        if(multipart->hasContent(U("Claims")))
        {            
        
        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("Claims"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null()) 
            {
                m_Claims.push_back( std::shared_ptr<ShipmentItem>(nullptr) );
            }
            else
            {
                std::shared_ptr<ShipmentItem> newItem(new ShipmentItem());
                newItem->fromJson(item);
                m_Claims.push_back( newItem );
            }
            
        }
        }
    }
    
}
    
   
utility::string_t ImpersonateTokenRequest::getClientID() const
{
	return m_ClientID;
}
void ImpersonateTokenRequest::setClientID(utility::string_t value)
{
	m_ClientID = value;
    m_ClientIDIsSet = true;
}
bool ImpersonateTokenRequest::ClientIDIsSet() const
{
    return m_ClientIDIsSet;
}
void ImpersonateTokenRequest::unsetClientID() 
{
    m_ClientIDIsSet = false;
}
std::vector<std::shared_ptr<ShipmentItem>>& ImpersonateTokenRequest::getClaims()
{
	return m_Claims;
}
bool ImpersonateTokenRequest::ClaimsIsSet() const
{
    return m_ClaimsIsSet;
}
void ImpersonateTokenRequest::unsetClaims() 
{
    m_ClaimsIsSet = false;
}

}
}
}
}
