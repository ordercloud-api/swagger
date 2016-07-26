using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Promotion
    /// </summary>
    public sealed class Promotion:  IEquatable<Promotion>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Code
        /// </summary>
        public string Code { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// UsagesRemaining
        /// </summary>
        public int? UsagesRemaining { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// FinePrint
        /// </summary>
        public string FinePrint { get; private set; }

        /// <summary>
        /// StartDate
        /// </summary>
        public ZonedDateTime? StartDate { get; private set; }

        /// <summary>
        /// ExpirationDate
        /// </summary>
        public ZonedDateTime? ExpirationDate { get; private set; }

        /// <summary>
        /// EligibleExpression
        /// </summary>
        public string EligibleExpression { get; private set; }

        /// <summary>
        /// ValueExpression
        /// </summary>
        public string ValueExpression { get; private set; }

        /// <summary>
        /// CanCombine
        /// </summary>
        public bool? CanCombine { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Promotion.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Promotion()
        {
        }

        private Promotion(string ID, string Code, string Name, int? UsagesRemaining, string Description, string FinePrint, ZonedDateTime? StartDate, ZonedDateTime? ExpirationDate, string EligibleExpression, string ValueExpression, bool? CanCombine, Object Xp)
        {
            
            this.ID = ID;
            
            this.Code = Code;
            
            this.Name = Name;
            
            this.UsagesRemaining = UsagesRemaining;
            
            this.Description = Description;
            
            this.FinePrint = FinePrint;
            
            this.StartDate = StartDate;
            
            this.ExpirationDate = ExpirationDate;
            
            this.EligibleExpression = EligibleExpression;
            
            this.ValueExpression = ValueExpression;
            
            this.CanCombine = CanCombine;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Promotion.
        /// </summary>
        /// <returns>PromotionBuilder</returns>
        public static PromotionBuilder Builder()
        {
            return new PromotionBuilder();
        }

        /// <summary>
        /// Returns PromotionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PromotionBuilder</returns>
        public PromotionBuilder With()
        {
            return Builder()
                .ID(ID)
                .Code(Code)
                .Name(Name)
                .UsagesRemaining(UsagesRemaining)
                .Description(Description)
                .FinePrint(FinePrint)
                .StartDate(StartDate)
                .ExpirationDate(ExpirationDate)
                .EligibleExpression(EligibleExpression)
                .ValueExpression(ValueExpression)
                .CanCombine(CanCombine)
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

        public bool Equals(Promotion other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Promotion.
        /// </summary>
        /// <param name="left">Compared (Promotion</param>
        /// <param name="right">Compared (Promotion</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Promotion left, Promotion right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Promotion.
        /// </summary>
        /// <param name="left">Compared (Promotion</param>
        /// <param name="right">Compared (Promotion</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Promotion left, Promotion right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Promotion.
        /// </summary>
        public sealed class PromotionBuilder
        {
            private string _ID;
            private string _Code;
            private string _Name;
            private int? _UsagesRemaining;
            private string _Description;
            private string _FinePrint;
            private ZonedDateTime? _StartDate;
            private ZonedDateTime? _ExpirationDate;
            private string _EligibleExpression;
            private string _ValueExpression;
            private bool? _CanCombine;
            private Object _Xp;

            internal PromotionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Promotion.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public PromotionBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public PromotionBuilder Code(string value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public PromotionBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.UsagesRemaining property.
            /// </summary>
            /// <param name="value">UsagesRemaining</param>
            public PromotionBuilder UsagesRemaining(int? value)
            {
                _UsagesRemaining = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public PromotionBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.FinePrint property.
            /// </summary>
            /// <param name="value">FinePrint</param>
            public PromotionBuilder FinePrint(string value)
            {
                _FinePrint = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.StartDate property.
            /// </summary>
            /// <param name="value">StartDate</param>
            public PromotionBuilder StartDate(ZonedDateTime? value)
            {
                _StartDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.ExpirationDate property.
            /// </summary>
            /// <param name="value">ExpirationDate</param>
            public PromotionBuilder ExpirationDate(ZonedDateTime? value)
            {
                _ExpirationDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.EligibleExpression property.
            /// </summary>
            /// <param name="value">EligibleExpression</param>
            public PromotionBuilder EligibleExpression(string value)
            {
                _EligibleExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.ValueExpression property.
            /// </summary>
            /// <param name="value">ValueExpression</param>
            public PromotionBuilder ValueExpression(string value)
            {
                _ValueExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.CanCombine property.
            /// </summary>
            /// <param name="value">CanCombine</param>
            public PromotionBuilder CanCombine(bool? value)
            {
                _CanCombine = value;
                return this;
            }

            /// <summary>
            /// Sets value for Promotion.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public PromotionBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Promotion.
            /// </summary>
            /// <returns>Promotion</returns>
            public Promotion Build()
            {
                Validate();
                return new Promotion(
                    ID: _ID,
                    Code: _Code,
                    Name: _Name,
                    UsagesRemaining: _UsagesRemaining,
                    Description: _Description,
                    FinePrint: _FinePrint,
                    StartDate: _StartDate,
                    ExpirationDate: _ExpirationDate,
                    EligibleExpression: _EligibleExpression,
                    ValueExpression: _ValueExpression,
                    CanCombine: _CanCombine,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
