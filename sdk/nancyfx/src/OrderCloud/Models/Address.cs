using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Address
    /// </summary>
    public sealed class Address:  IEquatable<Address>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

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
        /// Use Address.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Address()
        {
        }

        private Address(string ID, string CompanyName, string FirstName, string LastName, string Street1, string Street2, string City, string State, string Zip, string Country, string Phone, string AddressName, Object Xp)
        {
            
            this.ID = ID;
            
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
        /// Returns builder of Address.
        /// </summary>
        /// <returns>AddressBuilder</returns>
        public static AddressBuilder Builder()
        {
            return new AddressBuilder();
        }

        /// <summary>
        /// Returns AddressBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressBuilder</returns>
        public AddressBuilder With()
        {
            return Builder()
                .ID(ID)
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

        public bool Equals(Address other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Address.
        /// </summary>
        /// <param name="left">Compared (Address</param>
        /// <param name="right">Compared (Address</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Address left, Address right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Address.
        /// </summary>
        /// <param name="left">Compared (Address</param>
        /// <param name="right">Compared (Address</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Address left, Address right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Address.
        /// </summary>
        public sealed class AddressBuilder
        {
            private string _ID;
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

            internal AddressBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Address.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public AddressBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.CompanyName property.
            /// </summary>
            /// <param name="value">CompanyName</param>
            public AddressBuilder CompanyName(string value)
            {
                _CompanyName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.FirstName property.
            /// </summary>
            /// <param name="value">FirstName</param>
            public AddressBuilder FirstName(string value)
            {
                _FirstName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.LastName property.
            /// </summary>
            /// <param name="value">LastName</param>
            public AddressBuilder LastName(string value)
            {
                _LastName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Street1 property.
            /// </summary>
            /// <param name="value">Street1</param>
            public AddressBuilder Street1(string value)
            {
                _Street1 = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Street2 property.
            /// </summary>
            /// <param name="value">Street2</param>
            public AddressBuilder Street2(string value)
            {
                _Street2 = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.City property.
            /// </summary>
            /// <param name="value">City</param>
            public AddressBuilder City(string value)
            {
                _City = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.State property.
            /// </summary>
            /// <param name="value">State</param>
            public AddressBuilder State(string value)
            {
                _State = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Zip property.
            /// </summary>
            /// <param name="value">Zip</param>
            public AddressBuilder Zip(string value)
            {
                _Zip = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Country property.
            /// </summary>
            /// <param name="value">Country</param>
            public AddressBuilder Country(string value)
            {
                _Country = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Phone property.
            /// </summary>
            /// <param name="value">Phone</param>
            public AddressBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.AddressName property.
            /// </summary>
            /// <param name="value">AddressName</param>
            public AddressBuilder AddressName(string value)
            {
                _AddressName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public AddressBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Address.
            /// </summary>
            /// <returns>Address</returns>
            public Address Build()
            {
                Validate();
                return new Address(
                    ID: _ID,
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
