using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PromotionAssignment
    /// </summary>
    public sealed class PromotionAssignment:  IEquatable<PromotionAssignment>
    { 
        /// <summary>
        /// PromotionID
        /// </summary>
        public string PromotionID { get; private set; }

        /// <summary>
        /// BuyerID
        /// </summary>
        public string BuyerID { get; private set; }

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
        /// Use PromotionAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PromotionAssignment()
        {
        }

        private PromotionAssignment(string PromotionID, string BuyerID, string UserID, string UserGroupID)
        {
            
            this.PromotionID = PromotionID;
            
            this.BuyerID = BuyerID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
        }

        /// <summary>
        /// Returns builder of PromotionAssignment.
        /// </summary>
        /// <returns>PromotionAssignmentBuilder</returns>
        public static PromotionAssignmentBuilder Builder()
        {
            return new PromotionAssignmentBuilder();
        }

        /// <summary>
        /// Returns PromotionAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PromotionAssignmentBuilder</returns>
        public PromotionAssignmentBuilder With()
        {
            return Builder()
                .PromotionID(PromotionID)
                .BuyerID(BuyerID)
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

        public bool Equals(PromotionAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PromotionAssignment.
        /// </summary>
        /// <param name="left">Compared (PromotionAssignment</param>
        /// <param name="right">Compared (PromotionAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PromotionAssignment left, PromotionAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PromotionAssignment.
        /// </summary>
        /// <param name="left">Compared (PromotionAssignment</param>
        /// <param name="right">Compared (PromotionAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PromotionAssignment left, PromotionAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PromotionAssignment.
        /// </summary>
        public sealed class PromotionAssignmentBuilder
        {
            private string _PromotionID;
            private string _BuyerID;
            private string _UserID;
            private string _UserGroupID;

            internal PromotionAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PromotionAssignment.PromotionID property.
            /// </summary>
            /// <param name="value">PromotionID</param>
            public PromotionAssignmentBuilder PromotionID(string value)
            {
                _PromotionID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PromotionAssignment.BuyerID property.
            /// </summary>
            /// <param name="value">BuyerID</param>
            public PromotionAssignmentBuilder BuyerID(string value)
            {
                _BuyerID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PromotionAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public PromotionAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PromotionAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public PromotionAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PromotionAssignment.
            /// </summary>
            /// <returns>PromotionAssignment</returns>
            public PromotionAssignment Build()
            {
                Validate();
                return new PromotionAssignment(
                    PromotionID: _PromotionID,
                    BuyerID: _BuyerID,
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
