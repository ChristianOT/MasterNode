//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the CHEM_COMP_TOR category record details about
 * the torsion angles in a chemical component. As torsion angles
 * can have more than one target value, the target values are
 * specified in the CHEM_COMP_TOR_VALUE category.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:chem_comp_torCategory>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_chi1">
 *       <PDBx:atom_id_1>N</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CA</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CB</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CG</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_chi2">
 *       <PDBx:atom_id_1>CA</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CB</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CG</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CD1</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_ring1">
 *       <PDBx:atom_id_1>CB</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CG</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CD1</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CE1</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_ring2">
 *       <PDBx:atom_id_1>CB</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CG</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CD2</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CE2</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_ring3">
 *       <PDBx:atom_id_1>CG</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CD1</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CE1</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CZ</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_ring4">
 *       <PDBx:atom_id_1>CD1</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CE1</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CZ</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CE2</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 *    <PDBx:chem_comp_tor comp_id="phe" id="phe_ring5">
 *       <PDBx:atom_id_1>CE1</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>CZ</PDBx:atom_id_2>
 *       <PDBx:atom_id_3>CE2</PDBx:atom_id_3>
 *       <PDBx:atom_id_4>CD2</PDBx:atom_id_4>
 *    </PDBx:chem_comp_tor>
 * </PDBx:chem_comp_torCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chem_comp_torType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_comp_torType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_comp_tor" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="atom_id_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="atom_id_4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_comp_torType", propOrder = {
    "chemCompTor"
})
public class ChemCompTorType {

    @XmlElement(name = "chem_comp_tor")
    protected List<ChemCompTorType.ChemCompTor> chemCompTor;

    /**
     * Gets the value of the chemCompTor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemCompTor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemCompTor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemCompTorType.ChemCompTor }
     * 
     * 
     */
    public List<ChemCompTorType.ChemCompTor> getChemCompTor() {
        if (chemCompTor == null) {
            chemCompTor = new ArrayList<ChemCompTorType.ChemCompTor>();
        }
        return this.chemCompTor;
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
     *         &lt;element name="atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="atom_id_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="atom_id_4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemCompTor {

        @XmlElement(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlElement(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlElement(name = "atom_id_3", required = true)
        protected String atomId3;
        @XmlElement(name = "atom_id_4", required = true)
        protected String atomId4;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the atomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId1() {
            return atomId1;
        }

        /**
         * Sets the value of the atomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId1(String value) {
            this.atomId1 = value;
        }

        /**
         * Gets the value of the atomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId2() {
            return atomId2;
        }

        /**
         * Sets the value of the atomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId2(String value) {
            this.atomId2 = value;
        }

        /**
         * Gets the value of the atomId3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId3() {
            return atomId3;
        }

        /**
         * Sets the value of the atomId3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId3(String value) {
            this.atomId3 = value;
        }

        /**
         * Gets the value of the atomId4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId4() {
            return atomId4;
        }

        /**
         * Sets the value of the atomId4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId4(String value) {
            this.atomId4 = value;
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
