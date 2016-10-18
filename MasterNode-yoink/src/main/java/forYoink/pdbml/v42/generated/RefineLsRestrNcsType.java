//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the REFINE_LS_RESTR_NCS category record details
 * about the restraints applied to atom positions in domains
 * related by noncrystallographic symmetry during least-squares
 * refinement, and also about the deviation of the restrained
 * atomic parameters at the end of the refinement.  It is
 * expected that these values will only be reported once for each
 * set of restrained domains.
 * 
 *     Example 1 - based on laboratory records for the collagen-like
 *                 peptide, HYP-.
 * <PDBx:refine_ls_restr_ncsCategory>
 *    <PDBx:refine_ls_restr_ncs pdbx_ordinal="1">
 *       <PDBx:dom_id>d2</PDBx:dom_id>
 *       <PDBx:ncs_model_details>
 * NCS restraint for pseudo-twofold symmetry between domains
 * d1 and d2.  Position weight coefficient given in
 * Kcal/(mol \&#37;A^2^) and isotropic B weight coefficient given
 * in \&#37;A^2^.</PDBx:ncs_model_details>
 *       <PDBx:pdbx_asym_id>A</PDBx:pdbx_asym_id>
 *       <PDBx:pdbx_ens_id>1</PDBx:pdbx_ens_id>
 *       <PDBx:pdbx_refine_id>X-ray</PDBx:pdbx_refine_id>
 *       <PDBx:pdbx_type>medium positional</PDBx:pdbx_type>
 *       <PDBx:rms_dev_B_iso>0.16</PDBx:rms_dev_B_iso>
 *       <PDBx:rms_dev_position>0.09</PDBx:rms_dev_position>
 *       <PDBx:weight_B_iso>2.0</PDBx:weight_B_iso>
 *       <PDBx:weight_position>300.0</PDBx:weight_position>
 *    </PDBx:refine_ls_restr_ncs>
 * </PDBx:refine_ls_restr_ncsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refine_ls_restr_ncsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refine_ls_restr_ncsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refine_ls_restr_ncs" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="dom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ncs_model_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pdbx_ens_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pdbx_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_refine_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pdbx_rms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pdbx_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rms_dev_B_iso" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rms_dev_position" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="weight_B_iso" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="weight_position" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="pdbx_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "refine_ls_restr_ncsType", propOrder = {
    "refineLsRestrNcs"
})
public class RefineLsRestrNcsType {

    @XmlElement(name = "refine_ls_restr_ncs")
    protected List<RefineLsRestrNcsType.RefineLsRestrNcs> refineLsRestrNcs;

