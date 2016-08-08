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



#include "Spec.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Spec::Spec()
{
    m_ID = U("");
    m_IDIsSet = false;
    m_ListOrder = nullptr;
    m_ListOrderIsSet = false;
    m_Name = U("");
    m_NameIsSet = false;
    m_DefaultValue = U("");
    m_DefaultValueIsSet = false;
    m_Required = false;
    m_RequiredIsSet = false;
    m_AllowOpenText = false;
    m_AllowOpenTextIsSet = false;
    m_DefaultOptionID = U("");
    m_DefaultOptionIDIsSet = false;
    m_XpIsSet = false;
    
}

Spec::~Spec()
{
}

void Spec::validate() 
{
    // TODO: implement validation
}

web::json::value Spec::toJson() const
{
    web::json::value val = web::json::value::object();
     
	if(m_IDIsSet)
    {
        val[U("ID")] = ModelBase::toJson(m_ID);
    }
    if(m_ListOrderIsSet)
    {
        val[U("ListOrder")] = ModelBase::toJson(m_ListOrder);
    }
    if(m_NameIsSet)
    {
        val[U("Name")] = ModelBase::toJson(m_Name);
    }
    if(m_DefaultValueIsSet)
    {
        val[U("DefaultValue")] = ModelBase::toJson(m_DefaultValue);
    }
    if(m_RequiredIsSet)
    {
        val[U("Required")] = ModelBase::toJson(m_Required);
    }
    if(m_AllowOpenTextIsSet)
    {
        val[U("AllowOpenText")] = ModelBase::toJson(m_AllowOpenText);
    }
    if(m_DefaultOptionIDIsSet)
    {
        val[U("DefaultOptionID")] = ModelBase::toJson(m_DefaultOptionID);
    }
    if(m_XpIsSet)
    {
        val[U("xp")] = ModelBase::toJson(m_Xp);
    }
    

    return val;
}

void Spec::fromJson(web::json::value& val)
{
    if(val.has_field(U("ID")))
    {
        setID(ModelBase::stringFromJson(val[U("ID")]));
                
    }
    if(val.has_field(U("ListOrder")))
    {
        setListOrder(ModelBase::int32_tFromJson(val[U("ListOrder")]));
    }
    if(val.has_field(U("Name")))
    {
        setName(ModelBase::stringFromJson(val[U("Name")]));
                
    }
    if(val.has_field(U("DefaultValue")))
    {
        setDefaultValue(ModelBase::stringFromJson(val[U("DefaultValue")]));
                
    }
    if(val.has_field(U("Required")))
    {
        setRequired(ModelBase::boolFromJson(val[U("Required")]));
    }
    if(val.has_field(U("AllowOpenText")))
    {
        setAllowOpenText(ModelBase::boolFromJson(val[U("AllowOpenText")]));
    }
    if(val.has_field(U("DefaultOptionID")))
    {
        setDefaultOptionID(ModelBase::stringFromJson(val[U("DefaultOptionID")]));
                
    }
    if(val.has_field(U("xp")))
    {
        if(!val[U("xp")].is_null()) 
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(val[U("xp")]);
            setXp( newItem );
        }
                
    }
    
}

void Spec::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
	if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
	{
		namePrefix += U(".");
	}

	if(m_IDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ID"), m_ID));
                
    }
    if(m_ListOrderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ListOrder"), m_ListOrder));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("Name"), m_Name));
                
    }
    if(m_DefaultValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("DefaultValue"), m_DefaultValue));
                
    }
    if(m_RequiredIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("Required"), m_Required));
    }
    if(m_AllowOpenTextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("AllowOpenText"), m_AllowOpenText));
    }
    if(m_DefaultOptionIDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("DefaultOptionID"), m_DefaultOptionID));
                
    }
    if(m_XpIsSet)
    {
        if (m_Xp.get())
        {
            m_Xp->toMultipart(multipart, U("xp."));
        }
                
    }
    
}

