//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.math.BigDecimal;
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
 * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
 * 
 *    ?
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_chem_shift_refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_chem_shift_refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_chem_shift_ref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_group">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="methyl carbon"/>
 *                         &lt;enumeration value="methyl carbons"/>
 *                         &lt;enumeration value="methyl protons"/>
 *                         &lt;enumeration value="methylene protons"/>
 *                         &lt;enumeration value="nitrogen"/>
 *                         &lt;enumeration value="protons"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chem_shift_units">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ppm"/>
 *                         &lt;enumeration value="Hz"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chem_shift_val" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="correction_val" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="external_ref_axis" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parallel"/>
 *                         &lt;enumeration value="perpendicular"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="external_ref_loc" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="insert at center of experimental sample tube"/>
 *                         &lt;enumeration value="insert at outer edge of experimental sample tube"/>
 *                         &lt;enumeration value="insert at center of a separate sample tube"/>
 *                         &lt;enumeration value="insert at outer edge of a separate sample tube"/>
 *                         &lt;enumeration value="separate tube (no insert) similar to the experimental sample tube"/>
 *                         &lt;enumeration value="separate tube (no insert) not similar to the experimental sample tube"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="external_ref_sample_geometry" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cylindrical"/>
 *                         &lt;enumeration value="spherical"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indirect_shift_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ref_correction_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ref_method" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="internal"/>
 *                         &lt;enumeration value="external"/>
 *                         &lt;enumeration value="na"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ref_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="direct"/>
 *                         &lt;enumeration value="indirect"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="solvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_isotope_number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="atom_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="chem_shift_reference_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="mol_common_name" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DSS"/>
 *                       &lt;enumeration value="TSP"/>
 *                       &lt;enumeration value="water"/>
 *                       &lt;enumeration value="DMSO"/>
 *                       &lt;enumeration value="DMSO-d5"/>
 *                       &lt;enumeration value="DMSO-d6"/>
 *                       &lt;enumeration value="methanol"/>
 *                       &lt;enumeration value="TMS"/>
 *                       &lt;enumeration value="acetate"/>
 *                       &lt;enumeration value="dioxane"/>
 *                       &lt;enumeration value="ammonium chloride"/>
 *                       &lt;enumeration value="[15N] ammonium chloride"/>
 *                       &lt;enumeration value="ammonium hydroxide"/>
 *                       &lt;enumeration value="ammonium nitrate"/>
 *                       &lt;enumeration value="[15N] ammonium nitrate"/>
 *                       &lt;enumeration value="[15N$ 15N] ammonium nitrate"/>
 *                       &lt;enumeration value="ammonium nitrite"/>
 *                       &lt;enumeration value="ammonium sulfate"/>
 *                       &lt;enumeration value="[15N] ammonium sulfate"/>
 *                       &lt;enumeration value="liquid anhydrous ammonia"/>
 *                       &lt;enumeration value="formamide"/>
 *                       &lt;enumeration value="[15N] nitric acid"/>
 *                       &lt;enumeration value="Nitromethane"/>
 *                       &lt;enumeration value="[15N] nitromethane"/>
 *                       &lt;enumeration value="urea"/>
 *                       &lt;enumeration value="phosphoric acid"/>
 *                       &lt;enumeration value="phosphoric acid (85%)"/>
 *                       &lt;enumeration value="TMP"/>
 *                       &lt;enumeration value="cadmium perchlorate"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "pdbx_nmr_chem_shift_refType", propOrder = {
    "pdbxNmrChemShiftRef"
})
public class PdbxNmrChemShiftRefType {

    @XmlElement(name = "pdbx_nmr_chem_shift_ref")
    protected List<PdbxNmrChemShiftRefType.PdbxNmrChemShiftRef> pdbxNmrChemShiftRef;

