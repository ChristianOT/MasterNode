//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * This category provides a table of upper and lower distance 
 * limits used as criteria in determining covalent bonds.
 * The table is organized by atom type pairs.
 * 
 *     Example 1 - Abbreviated bond distance limit table
 * <PDBx:pdbx_bond_distance_limitsCategory>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="N" atom_type_2="Ag">
 *       <PDBx:lower_limit>1.85</PDBx:lower_limit>
 *       <PDBx:upper_limit>2.70</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="O" atom_type_2="Ag">
 *       <PDBx:lower_limit>1.85</PDBx:lower_limit>
 *       <PDBx:upper_limit>2.70</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="S" atom_type_2="Ag">
 *       <PDBx:lower_limit>2.00</PDBx:lower_limit>
 *       <PDBx:upper_limit>3.00</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="Al" atom_type_2="H">
 *       <PDBx:lower_limit>1.35</PDBx:lower_limit>
 *       <PDBx:upper_limit>1.65</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="As" atom_type_2="H">
 *       <PDBx:lower_limit>1.20</PDBx:lower_limit>
 *       <PDBx:upper_limit>1.60</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="N" atom_type_2="Au">
 *       <PDBx:lower_limit>1.80</PDBx:lower_limit>
 *       <PDBx:upper_limit>2.80</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="O" atom_type_2="Au">
 *       <PDBx:lower_limit>1.80</PDBx:lower_limit>
 *       <PDBx:upper_limit>2.80</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="S" atom_type_2="Au">
 *       <PDBx:lower_limit>1.80</PDBx:lower_limit>
 *       <PDBx:upper_limit>3.00</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="B" atom_type_2="B">
 *       <PDBx:lower_limit>1.45</PDBx:lower_limit>
 *       <PDBx:upper_limit>1.95</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="C" atom_type_2="B">
 *       <PDBx:lower_limit>1.20</PDBx:lower_limit>
 *       <PDBx:upper_limit>1.85</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 *    <PDBx:pdbx_bond_distance_limits atom_type_1="F" atom_type_2="B">
 *       <PDBx:lower_limit>1.20</PDBx:lower_limit>
 *       <PDBx:upper_limit>1.75</PDBx:upper_limit>
 *    </PDBx:pdbx_bond_distance_limits>
 * </PDBx:pdbx_bond_distance_limitsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_bond_distance_limitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_bond_distance_limitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_bond_distance_limits" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="lower_limit">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="upper_limit">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_type_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_type_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_bond_distance_limitsType", propOrder = {
    "pdbxBondDistanceLimits"
})
public class PdbxBondDistanceLimitsType {

    @XmlElement(name = "pdbx_bond_distance_limits")
    protected List<PdbxBondDistanceLimitsType.PdbxBondDistanceLimits> pdbxBondDistanceLimits;

    /**
     * Gets the value of the pdbxBondDistanceLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxBondDistanceLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxBondDistanceLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxBondDistanceLimitsType.PdbxBondDistanceLimits }
     * 
     * 
     */
    public List<PdbxBondDistanceLimitsType.PdbxBondDistanceLimits> getPdbxBondDistanceLimits() {
        if (pdbxBondDistanceLimits == null) {
            pdbxBondDistanceLimits = new ArrayList<PdbxBondDistanceLimitsType.PdbxBondDistanceLimits>();
        }
        return this.pdbxBondDistanceLimits;
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
     *         &lt;element name="lower_limit">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="upper_limit">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_type_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_type_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxBondDistanceLimits {

        @XmlElement(name = "lower_limit", required = true)
        protected PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.LowerLimit lowerLimit;
        @XmlElement(name = "upper_limit", required = true)
        protected PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.UpperLimit upperLimit;
        @XmlAttribute(name = "atom_type_1", required = true)
        protected String atomType1;
        @XmlAttribute(name = "atom_type_2", required = true)
        protected String atomType2;

        /**
         * Gets the value of the lowerLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.LowerLimit }
         *     
         */
        public PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.LowerLimit getLowerLimit() {
            return lowerLimit;
        }

        /**
         * Sets the value of the lowerLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.LowerLimit }
         *     
         */
        public void setLowerLimit(PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.LowerLimit value) {
            this.lowerLimit = value;
        }

        /**
         * Gets the value of the upperLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.UpperLimit }
         *     
         */
        public PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.UpperLimit getUpperLimit() {
            return upperLimit;
        }

        /**
         * Sets the value of the upperLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.UpperLimit }
         *     
         */
        public void setUpperLimit(PdbxBondDistanceLimitsType.PdbxBondDistanceLimits.UpperLimit value) {
            this.upperLimit = value;
        }

        /**
         * Gets the value of the atomType1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomType1() {
            return atomType1;
        }

        /**
         * Sets the value of the atomType1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomType1(String value) {
            this.atomType1 = value;
        }

        /**
         * Gets the value of the atomType2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomType2() {
            return atomType2;
        }

        /**
         * Sets the value of the atomType2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomType2(String value) {
            this.atomType2 = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LowerLimit {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class UpperLimit {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
