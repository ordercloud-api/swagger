using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Variant
    /// </summary>
    public sealed class Variant:  IEquatable<Variant>
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
        /// Active
        /// </summary>
        public bool? Active { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Variant.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Variant()
        {
        }

        private Variant(string ID, string Name, string Description, bool? Active, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Active = Active;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Variant.
        /// </summary>
        /// <returns>VariantBuilder</returns>
        public static VariantBuilder Builder()
        {
            return new VariantBuilder();
        }

        /// <summary>
        /// Returns VariantBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VariantBuilder</returns>
        public VariantBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Description(Description)
                .Active(Active)
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

        public bool Equals(Variant other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Variant.
        /// </summary>
        /// <param name="left">Compared (Variant</param>
        /// <param name="right">Compared (Variant</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Variant left, Variant right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Variant.
        /// </summary>
        /// <param name="left">Compared (Variant</param>
        /// <param name="right">Compared (Variant</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Variant left, Variant right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Variant.
        /// </summary>
        public sealed class VariantBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private bool? _Active;
            private Object _Xp;

            internal VariantBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Variant.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public VariantBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variant.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public VariantBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variant.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public VariantBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variant.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public VariantBuilder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for Variant.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public VariantBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Variant.
            /// </summary>
            /// <returns>Variant</returns>
            public Variant Build()
            {
                Validate();
                return new Variant(
                    ID: _ID,
                    Name: _Name,
                    Description: _Description,
                    Active: _Active,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
