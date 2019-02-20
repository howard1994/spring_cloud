<?xml version="1.0" encoding="utf-8"?>
<?xml-stylesheet type="text/xsl" href="/x/wsdl-viewer/dmdelivery.xsl"?>
<wsdl:definitions name="WebpowerSoapAPI"
                  targetNamespace="http://dmdelivery.com/webservice/"
                  xmlns:typens="http://dmdelivery.com/webservice/"
                  xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                  xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                  xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                  xmlns="http://schemas.xmlsoap.org/wsdl/">

    <wsdl:types>
        <xsd:schema targetNamespace="http://dmdelivery.com/webservice/"
            xmlns="http://www.w3.org/2001/XMLSchema"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema">

<xsd:complexType name="ActionResultType">
    <xsd:annotation>
        <xsd:documentation>This datatype is used as a return value for adding a new action (for example:
            sending a mail).
        </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
        <xsd:element name="status" minOccurs="1">
            <xsd:annotation>
                <xsd:documentation>'OK' (action was accepted successfully).</xsd:documentation>
            </xsd:annotation>
            <xsd:simpleType>
                <xsd:restriction base="xsd:string">
                    <xsd:enumeration value="OK"/>
                </xsd:restriction>
            </xsd:simpleType>
        </xsd:element>
    </xsd:sequence>
