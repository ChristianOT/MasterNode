//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the DIFFRN_MEASUREMENT category record details
 * about the device used to orient and/or position the crystal
 * during data measurement and the manner in which the diffraction
 * data were measured.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:diffrn_measurementCategory>
 *    <PDBx:diffrn_measurement diffrn_id="d1">
 *       <PDBx:details> 440 frames, 0.20 degrees, 150 sec, detector distance 12 cm,
 * detector angle 22.5 degrees</PDBx:details>
 *       <PDBx:device>3-circle camera</PDBx:device>
 *       <PDBx:device_details>none</PDBx:device_details>
 *       <PDBx:device_type>Supper model x</PDBx:device_type>
 *       <PDBx:method>omega scan</PDBx:method>
 *    </PDBx:diffrn_measurement>
 * </PDBx:diffrn_measurementCategory>
 * 
 * 
 *     Example 2 - based on data set TOZ of Willis, Beckwith & Tozer
 *                 [Acta Cryst. (1991), C47, 2276-2277].
 * <PDBx:diffrn_measurementCategory>
 *    <PDBx:diffrn_measurement diffrn_id="s1">
 *       <PDBx:device_type>Philips PW1100/20 diffractometer</PDBx:device_type>
 *       <PDBx:method>\q/2\q</PDBx:method>
 *    </PDBx:diffrn_measurement>
 * </PDBx:diffrn_measurementCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for diffrn_measurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diffrn_measurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diffrn_measurement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="device_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="device_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specimen_support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "diffrn_measurementType", propOrder = {
    "diffrnMeasurement"
})
public class DiffrnMeasurementType {

    @XmlElement(name = "diffrn_measurement")
    protected List<DiffrnMeasurementType.DiffrnMeasurement> diffrnMeasurement;

    /**
     * Gets the value of the diffrnMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diffrnMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiffrnMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiffrnMeasurementType.DiffrnMeasurement }
     * 
     * 
     */
    public List<DiffrnMeasurementType.DiffrnMeasurement> getDiffrnMeasurement() {
        if (diffrnMeasurement == null) {
            diffrnMeasurement = new ArrayList<DiffrnMeasurementType.DiffrnMeasurement>();
        }
        return this.diffrnMeasurement;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="device_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="device_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specimen_support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class DiffrnMeasurement {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "device", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> device;
        @XmlElementRef(name = "device_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> deviceDetails;
        @XmlElementRef(name = "device_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> deviceType;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "specimen_support", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> specimenSupport;
        @XmlAttribute(name = "diffrn_id", required = true)
        protected String diffrnId;

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
         * Gets the value of the device property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDevice() {
            return device;
        }

        /**
         * Sets the value of the device property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDevice(JAXBElement<String> value) {
            this.device = value;
        }

        /**
         * Gets the value of the deviceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDeviceDetails() {
            return deviceDetails;
        }

        /**
         * Sets the value of the deviceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDeviceDetails(JAXBElement<String> value) {
            this.deviceDetails = value;
        }

        /**
         * Gets the value of the deviceType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDeviceType() {
            return deviceType;
        }

        /**
         * Sets the value of the deviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDeviceType(JAXBElement<String> value) {
            this.deviceType = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethod(JAXBElement<String> value) {
            this.method = value;
        }

        /**
         * Gets the value of the specimenSupport property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSpecimenSupport() {
            return specimenSupport;
        }

        /**
         * Sets the value of the specimenSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSpecimenSupport(JAXBElement<String> value) {
            this.specimenSupport = value;
        }

        /**
         * Gets the value of the diffrnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiffrnId() {
            return diffrnId;
        }

        /**
         * Sets the value of the diffrnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiffrnId(String value) {
            this.diffrnId = value;
        }

    }

}
