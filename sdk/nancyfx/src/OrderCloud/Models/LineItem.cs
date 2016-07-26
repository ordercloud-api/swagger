using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// LineItem
    /// </summary>
    public sealed class LineItem:  IEquatable<LineItem>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// ProductID
        /// </summary>
        public string ProductID { get; private set; }

        /// <summary>
        /// Quantity
        /// </summary>
        public int? Quantity { get; private set; }

        /// <summary>
        /// UnitPrice
        /// </summary>
        public decimal? UnitPrice { get; private set; }

        /// <summary>
        /// CostCenter
        /// </summary>
        public string CostCenter { get; private set; }

        /// <summary>
        /// DateNeeded
        /// </summary>
        public ZonedDateTime? DateNeeded { get; private set; }

        /// <summary>
        /// ShippingAccount
        /// </summary>
        public string ShippingAccount { get; private set; }

        /// <summary>
        /// ShippingAddressID
        /// </summary>
        public string ShippingAddressID { get; private set; }

        /// <summary>
        /// ShipfromAddressID
        /// </summary>
        public string ShipfromAddressID { get; private set; }

        /// <summary>
        /// ShipperID
        /// </summary>
        public string ShipperID { get; private set; }

        /// <summary>
        /// Specs
        /// </summary>
        public List<ShipmentItem> Specs { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use LineItem.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public LineItem()
        {
        }

        private LineItem(string ID, string ProductID, int? Quantity, decimal? UnitPrice, string CostCenter, ZonedDateTime? DateNeeded, string ShippingAccount, string ShippingAddressID, string ShipfromAddressID, string ShipperID, List<ShipmentItem> Specs, Object Xp)
        {
            
            this.ID = ID;
            
            this.ProductID = ProductID;
            
            this.Quantity = Quantity;
            
            this.UnitPrice = UnitPrice;
            
            this.CostCenter = CostCenter;
            
            this.DateNeeded = DateNeeded;
            
            this.ShippingAccount = ShippingAccount;
            
            this.ShippingAddressID = ShippingAddressID;
            
            this.ShipfromAddressID = ShipfromAddressID;
            
            this.ShipperID = ShipperID;
            
            this.Specs = Specs;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of LineItem.
        /// </summary>
        /// <returns>LineItemBuilder</returns>
        public static LineItemBuilder Builder()
        {
            return new LineItemBuilder();
        }

        /// <summary>
        /// Returns LineItemBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>LineItemBuilder</returns>
        public LineItemBuilder With()
        {
            return Builder()
                .ID(ID)
                .ProductID(ProductID)
                .Quantity(Quantity)
                .UnitPrice(UnitPrice)
                .CostCenter(CostCenter)
                .DateNeeded(DateNeeded)
                .ShippingAccount(ShippingAccount)
                .ShippingAddressID(ShippingAddressID)
                .ShipfromAddressID(ShipfromAddressID)
                .ShipperID(ShipperID)
                .Specs(Specs)
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

        public bool Equals(LineItem other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (LineItem.
        /// </summary>
        /// <param name="left">Compared (LineItem</param>
        /// <param name="right">Compared (LineItem</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (LineItem left, LineItem right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (LineItem.
        /// </summary>
        /// <param name="left">Compared (LineItem</param>
        /// <param name="right">Compared (LineItem</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (LineItem left, LineItem right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of LineItem.
        /// </summary>
        public sealed class LineItemBuilder
        {
            private string _ID;
            private string _ProductID;
            private int? _Quantity;
            private decimal? _UnitPrice;
            private string _CostCenter;
            private ZonedDateTime? _DateNeeded;
            private string _ShippingAccount;
            private string _ShippingAddressID;
            private string _ShipfromAddressID;
            private string _ShipperID;
            private List<ShipmentItem> _Specs;
            private Object _Xp;

            internal LineItemBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for LineItem.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public LineItemBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.ProductID property.
            /// </summary>
            /// <param name="value">ProductID</param>
            public LineItemBuilder ProductID(string value)
            {
                _ProductID = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.Quantity property.
            /// </summary>
            /// <param name="value">Quantity</param>
            public LineItemBuilder Quantity(int? value)
            {
                _Quantity = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.UnitPrice property.
            /// </summary>
            /// <param name="value">UnitPrice</param>
            public LineItemBuilder UnitPrice(decimal? value)
            {
                _UnitPrice = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.CostCenter property.
            /// </summary>
            /// <param name="value">CostCenter</param>
            public LineItemBuilder CostCenter(string value)
            {
                _CostCenter = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.DateNeeded property.
            /// </summary>
            /// <param name="value">DateNeeded</param>
            public LineItemBuilder DateNeeded(ZonedDateTime? value)
            {
                _DateNeeded = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.ShippingAccount property.
            /// </summary>
            /// <param name="value">ShippingAccount</param>
            public LineItemBuilder ShippingAccount(string value)
            {
                _ShippingAccount = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.ShippingAddressID property.
            /// </summary>
            /// <param name="value">ShippingAddressID</param>
            public LineItemBuilder ShippingAddressID(string value)
            {
                _ShippingAddressID = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.ShipfromAddressID property.
            /// </summary>
            /// <param name="value">ShipfromAddressID</param>
            public LineItemBuilder ShipfromAddressID(string value)
            {
                _ShipfromAddressID = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.ShipperID property.
            /// </summary>
            /// <param name="value">ShipperID</param>
            public LineItemBuilder ShipperID(string value)
            {
                _ShipperID = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.Specs property.
            /// </summary>
            /// <param name="value">Specs</param>
            public LineItemBuilder Specs(List<ShipmentItem> value)
            {
                _Specs = value;
                return this;
            }

            /// <summary>
            /// Sets value for LineItem.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public LineItemBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of LineItem.
            /// </summary>
            /// <returns>LineItem</returns>
            public LineItem Build()
            {
                Validate();
                return new LineItem(
                    ID: _ID,
                    ProductID: _ProductID,
                    Quantity: _Quantity,
                    UnitPrice: _UnitPrice,
                    CostCenter: _CostCenter,
                    DateNeeded: _DateNeeded,
                    ShippingAccount: _ShippingAccount,
                    ShippingAddressID: _ShippingAddressID,
                    ShipfromAddressID: _ShipfromAddressID,
                    ShipperID: _ShipperID,
                    Specs: _Specs,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
