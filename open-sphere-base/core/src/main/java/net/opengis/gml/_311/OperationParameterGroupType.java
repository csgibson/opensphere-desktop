//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.26 at 02:04:22 PM MST 
//


package net.opengis.gml._311;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The definition of a group of parameters used by an operation method. This complexType is expected to be used or extended for all applicable operation methods, without defining operation-method-specialized element names.  
 * 
 * <p>Java class for OperationParameterGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationParameterGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationParameterGroupBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}groupID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}maximumOccurs" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}includesParameter" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterGroupType", propOrder = {
    "groupID",
    "remarks",
    "maximumOccurs",
    "includesParameter"
})
public class OperationParameterGroupType
    extends OperationParameterGroupBaseType
{

    protected List<IdentifierType> groupID;
    protected StringOrRefType remarks;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumOccurs;
    @XmlElement(required = true)
    protected List<AbstractGeneralOperationParameterRefType> includesParameter;

    /**
     * Set of alternative identifications of this operation parameter group. The first groupID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the groupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getGroupID() {
        if (groupID == null) {
            groupID = new ArrayList<IdentifierType>();
        }
        return this.groupID;
    }

    /**
     * Comments on or information about this operation parameter group, including source information. 
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRemarks(StringOrRefType value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the maximumOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumOccurs() {
        return maximumOccurs;
    }

    /**
     * Sets the value of the maximumOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumOccurs(BigInteger value) {
        this.maximumOccurs = value;
    }

    /**
     * Unordered list of associations to the set of operation parameters that are members of this group. Gets the value of the includesParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGeneralOperationParameterRefType }
     * 
     * 
     */
    public List<AbstractGeneralOperationParameterRefType> getIncludesParameter() {
        if (includesParameter == null) {
            includesParameter = new ArrayList<AbstractGeneralOperationParameterRefType>();
        }
        return this.includesParameter;
    }

}
