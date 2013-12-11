//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.11 at 11:48:30 PM CET 
//


package net.ivoa.xml.votable.v1;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *     Added in Version 1.2: INFO for diagnostics
 *   
 * 
 * <p>Java class for Table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTION" type="{http://www.ivoa.net/xml/VOTable/v1.2}anyTEXT" minOccurs="0"/>
 *         &lt;element name="INFO" type="{http://www.ivoa.net/xml/VOTable/v1.2}Info" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="FIELD" type="{http://www.ivoa.net/xml/VOTable/v1.2}Field"/>
 *           &lt;element name="PARAM" type="{http://www.ivoa.net/xml/VOTable/v1.2}Param"/>
 *           &lt;element name="GROUP" type="{http://www.ivoa.net/xml/VOTable/v1.2}Group"/>
 *         &lt;/choice>
 *         &lt;element name="LINK" type="{http://www.ivoa.net/xml/VOTable/v1.2}Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.ivoa.net/xml/VOTable/v1.2}Data" minOccurs="0"/>
 *         &lt;element name="INFO" type="{http://www.ivoa.net/xml/VOTable/v1.2}Info" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ucd" type="{http://www.ivoa.net/xml/VOTable/v1.2}ucdType" />
 *       &lt;attribute name="utype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nrows" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Table", propOrder = {
    "content"
})
public class Table implements Serializable {

    @XmlElementRefs({
        @XmlElementRef(name = "FIELD", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "PARAM", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "DATA", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "GROUP", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "LINK", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "DESCRIPTION", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class),
        @XmlElementRef(name = "INFO", namespace = "http://www.ivoa.net/xml/VOTable/v1.2", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ucd;
    @XmlAttribute
    protected String utype;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nrows;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "INFO" is used by two different parts of a schema. See: 
     * line 487 of file:/tmp/votable.xsd
     * line 472 of file:/tmp/votable.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Field }{@code >}
     * {@link JAXBElement }{@code <}{@link Param }{@code >}
     * {@link JAXBElement }{@code <}{@link Data }{@code >}
     * {@link JAXBElement }{@code <}{@link Group }{@code >}
     * {@link JAXBElement }{@code <}{@link Link }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyTEXT }{@code >}
     * {@link JAXBElement }{@code <}{@link Info }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

    /**
     * Gets the value of the ucd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcd() {
        return ucd;
    }

    /**
     * Sets the value of the ucd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcd(String value) {
        this.ucd = value;
    }

    /**
     * Gets the value of the utype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtype() {
        return utype;
    }

    /**
     * Sets the value of the utype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtype(String value) {
        this.utype = value;
    }

    /**
     * Gets the value of the nrows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrows() {
        return nrows;
    }

    /**
     * Sets the value of the nrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrows(BigInteger value) {
        this.nrows = value;
    }

}
