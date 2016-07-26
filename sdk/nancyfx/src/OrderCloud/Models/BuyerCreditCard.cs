using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// BuyerCreditCard
    /// </summary>
    public sealed class BuyerCreditCard:  IEquatable<BuyerCreditCard>
    { 
        /// <summary>
        /// Token
        /// </summary>
        public string Token { get; private set; }

        /// <summary>
        /// CardType
        /// </summary>
        public string CardType { get; private set; }

        /// <summary>
        /// PartialAccountNumber
        /// </summary>
        public string PartialAccountNumber { get; private set; }

        /// <summary>
        /// CardholderName
        /// </summary>
        public string CardholderName { get; private set; }

        /// <summary>
        /// ExpirationDate
        /// </summary>
        public ZonedDateTime? ExpirationDate { get; private set; }

        /// <summary>
        /// Xp
        /// </summary>
        public Object Xp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BuyerCreditCard.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BuyerCreditCard()
        {
        }

        private BuyerCreditCard(string Token, string CardType, string PartialAccountNumber, string CardholderName, ZonedDateTime? ExpirationDate, Object Xp)
        {
            
            this.Token = Token;
            
            this.CardType = CardType;
            
            this.PartialAccountNumber = PartialAccountNumber;
            
            this.CardholderName = CardholderName;
            
            this.ExpirationDate = ExpirationDate;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of BuyerCreditCard.
        /// </summary>
        /// <returns>BuyerCreditCardBuilder</returns>
        public static BuyerCreditCardBuilder Builder()
        {
            return new BuyerCreditCardBuilder();
        }

        /// <summary>
        /// Returns BuyerCreditCardBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BuyerCreditCardBuilder</returns>
        public BuyerCreditCardBuilder With()
        {
            return Builder()
                .Token(Token)
                .CardType(CardType)
                .PartialAccountNumber(PartialAccountNumber)
                .CardholderName(CardholderName)
                .ExpirationDate(ExpirationDate)
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

        public bool Equals(BuyerCreditCard other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BuyerCreditCard.
        /// </summary>
        /// <param name="left">Compared (BuyerCreditCard</param>
        /// <param name="right">Compared (BuyerCreditCard</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BuyerCreditCard left, BuyerCreditCard right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BuyerCreditCard.
        /// </summary>
        /// <param name="left">Compared (BuyerCreditCard</param>
        /// <param name="right">Compared (BuyerCreditCard</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BuyerCreditCard left, BuyerCreditCard right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BuyerCreditCard.
        /// </summary>
        public sealed class BuyerCreditCardBuilder
        {
            private string _Token;
            private string _CardType;
            private string _PartialAccountNumber;
            private string _CardholderName;
            private ZonedDateTime? _ExpirationDate;
            private Object _Xp;

            internal BuyerCreditCardBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.Token property.
            /// </summary>
            /// <param name="value">Token</param>
            public BuyerCreditCardBuilder Token(string value)
            {
                _Token = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.CardType property.
            /// </summary>
            /// <param name="value">CardType</param>
            public BuyerCreditCardBuilder CardType(string value)
            {
                _CardType = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.PartialAccountNumber property.
            /// </summary>
            /// <param name="value">PartialAccountNumber</param>
            public BuyerCreditCardBuilder PartialAccountNumber(string value)
            {
                _PartialAccountNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.CardholderName property.
            /// </summary>
            /// <param name="value">CardholderName</param>
            public BuyerCreditCardBuilder CardholderName(string value)
            {
                _CardholderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.ExpirationDate property.
            /// </summary>
            /// <param name="value">ExpirationDate</param>
            public BuyerCreditCardBuilder ExpirationDate(ZonedDateTime? value)
            {
                _ExpirationDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for BuyerCreditCard.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public BuyerCreditCardBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BuyerCreditCard.
            /// </summary>
            /// <returns>BuyerCreditCard</returns>
            public BuyerCreditCard Build()
            {
                Validate();
                return new BuyerCreditCard(
                    Token: _Token,
                    CardType: _CardType,
                    PartialAccountNumber: _PartialAccountNumber,
                    CardholderName: _CardholderName,
                    ExpirationDate: _ExpirationDate,
                    Xp: _Xp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