    /**
     * Gets the value of the pdbxNmrChemShiftRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrChemShiftRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrChemShiftRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrChemShiftRefType.PdbxNmrChemShiftRef }
     * 
     * 
     */
    public List<PdbxNmrChemShiftRefType.PdbxNmrChemShiftRef> getPdbxNmrChemShiftRef() {
        if (pdbxNmrChemShiftRef == null) {
            pdbxNmrChemShiftRef = new ArrayList<PdbxNmrChemShiftRefType.PdbxNmrChemShiftRef>();
        }
        return this.pdbxNmrChemShiftRef;
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
     *         &lt;element name="atom_group">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="methyl carbon"/>
     *               &lt;enumeration value="methyl carbons"/>
     *               &lt;enumeration value="methyl protons"/>
     *               &lt;enumeration value="methylene protons"/>
     *               &lt;enumeration value="nitrogen"/>
     *               &lt;enumeration value="protons"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chem_shift_units">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ppm"/>
     *               &lt;enumeration value="Hz"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chem_shift_val" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="correction_val" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="external_ref_axis" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="parallel"/>
     *               &lt;enumeration value="perpendicular"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="external_ref_loc" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="insert at center of experimental sample tube"/>
     *               &lt;enumeration value="insert at outer edge of experimental sample tube"/>
     *               &lt;enumeration value="insert at center of a separate sample tube"/>
     *               &lt;enumeration value="insert at outer edge of a separate sample tube"/>
     *               &lt;enumeration value="separate tube (no insert) similar to the experimental sample tube"/>
     *               &lt;enumeration value="separate tube (no insert) not similar to the experimental sample tube"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="external_ref_sample_geometry" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cylindrical"/>
     *               &lt;enumeration value="spherical"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indirect_shift_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ref_correction_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ref_method" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="internal"/>
     *               &lt;enumeration value="external"/>
     *               &lt;enumeration value="na"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ref_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="direct"/>
     *               &lt;enumeration value="indirect"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="solvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="atom_isotope_number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="atom_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="chem_shift_reference_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="mol_common_name" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DSS"/>
     *             &lt;enumeration value="TSP"/>
     *             &lt;enumeration value="water"/>
     *             &lt;enumeration value="DMSO"/>
     *             &lt;enumeration value="DMSO-d5"/>
     *             &lt;enumeration value="DMSO-d6"/>
     *             &lt;enumeration value="methanol"/>
     *             &lt;enumeration value="TMS"/>
     *             &lt;enumeration value="acetate"/>
     *             &lt;enumeration value="dioxane"/>
     *             &lt;enumeration value="ammonium chloride"/>
     *             &lt;enumeration value="[15N] ammonium chloride"/>
     *             &lt;enumeration value="ammonium hydroxide"/>
     *             &lt;enumeration value="ammonium nitrate"/>
     *             &lt;enumeration value="[15N] ammonium nitrate"/>
     *             &lt;enumeration value="[15N$ 15N] ammonium nitrate"/>
     *             &lt;enumeration value="ammonium nitrite"/>
     *             &lt;enumeration value="ammonium sulfate"/>
     *             &lt;enumeration value="[15N] ammonium sulfate"/>
     *             &lt;enumeration value="liquid anhydrous ammonia"/>
     *             &lt;enumeration value="formamide"/>
     *             &lt;enumeration value="[15N] nitric acid"/>
     *             &lt;enumeration value="Nitromethane"/>
     *             &lt;enumeration value="[15N] nitromethane"/>
     *             &lt;enumeration value="urea"/>
     *             &lt;enumeration value="phosphoric acid"/>
     *             &lt;enumeration value="phosphoric acid (85%)"/>
     *             &lt;enumeration value="TMP"/>
     *             &lt;enumeration value="cadmium perchlorate"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class PdbxNmrChemShiftRef {

        @XmlElement(name = "atom_group", required = true)
        protected String atomGroup;
        @XmlElement(name = "chem_shift_units", required = true)
        protected String chemShiftUnits;
        @XmlElement(name = "chem_shift_val", required = true)
        protected BigDecimal chemShiftVal;
        @XmlElementRef(name = "correction_val", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> correctionVal;
        @XmlElementRef(name = "external_ref_axis", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> externalRefAxis;
        @XmlElementRef(name = "external_ref_loc", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> externalRefLoc;
        @XmlElementRef(name = "external_ref_sample_geometry", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> externalRefSampleGeometry;
        @XmlElementRef(name = "indirect_shift_ratio", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> indirectShiftRatio;
        @XmlElementRef(name = "rank", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> rank;
        @XmlElementRef(name = "ref_correction_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> refCorrectionType;
        @XmlElementRef(name = "ref_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> refMethod;
        @XmlElementRef(name = "ref_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> refType;
        @XmlElementRef(name = "solvent", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> solvent;
        @XmlAttribute(name = "atom_isotope_number", required = true)
        protected BigInteger atomIsotopeNumber;
        @XmlAttribute(name = "atom_type", required = true)
        protected String atomType;
        @XmlAttribute(name = "chem_shift_reference_id", required = true)
        protected BigInteger chemShiftReferenceId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "mol_common_name", required = true)
        protected String molCommonName;

        /**
         * Gets the value of the atomGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomGroup() {
            return atomGroup;
        }

        /**
         * Sets the value of the atomGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomGroup(String value) {
            this.atomGroup = value;
        }

        /**
         * Gets the value of the chemShiftUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChemShiftUnits() {
            return chemShiftUnits;
        }

        /**
         * Sets the value of the chemShiftUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChemShiftUnits(String value) {
            this.chemShiftUnits = value;
        }

        /**
         * Gets the value of the chemShiftVal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getChemShiftVal() {
            return chemShiftVal;
        }

        /**
         * Sets the value of the chemShiftVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setChemShiftVal(BigDecimal value) {
            this.chemShiftVal = value;
        }

        /**
         * Gets the value of the correctionVal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getCorrectionVal() {
            return correctionVal;
        }

        /**
         * Sets the value of the correctionVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setCorrectionVal(JAXBElement<BigDecimal> value) {
            this.correctionVal = value;
        }

        /**
         * Gets the value of the externalRefAxis property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExternalRefAxis() {
            return externalRefAxis;
        }

        /**
         * Sets the value of the externalRefAxis property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExternalRefAxis(JAXBElement<String> value) {
            this.externalRefAxis = value;
        }

        /**
         * Gets the value of the externalRefLoc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExternalRefLoc() {
            return externalRefLoc;
        }

        /**
         * Sets the value of the externalRefLoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExternalRefLoc(JAXBElement<String> value) {
            this.externalRefLoc = value;
        }

        /**
         * Gets the value of the externalRefSampleGeometry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getExternalRefSampleGeometry() {
            return externalRefSampleGeometry;
        }

        /**
         * Sets the value of the externalRefSampleGeometry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setExternalRefSampleGeometry(JAXBElement<String> value) {
            this.externalRefSampleGeometry = value;
        }

        /**
         * Gets the value of the indirectShiftRatio property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getIndirectShiftRatio() {
            return indirectShiftRatio;
        }

        /**
         * Sets the value of the indirectShiftRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setIndirectShiftRatio(JAXBElement<BigDecimal> value) {
            this.indirectShiftRatio = value;
        }

        /**
         * Gets the value of the rank property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRank() {
            return rank;
        }

        /**
         * Sets the value of the rank property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRank(JAXBElement<String> value) {
            this.rank = value;
        }

        /**
         * Gets the value of the refCorrectionType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRefCorrectionType() {
            return refCorrectionType;
        }

        /**
         * Sets the value of the refCorrectionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRefCorrectionType(JAXBElement<String> value) {
            this.refCorrectionType = value;
        }

        /**
         * Gets the value of the refMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRefMethod() {
            return refMethod;
        }

        /**
         * Sets the value of the refMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRefMethod(JAXBElement<String> value) {
            this.refMethod = value;
        }

        /**
         * Gets the value of the refType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRefType() {
            return refType;
        }

        /**
         * Sets the value of the refType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRefType(JAXBElement<String> value) {
            this.refType = value;
        }

        /**
         * Gets the value of the solvent property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSolvent() {
            return solvent;
        }

        /**
         * Sets the value of the solvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSolvent(JAXBElement<String> value) {
            this.solvent = value;
        }

        /**
         * Gets the value of the atomIsotopeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAtomIsotopeNumber() {
            return atomIsotopeNumber;
        }

        /**
         * Sets the value of the atomIsotopeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAtomIsotopeNumber(BigInteger value) {
            this.atomIsotopeNumber = value;
        }

        /**
         * Gets the value of the atomType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomType() {
            return atomType;
        }

        /**
         * Sets the value of the atomType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomType(String value) {
            this.atomType = value;
        }

        /**
         * Gets the value of the chemShiftReferenceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getChemShiftReferenceId() {
            return chemShiftReferenceId;
        }

        /**
         * Sets the value of the chemShiftReferenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setChemShiftReferenceId(BigInteger value) {
            this.chemShiftReferenceId = value;
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
         * Gets the value of the molCommonName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMolCommonName() {
            return molCommonName;
        }

        /**
         * Sets the value of the molCommonName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMolCommonName(String value) {
            this.molCommonName = value;
        }

    }

}
