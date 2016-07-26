using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// AddressAssignment
    /// </summary>
    public sealed class AddressAssignment:  IEquatable<AddressAssignment>
    { 
        /// <summary>
        /// AddressID
        /// </summary>
        public string AddressID { get; private set; }

        /// <summary>
        /// UserID
        /// </summary>
        public string UserID { get; private set; }

        /// <summary>
        /// UserGroupID
        /// </summary>
        public string UserGroupID { get; private set; }

        /// <summary>
        /// IsShipping
        /// </summary>
        public bool? IsShipping { get; private set; }

        /// <summary>
        /// IsBilling
        /// </summary>
        public bool? IsBilling { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressAssignment()
        {
        }

        private AddressAssignment(string AddressID, string UserID, string UserGroupID, bool? IsShipping, bool? IsBilling)
        {
            
            this.AddressID = AddressID;
            
            this.UserID = UserID;
            
            this.UserGroupID = UserGroupID;
            
            this.IsShipping = IsShipping;
            
            this.IsBilling = IsBilling;
            
        }

        /// <summary>
        /// Returns builder of AddressAssignment.
        /// </summary>
        /// <returns>AddressAssignmentBuilder</returns>
        public static AddressAssignmentBuilder Builder()
        {
            return new AddressAssignmentBuilder();
        }

        /// <summary>
        /// Returns AddressAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressAssignmentBuilder</returns>
        public AddressAssignmentBuilder With()
        {
            return Builder()
                .AddressID(AddressID)
                .UserID(UserID)
                .UserGroupID(UserGroupID)
                .IsShipping(IsShipping)
                .IsBilling(IsBilling);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddressAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressAssignment.
        /// </summary>
        /// <param name="left">Compared (AddressAssignment</param>
        /// <param name="right">Compared (AddressAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressAssignment left, AddressAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressAssignment.
        /// </summary>
        /// <param name="left">Compared (AddressAssignment</param>
        /// <param name="right">Compared (AddressAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressAssignment left, AddressAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressAssignment.
        /// </summary>
        public sealed class AddressAssignmentBuilder
        {
            private string _AddressID;
            private string _UserID;
            private string _UserGroupID;
            private bool? _IsShipping;
            private bool? _IsBilling;

            internal AddressAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressAssignment.AddressID property.
            /// </summary>
            /// <param name="value">AddressID</param>
            public AddressAssignmentBuilder AddressID(string value)
            {
                _AddressID = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressAssignment.UserID property.
            /// </summary>
            /// <param name="value">UserID</param>
            public AddressAssignmentBuilder UserID(string value)
            {
                _UserID = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressAssignment.UserGroupID property.
            /// </summary>
            /// <param name="value">UserGroupID</param>
            public AddressAssignmentBuilder UserGroupID(string value)
            {
                _UserGroupID = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressAssignment.IsShipping property.
            /// </summary>
            /// <param name="value">IsShipping</param>
            public AddressAssignmentBuilder IsShipping(bool? value)
            {
                _IsShipping = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressAssignment.IsBilling property.
            /// </summary>
            /// <param name="value">IsBilling</param>
            public AddressAssignmentBuilder IsBilling(bool? value)
            {
                _IsBilling = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressAssignment.
            /// </summary>
            /// <returns>AddressAssignment</returns>
            public AddressAssignment Build()
            {
                Validate();
                return new AddressAssignment(
                    AddressID: _AddressID,
                    UserID: _UserID,
                    UserGroupID: _UserGroupID,
                    IsShipping: _IsShipping,
                    IsBilling: _IsBilling
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
