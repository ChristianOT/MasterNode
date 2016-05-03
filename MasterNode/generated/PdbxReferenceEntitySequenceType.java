//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Additional features associated with the reference entity.
 * 
 *     Example 1 - Actinomycin
 * <PDBx:pdbx_reference_entity_sequenceCategory>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000006" ref_entity_id="2">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000007" ref_entity_id="3">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000009" ref_entity_id="4">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000010" ref_entity_id="5">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 *    <PDBx:pdbx_reference_entity_sequence prd_id="PRD_000011" ref_entity_id="6">
 *       <PDBx:NRP_flag>Y</PDBx:NRP_flag>
 *       <PDBx:one_letter_codes>TVPGVXTVPGV</PDBx:one_letter_codes>
 *       <PDBx:type>amino_acid</PDBx:type>
 *    </PDBx:pdbx_reference_entity_sequence>
 * </PDBx:pdbx_reference_entity_sequenceCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_sequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_sequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_sequence" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="NRP_flag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="one_letter_codes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_entity_sequenceType", propOrder = {
    "pdbxReferenceEntitySequence"
})
public class PdbxReferenceEntitySequenceType {

    @XmlElement(name = "pdbx_reference_entity_sequence")
    protected List<PdbxReferenceEntitySequenceType.PdbxReferenceEntitySequence> pdbxReferenceEntitySequence;

    /**
     * Gets the value of the pdbxReferenceEntitySequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntitySequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntitySequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntitySequenceType.PdbxReferenceEntitySequence }
     * 
     * 
     */
    public List<PdbxReferenceEntitySequenceType.PdbxReferenceEntitySequence> getPdbxReferenceEntitySequence() {
        if (pdbxReferenceEntitySequence == null) {
            pdbxReferenceEntitySequence = new ArrayList<PdbxReferenceEntitySequenceType.PdbxReferenceEntitySequence>();
        }
        return this.pdbxReferenceEntitySequence;
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
     *         &lt;element name="NRP_flag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="one_letter_codes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceEntitySequence {

        @XmlElement(name = "NRP_flag", required = true)
        protected String nrpFlag;
        @XmlElement(name = "one_letter_codes", required = true)
        protected String oneLetterCodes;
        @XmlElement(required = true)
        protected String type;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;
        @XmlAttribute(name = "ref_entity_id", required = true)
        protected String refEntityId;

        /**
         * Gets the value of the nrpFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNRPFlag() {
            return nrpFlag;
        }

        /**
         * Sets the value of the nrpFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNRPFlag(String value) {
            this.nrpFlag = value;
        }

        /**
         * Gets the value of the oneLetterCodes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOneLetterCodes() {
            return oneLetterCodes;
        }

        /**
         * Sets the value of the oneLetterCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOneLetterCodes(String value) {
            this.oneLetterCodes = value;
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
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrdId(String value) {
            this.prdId = value;
        }

        /**
         * Gets the value of the refEntityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefEntityId() {
            return refEntityId;
        }

        /**
         * Sets the value of the refEntityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefEntityId(String value) {
            this.refEntityId = value;
        }

    }

}
