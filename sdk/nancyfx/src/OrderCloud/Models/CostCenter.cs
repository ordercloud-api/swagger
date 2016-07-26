using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CostCenter
    /// </summary>
    public sealed class CostCenter:  IEquatable<CostCenter>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CostCenter.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CostCenter()
        {
        }

        private CostCenter(string ID, string Name, string Description, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of CostCenter.
        /// </summary>
        /// <returns>CostCenterBuilder</returns>
        public static CostCenterBuilder Builder()
        {
            return new CostCenterBuilder();
        }

        /// <summary>
        /// Returns CostCenterBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CostCenterBuilder</returns>
        public CostCenterBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Description(Description)
                .Xp(Xp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CostCenter other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CostCenter.
        /// </summary>
        /// <param name="left">Compared (CostCenter</param>
        /// <param name="right">Compared (CostCenter</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CostCenter left, CostCenter right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CostCenter.
        /// </summary>
        /// <param name="left">Compared (CostCenter</param>
        /// <param name="right">Compared (CostCenter</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CostCenter left, CostCenter right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CostCenter.
        /// </summary>
        public sealed class CostCenterBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private Object _Xp;

            internal CostCenterBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CostCenter.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public CostCenterBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CostCenter.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public CostCenterBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for CostCenter.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public CostCenterBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for CostCenter.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public CostCenterBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CostCenter.
            /// </summary>
            /// <returns>CostCenter</returns>
            public CostCenter Build()
            {
                Validate();
                return new CostCenter(
                    ID: _ID,
                    Name: _Name,
                    Description: _Description,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
