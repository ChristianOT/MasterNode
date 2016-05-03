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
 * Data items in the PDBX_PHASING_MAD_SHELL category record details about
 * the phasing of the structure, when methods involving multiple
 * anomalous dispersion techniques are involved (note: the
 * values are overall, but broken down into shells of resolution) 
 * 
 * 
 *     Example 1 - 
 * <PDBx:pdbx_phasing_MAD_shellCategory>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="7.77" d_res_low="22.60">
 *       <PDBx:fom_acentric>0.886</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.641</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>64</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>23</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="5.67" d_res_low="7.77">
 *       <PDBx:fom_acentric>0.863</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.642</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>132</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>32</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="4.68" d_res_low="5.67">
 *       <PDBx:fom_acentric>0.842</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.737</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>182</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>27</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="4.07" d_res_low="4.68">
 *       <PDBx:fom_acentric>0.789</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.682</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>209</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>24</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="3.65" d_res_low="4.07">
 *       <PDBx:fom_acentric>0.772</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.633</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>246</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>27</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 *    <PDBx:pdbx_phasing_MAD_shell d_res_high="3.34" d_res_low="3.65">
 *       <PDBx:fom_acentric>0.752</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.700</PDBx:fom_centric>
 *       <PDBx:reflns_acentric>260</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>31</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_MAD_shell>
 * </PDBx:pdbx_phasing_MAD_shellCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_phasing_MAD_shellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_phasing_MAD_shellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_phasing_MAD_shell" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_cullis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_cullis_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_cullis_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_kraut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_kraut_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_kraut_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="loc_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="loc_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="power_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="power_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="d_res_high" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="d_res_low" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
@XmlType(name = "pdbx_phasing_MAD_shellType", propOrder = {
    "pdbxPhasingMADShell"
})
public class PdbxPhasingMADShellType {

    @XmlElement(name = "pdbx_phasing_MAD_shell")
    protected List<PdbxPhasingMADShellType.PdbxPhasingMADShell> pdbxPhasingMADShell;

