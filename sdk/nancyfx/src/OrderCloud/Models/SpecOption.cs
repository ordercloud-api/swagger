using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// SpecOption
    /// </summary>
    public sealed class SpecOption:  IEquatable<SpecOption>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Value
        /// </summary>
        public string Value { get; private set; }

        /// <summary>
        /// ListOrder
        /// </summary>
        public int? ListOrder { get; private set; }

        /// <summary>
        /// IsOpenText
        /// </summary>
        public bool? IsOpenText { get; private set; }

        /// <summary>
        /// PriceMarkupType
        /// </summary>
        public string PriceMarkupType { get; private set; }

        /// <summary>
        /// PriceMarkup
        /// </summary>
        public decimal? PriceMarkup { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SpecOption.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SpecOption()
        {
        }

        private SpecOption(string ID, string Value, int? ListOrder, bool? IsOpenText, string PriceMarkupType, decimal? PriceMarkup, Object Xp)
        {
            
            this.ID = ID;
            
            this.Value = Value;
            
            this.ListOrder = ListOrder;
            
            this.IsOpenText = IsOpenText;
            
            this.PriceMarkupType = PriceMarkupType;
            
            this.PriceMarkup = PriceMarkup;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of SpecOption.
        /// </summary>
        /// <returns>SpecOptionBuilder</returns>
        public static SpecOptionBuilder Builder()
        {
            return new SpecOptionBuilder();
        }

        /// <summary>
        /// Returns SpecOptionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SpecOptionBuilder</returns>
        public SpecOptionBuilder With()
        {
            return Builder()
                .ID(ID)
                .Value(Value)
                .ListOrder(ListOrder)
                .IsOpenText(IsOpenText)
                .PriceMarkupType(PriceMarkupType)
                .PriceMarkup(PriceMarkup)
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

        public bool Equals(SpecOption other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SpecOption.
        /// </summary>
        /// <param name="left">Compared (SpecOption</param>
        /// <param name="right">Compared (SpecOption</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SpecOption left, SpecOption right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SpecOption.
        /// </summary>
        /// <param name="left">Compared (SpecOption</param>
        /// <param name="right">Compared (SpecOption</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SpecOption left, SpecOption right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SpecOption.
        /// </summary>
        public sealed class SpecOptionBuilder
        {
            private string _ID;
            private string _Value;
            private int? _ListOrder;
            private bool? _IsOpenText;
            private string _PriceMarkupType;
            private decimal? _PriceMarkup;
            private Object _Xp;

            internal SpecOptionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SpecOption.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public SpecOptionBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.Value property.
            /// </summary>
            /// <param name="value">Value</param>
            public SpecOptionBuilder Value(string value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.ListOrder property.
            /// </summary>
            /// <param name="value">ListOrder</param>
            public SpecOptionBuilder ListOrder(int? value)
            {
                _ListOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.IsOpenText property.
            /// </summary>
            /// <param name="value">IsOpenText</param>
            public SpecOptionBuilder IsOpenText(bool? value)
            {
                _IsOpenText = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.PriceMarkupType property.
            /// </summary>
            /// <param name="value">PriceMarkupType</param>
            public SpecOptionBuilder PriceMarkupType(string value)
            {
                _PriceMarkupType = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.PriceMarkup property.
            /// </summary>
            /// <param name="value">PriceMarkup</param>
            public SpecOptionBuilder PriceMarkup(decimal? value)
            {
                _PriceMarkup = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecOption.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public SpecOptionBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SpecOption.
            /// </summary>
            /// <returns>SpecOption</returns>
            public SpecOption Build()
            {
                Validate();
                return new SpecOption(
                    ID: _ID,
                    Value: _Value,
                    ListOrder: _ListOrder,
                    IsOpenText: _IsOpenText,
                    PriceMarkupType: _PriceMarkupType,
                    PriceMarkup: _PriceMarkup,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
