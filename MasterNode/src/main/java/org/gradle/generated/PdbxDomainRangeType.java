//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

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
 * Data items in the PDBX_DOMAIN_RANGE category identify the
 * beginning and ending points of polypeptide chain segments
 * that form all or part of a domain.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_domain_rangeCategory>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="A" beg_label_comp_id="PRO" beg_label_seq_id="1" domain_id="d1" end_label_alt_id="A" end_label_asym_id="A" end_label_comp_id="GLY" end_label_seq_id="29"></PDBx:pdbx_domain_range>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="B" beg_label_comp_id="PRO" beg_label_seq_id="31" domain_id="d1" end_label_alt_id="A" end_label_asym_id="B" end_label_comp_id="GLY" end_label_seq_id="59"></PDBx:pdbx_domain_range>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="C" beg_label_comp_id="PRO" beg_label_seq_id="61" domain_id="d1" end_label_alt_id="A" end_label_asym_id="B" end_label_comp_id="GLY" end_label_seq_id="89"></PDBx:pdbx_domain_range>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="D" beg_label_comp_id="PRO" beg_label_seq_id="91" domain_id="d2" end_label_alt_id="A" end_label_asym_id="D" end_label_comp_id="GLY" end_label_seq_id="119"></PDBx:pdbx_domain_range>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="E" beg_label_comp_id="PRO" beg_label_seq_id="121" domain_id="d2" end_label_alt_id="A" end_label_asym_id="E" end_label_comp_id="GLY" end_label_seq_id="149"></PDBx:pdbx_domain_range>
 *    <PDBx:pdbx_domain_range beg_label_alt_id="A" beg_label_asym_id="F" beg_label_comp_id="PRO" beg_label_seq_id="151" domain_id="d2" end_label_alt_id="A" end_label_asym_id="F" end_label_comp_id="GLY" end_label_seq_id="179"></PDBx:pdbx_domain_range>
 * </PDBx:pdbx_domain_rangeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_domain_rangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_domain_rangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_domain_range" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="beg_label_alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="beg_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="beg_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="beg_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="domain_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="end_label_alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="end_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="end_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="end_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_domain_rangeType", propOrder = {
    "pdbxDomainRange"
})
public class PdbxDomainRangeType {

    @XmlElement(name = "pdbx_domain_range")
    protected List<PdbxDomainRangeType.PdbxDomainRange> pdbxDomainRange;

    /**
     * Gets the value of the pdbxDomainRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxDomainRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxDomainRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxDomainRangeType.PdbxDomainRange }
     * 
     * 
     */
    public List<PdbxDomainRangeType.PdbxDomainRange> getPdbxDomainRange() {
        if (pdbxDomainRange == null) {
            pdbxDomainRange = new ArrayList<PdbxDomainRangeType.PdbxDomainRange>();
        }
        return this.pdbxDomainRange;
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
     *         &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="beg_label_alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="beg_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="beg_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="beg_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="domain_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="end_label_alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="end_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="end_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="end_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxDomainRange {

        @XmlElementRef(name = "beg_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthAsymId;
        @XmlElementRef(name = "beg_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthCompId;
        @XmlElementRef(name = "beg_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthSeqId;
        @XmlElementRef(name = "end_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthAsymId;
        @XmlElementRef(name = "end_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthCompId;
        @XmlElementRef(name = "end_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthSeqId;
        @XmlAttribute(name = "beg_label_alt_id", required = true)
        protected String begLabelAltId;
        @XmlAttribute(name = "beg_label_asym_id", required = true)
        protected String begLabelAsymId;
        @XmlAttribute(name = "beg_label_comp_id", required = true)
        protected String begLabelCompId;
        @XmlAttribute(name = "beg_label_seq_id", required = true)
        protected BigInteger begLabelSeqId;
        @XmlAttribute(name = "domain_id", required = true)
        protected String domainId;
        @XmlAttribute(name = "end_label_alt_id", required = true)
        protected String endLabelAltId;
        @XmlAttribute(name = "end_label_asym_id", required = true)
        protected String endLabelAsymId;
        @XmlAttribute(name = "end_label_comp_id", required = true)
        protected String endLabelCompId;
        @XmlAttribute(name = "end_label_seq_id", required = true)
        protected BigInteger endLabelSeqId;

        /**
         * Gets the value of the begAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthAsymId() {
            return begAuthAsymId;
        }

        /**
         * Sets the value of the begAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthAsymId(JAXBElement<String> value) {
            this.begAuthAsymId = value;
        }

        /**
         * Gets the value of the begAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthCompId() {
            return begAuthCompId;
        }

        /**
         * Sets the value of the begAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthCompId(JAXBElement<String> value) {
            this.begAuthCompId = value;
        }

        /**
         * Gets the value of the begAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthSeqId() {
            return begAuthSeqId;
        }

        /**
         * Sets the value of the begAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthSeqId(JAXBElement<String> value) {
            this.begAuthSeqId = value;
        }

        /**
         * Gets the value of the endAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthAsymId() {
            return endAuthAsymId;
        }

        /**
         * Sets the value of the endAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthAsymId(JAXBElement<String> value) {
            this.endAuthAsymId = value;
        }

        /**
         * Gets the value of the endAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthCompId() {
            return endAuthCompId;
        }

        /**
         * Sets the value of the endAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthCompId(JAXBElement<String> value) {
            this.endAuthCompId = value;
        }

        /**
         * Gets the value of the endAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthSeqId() {
            return endAuthSeqId;
        }

        /**
         * Sets the value of the endAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthSeqId(JAXBElement<String> value) {
            this.endAuthSeqId = value;
        }

        /**
         * Gets the value of the begLabelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelAltId() {
            return begLabelAltId;
        }

        /**
         * Sets the value of the begLabelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelAltId(String value) {
            this.begLabelAltId = value;
        }

        /**
         * Gets the value of the begLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelAsymId() {
            return begLabelAsymId;
        }

        /**
         * Sets the value of the begLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelAsymId(String value) {
            this.begLabelAsymId = value;
        }

        /**
         * Gets the value of the begLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelCompId() {
            return begLabelCompId;
        }

        /**
         * Sets the value of the begLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelCompId(String value) {
            this.begLabelCompId = value;
        }

        /**
         * Gets the value of the begLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBegLabelSeqId() {
            return begLabelSeqId;
        }

        /**
         * Sets the value of the begLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBegLabelSeqId(BigInteger value) {
            this.begLabelSeqId = value;
        }

        /**
         * Gets the value of the domainId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainId() {
            return domainId;
        }

        /**
         * Sets the value of the domainId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainId(String value) {
            this.domainId = value;
        }

        /**
         * Gets the value of the endLabelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelAltId() {
            return endLabelAltId;
        }

        /**
         * Sets the value of the endLabelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelAltId(String value) {
            this.endLabelAltId = value;
        }

        /**
         * Gets the value of the endLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelAsymId() {
            return endLabelAsymId;
        }

        /**
         * Sets the value of the endLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelAsymId(String value) {
            this.endLabelAsymId = value;
        }

        /**
         * Gets the value of the endLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelCompId() {
            return endLabelCompId;
        }

        /**
         * Sets the value of the endLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelCompId(String value) {
            this.endLabelCompId = value;
        }

        /**
         * Gets the value of the endLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEndLabelSeqId() {
            return endLabelSeqId;
        }

        /**
         * Sets the value of the endLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEndLabelSeqId(BigInteger value) {
            this.endLabelSeqId = value;
        }

    }

}
