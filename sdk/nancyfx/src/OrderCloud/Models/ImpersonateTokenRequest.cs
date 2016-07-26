using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// ImpersonateTokenRequest
    /// </summary>
    public sealed class ImpersonateTokenRequest:  IEquatable<ImpersonateTokenRequest>
    { 
        /// <summary>
        /// ClientID
        /// </summary>
        public string ClientID { get; private set; }

        /// <summary>
        /// Claims
        /// </summary>
        public List<ShipmentItem> Claims { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ImpersonateTokenRequest.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ImpersonateTokenRequest()
        {
        }

        private ImpersonateTokenRequest(string ClientID, List<ShipmentItem> Claims)
        {
            
            this.ClientID = ClientID;
            
            this.Claims = Claims;
            
        }

        /// <summary>
        /// Returns builder of ImpersonateTokenRequest.
        /// </summary>
        /// <returns>ImpersonateTokenRequestBuilder</returns>
        public static ImpersonateTokenRequestBuilder Builder()
        {
            return new ImpersonateTokenRequestBuilder();
        }

        /// <summary>
        /// Returns ImpersonateTokenRequestBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ImpersonateTokenRequestBuilder</returns>
        public ImpersonateTokenRequestBuilder With()
        {
            return Builder()
                .ClientID(ClientID)
                .Claims(Claims);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ImpersonateTokenRequest other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ImpersonateTokenRequest.
        /// </summary>
        /// <param name="left">Compared (ImpersonateTokenRequest</param>
        /// <param name="right">Compared (ImpersonateTokenRequest</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ImpersonateTokenRequest left, ImpersonateTokenRequest right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ImpersonateTokenRequest.
        /// </summary>
        /// <param name="left">Compared (ImpersonateTokenRequest</param>
        /// <param name="right">Compared (ImpersonateTokenRequest</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ImpersonateTokenRequest left, ImpersonateTokenRequest right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ImpersonateTokenRequest.
        /// </summary>
        public sealed class ImpersonateTokenRequestBuilder
        {
            private string _ClientID;
            private List<ShipmentItem> _Claims;

            internal ImpersonateTokenRequestBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ImpersonateTokenRequest.ClientID property.
            /// </summary>
            /// <param name="value">ClientID</param>
            public ImpersonateTokenRequestBuilder ClientID(string value)
            {
                _ClientID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ImpersonateTokenRequest.Claims property.
            /// </summary>
            /// <param name="value">Claims</param>
            public ImpersonateTokenRequestBuilder Claims(List<ShipmentItem> value)
            {
                _Claims = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ImpersonateTokenRequest.
            /// </summary>
            /// <returns>ImpersonateTokenRequest</returns>
            public ImpersonateTokenRequest Build()
            {
                Validate();
                return new ImpersonateTokenRequest(
                    ClientID: _ClientID,
                    Claims: _Claims
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
