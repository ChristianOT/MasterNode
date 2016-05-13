//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the PDBX_CHEM_COMP_ATOM_FEATURE category provide
 * a selected list of atom level features for the chemical component.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_atom_featureCategory>
 *    <PDBx:pdbx_chem_comp_atom_feature atom_id="N" comp_id="LYS" feature_type="NT"></PDBx:pdbx_chem_comp_atom_feature>
 *    <PDBx:pdbx_chem_comp_atom_feature atom_id="C" comp_id="LYS" feature_type="CT"></PDBx:pdbx_chem_comp_atom_feature>
 *    <PDBx:pdbx_chem_comp_atom_feature atom_id="CA" comp_id="LYS" feature_type="CPA"></PDBx:pdbx_chem_comp_atom_feature>
 * </PDBx:pdbx_chem_comp_atom_featureCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_atom_featureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_atom_featureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_atom_feature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="feature_type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="CT"/>
 *                       &lt;enumeration value="NT"/>
 *                       &lt;enumeration value="5PT"/>
 *                       &lt;enumeration value="3PT"/>
 *                       &lt;enumeration value="CPA"/>
 *                       &lt;enumeration value="CNA"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "pdbx_chem_comp_atom_featureType", propOrder = {
    "pdbxChemCompAtomFeature"
})
public class PdbxChemCompAtomFeatureType {

    @XmlElement(name = "pdbx_chem_comp_atom_feature")
    protected List<PdbxChemCompAtomFeatureType.PdbxChemCompAtomFeature> pdbxChemCompAtomFeature;

    /**
     * Gets the value of the pdbxChemCompAtomFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompAtomFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompAtomFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompAtomFeatureType.PdbxChemCompAtomFeature }
     * 
     * 
     */
    public List<PdbxChemCompAtomFeatureType.PdbxChemCompAtomFeature> getPdbxChemCompAtomFeature() {
        if (pdbxChemCompAtomFeature == null) {
            pdbxChemCompAtomFeature = new ArrayList<PdbxChemCompAtomFeatureType.PdbxChemCompAtomFeature>();
        }
        return this.pdbxChemCompAtomFeature;
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
     *       &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="feature_type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="CT"/>
     *             &lt;enumeration value="NT"/>
     *             &lt;enumeration value="5PT"/>
     *             &lt;enumeration value="3PT"/>
     *             &lt;enumeration value="CPA"/>
     *             &lt;enumeration value="CNA"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxChemCompAtomFeature {

        @XmlAttribute(name = "atom_id", required = true)
        protected String atomId;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "feature_type", required = true)
        protected String featureType;

        /**
         * Gets the value of the atomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId() {
            return atomId;
        }

        /**
         * Sets the value of the atomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId(String value) {
            this.atomId = value;
        }

        /**
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
        }

        /**
         * Gets the value of the featureType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureType() {
            return featureType;
        }

        /**
         * Sets the value of the featureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureType(String value) {
            this.featureType = value;
        }

    }

}