//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the CHEMICAL_CONN_ATOM category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
 * categories record details about the two-dimensional (2D)
 * chemical structure of the molecular species. They allow
 * a 2D chemical diagram to be reconstructed for use in a
 * publication or in a database search for structural and
 * substructural relationships.
 * 
 * The CHEMICAL_CONN_ATOM data items provide information about the
 * chemical properties of the atoms in the structure. In cases
 * where crystallographic and molecular symmetry elements coincide,
 * they must also contain symmetry-generated atoms, so that the
 * CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND data items will always
 * describe a complete chemical entity.
 * 
 *     Example 1 - based on data set DPTD of Yamin, Suwandi, Fun, Sivakumar &
 *                 bin Shawkataly [Acta Cryst. (1996), C52, 951-953].
 * <PDBx:chemical_conn_atomCategory>
 *    <PDBx:chemical_conn_atom number="1">
 *       <PDBx:NCA>1</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.39</PDBx:display_x>
 *       <PDBx:display_y>.81</PDBx:display_y>
 *       <PDBx:type_symbol>S</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="2">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.39</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>S</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="3">
 *       <PDBx:NCA>3</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.14</PDBx:display_x>
 *       <PDBx:display_y>.88</PDBx:display_y>
 *       <PDBx:type_symbol>N</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="4">
 *       <PDBx:NCA>3</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.33</PDBx:display_x>
 *       <PDBx:display_y>.88</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="5">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.11</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="6">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.03</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="7">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.03</PDBx:display_x>
 *       <PDBx:display_y>.80</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="8">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.11</PDBx:display_x>
 *       <PDBx:display_y>.80</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="9">
 *       <PDBx:NCA>1</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.54</PDBx:display_x>
 *       <PDBx:display_y>.81</PDBx:display_y>
 *       <PDBx:type_symbol>S</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="10">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.54</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>S</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="11">
 *       <PDBx:NCA>3</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.80</PDBx:display_x>
 *       <PDBx:display_y>.88</PDBx:display_y>
 *       <PDBx:type_symbol>N</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="12">
 *       <PDBx:NCA>3</PDBx:NCA>
 *       <PDBx:NH>0</PDBx:NH>
 *       <PDBx:display_x>.60</PDBx:display_x>
 *       <PDBx:display_y>.88</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="13">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.84</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="14">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.91</PDBx:display_x>
 *       <PDBx:display_y>.96</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="15">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.91</PDBx:display_x>
 *       <PDBx:display_y>.80</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 *    <PDBx:chemical_conn_atom number="16">
 *       <PDBx:NCA>2</PDBx:NCA>
 *       <PDBx:NH>2</PDBx:NH>
 *       <PDBx:display_x>.84</PDBx:display_x>
 *       <PDBx:display_y>.80</PDBx:display_y>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:chemical_conn_atom>
 * </PDBx:chemical_conn_atomCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chemical_conn_atomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chemical_conn_atomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chemical_conn_atom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="NCA" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="0"/>
 *                             &lt;maxInclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NH" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="0"/>
 *                             &lt;maxInclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="charge" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="8"/>
 *                             &lt;maxInclusive value="8"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="-8"/>
 *                             &lt;maxExclusive value="8"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="-8"/>
 *                             &lt;maxInclusive value="-8"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="display_x" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="1.0"/>
 *                             &lt;maxInclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="display_y" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="1.0"/>
 *                             &lt;maxInclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="type_symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="number" use="required">
 *                   &lt;simpleType>
 *                     &lt;union>
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minExclusive value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                           &lt;minInclusive value="1"/>
 *                           &lt;maxInclusive value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/union>
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
@XmlType(name = "chemical_conn_atomType", propOrder = {
    "chemicalConnAtom"
})
public class ChemicalConnAtomType {

    @XmlElement(name = "chemical_conn_atom")
    protected List<ChemicalConnAtomType.ChemicalConnAtom> chemicalConnAtom;

    /**
     * Gets the value of the chemicalConnAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalConnAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalConnAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalConnAtomType.ChemicalConnAtom }
     * 
     * 
     */
    public List<ChemicalConnAtomType.ChemicalConnAtom> getChemicalConnAtom() {
        if (chemicalConnAtom == null) {
            chemicalConnAtom = new ArrayList<ChemicalConnAtomType.ChemicalConnAtom>();
        }
        return this.chemicalConnAtom;
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
     *         &lt;element name="NCA" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="0"/>
     *                   &lt;maxInclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NH" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="0"/>
     *                   &lt;maxInclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="charge" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="8"/>
     *                   &lt;maxInclusive value="8"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="-8"/>
     *                   &lt;maxExclusive value="8"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="-8"/>
     *                   &lt;maxInclusive value="-8"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="display_x" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="1.0"/>
     *                   &lt;maxInclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="display_y" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="1.0"/>
     *                   &lt;maxInclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="type_symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="number" use="required">
     *         &lt;simpleType>
     *           &lt;union>
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                 &lt;minExclusive value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                 &lt;minInclusive value="1"/>
     *                 &lt;maxInclusive value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/union>
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
    @XmlType(name = "", propOrder = {

    })
    public static class ChemicalConnAtom {

        @XmlElementRef(name = "NCA", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nca;
        @XmlElementRef(name = "NH", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nh;
        @XmlElementRef(name = "charge", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> charge;
        @XmlElementRef(name = "display_x", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> displayX;
        @XmlElementRef(name = "display_y", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> displayY;
        @XmlElement(name = "type_symbol", required = true)
        protected String typeSymbol;
        @XmlAttribute(name = "number", required = true)
        protected String number;

        /**
         * Gets the value of the nca property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNCA() {
            return nca;
        }

        /**
         * Sets the value of the nca property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNCA(JAXBElement<String> value) {
            this.nca = value;
        }

        /**
         * Gets the value of the nh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNH() {
            return nh;
        }

        /**
         * Sets the value of the nh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNH(JAXBElement<String> value) {
            this.nh = value;
        }

        /**
         * Gets the value of the charge property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCharge() {
            return charge;
        }

        /**
         * Sets the value of the charge property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCharge(JAXBElement<String> value) {
            this.charge = value;
        }

        /**
         * Gets the value of the displayX property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDisplayX() {
            return displayX;
        }

        /**
         * Sets the value of the displayX property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDisplayX(JAXBElement<String> value) {
            this.displayX = value;
        }

        /**
         * Gets the value of the displayY property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDisplayY() {
            return displayY;
        }

        /**
         * Sets the value of the displayY property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDisplayY(JAXBElement<String> value) {
            this.displayY = value;
        }

        /**
         * Gets the value of the typeSymbol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeSymbol() {
            return typeSymbol;
        }

        /**
         * Sets the value of the typeSymbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeSymbol(String value) {
            this.typeSymbol = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

    }

}
