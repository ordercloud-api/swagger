using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Spec
    /// </summary>
    public sealed class Spec:  IEquatable<Spec>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// ListOrder
        /// </summary>
        public int? ListOrder { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// DefaultValue
        /// </summary>
        public string DefaultValue { get; private set; }

        /// <summary>
        /// Required
        /// </summary>
        public bool? Required { get; private set; }

        /// <summary>
        /// AllowOpenText
        /// </summary>
        public bool? AllowOpenText { get; private set; }

        /// <summary>
        /// DefaultOptionID
        /// </summary>
        public string DefaultOptionID { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Spec.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Spec()
        {
        }

        private Spec(string ID, int? ListOrder, string Name, string DefaultValue, bool? Required, bool? AllowOpenText, string DefaultOptionID, Object Xp)
        {
            
            this.ID = ID;
            
            this.ListOrder = ListOrder;
            
            this.Name = Name;
            
            this.DefaultValue = DefaultValue;
            
            this.Required = Required;
            
            this.AllowOpenText = AllowOpenText;
            
            this.DefaultOptionID = DefaultOptionID;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Spec.
        /// </summary>
        /// <returns>SpecBuilder</returns>
        public static SpecBuilder Builder()
        {
            return new SpecBuilder();
        }

        /// <summary>
        /// Returns SpecBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SpecBuilder</returns>
        public SpecBuilder With()
        {
            return Builder()
                .ID(ID)
                .ListOrder(ListOrder)
                .Name(Name)
                .DefaultValue(DefaultValue)
                .Required(Required)
                .AllowOpenText(AllowOpenText)
                .DefaultOptionID(DefaultOptionID)
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

        public bool Equals(Spec other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Spec.
        /// </summary>
        /// <param name="left">Compared (Spec</param>
        /// <param name="right">Compared (Spec</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Spec left, Spec right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Spec.
        /// </summary>
        /// <param name="left">Compared (Spec</param>
        /// <param name="right">Compared (Spec</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Spec left, Spec right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Spec.
        /// </summary>
        public sealed class SpecBuilder
        {
            private string _ID;
            private int? _ListOrder;
            private string _Name;
            private string _DefaultValue;
            private bool? _Required;
            private bool? _AllowOpenText;
            private string _DefaultOptionID;
            private Object _Xp;

            internal SpecBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Spec.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public SpecBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.ListOrder property.
            /// </summary>
            /// <param name="value">ListOrder</param>
            public SpecBuilder ListOrder(int? value)
            {
                _ListOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public SpecBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.DefaultValue property.
            /// </summary>
            /// <param name="value">DefaultValue</param>
            public SpecBuilder DefaultValue(string value)
            {
                _DefaultValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.Required property.
            /// </summary>
            /// <param name="value">Required</param>
            public SpecBuilder Required(bool? value)
            {
                _Required = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.AllowOpenText property.
            /// </summary>
            /// <param name="value">AllowOpenText</param>
            public SpecBuilder AllowOpenText(bool? value)
            {
                _AllowOpenText = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.DefaultOptionID property.
            /// </summary>
            /// <param name="value">DefaultOptionID</param>
            public SpecBuilder DefaultOptionID(string value)
            {
                _DefaultOptionID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Spec.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public SpecBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Spec.
            /// </summary>
            /// <returns>Spec</returns>
            public Spec Build()
            {
                Validate();
                return new Spec(
                    ID: _ID,
                    ListOrder: _ListOrder,
                    Name: _Name,
                    DefaultValue: _DefaultValue,
                    Required: _Required,
                    AllowOpenText: _AllowOpenText,
                    DefaultOptionID: _DefaultOptionID,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
