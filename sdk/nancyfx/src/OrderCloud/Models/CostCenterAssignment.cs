using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CostCenterAssignment
    /// </summary>
    public sealed class CostCenterAssignment:  IEquatable<CostCenterAssignment>
    { 
        /// <summary>
        /// CostCenterID
        /// </summary>
        public string CostCenterID { get; private set; }

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
        /// Use CostCenterAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CostCenterAssignment()
        {
        }

        private CostCenterAssignment(string CostCenterID, string UserID, string UserGroupID)
        {
            
            this.CostCenterID = CostCenterID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
        }

        /// <summary>
        /// Returns builder of CostCenterAssignment.
        /// </summary>
        /// <returns>CostCenterAssignmentBuilder</returns>
        public static CostCenterAssignmentBuilder Builder()
        {
            return new CostCenterAssignmentBuilder();
        }

        /// <summary>
        /// Returns CostCenterAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CostCenterAssignmentBuilder</returns>
        public CostCenterAssignmentBuilder With()
        {
            return Builder()
                .CostCenterID(CostCenterID)
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

        public bool Equals(CostCenterAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CostCenterAssignment.
        /// </summary>
        /// <param name="left">Compared (CostCenterAssignment</param>
        /// <param name="right">Compared (CostCenterAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CostCenterAssignment left, CostCenterAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CostCenterAssignment.
        /// </summary>
        /// <param name="left">Compared (CostCenterAssignment</param>
        /// <param name="right">Compared (CostCenterAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CostCenterAssignment left, CostCenterAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CostCenterAssignment.
        /// </summary>
        public sealed class CostCenterAssignmentBuilder
        {
            private string _CostCenterID;
            private string _UserID;
            private string _UserGroupID;

            internal CostCenterAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CostCenterAssignment.CostCenterID property.
            /// </summary>
            /// <param name="value">CostCenterID</param>
            public CostCenterAssignmentBuilder CostCenterID(string value)
            {
                _CostCenterID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CostCenterAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public CostCenterAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CostCenterAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public CostCenterAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CostCenterAssignment.
            /// </summary>
            /// <returns>CostCenterAssignment</returns>
            public CostCenterAssignment Build()
            {
                Validate();
                return new CostCenterAssignment(
                    CostCenterID: _CostCenterID,
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
