//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.30 at 02:21:16 PM MDT 
//


package com.bitsys.fade.mist.state.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         A container in which the set of time-related configuration items are
 *         defined, including data load interval, data display intervals,
 *         animation intervals, and other items.
 *       
 * 
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="interval" type="{http://www.bit-sys.com/mist/state/v4}DateTimeIntervalType" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.bit-sys.com/mist/state/v4}DateTimeIntervalType"/>
 *         &lt;element name="advance" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="playIntervals" type="{http://www.bit-sys.com/mist/state/v4}TimeSequenceType" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="animation" type="{http://www.bit-sys.com/mist/state/v4}TimeAnimationType" minOccurs="0"/>
 *         &lt;element name="heldIntervals" type="{http://www.bit-sys.com/mist/state/v4}HeldIntervalsType" minOccurs="0"/>
 *         &lt;element name="fade" type="{http://www.bit-sys.com/mist/state/v4}TimeFadeType" minOccurs="0"/>
 *         &lt;element name="live" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {

})
public class TimeType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String interval;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String current;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String advance;
    protected TimeSequenceType playIntervals;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String duration;
    protected TimeAnimationType animation;
    protected HeldIntervalsType heldIntervals;
    protected TimeFadeType fade;
    protected Boolean live;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterval(String value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return (this.interval!= null);
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

    public boolean isSetCurrent() {
        return (this.current!= null);
    }

    /**
     * Gets the value of the advance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvance() {
        return advance;
    }

    /**
     * Sets the value of the advance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvance(String value) {
        this.advance = value;
    }

    public boolean isSetAdvance() {
        return (this.advance!= null);
    }

    /**
     * Gets the value of the playIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSequenceType }
     *     
     */
    public TimeSequenceType getPlayIntervals() {
        return playIntervals;
    }

    /**
     * Sets the value of the playIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSequenceType }
     *     
     */
    public void setPlayIntervals(TimeSequenceType value) {
        this.playIntervals = value;
    }

    public boolean isSetPlayIntervals() {
        return (this.playIntervals!= null);
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * Gets the value of the animation property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAnimationType }
     *     
     */
    public TimeAnimationType getAnimation() {
        return animation;
    }

    /**
     * Sets the value of the animation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAnimationType }
     *     
     */
    public void setAnimation(TimeAnimationType value) {
        this.animation = value;
    }

    public boolean isSetAnimation() {
        return (this.animation!= null);
    }

    /**
     * Gets the value of the heldIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link HeldIntervalsType }
     *     
     */
    public HeldIntervalsType getHeldIntervals() {
        return heldIntervals;
    }

    /**
     * Sets the value of the heldIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldIntervalsType }
     *     
     */
    public void setHeldIntervals(HeldIntervalsType value) {
        this.heldIntervals = value;
    }

    public boolean isSetHeldIntervals() {
        return (this.heldIntervals!= null);
    }

    /**
     * Gets the value of the fade property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFadeType }
     *     
     */
    public TimeFadeType getFade() {
        return fade;
    }

    /**
     * Sets the value of the fade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFadeType }
     *     
     */
    public void setFade(TimeFadeType value) {
        this.fade = value;
    }

    public boolean isSetFade() {
        return (this.fade!= null);
    }

    /**
     * Gets the value of the live property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLive(Boolean value) {
        this.live = value;
    }

    public boolean isSetLive() {
        return (this.live!= null);
    }

}
