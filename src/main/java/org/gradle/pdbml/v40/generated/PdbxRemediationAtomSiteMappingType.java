//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_REMEDIATION_ATOM_SITE_MAPPING category records
 * mapping information between selected molecular entities that have been
 * chemically redefined.   The prior and current atom nomenclature is 
 * tabulated in this category.
 * 
 *     Example component QUA
 * <PDBx:pdbx_remediation_atom_site_mappingCategory>
 *    <PDBx:pdbx_remediation_atom_site_mapping id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:auth_alt_id xsi:nil="true" />
 *       <PDBx:auth_asym_id>C</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>O12</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>QUA</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>7</PDBx:auth_seq_id>
 *       <PDBx:group_PDB>HETATM</PDBx:group_PDB>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:label_asym_id>C</PDBx:label_asym_id>
 *       <PDBx:label_atom_id>O12</PDBx:label_atom_id>
 *       <PDBx:label_comp_id>QUA</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>0</PDBx:label_seq_id>
 *       <PDBx:pdbx_align>1</PDBx:pdbx_align>
 *       <PDBx:pre_PDB_ins_code xsi:nil="true" />
 *       <PDBx:pre_auth_alt_id xsi:nil="true" />
 *       <PDBx:pre_auth_asym_id>C</PDBx:pre_auth_asym_id>
 *       <PDBx:pre_auth_atom_id>O12</PDBx:pre_auth_atom_id>
 *       <PDBx:pre_auth_comp_id>QUA</PDBx:pre_auth_comp_id>
 *       <PDBx:pre_auth_seq_id>7</PDBx:pre_auth_seq_id>
 *       <PDBx:pre_group_PDB>HETATM</PDBx:pre_group_PDB>
 *       <PDBx:pre_pdbx_align>1</PDBx:pre_pdbx_align>
 *    </PDBx:pdbx_remediation_atom_site_mapping>
 *    <PDBx:pdbx_remediation_atom_site_mapping id="2">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:auth_alt_id xsi:nil="true" />
 *       <PDBx:auth_asym_id>C</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C11</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>QUA</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>7</PDBx:auth_seq_id>
 *       <PDBx:group_PDB>HETATM</PDBx:group_PDB>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:label_asym_id>C</PDBx:label_asym_id>
 *       <PDBx:label_atom_id>C11</PDBx:label_atom_id>
 *       <PDBx:label_comp_id>QUA</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>0</PDBx:label_seq_id>
 *       <PDBx:pdbx_align>1</PDBx:pdbx_align>
 *       <PDBx:pre_PDB_ins_code xsi:nil="true" />
 *       <PDBx:pre_auth_alt_id xsi:nil="true" />
 *       <PDBx:pre_auth_asym_id>C</PDBx:pre_auth_asym_id>
 *       <PDBx:pre_auth_atom_id>C11</PDBx:pre_auth_atom_id>
 *       <PDBx:pre_auth_comp_id>QUA</PDBx:pre_auth_comp_id>
 *       <PDBx:pre_auth_seq_id>7</PDBx:pre_auth_seq_id>
 *       <PDBx:pre_group_PDB>HETATM</PDBx:pre_group_PDB>
 *       <PDBx:pre_pdbx_align>1</PDBx:pre_pdbx_align>
 *    </PDBx:pdbx_remediation_atom_site_mapping>
 * </PDBx:pdbx_remediation_atom_site_mappingCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_remediation_atom_site_mappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_remediation_atom_site_mappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_remediation_atom_site_mapping" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="group_PDB" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ATOM"/>
 *                         &lt;enumeration value="HETATM"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="occupancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_align" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pre_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_auth_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pre_group_PDB" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ATOM"/>
 *                         &lt;enumeration value="HETATM"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pre_occupancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pre_pdbx_align" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_remediation_atom_site_mappingType", propOrder = {
    "pdbxRemediationAtomSiteMapping"
})
public class PdbxRemediationAtomSiteMappingType {

    @XmlElement(name = "pdbx_remediation_atom_site_mapping")
    protected List<PdbxRemediationAtomSiteMappingType.PdbxRemediationAtomSiteMapping> pdbxRemediationAtomSiteMapping;

