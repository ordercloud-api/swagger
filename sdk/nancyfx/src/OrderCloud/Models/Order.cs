using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Order
    /// </summary>
    public sealed class Order:  IEquatable<Order>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// FromUserID
        /// </summary>
        public string FromUserID { get; private set; }

        /// <summary>
        /// BillingAddressID
        /// </summary>
        public string BillingAddressID { get; private set; }

        /// <summary>
        /// ShippingAddressID
        /// </summary>
        public string ShippingAddressID { get; private set; }

        /// <summary>
        /// Comments
        /// </summary>
        public string Comments { get; private set; }

        /// <summary>
        /// ShippingCost
        /// </summary>
        public decimal? ShippingCost { get; private set; }

        /// <summary>
        /// TaxCost
        /// </summary>
        public decimal? TaxCost { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Order.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Order()
        {
        }

        private Order(string ID, string Type, string FromUserID, string BillingAddressID, string ShippingAddressID, string Comments, decimal? ShippingCost, decimal? TaxCost, Object Xp)
        {
            
            this.ID = ID;
            
            this.Type = Type;
            
            this.FromUserID = FromUserID;
            
            this.BillingAddressID = BillingAddressID;
            
            this.ShippingAddressID = ShippingAddressID;
            
            this.Comments = Comments;
            
            this.ShippingCost = ShippingCost;
            
            this.TaxCost = TaxCost;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Order.
        /// </summary>
        /// <returns>OrderBuilder</returns>
        public static OrderBuilder Builder()
        {
            return new OrderBuilder();
        }

        /// <summary>
        /// Returns OrderBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrderBuilder</returns>
        public OrderBuilder With()
        {
            return Builder()
                .ID(ID)
                .Type(Type)
                .FromUserID(FromUserID)
                .BillingAddressID(BillingAddressID)
                .ShippingAddressID(ShippingAddressID)
                .Comments(Comments)
                .ShippingCost(ShippingCost)
                .TaxCost(TaxCost)
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

        public bool Equals(Order other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Order.
        /// </summary>
        /// <param name="left">Compared (Order</param>
        /// <param name="right">Compared (Order</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Order left, Order right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Order.
        /// </summary>
        /// <param name="left">Compared (Order</param>
        /// <param name="right">Compared (Order</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Order left, Order right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Order.
        /// </summary>
        public sealed class OrderBuilder
        {
            private string _ID;
            private string _Type;
            private string _FromUserID;
            private string _BillingAddressID;
            private string _ShippingAddressID;
            private string _Comments;
            private decimal? _ShippingCost;
            private decimal? _TaxCost;
            private Object _Xp;

            internal OrderBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Order.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public OrderBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrderBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.FromUserID property.
            /// </summary>
            /// <param name="value">FromUserID</param>
            public OrderBuilder FromUserID(string value)
            {
                _FromUserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.BillingAddressID property.
            /// </summary>
            /// <param name="value">BillingAddressID</param>
            public OrderBuilder BillingAddressID(string value)
            {
                _BillingAddressID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.ShippingAddressID property.
            /// </summary>
            /// <param name="value">ShippingAddressID</param>
            public OrderBuilder ShippingAddressID(string value)
            {
                _ShippingAddressID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.Comments property.
            /// </summary>
            /// <param name="value">Comments</param>
            public OrderBuilder Comments(string value)
            {
                _Comments = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.ShippingCost property.
            /// </summary>
            /// <param name="value">ShippingCost</param>
            public OrderBuilder ShippingCost(decimal? value)
            {
                _ShippingCost = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.TaxCost property.
            /// </summary>
            /// <param name="value">TaxCost</param>
            public OrderBuilder TaxCost(decimal? value)
            {
                _TaxCost = value;
                return this;
            }

            /// <summary>
            /// Sets value for Order.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public OrderBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Order.
            /// </summary>
            /// <returns>Order</returns>
            public Order Build()
            {
                Validate();
                return new Order(
                    ID: _ID,
                    Type: _Type,
                    FromUserID: _FromUserID,
                    BillingAddressID: _BillingAddressID,
                    ShippingAddressID: _ShippingAddressID,
                    Comments: _Comments,
                    ShippingCost: _ShippingCost,
                    TaxCost: _TaxCost,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
