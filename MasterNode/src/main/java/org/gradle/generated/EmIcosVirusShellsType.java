//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Data items in the EM_ICOS_VIRUS_SHELLS category record details
 * of the viral shell number, diameter of each shell and triangulation number.
 *  Example 1 - based on PDB entry 1DYL and laboratory records for the
 *              structure corresponding to PDB entry 1DYL
 * <PDBx:em_icos_virus_shellsCategory>
 *    <PDBx:em_icos_virus_shells id="1" virus_entity_id="1">
 *       <PDBx:shell_diameter>400</PDBx:shell_diameter>
 *       <PDBx:triangulation_num>4</PDBx:triangulation_num>
 *    </PDBx:em_icos_virus_shells>
 * </PDBx:em_icos_virus_shellsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_icos_virus_shellsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_icos_virus_shellsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_icos_virus_shells" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="shell_diameter" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="triangulation_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="virus_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "em_icos_virus_shellsType", propOrder = {
    "emIcosVirusShells"
})
public class EmIcosVirusShellsType {

    @XmlElement(name = "em_icos_virus_shells")
    protected List<EmIcosVirusShellsType.EmIcosVirusShells> emIcosVirusShells;

    /**
     * Gets the value of the emIcosVirusShells property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emIcosVirusShells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmIcosVirusShells().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmIcosVirusShellsType.EmIcosVirusShells }
     * 
     * 
     */
    public List<EmIcosVirusShellsType.EmIcosVirusShells> getEmIcosVirusShells() {
        if (emIcosVirusShells == null) {
            emIcosVirusShells = new ArrayList<EmIcosVirusShellsType.EmIcosVirusShells>();
        }
        return this.emIcosVirusShells;
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
     *         &lt;element name="shell_diameter" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="triangulation_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="virus_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class EmIcosVirusShells {

        @XmlElementRef(name = "shell_diameter", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<EmIcosVirusShellsType.EmIcosVirusShells.ShellDiameter> shellDiameter;
        @XmlElementRef(name = "triangulation_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> triangulationNum;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "virus_entity_id", required = true)
        protected String virusEntityId;

        /**
         * Gets the value of the shellDiameter property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link EmIcosVirusShellsType.EmIcosVirusShells.ShellDiameter }{@code >}
         *     
         */
        public JAXBElement<EmIcosVirusShellsType.EmIcosVirusShells.ShellDiameter> getShellDiameter() {
            return shellDiameter;
        }

        /**
         * Sets the value of the shellDiameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link EmIcosVirusShellsType.EmIcosVirusShells.ShellDiameter }{@code >}
         *     
         */
        public void setShellDiameter(JAXBElement<EmIcosVirusShellsType.EmIcosVirusShells.ShellDiameter> value) {
            this.shellDiameter = value;
        }

        /**
         * Gets the value of the triangulationNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getTriangulationNum() {
            return triangulationNum;
        }

        /**
         * Sets the value of the triangulationNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setTriangulationNum(JAXBElement<BigInteger> value) {
            this.triangulationNum = value;
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

        /**
         * Gets the value of the virusEntityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVirusEntityId() {
            return virusEntityId;
        }

        /**
         * Sets the value of the virusEntityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVirusEntityId(String value) {
            this.virusEntityId = value;
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
        public static class ShellDiameter {

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
