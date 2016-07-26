using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Category
    /// </summary>
    public sealed class Category:  IEquatable<Category>
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
        /// ListOrder
        /// </summary>
        public int? ListOrder { get; private set; }

        /// <summary>
        /// Active
        /// </summary>
        public bool? Active { get; private set; }

        /// <summary>
        /// ParentID
        /// </summary>
        public string ParentID { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Category.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Category()
        {
        }

        private Category(string ID, string Name, string Description, Object Xp, int? ListOrder, bool? Active, string ParentID)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Xp = Xp;
            
            this.ListOrder = ListOrder;
            
            this.Active = Active;
            
            this.ParentID = ParentID;
            
        }

        /// <summary>
        /// Returns builder of Category.
        /// </summary>
        /// <returns>CategoryBuilder</returns>
        public static CategoryBuilder Builder()
        {
            return new CategoryBuilder();
        }

        /// <summary>
        /// Returns CategoryBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CategoryBuilder</returns>
        public CategoryBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Description(Description)
                .Xp(Xp)
                .ListOrder(ListOrder)
                .Active(Active)
                .ParentID(ParentID);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Category other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Category.
        /// </summary>
        /// <param name="left">Compared (Category</param>
        /// <param name="right">Compared (Category</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Category left, Category right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Category.
        /// </summary>
        /// <param name="left">Compared (Category</param>
        /// <param name="right">Compared (Category</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Category left, Category right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Category.
        /// </summary>
        public sealed class CategoryBuilder
        {
            private string _ID;
            private string _Name;
            private string _Description;
            private Object _Xp;
            private int? _ListOrder;
            private bool? _Active;
            private string _ParentID;

            internal CategoryBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Category.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public CategoryBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public CategoryBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public CategoryBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public CategoryBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.ListOrder property.
            /// </summary>
            /// <param name="value">ListOrder</param>
            public CategoryBuilder ListOrder(int? value)
            {
                _ListOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public CategoryBuilder Active(bool? value)
            {
                _Active = value;
                return this;
            }

            /// <summary>
            /// Sets value for Category.ParentID property.
            /// </summary>
            /// <param name="value">ParentID</param>
            public CategoryBuilder ParentID(string value)
            {
                _ParentID = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Category.
            /// </summary>
            /// <returns>Category</returns>
            public Category Build()
            {
                Validate();
                return new Category(
                    ID: _ID,
                    Name: _Name,
                    Description: _Description,
                    Xp: _Xp,
                    ListOrder: _ListOrder,
                    Active: _Active,
                    ParentID: _ParentID
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
