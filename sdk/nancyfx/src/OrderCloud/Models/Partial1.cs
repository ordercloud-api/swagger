using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Partial1
    /// </summary>
    public sealed class Partial1:  IEquatable<Partial1>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public string Username { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public string Password { get; private set; }

        /// <summary>
        /// FirstName
        /// </summary>
        public string FirstName { get; private set; }

        /// <summary>
        /// LastName
        /// </summary>
        public string LastName { get; private set; }

        /// <summary>
        /// Email
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// Phone
        /// </summary>
        public string Phone { get; private set; }

        /// <summary>
        /// TermsAccepted
        /// </summary>
        public ZonedDateTime? TermsAccepted { get; private set; }

        /// <summary>
        /// Active
        /// </summary>
        public bool? Active { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }

        /// <summary>
        /// SecurityProfileID
        /// </summary>
        public string SecurityProfileID { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Partial1.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Partial1()
        {
        }

        private Partial1(string ID, string Username, string Password, string FirstName, string LastName, string Email, string Phone, ZonedDateTime? TermsAccepted, bool? Active, Object Xp, string SecurityProfileID)
        {
            
            this.ID = ID;
            
            this.Username = Username;
            
            this.Password = Password;
            
            this.FirstName = FirstName;
            
            this.LastName = LastName;
            
            this.Email = Email;
            
            this.Phone = Phone;
            
            this.TermsAccepted = TermsAccepted;
            
            this.Active = Active;
            
            this.Xp = Xp;
            
            this.SecurityProfileID = SecurityProfileID;
            
        }

        /// <summary>
        /// Returns builder of Partial1.
        /// </summary>
        /// <returns>Partial1Builder</returns>
        public static Partial1Builder Builder()
        {
            return new Partial1Builder();
        }

        /// <summary>
        /// Returns Partial1Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>Partial1Builder</returns>
        public Partial1Builder With()
        {
            return Builder()
                .ID(ID)
                .Username(Username)
                .Password(Password)
                .FirstName(FirstName)
                .LastName(LastName)
                .Email(Email)
                .Phone(Phone)
                .TermsAccepted(TermsAccepted)
                .Active(Active)
                .Xp(Xp)
                .SecurityProfileID(SecurityProfileID);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Partial1 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Partial1.
        /// </summary>
        /// <param name="left">Compared (Partial1</param>
        /// <param name="right">Compared (Partial1</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Partial1 left, Partial1 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Partial1.
        /// </summary>
        /// <param name="left">Compared (Partial1</param>
        /// <param name="right">Compared (Partial1</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Partial1 left, Partial1 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Partial1.
        /// </summary>
        public sealed class Partial1Builder
        {
            private string _ID;
            private string _Username;
            private string _Password;
            private string _FirstName;
            private string _LastName;
            private string _Email;
            private string _Phone;
            private ZonedDateTime? _TermsAccepted;
            private bool? _Active;
            private Object _Xp;
            private string _SecurityProfileID;

            internal Partial1Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Partial1.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public Partial1Builder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public Partial1Builder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public Partial1Builder Password(string value)
            {
                _Password = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.FirstName property.
            /// </summary>
            /// <param name="value">FirstName</param>
            public Partial1Builder FirstName(string value)
            {
                _FirstName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.LastName property.
            /// </summary>
            /// <param name="value">LastName</param>
            public Partial1Builder LastName(string value)
            {
                _LastName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Email property.
            /// </summary>
            /// <param name="value">Email</param>
            public Partial1Builder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Phone property.
            /// </summary>
            /// <param name="value">Phone</param>
            public Partial1Builder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.TermsAccepted property.
            /// </summary>
            /// <param name="value">TermsAccepted</param>
            public Partial1Builder TermsAccepted(ZonedDateTime? value)
            {
                _TermsAccepted = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public Partial1Builder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public Partial1Builder Xp(Object value)
            {
                _Xp = value;
                return this;
            }

            /// <summary>
            /// Sets value for Partial1.SecurityProfileID property.
            /// </summary>
            /// <param name="value">SecurityProfileID</param>
            public Partial1Builder SecurityProfileID(string value)
            {
                _SecurityProfileID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Partial1.
            /// </summary>
            /// <returns>Partial1</returns>
            public Partial1 Build()
            {
                Validate();
                return new Partial1(
                    ID: _ID,
                    Username: _Username,
                    Password: _Password,
                    FirstName: _FirstName,
                    LastName: _LastName,
                    Email: _Email,
                    Phone: _Phone,
                    TermsAccepted: _TermsAccepted,
                    Active: _Active,
                    Xp: _Xp,
                    SecurityProfileID: _SecurityProfileID
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