void Spec::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
	if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
	{
		namePrefix += U(".");
	}

    if(multipart->hasContent(U("ID")))
    {
        setID(ModelBase::stringFromHttpContent(multipart->getContent(U("ID"))));
                
    }
    if(multipart->hasContent(U("ListOrder")))
    {
        setListOrder(ModelBase::int32_tFromHttpContent(multipart->getContent(U("ListOrder"))));
    }
    if(multipart->hasContent(U("Name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(U("Name"))));
                
    }
    if(multipart->hasContent(U("DefaultValue")))
    {
        setDefaultValue(ModelBase::stringFromHttpContent(multipart->getContent(U("DefaultValue"))));
                
    }
    if(multipart->hasContent(U("Required")))
    {
        setRequired(ModelBase::boolFromHttpContent(multipart->getContent(U("Required"))));
    }
    if(multipart->hasContent(U("AllowOpenText")))
    {
        setAllowOpenText(ModelBase::boolFromHttpContent(multipart->getContent(U("AllowOpenText"))));
    }
    if(multipart->hasContent(U("DefaultOptionID")))
    {
        setDefaultOptionID(ModelBase::stringFromHttpContent(multipart->getContent(U("DefaultOptionID"))));
                
    }
    if(multipart->hasContent(U("xp")))
    {
        if(multipart->hasContent(U("xp")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, U("xp."));
            setXp( newItem );
        }
                
    }
    
}
    
   
utility::string_t Spec::getID() const
{
	return m_ID;
}
void Spec::setID(utility::string_t value)
{
	m_ID = value;
    m_IDIsSet = true;
}
bool Spec::IDIsSet() const
{
    return m_IDIsSet;
}
void Spec::unsetID() 
{
    m_IDIsSet = false;
}
int32_t Spec::getListOrder() const
{
	return m_ListOrder;
}
void Spec::setListOrder(int32_t value)
{
	m_ListOrder = value;
    m_ListOrderIsSet = true;
}
bool Spec::ListOrderIsSet() const
{
    return m_ListOrderIsSet;
}
void Spec::unsetListOrder() 
{
    m_ListOrderIsSet = false;
}
utility::string_t Spec::getName() const
{
	return m_Name;
}
void Spec::setName(utility::string_t value)
{
	m_Name = value;
    m_NameIsSet = true;
}
bool Spec::NameIsSet() const
{
    return m_NameIsSet;
}
void Spec::unsetName() 
{
    m_NameIsSet = false;
}
utility::string_t Spec::getDefaultValue() const
{
	return m_DefaultValue;
}
void Spec::setDefaultValue(utility::string_t value)
{
	m_DefaultValue = value;
    m_DefaultValueIsSet = true;
}
bool Spec::DefaultValueIsSet() const
{
    return m_DefaultValueIsSet;
}
void Spec::unsetDefaultValue() 
{
    m_DefaultValueIsSet = false;
}
bool Spec::getRequired() const
{
	return m_Required;
}
void Spec::setRequired(bool value)
{
	m_Required = value;
    m_RequiredIsSet = true;
}
bool Spec::RequiredIsSet() const
{
    return m_RequiredIsSet;
}
void Spec::unsetRequired() 
{
    m_RequiredIsSet = false;
}
bool Spec::getAllowOpenText() const
{
	return m_AllowOpenText;
}
void Spec::setAllowOpenText(bool value)
{
	m_AllowOpenText = value;
    m_AllowOpenTextIsSet = true;
}
bool Spec::AllowOpenTextIsSet() const
{
    return m_AllowOpenTextIsSet;
}
void Spec::unsetAllowOpenText() 
{
    m_AllowOpenTextIsSet = false;
}
utility::string_t Spec::getDefaultOptionID() const
{
	return m_DefaultOptionID;
}
void Spec::setDefaultOptionID(utility::string_t value)
{
	m_DefaultOptionID = value;
    m_DefaultOptionIDIsSet = true;
}
bool Spec::DefaultOptionIDIsSet() const
{
    return m_DefaultOptionIDIsSet;
}
void Spec::unsetDefaultOptionID() 
{
    m_DefaultOptionIDIsSet = false;
}
std::shared_ptr<Object> Spec::getXp() const
{
	return m_Xp;
}
void Spec::setXp(std::shared_ptr<Object> value)
{
	m_Xp = value;
    m_XpIsSet = true;
}
bool Spec::xpIsSet() const
{
    return m_XpIsSet;
}
void Spec::unsetXp() 
{
    m_XpIsSet = false;
}

}
}
}
}
