//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

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
 * 
 * Description of the software that was used for data collection, data processing, 
 * data analysis, structure calculations and refinement. The description should 
 * include the name of the software, the author of the software and the version used.
 *  This example describes the software used in the MCP-1 study.
 * <PDBx:pdbx_nmr_softwareCategory>
 *    <PDBx:pdbx_nmr_software ordinal="1">
 *       <PDBx:authors>Bruker</PDBx:authors>
 *       <PDBx:classification>collection</PDBx:classification>
 *       <PDBx:name>UXNMR</PDBx:name>
 *       <PDBx:version>940501.3</PDBx:version>
 *    </PDBx:pdbx_nmr_software>
 *    <PDBx:pdbx_nmr_software ordinal="2">
 *       <PDBx:authors>Hare</PDBx:authors>
 *       <PDBx:classification>processing</PDBx:classification>
 *       <PDBx:name>FELIX</PDBx:name>
 *       <PDBx:version>1.1</PDBx:version>
 *    </PDBx:pdbx_nmr_software>
 *    <PDBx:pdbx_nmr_software ordinal="3">
 *       <PDBx:authors>Kraulis</PDBx:authors>
 *       <PDBx:classification>data analysis</PDBx:classification>
 *       <PDBx:name>ANSIG</PDBx:name>
 *       <PDBx:version>3.0</PDBx:version>
 *    </PDBx:pdbx_nmr_software>
 *    <PDBx:pdbx_nmr_software ordinal="4">
 *       <PDBx:authors>Brunger</PDBx:authors>
 *       <PDBx:classification>structure calculation</PDBx:classification>
 *       <PDBx:name>X-PLOR</PDBx:name>
 *       <PDBx:version>3.8</PDBx:version>
 *    </PDBx:pdbx_nmr_software>
 * </PDBx:pdbx_nmr_softwareCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_softwareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_softwareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_software" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="authors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_nmr_softwareType", propOrder = {
    "pdbxNmrSoftware"
})
public class PdbxNmrSoftwareType {

    @XmlElement(name = "pdbx_nmr_software")
    protected List<PdbxNmrSoftwareType.PdbxNmrSoftware> pdbxNmrSoftware;

    /**
     * Gets the value of the pdbxNmrSoftware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSoftware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSoftwareType.PdbxNmrSoftware }
     * 
     * 
     */
    public List<PdbxNmrSoftwareType.PdbxNmrSoftware> getPdbxNmrSoftware() {
        if (pdbxNmrSoftware == null) {
            pdbxNmrSoftware = new ArrayList<PdbxNmrSoftwareType.PdbxNmrSoftware>();
        }
        return this.pdbxNmrSoftware;
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
     *         &lt;element name="authors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxNmrSoftware {

        @XmlElementRef(name = "authors", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authors;
        @XmlElement(required = true)
        protected String classification;
        @XmlElement(required = true)
        protected String name;
        @XmlElementRef(name = "version", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> version;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the authors property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthors() {
            return authors;
        }

        /**
         * Sets the value of the authors property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthors(JAXBElement<String> value) {
            this.authors = value;
        }

        /**
         * Gets the value of the classification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassification() {
            return classification;
        }

        /**
         * Sets the value of the classification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassification(String value) {
            this.classification = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVersion(JAXBElement<String> value) {
            this.version = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

    }

}
