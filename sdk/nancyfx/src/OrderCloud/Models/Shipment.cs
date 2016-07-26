using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Shipment
    /// </summary>
    public sealed class Shipment:  IEquatable<Shipment>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Shipper
        /// </summary>
        public string Shipper { get; private set; }

        /// <summary>
        /// DateShipped
        /// </summary>
        public ZonedDateTime? DateShipped { get; private set; }

        /// <summary>
        /// TrackingNumber
        /// </summary>
        public string TrackingNumber { get; private set; }

        /// <summary>
        /// Cost
        /// </summary>
        public decimal? Cost { get; private set; }

        /// <summary>
        /// Items
        /// </summary>
        public List<ShipmentItem> Items { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Shipment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Shipment()
        {
        }

        private Shipment(string ID, string Shipper, ZonedDateTime? DateShipped, string TrackingNumber, decimal? Cost, List<ShipmentItem> Items, Object Xp)
        {
            
            this.ID = ID;
            
            this.Shipper = Shipper;
            
            this.DateShipped = DateShipped;
            
            this.TrackingNumber = TrackingNumber;
            
            this.Cost = Cost;
            
            this.Items = Items;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Shipment.
        /// </summary>
        /// <returns>ShipmentBuilder</returns>
        public static ShipmentBuilder Builder()
        {
            return new ShipmentBuilder();
        }

        /// <summary>
        /// Returns ShipmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ShipmentBuilder</returns>
        public ShipmentBuilder With()
        {
            return Builder()
                .ID(ID)
                .Shipper(Shipper)
                .DateShipped(DateShipped)
                .TrackingNumber(TrackingNumber)
                .Cost(Cost)
                .Items(Items)
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

        public bool Equals(Shipment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Shipment.
        /// </summary>
        /// <param name="left">Compared (Shipment</param>
        /// <param name="right">Compared (Shipment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Shipment left, Shipment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Shipment.
        /// </summary>
        /// <param name="left">Compared (Shipment</param>
        /// <param name="right">Compared (Shipment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Shipment left, Shipment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Shipment.
        /// </summary>
        public sealed class ShipmentBuilder
        {
            private string _ID;
            private string _Shipper;
            private ZonedDateTime? _DateShipped;
            private string _TrackingNumber;
            private decimal? _Cost;
            private List<ShipmentItem> _Items;
            private Object _Xp;

            internal ShipmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Shipment.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public ShipmentBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.Shipper property.
            /// </summary>
            /// <param name="value">Shipper</param>
            public ShipmentBuilder Shipper(string value)
            {
                _Shipper = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.DateShipped property.
            /// </summary>
            /// <param name="value">DateShipped</param>
            public ShipmentBuilder DateShipped(ZonedDateTime? value)
            {
                _DateShipped = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.TrackingNumber property.
            /// </summary>
            /// <param name="value">TrackingNumber</param>
            public ShipmentBuilder TrackingNumber(string value)
            {
                _TrackingNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.Cost property.
            /// </summary>
            /// <param name="value">Cost</param>
            public ShipmentBuilder Cost(decimal? value)
            {
                _Cost = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.Items property.
            /// </summary>
            /// <param name="value">Items</param>
            public ShipmentBuilder Items(List<ShipmentItem> value)
            {
                _Items = value;
                return this;
            }

            /// <summary>
            /// Sets value for Shipment.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public ShipmentBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Shipment.
            /// </summary>
            /// <returns>Shipment</returns>
            public Shipment Build()
            {
                Validate();
                return new Shipment(
                    ID: _ID,
                    Shipper: _Shipper,
                    DateShipped: _DateShipped,
                    TrackingNumber: _TrackingNumber,
                    Cost: _Cost,
                    Items: _Items,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
