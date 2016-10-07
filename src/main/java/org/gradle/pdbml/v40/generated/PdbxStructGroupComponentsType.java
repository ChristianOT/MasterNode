//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_STRUCT_GROUP_COMPONENTS category list component-level
 * group assignments within the entry.  Groups are defined and described in category
 * PDBX_STRUCT_GROUP_LIST.  
 * 
 *      Example 1
 * <PDBx:pdbx_struct_group_componentsCategory>
 *    <PDBx:pdbx_struct_group_components ordinal="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>MLU</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>1</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="2">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>OMZ</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>2</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="3">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>ASN</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="4">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>GHP</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>4</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="5">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>GHP</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>5</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="6">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>OMX</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>6</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="7">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>3FG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>7</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="8">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>ERE</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>8</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="9">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>BGC</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>9</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 *    <PDBx:pdbx_struct_group_components ordinal="10">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>RAM</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>10</PDBx:auth_seq_id>
 *       <PDBx:struct_group_id>1</PDBx:struct_group_id>
 *    </PDBx:pdbx_struct_group_components>
 * </PDBx:pdbx_struct_group_componentsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_group_componentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_group_componentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_group_components" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="struct_group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_struct_group_componentsType", propOrder = {
    "pdbxStructGroupComponents"
})
public class PdbxStructGroupComponentsType {

    @XmlElement(name = "pdbx_struct_group_components")
    protected List<PdbxStructGroupComponentsType.PdbxStructGroupComponents> pdbxStructGroupComponents;

    /**
     * Gets the value of the pdbxStructGroupComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructGroupComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructGroupComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructGroupComponentsType.PdbxStructGroupComponents }
     * 
     * 
     */
    public List<PdbxStructGroupComponentsType.PdbxStructGroupComponents> getPdbxStructGroupComponents() {
        if (pdbxStructGroupComponents == null) {
            pdbxStructGroupComponents = new ArrayList<PdbxStructGroupComponentsType.PdbxStructGroupComponents>();
        }
        return this.pdbxStructGroupComponents;
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
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="struct_group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxStructGroupComponents {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElementRef(name = "PDB_model_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbModelNum;
        @XmlElement(name = "auth_asym_id", required = true)
        protected String authAsymId;
        @XmlElement(name = "auth_comp_id", required = true)
        protected String authCompId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElementRef(name = "label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAsymId;
        @XmlElementRef(name = "label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelCompId;
        @XmlElementRef(name = "label_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> labelSeqId;
        @XmlElement(name = "struct_group_id", required = true)
        protected String structGroupId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

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
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPDBModelNum(JAXBElement<BigInteger> value) {
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
         * Gets the value of the structGroupId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStructGroupId() {
            return structGroupId;
        }

        /**
         * Sets the value of the structGroupId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStructGroupId(String value) {
            this.structGroupId = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

    }

}
