using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PasswordResetRequest
    /// </summary>
    public sealed class PasswordResetRequest:  IEquatable<PasswordResetRequest>
    { 
        /// <summary>
        /// ClientID
        /// </summary>
        public string ClientID { get; private set; }

        /// <summary>
        /// Email
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public string Username { get; private set; }

        /// <summary>
        /// URL
        /// </summary>
        public string URL { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PasswordResetRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PasswordResetRequest()
        {
        }

        private PasswordResetRequest(string ClientID, string Email, string Username, string URL)
        {
            
            this.ClientID = ClientID;
            
            this.Email = Email;
            
            this.Username = Username;
            
            this.URL = URL;
            
        }

        /// <summary>
        /// Returns builder of PasswordResetRequest.
        /// </summary>
        /// <returns>PasswordResetRequestBuilder</returns>
        public static PasswordResetRequestBuilder Builder()
        {
            return new PasswordResetRequestBuilder();
        }

        /// <summary>
        /// Returns PasswordResetRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PasswordResetRequestBuilder</returns>
        public PasswordResetRequestBuilder With()
        {
            return Builder()
                .ClientID(ClientID)
                .Email(Email)
                .Username(Username)
                .URL(URL);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PasswordResetRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PasswordResetRequest.
        /// </summary>
        /// <param name="left">Compared (PasswordResetRequest</param>
        /// <param name="right">Compared (PasswordResetRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PasswordResetRequest left, PasswordResetRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PasswordResetRequest.
        /// </summary>
        /// <param name="left">Compared (PasswordResetRequest</param>
        /// <param name="right">Compared (PasswordResetRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PasswordResetRequest left, PasswordResetRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PasswordResetRequest.
        /// </summary>
        public sealed class PasswordResetRequestBuilder
        {
            private string _ClientID;
            private string _Email;
            private string _Username;
            private string _URL;

            internal PasswordResetRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PasswordResetRequest.ClientID property.
            /// </summary>
            /// <param name="value">ClientID</param>
            public PasswordResetRequestBuilder ClientID(string value)
            {
                _ClientID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PasswordResetRequest.Email property.
            /// </summary>
            /// <param name="value">Email</param>
            public PasswordResetRequestBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for PasswordResetRequest.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public PasswordResetRequestBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for PasswordResetRequest.URL property.
            /// </summary>
            /// <param name="value">URL</param>
            public PasswordResetRequestBuilder URL(string value)
            {
                _URL = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PasswordResetRequest.
            /// </summary>
            /// <returns>PasswordResetRequest</returns>
            public PasswordResetRequest Build()
            {
                Validate();
                return new PasswordResetRequest(
                    ClientID: _ClientID,
                    Email: _Email,
                    Username: _Username,
                    URL: _URL
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
