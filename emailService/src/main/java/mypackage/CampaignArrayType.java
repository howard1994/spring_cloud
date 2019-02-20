
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This datatype represents a sequence/array of CampaignType's.
 * 
 * <p>CampaignArrayType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CampaignArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaign" type="{http://dmdelivery.com/webservice/}CampaignType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignArrayType", propOrder = {
    "campaign"
})
public class CampaignArrayType {

    protected List<CampaignType> campaign;

    /**
     * Gets the value of the campaign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignType }
     * 
     * 
     */
    public List<CampaignType> getCampaign() {
        if (campaign == null) {
            campaign = new ArrayList<CampaignType>();
        }
        return this.campaign;
    }

}
