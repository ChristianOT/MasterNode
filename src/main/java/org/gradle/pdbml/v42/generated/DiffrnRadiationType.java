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
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the DIFFRN_RADIATION category describe
 * the radiation used in measuring the diffraction intensities,
 * its collimation and monochromatization before the sample.
 * 
 * Post-sample treatment of the beam is described by data
 * items in the DIFFRN_DETECTOR category.
 * 
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:diffrn_radiationCategory>
 *    <PDBx:diffrn_radiation diffrn_id="set1">
 *       <PDBx:collimation>0.3 mm double pinhole</PDBx:collimation>
 *       <PDBx:monochromator>graphite</PDBx:monochromator>
 *       <PDBx:type>Cu K\a</PDBx:type>
 *       <PDBx:wavelength_id>1</PDBx:wavelength_id>
 *    </PDBx:diffrn_radiation>
 * </PDBx:diffrn_radiationCategory>
 * 
 * 
 *     Example 2 - based on data set TOZ of Willis, Beckwith & Tozer
 *                 [Acta Cryst. (1991), C47, 2276-2277].
 * <PDBx:diffrn_radiationCategory>
 *    <PDBx:diffrn_radiation diffrn_id="set1">
 *       <PDBx:monochromator>graphite</PDBx:monochromator>
 *       <PDBx:type>Cu K\a</PDBx:type>
 *       <PDBx:wavelength_id>1</PDBx:wavelength_id>
 *    </PDBx:diffrn_radiation>
 * </PDBx:diffrn_radiationCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for diffrn_radiationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diffrn_radiationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diffrn_radiation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="collimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="filter_edge" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="inhomogeneity" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="monochromator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_analyzer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_diffrn_protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_monochromatic_or_laue_m_l" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="M"/>
 *                         &lt;enumeration value="L"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_scattering_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="x-ray"/>
 *                         &lt;enumeration value="neutron"/>
 *                         &lt;enumeration value="electron"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_wavelength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_wavelength_list" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="polarisn_norm" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="polarisn_ratio" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="probe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="x-ray"/>
 *                         &lt;enumeration value="neutron"/>
 *                         &lt;enumeration value="electron"/>
 *                         &lt;enumeration value="gamma"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="wavelength_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="xray_symbol" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="K-L~3~"/>
 *                         &lt;enumeration value="K-L~2~"/>
 *                         &lt;enumeration value="K-M~3~"/>
 *                         &lt;enumeration value="K-L~2,3~"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
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
@XmlType(name = "diffrn_radiationType", propOrder = {
    "diffrnRadiation"
})
public class DiffrnRadiationType {

    @XmlElement(name = "diffrn_radiation")
    protected List<DiffrnRadiationType.DiffrnRadiation> diffrnRadiation;

