
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This (return) datatype is used as a return-value when exporting a single
 *                 mailing.
 *             
 * 
 * <p>MailingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MailingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subject">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="preheader">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="multipart"/>
 *               &lt;enumeration value="plaintext"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lang">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="priority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="from_name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sender_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plaintext_msg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16777216"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="template_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="html_msg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="16777216"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attachment">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="optin_confirm_candidate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="history">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="65536"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="last_mod_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="last_mod_user">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="last_def_sent_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="weblink">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailingType", propOrder = {
    "id",
    "name",
    "subject",
    "preheader",
    "kind",
    "lang",
    "priority",
    "fromName",
    "senderId",
    "plaintextMsg",
    "templateId",
    "htmlMsg",
    "attachment",
    "optinConfirmCandidate",
    "history",
    "lastModDate",
    "lastModUser",
    "lastDefSentDate",
    "weblink"
})
public class MailingType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String preheader;
    @XmlElement(required = true)
    protected String kind;
    @XmlElement(required = true)
    protected String lang;
    protected int priority;
    @XmlElement(name = "from_name", required = true)
    protected String fromName;
    @XmlElement(name = "sender_id")
    protected int senderId;
    @XmlElement(name = "plaintext_msg", required = true)
    protected String plaintextMsg;
    @XmlElement(name = "template_id")
    protected Integer templateId;
    @XmlElement(name = "html_msg", required = true)
    protected String htmlMsg;
    @XmlElement(required = true)
    protected String attachment;
    @XmlElement(name = "optin_confirm_candidate")
    protected boolean optinConfirmCandidate;
    @XmlElement(required = true)
    protected String history;
    @XmlElement(name = "last_mod_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModDate;
    @XmlElement(name = "last_mod_user", required = true)
    protected String lastModUser;
    @XmlElement(name = "last_def_sent_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDefSentDate;
    @XmlElement(required = true)
    protected String weblink;

    /**
     * 获取id属性的值。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取subject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置subject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * 获取preheader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreheader() {
        return preheader;
    }

    /**
     * 设置preheader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreheader(String value) {
        this.preheader = value;
    }

    /**
     * 获取kind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置kind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * 获取lang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置lang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * 获取priority属性的值。
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * 获取fromName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * 设置fromName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * 获取senderId属性的值。
     * 
     */
    public int getSenderId() {
        return senderId;
    }

    /**
     * 设置senderId属性的值。
     * 
     */
    public void setSenderId(int value) {
        this.senderId = value;
    }

    /**
     * 获取plaintextMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaintextMsg() {
        return plaintextMsg;
    }

    /**
     * 设置plaintextMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaintextMsg(String value) {
        this.plaintextMsg = value;
    }

    /**
     * 获取templateId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * 设置templateId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateId(Integer value) {
        this.templateId = value;
    }

    /**
     * 获取htmlMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlMsg() {
        return htmlMsg;
    }

    /**
     * 设置htmlMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlMsg(String value) {
        this.htmlMsg = value;
    }

    /**
     * 获取attachment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * 设置attachment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachment(String value) {
        this.attachment = value;
    }

    /**
     * 获取optinConfirmCandidate属性的值。
     * 
     */
    public boolean isOptinConfirmCandidate() {
        return optinConfirmCandidate;
    }

    /**
     * 设置optinConfirmCandidate属性的值。
     * 
     */
    public void setOptinConfirmCandidate(boolean value) {
        this.optinConfirmCandidate = value;
    }

    /**
     * 获取history属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistory() {
        return history;
    }

    /**
     * 设置history属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistory(String value) {
        this.history = value;
    }

    /**
     * 获取lastModDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModDate() {
        return lastModDate;
    }

    /**
     * 设置lastModDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModDate(XMLGregorianCalendar value) {
        this.lastModDate = value;
    }

    /**
     * 获取lastModUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModUser() {
        return lastModUser;
    }

    /**
     * 设置lastModUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModUser(String value) {
        this.lastModUser = value;
    }

    /**
     * 获取lastDefSentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDefSentDate() {
        return lastDefSentDate;
    }

    /**
     * 设置lastDefSentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDefSentDate(XMLGregorianCalendar value) {
        this.lastDefSentDate = value;
    }

    /**
     * 获取weblink属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeblink() {
        return weblink;
    }

    /**
     * 设置weblink属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeblink(String value) {
        this.weblink = value;
    }

}
