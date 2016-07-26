using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// ShipmentItem
    /// </summary>
    public sealed class ShipmentItem:  IEquatable<ShipmentItem>
    { 
        /// <summary>
        /// OrderID
        /// </summary>
        public string OrderID { get; private set; }

        /// <summary>
        /// LineItemID
        /// </summary>
        public string LineItemID { get; private set; }

        /// <summary>
        /// QuantityShipped
        /// </summary>
        public int? QuantityShipped { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ShipmentItem.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ShipmentItem()
        {
        }

        private ShipmentItem(string OrderID, string LineItemID, int? QuantityShipped)
        {
            
            this.OrderID = OrderID;
            
            this.LineItemID = LineItemID;
            
            this.QuantityShipped = QuantityShipped;
            
        }

        /// <summary>
        /// Returns builder of ShipmentItem.
        /// </summary>
        /// <returns>ShipmentItemBuilder</returns>
        public static ShipmentItemBuilder Builder()
        {
            return new ShipmentItemBuilder();
        }

        /// <summary>
        /// Returns ShipmentItemBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ShipmentItemBuilder</returns>
        public ShipmentItemBuilder With()
        {
            return Builder()
                .OrderID(OrderID)
                .LineItemID(LineItemID)
                .QuantityShipped(QuantityShipped);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ShipmentItem other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ShipmentItem.
        /// </summary>
        /// <param name="left">Compared (ShipmentItem</param>
        /// <param name="right">Compared (ShipmentItem</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ShipmentItem left, ShipmentItem right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ShipmentItem.
        /// </summary>
        /// <param name="left">Compared (ShipmentItem</param>
        /// <param name="right">Compared (ShipmentItem</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ShipmentItem left, ShipmentItem right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ShipmentItem.
        /// </summary>
        public sealed class ShipmentItemBuilder
        {
            private string _OrderID;
            private string _LineItemID;
            private int? _QuantityShipped;

            internal ShipmentItemBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ShipmentItem.OrderID property.
            /// </summary>
            /// <param name="value">OrderID</param>
            public ShipmentItemBuilder OrderID(string value)
            {
                _OrderID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ShipmentItem.LineItemID property.
            /// </summary>
            /// <param name="value">LineItemID</param>
            public ShipmentItemBuilder LineItemID(string value)
            {
                _LineItemID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ShipmentItem.QuantityShipped property.
            /// </summary>
            /// <param name="value">QuantityShipped</param>
            public ShipmentItemBuilder QuantityShipped(int? value)
            {
                _QuantityShipped = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ShipmentItem.
            /// </summary>
            /// <returns>ShipmentItem</returns>
            public ShipmentItem Build()
            {
                Validate();
                return new ShipmentItem(
                    OrderID: _OrderID,
                    LineItemID: _LineItemID,
                    QuantityShipped: _QuantityShipped
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
