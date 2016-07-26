using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PriceSchedule
    /// </summary>
    public sealed class PriceSchedule:  IEquatable<PriceSchedule>
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
        /// ApplyTax
        /// </summary>
        public bool? ApplyTax { get; private set; }

        /// <summary>
        /// ApplyShipping
        /// </summary>
        public bool? ApplyShipping { get; private set; }

        /// <summary>
        /// MaxQuantity
        /// </summary>
        public int? MaxQuantity { get; private set; }

        /// <summary>
        /// UseCumulativeQuantity
        /// </summary>
        public bool? UseCumulativeQuantity { get; private set; }

        /// <summary>
        /// RestrictedQuantity
        /// </summary>
        public bool? RestrictedQuantity { get; private set; }

        /// <summary>
        /// OrderType
        /// </summary>
        public string OrderType { get; private set; }

        /// <summary>
        /// PriceBreaks
        /// </summary>
        public List<ShipmentItem> PriceBreaks { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PriceSchedule.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PriceSchedule()
        {
        }

        private PriceSchedule(string ID, string Name, bool? ApplyTax, bool? ApplyShipping, int? MaxQuantity, bool? UseCumulativeQuantity, bool? RestrictedQuantity, string OrderType, List<ShipmentItem> PriceBreaks, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.ApplyTax = ApplyTax;
            
            this.ApplyShipping = ApplyShipping;
            
            this.MaxQuantity = MaxQuantity;
            
            this.UseCumulativeQuantity = UseCumulativeQuantity;
            
            this.RestrictedQuantity = RestrictedQuantity;
            
            this.OrderType = OrderType;
            
            this.PriceBreaks = PriceBreaks;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of PriceSchedule.
        /// </summary>
        /// <returns>PriceScheduleBuilder</returns>
        public static PriceScheduleBuilder Builder()
        {
            return new PriceScheduleBuilder();
        }

        /// <summary>
        /// Returns PriceScheduleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PriceScheduleBuilder</returns>
        public PriceScheduleBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .ApplyTax(ApplyTax)
                .ApplyShipping(ApplyShipping)
                .MaxQuantity(MaxQuantity)
                .UseCumulativeQuantity(UseCumulativeQuantity)
                .RestrictedQuantity(RestrictedQuantity)
                .OrderType(OrderType)
                .PriceBreaks(PriceBreaks)
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

        public bool Equals(PriceSchedule other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PriceSchedule.
        /// </summary>
        /// <param name="left">Compared (PriceSchedule</param>
        /// <param name="right">Compared (PriceSchedule</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PriceSchedule left, PriceSchedule right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PriceSchedule.
        /// </summary>
        /// <param name="left">Compared (PriceSchedule</param>
        /// <param name="right">Compared (PriceSchedule</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PriceSchedule left, PriceSchedule right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PriceSchedule.
        /// </summary>
        public sealed class PriceScheduleBuilder
        {
            private string _ID;
            private string _Name;
            private bool? _ApplyTax;
            private bool? _ApplyShipping;
            private int? _MaxQuantity;
            private bool? _UseCumulativeQuantity;
            private bool? _RestrictedQuantity;
            private string _OrderType;
            private List<ShipmentItem> _PriceBreaks;
            private Object _Xp;

            internal PriceScheduleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PriceSchedule.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public PriceScheduleBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public PriceScheduleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.ApplyTax property.
            /// </summary>
            /// <param name="value">ApplyTax</param>
            public PriceScheduleBuilder ApplyTax(bool? value)
            {
                _ApplyTax = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.ApplyShipping property.
            /// </summary>
            /// <param name="value">ApplyShipping</param>
            public PriceScheduleBuilder ApplyShipping(bool? value)
            {
                _ApplyShipping = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.MaxQuantity property.
            /// </summary>
            /// <param name="value">MaxQuantity</param>
            public PriceScheduleBuilder MaxQuantity(int? value)
            {
                _MaxQuantity = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.UseCumulativeQuantity property.
            /// </summary>
            /// <param name="value">UseCumulativeQuantity</param>
            public PriceScheduleBuilder UseCumulativeQuantity(bool? value)
            {
                _UseCumulativeQuantity = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.RestrictedQuantity property.
            /// </summary>
            /// <param name="value">RestrictedQuantity</param>
            public PriceScheduleBuilder RestrictedQuantity(bool? value)
            {
                _RestrictedQuantity = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.OrderType property.
            /// </summary>
            /// <param name="value">OrderType</param>
            public PriceScheduleBuilder OrderType(string value)
            {
                _OrderType = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.PriceBreaks property.
            /// </summary>
            /// <param name="value">PriceBreaks</param>
            public PriceScheduleBuilder PriceBreaks(List<ShipmentItem> value)
            {
                _PriceBreaks = value;
                return this;
            }

            /// <summary>
            /// Sets value for PriceSchedule.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public PriceScheduleBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PriceSchedule.
            /// </summary>
            /// <returns>PriceSchedule</returns>
            public PriceSchedule Build()
            {
                Validate();
                return new PriceSchedule(
                    ID: _ID,
                    Name: _Name,
                    ApplyTax: _ApplyTax,
                    ApplyShipping: _ApplyShipping,
                    MaxQuantity: _MaxQuantity,
                    UseCumulativeQuantity: _UseCumulativeQuantity,
                    RestrictedQuantity: _RestrictedQuantity,
                    OrderType: _OrderType,
                    PriceBreaks: _PriceBreaks,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
