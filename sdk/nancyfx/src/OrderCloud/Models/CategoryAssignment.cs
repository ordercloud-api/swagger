using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CategoryAssignment
    /// </summary>
    public sealed class CategoryAssignment:  IEquatable<CategoryAssignment>
    { 
        /// <summary>
        /// CategoryID
        /// </summary>
        public string CategoryID { get; private set; }

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
        /// Use CategoryAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CategoryAssignment()
        {
        }

        private CategoryAssignment(string CategoryID, string UserID, string UserGroupID)
        {
            
            this.CategoryID = CategoryID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
        }

        /// <summary>
        /// Returns builder of CategoryAssignment.
        /// </summary>
        /// <returns>CategoryAssignmentBuilder</returns>
        public static CategoryAssignmentBuilder Builder()
        {
            return new CategoryAssignmentBuilder();
        }

        /// <summary>
        /// Returns CategoryAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CategoryAssignmentBuilder</returns>
        public CategoryAssignmentBuilder With()
        {
            return Builder()
                .CategoryID(CategoryID)
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

        public bool Equals(CategoryAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CategoryAssignment.
        /// </summary>
        /// <param name="left">Compared (CategoryAssignment</param>
        /// <param name="right">Compared (CategoryAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CategoryAssignment left, CategoryAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CategoryAssignment.
        /// </summary>
        /// <param name="left">Compared (CategoryAssignment</param>
        /// <param name="right">Compared (CategoryAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CategoryAssignment left, CategoryAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CategoryAssignment.
        /// </summary>
        public sealed class CategoryAssignmentBuilder
        {
            private string _CategoryID;
            private string _UserID;
            private string _UserGroupID;

            internal CategoryAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CategoryAssignment.CategoryID property.
            /// </summary>
            /// <param name="value">CategoryID</param>
            public CategoryAssignmentBuilder CategoryID(string value)
            {
                _CategoryID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CategoryAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public CategoryAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CategoryAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public CategoryAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CategoryAssignment.
            /// </summary>
            /// <returns>CategoryAssignment</returns>
            public CategoryAssignment Build()
            {
                Validate();
                return new CategoryAssignment(
                    CategoryID: _CategoryID,
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
