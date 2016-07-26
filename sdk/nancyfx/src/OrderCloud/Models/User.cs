using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// User
    /// </summary>
    public sealed class User:  IEquatable<User>
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
        /// Use User.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public User()
        {
        }

        private User(string ID, string Username, string Password, string FirstName, string LastName, string Email, string Phone, ZonedDateTime? TermsAccepted, bool? Active, Object Xp, string SecurityProfileID)
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
        /// Returns builder of User.
        /// </summary>
        /// <returns>UserBuilder</returns>
        public static UserBuilder Builder()
        {
            return new UserBuilder();
        }

        /// <summary>
        /// Returns UserBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserBuilder</returns>
        public UserBuilder With()
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

        public bool Equals(User other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (User.
        /// </summary>
        /// <param name="left">Compared (User</param>
        /// <param name="right">Compared (User</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (User left, User right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (User.
        /// </summary>
        /// <param name="left">Compared (User</param>
        /// <param name="right">Compared (User</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (User left, User right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of User.
        /// </summary>
        public sealed class UserBuilder
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

            internal UserBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for User.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public UserBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public UserBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public UserBuilder Password(string value)
            {
                _Password = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.FirstName property.
            /// </summary>
            /// <param name="value">FirstName</param>
            public UserBuilder FirstName(string value)
            {
                _FirstName = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.LastName property.
            /// </summary>
            /// <param name="value">LastName</param>
            public UserBuilder LastName(string value)
            {
                _LastName = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Email property.
            /// </summary>
            /// <param name="value">Email</param>
            public UserBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Phone property.
            /// </summary>
            /// <param name="value">Phone</param>
            public UserBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.TermsAccepted property.
            /// </summary>
            /// <param name="value">TermsAccepted</param>
            public UserBuilder TermsAccepted(ZonedDateTime? value)
            {
                _TermsAccepted = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public UserBuilder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public UserBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.SecurityProfileID property.
            /// </summary>
            /// <param name="value">SecurityProfileID</param>
            public UserBuilder SecurityProfileID(string value)
            {
                _SecurityProfileID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of User.
            /// </summary>
            /// <returns>User</returns>
            public User Build()
            {
                Validate();
                return new User(
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
