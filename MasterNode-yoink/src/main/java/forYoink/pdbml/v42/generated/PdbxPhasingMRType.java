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
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_PHASING_MR category record details about 
 * molecular replacement. 
 * 
 *     Example 1 - molecular replacement example from program CNS.
 * <PDBx:pdbx_phasing_MRCategory>
 *    <PDBx:pdbx_phasing_MR entry_id="ABC001">
 *       <PDBx:correlation_coeff_Fo_to_Fc>0.586</PDBx:correlation_coeff_Fo_to_Fc>
 *       <PDBx:d_res_high_rotation>3.8</PDBx:d_res_high_rotation>
 *       <PDBx:d_res_high_translation>4.0</PDBx:d_res_high_translation>
 *       <PDBx:d_res_low_rotation>13.0</PDBx:d_res_low_rotation>
 *       <PDBx:d_res_low_translation>15.0</PDBx:d_res_low_translation>
 *       <PDBx:method_rotation>real-space rotation search</PDBx:method_rotation>
 *       <PDBx:method_translation>gerneral using PC-refinement= e2e2</PDBx:method_translation>
 *       <PDBx:packing>0.3086</PDBx:packing>
 *       <PDBx:reflns_percent_rotation>97.8</PDBx:reflns_percent_rotation>
 *       <PDBx:reflns_percent_translation>97.7</PDBx:reflns_percent_translation>
 *       <PDBx:sigma_F_rotation>1.0</PDBx:sigma_F_rotation>
 *       <PDBx:sigma_F_translation>0</PDBx:sigma_F_translation>
 *    </PDBx:pdbx_phasing_MR>
 * </PDBx:pdbx_phasing_MRCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_phasing_MRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_phasing_MRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_phasing_MR" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_factor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_rigid_body" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="correlation_coeff_Fo_to_Fc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="correlation_coeff_Io_to_Ic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="d_res_high_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="d_res_high_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="d_res_low_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="d_res_low_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="method_rotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method_translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="model_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="native_set_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="packing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="reflns_percent_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="reflns_percent_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sigma_F_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sigma_F_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sigma_I_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sigma_I_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "pdbx_phasing_MRType", propOrder = {
    "pdbxPhasingMR"
})
public class PdbxPhasingMRType {

    @XmlElement(name = "pdbx_phasing_MR")
    protected List<PdbxPhasingMRType.PdbxPhasingMR> pdbxPhasingMR;

