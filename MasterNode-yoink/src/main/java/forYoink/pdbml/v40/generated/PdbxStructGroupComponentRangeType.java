//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
 * group as a continuous span chemical components. 
 * 
 *     Example 1 - 
 * <PDBx:pdbx_struct_group_component_rangeCategory>
 *    <PDBx:pdbx_struct_group_component_range ordinal="1">
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:beg_PDB_ins_code xsi:nil="true" />
 *       <PDBx:beg_auth_asym_id>A</PDBx:beg_auth_asym_id>
 *       <PDBx:beg_auth_comp_id>MLU</PDBx:beg_auth_comp_id>
 *       <PDBx:beg_auth_seq_id>1</PDBx:beg_auth_seq_id>
 *       <PDBx:end_PDB_ins_code xsi:nil="true" />
 *       <PDBx:end_auth_asym_id>A</PDBx:end_auth_asym_id>
 *       <PDBx:end_auth_comp_id>RAM</PDBx:end_auth_comp_id>
 *       <PDBx:end_auth_seq_id>10</PDBx:end_auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_component_range>
 * </PDBx:pdbx_struct_group_component_rangeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_group_component_rangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_group_component_rangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_group_component_range" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="struct_group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_struct_group_component_rangeType", propOrder = {
    "pdbxStructGroupComponentRange"
})
public class PdbxStructGroupComponentRangeType {

    @XmlElement(name = "pdbx_struct_group_component_range")
    protected List<PdbxStructGroupComponentRangeType.PdbxStructGroupComponentRange> pdbxStructGroupComponentRange;