</xsd:complexType>

    <xsd:complexType name="AddRecipientsResultType">
        <xsd:annotation>
            <xsd:documentation>This datatype is used as a return value for adding multiple new recipients to
                Webpower.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="status" minOccurs="1" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Either 'OK' (*all* recipients added successfully), 'DUPLICATE' (1 or more
                        duplicate recipients) or 'ERROR' (an error occured).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:enumeration value="OK"/>
                        <xsd:enumeration value="DUPLICATE"/>
                        <xsd:enumeration value="ERROR"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="statusMsg" type="xsd:string" minOccurs="0" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Only available when status == 'ERROR'. Contains the error message.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="errors" type="typens:RecipientResultArrayType" minOccurs="0" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Only available when adding one or more recipients failed. Contains the
                        recipient-records that failed.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="duplicates" type="typens:RecipientResultArrayType" minOccurs="0" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Only available when adding one or more recipients caused a duplicate.
                        Contains the recipient-records that are duplicate.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="successful" type="typens:RecipientArrayType" minOccurs="0" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Contains the successfully inserted recipient-records, including the ID
                        that Webpower assigned to them.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>
    <xsd:complexType name="ArrayOfIntType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of integers.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="int" type="xsd:int" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="ArrayOfStringType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of strings.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="string" type="xsd:string" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="BrandArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of BrandType's.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="brand" type="typens:BrandType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="BrandType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a Webpower brand.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="id" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The database ID of the brand.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the brand.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="CampaignArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of CampaignType's.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="campaign" type="typens:CampaignType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="CampaignType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a campaign.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="id" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The database ID of the campaign.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="brand_id" type="xsd:int" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>The database ID of the brand this campaign belongs to.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the campaign.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="lang" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The languages used in the campaign. Two character ISO codes, comma
                        separated. Ex: nl,en.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="2"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="is_overall" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the campaign is an overall campaign.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="is_active" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the campaign is an active campaign.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="has_soap_api" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the campaign has a SOAP webservice.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="create_date" type="xsd:date" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The create-date of the campaign.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="remarks" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>The remarks for the campaign.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="0"/>
                        <xsd:maxLength value="65536"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="GroupArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of GroupType's.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="group" type="typens:GroupType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="GroupType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a recipient group. Used when retrieving groups.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="id" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The database ID of the group.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the group.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="is_test" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the group is a test group.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="is_active" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the group is active.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="is_system" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the group is a system group.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="remarks" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The remarks for the group.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="0"/>
                        <xsd:maxLength value="65536"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="MailingArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of MailingType's.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="mailing" type="typens:MailingType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="MailingType">
        <xsd:annotation>
            <xsd:documentation>This (return) datatype is used as a return-value when exporting a single
                mailing.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="id" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The database id of the mailing.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="subject" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The subject of the mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="preheader" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The preheader of the mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="kind" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The kind of mailing. Either 'multipart' or 'plaintext'.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:enumeration value="multipart"/>
                        <xsd:enumeration value="plaintext"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="lang" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The language of the mailing. Two digit ISO code (nl, en, de etc).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:length value="2"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="priority" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The mailing's priority (1-5, 3 = normal).</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:int">
                        <xsd:minInclusive value="1"/>
                        <xsd:maxInclusive value="5"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="from_name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The mailing's from name.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="sender_id" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The database id of the sender address used.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="plaintext_msg" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The plaintext message.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="16777216"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="template_id" type="xsd:int" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>The id of the template used. Unavailable if mailing is not based on a
                        template.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="html_msg" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The HTML message.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="16777216"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="attachment" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the attachment.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="optin_confirm_candidate" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not this mailing can be used as a confirmation mail after a
                        new subscriber has signed up. Also determines whether or not this mailing may be shown
                        in the mailing_archive and last_mailing plugins.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="history" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The history of the mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="65536"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="last_mod_date" type="xsd:dateTime" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The date this mailing was last modified.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="last_mod_user" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The user who last modified the mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="last_def_sent_date" type="xsd:dateTime" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>The date the mailing was last sent definitively. Unavailable if not sent
                        definitively yet.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="weblink" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The url for this mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="MailingStatsSummaryResultType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a single Summary Statistics record.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="weblink" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The url (weblink) for this mailing.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="total_sent" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of emails sent.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="total_accepted" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of emails sent minus hard- and soft bounces.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="hardbounces" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of hard bounces.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="softbounces" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of soft bounces.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unsubscribers" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of unsubscribers.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="suspends" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of temporary unsubscribers.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="spamcomplaints" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of spamcomplaints.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unique_opens" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of unique recipients who opened the mailing.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="total_renders" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The total number of email renders.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unique_renders" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The unique number of email renders.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="total_clickthroughs" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The total number of click-throughs.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unique_clickthroughs" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of unique recipients who clicked through.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unique_link_clickthroughs" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of different links clicked by unique recipients.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="total_conversion" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The total number of conversion hits.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="unique_conversion" type="xsd:int" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The number of unique recipients who caused conversion.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="click2open_rate" type="xsd:float" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Number of Unique Click-Throughs divided by Unique Email Opens.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="NewGroupType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a recipient group. Used when creating a new group.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="name" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The name of the group.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="80"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="is_test" type="xsd:boolean" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Whether or not the group is a test group.</xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="remarks" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>Optional remarks for the group.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="0"/>
                        <xsd:maxLength value="65536"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="NewRecipientArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of NewRecipientType's.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="recipients" type="typens:NewRecipientType" minOccurs="1" maxOccurs="1000"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="NewRecipientType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a recipient. It consists of a number of name/value
                pairs. Use 'getRecipientFields' to find out what field names you should use. Used when adding a
                new recipient.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="fields" type="typens:RecipientNameValuePairType" minOccurs="1" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecipientArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of RecipientType's.</xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="recipients" type="typens:RecipientType" minOccurs="1" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecipientNameValuePairType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a name/value pair, a combination of a Webpower field
                name and field value. When adding a recipient, fields not known to Webpower will be ignored
                and empty required fields will fail the request.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="name" minOccurs="1" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The Webpower database field name</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="value" minOccurs="1" maxOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The value for the Webpower field. Depending on the field type, the
                        string might be converted to a date or an integer. If the value is longer than the
                        maximum length in the database, the value will be truncated.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="0"/>
                        <xsd:maxLength value="65536"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecipientResultArrayType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a sequence/array of RecipientResultType's.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="recipient" type="typens:RecipientResultType" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecipientResultType">
        <xsd:annotation>
            <xsd:documentation>This generic datatype is used as a return-value when adding multiple
                recipients.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="fields" type="typens:RecipientNameValuePairType" minOccurs="1" maxOccurs="unbounded"/>
            <xsd:element name="DMDmessage" minOccurs="1" maxOccurs="1">
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="255"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecipientType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a recipient. It consists of a number of name/value
                pairs. Use 'getRecipientFields' to find out what field names you can expect. Used when
                retrieving recipients.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="id" type="xsd:int" minOccurs="1" maxOccurs="1"/>
            <xsd:element name="fields" type="typens:RecipientNameValuePairType" minOccurs="1" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="RecordResultType">
        <xsd:annotation>
            <xsd:documentation>This datatype is used as a return value for adding a new record (for example:
                group or recipient) to Webpower.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="status" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>Either 'OK' (record added successfully), 'DUPLICATE' (duplicate record)
                        or 'ERROR' (an error occured).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:enumeration value="OK"/>
                        <xsd:enumeration value="DUPLICATE"/>
                        <xsd:enumeration value="ERROR"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="statusMsg" type="xsd:string" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>Only available when status = 'ERROR'. Contains the error message.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="id" type="xsd:int" minOccurs="0">
                <xsd:annotation>
                    <xsd:documentation>Only available when status = 'OK' or 'DUPLICATE'. Contains the database
                        ID for the record.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="WebpowerLoginType">
        <xsd:annotation>
            <xsd:documentation>This datatype represents a Webpower login, an object containing a username and
                a password.
            </xsd:documentation>
        </xsd:annotation>
        <xsd:sequence>
            <xsd:element name="username" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The username to login with. Must be an existing user for this Webpower
                        environment.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="24"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
            <xsd:element name="password" minOccurs="1">
                <xsd:annotation>
                    <xsd:documentation>The password to login with.</xsd:documentation>
                </xsd:annotation>
                <xsd:simpleType>
                    <xsd:restriction base="xsd:string">
                        <xsd:minLength value="1"/>
                        <xsd:maxLength value="24"/>
                    </xsd:restriction>
                </xsd:simpleType>
            </xsd:element>
        </xsd:sequence>
    </xsd:complexType>


        </xsd:schema>
    </wsdl:types>

    <wsdl:message name="checkHealth_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType" />
    </wsdl:message>
    <wsdl:message name="checkHealth_out">
        <wsdl:part name="checkHealth_result" type="xsd:boolean" />
    </wsdl:message>

    <wsdl:message name="getBrands_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
    </wsdl:message>
    <wsdl:message name="getBrands_out">
        <wsdl:part name="getBrands_result" type="typens:BrandArrayType"/>
    </wsdl:message>

    <wsdl:message name="getCampaigns_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
    </wsdl:message>
    <wsdl:message name="getCampaigns_out">
        <wsdl:part name="getCampaigns_result" type="typens:CampaignArrayType"/>
    </wsdl:message>

    <wsdl:message name="sendSingleMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingID" type="xsd:int"/>
        <wsdl:part name="recipientID" type="xsd:int"/>
    </wsdl:message>
    <wsdl:message name="sendSingleMailing_out">
        <wsdl:part name="sendSingleMailing_result" type="xsd:boolean"/>
    </wsdl:message>

    <wsdl:message name="sendMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingID" type="xsd:int"/>
        <wsdl:part name="isTest" type="xsd:boolean"/>
        <wsdl:part name="resultsEmail" type="xsd:string"/>
        <wsdl:part name="groupIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="filterIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="langs" type="typens:ArrayOfStringType"/>
        <wsdl:part name="ADprefixDomains" type="xsd:string"/>
        <wsdl:part name="callbackUrl" type="xsd:string"/>
        <wsdl:part name="excludedGroupIDs" type="typens:ArrayOfIntType"/>
    </wsdl:message>
    <wsdl:message name="sendMailing_out">
        <wsdl:part name="sendMailing_result" type="typens:ActionResultType"/>
    </wsdl:message>

    <wsdl:message name="createMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingName" type="xsd:string"/>
        <wsdl:part name="lang" type="xsd:string"/>
        <wsdl:part name="subject" type="xsd:string"/>
        <wsdl:part name="fromName" type="xsd:string"/>
        <wsdl:part name="senderID" type="xsd:int"/>
        <wsdl:part name="html" type="xsd:string"/>
        <wsdl:part name="preheader" type="xsd:string"/>
    </wsdl:message>
    <wsdl:message name="createMailing_out">
        <wsdl:part name="createMailing_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="slurpMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingName" type="xsd:string"/>
        <wsdl:part name="lang" type="xsd:string"/>
        <wsdl:part name="subject" type="xsd:string"/>
        <wsdl:part name="fromName" type="xsd:string"/>
        <wsdl:part name="senderID" type="xsd:int"/>
        <wsdl:part name="url" type="xsd:string"/>
        <wsdl:part name="checkTimestamp" type="xsd:boolean"/>
        <wsdl:part name="preheader" type="xsd:string"/>
    </wsdl:message>
    <wsdl:message name="slurpMailing_out">
        <wsdl:part name="slurpMailing_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="getMailings_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="limit" type="xsd:int"/>
        <wsdl:part name="definitiveOnly" type="xsd:boolean"/>
    </wsdl:message>
    <wsdl:message name="getMailings_out">
        <wsdl:part name="getMailings_result" type="typens:MailingArrayType"/>
    </wsdl:message>

    <wsdl:message name="getMailingStatsSummary_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailing" type="xsd:int"/>
    </wsdl:message>
    <wsdl:message name="getMailingStatsSummary_out">
        <wsdl:part name="getMailingStatsSummary_result" type="typens:MailingStatsSummaryResultType"/>
    </wsdl:message>

    <wsdl:message name="getGroups_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
    </wsdl:message>
    <wsdl:message name="getGroups_out">
        <wsdl:part name="getGroups_result" type="typens:GroupArrayType"/>
    </wsdl:message>

    <wsdl:message name="deleteMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingID" type="xsd:int"/>
    </wsdl:message>
    <wsdl:message name="deleteMailing_out">
        <wsdl:part name="deleteMailing_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="addGroup_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="group" type="typens:NewGroupType"/>
    </wsdl:message>
    <wsdl:message name="addGroup_out">
        <wsdl:part name="addGroup_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="deleteGroup_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="groupID" type="xsd:int"/>
    </wsdl:message>
    <wsdl:message name="deleteGroup_out">
        <wsdl:part name="deleteGroup_result" type="xsd:int"/>
    </wsdl:message>

    <wsdl:message name="addRecipient_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="groupIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="recipientData" type="typens:NewRecipientType"/>
        <wsdl:part name="addDuplisToGroups" type="xsd:boolean"/>
        <wsdl:part name="overwrite" type="xsd:boolean"/>
    </wsdl:message>
    <wsdl:message name="addRecipient_out">
        <wsdl:part name="addRecipient_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="addRecipients_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="groupIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="recipientDatas" type="typens:NewRecipientArrayType"/>
        <wsdl:part name="addDuplisToGroups" type="xsd:boolean"/>
        <wsdl:part name="overwrite" type="xsd:boolean"/>
    </wsdl:message>
    <wsdl:message name="addRecipients_out">
        <wsdl:part name="addRecipients_result" type="typens:AddRecipientsResultType"/>
    </wsdl:message>

    <wsdl:message name="addRecipientsSendMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="mailingID" type="xsd:int"/>
        <wsdl:part name="groupIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="recipientDatas" type="typens:NewRecipientArrayType"/>
        <wsdl:part name="addDuplisToGroups" type="xsd:boolean"/>
        <wsdl:part name="overwrite" type="xsd:boolean"/>
    </wsdl:message>
    <wsdl:message name="addRecipientsSendMailing_out">
        <wsdl:part name="addRecipientsSendMailing_result" type="typens:AddRecipientsResultType"/>
    </wsdl:message>

    <wsdl:message name="importRemoteCSV_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="groupID" type="xsd:int"/>
        <wsdl:part name="csvURL" type="xsd:string"/>
        <wsdl:part name="csvCharset" type="xsd:string"/>
        <wsdl:part name="csvFieldSep" type="xsd:string"/>
        <wsdl:part name="csvEnclosure" type="xsd:string"/>
        <wsdl:part name="addDuplisToGroups" type="xsd:boolean"/>
        <wsdl:part name="overwrite" type="xsd:boolean"/>
        <wsdl:part name="callbackUrl" type="xsd:string"/>
    </wsdl:message>
    <wsdl:message name="importRemoteCSV_out">
        <wsdl:part name="importRemoteCSV_result" type="typens:RecordResultType"/>
    </wsdl:message>

    <wsdl:message name="importRemoteCSVSendMailing_in">
        <wsdl:part name="login" type="typens:WebpowerLoginType"/>
        <wsdl:part name="campaignID" type="xsd:int"/>
        <wsdl:part name="groupID" type="xsd:int"/>
        <wsdl:part name="csvURL" type="xsd:string"/>
        <wsdl:part name="csvCharset" type="xsd:string"/>
        <wsdl:part name="csvFieldSep" type="xsd:string"/>
        <wsdl:part name="csvEnclosure" type="xsd:string"/>
        <wsdl:part name="addDuplisToGroups" type="xsd:boolean"/>
        <wsdl:part name="overwrite" type="xsd:boolean"/>
        <wsdl:part name="mailingID" type="xsd:int"/>
        <wsdl:part name="resultsEmail" type="xsd:string"/>
        <wsdl:part name="filterIDs" type="typens:ArrayOfIntType"/>
        <wsdl:part name="langs" type="typens:ArrayOfStringType"/>
        <wsdl:part name="ADprefixDomains" type="xsd:string"/>
        <wsdl:part name="callbackUrl" type="xsd:string"/>
    </wsdl:message>
    <wsdl:message name="importRemoteCSVSendMailing_out">
        <wsdl:part name="importRemoteCSVSendMailing_result" type="typens:RecordResultType"/>
    </wsdl:message>


    <wsdl:portType name="WebpowerSoapAPIPort">
    <wsdl:operation name="checkHealth">
        <wsdl:documentation>
            Check the health of Webpower's webservice.
            Specifically: check whether the webservice is available (http(s) access), and the database is up and
            responsive.
            Required credentials: none
            @param login: Webpower login object.
            @returns: true, when health is okay.
        </wsdl:documentation>
        <wsdl:input message="typens:checkHealth_in" />
        <wsdl:output message="typens:checkHealth_out" />
    </wsdl:operation>

    <wsdl:operation name="getBrands">
        <wsdl:documentation>
            Retrieve all brands from Webpower.
            Required credentials: 'export' privilege for area 'Brands'
            @param login: Webpower login object.
            @returns: An array of all brands in the Webpower environment.
        </wsdl:documentation>
        <wsdl:input message="typens:getBrands_in"/>
        <wsdl:output message="typens:getBrands_out"/>
    </wsdl:operation>

    <wsdl:operation name="getCampaigns">
        <wsdl:documentation>
            Retrieve all campaigns from Webpower.
            Required credentials: 'export' privilege for area 'Campaigns'
            @param login: Webpower login object.
            @returns: An array of all campaigns in the Webpower environment.
        </wsdl:documentation>
        <wsdl:input message="typens:getCampaigns_in"/>
        <wsdl:output message="typens:getCampaigns_out"/>
    </wsdl:operation>

    <wsdl:operation name="sendSingleMailing">
        <wsdl:documentation>
            Send a mailing to a single recipient. Mainly used for (un)subscribe confirmations etc.
            Of emails sent through this function, no statistics will be registered.
            Do not use this function to send many emails to many different recipients!
            Required credentials: access to area 'Send mailing'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingID: The database ID of the mailing to send.
            @param recipientID: The database ID of the recipient to send to. Can be found via getRecipientsByMatch.
            @returns: true
        </wsdl:documentation>
        <wsdl:input message="typens:sendSingleMailing_in"/>
        <wsdl:output message="typens:sendSingleMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="sendMailing">
        <wsdl:documentation>
            Bulk-send a mailing.
            Required credentials: access to area 'Send mailing'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingID: The database ID of the mailing to send.
            @param isTest: Use true for test batch, false for definitive batch.
            @param resultsEmail: The email address of the person who should receive logfile.
            @param groupIDs: Array of (database IDs of) groups to send the mailing to. Provide at least one group.
            @param filterIDs: The database IDs of the filters to use for matching recipients.
            @param langs: An array of languages to send the mailing to. Ex: ('en', 'nl').
            @param ADprefixDomains: Optional and for China only: A comma-separated string of domains that need an
            (AD) prefix. For example: *163.com,*126.com,yeah.net,188.com.
            @param callbackUrl: An (optional) url Webpower will call after the mailing has been sent.
            You can use the following variables in this URL, which Webpower will replace:
            - &#123;$DMDcid&#125; The campaign id
            - &#123;$DMDmid&#125; The mailing id
            - &#123;$nrRecipients&#125; The number of recipients in the batch
            - &#123;$nrSent&#125; The number of emails actually sent
            @param excludedGroupIDs: Array of (database IDs of) groups to not send the mailing to.
            @returns: status 'OK'
        </wsdl:documentation>
        <wsdl:input message="typens:sendMailing_in"/>
        <wsdl:output message="typens:sendMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="createMailing">
        <wsdl:documentation>
            Create a mailing from scratch, providing raw HTML.
            The plaintext-message is inherited from the campaign's default plaintext message.
            Required credentials: 'insert' privilege for area 'Mailings'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingName: The name to store the mailing as (must be unique!).
            @param lang: The ISO-lang code for the mailing. Ex: 'nl', 'en', etc.
            @param subject: The default subject of the mailing. Can be overwritten in the HTML to fetch.
            @param fromName: The from name.
            @param senderID: The database ID of the sender address. Use 0 for campaign's default sender address.
            @param html: The mailing's HTML.
            @param preheader: The preheader of the mailing.
            @returns: The database ID of the mailing that was created.
        </wsdl:documentation>
        <wsdl:input message="typens:createMailing_in"/>
        <wsdl:output message="typens:createMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="slurpMailing">
        <wsdl:documentation>
            Create a mailing from a URL.
            Required credentials: 'insert' privilege for area 'Mailings'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingName: The name to store the mailing as (must be unique!).
            @param lang: The ISO-lang code for the mailing. Ex: 'nl', 'en', etc.
            @param subject: The default subject of the mailing. Can be overwritten in the HTML to fetch.
            @param fromName: The from name.
            @param senderID: The database ID of the sender address. Use 0 for campaign's default sender address.
            @param url: The url where the mailing HTML (or a ZIP file) can be fetched from.
            @param checkTimestamp: Whether or not to check the HTML for a &lt;!--DMdeliveryTimestamp--&gt; tag.
            Ignored for ZIP files.
            @param preheader: The preheader of the mailing.
            @returns: The database ID of the mailing that was created.
        </wsdl:documentation>
        <wsdl:input message="typens:slurpMailing_in"/>
        <wsdl:output message="typens:slurpMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="getMailings">
        <wsdl:documentation>
            Retrieve all mailings from a Webpower campaign. Mailings are returned from new to old (newest on top).
            Required credentials: 'export' privilege for area 'Mailings'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param limit: indicates the number of mailings to retrieve. Use 0 to retrieve *all* mailings.
            @param definitiveOnly: Whether or not to only return definitively sent mailings.
            @returns: An array of all mailings in the campaign.
        </wsdl:documentation>
        <wsdl:input message="typens:getMailings_in"/>
        <wsdl:output message="typens:getMailings_out"/>
    </wsdl:operation>

    <wsdl:operation name="getMailingStatsSummary">
        <wsdl:documentation>
            Retrieve summarized statistics for a mailing sent. Mailing must be sent in order to be able to do this.
            Required credentials: access to area 'Statistics'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingID: The database ID of the mailing to fetch the summary for.
            @returns: An array containing summary stats info (sent, bounces, unsubscribers, opens, clicks,
            conversion etc).
        </wsdl:documentation>
        <wsdl:input message="typens:getMailingStatsSummary_in"/>
        <wsdl:output message="typens:getMailingStatsSummary_out"/>
    </wsdl:operation>

    <wsdl:operation name="getGroups">
        <wsdl:documentation>
            Retrieve all groups from a Webpower campaign.
            Required credentials: 'export' privilege for area 'Groups'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @returns: An array of all groups in the campaign.
        </wsdl:documentation>
        <wsdl:input message="typens:getGroups_in"/>
        <wsdl:output message="typens:getGroups_out"/>
    </wsdl:operation>

    <wsdl:operation name="deleteMailing">
        <wsdl:documentation>
            Delete a mailing from a campaign.
            Required credentials: 'delete' privilege for area 'Mailings'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingID: The database ID of the mailing to delete.
            @returns: 'OK' or 'ERROR'
        </wsdl:documentation>
        <wsdl:input message="typens:deleteMailing_in"/>
        <wsdl:output message="typens:deleteMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="addGroup">
        <wsdl:documentation>
            Add a new group to this Webpower campaign.
            Required credentials: 'insert' privilege for area 'Groups'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param group: The characteristics of the group to add.
            @returns: The database ID of the newly created group.
        </wsdl:documentation>
        <wsdl:input message="typens:addGroup_in"/>
        <wsdl:output message="typens:addGroup_out"/>
    </wsdl:operation>

    <wsdl:operation name="deleteGroup">
        <wsdl:documentation>
            Flush all recipients from a recipient group, then delete the group.
            The recipients are 'disconnected' from the group, not physically deleted.
            Afterwards, the group will no longer exist.
            Required credentials: 'delete' privilege for area 'Groups'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param groupID: The database ID of the group to delete.
            @returns: Number of groups (0 or 1) actually deleted.
        </wsdl:documentation>
        <wsdl:input message="typens:deleteGroup_in"/>
        <wsdl:output message="typens:deleteGroup_out"/>
    </wsdl:operation>

    <wsdl:operation name="addRecipient">
        <wsdl:documentation>
            Add a new recipient to a Webpower campaign.
            Required credentials: 'insert' privilege for area 'Recipients'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param groupIDs: An array of groups (database IDs) to make the recipient a member of. Provide at least
            one group. If this array *only* contains the ID of the Opt-in group (60), *and* this is a non-existing
            recipient, the opt-in confirmation email will be sent to the recipient.
            @param recipientData: An associative array (key: name of field, value: value of field) containing
            recipient data.
            @param addDuplisToGroup: Whether or not to add this recipient to the groups, when the recipient is in
            the database already.
            @param overwrite: In case the recipient already exists, whether or not to overwrite the known recipient
            data with the new data provided.
            @returns: The database ID of the newly created recipient.
        </wsdl:documentation>
        <wsdl:input message="typens:addRecipient_in"/>
        <wsdl:output message="typens:addRecipient_out"/>
    </wsdl:operation>

    <wsdl:operation name="addRecipients">
        <wsdl:documentation>
            Add multiple new recipients to Webpower (max 1000 at once).
            Required credentials: 'insert' privilege for area 'Recipients'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param groupIDs: An array of groups (database IDs) to make the recipients a member of. Provide at least
            one group.
            @param recipientDatas: An array of associative arrays (key: name of field, value: value of field)
            containing recipient data.
            @param addDuplisToGroup: Whether or not to add this recipient to the groups, when the recipient is in
            the database already.
            @param overwrite: In case a recipient already exists, whether or not to overwrite the known recipient
            data with the new data provided.
            @returns: Complex datatype, containing all successfully inserted records (including the ID assigned by
            Webpower), duplicates and/or errors.
        </wsdl:documentation>
        <wsdl:input message="typens:addRecipients_in"/>
        <wsdl:output message="typens:addRecipients_out"/>
    </wsdl:operation>

    <wsdl:operation name="addRecipientsSendMailing">
        <wsdl:documentation>
            Import recipients (max 1000 at once), while sending a (definitive) mailing to them.
            Required credentials: 'insert' privilege for area 'Recipients' AND access to area 'Send mailing'
            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param mailingID: The database ID of the mailing to send.
            @param groupIDs: An array of groups (database IDs) to make the recipients a member of. Provide at least
            one group.
            @param recipientDatas: An array of associative arrays (key: name of field, value: value of field)
            containing recipient data.
            @param addDuplisToGroup: Whether or not to add this recipient to the groups, when the recipient is in
            the database already.
            @param overwrite: In case a recipient already exists, whether or not to overwrite the known recipient
            data with the new data provided.
            @returns: Complex datatype, containing all duplicates and/or errors.
        </wsdl:documentation>
        <wsdl:input message="typens:addRecipientsSendMailing_in"/>
        <wsdl:output message="typens:addRecipientsSendMailing_out"/>
    </wsdl:operation>

    <wsdl:operation name="importRemoteCSV">
        <wsdl:documentation>
            Import a remotely located CSV or ZIP file, containing recipient info, into Webpower.
            A ZIP file must contain only one file with the extension .csv.
            Supports http, https, ftp, sftp, ftps and scp protocols.
            Required credentials: 'import' privilege for area 'Recipients'
            Errors and Duplicates are uploaded back to the same location the CSV was downloaded from.
            For example, if this is the CSV file:
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv
            Then errors and duplicates will be available here when the import has finished:
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv.errors
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv.duplis
            The 'callbackUrl' argument is used to let you know when the import is finished.
            This can be an email address: An email is sent to this address when import is finished.
            This can be a URL: The URL is fetched when import is finished. The URL may contain the following
            placeholders: {$DMDcid}, {$nrLines}, {$nrDuplicates} and {$nrErrors}

            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param groupID: The ID of the group to import the recipients into.
            @param csvURL: The URL of the CSV file. Examples:
            - http://username:password@somewhere.server.com:80/recipients.csv
            - ftp://username:password@somewhere.server.com/incoming/recipients.csv
            - sftp://username:password@somewhere.server.com/root/csvs/recipients.csv
            @param csvCharset: The character set of the CSV file. For example: utf-8, iso-8859-1, gb18030
            @param csvFieldSep: The field separator character used in the CSV file.
            @param csvEnclosure: The enclosure character used in the CSV file.
            @param addDuplisToGroup: Whether or not to add this recipient to the groups, when the recipient is in
            the database already.
            @param overwrite: In case a recipient already exists, whether or not to overwrite the known recipient
            data with the new data provided.
            @param callbackUrl: Either an email address or a URL. Will be emailed/called when import is done.
            @returns: 'OK', when remote file could be found or 'ERROR' if not.
        </wsdl:documentation>
        <wsdl:input message="typens:importRemoteCSV_in"/>
        <wsdl:output message="typens:importRemoteCSV_out"/>
    </wsdl:operation>

    <wsdl:operation name="importRemoteCSVSendMailing">
        <wsdl:documentation>
            Import a remotely located CSV or ZIP file, containing recipient info, into Webpower.
            A ZIP file must contain only one file with the extension .csv.
            Send a mailing to this group (optionally applying filter/language) when import is finished.
            Supports http, https, ftp, sftp, ftps and scp protocols.
            Required credentials: 'import' privilege for area 'Recipients' and access to area 'Send mailing'
            Errors and Duplicates are uploaded back to the same location the CSV was downloaded from.
            For example, if this is the CSV file:
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv
            Then errors and duplicates will be available here when the import has finished:
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv.errors
            - ftp://username:password@somewhere.server.com:80/incoming/recipients.csv.duplis

            @param login: Webpower login object.
            @param campaignID: The database ID of the campaign to work with.
            @param groupID: The ID of the group to import the recipients into.
            @param csvURL: The URL of the CSV file. Examples:
            - http://username:password@somewhere.server.com:80/recipients.csv
            - ftp://username:password@somewhere.server.com/incoming/recipients.csv
            - sftp://username:password@somewhere.server.com/root/csvs/recipients.csv
            @param csvCharset: The character set of the CSV file. For example: utf-8, iso-8859-1, gb18030
            @param csvFieldSep: The field separator character used in the CSV file.
            @param csvEnclosure: The enclosure character used in the CSV file.
            @param addDuplisToGroup: Whether or not to add this recipient to the groups, when the recipient is in
            the database already.
            @param overwrite: In case a recipient already exists, whether or not to overwrite the known recipient
            data with the new data provided.
            @param mailingID: The database ID of the mailing to send.
            @param resultsEmail: The email address of the person who should receive logfile.
            @param filterIDs: The database IDs of the filters to use for matching recipients.
            @param langs: An array of languages to send the mailing to. Ex: ('en', 'nl').
            @param ADprefixDomains: Optional and for China only: A comma-separated string of domains that need an
            (AD) prefix. For example: *163.com,*126.com,yeah.net,188.com.
            @param callbackUrl: An (optional) url Webpower will call after the mailing has been sent.
            You can use the following variables in this URL, which Webpower will replace:
            - &#123;$DMDcid&#125; The campaign id
            - &#123;$DMDmid&#125; The mailing id
            - &#123;$nrRecipients&#125; The number of recipients in the batch
            - &#123;$nrSent&#125; The number of emails actually sent
            @returns: status 'OK'
        </wsdl:documentation>
        <wsdl:input message="typens:importRemoteCSVSendMailing_in"/>
        <wsdl:output message="typens:importRemoteCSVSendMailing_out"/>
    </wsdl:operation>

    </wsdl:portType>

    <wsdl:binding name="WebpowerSoapAPIBinding" type="typens:WebpowerSoapAPIPort">
        <soap:binding style="rpc" transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="checkHealth">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="getBrands">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="getCampaigns">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="sendSingleMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="sendMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="createMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="slurpMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="getMailings">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="getMailingStatsSummary">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="getGroups">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="deleteMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="addGroup">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="deleteGroup">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="addRecipient">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="addRecipients">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="addRecipientsSendMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="importRemoteCSV">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

<wsdl:operation name="importRemoteCSVSendMailing">
    <soap:operation soapAction="urn:WebpowerAction"/>
    <wsdl:input>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:input>
    <wsdl:output>
        <soap:body use="literal" namespace="http://dmdelivery.com/webservice/"/>
    </wsdl:output>
</wsdl:operation>

    </wsdl:binding>

    <!-- Endpoint for the webpower SOAP API -->
    <wsdl:service name="WebpowerSoapAPI">
        <wsdl:documentation>
            This is the webpower SOAP webservice.

            In order to be able to use this webservice, you need to have a login for webpower. A login consists of a
            username and a password. Each SOAP call in the webservice needs this username and password for access!
            Please inquire with the webpower administrator for a login.
        </wsdl:documentation>

        <wsdl:port name="WebpowerSoapAPIPort" binding="typens:WebpowerSoapAPIBinding">
            <soap:address location="https://unicemall.webpower.eu/x/soap-v5.1/server.php"/>
        </wsdl:port>
    </wsdl:service>

</wsdl:definitions>
