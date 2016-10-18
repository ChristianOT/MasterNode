//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * This category contains details for the PCR steps used in
 * the overall protein production process. The PCR is assumed
 * to be applied to the result of the previous production step, or the
 * gene source if this is the first production step.
 * 
 *     Example 1 - hypothetical example
 * <PDBx:pdbx_entity_src_gen_prod_pcrCategory>
 *    <PDBx:pdbx_entity_src_gen_prod_pcr entity_id="222000111" entry_id="111000111" step_id="1">
 *       <PDBx:date>2002-07-12:15:13</PDBx:date>
 *       <PDBx:end_construct_id>440050000111</PDBx:end_construct_id>
 *       <PDBx:forward_primer_id>2</PDBx:forward_primer_id>
 *       <PDBx:next_step_id>2</PDBx:next_step_id>
 *       <PDBx:purification_details>  No purification</PDBx:purification_details>
 *       <PDBx:reaction_details>  Annealing temperature = 70 C
 * Annealing time = 60 s
 * Extending temperature = 74 C
 * Extending time = 120 s
 * Melting temperature = 95 C
 * Melting time = 120 s
 * Number of cycles = 40
 * Polymerase = KOD
 * Template = 10 pmol
 * Primer = 25 pmol
 * Total volume = 25 ul</PDBx:reaction_details>
 *       <PDBx:reverse_primer_id>3</PDBx:reverse_primer_id>
 *       <PDBx:robot_id>5</PDBx:robot_id>
 *    </PDBx:pdbx_entity_src_gen_prod_pcr>
 * </PDBx:pdbx_entity_src_gen_prod_pcrCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_src_gen_prod_pcrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_src_gen_prod_pcrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_src_gen_prod_pcr" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="forward_primer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="purification_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reaction_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reverse_primer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_entity_src_gen_prod_pcrType", propOrder = {
    "pdbxEntitySrcGenProdPcr"
})
public class PdbxEntitySrcGenProdPcrType {

    @XmlElement(name = "pdbx_entity_src_gen_prod_pcr")
    protected List<PdbxEntitySrcGenProdPcrType.PdbxEntitySrcGenProdPcr> pdbxEntitySrcGenProdPcr;

    /**
     * Gets the value of the pdbxEntitySrcGenProdPcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntitySrcGenProdPcr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntitySrcGenProdPcr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntitySrcGenProdPcrType.PdbxEntitySrcGenProdPcr }
     * 
     * 
     */
    public List<PdbxEntitySrcGenProdPcrType.PdbxEntitySrcGenProdPcr> getPdbxEntitySrcGenProdPcr() {
        if (pdbxEntitySrcGenProdPcr == null) {
            pdbxEntitySrcGenProdPcr = new ArrayList<PdbxEntitySrcGenProdPcrType.PdbxEntitySrcGenProdPcr>();
        }
        return this.pdbxEntitySrcGenProdPcr;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_construct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="forward_primer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="next_step_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="purification_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reaction_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reverse_primer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="robot_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxEntitySrcGenProdPcr {

        @XmlElementRef(name = "date", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> date;
        @XmlElementRef(name = "end_construct_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endConstructId;
        @XmlElement(name = "forward_primer_id", required = true)
        protected String forwardPrimerId;
        @XmlElement(name = "next_step_id", required = true)
        protected BigInteger nextStepId;
        @XmlElementRef(name = "purification_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> purificationDetails;
        @XmlElementRef(name = "reaction_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reactionDetails;
        @XmlElement(name = "reverse_primer_id", required = true)
        protected String reversePrimerId;
        @XmlElementRef(name = "robot_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> robotId;
        @XmlElementRef(name = "summary", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> summary;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "step_id", required = true)
        protected BigInteger stepId;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDate(JAXBElement<String> value) {
            this.date = value;
        }

        /**
         * Gets the value of the endConstructId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndConstructId() {
            return endConstructId;
        }

        /**
         * Sets the value of the endConstructId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndConstructId(JAXBElement<String> value) {
            this.endConstructId = value;
        }

        /**
         * Gets the value of the forwardPrimerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForwardPrimerId() {
            return forwardPrimerId;
        }

        /**
         * Sets the value of the forwardPrimerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForwardPrimerId(String value) {
            this.forwardPrimerId = value;
        }

        /**
         * Gets the value of the nextStepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNextStepId() {
            return nextStepId;
        }

        /**
         * Sets the value of the nextStepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNextStepId(BigInteger value) {
            this.nextStepId = value;
        }

        /**
         * Gets the value of the purificationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPurificationDetails() {
            return purificationDetails;
        }

        /**
         * Sets the value of the purificationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPurificationDetails(JAXBElement<String> value) {
            this.purificationDetails = value;
        }

        /**
         * Gets the value of the reactionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReactionDetails() {
            return reactionDetails;
        }

        /**
         * Sets the value of the reactionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReactionDetails(JAXBElement<String> value) {
            this.reactionDetails = value;
        }

        /**
         * Gets the value of the reversePrimerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReversePrimerId() {
            return reversePrimerId;
        }

        /**
         * Sets the value of the reversePrimerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReversePrimerId(String value) {
            this.reversePrimerId = value;
        }

        /**
         * Gets the value of the robotId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRobotId() {
            return robotId;
        }

        /**
         * Sets the value of the robotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRobotId(JAXBElement<String> value) {
            this.robotId = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSummary(JAXBElement<String> value) {
            this.summary = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
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
         * Gets the value of the stepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStepId() {
            return stepId;
        }

        /**
         * Sets the value of the stepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStepId(BigInteger value) {
            this.stepId = value;
        }

    }

}
