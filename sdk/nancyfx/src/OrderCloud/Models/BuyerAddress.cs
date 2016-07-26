using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// BuyerAddress
    /// </summary>
    public sealed class BuyerAddress:  IEquatable<BuyerAddress>
    { 
        /// <summary>
        /// Shipping
        /// </summary>
        public bool? Shipping { get; private set; }

        /// <summary>
        /// Billing
        /// </summary>
        public bool? Billing { get; private set; }

        /// <summary>
        /// CompanyName
        /// </summary>
        public string CompanyName { get; private set; }

        /// <summary>
        /// FirstName
        /// </summary>
        public string FirstName { get; private set; }

        /// <summary>
        /// LastName
        /// </summary>
        public string LastName { get; private set; }

        /// <summary>
        /// Street1
        /// </summary>
        public string Street1 { get; private set; }

        /// <summary>
        /// Street2
        /// </summary>
        public string Street2 { get; private set; }

        /// <summary>
        /// City
        /// </summary>
        public string City { get; private set; }

        /// <summary>
        /// State
        /// </summary>
        public string State { get; private set; }

        /// <summary>
        /// Zip
        /// </summary>
        public string Zip { get; private set; }

        /// <summary>
        /// Country
        /// </summary>
        public string Country { get; private set; }

        /// <summary>
        /// Phone
        /// </summary>
        public string Phone { get; private set; }

        /// <summary>
        /// AddressName
        /// </summary>
        public string AddressName { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BuyerAddress.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BuyerAddress()
        {
        }

        private BuyerAddress(bool? Shipping, bool? Billing, string CompanyName, string FirstName, string LastName, string Street1, string Street2, string City, string State, string Zip, string Country, string Phone, string AddressName, Object Xp)
        {
            
            this.Shipping = Shipping;
            
            this.Billing = Billing;
            
            this.CompanyName = CompanyName;
            
            this.FirstName = FirstName;
            
            this.LastName = LastName;
            
            this.Street1 = Street1;
            
            this.Street2 = Street2;
            
            this.City = City;
            
            this.State = State;
            
            this.Zip = Zip;
            
            this.Country = Country;
            
            this.Phone = Phone;
            
            this.AddressName = AddressName;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of BuyerAddress.
        /// </summary>
        /// <returns>BuyerAddressBuilder</returns>
        public static BuyerAddressBuilder Builder()
        {
            return new BuyerAddressBuilder();
        }

        /// <summary>
        /// Returns BuyerAddressBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BuyerAddressBuilder</returns>
        public BuyerAddressBuilder With()
        {
            return Builder()
                .Shipping(Shipping)
                .Billing(Billing)
                .CompanyName(CompanyName)
                .FirstName(FirstName)
                .LastName(LastName)
                .Street1(Street1)
                .Street2(Street2)
                .City(City)
                .State(State)
                .Zip(Zip)
                .Country(Country)
                .Phone(Phone)
                .AddressName(AddressName)
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

        public bool Equals(BuyerAddress other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BuyerAddress.
        /// </summary>
        /// <param name="left">Compared (BuyerAddress</param>
        /// <param name="right">Compared (BuyerAddress</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BuyerAddress left, BuyerAddress right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BuyerAddress.
        /// </summary>
        /// <param name="left">Compared (BuyerAddress</param>
        /// <param name="right">Compared (BuyerAddress</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BuyerAddress left, BuyerAddress right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BuyerAddress.
        /// </summary>
        public sealed class BuyerAddressBuilder
        {
            private bool? _Shipping;
            private bool? _Billing;
            private string _CompanyName;
            private string _FirstName;
            private string _LastName;
            private string _Street1;
            private string _Street2;
            private string _City;
            private string _State;
            private string _Zip;
            private string _Country;
            private string _Phone;
            private string _AddressName;
            private Object _Xp;

            internal BuyerAddressBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BuyerAddress.Shipping property.
            /// </summary>
            /// <param name="value">Shipping</param>
            public BuyerAddressBuilder Shipping(bool? value)
            {
                _Shipping = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Billing property.
            /// </summary>
            /// <param name="value">Billing</param>
            public BuyerAddressBuilder Billing(bool? value)
            {
                _Billing = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.CompanyName property.
            /// </summary>
            /// <param name="value">CompanyName</param>
            public BuyerAddressBuilder CompanyName(string value)
            {
                _CompanyName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.FirstName property.
            /// </summary>
            /// <param name="value">FirstName</param>
            public BuyerAddressBuilder FirstName(string value)
            {
                _FirstName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.LastName property.
            /// </summary>
            /// <param name="value">LastName</param>
            public BuyerAddressBuilder LastName(string value)
            {
                _LastName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Street1 property.
            /// </summary>
            /// <param name="value">Street1</param>
            public BuyerAddressBuilder Street1(string value)
            {
                _Street1 = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Street2 property.
            /// </summary>
            /// <param name="value">Street2</param>
            public BuyerAddressBuilder Street2(string value)
            {
                _Street2 = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.City property.
            /// </summary>
            /// <param name="value">City</param>
            public BuyerAddressBuilder City(string value)
            {
                _City = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.State property.
            /// </summary>
            /// <param name="value">State</param>
            public BuyerAddressBuilder State(string value)
            {
                _State = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Zip property.
            /// </summary>
            /// <param name="value">Zip</param>
            public BuyerAddressBuilder Zip(string value)
            {
                _Zip = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Country property.
            /// </summary>
            /// <param name="value">Country</param>
            public BuyerAddressBuilder Country(string value)
            {
                _Country = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Phone property.
            /// </summary>
            /// <param name="value">Phone</param>
            public BuyerAddressBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.AddressName property.
            /// </summary>
            /// <param name="value">AddressName</param>
            public BuyerAddressBuilder AddressName(string value)
            {
                _AddressName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerAddress.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public BuyerAddressBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BuyerAddress.
            /// </summary>
            /// <returns>BuyerAddress</returns>
            public BuyerAddress Build()
            {
                Validate();
                return new BuyerAddress(
                    Shipping: _Shipping,
                    Billing: _Billing,
                    CompanyName: _CompanyName,
                    FirstName: _FirstName,
                    LastName: _LastName,
                    Street1: _Street1,
                    Street2: _Street2,
                    City: _City,
                    State: _State,
                    Zip: _Zip,
                    Country: _Country,
                    Phone: _Phone,
                    AddressName: _AddressName,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
