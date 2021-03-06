//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.26 at 12:20:41 PM MST 
//


package net.opengis.wms_130;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="WMS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opengis.net/wms}Title"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Abstract" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}KeywordList" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}OnlineResource"/>
 *         &lt;element ref="{http://www.opengis.net/wms}ContactInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}Fees" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}AccessConstraints" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}LayerLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MaxWidth" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}MaxHeight" minOccurs="0"/>
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
    "name",
    "title",
    "_abstract",
    "keywordList",
    "onlineResource",
    "contactInformation",
    "fees",
    "accessConstraints",
    "layerLimit",
    "maxWidth",
    "maxHeight"
})
@XmlRootElement(name = "Service")
public class Service {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "KeywordList")
    protected KeywordList keywordList;
    @XmlElement(name = "OnlineResource", required = true)
    protected OnlineResource onlineResource;
    @XmlElement(name = "ContactInformation")
    protected ContactInformation contactInformation;
    @XmlElement(name = "Fees")
    protected String fees;
    @XmlElement(name = "AccessConstraints")
    protected String accessConstraints;
    @XmlElement(name = "LayerLimit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger layerLimit;
    @XmlElement(name = "MaxWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxWidth;
    @XmlElement(name = "MaxHeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxHeight;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the keywordList property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordList }
     *     
     */
    public KeywordList getKeywordList() {
        return keywordList;
    }

    /**
     * Sets the value of the keywordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordList }
     *     
     */
    public void setKeywordList(KeywordList value) {
        this.keywordList = value;
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResource }
     *     
     */
    public OnlineResource getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResource }
     *     
     */
    public void setOnlineResource(OnlineResource value) {
        this.onlineResource = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the accessConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessConstraints() {
        return accessConstraints;
    }

    /**
     * Sets the value of the accessConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessConstraints(String value) {
        this.accessConstraints = value;
    }

    /**
     * Gets the value of the layerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLayerLimit() {
        return layerLimit;
    }

    /**
     * Sets the value of the layerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLayerLimit(BigInteger value) {
        this.layerLimit = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxWidth(BigInteger value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxHeight(BigInteger value) {
        this.maxHeight = value;
    }

}