    /**
     * Gets the value of the pdbxRemediationAtomSiteMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxRemediationAtomSiteMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxRemediationAtomSiteMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxRemediationAtomSiteMappingType.PdbxRemediationAtomSiteMapping }
     * 
     * 
     */
    public List<PdbxRemediationAtomSiteMappingType.PdbxRemediationAtomSiteMapping> getPdbxRemediationAtomSiteMapping() {
        if (pdbxRemediationAtomSiteMapping == null) {
            pdbxRemediationAtomSiteMapping = new ArrayList<PdbxRemediationAtomSiteMappingType.PdbxRemediationAtomSiteMapping>();
        }
        return this.pdbxRemediationAtomSiteMapping;
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
     *         &lt;element name="auth_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="group_PDB" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ATOM"/>
     *               &lt;enumeration value="HETATM"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="occupancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_align" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pre_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_auth_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pre_group_PDB" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ATOM"/>
     *               &lt;enumeration value="HETATM"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pre_occupancy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pre_pdbx_align" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxRemediationAtomSiteMapping {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElementRef(name = "auth_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAltId;
        @XmlElementRef(name = "auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAsymId;
        @XmlElementRef(name = "auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAtomId;
        @XmlElementRef(name = "auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authCompId;
        @XmlElementRef(name = "auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authSeqId;
        @XmlElementRef(name = "group_PDB", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> groupPDB;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElement(name = "label_asym_id", required = true)
        protected String labelAsymId;
        @XmlElement(name = "label_atom_id", required = true)
        protected String labelAtomId;
        @XmlElement(name = "label_comp_id", required = true)
        protected String labelCompId;
        @XmlElement(name = "label_seq_id", required = true, nillable = true)
        protected BigInteger labelSeqId;
        @XmlElementRef(name = "occupancy", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> occupancy;
        @XmlElementRef(name = "pdbx_align", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxAlign;
        @XmlElementRef(name = "pre_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> prePDBInsCode;
        @XmlElementRef(name = "pre_auth_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preAuthAltId;
        @XmlElementRef(name = "pre_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preAuthAsymId;
        @XmlElementRef(name = "pre_auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preAuthAtomId;
        @XmlElementRef(name = "pre_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preAuthCompId;
        @XmlElementRef(name = "pre_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preAuthSeqId;
        @XmlElementRef(name = "pre_group_PDB", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> preGroupPDB;
        @XmlElementRef(name = "pre_occupancy", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> preOccupancy;
        @XmlElementRef(name = "pre_pdbx_align", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> prePdbxAlign;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the authAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAltId() {
            return authAltId;
        }

        /**
         * Sets the value of the authAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAltId(JAXBElement<String> value) {
            this.authAltId = value;
        }

        /**
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAsymId(JAXBElement<String> value) {
            this.authAsymId = value;
        }

        /**
         * Gets the value of the authAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAtomId() {
            return authAtomId;
        }

        /**
         * Sets the value of the authAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAtomId(JAXBElement<String> value) {
            this.authAtomId = value;
        }

        /**
         * Gets the value of the authCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthCompId() {
            return authCompId;
        }

        /**
         * Sets the value of the authCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthCompId(JAXBElement<String> value) {
            this.authCompId = value;
        }

        /**
         * Gets the value of the authSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthSeqId() {
            return authSeqId;
        }

        /**
         * Sets the value of the authSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthSeqId(JAXBElement<String> value) {
            this.authSeqId = value;
        }

        /**
         * Gets the value of the groupPDB property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getGroupPDB() {
            return groupPDB;
        }

        /**
         * Sets the value of the groupPDB property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setGroupPDB(JAXBElement<String> value) {
            this.groupPDB = value;
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
         *     {@link String }
         *     
         */
        public String getLabelAsymId() {
            return labelAsymId;
        }

        /**
         * Sets the value of the labelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelAsymId(String value) {
            this.labelAsymId = value;
        }

        /**
         * Gets the value of the labelAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelAtomId() {
            return labelAtomId;
        }

        /**
         * Sets the value of the labelAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelAtomId(String value) {
            this.labelAtomId = value;
        }

        /**
         * Gets the value of the labelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelCompId() {
            return labelCompId;
        }

        /**
         * Sets the value of the labelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelCompId(String value) {
            this.labelCompId = value;
        }

        /**
         * Gets the value of the labelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLabelSeqId() {
            return labelSeqId;
        }

        /**
         * Sets the value of the labelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLabelSeqId(BigInteger value) {
            this.labelSeqId = value;
        }

        /**
         * Gets the value of the occupancy property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getOccupancy() {
            return occupancy;
        }

        /**
         * Sets the value of the occupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setOccupancy(JAXBElement<BigDecimal> value) {
            this.occupancy = value;
        }

        /**
         * Gets the value of the pdbxAlign property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxAlign() {
            return pdbxAlign;
        }

        /**
         * Sets the value of the pdbxAlign property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxAlign(JAXBElement<BigInteger> value) {
            this.pdbxAlign = value;
        }

        /**
         * Gets the value of the prePDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPrePDBInsCode() {
            return prePDBInsCode;
        }

        /**
         * Sets the value of the prePDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPrePDBInsCode(JAXBElement<String> value) {
            this.prePDBInsCode = value;
        }

        /**
         * Gets the value of the preAuthAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreAuthAltId() {
            return preAuthAltId;
        }

        /**
         * Sets the value of the preAuthAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreAuthAltId(JAXBElement<String> value) {
            this.preAuthAltId = value;
        }

        /**
         * Gets the value of the preAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreAuthAsymId() {
            return preAuthAsymId;
        }

        /**
         * Sets the value of the preAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreAuthAsymId(JAXBElement<String> value) {
            this.preAuthAsymId = value;
        }

        /**
         * Gets the value of the preAuthAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreAuthAtomId() {
            return preAuthAtomId;
        }

        /**
         * Sets the value of the preAuthAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreAuthAtomId(JAXBElement<String> value) {
            this.preAuthAtomId = value;
        }

        /**
         * Gets the value of the preAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreAuthCompId() {
            return preAuthCompId;
        }

        /**
         * Sets the value of the preAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreAuthCompId(JAXBElement<String> value) {
            this.preAuthCompId = value;
        }

        /**
         * Gets the value of the preAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreAuthSeqId() {
            return preAuthSeqId;
        }

        /**
         * Sets the value of the preAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreAuthSeqId(JAXBElement<String> value) {
            this.preAuthSeqId = value;
        }

        /**
         * Gets the value of the preGroupPDB property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPreGroupPDB() {
            return preGroupPDB;
        }

        /**
         * Sets the value of the preGroupPDB property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPreGroupPDB(JAXBElement<String> value) {
            this.preGroupPDB = value;
        }

        /**
         * Gets the value of the preOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPreOccupancy() {
            return preOccupancy;
        }

        /**
         * Sets the value of the preOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPreOccupancy(JAXBElement<BigDecimal> value) {
            this.preOccupancy = value;
        }

        /**
         * Gets the value of the prePdbxAlign property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPrePdbxAlign() {
            return prePdbxAlign;
        }

        /**
         * Sets the value of the prePdbxAlign property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPrePdbxAlign(JAXBElement<BigInteger> value) {
            this.prePdbxAlign = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
