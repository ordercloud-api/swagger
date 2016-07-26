using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// UserGroup
    /// </summary>
    public sealed class UserGroup:  IEquatable<UserGroup>
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
        /// Use UserGroup.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserGroup()
        {
        }

        private UserGroup(string ID, string Name, string Description, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of UserGroup.
        /// </summary>
        /// <returns>UserGroupBuilder</returns>
        public static UserGroupBuilder Builder()
        {
            return new UserGroupBuilder();
        }

        /// <summary>
        /// Returns UserGroupBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserGroupBuilder</returns>
        public UserGroupBuilder With()
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

        public bool Equals(UserGroup other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserGroup.
        /// </summary>
        /// <param name="left">Compared (UserGroup</param>
        /// <param name="right">Compared (UserGroup</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserGroup left, UserGroup right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserGroup.
        /// </summary>
        /// <param name="left">Compared (UserGroup</param>
        /// <param name="right">Compared (UserGroup</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserGroup left, UserGroup right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserGroup.
        /// </summary>
        public sealed class UserGroupBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private Object _Xp;

            internal UserGroupBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserGroup.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public UserGroupBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public UserGroupBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public UserGroupBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public UserGroupBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserGroup.
            /// </summary>
            /// <returns>UserGroup</returns>
            public UserGroup Build()
            {
                Validate();
                return new UserGroup(
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
