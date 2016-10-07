//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the pdbx_chem_comp_subcomponent_entity_list category
 * list the constituent chemical entities and entity features in this chemical component.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_subcomponent_entity_listCategory>
 *    <PDBx:pdbx_chem_comp_subcomponent_entity_list id="1">
 *       <PDBx:class>polymer</PDBx:class>
 *       <PDBx:parent_comp_id>CE8</PDBx:parent_comp_id>
 *       <PDBx:type>saccharide</PDBx:type>
 *    </PDBx:pdbx_chem_comp_subcomponent_entity_list>
 * </PDBx:pdbx_chem_comp_subcomponent_entity_listCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_subcomponent_entity_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_subcomponent_entity_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_subcomponent_entity_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="class">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="polymer"/>
 *                         &lt;enumeration value="non-polymer"/>
 *                         &lt;enumeration value="macrolide"/>
 *                         &lt;enumeration value="water"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parent_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D-peptide linking"/>
 *                         &lt;enumeration value="L-peptide linking"/>
 *                         &lt;enumeration value="D-peptide NH3 amino terminus"/>
 *                         &lt;enumeration value="L-peptide NH3 amino terminus"/>
 *                         &lt;enumeration value="D-peptide COOH carboxy terminus"/>
 *                         &lt;enumeration value="L-peptide COOH carboxy terminus"/>
 *                         &lt;enumeration value="DNA linking"/>
 *                         &lt;enumeration value="RNA linking"/>
 *                         &lt;enumeration value="L-RNA linking"/>
 *                         &lt;enumeration value="L-DNA linking"/>
 *                         &lt;enumeration value="DNA OH 5 prime terminus"/>
 *                         &lt;enumeration value="RNA OH 5 prime terminus"/>
 *                         &lt;enumeration value="DNA OH 3 prime terminus"/>
 *                         &lt;enumeration value="RNA OH 3 prime terminus"/>
 *                         &lt;enumeration value="D-saccharide 1,4 and 1,4 linking"/>
 *                         &lt;enumeration value="L-saccharide 1,4 and 1,4 linking"/>
 *                         &lt;enumeration value="D-saccharide 1,4 and 1,6 linking"/>
 *                         &lt;enumeration value="L-saccharide 1,4 and 1,6 linking"/>
 *                         &lt;enumeration value="L-saccharide"/>
 *                         &lt;enumeration value="D-saccharide"/>
 *                         &lt;enumeration value="saccharide"/>
 *                         &lt;enumeration value="non-polymer"/>
 *                         &lt;enumeration value="peptide linking"/>
 *                         &lt;enumeration value="peptide-like"/>
 *                         &lt;enumeration value="L-gamma-peptide, C-delta linking"/>
 *                         &lt;enumeration value="D-gamma-peptide, C-delta linking"/>
 *                         &lt;enumeration value="L-beta-peptide, C-gamma linking"/>
 *                         &lt;enumeration value="D-beta-peptide, C-gamma linking"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "pdbx_chem_comp_subcomponent_entity_listType", propOrder = {
    "pdbxChemCompSubcomponentEntityList"
})
public class PdbxChemCompSubcomponentEntityListType {

    @XmlElement(name = "pdbx_chem_comp_subcomponent_entity_list")
    protected List<PdbxChemCompSubcomponentEntityListType.PdbxChemCompSubcomponentEntityList> pdbxChemCompSubcomponentEntityList;

    /**
     * Gets the value of the pdbxChemCompSubcomponentEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompSubcomponentEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompSubcomponentEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompSubcomponentEntityListType.PdbxChemCompSubcomponentEntityList }
     * 
     * 
     */
    public List<PdbxChemCompSubcomponentEntityListType.PdbxChemCompSubcomponentEntityList> getPdbxChemCompSubcomponentEntityList() {
        if (pdbxChemCompSubcomponentEntityList == null) {
            pdbxChemCompSubcomponentEntityList = new ArrayList<PdbxChemCompSubcomponentEntityListType.PdbxChemCompSubcomponentEntityList>();
        }
        return this.pdbxChemCompSubcomponentEntityList;
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
     *         &lt;element name="class">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="polymer"/>
     *               &lt;enumeration value="non-polymer"/>
     *               &lt;enumeration value="macrolide"/>
     *               &lt;enumeration value="water"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="parent_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D-peptide linking"/>
     *               &lt;enumeration value="L-peptide linking"/>
     *               &lt;enumeration value="D-peptide NH3 amino terminus"/>
     *               &lt;enumeration value="L-peptide NH3 amino terminus"/>
     *               &lt;enumeration value="D-peptide COOH carboxy terminus"/>
     *               &lt;enumeration value="L-peptide COOH carboxy terminus"/>
     *               &lt;enumeration value="DNA linking"/>
     *               &lt;enumeration value="RNA linking"/>
     *               &lt;enumeration value="L-RNA linking"/>
     *               &lt;enumeration value="L-DNA linking"/>
     *               &lt;enumeration value="DNA OH 5 prime terminus"/>
     *               &lt;enumeration value="RNA OH 5 prime terminus"/>
     *               &lt;enumeration value="DNA OH 3 prime terminus"/>
     *               &lt;enumeration value="RNA OH 3 prime terminus"/>
     *               &lt;enumeration value="D-saccharide 1,4 and 1,4 linking"/>
     *               &lt;enumeration value="L-saccharide 1,4 and 1,4 linking"/>
     *               &lt;enumeration value="D-saccharide 1,4 and 1,6 linking"/>
     *               &lt;enumeration value="L-saccharide 1,4 and 1,6 linking"/>
     *               &lt;enumeration value="L-saccharide"/>
     *               &lt;enumeration value="D-saccharide"/>
     *               &lt;enumeration value="saccharide"/>
     *               &lt;enumeration value="non-polymer"/>
     *               &lt;enumeration value="peptide linking"/>
     *               &lt;enumeration value="peptide-like"/>
     *               &lt;enumeration value="L-gamma-peptide, C-delta linking"/>
     *               &lt;enumeration value="D-gamma-peptide, C-delta linking"/>
     *               &lt;enumeration value="L-beta-peptide, C-gamma linking"/>
     *               &lt;enumeration value="D-beta-peptide, C-gamma linking"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
    public static class PdbxChemCompSubcomponentEntityList {

        @XmlElement(name = "class", required = true)
        protected String clazz;
        @XmlElement(name = "parent_comp_id", required = true)
        protected String parentCompId;
        @XmlElement(required = true)
        protected String type;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the parentCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCompId() {
            return parentCompId;
        }

        /**
         * Sets the value of the parentCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCompId(String value) {
            this.parentCompId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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
