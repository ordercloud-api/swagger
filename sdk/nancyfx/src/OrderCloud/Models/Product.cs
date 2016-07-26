using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Product
    /// </summary>
    public sealed class Product:  IEquatable<Product>
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
        /// QuantityMultiplier
        /// </summary>
        public int? QuantityMultiplier { get; private set; }

        /// <summary>
        /// ShipWeight
        /// </summary>
        public decimal? ShipWeight { get; private set; }

        /// <summary>
        /// Active
        /// </summary>
        public bool? Active { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// InventoryEnabled
        /// </summary>
        public bool? InventoryEnabled { get; private set; }

        /// <summary>
        /// InventoryNotificationPoint
        /// </summary>
        public int? InventoryNotificationPoint { get; private set; }

        /// <summary>
        /// VariantLevelInventory
        /// </summary>
        public bool? VariantLevelInventory { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }

        /// <summary>
        /// AllowOrderExceedInventory
        /// </summary>
        public bool? AllowOrderExceedInventory { get; private set; }

        /// <summary>
        /// InventoryVisible
        /// </summary>
        public bool? InventoryVisible { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Product.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Product()
        {
        }

        private Product(string ID, string Name, string Description, int? QuantityMultiplier, decimal? ShipWeight, bool? Active, string Type, bool? InventoryEnabled, int? InventoryNotificationPoint, bool? VariantLevelInventory, Object Xp, bool? AllowOrderExceedInventory, bool? InventoryVisible)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.QuantityMultiplier = QuantityMultiplier;
            
            this.ShipWeight = ShipWeight;
            
            this.Active = Active;
            
            this.Type = Type;
            
            this.InventoryEnabled = InventoryEnabled;
            
            this.InventoryNotificationPoint = InventoryNotificationPoint;
            
            this.VariantLevelInventory = VariantLevelInventory;
            
            this.Xp = Xp;
            
            this.AllowOrderExceedInventory = AllowOrderExceedInventory;
            
            this.InventoryVisible = InventoryVisible;
            
        }

        /// <summary>
        /// Returns builder of Product.
        /// </summary>
        /// <returns>ProductBuilder</returns>
        public static ProductBuilder Builder()
        {
            return new ProductBuilder();
        }

        /// <summary>
        /// Returns ProductBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProductBuilder</returns>
        public ProductBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Description(Description)
                .QuantityMultiplier(QuantityMultiplier)
                .ShipWeight(ShipWeight)
                .Active(Active)
                .Type(Type)
                .InventoryEnabled(InventoryEnabled)
                .InventoryNotificationPoint(InventoryNotificationPoint)
                .VariantLevelInventory(VariantLevelInventory)
                .Xp(Xp)
                .AllowOrderExceedInventory(AllowOrderExceedInventory)
                .InventoryVisible(InventoryVisible);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Product other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Product.
        /// </summary>
        /// <param name="left">Compared (Product</param>
        /// <param name="right">Compared (Product</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Product left, Product right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Product.
        /// </summary>
        /// <param name="left">Compared (Product</param>
        /// <param name="right">Compared (Product</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Product left, Product right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Product.
        /// </summary>
        public sealed class ProductBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private int? _QuantityMultiplier;
            private decimal? _ShipWeight;
            private bool? _Active;
            private string _Type;
            private bool? _InventoryEnabled;
            private int? _InventoryNotificationPoint;
            private bool? _VariantLevelInventory;
            private Object _Xp;
            private bool? _AllowOrderExceedInventory;
            private bool? _InventoryVisible;

            internal ProductBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Product.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public ProductBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ProductBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ProductBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.QuantityMultiplier property.
            /// </summary>
            /// <param name="value">QuantityMultiplier</param>
            public ProductBuilder QuantityMultiplier(int? value)
            {
                _QuantityMultiplier = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.ShipWeight property.
            /// </summary>
            /// <param name="value">ShipWeight</param>
            public ProductBuilder ShipWeight(decimal? value)
            {
                _ShipWeight = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public ProductBuilder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public ProductBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.InventoryEnabled property.
            /// </summary>
            /// <param name="value">InventoryEnabled</param>
            public ProductBuilder InventoryEnabled(bool? value)
            {
                _InventoryEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.InventoryNotificationPoint property.
            /// </summary>
            /// <param name="value">InventoryNotificationPoint</param>
            public ProductBuilder InventoryNotificationPoint(int? value)
            {
                _InventoryNotificationPoint = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.VariantLevelInventory property.
            /// </summary>
            /// <param name="value">VariantLevelInventory</param>
            public ProductBuilder VariantLevelInventory(bool? value)
            {
                _VariantLevelInventory = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public ProductBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.AllowOrderExceedInventory property.
            /// </summary>
            /// <param name="value">AllowOrderExceedInventory</param>
            public ProductBuilder AllowOrderExceedInventory(bool? value)
            {
                _AllowOrderExceedInventory = value;
                return this;
            }

            /// <summary>
            /// Sets value for Product.InventoryVisible property.
            /// </summary>
            /// <param name="value">InventoryVisible</param>
            public ProductBuilder InventoryVisible(bool? value)
            {
                _InventoryVisible = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Product.
            /// </summary>
            /// <returns>Product</returns>
            public Product Build()
            {
                Validate();
                return new Product(
                    ID: _ID,
                    Name: _Name,
                    Description: _Description,
                    QuantityMultiplier: _QuantityMultiplier,
                    ShipWeight: _ShipWeight,
                    Active: _Active,
                    Type: _Type,
                    InventoryEnabled: _InventoryEnabled,
                    InventoryNotificationPoint: _InventoryNotificationPoint,
                    VariantLevelInventory: _VariantLevelInventory,
                    Xp: _Xp,
                    AllowOrderExceedInventory: _AllowOrderExceedInventory,
                    InventoryVisible: _InventoryVisible
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
