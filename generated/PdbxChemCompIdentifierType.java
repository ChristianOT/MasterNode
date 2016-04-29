//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

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


/**
 * 
 * Data items in the CHEM_COMP_IDENTIFIER category provide
 * identifiers for chemical components.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_identifierCategory>
 *    <PDBx:pdbx_chem_comp_identifier comp_id="ATP" program="ACDLabs" program_version="10.04" type="SYSTEMATIC NAME">
 *       <PDBx:identifier>adenosine 5&apos;-(tetrahydrogen triphosphate)</PDBx:identifier>
 *    </PDBx:pdbx_chem_comp_identifier>
 * </PDBx:pdbx_chem_comp_identifierCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_identifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_identifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_identifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="program_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="COMMON NAME"/>
 *                       &lt;enumeration value="SYSTEMATIC NAME"/>
 *                       &lt;enumeration value="CAS REGISTRY NUMBER"/>
 *                       &lt;enumeration value="PUBCHEM Identifier"/>
 *                       &lt;enumeration value="MDL Identifier"/>
 *                       &lt;enumeration value="SYNONYM"/>
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
@XmlType(name = "pdbx_chem_comp_identifierType", propOrder = {
    "pdbxChemCompIdentifier"
})
public class PdbxChemCompIdentifierType {

    @XmlElement(name = "pdbx_chem_comp_identifier")
    protected List<PdbxChemCompIdentifierType.PdbxChemCompIdentifier> pdbxChemCompIdentifier;

    /**
     * Gets the value of the pdbxChemCompIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompIdentifierType.PdbxChemCompIdentifier }
     * 
     * 
     */
    public List<PdbxChemCompIdentifierType.PdbxChemCompIdentifier> getPdbxChemCompIdentifier() {
        if (pdbxChemCompIdentifier == null) {
            pdbxChemCompIdentifier = new ArrayList<PdbxChemCompIdentifierType.PdbxChemCompIdentifier>();
        }
        return this.pdbxChemCompIdentifier;
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
     *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="program_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="COMMON NAME"/>
     *             &lt;enumeration value="SYSTEMATIC NAME"/>
     *             &lt;enumeration value="CAS REGISTRY NUMBER"/>
     *             &lt;enumeration value="PUBCHEM Identifier"/>
     *             &lt;enumeration value="MDL Identifier"/>
     *             &lt;enumeration value="SYNONYM"/>
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
    @XmlType(name = "", propOrder = {

    })
    public static class PdbxChemCompIdentifier {

        @XmlElement(required = true)
        protected String identifier;
        @XmlElementRef(name = "ordinal", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> ordinal;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "program", required = true)
        protected String program;
        @XmlAttribute(name = "program_version", required = true)
        protected String programVersion;
        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setOrdinal(JAXBElement<BigInteger> value) {
            this.ordinal = value;
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
         * Gets the value of the program property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgram() {
            return program;
        }

        /**
         * Sets the value of the program property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgram(String value) {
            this.program = value;
        }

        /**
         * Gets the value of the programVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramVersion() {
            return programVersion;
        }

        /**
         * Sets the value of the programVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramVersion(String value) {
            this.programVersion = value;
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

    }

}
