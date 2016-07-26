using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// CreditCard
    /// </summary>
    public sealed class CreditCard:  IEquatable<CreditCard>
    { 
        /// <summary>
        /// ID
        /// </summary>
        public string ID { get; private set; }

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
        /// Use CreditCard.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CreditCard()
        {
        }

        private CreditCard(string ID, string Token, string CardType, string PartialAccountNumber, string CardholderName, ZonedDateTime? ExpirationDate, Object Xp)
        {
            
            this.ID = ID;
            
            this.Token = Token;
            
            this.CardType = CardType;
            
            this.PartialAccountNumber = PartialAccountNumber;
            
            this.CardholderName = CardholderName;
            
            this.ExpirationDate = ExpirationDate;
            
            this.Xp = Xp;
            
        }

        /// <summary>
        /// Returns builder of CreditCard.
        /// </summary>
        /// <returns>CreditCardBuilder</returns>
        public static CreditCardBuilder Builder()
        {
            return new CreditCardBuilder();
        }

        /// <summary>
        /// Returns CreditCardBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CreditCardBuilder</returns>
        public CreditCardBuilder With()
        {
            return Builder()
                .ID(ID)
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

        public bool Equals(CreditCard other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CreditCard.
        /// </summary>
        /// <param name="left">Compared (CreditCard</param>
        /// <param name="right">Compared (CreditCard</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CreditCard left, CreditCard right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CreditCard.
        /// </summary>
        /// <param name="left">Compared (CreditCard</param>
        /// <param name="right">Compared (CreditCard</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CreditCard left, CreditCard right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CreditCard.
        /// </summary>
        public sealed class CreditCardBuilder
        {
            private string _ID;
            private string _Token;
            private string _CardType;
            private string _PartialAccountNumber;
            private string _CardholderName;
            private ZonedDateTime? _ExpirationDate;
            private Object _Xp;

            internal CreditCardBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CreditCard.ID property.
            /// </summary>
            /// <param name="value">ID</param>
            public CreditCardBuilder ID(string value)
            {
                _ID = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.Token property.
            /// </summary>
            /// <param name="value">Token</param>
            public CreditCardBuilder Token(string value)
            {
                _Token = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.CardType property.
            /// </summary>
            /// <param name="value">CardType</param>
            public CreditCardBuilder CardType(string value)
            {
                _CardType = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.PartialAccountNumber property.
            /// </summary>
            /// <param name="value">PartialAccountNumber</param>
            public CreditCardBuilder PartialAccountNumber(string value)
            {
                _PartialAccountNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.CardholderName property.
            /// </summary>
            /// <param name="value">CardholderName</param>
            public CreditCardBuilder CardholderName(string value)
            {
                _CardholderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.ExpirationDate property.
            /// </summary>
            /// <param name="value">ExpirationDate</param>
            public CreditCardBuilder ExpirationDate(ZonedDateTime? value)
            {
                _ExpirationDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for CreditCard.Xp property.
            /// </summary>
            /// <param name="value">Xp</param>
            public CreditCardBuilder Xp(Object value)
            {
                _Xp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CreditCard.
            /// </summary>
            /// <returns>CreditCard</returns>
            public CreditCard Build()
            {
                Validate();
                return new CreditCard(
                    ID: _ID,
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
