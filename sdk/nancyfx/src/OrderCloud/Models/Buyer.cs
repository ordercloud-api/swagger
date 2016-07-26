using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Buyer
    /// </summary>
    public sealed class Buyer:  IEquatable<Buyer>
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
        /// Active
        /// </summary>
        public bool? Active { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Buyer.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Buyer()
        {
        }

        private Buyer(string ID, string Name, bool? Active, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Active = Active;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Buyer.
        /// </summary>
        /// <returns>BuyerBuilder</returns>
        public static BuyerBuilder Builder()
        {
            return new BuyerBuilder();
        }

        /// <summary>
        /// Returns BuyerBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BuyerBuilder</returns>
        public BuyerBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
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

        public bool Equals(Buyer other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Buyer.
        /// </summary>
        /// <param name="left">Compared (Buyer</param>
        /// <param name="right">Compared (Buyer</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Buyer left, Buyer right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Buyer.
        /// </summary>
        /// <param name="left">Compared (Buyer</param>
        /// <param name="right">Compared (Buyer</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Buyer left, Buyer right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Buyer.
        /// </summary>
        public sealed class BuyerBuilder
        {
            private string _ID;
            private string _Name;
            private bool? _Active;
            private Object _Xp;

            internal BuyerBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Buyer.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public BuyerBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Buyer.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public BuyerBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Buyer.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public BuyerBuilder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for Buyer.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public BuyerBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Buyer.
            /// </summary>
            /// <returns>Buyer</returns>
            public Buyer Build()
            {
                Validate();
                return new Buyer(
                    ID: _ID,
                    Name: _Name,
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
