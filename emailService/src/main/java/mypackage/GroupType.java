
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This datatype represents a recipient group. Used when retrieving groups.
 *             
 * 
 * <p>GroupType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GroupType">
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
 *         &lt;element name="is_test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_system" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remarks">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="65536"/>
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
@XmlType(name = "GroupType", propOrder = {
    "id",
    "name",
    "isTest",
    "isActive",
    "isSystem",
    "remarks"
})
public class GroupType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "is_test")
    protected boolean isTest;
    @XmlElement(name = "is_active")
    protected boolean isActive;
    @XmlElement(name = "is_system")
    protected boolean isSystem;
    @XmlElement(required = true)
    protected String remarks;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡisTest���Ե�ֵ��
     * 
     */
    public boolean isIsTest() {
        return isTest;
    }

    /**
     * ����isTest���Ե�ֵ��
     * 
     */
    public void setIsTest(boolean value) {
        this.isTest = value;
    }

    /**
     * ��ȡisActive���Ե�ֵ��
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * ����isActive���Ե�ֵ��
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * ��ȡisSystem���Ե�ֵ��
     * 
     */
    public boolean isIsSystem() {
        return isSystem;
    }

    /**
     * ����isSystem���Ե�ֵ��
     * 
     */
    public void setIsSystem(boolean value) {
        this.isSystem = value;
    }

    /**
     * ��ȡremarks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ����remarks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
