<?php
/**
 * ApprovalRule
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * OrderCloud
 *
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * ApprovalRule Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class ApprovalRule implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'ApprovalRule';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'id' => 'string',
        'name' => 'string',
        'description' => 'string',
        'approving_group_id' => 'string',
        'rule_expression' => 'string',
        'scope' => 'string',
        'scope_time_unit' => 'string',
        'scope_time_number' => 'int',
        'scope_start_date' => '\DateTime',
        'expire_after_time_unit' => 'string',
        'expire_after_number' => 'int',
        'approve_on_expire' => 'bool',
        'xp' => 'object'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'id' => 'ID',
        'name' => 'Name',
        'description' => 'Description',
        'approving_group_id' => 'ApprovingGroupID',
        'rule_expression' => 'RuleExpression',
        'scope' => 'Scope',
        'scope_time_unit' => 'ScopeTimeUnit',
        'scope_time_number' => 'ScopeTimeNumber',
        'scope_start_date' => 'ScopeStartDate',
        'expire_after_time_unit' => 'ExpireAfterTimeUnit',
        'expire_after_number' => 'ExpireAfterNumber',
        'approve_on_expire' => 'ApproveOnExpire',
        'xp' => 'xp'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'id' => 'setId',
        'name' => 'setName',
        'description' => 'setDescription',
        'approving_group_id' => 'setApprovingGroupId',
        'rule_expression' => 'setRuleExpression',
        'scope' => 'setScope',
        'scope_time_unit' => 'setScopeTimeUnit',
        'scope_time_number' => 'setScopeTimeNumber',
        'scope_start_date' => 'setScopeStartDate',
        'expire_after_time_unit' => 'setExpireAfterTimeUnit',
        'expire_after_number' => 'setExpireAfterNumber',
        'approve_on_expire' => 'setApproveOnExpire',
        'xp' => 'setXp'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'id' => 'getId',
        'name' => 'getName',
        'description' => 'getDescription',
        'approving_group_id' => 'getApprovingGroupId',
        'rule_expression' => 'getRuleExpression',
        'scope' => 'getScope',
        'scope_time_unit' => 'getScopeTimeUnit',
        'scope_time_number' => 'getScopeTimeNumber',
        'scope_start_date' => 'getScopeStartDate',
        'expire_after_time_unit' => 'getExpireAfterTimeUnit',
        'expire_after_number' => 'getExpireAfterNumber',
        'approve_on_expire' => 'getApproveOnExpire',
        'xp' => 'getXp'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['approving_group_id'] = isset($data['approving_group_id']) ? $data['approving_group_id'] : null;
        $this->container['rule_expression'] = isset($data['rule_expression']) ? $data['rule_expression'] : null;
        $this->container['scope'] = isset($data['scope']) ? $data['scope'] : null;
        $this->container['scope_time_unit'] = isset($data['scope_time_unit']) ? $data['scope_time_unit'] : null;
        $this->container['scope_time_number'] = isset($data['scope_time_number']) ? $data['scope_time_number'] : null;
        $this->container['scope_start_date'] = isset($data['scope_start_date']) ? $data['scope_start_date'] : null;
        $this->container['expire_after_time_unit'] = isset($data['expire_after_time_unit']) ? $data['expire_after_time_unit'] : null;
        $this->container['expire_after_number'] = isset($data['expire_after_number']) ? $data['expire_after_number'] : null;
        $this->container['approve_on_expire'] = isset($data['approve_on_expire']) ? $data['approve_on_expire'] : null;
        $this->container['xp'] = isset($data['xp']) ? $data['xp'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        return true;
    }


    /**
     * Gets id
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param string $id
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     * @param string $name
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets description
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     * @param string $description
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets approving_group_id
     * @return string
     */
    public function getApprovingGroupId()
    {
        return $this->container['approving_group_id'];
    }

    /**
     * Sets approving_group_id
     * @param string $approving_group_id
     * @return $this
     */
    public function setApprovingGroupId($approving_group_id)
    {
        $this->container['approving_group_id'] = $approving_group_id;

        return $this;
    }

    /**
     * Gets rule_expression
     * @return string
     */
    public function getRuleExpression()
    {
        return $this->container['rule_expression'];
    }

    /**
     * Sets rule_expression
     * @param string $rule_expression
     * @return $this
     */
    public function setRuleExpression($rule_expression)
    {
        $this->container['rule_expression'] = $rule_expression;

        return $this;
    }

    /**
     * Gets scope
     * @return string
     */
    public function getScope()
    {
        return $this->container['scope'];
    }

    /**
     * Sets scope
     * @param string $scope
     * @return $this
     */
    public function setScope($scope)
    {
        $this->container['scope'] = $scope;

        return $this;
    }

    /**
     * Gets scope_time_unit
     * @return string
     */
    public function getScopeTimeUnit()
    {
        return $this->container['scope_time_unit'];
    }

    /**
     * Sets scope_time_unit
     * @param string $scope_time_unit
     * @return $this
     */
    public function setScopeTimeUnit($scope_time_unit)
    {
        $this->container['scope_time_unit'] = $scope_time_unit;

        return $this;
    }

    /**
     * Gets scope_time_number
     * @return int
     */
    public function getScopeTimeNumber()
    {
        return $this->container['scope_time_number'];
    }

    /**
     * Sets scope_time_number
     * @param int $scope_time_number
     * @return $this
     */
    public function setScopeTimeNumber($scope_time_number)
    {
        $this->container['scope_time_number'] = $scope_time_number;

        return $this;
    }

    /**
     * Gets scope_start_date
     * @return \DateTime
     */
    public function getScopeStartDate()
    {
        return $this->container['scope_start_date'];
    }

    /**
     * Sets scope_start_date
     * @param \DateTime $scope_start_date
     * @return $this
     */
    public function setScopeStartDate($scope_start_date)
    {
        $this->container['scope_start_date'] = $scope_start_date;

        return $this;
    }

    /**
     * Gets expire_after_time_unit
     * @return string
     */
    public function getExpireAfterTimeUnit()
    {
        return $this->container['expire_after_time_unit'];
    }

    /**
     * Sets expire_after_time_unit
     * @param string $expire_after_time_unit
     * @return $this
     */
    public function setExpireAfterTimeUnit($expire_after_time_unit)
    {
        $this->container['expire_after_time_unit'] = $expire_after_time_unit;

        return $this;
    }

    /**
     * Gets expire_after_number
     * @return int
     */
    public function getExpireAfterNumber()
    {
        return $this->container['expire_after_number'];
    }

    /**
     * Sets expire_after_number
     * @param int $expire_after_number
     * @return $this
     */
    public function setExpireAfterNumber($expire_after_number)
    {
        $this->container['expire_after_number'] = $expire_after_number;

        return $this;
    }

    /**
     * Gets approve_on_expire
     * @return bool
     */
    public function getApproveOnExpire()
    {
        return $this->container['approve_on_expire'];
    }

    /**
     * Sets approve_on_expire
     * @param bool $approve_on_expire
     * @return $this
     */
    public function setApproveOnExpire($approve_on_expire)
    {
        $this->container['approve_on_expire'] = $approve_on_expire;

        return $this;
    }

    /**
     * Gets xp
     * @return object
     */
    public function getXp()
    {
        return $this->container['xp'];
    }

    /**
     * Sets xp
     * @param object $xp
     * @return $this
     */
    public function setXp($xp)
    {
        $this->container['xp'] = $xp;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}

