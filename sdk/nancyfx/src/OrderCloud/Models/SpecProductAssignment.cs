using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// SpecProductAssignment
    /// </summary>
    public sealed class SpecProductAssignment:  IEquatable<SpecProductAssignment>
    { 
        /// <summary>
        /// SpecID
        /// </summary>
        public string SpecID { get; private set; }

        /// <summary>
        /// ProductID
        /// </summary>
        public string ProductID { get; private set; }

        /// <summary>
        /// DefinesVariant
        /// </summary>
        public bool? DefinesVariant { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SpecProductAssignment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SpecProductAssignment()
        {
        }

        private SpecProductAssignment(string SpecID, string ProductID, bool? DefinesVariant)
        {
            
            this.SpecID = SpecID;
            
            this.ProductID = ProductID;
            
            this.DefinesVariant = DefinesVariant;
            
        }

        /// <summary>
        /// Returns builder of SpecProductAssignment.
        /// </summary>
        /// <returns>SpecProductAssignmentBuilder</returns>
        public static SpecProductAssignmentBuilder Builder()
        {
            return new SpecProductAssignmentBuilder();
        }

        /// <summary>
        /// Returns SpecProductAssignmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SpecProductAssignmentBuilder</returns>
        public SpecProductAssignmentBuilder With()
        {
            return Builder()
                .SpecID(SpecID)
                .ProductID(ProductID)
                .DefinesVariant(DefinesVariant);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SpecProductAssignment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SpecProductAssignment.
        /// </summary>
        /// <param name="left">Compared (SpecProductAssignment</param>
        /// <param name="right">Compared (SpecProductAssignment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SpecProductAssignment left, SpecProductAssignment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SpecProductAssignment.
        /// </summary>
        /// <param name="left">Compared (SpecProductAssignment</param>
        /// <param name="right">Compared (SpecProductAssignment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SpecProductAssignment left, SpecProductAssignment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SpecProductAssignment.
        /// </summary>
        public sealed class SpecProductAssignmentBuilder
        {
            private string _SpecID;
            private string _ProductID;
            private bool? _DefinesVariant;

            internal SpecProductAssignmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SpecProductAssignment.SpecID property.
            /// </summary>
            /// <param name="value">SpecID</param>
            public SpecProductAssignmentBuilder SpecID(string value)
            {
                _SpecID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecProductAssignment.ProductID property.
            /// </summary>
            /// <param name="value">ProductID</param>
            public SpecProductAssignmentBuilder ProductID(string value)
            {
                _ProductID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpecProductAssignment.DefinesVariant property.
            /// </summary>
            /// <param name="value">DefinesVariant</param>
            public SpecProductAssignmentBuilder DefinesVariant(bool? value)
            {
                _DefinesVariant = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SpecProductAssignment.
            /// </summary>
            /// <returns>SpecProductAssignment</returns>
            public SpecProductAssignment Build()
            {
                Validate();
                return new SpecProductAssignment(
                    SpecID: _SpecID,
                    ProductID: _ProductID,
                    DefinesVariant: _DefinesVariant
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