    /**
     * Gets the value of the pdbxPhasingMADShell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPhasingMADShell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPhasingMADShell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPhasingMADShellType.PdbxPhasingMADShell }
     * 
     * 
     */
    public List<PdbxPhasingMADShellType.PdbxPhasingMADShell> getPdbxPhasingMADShell() {
        if (pdbxPhasingMADShell == null) {
            pdbxPhasingMADShell = new ArrayList<PdbxPhasingMADShellType.PdbxPhasingMADShell>();
        }
        return this.pdbxPhasingMADShell;
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
     *         &lt;element name="R_cullis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_cullis_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_cullis_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_kraut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_kraut_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_kraut_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="loc_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="loc_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="power_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="power_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="d_res_high" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="d_res_low" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
    public static class PdbxPhasingMADShell {

        @XmlElementRef(name = "R_cullis", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rCullis;
        @XmlElementRef(name = "R_cullis_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rCullisAcentric;
        @XmlElementRef(name = "R_cullis_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rCullisCentric;
        @XmlElementRef(name = "R_kraut", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rKraut;
        @XmlElementRef(name = "R_kraut_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rKrautAcentric;
        @XmlElementRef(name = "R_kraut_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rKrautCentric;
        @XmlElementRef(name = "fom", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fom;
        @XmlElementRef(name = "fom_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fomAcentric;
        @XmlElementRef(name = "fom_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fomCentric;
        @XmlElementRef(name = "loc", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> loc;
        @XmlElementRef(name = "loc_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> locAcentric;
        @XmlElementRef(name = "loc_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> locCentric;
        @XmlElementRef(name = "power", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> power;
        @XmlElementRef(name = "power_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> powerAcentric;
        @XmlElementRef(name = "power_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> powerCentric;
        @XmlElementRef(name = "reflns", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> reflns;
        @XmlElementRef(name = "reflns_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> reflnsAcentric;
        @XmlElementRef(name = "reflns_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> reflnsCentric;
        @XmlAttribute(name = "d_res_high", required = true)
        protected BigDecimal dResHigh;
        @XmlAttribute(name = "d_res_low", required = true)
        protected BigDecimal dResLow;

        /**
         * Gets the value of the rCullis property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRCullis() {
            return rCullis;
        }

        /**
         * Sets the value of the rCullis property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRCullis(JAXBElement<BigDecimal> value) {
            this.rCullis = value;
        }

        /**
         * Gets the value of the rCullisAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRCullisAcentric() {
            return rCullisAcentric;
        }

        /**
         * Sets the value of the rCullisAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRCullisAcentric(JAXBElement<BigDecimal> value) {
            this.rCullisAcentric = value;
        }

        /**
         * Gets the value of the rCullisCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRCullisCentric() {
            return rCullisCentric;
        }

        /**
         * Sets the value of the rCullisCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRCullisCentric(JAXBElement<BigDecimal> value) {
            this.rCullisCentric = value;
        }

        /**
         * Gets the value of the rKraut property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRKraut() {
            return rKraut;
        }

        /**
         * Sets the value of the rKraut property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRKraut(JAXBElement<BigDecimal> value) {
            this.rKraut = value;
        }

        /**
         * Gets the value of the rKrautAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRKrautAcentric() {
            return rKrautAcentric;
        }

        /**
         * Sets the value of the rKrautAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRKrautAcentric(JAXBElement<BigDecimal> value) {
            this.rKrautAcentric = value;
        }

        /**
         * Gets the value of the rKrautCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRKrautCentric() {
            return rKrautCentric;
        }

        /**
         * Sets the value of the rKrautCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRKrautCentric(JAXBElement<BigDecimal> value) {
            this.rKrautCentric = value;
        }

        /**
         * Gets the value of the fom property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFom() {
            return fom;
        }

        /**
         * Sets the value of the fom property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFom(JAXBElement<BigDecimal> value) {
            this.fom = value;
        }

        /**
         * Gets the value of the fomAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFomAcentric() {
            return fomAcentric;
        }

        /**
         * Sets the value of the fomAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFomAcentric(JAXBElement<BigDecimal> value) {
            this.fomAcentric = value;
        }

        /**
         * Gets the value of the fomCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFomCentric() {
            return fomCentric;
        }

        /**
         * Sets the value of the fomCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFomCentric(JAXBElement<BigDecimal> value) {
            this.fomCentric = value;
        }

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLoc() {
            return loc;
        }

        /**
         * Sets the value of the loc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLoc(JAXBElement<BigDecimal> value) {
            this.loc = value;
        }

        /**
         * Gets the value of the locAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLocAcentric() {
            return locAcentric;
        }

        /**
         * Sets the value of the locAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLocAcentric(JAXBElement<BigDecimal> value) {
            this.locAcentric = value;
        }

        /**
         * Gets the value of the locCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLocCentric() {
            return locCentric;
        }

        /**
         * Sets the value of the locCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLocCentric(JAXBElement<BigDecimal> value) {
            this.locCentric = value;
        }

        /**
         * Gets the value of the power property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPower() {
            return power;
        }

        /**
         * Sets the value of the power property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPower(JAXBElement<BigDecimal> value) {
            this.power = value;
        }

        /**
         * Gets the value of the powerAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPowerAcentric() {
            return powerAcentric;
        }

        /**
         * Sets the value of the powerAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPowerAcentric(JAXBElement<BigDecimal> value) {
            this.powerAcentric = value;
        }

        /**
         * Gets the value of the powerCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPowerCentric() {
            return powerCentric;
        }

        /**
         * Sets the value of the powerCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPowerCentric(JAXBElement<BigDecimal> value) {
            this.powerCentric = value;
        }

        /**
         * Gets the value of the reflns property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getReflns() {
            return reflns;
        }

        /**
         * Sets the value of the reflns property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setReflns(JAXBElement<BigInteger> value) {
            this.reflns = value;
        }

        /**
         * Gets the value of the reflnsAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getReflnsAcentric() {
            return reflnsAcentric;
        }

        /**
         * Sets the value of the reflnsAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setReflnsAcentric(JAXBElement<BigDecimal> value) {
            this.reflnsAcentric = value;
        }

        /**
         * Gets the value of the reflnsCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getReflnsCentric() {
            return reflnsCentric;
        }

        /**
         * Sets the value of the reflnsCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setReflnsCentric(JAXBElement<BigInteger> value) {
            this.reflnsCentric = value;
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

    }

}
