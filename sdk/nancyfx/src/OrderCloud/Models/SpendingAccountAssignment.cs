using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// SpendingAccountAssignment
    /// </summary>
    public sealed class SpendingAccountAssignment:  IEquatable<SpendingAccountAssignment>
    { 
        /// <summary>
        /// SpendingAccountID
        /// </summary>
        public string SpendingAccountID { get; private set; }

        /// <summary>
        /// UserID
        /// </summary>
        public string UserID { get; private set; }

        /// <summary>
        /// UserGroupID
        /// </summary>
        public string UserGroupID { get; private set; }

        /// <summary>
        /// AllowExceed
        /// </summary>
        public bool? AllowExceed { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SpendingAccountAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SpendingAccountAssignment()
        {
        }

        private SpendingAccountAssignment(string SpendingAccountID, string UserID, string UserGroupID, bool? AllowExceed)
        {
            
            this.SpendingAccountID = SpendingAccountID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
            this.AllowExceed = AllowExceed;
            
        }

        /// <summary>
        /// Returns builder of SpendingAccountAssignment.
        /// </summary>
        /// <returns>SpendingAccountAssignmentBuilder</returns>
        public static SpendingAccountAssignmentBuilder Builder()
        {
            return new SpendingAccountAssignmentBuilder();
        }

        /// <summary>
        /// Returns SpendingAccountAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SpendingAccountAssignmentBuilder</returns>
        public SpendingAccountAssignmentBuilder With()
        {
            return Builder()
                .SpendingAccountID(SpendingAccountID)
                .UserID(UserID)
                .UserGroupID(UserGroupID)
                .AllowExceed(AllowExceed);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SpendingAccountAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SpendingAccountAssignment.
        /// </summary>
        /// <param name="left">Compared (SpendingAccountAssignment</param>
        /// <param name="right">Compared (SpendingAccountAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SpendingAccountAssignment left, SpendingAccountAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SpendingAccountAssignment.
        /// </summary>
        /// <param name="left">Compared (SpendingAccountAssignment</param>
        /// <param name="right">Compared (SpendingAccountAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SpendingAccountAssignment left, SpendingAccountAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SpendingAccountAssignment.
        /// </summary>
        public sealed class SpendingAccountAssignmentBuilder
        {
            private string _SpendingAccountID;
            private string _UserID;
            private string _UserGroupID;
            private bool? _AllowExceed;

            internal SpendingAccountAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SpendingAccountAssignment.SpendingAccountID property.
            /// </summary>
            /// <param name="value">SpendingAccountID</param>
            public SpendingAccountAssignmentBuilder SpendingAccountID(string value)
            {
                _SpendingAccountID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccountAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public SpendingAccountAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccountAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public SpendingAccountAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccountAssignment.AllowExceed property.
            /// </summary>
            /// <param name="value">AllowExceed</param>
            public SpendingAccountAssignmentBuilder AllowExceed(bool? value)
            {
                _AllowExceed = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SpendingAccountAssignment.
            /// </summary>
            /// <returns>SpendingAccountAssignment</returns>
            public SpendingAccountAssignment Build()
            {
                Validate();
                return new SpendingAccountAssignment(
                    SpendingAccountID: _SpendingAccountID,
                    UserID: _UserID,
                    UserGroupID: _UserGroupID,
                    AllowExceed: _AllowExceed
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
