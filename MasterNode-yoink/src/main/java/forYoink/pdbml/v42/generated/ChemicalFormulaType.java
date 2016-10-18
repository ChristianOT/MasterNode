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
 * Data items in the CHEMICAL_FORMULA category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_FORMULA category specify the
 * composition and chemical properties of the compound. The formula
 * data items must agree with those that specify the density,
 * unit-cell and Z values.
 * 
 * The following rules apply to the construction of the data items
 * _chemical_formula.analytical, _chemical_formula.structural and
 * attribute sum in category chemical_formula. For the data item
 *  attribute moiety in category chemical_formula, the formula construction is broken up
 *  into residues or moieties, i.e. groups of atoms that form a
 * molecular unit or molecular ion. The rules given below apply
 * within each moiety but different requirements apply to the way
 * that moieties are connected (see attribute moiety).
 *  in category chemical_formula 
 * (1) Only recognized element symbols may be used.
 * 
 * (2) Each element symbol is followed by a 'count' number. A count
 * of '1' may be omitted.
 * 
 * (3) A space or parenthesis must separate each cluster of (element
 * symbol + count).
 * 
 * (4) Where a group of elements is enclosed in parentheses, the
 * multiplier for the group must follow the closing parenthesis.
 * That is, all element and group multipliers are assumed to be
 * printed as subscripted numbers. (An exception to this rule
 * exists for attribute moiety in category chemical_formula formulae where pre- and
 *  post-multipliers are permitted for molecular units.)
 * 
 * (5) Unless the elements are ordered in a manner that corresponds
 * to their chemical structure, as in
 * attribute structural in category chemical_formula, the order of the elements within
 *  any group or moiety should be:  C, then H, then the other
 * elements in alphabetical order of their symbol. This is the
 * 'Hill' system used by Chemical Abstracts. This ordering is
 * used in _chemical_formula.moiety and _chemical_formula.sum.
 * 
 *     Example 2 - based on data set TOZ of Willis, Beckwith & Tozer [(1991).
 *                 Acta Cryst. C47, 2276-2277].
 * <PDBx:chemical_formulaCategory>
 *    <PDBx:chemical_formula entry_id="TOZ">
 *       <PDBx:moiety>C18 H25 N O3</PDBx:moiety>
 *       <PDBx:sum>C18 H25 N O3</PDBx:sum>
 *       <PDBx:weight>303.40</PDBx:weight>
 *    </PDBx:chemical_formula>
 * </PDBx:chemical_formulaCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chemical_formulaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chemical_formulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chemical_formula" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="analytical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="iupac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="moiety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="structural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="weight" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="1.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="weight_meas" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="1.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "chemical_formulaType", propOrder = {
    "chemicalFormula"
})
public class ChemicalFormulaType {

    @XmlElement(name = "chemical_formula")
    protected List<ChemicalFormulaType.ChemicalFormula> chemicalFormula;

    /**
     * Gets the value of the chemicalFormula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalFormula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalFormula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalFormulaType.ChemicalFormula }
     * 
     * 
     */
    public List<ChemicalFormulaType.ChemicalFormula> getChemicalFormula() {
        if (chemicalFormula == null) {
            chemicalFormula = new ArrayList<ChemicalFormulaType.ChemicalFormula>();
        }
        return this.chemicalFormula;
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
     *         &lt;element name="analytical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="iupac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="moiety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="structural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="weight" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="1.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="weight_meas" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="1.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
    public static class ChemicalFormula {

        @XmlElementRef(name = "analytical", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> analytical;
        @XmlElementRef(name = "iupac", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> iupac;
        @XmlElementRef(name = "moiety", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> moiety;
        @XmlElementRef(name = "structural", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> structural;
        @XmlElementRef(name = "sum", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sum;
        @XmlElementRef(name = "weight", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> weight;
        @XmlElementRef(name = "weight_meas", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> weightMeas;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the analytical property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAnalytical() {
            return analytical;
        }

        /**
         * Sets the value of the analytical property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAnalytical(JAXBElement<String> value) {
            this.analytical = value;
        }

        /**
         * Gets the value of the iupac property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIupac() {
            return iupac;
        }

        /**
         * Sets the value of the iupac property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIupac(JAXBElement<String> value) {
            this.iupac = value;
        }

        /**
         * Gets the value of the moiety property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMoiety() {
            return moiety;
        }

        /**
         * Sets the value of the moiety property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMoiety(JAXBElement<String> value) {
            this.moiety = value;
        }

        /**
         * Gets the value of the structural property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStructural() {
            return structural;
        }

        /**
         * Sets the value of the structural property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStructural(JAXBElement<String> value) {
            this.structural = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSum(JAXBElement<String> value) {
            this.sum = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWeight(JAXBElement<BigDecimal> value) {
            this.weight = value;
        }

        /**
         * Gets the value of the weightMeas property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getWeightMeas() {
            return weightMeas;
        }

        /**
         * Sets the value of the weightMeas property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setWeightMeas(JAXBElement<BigDecimal> value) {
            this.weightMeas = value;
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
