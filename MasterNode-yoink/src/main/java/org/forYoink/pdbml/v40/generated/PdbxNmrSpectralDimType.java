//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_spectral_dimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_spectral_dimType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_spectral_dim" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_isotope_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="encoded_source_dimension_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="encoding_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="magnetization_linkage_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="sweep_width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="spectral_peak_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="spectral_region" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_spectral_dimType", propOrder = {
    "pdbxNmrSpectralDim"
})
public class PdbxNmrSpectralDimType {

    @XmlElement(name = "pdbx_nmr_spectral_dim")
    protected List<PdbxNmrSpectralDimType.PdbxNmrSpectralDim> pdbxNmrSpectralDim;

    /**
     * Gets the value of the pdbxNmrSpectralDim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSpectralDim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSpectralDim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSpectralDimType.PdbxNmrSpectralDim }
     * 
     * 
     */
    public List<PdbxNmrSpectralDimType.PdbxNmrSpectralDim> getPdbxNmrSpectralDim() {
        if (pdbxNmrSpectralDim == null) {
            pdbxNmrSpectralDim = new ArrayList<PdbxNmrSpectralDimType.PdbxNmrSpectralDim>();
        }
        return this.pdbxNmrSpectralDim;
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
     *         &lt;element name="atom_isotope_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="encoded_source_dimension_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="encoding_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="magnetization_linkage_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="sweep_width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="atom_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="spectral_peak_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="spectral_region" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrSpectralDim {

        @XmlElement(name = "atom_isotope_number", required = true)
        protected BigInteger atomIsotopeNumber;
        @XmlElementRef(name = "encoded_source_dimension_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> encodedSourceDimensionId;
        @XmlElementRef(name = "encoding_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> encodingCode;
        @XmlElementRef(name = "magnetization_linkage_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> magnetizationLinkageId;
        @XmlElementRef(name = "sweep_width", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> sweepWidth;
        @XmlAttribute(name = "atom_type", required = true)
        protected String atomType;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;
        @XmlAttribute(name = "spectral_peak_list_id", required = true)
        protected BigInteger spectralPeakListId;
        @XmlAttribute(name = "spectral_region", required = true)
        protected String spectralRegion;

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
         * Gets the value of the encodedSourceDimensionId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getEncodedSourceDimensionId() {
            return encodedSourceDimensionId;
        }

        /**
         * Sets the value of the encodedSourceDimensionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setEncodedSourceDimensionId(JAXBElement<BigInteger> value) {
            this.encodedSourceDimensionId = value;
        }

        /**
         * Gets the value of the encodingCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEncodingCode() {
            return encodingCode;
        }

        /**
         * Sets the value of the encodingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEncodingCode(JAXBElement<String> value) {
            this.encodingCode = value;
        }

        /**
         * Gets the value of the magnetizationLinkageId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getMagnetizationLinkageId() {
            return magnetizationLinkageId;
        }

        /**
         * Sets the value of the magnetizationLinkageId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setMagnetizationLinkageId(JAXBElement<BigInteger> value) {
            this.magnetizationLinkageId = value;
        }

        /**
         * Gets the value of the sweepWidth property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSweepWidth() {
            return sweepWidth;
        }

        /**
         * Sets the value of the sweepWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSweepWidth(JAXBElement<BigDecimal> value) {
            this.sweepWidth = value;
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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

        /**
         * Gets the value of the spectralPeakListId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSpectralPeakListId() {
            return spectralPeakListId;
        }

        /**
         * Sets the value of the spectralPeakListId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSpectralPeakListId(BigInteger value) {
            this.spectralPeakListId = value;
        }

        /**
         * Gets the value of the spectralRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpectralRegion() {
            return spectralRegion;
        }

        /**
         * Sets the value of the spectralRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpectralRegion(String value) {
            this.spectralRegion = value;
        }

    }

}