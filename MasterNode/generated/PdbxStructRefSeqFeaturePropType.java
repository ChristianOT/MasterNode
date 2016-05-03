//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.math.BigInteger;
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
 * 
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
 * mechanism for identifying and annotating properties of sequence features.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_struct_ref_seq_feature_propCategory>
 *    <PDBx:pdbx_struct_ref_seq_feature_prop feature_id="1" property_id="1">
 *       <PDBx:beg_db_mon_id>GLU</PDBx:beg_db_mon_id>
 *       <PDBx:beg_db_seq_id>100</PDBx:beg_db_seq_id>
 *       <PDBx:details>  Special splice at ... </PDBx:details>
 *       <PDBx:end_db_mon_id>PHE</PDBx:end_db_mon_id>
 *       <PDBx:end_db_seq_id>104</PDBx:end_db_seq_id>
 *       <PDBx:type>VARIABLE_SPLICING</PDBx:type>
 *       <PDBx:value>VSP_003456</PDBx:value>
 *    </PDBx:pdbx_struct_ref_seq_feature_prop>
 * </PDBx:pdbx_struct_ref_seq_feature_propCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_ref_seq_feature_propType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_ref_seq_feature_propType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_ref_seq_feature_prop" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="beg_db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="feature_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="property_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_struct_ref_seq_feature_propType", propOrder = {
    "pdbxStructRefSeqFeatureProp"
})
public class PdbxStructRefSeqFeaturePropType {

    @XmlElement(name = "pdbx_struct_ref_seq_feature_prop")
    protected List<PdbxStructRefSeqFeaturePropType.PdbxStructRefSeqFeatureProp> pdbxStructRefSeqFeatureProp;

    /**
     * Gets the value of the pdbxStructRefSeqFeatureProp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructRefSeqFeatureProp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructRefSeqFeatureProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructRefSeqFeaturePropType.PdbxStructRefSeqFeatureProp }
     * 
     * 
     */
    public List<PdbxStructRefSeqFeaturePropType.PdbxStructRefSeqFeatureProp> getPdbxStructRefSeqFeatureProp() {
        if (pdbxStructRefSeqFeatureProp == null) {
            pdbxStructRefSeqFeatureProp = new ArrayList<PdbxStructRefSeqFeaturePropType.PdbxStructRefSeqFeatureProp>();
        }
        return this.pdbxStructRefSeqFeatureProp;
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
     *         &lt;element name="beg_db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_db_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="feature_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="property_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxStructRefSeqFeatureProp {

        @XmlElementRef(name = "beg_db_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begDbMonId;
        @XmlElementRef(name = "beg_db_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> begDbSeqId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "end_db_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endDbMonId;
        @XmlElementRef(name = "end_db_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> endDbSeqId;
        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String value;
        @XmlAttribute(name = "feature_id", required = true)
        protected BigInteger featureId;
        @XmlAttribute(name = "property_id", required = true)
        protected BigInteger propertyId;

        /**
         * Gets the value of the begDbMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegDbMonId() {
            return begDbMonId;
        }

        /**
         * Sets the value of the begDbMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegDbMonId(JAXBElement<String> value) {
            this.begDbMonId = value;
        }

        /**
         * Gets the value of the begDbSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getBegDbSeqId() {
            return begDbSeqId;
        }

        /**
         * Sets the value of the begDbSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setBegDbSeqId(JAXBElement<BigInteger> value) {
            this.begDbSeqId = value;
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
         * Gets the value of the endDbMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndDbMonId() {
            return endDbMonId;
        }

        /**
         * Sets the value of the endDbMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndDbMonId(JAXBElement<String> value) {
            this.endDbMonId = value;
        }

        /**
         * Gets the value of the endDbSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getEndDbSeqId() {
            return endDbSeqId;
        }

        /**
         * Sets the value of the endDbSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setEndDbSeqId(JAXBElement<BigInteger> value) {
            this.endDbSeqId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the featureId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFeatureId() {
            return featureId;
        }

        /**
         * Sets the value of the featureId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFeatureId(BigInteger value) {
            this.featureId = value;
        }

        /**
         * Gets the value of the propertyId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPropertyId() {
            return propertyId;
        }

        /**
         * Sets the value of the propertyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPropertyId(BigInteger value) {
            this.propertyId = value;
        }

    }

}
