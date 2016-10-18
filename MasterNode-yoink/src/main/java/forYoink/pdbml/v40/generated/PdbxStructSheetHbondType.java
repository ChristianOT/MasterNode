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
 * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
 * about the hydrogen bonding between residue ranges in a beta sheet.
 * This category is provided for cases where only a single hydrogen
 * bond is used to register the two residue ranges.   Category
 * STRUCT_SHEET_HBOND should be used when the initial and terminal
 * hydrogen bonds for strand pair are known. 
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_sheet_hbondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_sheet_hbondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_sheet_hbond" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="range_1_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="range_1_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_1_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="range_2_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="range_2_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="range_2_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="range_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="range_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_struct_sheet_hbondType", propOrder = {
    "pdbxStructSheetHbond"
})
public class PdbxStructSheetHbondType {

    @XmlElement(name = "pdbx_struct_sheet_hbond")
    protected List<PdbxStructSheetHbondType.PdbxStructSheetHbond> pdbxStructSheetHbond;

    /**
     * Gets the value of the pdbxStructSheetHbond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructSheetHbond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructSheetHbond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructSheetHbondType.PdbxStructSheetHbond }
     * 
     * 
     */
    public List<PdbxStructSheetHbondType.PdbxStructSheetHbond> getPdbxStructSheetHbond() {
        if (pdbxStructSheetHbond == null) {
            pdbxStructSheetHbond = new ArrayList<PdbxStructSheetHbondType.PdbxStructSheetHbond>();
        }
        return this.pdbxStructSheetHbond;
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
     *         &lt;element name="range_1_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="range_1_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_1_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="range_2_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="range_2_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="range_2_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="range_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="range_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxStructSheetHbond {

        @XmlElementRef(name = "range_1_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1PDBInsCode;
        @XmlElementRef(name = "range_1_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1AuthAsymId;
        @XmlElementRef(name = "range_1_auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1AuthAtomId;
        @XmlElementRef(name = "range_1_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1AuthCompId;
        @XmlElementRef(name = "range_1_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1AuthSeqId;
        @XmlElementRef(name = "range_1_label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1LabelAsymId;
        @XmlElement(name = "range_1_label_atom_id", required = true)
        protected String range1LabelAtomId;
        @XmlElementRef(name = "range_1_label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range1LabelCompId;
        @XmlElement(name = "range_1_label_seq_id", required = true)
        protected BigInteger range1LabelSeqId;
        @XmlElementRef(name = "range_2_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2PDBInsCode;
        @XmlElementRef(name = "range_2_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2AuthAsymId;
        @XmlElementRef(name = "range_2_auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2AuthAtomId;
        @XmlElementRef(name = "range_2_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2AuthCompId;
        @XmlElementRef(name = "range_2_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2AuthSeqId;
        @XmlElementRef(name = "range_2_label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2LabelAsymId;
        @XmlElement(name = "range_2_label_atom_id", required = true)
        protected String range2LabelAtomId;
        @XmlElementRef(name = "range_2_label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> range2LabelCompId;
        @XmlElement(name = "range_2_label_seq_id", required = true)
        protected BigInteger range2LabelSeqId;
        @XmlAttribute(name = "range_id_1", required = true)
        protected String rangeId1;
        @XmlAttribute(name = "range_id_2", required = true)
        protected String rangeId2;
        @XmlAttribute(name = "sheet_id", required = true)
        protected String sheetId;

        /**
         * Gets the value of the range1PDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1PDBInsCode() {
            return range1PDBInsCode;
        }

        /**
         * Sets the value of the range1PDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1PDBInsCode(JAXBElement<String> value) {
            this.range1PDBInsCode = value;
        }

        /**
         * Gets the value of the range1AuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1AuthAsymId() {
            return range1AuthAsymId;
        }

        /**
         * Sets the value of the range1AuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1AuthAsymId(JAXBElement<String> value) {
            this.range1AuthAsymId = value;
        }

        /**
         * Gets the value of the range1AuthAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1AuthAtomId() {
            return range1AuthAtomId;
        }

        /**
         * Sets the value of the range1AuthAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1AuthAtomId(JAXBElement<String> value) {
            this.range1AuthAtomId = value;
        }

        /**
         * Gets the value of the range1AuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1AuthCompId() {
            return range1AuthCompId;
        }

        /**
         * Sets the value of the range1AuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1AuthCompId(JAXBElement<String> value) {
            this.range1AuthCompId = value;
        }

        /**
         * Gets the value of the range1AuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1AuthSeqId() {
            return range1AuthSeqId;
        }

        /**
         * Sets the value of the range1AuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1AuthSeqId(JAXBElement<String> value) {
            this.range1AuthSeqId = value;
        }

        /**
         * Gets the value of the range1LabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1LabelAsymId() {
            return range1LabelAsymId;
        }

        /**
         * Sets the value of the range1LabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1LabelAsymId(JAXBElement<String> value) {
            this.range1LabelAsymId = value;
        }

        /**
         * Gets the value of the range1LabelAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRange1LabelAtomId() {
            return range1LabelAtomId;
        }

        /**
         * Sets the value of the range1LabelAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRange1LabelAtomId(String value) {
            this.range1LabelAtomId = value;
        }

        /**
         * Gets the value of the range1LabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange1LabelCompId() {
            return range1LabelCompId;
        }

        /**
         * Sets the value of the range1LabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange1LabelCompId(JAXBElement<String> value) {
            this.range1LabelCompId = value;
        }

        /**
         * Gets the value of the range1LabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRange1LabelSeqId() {
            return range1LabelSeqId;
        }

        /**
         * Sets the value of the range1LabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRange1LabelSeqId(BigInteger value) {
            this.range1LabelSeqId = value;
        }

        /**
         * Gets the value of the range2PDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2PDBInsCode() {
            return range2PDBInsCode;
        }

        /**
         * Sets the value of the range2PDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2PDBInsCode(JAXBElement<String> value) {
            this.range2PDBInsCode = value;
        }

        /**
         * Gets the value of the range2AuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2AuthAsymId() {
            return range2AuthAsymId;
        }

        /**
         * Sets the value of the range2AuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2AuthAsymId(JAXBElement<String> value) {
            this.range2AuthAsymId = value;
        }

        /**
         * Gets the value of the range2AuthAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2AuthAtomId() {
            return range2AuthAtomId;
        }

        /**
         * Sets the value of the range2AuthAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2AuthAtomId(JAXBElement<String> value) {
            this.range2AuthAtomId = value;
        }

        /**
         * Gets the value of the range2AuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2AuthCompId() {
            return range2AuthCompId;
        }

        /**
         * Sets the value of the range2AuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2AuthCompId(JAXBElement<String> value) {
            this.range2AuthCompId = value;
        }

        /**
         * Gets the value of the range2AuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2AuthSeqId() {
            return range2AuthSeqId;
        }

        /**
         * Sets the value of the range2AuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2AuthSeqId(JAXBElement<String> value) {
            this.range2AuthSeqId = value;
        }

        /**
         * Gets the value of the range2LabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2LabelAsymId() {
            return range2LabelAsymId;
        }

        /**
         * Sets the value of the range2LabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2LabelAsymId(JAXBElement<String> value) {
            this.range2LabelAsymId = value;
        }

        /**
         * Gets the value of the range2LabelAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRange2LabelAtomId() {
            return range2LabelAtomId;
        }

        /**
         * Sets the value of the range2LabelAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRange2LabelAtomId(String value) {
            this.range2LabelAtomId = value;
        }

        /**
         * Gets the value of the range2LabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRange2LabelCompId() {
            return range2LabelCompId;
        }

        /**
         * Sets the value of the range2LabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRange2LabelCompId(JAXBElement<String> value) {
            this.range2LabelCompId = value;
        }

        /**
         * Gets the value of the range2LabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRange2LabelSeqId() {
            return range2LabelSeqId;
        }

        /**
         * Sets the value of the range2LabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRange2LabelSeqId(BigInteger value) {
            this.range2LabelSeqId = value;
        }

        /**
         * Gets the value of the rangeId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeId1() {
            return rangeId1;
        }

        /**
         * Sets the value of the rangeId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeId1(String value) {
            this.rangeId1 = value;
        }

        /**
         * Gets the value of the rangeId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeId2() {
            return rangeId2;
        }

        /**
         * Sets the value of the rangeId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeId2(String value) {
            this.rangeId2 = value;
        }

        /**
         * Gets the value of the sheetId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSheetId() {
            return sheetId;
        }

        /**
         * Sets the value of the sheetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSheetId(String value) {
            this.sheetId = value;
        }

    }

}
