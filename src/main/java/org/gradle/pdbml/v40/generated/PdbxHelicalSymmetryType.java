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
 * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
 * helical symmetry group associated with this entry.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_helical_symmetryCategory>
 *    <PDBx:pdbx_helical_symmetry entry_id="1ABC">
 *       <PDBx:circular_symmetry>1</PDBx:circular_symmetry>
 *       <PDBx:dyad_axis>no</PDBx:dyad_axis>
 *       <PDBx:n_subunits_divisor>1</PDBx:n_subunits_divisor>
 *       <PDBx:number_of_operations>35</PDBx:number_of_operations>
 *       <PDBx:rise_per_n_subunits>6.10</PDBx:rise_per_n_subunits>
 *       <PDBx:rotation_per_n_subunits>131.84</PDBx:rotation_per_n_subunits>
 *    </PDBx:pdbx_helical_symmetry>
 * </PDBx:pdbx_helical_symmetryCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_helical_symmetryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_helical_symmetryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_helical_symmetry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="circular_symmetry">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dyad_axis">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="yes"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="n_subunits_divisor">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_of_operations">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rise_per_n_subunits">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rotation_per_n_subunits">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
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
@XmlType(name = "pdbx_helical_symmetryType", propOrder = {
    "pdbxHelicalSymmetry"
})
public class PdbxHelicalSymmetryType {

    @XmlElement(name = "pdbx_helical_symmetry")
    protected List<PdbxHelicalSymmetryType.PdbxHelicalSymmetry> pdbxHelicalSymmetry;

    /**
     * Gets the value of the pdbxHelicalSymmetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxHelicalSymmetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxHelicalSymmetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxHelicalSymmetryType.PdbxHelicalSymmetry }
     * 
     * 
     */
    public List<PdbxHelicalSymmetryType.PdbxHelicalSymmetry> getPdbxHelicalSymmetry() {
        if (pdbxHelicalSymmetry == null) {
            pdbxHelicalSymmetry = new ArrayList<PdbxHelicalSymmetryType.PdbxHelicalSymmetry>();
        }
        return this.pdbxHelicalSymmetry;
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
     *         &lt;element name="circular_symmetry">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dyad_axis">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="yes"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="n_subunits_divisor">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_of_operations">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="rise_per_n_subunits">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rotation_per_n_subunits">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
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
    public static class PdbxHelicalSymmetry {

        @XmlElement(name = "circular_symmetry", required = true)
        protected String circularSymmetry;
        @XmlElement(name = "dyad_axis", required = true)
        protected String dyadAxis;
        @XmlElement(name = "n_subunits_divisor", required = true)
        protected String nSubunitsDivisor;
        @XmlElement(name = "number_of_operations", required = true)
        protected String numberOfOperations;
        @XmlElement(name = "rise_per_n_subunits", required = true)
        protected PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RisePerNSubunits risePerNSubunits;
        @XmlElement(name = "rotation_per_n_subunits", required = true)
        protected PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RotationPerNSubunits rotationPerNSubunits;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the circularSymmetry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCircularSymmetry() {
            return circularSymmetry;
        }

        /**
         * Sets the value of the circularSymmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCircularSymmetry(String value) {
            this.circularSymmetry = value;
        }

        /**
         * Gets the value of the dyadAxis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDyadAxis() {
            return dyadAxis;
        }

        /**
         * Sets the value of the dyadAxis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDyadAxis(String value) {
            this.dyadAxis = value;
        }

        /**
         * Gets the value of the nSubunitsDivisor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSubunitsDivisor() {
            return nSubunitsDivisor;
        }

        /**
         * Sets the value of the nSubunitsDivisor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSubunitsDivisor(String value) {
            this.nSubunitsDivisor = value;
        }

        /**
         * Gets the value of the numberOfOperations property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfOperations() {
            return numberOfOperations;
        }

        /**
         * Sets the value of the numberOfOperations property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfOperations(String value) {
            this.numberOfOperations = value;
        }

        /**
         * Gets the value of the risePerNSubunits property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RisePerNSubunits }
         *     
         */
        public PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RisePerNSubunits getRisePerNSubunits() {
            return risePerNSubunits;
        }

        /**
         * Sets the value of the risePerNSubunits property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RisePerNSubunits }
         *     
         */
        public void setRisePerNSubunits(PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RisePerNSubunits value) {
            this.risePerNSubunits = value;
        }

        /**
         * Gets the value of the rotationPerNSubunits property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RotationPerNSubunits }
         *     
         */
        public PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RotationPerNSubunits getRotationPerNSubunits() {
            return rotationPerNSubunits;
        }

        /**
         * Sets the value of the rotationPerNSubunits property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RotationPerNSubunits }
         *     
         */
        public void setRotationPerNSubunits(PdbxHelicalSymmetryType.PdbxHelicalSymmetry.RotationPerNSubunits value) {
            this.rotationPerNSubunits = value;
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
        public static class RisePerNSubunits {

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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class RotationPerNSubunits {

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
                    return "degrees";
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
