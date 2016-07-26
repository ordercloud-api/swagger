using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// Payment
    /// </summary>
    public sealed class Payment:  IEquatable<Payment>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// CreditCardID
        /// </summary>
        public string CreditCardID { get; private set; }

        /// <summary>
        /// SpendingAccountID
        /// </summary>
        public string SpendingAccountID { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Amount
        /// </summary>
        public decimal? Amount { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Payment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Payment()
        {
        }

        private Payment(string ID, string Type, string CreditCardID, string SpendingAccountID, string Description, decimal? Amount, Object Xp)
        {
            
            this.ID = ID;
            
            this.Type = Type;
            
            this.CreditCardID = CreditCardID;
            
            this.SpendingAccountID = SpendingAccountID;
            
            this.Description = Description;
            
            this.Amount = Amount;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of Payment.
        /// </summary>
        /// <returns>PaymentBuilder</returns>
        public static PaymentBuilder Builder()
        {
            return new PaymentBuilder();
        }

        /// <summary>
        /// Returns PaymentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PaymentBuilder</returns>
        public PaymentBuilder With()
        {
            return Builder()
                .ID(ID)
                .Type(Type)
                .CreditCardID(CreditCardID)
                .SpendingAccountID(SpendingAccountID)
                .Description(Description)
                .Amount(Amount)
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

        public bool Equals(Payment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Payment.
        /// </summary>
        /// <param name="left">Compared (Payment</param>
        /// <param name="right">Compared (Payment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Payment left, Payment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Payment.
        /// </summary>
        /// <param name="left">Compared (Payment</param>
        /// <param name="right">Compared (Payment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Payment left, Payment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Payment.
        /// </summary>
        public sealed class PaymentBuilder
        {
            private string _ID;
            private string _Type;
            private string _CreditCardID;
            private string _SpendingAccountID;
            private string _Description;
            private decimal? _Amount;
            private Object _Xp;

            internal PaymentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Payment.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public PaymentBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public PaymentBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.CreditCardID property.
            /// </summary>
            /// <param name="value">CreditCardID</param>
            public PaymentBuilder CreditCardID(string value)
            {
                _CreditCardID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.SpendingAccountID property.
            /// </summary>
            /// <param name="value">SpendingAccountID</param>
            public PaymentBuilder SpendingAccountID(string value)
            {
                _SpendingAccountID = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public PaymentBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.Amount property.
            /// </summary>
            /// <param name="value">Amount</param>
            public PaymentBuilder Amount(decimal? value)
            {
                _Amount = value;
                return this;
            }

            /// <summary>
            /// Sets value for Payment.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public PaymentBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Payment.
            /// </summary>
            /// <returns>Payment</returns>
            public Payment Build()
            {
                Validate();
                return new Payment(
                    ID: _ID,
                    Type: _Type,
                    CreditCardID: _CreditCardID,
                    SpendingAccountID: _SpendingAccountID,
                    Description: _Description,
                    Amount: _Amount,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
