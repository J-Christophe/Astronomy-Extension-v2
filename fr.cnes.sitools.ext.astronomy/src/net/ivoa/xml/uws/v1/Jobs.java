//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.17 at 05:30:03 PM CET 
//


package net.ivoa.xml.uws.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  ISSUE - do we want to have any sort of
 *                paging or selection mechanism in case the job list gets
 *                very large? Or is that an unnecessary complication...
 *             
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobref" type="{http://www.ivoa.net/xml/UWS/v1.0}ShortJobDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobref"
})
@XmlRootElement(name = "jobs", namespace = "http://www.ivoa.net/xml/UWS/v1.0")
public class Jobs {

    @XmlElement(namespace = "http://www.ivoa.net/xml/UWS/v1.0")
    protected List<ShortJobDescription> jobref;

    /**
     * Gets the value of the jobref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortJobDescription }
     * 
     * 
     */
    public List<ShortJobDescription> getJobref() {
        if (jobref == null) {
            jobref = new ArrayList<ShortJobDescription>();
        }
        return this.jobref;
    }

}