    /**
     * Gets the value of the diffrnRadiation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diffrnRadiation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiffrnRadiation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiffrnRadiationType.DiffrnRadiation }
     * 
     * 
     */
    public List<DiffrnRadiationType.DiffrnRadiation> getDiffrnRadiation() {
        if (diffrnRadiation == null) {
            diffrnRadiation = new ArrayList<DiffrnRadiationType.DiffrnRadiation>();
        }
        return this.diffrnRadiation;
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
     *         &lt;element name="collimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="filter_edge" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="inhomogeneity" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="monochromator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_analyzer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_diffrn_protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_monochromatic_or_laue_m_l" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="M"/>
     *               &lt;enumeration value="L"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_scattering_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="x-ray"/>
     *               &lt;enumeration value="neutron"/>
     *               &lt;enumeration value="electron"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_wavelength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_wavelength_list" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="polarisn_norm" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="polarisn_ratio" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="probe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="x-ray"/>
     *               &lt;enumeration value="neutron"/>
     *               &lt;enumeration value="electron"/>
     *               &lt;enumeration value="gamma"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="wavelength_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="xray_symbol" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="K-L~3~"/>
     *               &lt;enumeration value="K-L~2~"/>
     *               &lt;enumeration value="K-M~3~"/>
     *               &lt;enumeration value="K-L~2,3~"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
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
    public static class DiffrnRadiation {

        @XmlElementRef(name = "collimation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> collimation;
        @XmlElementRef(name = "filter_edge", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> filterEdge;
        @XmlElementRef(name = "inhomogeneity", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> inhomogeneity;
        @XmlElementRef(name = "monochromator", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> monochromator;
        @XmlElementRef(name = "pdbx_analyzer", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAnalyzer;
        @XmlElementRef(name = "pdbx_diffrn_protocol", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDiffrnProtocol;
        @XmlElementRef(name = "pdbx_monochromatic_or_laue_m_l", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxMonochromaticOrLaueML;
        @XmlElementRef(name = "pdbx_scattering_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxScatteringType;
        @XmlElementRef(name = "pdbx_wavelength", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxWavelength;
        @XmlElementRef(name = "pdbx_wavelength_list", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxWavelengthList;
        @XmlElementRef(name = "polarisn_norm", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> polarisnNorm;
        @XmlElementRef(name = "polarisn_ratio", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> polarisnRatio;
        @XmlElementRef(name = "probe", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> probe;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlElementRef(name = "wavelength_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> wavelengthId;
        @XmlElementRef(name = "xray_symbol", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> xraySymbol;
        @XmlAttribute(name = "diffrn_id", required = true)
        protected String diffrnId;

        /**
         * Gets the value of the collimation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCollimation() {
            return collimation;
        }

        /**
         * Sets the value of the collimation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCollimation(JAXBElement<String> value) {
            this.collimation = value;
        }

        /**
         * Gets the value of the filterEdge property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFilterEdge() {
            return filterEdge;
        }

        /**
         * Sets the value of the filterEdge property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFilterEdge(JAXBElement<BigDecimal> value) {
            this.filterEdge = value;
        }

        /**
         * Gets the value of the inhomogeneity property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getInhomogeneity() {
            return inhomogeneity;
        }

        /**
         * Sets the value of the inhomogeneity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setInhomogeneity(JAXBElement<BigDecimal> value) {
            this.inhomogeneity = value;
        }

        /**
         * Gets the value of the monochromator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMonochromator() {
            return monochromator;
        }

        /**
         * Sets the value of the monochromator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMonochromator(JAXBElement<String> value) {
            this.monochromator = value;
        }

        /**
         * Gets the value of the pdbxAnalyzer property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAnalyzer() {
            return pdbxAnalyzer;
        }

        /**
         * Sets the value of the pdbxAnalyzer property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAnalyzer(JAXBElement<String> value) {
            this.pdbxAnalyzer = value;
        }

        /**
         * Gets the value of the pdbxDiffrnProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDiffrnProtocol() {
            return pdbxDiffrnProtocol;
        }

        /**
         * Sets the value of the pdbxDiffrnProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDiffrnProtocol(JAXBElement<String> value) {
            this.pdbxDiffrnProtocol = value;
        }

        /**
         * Gets the value of the pdbxMonochromaticOrLaueML property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxMonochromaticOrLaueML() {
            return pdbxMonochromaticOrLaueML;
        }

        /**
         * Sets the value of the pdbxMonochromaticOrLaueML property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxMonochromaticOrLaueML(JAXBElement<String> value) {
            this.pdbxMonochromaticOrLaueML = value;
        }

        /**
         * Gets the value of the pdbxScatteringType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxScatteringType() {
            return pdbxScatteringType;
        }

        /**
         * Sets the value of the pdbxScatteringType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxScatteringType(JAXBElement<String> value) {
            this.pdbxScatteringType = value;
        }

        /**
         * Gets the value of the pdbxWavelength property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxWavelength() {
            return pdbxWavelength;
        }

        /**
         * Sets the value of the pdbxWavelength property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxWavelength(JAXBElement<String> value) {
            this.pdbxWavelength = value;
        }

        /**
         * Gets the value of the pdbxWavelengthList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxWavelengthList() {
            return pdbxWavelengthList;
        }

        /**
         * Sets the value of the pdbxWavelengthList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxWavelengthList(JAXBElement<String> value) {
            this.pdbxWavelengthList = value;
        }

        /**
         * Gets the value of the polarisnNorm property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPolarisnNorm() {
            return polarisnNorm;
        }

        /**
         * Sets the value of the polarisnNorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPolarisnNorm(JAXBElement<BigDecimal> value) {
            this.polarisnNorm = value;
        }

        /**
         * Gets the value of the polarisnRatio property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPolarisnRatio() {
            return polarisnRatio;
        }

        /**
         * Sets the value of the polarisnRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPolarisnRatio(JAXBElement<BigDecimal> value) {
            this.polarisnRatio = value;
        }

        /**
         * Gets the value of the probe property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getProbe() {
            return probe;
        }

        /**
         * Sets the value of the probe property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setProbe(JAXBElement<String> value) {
            this.probe = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
        }

        /**
         * Gets the value of the wavelengthId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWavelengthId() {
            return wavelengthId;
        }

        /**
         * Sets the value of the wavelengthId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWavelengthId(JAXBElement<String> value) {
            this.wavelengthId = value;
        }

        /**
         * Gets the value of the xraySymbol property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getXraySymbol() {
            return xraySymbol;
        }

        /**
         * Sets the value of the xraySymbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setXraySymbol(JAXBElement<String> value) {
            this.xraySymbol = value;
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
