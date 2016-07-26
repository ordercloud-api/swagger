using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// ProductAssignment
    /// </summary>
    public sealed class ProductAssignment:  IEquatable<ProductAssignment>
    { 
        /// <summary>
        /// ProductID
        /// </summary>
        public string ProductID { get; private set; }

        /// <summary>
        /// StandardPriceScheduleID
        /// </summary>
        public string StandardPriceScheduleID { get; private set; }

        /// <summary>
        /// ReplenishmentPriceScheduleID
        /// </summary>
        public string ReplenishmentPriceScheduleID { get; private set; }

        /// <summary>
        /// UserID
        /// </summary>
        public string UserID { get; private set; }

        /// <summary>
        /// UserGroupID
        /// </summary>
        public string UserGroupID { get; private set; }

        /// <summary>
        /// BuyerID
        /// </summary>
        public string BuyerID { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProductAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProductAssignment()
        {
        }

        private ProductAssignment(string ProductID, string StandardPriceScheduleID, string ReplenishmentPriceScheduleID, string UserID, string UserGroupID, string BuyerID)
        {
            
            this.ProductID = ProductID;
            
            this.StandardPriceScheduleID = StandardPriceScheduleID;
            
            this.ReplenishmentPriceScheduleID = ReplenishmentPriceScheduleID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
            this.BuyerID = BuyerID;
            
        }

        /// <summary>
        /// Returns builder of ProductAssignment.
        /// </summary>
        /// <returns>ProductAssignmentBuilder</returns>
        public static ProductAssignmentBuilder Builder()
        {
            return new ProductAssignmentBuilder();
        }

        /// <summary>
        /// Returns ProductAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProductAssignmentBuilder</returns>
        public ProductAssignmentBuilder With()
        {
            return Builder()
                .ProductID(ProductID)
                .StandardPriceScheduleID(StandardPriceScheduleID)
                .ReplenishmentPriceScheduleID(ReplenishmentPriceScheduleID)
                .UserID(UserID)
                .UserGroupID(UserGroupID)
                .BuyerID(BuyerID);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ProductAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProductAssignment.
        /// </summary>
        /// <param name="left">Compared (ProductAssignment</param>
        /// <param name="right">Compared (ProductAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProductAssignment left, ProductAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProductAssignment.
        /// </summary>
        /// <param name="left">Compared (ProductAssignment</param>
        /// <param name="right">Compared (ProductAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProductAssignment left, ProductAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProductAssignment.
        /// </summary>
        public sealed class ProductAssignmentBuilder
        {
            private string _ProductID;
            private string _StandardPriceScheduleID;
            private string _ReplenishmentPriceScheduleID;
            private string _UserID;
            private string _UserGroupID;
            private string _BuyerID;

            internal ProductAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProductAssignment.ProductID property.
            /// </summary>
            /// <param name="value">ProductID</param>
            public ProductAssignmentBuilder ProductID(string value)
            {
                _ProductID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProductAssignment.StandardPriceScheduleID property.
            /// </summary>
            /// <param name="value">StandardPriceScheduleID</param>
            public ProductAssignmentBuilder StandardPriceScheduleID(string value)
            {
                _StandardPriceScheduleID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProductAssignment.ReplenishmentPriceScheduleID property.
            /// </summary>
            /// <param name="value">ReplenishmentPriceScheduleID</param>
            public ProductAssignmentBuilder ReplenishmentPriceScheduleID(string value)
            {
                _ReplenishmentPriceScheduleID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProductAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public ProductAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProductAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public ProductAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProductAssignment.BuyerID property.
            /// </summary>
            /// <param name="value">BuyerID</param>
            public ProductAssignmentBuilder BuyerID(string value)
            {
                _BuyerID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProductAssignment.
            /// </summary>
            /// <returns>ProductAssignment</returns>
            public ProductAssignment Build()
            {
                Validate();
                return new ProductAssignment(
                    ProductID: _ProductID,
                    StandardPriceScheduleID: _StandardPriceScheduleID,
                    ReplenishmentPriceScheduleID: _ReplenishmentPriceScheduleID,
                    UserID: _UserID,
                    UserGroupID: _UserGroupID,
                    BuyerID: _BuyerID
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
