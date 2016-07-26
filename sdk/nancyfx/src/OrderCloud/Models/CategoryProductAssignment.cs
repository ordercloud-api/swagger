using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CategoryProductAssignment
    /// </summary>
    public sealed class CategoryProductAssignment:  IEquatable<CategoryProductAssignment>
    { 
        /// <summary>
        /// CategoryID
        /// </summary>
        public string CategoryID { get; private set; }

        /// <summary>
        /// ProductID
        /// </summary>
        public string ProductID { get; private set; }

        /// <summary>
        /// ListOrder
        /// </summary>
        public int? ListOrder { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CategoryProductAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CategoryProductAssignment()
        {
        }

        private CategoryProductAssignment(string CategoryID, string ProductID, int? ListOrder)
        {
            
            this.CategoryID = CategoryID;
            
            this.ProductID = ProductID;
            
            this.ListOrder = ListOrder;
            
        }

        /// <summary>
        /// Returns builder of CategoryProductAssignment.
        /// </summary>
        /// <returns>CategoryProductAssignmentBuilder</returns>
        public static CategoryProductAssignmentBuilder Builder()
        {
            return new CategoryProductAssignmentBuilder();
        }

        /// <summary>
        /// Returns CategoryProductAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CategoryProductAssignmentBuilder</returns>
        public CategoryProductAssignmentBuilder With()
        {
            return Builder()
                .CategoryID(CategoryID)
                .ProductID(ProductID)
                .ListOrder(ListOrder);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CategoryProductAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CategoryProductAssignment.
        /// </summary>
        /// <param name="left">Compared (CategoryProductAssignment</param>
        /// <param name="right">Compared (CategoryProductAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CategoryProductAssignment left, CategoryProductAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CategoryProductAssignment.
        /// </summary>
        /// <param name="left">Compared (CategoryProductAssignment</param>
        /// <param name="right">Compared (CategoryProductAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CategoryProductAssignment left, CategoryProductAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CategoryProductAssignment.
        /// </summary>
        public sealed class CategoryProductAssignmentBuilder
        {
            private string _CategoryID;
            private string _ProductID;
            private int? _ListOrder;

            internal CategoryProductAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CategoryProductAssignment.CategoryID property.
            /// </summary>
            /// <param name="value">CategoryID</param>
            public CategoryProductAssignmentBuilder CategoryID(string value)
            {
                _CategoryID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CategoryProductAssignment.ProductID property.
            /// </summary>
            /// <param name="value">ProductID</param>
            public CategoryProductAssignmentBuilder ProductID(string value)
            {
                _ProductID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CategoryProductAssignment.ListOrder property.
            /// </summary>
            /// <param name="value">ListOrder</param>
            public CategoryProductAssignmentBuilder ListOrder(int? value)
            {
                _ListOrder = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CategoryProductAssignment.
            /// </summary>
            /// <returns>CategoryProductAssignment</returns>
            public CategoryProductAssignment Build()
            {
                Validate();
                return new CategoryProductAssignment(
                    CategoryID: _CategoryID,
                    ProductID: _ProductID,
                    ListOrder: _ListOrder
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
