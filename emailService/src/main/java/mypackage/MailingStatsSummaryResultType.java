
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This datatype represents a single Summary Statistics record.
 * 
 * <p>MailingStatsSummaryResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MailingStatsSummaryResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weblink">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="total_sent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_accepted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hardbounces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="softbounces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unsubscribers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suspends" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spamcomplaints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unique_opens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_renders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unique_renders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_clickthroughs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unique_clickthroughs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unique_link_clickthroughs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_conversion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unique_conversion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="click2open_rate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailingStatsSummaryResultType", propOrder = {
    "weblink",
    "totalSent",
    "totalAccepted",
    "hardbounces",
    "softbounces",
    "unsubscribers",
    "suspends",
    "spamcomplaints",
    "uniqueOpens",
    "totalRenders",
    "uniqueRenders",
    "totalClickthroughs",
    "uniqueClickthroughs",
    "uniqueLinkClickthroughs",
    "totalConversion",
    "uniqueConversion",
    "click2OpenRate"
})
public class MailingStatsSummaryResultType {

    @XmlElement(required = true)
    protected String weblink;
    @XmlElement(name = "total_sent")
    protected int totalSent;
    @XmlElement(name = "total_accepted")
    protected int totalAccepted;
    protected int hardbounces;
    protected int softbounces;
    protected int unsubscribers;
    protected int suspends;
    protected int spamcomplaints;
    @XmlElement(name = "unique_opens")
    protected int uniqueOpens;
    @XmlElement(name = "total_renders")
    protected int totalRenders;
    @XmlElement(name = "unique_renders")
    protected int uniqueRenders;
    @XmlElement(name = "total_clickthroughs")
    protected int totalClickthroughs;
    @XmlElement(name = "unique_clickthroughs")
    protected int uniqueClickthroughs;
    @XmlElement(name = "unique_link_clickthroughs")
    protected int uniqueLinkClickthroughs;
    @XmlElement(name = "total_conversion")
    protected int totalConversion;
    @XmlElement(name = "unique_conversion")
    protected int uniqueConversion;
    @XmlElement(name = "click2open_rate")
    protected float click2OpenRate;

    /**
     * ��ȡweblink���Ե�ֵ��
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
     * ����weblink���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeblink(String value) {
        this.weblink = value;
    }

    /**
     * ��ȡtotalSent���Ե�ֵ��
     * 
     */
    public int getTotalSent() {
        return totalSent;
    }

    /**
     * ����totalSent���Ե�ֵ��
     * 
     */
    public void setTotalSent(int value) {
        this.totalSent = value;
    }

    /**
     * ��ȡtotalAccepted���Ե�ֵ��
     * 
     */
    public int getTotalAccepted() {
        return totalAccepted;
    }

    /**
     * ����totalAccepted���Ե�ֵ��
     * 
     */
    public void setTotalAccepted(int value) {
        this.totalAccepted = value;
    }

    /**
     * ��ȡhardbounces���Ե�ֵ��
     * 
     */
    public int getHardbounces() {
        return hardbounces;
    }

    /**
     * ����hardbounces���Ե�ֵ��
     * 
     */
    public void setHardbounces(int value) {
        this.hardbounces = value;
    }

    /**
     * ��ȡsoftbounces���Ե�ֵ��
     * 
     */
    public int getSoftbounces() {
        return softbounces;
    }

    /**
     * ����softbounces���Ե�ֵ��
     * 
     */
    public void setSoftbounces(int value) {
        this.softbounces = value;
    }

    /**
     * ��ȡunsubscribers���Ե�ֵ��
     * 
     */
    public int getUnsubscribers() {
        return unsubscribers;
    }

    /**
     * ����unsubscribers���Ե�ֵ��
     * 
     */
    public void setUnsubscribers(int value) {
        this.unsubscribers = value;
    }

    /**
     * ��ȡsuspends���Ե�ֵ��
     * 
     */
    public int getSuspends() {
        return suspends;
    }

    /**
     * ����suspends���Ե�ֵ��
     * 
     */
    public void setSuspends(int value) {
        this.suspends = value;
    }

    /**
     * ��ȡspamcomplaints���Ե�ֵ��
     * 
     */
    public int getSpamcomplaints() {
        return spamcomplaints;
    }

    /**
     * ����spamcomplaints���Ե�ֵ��
     * 
     */
    public void setSpamcomplaints(int value) {
        this.spamcomplaints = value;
    }

    /**
     * ��ȡuniqueOpens���Ե�ֵ��
     * 
     */
    public int getUniqueOpens() {
        return uniqueOpens;
    }

    /**
     * ����uniqueOpens���Ե�ֵ��
     * 
     */
    public void setUniqueOpens(int value) {
        this.uniqueOpens = value;
    }

    /**
     * ��ȡtotalRenders���Ե�ֵ��
     * 
     */
    public int getTotalRenders() {
        return totalRenders;
    }

    /**
     * ����totalRenders���Ե�ֵ��
     * 
     */
    public void setTotalRenders(int value) {
        this.totalRenders = value;
    }

    /**
     * ��ȡuniqueRenders���Ե�ֵ��
     * 
     */
    public int getUniqueRenders() {
        return uniqueRenders;
    }

    /**
     * ����uniqueRenders���Ե�ֵ��
     * 
     */
    public void setUniqueRenders(int value) {
        this.uniqueRenders = value;
    }

    /**
     * ��ȡtotalClickthroughs���Ե�ֵ��
     * 
     */
    public int getTotalClickthroughs() {
        return totalClickthroughs;
    }

    /**
     * ����totalClickthroughs���Ե�ֵ��
     * 
     */
    public void setTotalClickthroughs(int value) {
        this.totalClickthroughs = value;
    }

    /**
     * ��ȡuniqueClickthroughs���Ե�ֵ��
     * 
     */
    public int getUniqueClickthroughs() {
        return uniqueClickthroughs;
    }

    /**
     * ����uniqueClickthroughs���Ե�ֵ��
     * 
     */
    public void setUniqueClickthroughs(int value) {
        this.uniqueClickthroughs = value;
    }

    /**
     * ��ȡuniqueLinkClickthroughs���Ե�ֵ��
     * 
     */
    public int getUniqueLinkClickthroughs() {
        return uniqueLinkClickthroughs;
    }

    /**
     * ����uniqueLinkClickthroughs���Ե�ֵ��
     * 
     */
    public void setUniqueLinkClickthroughs(int value) {
        this.uniqueLinkClickthroughs = value;
    }

    /**
     * ��ȡtotalConversion���Ե�ֵ��
     * 
     */
    public int getTotalConversion() {
        return totalConversion;
    }

    /**
     * ����totalConversion���Ե�ֵ��
     * 
     */
    public void setTotalConversion(int value) {
        this.totalConversion = value;
    }

    /**
     * ��ȡuniqueConversion���Ե�ֵ��
     * 
     */
    public int getUniqueConversion() {
        return uniqueConversion;
    }

    /**
     * ����uniqueConversion���Ե�ֵ��
     * 
     */
    public void setUniqueConversion(int value) {
        this.uniqueConversion = value;
    }

    /**
     * ��ȡclick2OpenRate���Ե�ֵ��
     * 
     */
    public float getClick2OpenRate() {
        return click2OpenRate;
    }

    /**
     * ����click2OpenRate���Ե�ֵ��
     * 
     */
    public void setClick2OpenRate(float value) {
        this.click2OpenRate = value;
    }

}