    /**
     * Gets the value of the pdbxPhasingMR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPhasingMR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPhasingMR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPhasingMRType.PdbxPhasingMR }
     * 
     * 
     */
    public List<PdbxPhasingMRType.PdbxPhasingMR> getPdbxPhasingMR() {
        if (pdbxPhasingMR == null) {
            pdbxPhasingMR = new ArrayList<PdbxPhasingMRType.PdbxPhasingMR>();
        }
        return this.pdbxPhasingMR;
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
     *         &lt;element name="R_factor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_rigid_body" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="correlation_coeff_Fo_to_Fc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="correlation_coeff_Io_to_Ic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="d_res_high_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="d_res_high_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="d_res_low_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="d_res_low_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="method_rotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method_translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="model_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="native_set_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="packing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="reflns_percent_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="reflns_percent_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="sigma_F_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="sigma_F_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="sigma_I_rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="sigma_I_translation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    public static class PdbxPhasingMR {

        @XmlElementRef(name = "R_factor", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactor;
        @XmlElementRef(name = "R_rigid_body", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rRigidBody;
        @XmlElementRef(name = "correlation_coeff_Fo_to_Fc", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> correlationCoeffFoToFc;
        @XmlElementRef(name = "correlation_coeff_Io_to_Ic", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> correlationCoeffIoToIc;
        @XmlElementRef(name = "d_res_high_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResHighRotation;
        @XmlElementRef(name = "d_res_high_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResHighTranslation;
        @XmlElementRef(name = "d_res_low_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResLowRotation;
        @XmlElementRef(name = "d_res_low_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dResLowTranslation;
        @XmlElementRef(name = "method_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> methodRotation;
        @XmlElementRef(name = "method_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> methodTranslation;
        @XmlElementRef(name = "model_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> modelDetails;
        @XmlElementRef(name = "native_set_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nativeSetId;
        @XmlElementRef(name = "packing", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> packing;
        @XmlElementRef(name = "reflns_percent_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> reflnsPercentRotation;
        @XmlElementRef(name = "reflns_percent_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> reflnsPercentTranslation;
        @XmlElementRef(name = "sigma_F_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> sigmaFRotation;
        @XmlElementRef(name = "sigma_F_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> sigmaFTranslation;
        @XmlElementRef(name = "sigma_I_rotation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> sigmaIRotation;
        @XmlElementRef(name = "sigma_I_translation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> sigmaITranslation;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the rFactor property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactor() {
            return rFactor;
        }

        /**
         * Sets the value of the rFactor property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactor(JAXBElement<BigDecimal> value) {
            this.rFactor = value;
        }

        /**
         * Gets the value of the rRigidBody property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRRigidBody() {
            return rRigidBody;
        }

        /**
         * Sets the value of the rRigidBody property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRRigidBody(JAXBElement<BigDecimal> value) {
            this.rRigidBody = value;
        }

        /**
         * Gets the value of the correlationCoeffFoToFc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getCorrelationCoeffFoToFc() {
            return correlationCoeffFoToFc;
        }

        /**
         * Sets the value of the correlationCoeffFoToFc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setCorrelationCoeffFoToFc(JAXBElement<BigDecimal> value) {
            this.correlationCoeffFoToFc = value;
        }

        /**
         * Gets the value of the correlationCoeffIoToIc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getCorrelationCoeffIoToIc() {
            return correlationCoeffIoToIc;
        }

        /**
         * Sets the value of the correlationCoeffIoToIc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setCorrelationCoeffIoToIc(JAXBElement<BigDecimal> value) {
            this.correlationCoeffIoToIc = value;
        }

        /**
         * Gets the value of the dResHighRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResHighRotation() {
            return dResHighRotation;
        }

        /**
         * Sets the value of the dResHighRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResHighRotation(JAXBElement<BigDecimal> value) {
            this.dResHighRotation = value;
        }

        /**
         * Gets the value of the dResHighTranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResHighTranslation() {
            return dResHighTranslation;
        }

        /**
         * Sets the value of the dResHighTranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResHighTranslation(JAXBElement<BigDecimal> value) {
            this.dResHighTranslation = value;
        }

        /**
         * Gets the value of the dResLowRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResLowRotation() {
            return dResLowRotation;
        }

        /**
         * Sets the value of the dResLowRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResLowRotation(JAXBElement<BigDecimal> value) {
            this.dResLowRotation = value;
        }

        /**
         * Gets the value of the dResLowTranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDResLowTranslation() {
            return dResLowTranslation;
        }

        /**
         * Sets the value of the dResLowTranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDResLowTranslation(JAXBElement<BigDecimal> value) {
            this.dResLowTranslation = value;
        }

        /**
         * Gets the value of the methodRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethodRotation() {
            return methodRotation;
        }

        /**
         * Sets the value of the methodRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethodRotation(JAXBElement<String> value) {
            this.methodRotation = value;
        }

        /**
         * Gets the value of the methodTranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethodTranslation() {
            return methodTranslation;
        }

        /**
         * Sets the value of the methodTranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethodTranslation(JAXBElement<String> value) {
            this.methodTranslation = value;
        }

        /**
         * Gets the value of the modelDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getModelDetails() {
            return modelDetails;
        }

        /**
         * Sets the value of the modelDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setModelDetails(JAXBElement<String> value) {
            this.modelDetails = value;
        }

        /**
         * Gets the value of the nativeSetId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNativeSetId() {
            return nativeSetId;
        }

        /**
         * Sets the value of the nativeSetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNativeSetId(JAXBElement<String> value) {
            this.nativeSetId = value;
        }

        /**
         * Gets the value of the packing property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPacking() {
            return packing;
        }

        /**
         * Sets the value of the packing property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPacking(JAXBElement<BigDecimal> value) {
            this.packing = value;
        }

        /**
         * Gets the value of the reflnsPercentRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getReflnsPercentRotation() {
            return reflnsPercentRotation;
        }

        /**
         * Sets the value of the reflnsPercentRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setReflnsPercentRotation(JAXBElement<BigDecimal> value) {
            this.reflnsPercentRotation = value;
        }

        /**
         * Gets the value of the reflnsPercentTranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getReflnsPercentTranslation() {
            return reflnsPercentTranslation;
        }

        /**
         * Sets the value of the reflnsPercentTranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setReflnsPercentTranslation(JAXBElement<BigDecimal> value) {
            this.reflnsPercentTranslation = value;
        }

        /**
         * Gets the value of the sigmaFRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSigmaFRotation() {
            return sigmaFRotation;
        }

        /**
         * Sets the value of the sigmaFRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSigmaFRotation(JAXBElement<BigDecimal> value) {
            this.sigmaFRotation = value;
        }

        /**
         * Gets the value of the sigmaFTranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSigmaFTranslation() {
            return sigmaFTranslation;
        }

        /**
         * Sets the value of the sigmaFTranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSigmaFTranslation(JAXBElement<BigDecimal> value) {
            this.sigmaFTranslation = value;
        }

        /**
         * Gets the value of the sigmaIRotation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSigmaIRotation() {
            return sigmaIRotation;
        }

        /**
         * Sets the value of the sigmaIRotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSigmaIRotation(JAXBElement<BigDecimal> value) {
            this.sigmaIRotation = value;
        }

        /**
         * Gets the value of the sigmaITranslation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSigmaITranslation() {
            return sigmaITranslation;
        }

        /**
         * Sets the value of the sigmaITranslation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSigmaITranslation(JAXBElement<BigDecimal> value) {
            this.sigmaITranslation = value;
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
