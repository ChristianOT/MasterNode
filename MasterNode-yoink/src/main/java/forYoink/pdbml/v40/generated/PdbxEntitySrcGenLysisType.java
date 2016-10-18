//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * This category contains details for the cell lysis steps used in
 * the overall protein production process.
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_src_gen_lysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_src_gen_lysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_src_gen_lysis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="buffer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="buffer_volume">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milliliters" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="S"/>
 *                         &lt;enumeration value="D"/>
 *                         &lt;enumeration value="B"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temperature">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="time">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "pdbx_entity_src_gen_lysisType", propOrder = {
    "pdbxEntitySrcGenLysis"
})
public class PdbxEntitySrcGenLysisType {

    @XmlElement(name = "pdbx_entity_src_gen_lysis")
    protected List<PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis> pdbxEntitySrcGenLysis;

    /**
     * Gets the value of the pdbxEntitySrcGenLysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntitySrcGenLysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntitySrcGenLysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis }
     * 
     * 
     */
    public List<PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis> getPdbxEntitySrcGenLysis() {
        if (pdbxEntitySrcGenLysis == null) {
            pdbxEntitySrcGenLysis = new ArrayList<PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis>();
        }
        return this.pdbxEntitySrcGenLysis;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="buffer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="buffer_volume">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milliliters" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="S"/>
     *               &lt;enumeration value="D"/>
     *               &lt;enumeration value="B"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temperature">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="time">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PdbxEntitySrcGenLysis {

        @XmlElement(name = "buffer_id", required = true)
        protected String bufferId;
        @XmlElement(name = "buffer_volume", required = true)
        protected PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.BufferVolume bufferVolume;
        @XmlElementRef(name = "date", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> date;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "end_construct_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endConstructId;
        @XmlElement(required = true)
        protected String method;
        @XmlElement(name = "next_step_id", required = true)
        protected BigInteger nextStepId;
        @XmlElementRef(name = "robot_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> robotId;
        @XmlElement(required = true)
        protected PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Temperature temperature;
        @XmlElement(required = true)
        protected PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Time time;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "step_id", required = true)
        protected BigInteger stepId;

        /**
         * Gets the value of the bufferId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBufferId() {
            return bufferId;
        }

        /**
         * Sets the value of the bufferId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBufferId(String value) {
            this.bufferId = value;
        }

        /**
         * Gets the value of the bufferVolume property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.BufferVolume }
         *     
         */
        public PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.BufferVolume getBufferVolume() {
            return bufferVolume;
        }

        /**
         * Sets the value of the bufferVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.BufferVolume }
         *     
         */
        public void setBufferVolume(PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.BufferVolume value) {
            this.bufferVolume = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDate(JAXBElement<String> value) {
            this.date = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDetails(JAXBElement<String> value) {
            this.details = value;
        }

        /**
         * Gets the value of the endConstructId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndConstructId() {
            return endConstructId;
        }

        /**
         * Sets the value of the endConstructId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndConstructId(JAXBElement<String> value) {
            this.endConstructId = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the nextStepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNextStepId() {
            return nextStepId;
        }

        /**
         * Sets the value of the nextStepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNextStepId(BigInteger value) {
            this.nextStepId = value;
        }

        /**
         * Gets the value of the robotId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRobotId() {
            return robotId;
        }

        /**
         * Sets the value of the robotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRobotId(JAXBElement<String> value) {
            this.robotId = value;
        }

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Temperature }
         *     
         */
        public PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Temperature getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Temperature }
         *     
         */
        public void setTemperature(PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Temperature value) {
            this.temperature = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Time }
         *     
         */
        public PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Time getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Time }
         *     
         */
        public void setTime(PdbxEntitySrcGenLysisType.PdbxEntitySrcGenLysis.Time value) {
            this.time = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
        }

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

        /**
         * Gets the value of the stepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStepId() {
            return stepId;
        }

        /**
         * Sets the value of the stepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStepId(BigInteger value) {
            this.stepId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milliliters" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class BufferVolume {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "milliliters";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Temperature {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "celsius";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="minutes" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Time {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "minutes";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
