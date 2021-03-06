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
 * Data items in the CHEMICAL_CONN_BOND category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
 * categories record details about the two-dimensional (2D)
 * chemical structure of the molecular species. They allow a
 *  2D chemical diagram to be reconstructed for use in a
 * publication or in a database search for structural and
 * substructural relationships.
 * 
 * The CHEMICAL_CONN_BOND data items specify the connections
 * between the atoms in the CHEMICAL_CONN_ATOM list and the nature
 * of the chemical bond between these atoms.
 * 
 *     Example 1 - based on data set DPTD of Yamin, Suwandi, Fun, Sivakumar &
 *                 bin Shawkataly [Acta Cryst. (1996), C52, 951-953].
 * <PDBx:chemical_conn_bondCategory>
 *    <PDBx:chemical_conn_bond atom_1="4" atom_2="1">
 *       <PDBx:type>doub</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="4" atom_2="3">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="4" atom_2="2">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="5" atom_2="3">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="6" atom_2="5">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="7" atom_2="6">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="8" atom_2="7">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="8" atom_2="3">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="10" atom_2="2">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="12" atom_2="9">
 *       <PDBx:type>doub</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="12" atom_2="11">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="12" atom_2="10">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="13" atom_2="11">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="14" atom_2="13">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="15" atom_2="14">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="16" atom_2="15">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="16" atom_2="11">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="17" atom_2="5">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="18" atom_2="5">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="19" atom_2="6">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="20" atom_2="6">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="21" atom_2="7">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="22" atom_2="7">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="23" atom_2="8">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="24" atom_2="8">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="25" atom_2="13">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="26" atom_2="13">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="27" atom_2="14">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="28" atom_2="14">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="29" atom_2="15">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="30" atom_2="15">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="31" atom_2="16">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 *    <PDBx:chemical_conn_bond atom_1="32" atom_2="16">
 *       <PDBx:type>sing</PDBx:type>
 *    </PDBx:chemical_conn_bond>
 * </PDBx:chemical_conn_bondCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chemical_conn_bondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chemical_conn_bondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chemical_conn_bond" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="sing"/>
 *                         &lt;enumeration value="doub"/>
 *                         &lt;enumeration value="trip"/>
 *                         &lt;enumeration value="quad"/>
 *                         &lt;enumeration value="arom"/>
 *                         &lt;enumeration value="poly"/>
 *                         &lt;enumeration value="delo"/>
 *                         &lt;enumeration value="pi"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_1" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="atom_2" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "chemical_conn_bondType", propOrder = {
    "chemicalConnBond"
})
public class ChemicalConnBondType {

    @XmlElement(name = "chemical_conn_bond")
    protected List<ChemicalConnBondType.ChemicalConnBond> chemicalConnBond;

    /**
     * Gets the value of the chemicalConnBond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalConnBond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalConnBond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalConnBondType.ChemicalConnBond }
     * 
     * 
     */
    public List<ChemicalConnBondType.ChemicalConnBond> getChemicalConnBond() {
        if (chemicalConnBond == null) {
            chemicalConnBond = new ArrayList<ChemicalConnBondType.ChemicalConnBond>();
        }
        return this.chemicalConnBond;
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
     *         &lt;element name="type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="sing"/>
     *               &lt;enumeration value="doub"/>
     *               &lt;enumeration value="trip"/>
     *               &lt;enumeration value="quad"/>
     *               &lt;enumeration value="arom"/>
     *               &lt;enumeration value="poly"/>
     *               &lt;enumeration value="delo"/>
     *               &lt;enumeration value="pi"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_1" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="atom_2" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class ChemicalConnBond {

        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "atom_1", required = true)
        protected BigInteger atom1;
        @XmlAttribute(name = "atom_2", required = true)
        protected BigInteger atom2;

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
         * Gets the value of the atom1 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAtom1() {
            return atom1;
        }

        /**
         * Sets the value of the atom1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAtom1(BigInteger value) {
            this.atom1 = value;
        }

        /**
         * Gets the value of the atom2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAtom2() {
            return atom2;
        }

        /**
         * Sets the value of the atom2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAtom2(BigInteger value) {
            this.atom2 = value;
        }

    }

}
