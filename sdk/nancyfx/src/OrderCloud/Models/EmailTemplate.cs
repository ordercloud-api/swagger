using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace OrderCloud.v1.Models
{
    /// <summary>
    /// EmailTemplate
    /// </summary>
    public sealed class EmailTemplate:  IEquatable<EmailTemplate>
    { 
        /// <summary>
        /// Subject
        /// </summary>
        public string Subject { get; private set; }

        /// <summary>
        /// Body
        /// </summary>
        public string Body { get; private set; }

        /// <summary>
        /// ReplyEmail
        /// </summary>
        public string ReplyEmail { get; private set; }

        /// <summary>
        /// SendMessageType
        /// </summary>
        public bool? SendMessageType { get; private set; }

        /// <summary>
        /// EmailFormatType
        /// </summary>
        public string EmailFormatType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EmailTemplate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmailTemplate()
        {
        }

        private EmailTemplate(string Subject, string Body, string ReplyEmail, bool? SendMessageType, string EmailFormatType)
        {
            
            this.Subject = Subject;
            
            this.Body = Body;
            
            this.ReplyEmail = ReplyEmail;
            
            this.SendMessageType = SendMessageType;
            
            this.EmailFormatType = EmailFormatType;
            
        }

        /// <summary>
        /// Returns builder of EmailTemplate.
        /// </summary>
        /// <returns>EmailTemplateBuilder</returns>
        public static EmailTemplateBuilder Builder()
        {
            return new EmailTemplateBuilder();
        }

        /// <summary>
        /// Returns EmailTemplateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmailTemplateBuilder</returns>
        public EmailTemplateBuilder With()
        {
            return Builder()
                .Subject(Subject)
                .Body(Body)
                .ReplyEmail(ReplyEmail)
                .SendMessageType(SendMessageType)
                .EmailFormatType(EmailFormatType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EmailTemplate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmailTemplate.
        /// </summary>
        /// <param name="left">Compared (EmailTemplate</param>
        /// <param name="right">Compared (EmailTemplate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmailTemplate left, EmailTemplate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmailTemplate.
        /// </summary>
        /// <param name="left">Compared (EmailTemplate</param>
        /// <param name="right">Compared (EmailTemplate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmailTemplate left, EmailTemplate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmailTemplate.
        /// </summary>
        public sealed class EmailTemplateBuilder
        {
            private string _Subject;
            private string _Body;
            private string _ReplyEmail;
            private bool? _SendMessageType;
            private string _EmailFormatType;

            internal EmailTemplateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmailTemplate.Subject property.
            /// </summary>
            /// <param name="value">Subject</param>
            public EmailTemplateBuilder Subject(string value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmailTemplate.Body property.
            /// </summary>
            /// <param name="value">Body</param>
            public EmailTemplateBuilder Body(string value)
            {
                _Body = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmailTemplate.ReplyEmail property.
            /// </summary>
            /// <param name="value">ReplyEmail</param>
            public EmailTemplateBuilder ReplyEmail(string value)
            {
                _ReplyEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmailTemplate.SendMessageType property.
            /// </summary>
            /// <param name="value">SendMessageType</param>
            public EmailTemplateBuilder SendMessageType(bool? value)
            {
                _SendMessageType = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmailTemplate.EmailFormatType property.
            /// </summary>
            /// <param name="value">EmailFormatType</param>
            public EmailTemplateBuilder EmailFormatType(string value)
            {
                _EmailFormatType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmailTemplate.
            /// </summary>
            /// <returns>EmailTemplate</returns>
            public EmailTemplate Build()
            {
                Validate();
                return new EmailTemplate(
                    Subject: _Subject,
                    Body: _Body,
                    ReplyEmail: _ReplyEmail,
                    SendMessageType: _SendMessageType,
                    EmailFormatType: _EmailFormatType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
