//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category 
 * records information about properties pertaining to 
 * this structure sequence_range.
 * 
 *     Example 1 - Secondary structure computed by program DSSP.
 * <PDBx:pdbx_feature_sequence_rangeCategory>
 *    <PDBx:pdbx_feature_sequence_range id="1">
 *       <PDBx:feature>4-helix (alpha-helix)</PDBx:feature>
 *       <PDBx:feature_assigned_by>DSSP</PDBx:feature_assigned_by>
 *       <PDBx:feature_name>secondary structure</PDBx:feature_name>
 *       <PDBx:feature_software_id>DSSP</PDBx:feature_software_id>
 *       <PDBx:feature_type>value</PDBx:feature_type>
 *       <PDBx:seq_range_id>H1</PDBx:seq_range_id>
 *    </PDBx:pdbx_feature_sequence_range>
 *    <PDBx:pdbx_feature_sequence_range id="2">
 *       <PDBx:feature>hydrogen-bonded turn in beta-ladder</PDBx:feature>
 *       <PDBx:feature_assigned_by>DSSP</PDBx:feature_assigned_by>
 *       <PDBx:feature_name>secondary structure</PDBx:feature_name>
 *       <PDBx:feature_software_id>DSSP</PDBx:feature_software_id>
 *       <PDBx:feature_type>value</PDBx:feature_type>
 *       <PDBx:seq_range_id>T1</PDBx:seq_range_id>
 *    </PDBx:pdbx_feature_sequence_range>
 * </PDBx:pdbx_feature_sequence_rangeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_feature_sequence_rangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_feature_sequence_rangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_feature_sequence_range" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_assigned_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_software_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="value"/>
 *                         &lt;enumeration value="uri"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="seq_range_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_feature_sequence_rangeType", propOrder = {
    "pdbxFeatureSequenceRange"
})
public class PdbxFeatureSequenceRangeType {

    @XmlElement(name = "pdbx_feature_sequence_range")
    protected List<PdbxFeatureSequenceRangeType.PdbxFeatureSequenceRange> pdbxFeatureSequenceRange;

    /**
     * Gets the value of the pdbxFeatureSequenceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxFeatureSequenceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxFeatureSequenceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxFeatureSequenceRangeType.PdbxFeatureSequenceRange }
     * 
     * 
     */
    public List<PdbxFeatureSequenceRangeType.PdbxFeatureSequenceRange> getPdbxFeatureSequenceRange() {
        if (pdbxFeatureSequenceRange == null) {
            pdbxFeatureSequenceRange = new ArrayList<PdbxFeatureSequenceRangeType.PdbxFeatureSequenceRange>();
        }
        return this.pdbxFeatureSequenceRange;
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
     *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_assigned_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_software_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="value"/>
     *               &lt;enumeration value="uri"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="seq_range_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxFeatureSequenceRange {

        @XmlElement(required = true)
        protected String feature;
        @XmlElement(name = "feature_assigned_by", required = true)
        protected String featureAssignedBy;
        @XmlElementRef(name = "feature_citation_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureCitationId;
        @XmlElementRef(name = "feature_identifier", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureIdentifier;
        @XmlElement(name = "feature_name", required = true)
        protected String featureName;
        @XmlElementRef(name = "feature_software_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureSoftwareId;
        @XmlElement(name = "feature_type", required = true)
        protected String featureType;
        @XmlElement(name = "seq_range_id", required = true)
        protected String seqRangeId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the feature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeature() {
            return feature;
        }

        /**
         * Sets the value of the feature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeature(String value) {
            this.feature = value;
        }

        /**
         * Gets the value of the featureAssignedBy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureAssignedBy() {
            return featureAssignedBy;
        }

        /**
         * Sets the value of the featureAssignedBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureAssignedBy(String value) {
            this.featureAssignedBy = value;
        }

        /**
         * Gets the value of the featureCitationId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureCitationId() {
            return featureCitationId;
        }

        /**
         * Sets the value of the featureCitationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureCitationId(JAXBElement<String> value) {
            this.featureCitationId = value;
        }

        /**
         * Gets the value of the featureIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureIdentifier() {
            return featureIdentifier;
        }

        /**
         * Sets the value of the featureIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureIdentifier(JAXBElement<String> value) {
            this.featureIdentifier = value;
        }

        /**
         * Gets the value of the featureName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureName() {
            return featureName;
        }

        /**
         * Sets the value of the featureName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureName(String value) {
            this.featureName = value;
        }

        /**
         * Gets the value of the featureSoftwareId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureSoftwareId() {
            return featureSoftwareId;
        }

        /**
         * Sets the value of the featureSoftwareId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureSoftwareId(JAXBElement<String> value) {
            this.featureSoftwareId = value;
        }

        /**
         * Gets the value of the featureType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureType() {
            return featureType;
        }

        /**
         * Sets the value of the featureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureType(String value) {
            this.featureType = value;
        }

        /**
         * Gets the value of the seqRangeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeqRangeId() {
            return seqRangeId;
        }

        /**
         * Sets the value of the seqRangeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeqRangeId(String value) {
            this.seqRangeId = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
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
        public void setId(String value) {
            this.id = value;
        }

    }

}
