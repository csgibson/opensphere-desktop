//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.30 at 02:21:16 PM MDT 
//


package com.bitsys.fade.mist.state.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoopBehaviorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoopBehaviorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="taperEndSnapStart"/>
 *     &lt;enumeration value="taperEndTaperStart"/>
 *     &lt;enumeration value="snapEndSnapStart"/>
 *     &lt;enumeration value="snapEndTaperStart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoopBehaviorType")
@XmlEnum
public enum LoopBehaviorType {

    @XmlEnumValue("taperEndSnapStart")
    TAPER_END_SNAP_START("taperEndSnapStart"),
    @XmlEnumValue("taperEndTaperStart")
    TAPER_END_TAPER_START("taperEndTaperStart"),
    @XmlEnumValue("snapEndSnapStart")
    SNAP_END_SNAP_START("snapEndSnapStart"),
    @XmlEnumValue("snapEndTaperStart")
    SNAP_END_TAPER_START("snapEndTaperStart");
    private final String value;

    LoopBehaviorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoopBehaviorType fromValue(String v) {
        for (LoopBehaviorType c: LoopBehaviorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