    /**
     * Gets the value of the refineLsRestrNcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineLsRestrNcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineLsRestrNcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineLsRestrNcsType.RefineLsRestrNcs }
     * 
     * 
     */
    public List<RefineLsRestrNcsType.RefineLsRestrNcs> getRefineLsRestrNcs() {
        if (refineLsRestrNcs == null) {
            refineLsRestrNcs = new ArrayList<RefineLsRestrNcsType.RefineLsRestrNcs>();
        }
        return this.refineLsRestrNcs;
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
     *         &lt;element name="dom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ncs_model_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pdbx_ens_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pdbx_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_refine_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pdbx_rms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pdbx_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rms_dev_B_iso" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="rms_dev_position" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="weight_B_iso" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="weight_position" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="pdbx_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class RefineLsRestrNcs {

        @XmlElement(name = "dom_id", required = true)
        protected String domId;
        @XmlElementRef(name = "ncs_model_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ncsModelDetails;
        @XmlElementRef(name = "pdbx_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAsymId;
        @XmlElement(name = "pdbx_auth_asym_id", required = true, nillable = true)
        protected String pdbxAuthAsymId;
        @XmlElement(name = "pdbx_ens_id", required = true)
        protected String pdbxEnsId;
        @XmlElementRef(name = "pdbx_number", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumber;
        @XmlElement(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;
        @XmlElementRef(name = "pdbx_rms", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRms;
        @XmlElement(name = "pdbx_type", required = true, nillable = true)
        protected String pdbxType;
        @XmlElementRef(name = "pdbx_weight", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxWeight;
        @XmlElementRef(name = "rms_dev_B_iso", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rmsDevBIso;
        @XmlElementRef(name = "rms_dev_position", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rmsDevPosition;
        @XmlElementRef(name = "weight_B_iso", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> weightBIso;
        @XmlElementRef(name = "weight_position", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> weightPosition;
        @XmlAttribute(name = "pdbx_ordinal", required = true)
        protected BigInteger pdbxOrdinal;

        /**
         * Gets the value of the domId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomId() {
            return domId;
        }

        /**
         * Sets the value of the domId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomId(String value) {
            this.domId = value;
        }

        /**
         * Gets the value of the ncsModelDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNcsModelDetails() {
            return ncsModelDetails;
        }

        /**
         * Sets the value of the ncsModelDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNcsModelDetails(JAXBElement<String> value) {
            this.ncsModelDetails = value;
        }

        /**
         * Gets the value of the pdbxAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAsymId() {
            return pdbxAsymId;
        }

        /**
         * Sets the value of the pdbxAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAsymId(JAXBElement<String> value) {
            this.pdbxAsymId = value;
        }

        /**
         * Gets the value of the pdbxAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxAuthAsymId() {
            return pdbxAuthAsymId;
        }

        /**
         * Sets the value of the pdbxAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxAuthAsymId(String value) {
            this.pdbxAuthAsymId = value;
        }

        /**
         * Gets the value of the pdbxEnsId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxEnsId() {
            return pdbxEnsId;
        }

        /**
         * Sets the value of the pdbxEnsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxEnsId(String value) {
            this.pdbxEnsId = value;
        }

        /**
         * Gets the value of the pdbxNumber property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumber() {
            return pdbxNumber;
        }

        /**
         * Sets the value of the pdbxNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumber(JAXBElement<BigInteger> value) {
            this.pdbxNumber = value;
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

        /**
         * Gets the value of the pdbxRms property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRms() {
            return pdbxRms;
        }

        /**
         * Sets the value of the pdbxRms property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRms(JAXBElement<BigDecimal> value) {
            this.pdbxRms = value;
        }

        /**
         * Gets the value of the pdbxType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxType() {
            return pdbxType;
        }

        /**
         * Sets the value of the pdbxType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxType(String value) {
            this.pdbxType = value;
        }

        /**
         * Gets the value of the pdbxWeight property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxWeight() {
            return pdbxWeight;
        }

        /**
         * Sets the value of the pdbxWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxWeight(JAXBElement<BigDecimal> value) {
            this.pdbxWeight = value;
        }

        /**
         * Gets the value of the rmsDevBIso property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRmsDevBIso() {
            return rmsDevBIso;
        }

        /**
         * Sets the value of the rmsDevBIso property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRmsDevBIso(JAXBElement<BigDecimal> value) {
            this.rmsDevBIso = value;
        }

        /**
         * Gets the value of the rmsDevPosition property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRmsDevPosition() {
            return rmsDevPosition;
        }

        /**
         * Sets the value of the rmsDevPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRmsDevPosition(JAXBElement<BigDecimal> value) {
            this.rmsDevPosition = value;
        }

        /**
         * Gets the value of the weightBIso property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWeightBIso() {
            return weightBIso;
        }

        /**
         * Sets the value of the weightBIso property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWeightBIso(JAXBElement<BigDecimal> value) {
            this.weightBIso = value;
        }

        /**
         * Gets the value of the weightPosition property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWeightPosition() {
            return weightPosition;
        }

        /**
         * Sets the value of the weightPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWeightPosition(JAXBElement<BigDecimal> value) {
            this.weightPosition = value;
        }

        /**
         * Gets the value of the pdbxOrdinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPdbxOrdinal() {
            return pdbxOrdinal;
        }

        /**
         * Sets the value of the pdbxOrdinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPdbxOrdinal(BigInteger value) {
            this.pdbxOrdinal = value;
        }

    }

}