    /**
     * Gets the value of the pdbxStructGroupComponentRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructGroupComponentRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructGroupComponentRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructGroupComponentRangeType.PdbxStructGroupComponentRange }
     * 
     * 
     */
    public List<PdbxStructGroupComponentRangeType.PdbxStructGroupComponentRange> getPdbxStructGroupComponentRange() {
        if (pdbxStructGroupComponentRange == null) {
            pdbxStructGroupComponentRange = new ArrayList<PdbxStructGroupComponentRangeType.PdbxStructGroupComponentRange>();
        }
        return this.pdbxStructGroupComponentRange;
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
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="struct_group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxStructGroupComponentRange {

        @XmlElementRef(name = "PDB_model_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbModelNum;
        @XmlElementRef(name = "beg_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begPDBInsCode;
        @XmlElement(name = "beg_auth_asym_id", required = true)
        protected String begAuthAsymId;
        @XmlElement(name = "beg_auth_comp_id", required = true)
        protected String begAuthCompId;
        @XmlElement(name = "beg_auth_seq_id", required = true)
        protected String begAuthSeqId;
        @XmlElementRef(name = "beg_label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begLabelAltId;
        @XmlElementRef(name = "beg_label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begLabelAsymId;
        @XmlElementRef(name = "beg_label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begLabelCompId;
        @XmlElementRef(name = "beg_label_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> begLabelSeqId;
        @XmlElementRef(name = "end_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endPDBInsCode;
        @XmlElement(name = "end_auth_asym_id", required = true)
        protected String endAuthAsymId;
        @XmlElement(name = "end_auth_comp_id", required = true)
        protected String endAuthCompId;
        @XmlElement(name = "end_auth_seq_id", required = true)
        protected String endAuthSeqId;
        @XmlElementRef(name = "end_label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endLabelAltId;
        @XmlElementRef(name = "end_label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endLabelAsymId;
        @XmlElementRef(name = "end_label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endLabelCompId;
        @XmlElementRef(name = "end_label_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> endLabelSeqId;
        @XmlElement(name = "struct_group_id", required = true)
        protected String structGroupId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the pdbModelNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPDBModelNum(JAXBElement<BigInteger> value) {
            this.pdbModelNum = value;
        }

        /**
         * Gets the value of the begPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegPDBInsCode() {
            return begPDBInsCode;
        }

        /**
         * Sets the value of the begPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegPDBInsCode(JAXBElement<String> value) {
            this.begPDBInsCode = value;
        }

        /**
         * Gets the value of the begAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegAuthAsymId() {
            return begAuthAsymId;
        }

        /**
         * Sets the value of the begAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegAuthAsymId(String value) {
            this.begAuthAsymId = value;
        }

        /**
         * Gets the value of the begAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegAuthCompId() {
            return begAuthCompId;
        }

        /**
         * Sets the value of the begAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegAuthCompId(String value) {
            this.begAuthCompId = value;
        }

        /**
         * Gets the value of the begAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegAuthSeqId() {
            return begAuthSeqId;
        }

        /**
         * Sets the value of the begAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegAuthSeqId(String value) {
            this.begAuthSeqId = value;
        }

        /**
         * Gets the value of the begLabelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegLabelAltId() {
            return begLabelAltId;
        }

        /**
         * Sets the value of the begLabelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegLabelAltId(JAXBElement<String> value) {
            this.begLabelAltId = value;
        }

        /**
         * Gets the value of the begLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegLabelAsymId() {
            return begLabelAsymId;
        }

        /**
         * Sets the value of the begLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegLabelAsymId(JAXBElement<String> value) {
            this.begLabelAsymId = value;
        }

        /**
         * Gets the value of the begLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegLabelCompId() {
            return begLabelCompId;
        }

        /**
         * Sets the value of the begLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegLabelCompId(JAXBElement<String> value) {
            this.begLabelCompId = value;
        }

        /**
         * Gets the value of the begLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getBegLabelSeqId() {
            return begLabelSeqId;
        }

        /**
         * Sets the value of the begLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setBegLabelSeqId(JAXBElement<BigInteger> value) {
            this.begLabelSeqId = value;
        }

        /**
         * Gets the value of the endPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndPDBInsCode() {
            return endPDBInsCode;
        }

        /**
         * Sets the value of the endPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndPDBInsCode(JAXBElement<String> value) {
            this.endPDBInsCode = value;
        }

        /**
         * Gets the value of the endAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndAuthAsymId() {
            return endAuthAsymId;
        }

        /**
         * Sets the value of the endAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndAuthAsymId(String value) {
            this.endAuthAsymId = value;
        }

        /**
         * Gets the value of the endAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndAuthCompId() {
            return endAuthCompId;
        }

        /**
         * Sets the value of the endAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndAuthCompId(String value) {
            this.endAuthCompId = value;
        }

        /**
         * Gets the value of the endAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndAuthSeqId() {
            return endAuthSeqId;
        }

        /**
         * Sets the value of the endAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndAuthSeqId(String value) {
            this.endAuthSeqId = value;
        }

        /**
         * Gets the value of the endLabelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndLabelAltId() {
            return endLabelAltId;
        }

        /**
         * Sets the value of the endLabelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndLabelAltId(JAXBElement<String> value) {
            this.endLabelAltId = value;
        }

        /**
         * Gets the value of the endLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndLabelAsymId() {
            return endLabelAsymId;
        }

        /**
         * Sets the value of the endLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndLabelAsymId(JAXBElement<String> value) {
            this.endLabelAsymId = value;
        }

        /**
         * Gets the value of the endLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndLabelCompId() {
            return endLabelCompId;
        }

        /**
         * Sets the value of the endLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndLabelCompId(JAXBElement<String> value) {
            this.endLabelCompId = value;
        }

        /**
         * Gets the value of the endLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getEndLabelSeqId() {
            return endLabelSeqId;
        }

        /**
         * Sets the value of the endLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setEndLabelSeqId(JAXBElement<BigInteger> value) {
            this.endLabelSeqId = value;
        }

        /**
         * Gets the value of the structGroupId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStructGroupId() {
            return structGroupId;
        }

        /**
         * Sets the value of the structGroupId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStructGroupId(String value) {
            this.structGroupId = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

    }

}
