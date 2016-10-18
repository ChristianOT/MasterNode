//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the DIFFRN_REFLNS_SHELL category record details about
 * the reflection data set within shells of resolution.
 * 
 * 
 *     Example 1 - diffraction properties with shells
 * <PDBx:pdbx_diffrn_reflns_shellCategory>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="5.18" d_res_low="50.00" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.029</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.154</PDBx:chi_squared>
 *       <PDBx:number_obs>11791</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="4.11" d_res_low="5.18" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.033</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.098</PDBx:chi_squared>
 *       <PDBx:number_obs>11717</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="3.59" d_res_low="4.11" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.043</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.044</PDBx:chi_squared>
 *       <PDBx:number_obs>11792</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="3.26" d_res_low="3.59" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.059</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.104</PDBx:chi_squared>
 *       <PDBx:number_obs>11718</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="3.03" d_res_low="3.26" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.087</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.160</PDBx:chi_squared>
 *       <PDBx:number_obs>11753</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="2.85" d_res_low="3.03" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.130</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.169</PDBx:chi_squared>
 *       <PDBx:number_obs>11811</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="2.71" d_res_low="2.85" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.174</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.170</PDBx:chi_squared>
 *       <PDBx:number_obs>11752</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 *    <PDBx:pdbx_diffrn_reflns_shell d_res_high="2.59" d_res_low="2.71" diffrn_id="1">
 *       <PDBx:Rmerge_I_obs>0.227</PDBx:Rmerge_I_obs>
 *       <PDBx:chi_squared>1.165</PDBx:chi_squared>
 *       <PDBx:number_obs>11767</PDBx:number_obs>
 *       <PDBx:percent_possible_obs>100.000</PDBx:percent_possible_obs>
 *    </PDBx:pdbx_diffrn_reflns_shell>
 * </PDBx:pdbx_diffrn_reflns_shellCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_diffrn_reflns_shellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_diffrn_reflns_shellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_diffrn_reflns_shell" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Rmerge_I_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Rsym_value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="chi_squared" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="number_obs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="percent_possible_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="redundancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rejects" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="d_res_high" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="d_res_low" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_diffrn_reflns_shellType", propOrder = {
    "pdbxDiffrnReflnsShell"
})
public class PdbxDiffrnReflnsShellType {

    @XmlElement(name = "pdbx_diffrn_reflns_shell")
    protected List<PdbxDiffrnReflnsShellType.PdbxDiffrnReflnsShell> pdbxDiffrnReflnsShell;

    /**
     * Gets the value of the pdbxDiffrnReflnsShell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxDiffrnReflnsShell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxDiffrnReflnsShell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxDiffrnReflnsShellType.PdbxDiffrnReflnsShell }
     * 
     * 
     */
    public List<PdbxDiffrnReflnsShellType.PdbxDiffrnReflnsShell> getPdbxDiffrnReflnsShell() {
        if (pdbxDiffrnReflnsShell == null) {
            pdbxDiffrnReflnsShell = new ArrayList<PdbxDiffrnReflnsShellType.PdbxDiffrnReflnsShell>();
        }
        return this.pdbxDiffrnReflnsShell;
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
     *         &lt;element name="Rmerge_I_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Rsym_value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="chi_squared" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="number_obs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="percent_possible_obs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="redundancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rejects" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="d_res_high" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="d_res_low" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxDiffrnReflnsShell {

        @XmlElementRef(name = "Rmerge_I_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rmergeIObs;
        @XmlElementRef(name = "Rsym_value", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rsymValue;
        @XmlElementRef(name = "chi_squared", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> chiSquared;
        @XmlElementRef(name = "number_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberObs;
        @XmlElementRef(name = "percent_possible_obs", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> percentPossibleObs;
        @XmlElementRef(name = "redundancy", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> redundancy;
        @XmlElementRef(name = "rejects", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> rejects;
        @XmlAttribute(name = "d_res_high", required = true)
        protected BigDecimal dResHigh;
        @XmlAttribute(name = "d_res_low", required = true)
        protected BigDecimal dResLow;
        @XmlAttribute(name = "diffrn_id", required = true)
        protected String diffrnId;

        /**
         * Gets the value of the rmergeIObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRmergeIObs() {
            return rmergeIObs;
        }

        /**
         * Sets the value of the rmergeIObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRmergeIObs(JAXBElement<BigDecimal> value) {
            this.rmergeIObs = value;
        }

        /**
         * Gets the value of the rsymValue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRsymValue() {
            return rsymValue;
        }

        /**
         * Sets the value of the rsymValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRsymValue(JAXBElement<BigDecimal> value) {
            this.rsymValue = value;
        }

        /**
         * Gets the value of the chiSquared property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getChiSquared() {
            return chiSquared;
        }

        /**
         * Sets the value of the chiSquared property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setChiSquared(JAXBElement<BigDecimal> value) {
            this.chiSquared = value;
        }

        /**
         * Gets the value of the numberObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberObs() {
            return numberObs;
        }

        /**
         * Sets the value of the numberObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberObs(JAXBElement<BigInteger> value) {
            this.numberObs = value;
        }

        /**
         * Gets the value of the percentPossibleObs property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPercentPossibleObs() {
            return percentPossibleObs;
        }

        /**
         * Sets the value of the percentPossibleObs property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPercentPossibleObs(JAXBElement<BigDecimal> value) {
            this.percentPossibleObs = value;
        }

        /**
         * Gets the value of the redundancy property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRedundancy() {
            return redundancy;
        }

        /**
         * Sets the value of the redundancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRedundancy(JAXBElement<BigDecimal> value) {
            this.redundancy = value;
        }

        /**
         * Gets the value of the rejects property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getRejects() {
            return rejects;
        }

        /**
         * Sets the value of the rejects property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setRejects(JAXBElement<BigInteger> value) {
            this.rejects = value;
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
         * Gets the value of the diffrnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiffrnId() {
            return diffrnId;
        }

        /**
         * Sets the value of the diffrnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiffrnId(String value) {
            this.diffrnId = value;
        }

    }

}
