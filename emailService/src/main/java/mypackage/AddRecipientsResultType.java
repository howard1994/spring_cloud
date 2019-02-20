
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This datatype is used as a return value for adding multiple new recipients to
 *                 Webpower.
 *             
 * 
 * <p>AddRecipientsResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AddRecipientsResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OK"/>
 *               &lt;enumeration value="DUPLICATE"/>
 *               &lt;enumeration value="ERROR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="statusMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://dmdelivery.com/webservice/}RecipientResultArrayType" minOccurs="0"/>
 *         &lt;element name="duplicates" type="{http://dmdelivery.com/webservice/}RecipientResultArrayType" minOccurs="0"/>
 *         &lt;element name="successful" type="{http://dmdelivery.com/webservice/}RecipientArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRecipientsResultType", propOrder = {
    "status",
    "statusMsg",
    "errors",
    "duplicates",
    "successful"
})
public class AddRecipientsResultType {

    @XmlElement(required = true)
    protected String status;
    protected String statusMsg;
    protected RecipientResultArrayType errors;
    protected RecipientResultArrayType duplicates;
    protected RecipientArrayType successful;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡstatusMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * ����statusMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
    }

    /**
     * ��ȡerrors���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecipientResultArrayType }
     *     
     */
    public RecipientResultArrayType getErrors() {
        return errors;
    }

    /**
     * ����errors���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientResultArrayType }
     *     
     */
    public void setErrors(RecipientResultArrayType value) {
        this.errors = value;
    }

    /**
     * ��ȡduplicates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecipientResultArrayType }
     *     
     */
    public RecipientResultArrayType getDuplicates() {
        return duplicates;
    }

    /**
     * ����duplicates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientResultArrayType }
     *     
     */
    public void setDuplicates(RecipientResultArrayType value) {
        this.duplicates = value;
    }

    /**
     * ��ȡsuccessful���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecipientArrayType }
     *     
     */
    public RecipientArrayType getSuccessful() {
        return successful;
    }

    /**
     * ����successful���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientArrayType }
     *     
     */
    public void setSuccessful(RecipientArrayType value) {
        this.successful = value;
    }

}
