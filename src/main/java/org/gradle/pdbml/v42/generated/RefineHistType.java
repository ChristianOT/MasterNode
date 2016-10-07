//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the REFINE_HIST category record details about the
 * steps during the refinement of the structure.
 * These data items are not meant to be as thorough a description
 * of the refinement as is provided for the final model in other
 * categories; rather, these data items provide a mechanism for
 * sketching out the progress of the refinement, supported by a
 * small set of representative statistics.
 * 
 *     Example 1 - based on laboratory records for the collagen-like
 *                 peptide [(POG)4 EKG (POG)5]3.
 * <PDBx:refine_histCategory>
 *    <PDBx:refine_hist cycle_id="C134" pdbx_refine_id="X-ray">
 *       <PDBx:R_factor_R_free>.274</PDBx:R_factor_R_free>
 *       <PDBx:R_factor_R_work>.160</PDBx:R_factor_R_work>
 *       <PDBx:R_factor_all>.265</PDBx:R_factor_all>
 *       <PDBx:R_factor_obs>.195</PDBx:R_factor_obs>
 *       <PDBx:d_res_high>1.85</PDBx:d_res_high>
 *       <PDBx:d_res_low>20.0</PDBx:d_res_low>
 *       <PDBx:details> Add majority of solvent molecules. B factors refined by
 * group. Continued to remove misplaced water molecules.</PDBx:details>
 *       <PDBx:number_atoms_solvent>217</PDBx:number_atoms_solvent>
 *       <PDBx:number_atoms_total>808</PDBx:number_atoms_total>
 *       <PDBx:number_reflns_R_free>476</PDBx:number_reflns_R_free>
 *       <PDBx:number_reflns_R_work>4410</PDBx:number_reflns_R_work>
 *       <PDBx:number_reflns_all>6174</PDBx:number_reflns_all>
 *       <PDBx:number_reflns_obs>4886</PDBx:number_reflns_obs>
 *    </PDBx:refine_hist>
 * </PDBx:refine_histCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refine_histType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refine_histType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refine_hist" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_factor_R_free" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_R_work" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_all" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="R_factor_obs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="d_res_high">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="d_res_low">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="number_atoms_solvent" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_atoms_total" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_R_free" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_R_work" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_all" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_reflns_obs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_B_iso_mean_ligand" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_B_iso_mean_solvent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_atoms_carb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_atoms_ligand" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_atoms_lipid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_atoms_nucleic_acid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_atoms_protein" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_residues_total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_pseudo_atom_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="cycle_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "refine_histType", propOrder = {
    "refineHist"
})
public class RefineHistType {

    @XmlElement(name = "refine_hist")
    protected List<RefineHistType.RefineHist> refineHist;

