using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// SpendingAccount
    /// </summary>
    public sealed class SpendingAccount:  IEquatable<SpendingAccount>
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
        /// Balance
        /// </summary>
        public decimal? Balance { get; private set; }

        /// <summary>
        /// AllowAsPaymentMethod
        /// </summary>
        public bool? AllowAsPaymentMethod { get; private set; }

        /// <summary>
        /// RedemptionCode
        /// </summary>
        public string RedemptionCode { get; private set; }

        /// <summary>
        /// StartDate
        /// </summary>
        public ZonedDateTime? StartDate { get; private set; }

        /// <summary>
        /// EndDate
        /// </summary>
        public ZonedDateTime? EndDate { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SpendingAccount.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SpendingAccount()
        {
        }

        private SpendingAccount(string ID, string Name, decimal? Balance, bool? AllowAsPaymentMethod, string RedemptionCode, ZonedDateTime? StartDate, ZonedDateTime? EndDate, Object Xp)
        {
            
            this.ID = ID;
            
            this.Name = Name;
            
            this.Balance = Balance;
            
            this.AllowAsPaymentMethod = AllowAsPaymentMethod;
            
            this.RedemptionCode = RedemptionCode;
            
            this.StartDate = StartDate;
            
            this.EndDate = EndDate;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of SpendingAccount.
        /// </summary>
        /// <returns>SpendingAccountBuilder</returns>
        public static SpendingAccountBuilder Builder()
        {
            return new SpendingAccountBuilder();
        }

        /// <summary>
        /// Returns SpendingAccountBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SpendingAccountBuilder</returns>
        public SpendingAccountBuilder With()
        {
            return Builder()
                .ID(ID)
                .Name(Name)
                .Balance(Balance)
                .AllowAsPaymentMethod(AllowAsPaymentMethod)
                .RedemptionCode(RedemptionCode)
                .StartDate(StartDate)
                .EndDate(EndDate)
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

        public bool Equals(SpendingAccount other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SpendingAccount.
        /// </summary>
        /// <param name="left">Compared (SpendingAccount</param>
        /// <param name="right">Compared (SpendingAccount</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SpendingAccount left, SpendingAccount right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SpendingAccount.
        /// </summary>
        /// <param name="left">Compared (SpendingAccount</param>
        /// <param name="right">Compared (SpendingAccount</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SpendingAccount left, SpendingAccount right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SpendingAccount.
        /// </summary>
        public sealed class SpendingAccountBuilder
        {
            private string _ID;
            private string _Name;
            private decimal? _Balance;
            private bool? _AllowAsPaymentMethod;
            private string _RedemptionCode;
            private ZonedDateTime? _StartDate;
            private ZonedDateTime? _EndDate;
            private Object _Xp;

            internal SpendingAccountBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SpendingAccount.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public SpendingAccountBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public SpendingAccountBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.Balance property.
            /// </summary>
            /// <param name="value">Balance</param>
            public SpendingAccountBuilder Balance(decimal? value)
            {
                _Balance = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.AllowAsPaymentMethod property.
            /// </summary>
            /// <param name="value">AllowAsPaymentMethod</param>
            public SpendingAccountBuilder AllowAsPaymentMethod(bool? value)
            {
                _AllowAsPaymentMethod = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.RedemptionCode property.
            /// </summary>
            /// <param name="value">RedemptionCode</param>
            public SpendingAccountBuilder RedemptionCode(string value)
            {
                _RedemptionCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.StartDate property.
            /// </summary>
            /// <param name="value">StartDate</param>
            public SpendingAccountBuilder StartDate(ZonedDateTime? value)
            {
                _StartDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.EndDate property.
            /// </summary>
            /// <param name="value">EndDate</param>
            public SpendingAccountBuilder EndDate(ZonedDateTime? value)
            {
                _EndDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for SpendingAccount.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public SpendingAccountBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SpendingAccount.
            /// </summary>
            /// <returns>SpendingAccount</returns>
            public SpendingAccount Build()
            {
                Validate();
                return new SpendingAccount(
                    ID: _ID,
                    Name: _Name,
                    Balance: _Balance,
                    AllowAsPaymentMethod: _AllowAsPaymentMethod,
                    RedemptionCode: _RedemptionCode,
                    StartDate: _StartDate,
                    EndDate: _EndDate,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
