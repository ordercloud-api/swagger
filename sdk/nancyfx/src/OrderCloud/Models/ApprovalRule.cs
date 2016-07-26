using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// ApprovalRule
    /// </summary>
    public sealed class ApprovalRule:  IEquatable<ApprovalRule>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// ApprovingGroupID
        /// </summary>
        public string ApprovingGroupID { get; private set; }

        /// <summary>
        /// RuleExpression
        /// </summary>
        public string RuleExpression { get; private set; }

        /// <summary>
        /// Scope
        /// </summary>
        public string Scope { get; private set; }

        /// <summary>
        /// ScopeTimeUnit
        /// </summary>
        public string ScopeTimeUnit { get; private set; }

        /// <summary>
        /// ScopeTimeNumber
        /// </summary>
        public int? ScopeTimeNumber { get; private set; }

        /// <summary>
        /// ScopeStartDate
        /// </summary>
        public ZonedDateTime? ScopeStartDate { get; private set; }

        /// <summary>
        /// ExpireAfterTimeUnit
        /// </summary>
        public string ExpireAfterTimeUnit { get; private set; }

        /// <summary>
        /// ExpireAfterNumber
        /// </summary>
        public int? ExpireAfterNumber { get; private set; }

        /// <summary>
        /// ApproveOnExpire
        /// </summary>
        public bool? ApproveOnExpire { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ApprovalRule.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ApprovalRule()
        {
        }

        private ApprovalRule(string ID, string Name, string Description, string ApprovingGroupID, string RuleExpression, string Scope, string ScopeTimeUnit, int? ScopeTimeNumber, ZonedDateTime? ScopeStartDate, string ExpireAfterTimeUnit, int? ExpireAfterNumber, bool? ApproveOnExpire, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.ApprovingGroupID = ApprovingGroupID;
            
            this.RuleExpression = RuleExpression;
            
            this.Scope = Scope;
            
            this.ScopeTimeUnit = ScopeTimeUnit;
            
            this.ScopeTimeNumber = ScopeTimeNumber;
            
            this.ScopeStartDate = ScopeStartDate;
            
            this.ExpireAfterTimeUnit = ExpireAfterTimeUnit;
            
            this.ExpireAfterNumber = ExpireAfterNumber;
            
            this.ApproveOnExpire = ApproveOnExpire;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of ApprovalRule.
        /// </summary>
        /// <returns>ApprovalRuleBuilder</returns>
        public static ApprovalRuleBuilder Builder()
        {
            return new ApprovalRuleBuilder();
        }

        /// <summary>
        /// Returns ApprovalRuleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ApprovalRuleBuilder</returns>
        public ApprovalRuleBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Description(Description)
                .ApprovingGroupID(ApprovingGroupID)
                .RuleExpression(RuleExpression)
                .Scope(Scope)
                .ScopeTimeUnit(ScopeTimeUnit)
                .ScopeTimeNumber(ScopeTimeNumber)
                .ScopeStartDate(ScopeStartDate)
                .ExpireAfterTimeUnit(ExpireAfterTimeUnit)
                .ExpireAfterNumber(ExpireAfterNumber)
                .ApproveOnExpire(ApproveOnExpire)
                .Xp(Xp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ApprovalRule other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ApprovalRule.
        /// </summary>
        /// <param name="left">Compared (ApprovalRule</param>
        /// <param name="right">Compared (ApprovalRule</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ApprovalRule left, ApprovalRule right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ApprovalRule.
        /// </summary>
        /// <param name="left">Compared (ApprovalRule</param>
        /// <param name="right">Compared (ApprovalRule</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ApprovalRule left, ApprovalRule right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ApprovalRule.
        /// </summary>
        public sealed class ApprovalRuleBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private string _ApprovingGroupID;
            private string _RuleExpression;
            private string _Scope;
            private string _ScopeTimeUnit;
            private int? _ScopeTimeNumber;
            private ZonedDateTime? _ScopeStartDate;
            private string _ExpireAfterTimeUnit;
            private int? _ExpireAfterNumber;
            private bool? _ApproveOnExpire;
            private Object _Xp;

            internal ApprovalRuleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ApprovalRule.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public ApprovalRuleBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ApprovalRuleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ApprovalRuleBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ApprovingGroupID property.
            /// </summary>
            /// <param name="value">ApprovingGroupID</param>
            public ApprovalRuleBuilder ApprovingGroupID(string value)
            {
                _ApprovingGroupID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.RuleExpression property.
            /// </summary>
            /// <param name="value">RuleExpression</param>
            public ApprovalRuleBuilder RuleExpression(string value)
            {
                _RuleExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.Scope property.
            /// </summary>
            /// <param name="value">Scope</param>
            public ApprovalRuleBuilder Scope(string value)
            {
                _Scope = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ScopeTimeUnit property.
            /// </summary>
            /// <param name="value">ScopeTimeUnit</param>
            public ApprovalRuleBuilder ScopeTimeUnit(string value)
            {
                _ScopeTimeUnit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ScopeTimeNumber property.
            /// </summary>
            /// <param name="value">ScopeTimeNumber</param>
            public ApprovalRuleBuilder ScopeTimeNumber(int? value)
            {
                _ScopeTimeNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ScopeStartDate property.
            /// </summary>
            /// <param name="value">ScopeStartDate</param>
            public ApprovalRuleBuilder ScopeStartDate(ZonedDateTime? value)
            {
                _ScopeStartDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ExpireAfterTimeUnit property.
            /// </summary>
            /// <param name="value">ExpireAfterTimeUnit</param>
            public ApprovalRuleBuilder ExpireAfterTimeUnit(string value)
            {
                _ExpireAfterTimeUnit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ExpireAfterNumber property.
            /// </summary>
            /// <param name="value">ExpireAfterNumber</param>
            public ApprovalRuleBuilder ExpireAfterNumber(int? value)
            {
                _ExpireAfterNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.ApproveOnExpire property.
            /// </summary>
            /// <param name="value">ApproveOnExpire</param>
            public ApprovalRuleBuilder ApproveOnExpire(bool? value)
            {
                _ApproveOnExpire = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApprovalRule.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public ApprovalRuleBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ApprovalRule.
            /// </summary>
            /// <returns>ApprovalRule</returns>
            public ApprovalRule Build()
            {
                Validate();
                return new ApprovalRule(
                    ID: _ID,
                    Name: _Name,
                    Description: _Description,
                    ApprovingGroupID: _ApprovingGroupID,
                    RuleExpression: _RuleExpression,
                    Scope: _Scope,
                    ScopeTimeUnit: _ScopeTimeUnit,
                    ScopeTimeNumber: _ScopeTimeNumber,
                    ScopeStartDate: _ScopeStartDate,
                    ExpireAfterTimeUnit: _ExpireAfterTimeUnit,
                    ExpireAfterNumber: _ExpireAfterNumber,
                    ApproveOnExpire: _ApproveOnExpire,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
