using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CreditCardAssignment
    /// </summary>
    public sealed class CreditCardAssignment:  IEquatable<CreditCardAssignment>
    { 
        /// <summary>
        /// CreditCardID
        /// </summary>
        public string CreditCardID { get; private set; }

        /// <summary>
        /// UserID
        /// </summary>
        public string UserID { get; private set; }

        /// <summary>
        /// UserGroupID
        /// </summary>
        public string UserGroupID { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CreditCardAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CreditCardAssignment()
        {
        }

        private CreditCardAssignment(string CreditCardID, string UserID, string UserGroupID)
        {
            
            this.CreditCardID = CreditCardID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
        }

        /// <summary>
        /// Returns builder of CreditCardAssignment.
        /// </summary>
        /// <returns>CreditCardAssignmentBuilder</returns>
        public static CreditCardAssignmentBuilder Builder()
        {
            return new CreditCardAssignmentBuilder();
        }

        /// <summary>
        /// Returns CreditCardAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CreditCardAssignmentBuilder</returns>
        public CreditCardAssignmentBuilder With()
        {
            return Builder()
                .CreditCardID(CreditCardID)
                .UserID(UserID)
                .UserGroupID(UserGroupID);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CreditCardAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CreditCardAssignment.
        /// </summary>
        /// <param name="left">Compared (CreditCardAssignment</param>
        /// <param name="right">Compared (CreditCardAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CreditCardAssignment left, CreditCardAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CreditCardAssignment.
        /// </summary>
        /// <param name="left">Compared (CreditCardAssignment</param>
        /// <param name="right">Compared (CreditCardAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CreditCardAssignment left, CreditCardAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CreditCardAssignment.
        /// </summary>
        public sealed class CreditCardAssignmentBuilder
        {
            private string _CreditCardID;
            private string _UserID;
            private string _UserGroupID;

            internal CreditCardAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CreditCardAssignment.CreditCardID property.
            /// </summary>
            /// <param name="value">CreditCardID</param>
            public CreditCardAssignmentBuilder CreditCardID(string value)
            {
                _CreditCardID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCardAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public CreditCardAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCardAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public CreditCardAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CreditCardAssignment.
            /// </summary>
            /// <returns>CreditCardAssignment</returns>
            public CreditCardAssignment Build()
            {
                Validate();
                return new CreditCardAssignment(
                    CreditCardID: _CreditCardID,
                    UserID: _UserID,
                    UserGroupID: _UserGroupID
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
