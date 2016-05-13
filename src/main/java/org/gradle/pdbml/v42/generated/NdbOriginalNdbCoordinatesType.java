//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Placeholder category for PDB coordinate data.
 * 
 *          
 * 
 * <p>Java class for ndb_original_ndb_coordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ndb_original_ndb_coordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ndb_original_ndb_coordinates" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="coord_section" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ndb_original_ndb_coordinatesType", propOrder = {
    "ndbOriginalNdbCoordinates"
})
public class NdbOriginalNdbCoordinatesType {

    @XmlElement(name = "ndb_original_ndb_coordinates")
    protected List<NdbOriginalNdbCoordinatesType.NdbOriginalNdbCoordinates> ndbOriginalNdbCoordinates;

    /**
     * Gets the value of the ndbOriginalNdbCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndbOriginalNdbCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdbOriginalNdbCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NdbOriginalNdbCoordinatesType.NdbOriginalNdbCoordinates }
     * 
     * 
     */
    public List<NdbOriginalNdbCoordinatesType.NdbOriginalNdbCoordinates> getNdbOriginalNdbCoordinates() {
        if (ndbOriginalNdbCoordinates == null) {
            ndbOriginalNdbCoordinates = new ArrayList<NdbOriginalNdbCoordinatesType.NdbOriginalNdbCoordinates>();
        }
        return this.ndbOriginalNdbCoordinates;
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
     *       &lt;attribute name="coord_section" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NdbOriginalNdbCoordinates {

        @XmlAttribute(name = "coord_section", required = true)
        protected String coordSection;

        /**
         * Gets the value of the coordSection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoordSection() {
            return coordSection;
        }

        /**
         * Sets the value of the coordSection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoordSection(String value) {
            this.coordSection = value;
        }

    }

}