    /**
     * Gets the value of the refineHist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineHist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineHist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineHistType.RefineHist }
     * 
     * 
     */
    public List<RefineHistType.RefineHist> getRefineHist() {
        if (refineHist == null) {
            refineHist = new ArrayList<RefineHistType.RefineHist>();
        }
        return this.refineHist;
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
     *         &lt;element name="R_factor_R_free" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_R_work" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_all" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="R_factor_obs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="d_res_high">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="d_res_low">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="number_atoms_solvent" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_atoms_total" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_R_free" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_R_work" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_all" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_reflns_obs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_B_iso_mean_ligand" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_B_iso_mean_solvent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_number_atoms_carb" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_number_atoms_ligand" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_number_atoms_lipid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_number_atoms_nucleic_acid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_number_atoms_protein" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_number_residues_total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_pseudo_atom_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="cycle_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RefineHist {

        @XmlElementRef(name = "R_factor_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorRFree;
        @XmlElementRef(name = "R_factor_R_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorRWork;
        @XmlElementRef(name = "R_factor_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorAll;
        @XmlElementRef(name = "R_factor_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorObs;
        @XmlElement(name = "d_res_high", required = true, nillable = true)
        protected BigDecimal dResHigh;
        @XmlElement(name = "d_res_low", required = true, nillable = true)
        protected BigDecimal dResLow;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "number_atoms_solvent", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberAtomsSolvent;
        @XmlElementRef(name = "number_atoms_total", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberAtomsTotal;
        @XmlElementRef(name = "number_reflns_R_free", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsRFree;
        @XmlElementRef(name = "number_reflns_R_work", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsRWork;
        @XmlElementRef(name = "number_reflns_all", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsAll;
        @XmlElementRef(name = "number_reflns_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberReflnsObs;
        @XmlElementRef(name = "pdbx_B_iso_mean_ligand", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxBIsoMeanLigand;
        @XmlElementRef(name = "pdbx_B_iso_mean_solvent", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxBIsoMeanSolvent;
        @XmlElementRef(name = "pdbx_number_atoms_carb", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberAtomsCarb;
        @XmlElementRef(name = "pdbx_number_atoms_ligand", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberAtomsLigand;
        @XmlElementRef(name = "pdbx_number_atoms_lipid", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberAtomsLipid;
        @XmlElementRef(name = "pdbx_number_atoms_nucleic_acid", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberAtomsNucleicAcid;
        @XmlElementRef(name = "pdbx_number_atoms_protein", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberAtomsProtein;
        @XmlElementRef(name = "pdbx_number_residues_total", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberResiduesTotal;
        @XmlElementRef(name = "pdbx_pseudo_atom_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPseudoAtomDetails;
        @XmlAttribute(name = "cycle_id", required = true)
        protected String cycleId;
        @XmlAttribute(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;

        /**
         * Gets the value of the rFactorRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorRFree() {
            return rFactorRFree;
        }

        /**
         * Sets the value of the rFactorRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorRFree(JAXBElement<BigDecimal> value) {
            this.rFactorRFree = value;
        }

        /**
         * Gets the value of the rFactorRWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorRWork() {
            return rFactorRWork;
        }

        /**
         * Sets the value of the rFactorRWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorRWork(JAXBElement<BigDecimal> value) {
            this.rFactorRWork = value;
        }

        /**
         * Gets the value of the rFactorAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorAll() {
            return rFactorAll;
        }

        /**
         * Sets the value of the rFactorAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorAll(JAXBElement<BigDecimal> value) {
            this.rFactorAll = value;
        }

        /**
         * Gets the value of the rFactorObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorObs() {
            return rFactorObs;
        }

        /**
         * Sets the value of the rFactorObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorObs(JAXBElement<BigDecimal> value) {
            this.rFactorObs = value;
        }

        /**
         * Gets the value of the dResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDResHigh() {
            return dResHigh;
        }

        /**
         * Sets the value of the dResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDResHigh(BigDecimal value) {
            this.dResHigh = value;
        }

        /**
         * Gets the value of the dResLow property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDResLow() {
            return dResLow;
        }

        /**
         * Sets the value of the dResLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDResLow(BigDecimal value) {
            this.dResLow = value;
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
         * Gets the value of the numberAtomsSolvent property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberAtomsSolvent() {
            return numberAtomsSolvent;
        }

        /**
         * Sets the value of the numberAtomsSolvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberAtomsSolvent(JAXBElement<BigInteger> value) {
            this.numberAtomsSolvent = value;
        }

        /**
         * Gets the value of the numberAtomsTotal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberAtomsTotal() {
            return numberAtomsTotal;
        }

        /**
         * Sets the value of the numberAtomsTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberAtomsTotal(JAXBElement<BigInteger> value) {
            this.numberAtomsTotal = value;
        }

        /**
         * Gets the value of the numberReflnsRFree property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsRFree() {
            return numberReflnsRFree;
        }

        /**
         * Sets the value of the numberReflnsRFree property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsRFree(JAXBElement<BigInteger> value) {
            this.numberReflnsRFree = value;
        }

        /**
         * Gets the value of the numberReflnsRWork property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsRWork() {
            return numberReflnsRWork;
        }

        /**
         * Sets the value of the numberReflnsRWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsRWork(JAXBElement<BigInteger> value) {
            this.numberReflnsRWork = value;
        }

        /**
         * Gets the value of the numberReflnsAll property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsAll() {
            return numberReflnsAll;
        }

        /**
         * Sets the value of the numberReflnsAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsAll(JAXBElement<BigInteger> value) {
            this.numberReflnsAll = value;
        }

        /**
         * Gets the value of the numberReflnsObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberReflnsObs() {
            return numberReflnsObs;
        }

        /**
         * Sets the value of the numberReflnsObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberReflnsObs(JAXBElement<BigInteger> value) {
            this.numberReflnsObs = value;
        }

        /**
         * Gets the value of the pdbxBIsoMeanLigand property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxBIsoMeanLigand() {
            return pdbxBIsoMeanLigand;
        }

        /**
         * Sets the value of the pdbxBIsoMeanLigand property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxBIsoMeanLigand(JAXBElement<BigDecimal> value) {
            this.pdbxBIsoMeanLigand = value;
        }

        /**
         * Gets the value of the pdbxBIsoMeanSolvent property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxBIsoMeanSolvent() {
            return pdbxBIsoMeanSolvent;
        }

        /**
         * Sets the value of the pdbxBIsoMeanSolvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxBIsoMeanSolvent(JAXBElement<BigDecimal> value) {
            this.pdbxBIsoMeanSolvent = value;
        }

        /**
         * Gets the value of the pdbxNumberAtomsCarb property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberAtomsCarb() {
            return pdbxNumberAtomsCarb;
        }

        /**
         * Sets the value of the pdbxNumberAtomsCarb property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberAtomsCarb(JAXBElement<BigInteger> value) {
            this.pdbxNumberAtomsCarb = value;
        }

        /**
         * Gets the value of the pdbxNumberAtomsLigand property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberAtomsLigand() {
            return pdbxNumberAtomsLigand;
        }

        /**
         * Sets the value of the pdbxNumberAtomsLigand property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberAtomsLigand(JAXBElement<BigInteger> value) {
            this.pdbxNumberAtomsLigand = value;
        }

        /**
         * Gets the value of the pdbxNumberAtomsLipid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberAtomsLipid() {
            return pdbxNumberAtomsLipid;
        }

        /**
         * Sets the value of the pdbxNumberAtomsLipid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberAtomsLipid(JAXBElement<BigInteger> value) {
            this.pdbxNumberAtomsLipid = value;
        }

        /**
         * Gets the value of the pdbxNumberAtomsNucleicAcid property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberAtomsNucleicAcid() {
            return pdbxNumberAtomsNucleicAcid;
        }

        /**
         * Sets the value of the pdbxNumberAtomsNucleicAcid property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberAtomsNucleicAcid(JAXBElement<BigInteger> value) {
            this.pdbxNumberAtomsNucleicAcid = value;
        }

        /**
         * Gets the value of the pdbxNumberAtomsProtein property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberAtomsProtein() {
            return pdbxNumberAtomsProtein;
        }

        /**
         * Sets the value of the pdbxNumberAtomsProtein property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberAtomsProtein(JAXBElement<BigInteger> value) {
            this.pdbxNumberAtomsProtein = value;
        }

        /**
         * Gets the value of the pdbxNumberResiduesTotal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberResiduesTotal() {
            return pdbxNumberResiduesTotal;
        }

        /**
         * Sets the value of the pdbxNumberResiduesTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberResiduesTotal(JAXBElement<BigInteger> value) {
            this.pdbxNumberResiduesTotal = value;
        }

        /**
         * Gets the value of the pdbxPseudoAtomDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPseudoAtomDetails() {
            return pdbxPseudoAtomDetails;
        }

        /**
         * Sets the value of the pdbxPseudoAtomDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPseudoAtomDetails(JAXBElement<String> value) {
            this.pdbxPseudoAtomDetails = value;
        }

        /**
         * Gets the value of the cycleId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleId() {
            return cycleId;
        }

        /**
         * Sets the value of the cycleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleId(String value) {
            this.cycleId = value;
        }

        /**
         * Gets the value of the pdbxRefineId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxRefineId() {
            return pdbxRefineId;
        }

        /**
         * Sets the value of the pdbxRefineId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxRefineId(String value) {
            this.pdbxRefineId = value;
        }

    }

}
