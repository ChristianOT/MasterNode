//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_STRUCT_SPECIAL_SYMMETRY category list the
 * molecular components that lie on special symmetry positions.
 * 
 *      Example 1
 * <PDBx:pdbx_struct_special_symmetryCategory>
 *    <PDBx:pdbx_struct_special_symmetry id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>Q</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>ATP</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *    </PDBx:pdbx_struct_special_symmetry>
 * </PDBx:pdbx_struct_special_symmetryCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_special_symmetryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_special_symmetryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_special_symmetry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_struct_special_symmetryType", propOrder = {
    "pdbxStructSpecialSymmetry"
})
public class PdbxStructSpecialSymmetryType {

    @XmlElement(name = "pdbx_struct_special_symmetry")
    protected List<PdbxStructSpecialSymmetryType.PdbxStructSpecialSymmetry> pdbxStructSpecialSymmetry;

    /**
     * Gets the value of the pdbxStructSpecialSymmetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructSpecialSymmetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructSpecialSymmetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructSpecialSymmetryType.PdbxStructSpecialSymmetry }
     * 
     * 
     */
    public List<PdbxStructSpecialSymmetryType.PdbxStructSpecialSymmetry> getPdbxStructSpecialSymmetry() {
        if (pdbxStructSpecialSymmetry == null) {
            pdbxStructSpecialSymmetry = new ArrayList<PdbxStructSpecialSymmetryType.PdbxStructSpecialSymmetry>();
        }
        return this.pdbxStructSpecialSymmetry;
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
     *         &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxStructSpecialSymmetry {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElement(name = "PDB_model_num", required = true)
        protected BigInteger pdbModelNum;
        @XmlElement(name = "auth_asym_id", required = true)
        protected String authAsymId;
        @XmlElement(name = "auth_comp_id", required = true)
        protected String authCompId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElementRef(name = "label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAsymId;
        @XmlElementRef(name = "label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelCompId;
        @XmlElementRef(name = "label_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> labelSeqId;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the pdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPDBInsCode() {
            return pdbInsCode;
        }

        /**
         * Sets the value of the pdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPDBInsCode(JAXBElement<String> value) {
            this.pdbInsCode = value;
        }

        /**
         * Gets the value of the pdbModelNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPDBModelNum(BigInteger value) {
            this.pdbModelNum = value;
        }

        /**
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAsymId(String value) {
            this.authAsymId = value;
        }

        /**
         * Gets the value of the authCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCompId() {
            return authCompId;
        }

        /**
         * Sets the value of the authCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCompId(String value) {
            this.authCompId = value;
        }

        /**
         * Gets the value of the authSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthSeqId() {
            return authSeqId;
        }

        /**
         * Sets the value of the authSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthSeqId(String value) {
            this.authSeqId = value;
        }

        /**
         * Gets the value of the labelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAltId() {
            return labelAltId;
        }

        /**
         * Sets the value of the labelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAltId(JAXBElement<String> value) {
            this.labelAltId = value;
        }

        /**
         * Gets the value of the labelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAsymId() {
            return labelAsymId;
        }

        /**
         * Sets the value of the labelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAsymId(JAXBElement<String> value) {
            this.labelAsymId = value;
        }

        /**
         * Gets the value of the labelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelCompId() {
            return labelCompId;
        }

        /**
         * Sets the value of the labelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelCompId(JAXBElement<String> value) {
            this.labelCompId = value;
        }

        /**
         * Gets the value of the labelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getLabelSeqId() {
            return labelSeqId;
        }

        /**
         * Sets the value of the labelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setLabelSeqId(JAXBElement<BigInteger> value) {
            this.labelSeqId = value;
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

    }

}
