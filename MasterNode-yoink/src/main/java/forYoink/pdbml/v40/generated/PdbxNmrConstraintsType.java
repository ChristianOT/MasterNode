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
 * This section provides a tabulation of constraint data. 
 *  This example uses the data from the MCP-1 structure determination. Remember
 *   this is a dimer so there are intersubunit constraints as well as intrasubunit
 *   constraints.
 * <PDBx:pdbx_nmr_constraintsCategory>
 *    <PDBx:pdbx_nmr_constraints entry_id="1ABC">
 *       <PDBx:NOE_constraints_total>4458</PDBx:NOE_constraints_total>
 *       <PDBx:NOE_intraresidue_total_count>1144</PDBx:NOE_intraresidue_total_count>
 *       <PDBx:NOE_long_range_total_count>1356</PDBx:NOE_long_range_total_count>
 *       <PDBx:NOE_medium_range_total_count>1004</PDBx:NOE_medium_range_total_count>
 *       <PDBx:NOE_sequential_total_count>272</PDBx:NOE_sequential_total_count>
 *       <PDBx:protein_phi_angle_constraints_total_count>96</PDBx:protein_phi_angle_constraints_total_count>
 *    </PDBx:pdbx_nmr_constraints>
 * </PDBx:pdbx_nmr_constraintsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_constraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_constraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_constraints" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="NA_alpha-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_beta-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_chi-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_delta-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_epsilon-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_gamma-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_other-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NA_sugar_pucker_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_constraints_total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_interentity_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_interproton_distance_evaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOE_intraresidue_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_long_range_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_medium_range_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NOE_motional_averaging_correction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOE_pseudoatom_corrections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOE_sequential_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="disulfide_bond_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="hydrogen_bond_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="protein_chi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="protein_other_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="protein_phi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="protein_psi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_constraintsType", propOrder = {
    "pdbxNmrConstraints"
})
public class PdbxNmrConstraintsType {

    @XmlElement(name = "pdbx_nmr_constraints")
    protected List<PdbxNmrConstraintsType.PdbxNmrConstraints> pdbxNmrConstraints;

