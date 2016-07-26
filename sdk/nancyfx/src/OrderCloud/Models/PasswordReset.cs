using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PasswordReset
    /// </summary>
    public sealed class PasswordReset:  IEquatable<PasswordReset>
    { 
        /// <summary>
        /// ClientID
        /// </summary>
        public string ClientID { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public string Username { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public string Password { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PasswordReset.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PasswordReset()
        {
        }

        private PasswordReset(string ClientID, string Username, string Password)
        {
            
            this.ClientID = ClientID;
            
            this.Username = Username;
            
            this.Password = Password;
            
        }

        /// <summary>
        /// Returns builder of PasswordReset.
        /// </summary>
        /// <returns>PasswordResetBuilder</returns>
        public static PasswordResetBuilder Builder()
        {
            return new PasswordResetBuilder();
        }

        /// <summary>
        /// Returns PasswordResetBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PasswordResetBuilder</returns>
        public PasswordResetBuilder With()
        {
            return Builder()
                .ClientID(ClientID)
                .Username(Username)
                .Password(Password);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PasswordReset other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PasswordReset.
        /// </summary>
        /// <param name="left">Compared (PasswordReset</param>
        /// <param name="right">Compared (PasswordReset</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PasswordReset left, PasswordReset right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PasswordReset.
        /// </summary>
        /// <param name="left">Compared (PasswordReset</param>
        /// <param name="right">Compared (PasswordReset</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PasswordReset left, PasswordReset right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PasswordReset.
        /// </summary>
        public sealed class PasswordResetBuilder
        {
            private string _ClientID;
            private string _Username;
            private string _Password;

            internal PasswordResetBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PasswordReset.ClientID property.
            /// </summary>
            /// <param name="value">ClientID</param>
            public PasswordResetBuilder ClientID(string value)
            {
                _ClientID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PasswordReset.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public PasswordResetBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for PasswordReset.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public PasswordResetBuilder Password(string value)
            {
                _Password = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PasswordReset.
            /// </summary>
            /// <returns>PasswordReset</returns>
            public PasswordReset Build()
            {
                Validate();
                return new PasswordReset(
                    ClientID: _ClientID,
                    Username: _Username,
                    Password: _Password
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
