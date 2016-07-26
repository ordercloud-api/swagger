using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PriceBreak
    /// </summary>
    public sealed class PriceBreak:  IEquatable<PriceBreak>
    { 
        /// <summary>
        /// Quantity
        /// </summary>
        public int? Quantity { get; private set; }

        /// <summary>
        /// Price
        /// </summary>
        public decimal? Price { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PriceBreak.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PriceBreak()
        {
        }

        private PriceBreak(int? Quantity, decimal? Price)
        {
            
            this.Quantity = Quantity;
            
            this.Price = Price;
            
        }

        /// <summary>
        /// Returns builder of PriceBreak.
        /// </summary>
        /// <returns>PriceBreakBuilder</returns>
        public static PriceBreakBuilder Builder()
        {
            return new PriceBreakBuilder();
        }

        /// <summary>
        /// Returns PriceBreakBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PriceBreakBuilder</returns>
        public PriceBreakBuilder With()
        {
            return Builder()
                .Quantity(Quantity)
                .Price(Price);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PriceBreak other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PriceBreak.
        /// </summary>
        /// <param name="left">Compared (PriceBreak</param>
        /// <param name="right">Compared (PriceBreak</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PriceBreak left, PriceBreak right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PriceBreak.
        /// </summary>
        /// <param name="left">Compared (PriceBreak</param>
        /// <param name="right">Compared (PriceBreak</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PriceBreak left, PriceBreak right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PriceBreak.
        /// </summary>
        public sealed class PriceBreakBuilder
        {
            private int? _Quantity;
            private decimal? _Price;

            internal PriceBreakBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PriceBreak.Quantity property.
            /// </summary>
            /// <param name="value">Quantity</param>
            public PriceBreakBuilder Quantity(int? value)
            {
                _Quantity = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceBreak.Price property.
            /// </summary>
            /// <param name="value">Price</param>
            public PriceBreakBuilder Price(decimal? value)
            {
                _Price = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PriceBreak.
            /// </summary>
            /// <returns>PriceBreak</returns>
            public PriceBreak Build()
            {
                Validate();
                return new PriceBreak(
                    Quantity: _Quantity,
                    Price: _Price
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
