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



#include "PasswordReset.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PasswordReset::PasswordReset()
{
    m_ClientID = U("");
    m_ClientIDIsSet = false;
    m_Username = U("");
    m_UsernameIsSet = false;
    m_Password = U("");
    m_PasswordIsSet = false;
    
}

PasswordReset::~PasswordReset()
{
}

void PasswordReset::validate() 
{
    // TODO: implement validation
}

web::json::value PasswordReset::toJson() const
{
    web::json::value val = web::json::value::object();
     
	if(m_ClientIDIsSet)
    {
        val[U("ClientID")] = ModelBase::toJson(m_ClientID);
    }
    if(m_UsernameIsSet)
    {
        val[U("Username")] = ModelBase::toJson(m_Username);
    }
    if(m_PasswordIsSet)
    {
        val[U("Password")] = ModelBase::toJson(m_Password);
    }
    

    return val;
}

void PasswordReset::fromJson(web::json::value& val)
{
    if(val.has_field(U("ClientID")))
    {
        setClientID(ModelBase::stringFromJson(val[U("ClientID")]));
                
    }
    if(val.has_field(U("Username")))
    {
        setUsername(ModelBase::stringFromJson(val[U("Username")]));
                
    }
    if(val.has_field(U("Password")))
    {
        setPassword(ModelBase::stringFromJson(val[U("Password")]));
                
    }
    
}

void PasswordReset::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_UsernameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("Username"), m_Username));
                
    }
    if(m_PasswordIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("Password"), m_Password));
                
    }
    
}

void PasswordReset::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(U("Username")))
    {
        setUsername(ModelBase::stringFromHttpContent(multipart->getContent(U("Username"))));
                
    }
    if(multipart->hasContent(U("Password")))
    {
        setPassword(ModelBase::stringFromHttpContent(multipart->getContent(U("Password"))));
                
    }
    
}
    
   
utility::string_t PasswordReset::getClientID() const
{
	return m_ClientID;
}
void PasswordReset::setClientID(utility::string_t value)
{
	m_ClientID = value;
    m_ClientIDIsSet = true;
}
bool PasswordReset::ClientIDIsSet() const
{
    return m_ClientIDIsSet;
}
void PasswordReset::unsetClientID() 
{
    m_ClientIDIsSet = false;
}
utility::string_t PasswordReset::getUsername() const
{
	return m_Username;
}
void PasswordReset::setUsername(utility::string_t value)
{
	m_Username = value;
    m_UsernameIsSet = true;
}
bool PasswordReset::UsernameIsSet() const
{
    return m_UsernameIsSet;
}
void PasswordReset::unsetUsername() 
{
    m_UsernameIsSet = false;
}
utility::string_t PasswordReset::getPassword() const
{
	return m_Password;
}
void PasswordReset::setPassword(utility::string_t value)
{
	m_Password = value;
    m_PasswordIsSet = true;
}
bool PasswordReset::PasswordIsSet() const
{
    return m_PasswordIsSet;
}
void PasswordReset::unsetPassword() 
{
    m_PasswordIsSet = false;
}

}
}
}
}
