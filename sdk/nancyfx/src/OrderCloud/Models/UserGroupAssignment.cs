using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// UserGroupAssignment
    /// </summary>
    public sealed class UserGroupAssignment:  IEquatable<UserGroupAssignment>
    { 
        /// <summary>
        /// UserGroupID
        /// </summary>
        public string UserGroupID { get; private set; }

        /// <summary>
        /// UserID
        /// </summary>
        public string UserID { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserGroupAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserGroupAssignment()
        {
        }

        private UserGroupAssignment(string UserGroupID, string UserID)
        {
            
            this.UserGroupID = UserGroupID;
            
            this.UserID = UserID;
            
        }

        /// <summary>
        /// Returns builder of UserGroupAssignment.
        /// </summary>
        /// <returns>UserGroupAssignmentBuilder</returns>
        public static UserGroupAssignmentBuilder Builder()
        {
            return new UserGroupAssignmentBuilder();
        }

        /// <summary>
        /// Returns UserGroupAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserGroupAssignmentBuilder</returns>
        public UserGroupAssignmentBuilder With()
        {
            return Builder()
                .UserGroupID(UserGroupID)
                .UserID(UserID);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserGroupAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserGroupAssignment.
        /// </summary>
        /// <param name="left">Compared (UserGroupAssignment</param>
        /// <param name="right">Compared (UserGroupAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserGroupAssignment left, UserGroupAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserGroupAssignment.
        /// </summary>
        /// <param name="left">Compared (UserGroupAssignment</param>
        /// <param name="right">Compared (UserGroupAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserGroupAssignment left, UserGroupAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserGroupAssignment.
        /// </summary>
        public sealed class UserGroupAssignmentBuilder
        {
            private string _UserGroupID;
            private string _UserID;

            internal UserGroupAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserGroupAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public UserGroupAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroupAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public UserGroupAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserGroupAssignment.
            /// </summary>
            /// <returns>UserGroupAssignment</returns>
            public UserGroupAssignment Build()
            {
                Validate();
                return new UserGroupAssignment(
                    UserGroupID: _UserGroupID,
                    UserID: _UserID
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
