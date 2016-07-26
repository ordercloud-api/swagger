using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// PaymentTransaction
    /// </summary>
    public sealed class PaymentTransaction:  IEquatable<PaymentTransaction>
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
        /// DateExecuted
        /// </summary>
        public ZonedDateTime? DateExecuted { get; private set; }

        /// <summary>
        /// Amount
        /// </summary>
        public decimal? Amount { get; private set; }

        /// <summary>
        /// Succeeded
        /// </summary>
        public bool? Succeeded { get; private set; }

        /// <summary>
        /// ResultCode
        /// </summary>
        public string ResultCode { get; private set; }

        /// <summary>
        /// ResultMessage
        /// </summary>
        public string ResultMessage { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PaymentTransaction.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PaymentTransaction()
        {
        }

        private PaymentTransaction(string ID, string Type, ZonedDateTime? DateExecuted, decimal? Amount, bool? Succeeded, string ResultCode, string ResultMessage, Object Xp)
        {
            
            this.ID = ID;
            
            this.Type = Type;
            
            this.DateExecuted = DateExecuted;
            
            this.Amount = Amount;
            
            this.Succeeded = Succeeded;
            
            this.ResultCode = ResultCode;
            
            this.ResultMessage = ResultMessage;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of PaymentTransaction.
        /// </summary>
        /// <returns>PaymentTransactionBuilder</returns>
        public static PaymentTransactionBuilder Builder()
        {
            return new PaymentTransactionBuilder();
        }

        /// <summary>
        /// Returns PaymentTransactionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PaymentTransactionBuilder</returns>
        public PaymentTransactionBuilder With()
        {
            return Builder()
                .ID(ID)
                .Type(Type)
                .DateExecuted(DateExecuted)
                .Amount(Amount)
                .Succeeded(Succeeded)
                .ResultCode(ResultCode)
                .ResultMessage(ResultMessage)
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

        public bool Equals(PaymentTransaction other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PaymentTransaction.
        /// </summary>
        /// <param name="left">Compared (PaymentTransaction</param>
        /// <param name="right">Compared (PaymentTransaction</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PaymentTransaction left, PaymentTransaction right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PaymentTransaction.
        /// </summary>
        /// <param name="left">Compared (PaymentTransaction</param>
        /// <param name="right">Compared (PaymentTransaction</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PaymentTransaction left, PaymentTransaction right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PaymentTransaction.
        /// </summary>
        public sealed class PaymentTransactionBuilder
        {
            private string _ID;
            private string _Type;
            private ZonedDateTime? _DateExecuted;
            private decimal? _Amount;
            private bool? _Succeeded;
            private string _ResultCode;
            private string _ResultMessage;
            private Object _Xp;

            internal PaymentTransactionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PaymentTransaction.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public PaymentTransactionBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public PaymentTransactionBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.DateExecuted property.
            /// </summary>
            /// <param name="value">DateExecuted</param>
            public PaymentTransactionBuilder DateExecuted(ZonedDateTime? value)
            {
                _DateExecuted = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.Amount property.
            /// </summary>
            /// <param name="value">Amount</param>
            public PaymentTransactionBuilder Amount(decimal? value)
            {
                _Amount = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.Succeeded property.
            /// </summary>
            /// <param name="value">Succeeded</param>
            public PaymentTransactionBuilder Succeeded(bool? value)
            {
                _Succeeded = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.ResultCode property.
            /// </summary>
            /// <param name="value">ResultCode</param>
            public PaymentTransactionBuilder ResultCode(string value)
            {
                _ResultCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.ResultMessage property.
            /// </summary>
            /// <param name="value">ResultMessage</param>
            public PaymentTransactionBuilder ResultMessage(string value)
            {
                _ResultMessage = value;
                return this;
            }

            /// <summary>
            /// Sets value for PaymentTransaction.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public PaymentTransactionBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PaymentTransaction.
            /// </summary>
            /// <returns>PaymentTransaction</returns>
            public PaymentTransaction Build()
            {
                Validate();
                return new PaymentTransaction(
                    ID: _ID,
                    Type: _Type,
                    DateExecuted: _DateExecuted,
                    Amount: _Amount,
                    Succeeded: _Succeeded,
                    ResultCode: _ResultCode,
                    ResultMessage: _ResultMessage,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