    /**
     * Gets the value of the pdbxNmrConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrConstraintsType.PdbxNmrConstraints }
     * 
     * 
     */
    public List<PdbxNmrConstraintsType.PdbxNmrConstraints> getPdbxNmrConstraints() {
        if (pdbxNmrConstraints == null) {
            pdbxNmrConstraints = new ArrayList<PdbxNmrConstraintsType.PdbxNmrConstraints>();
        }
        return this.pdbxNmrConstraints;
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
     *         &lt;element name="NA_alpha-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_beta-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_chi-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_delta-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_epsilon-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_gamma-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_other-angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NA_sugar_pucker_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_constraints_total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_interentity_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_interproton_distance_evaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOE_intraresidue_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_long_range_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_medium_range_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NOE_motional_averaging_correction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOE_pseudoatom_corrections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOE_sequential_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="disulfide_bond_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="hydrogen_bond_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="protein_chi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="protein_other_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="protein_phi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="protein_psi_angle_constraints_total_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrConstraints {

        @XmlElementRef(name = "NA_alpha-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naAlphaAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_beta-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naBetaAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_chi-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naChiAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_delta-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naDeltaAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_epsilon-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naEpsilonAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_gamma-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naGammaAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_other-angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naOtherAngleConstraintsTotalCount;
        @XmlElementRef(name = "NA_sugar_pucker_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> naSugarPuckerConstraintsTotalCount;
        @XmlElementRef(name = "NOE_constraints_total", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeConstraintsTotal;
        @XmlElementRef(name = "NOE_interentity_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeInterentityTotalCount;
        @XmlElementRef(name = "NOE_interproton_distance_evaluation", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> noeInterprotonDistanceEvaluation;
        @XmlElementRef(name = "NOE_intraresidue_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeIntraresidueTotalCount;
        @XmlElementRef(name = "NOE_long_range_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeLongRangeTotalCount;
        @XmlElementRef(name = "NOE_medium_range_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeMediumRangeTotalCount;
        @XmlElementRef(name = "NOE_motional_averaging_correction", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> noeMotionalAveragingCorrection;
        @XmlElementRef(name = "NOE_pseudoatom_corrections", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> noePseudoatomCorrections;
        @XmlElementRef(name = "NOE_sequential_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> noeSequentialTotalCount;
        @XmlElementRef(name = "disulfide_bond_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> disulfideBondConstraintsTotalCount;
        @XmlElementRef(name = "hydrogen_bond_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> hydrogenBondConstraintsTotalCount;
        @XmlElementRef(name = "protein_chi_angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> proteinChiAngleConstraintsTotalCount;
        @XmlElementRef(name = "protein_other_angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> proteinOtherAngleConstraintsTotalCount;
        @XmlElementRef(name = "protein_phi_angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> proteinPhiAngleConstraintsTotalCount;
        @XmlElementRef(name = "protein_psi_angle_constraints_total_count", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> proteinPsiAngleConstraintsTotalCount;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the naAlphaAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNAAlphaAngleConstraintsTotalCount() {
            return naAlphaAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naAlphaAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNAAlphaAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naAlphaAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naBetaAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNABetaAngleConstraintsTotalCount() {
            return naBetaAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naBetaAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNABetaAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naBetaAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naChiAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNAChiAngleConstraintsTotalCount() {
            return naChiAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naChiAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNAChiAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naChiAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naDeltaAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNADeltaAngleConstraintsTotalCount() {
            return naDeltaAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naDeltaAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNADeltaAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naDeltaAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naEpsilonAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNAEpsilonAngleConstraintsTotalCount() {
            return naEpsilonAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naEpsilonAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNAEpsilonAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naEpsilonAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naGammaAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNAGammaAngleConstraintsTotalCount() {
            return naGammaAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naGammaAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNAGammaAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naGammaAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naOtherAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNAOtherAngleConstraintsTotalCount() {
            return naOtherAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the naOtherAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNAOtherAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naOtherAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the naSugarPuckerConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNASugarPuckerConstraintsTotalCount() {
            return naSugarPuckerConstraintsTotalCount;
        }

        /**
         * Sets the value of the naSugarPuckerConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNASugarPuckerConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.naSugarPuckerConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the noeConstraintsTotal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOEConstraintsTotal() {
            return noeConstraintsTotal;
        }

        /**
         * Sets the value of the noeConstraintsTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOEConstraintsTotal(JAXBElement<BigInteger> value) {
            this.noeConstraintsTotal = value;
        }

        /**
         * Gets the value of the noeInterentityTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOEInterentityTotalCount() {
            return noeInterentityTotalCount;
        }

        /**
         * Sets the value of the noeInterentityTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOEInterentityTotalCount(JAXBElement<BigInteger> value) {
            this.noeInterentityTotalCount = value;
        }

        /**
         * Gets the value of the noeInterprotonDistanceEvaluation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNOEInterprotonDistanceEvaluation() {
            return noeInterprotonDistanceEvaluation;
        }

        /**
         * Sets the value of the noeInterprotonDistanceEvaluation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNOEInterprotonDistanceEvaluation(JAXBElement<String> value) {
            this.noeInterprotonDistanceEvaluation = value;
        }

        /**
         * Gets the value of the noeIntraresidueTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOEIntraresidueTotalCount() {
            return noeIntraresidueTotalCount;
        }

        /**
         * Sets the value of the noeIntraresidueTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOEIntraresidueTotalCount(JAXBElement<BigInteger> value) {
            this.noeIntraresidueTotalCount = value;
        }

        /**
         * Gets the value of the noeLongRangeTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOELongRangeTotalCount() {
            return noeLongRangeTotalCount;
        }

        /**
         * Sets the value of the noeLongRangeTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOELongRangeTotalCount(JAXBElement<BigInteger> value) {
            this.noeLongRangeTotalCount = value;
        }

        /**
         * Gets the value of the noeMediumRangeTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOEMediumRangeTotalCount() {
            return noeMediumRangeTotalCount;
        }

        /**
         * Sets the value of the noeMediumRangeTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOEMediumRangeTotalCount(JAXBElement<BigInteger> value) {
            this.noeMediumRangeTotalCount = value;
        }

        /**
         * Gets the value of the noeMotionalAveragingCorrection property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNOEMotionalAveragingCorrection() {
            return noeMotionalAveragingCorrection;
        }

        /**
         * Sets the value of the noeMotionalAveragingCorrection property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNOEMotionalAveragingCorrection(JAXBElement<String> value) {
            this.noeMotionalAveragingCorrection = value;
        }

        /**
         * Gets the value of the noePseudoatomCorrections property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNOEPseudoatomCorrections() {
            return noePseudoatomCorrections;
        }

        /**
         * Sets the value of the noePseudoatomCorrections property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNOEPseudoatomCorrections(JAXBElement<String> value) {
            this.noePseudoatomCorrections = value;
        }

        /**
         * Gets the value of the noeSequentialTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNOESequentialTotalCount() {
            return noeSequentialTotalCount;
        }

        /**
         * Sets the value of the noeSequentialTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNOESequentialTotalCount(JAXBElement<BigInteger> value) {
            this.noeSequentialTotalCount = value;
        }

        /**
         * Gets the value of the disulfideBondConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getDisulfideBondConstraintsTotalCount() {
            return disulfideBondConstraintsTotalCount;
        }

        /**
         * Sets the value of the disulfideBondConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setDisulfideBondConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.disulfideBondConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the hydrogenBondConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getHydrogenBondConstraintsTotalCount() {
            return hydrogenBondConstraintsTotalCount;
        }

        /**
         * Sets the value of the hydrogenBondConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setHydrogenBondConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.hydrogenBondConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the proteinChiAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getProteinChiAngleConstraintsTotalCount() {
            return proteinChiAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the proteinChiAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setProteinChiAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.proteinChiAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the proteinOtherAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getProteinOtherAngleConstraintsTotalCount() {
            return proteinOtherAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the proteinOtherAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setProteinOtherAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.proteinOtherAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the proteinPhiAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getProteinPhiAngleConstraintsTotalCount() {
            return proteinPhiAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the proteinPhiAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setProteinPhiAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.proteinPhiAngleConstraintsTotalCount = value;
        }

        /**
         * Gets the value of the proteinPsiAngleConstraintsTotalCount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getProteinPsiAngleConstraintsTotalCount() {
            return proteinPsiAngleConstraintsTotalCount;
        }

        /**
         * Sets the value of the proteinPsiAngleConstraintsTotalCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setProteinPsiAngleConstraintsTotalCount(JAXBElement<BigInteger> value) {
            this.proteinPsiAngleConstraintsTotalCount = value;
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

    }

}
