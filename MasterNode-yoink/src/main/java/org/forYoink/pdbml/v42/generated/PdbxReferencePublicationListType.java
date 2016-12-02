//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
 * related to PDB citation data.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_reference_publication_listCategory>
 *    <PDBx:pdbx_reference_publication_list publication_abbrev="ACC.CHEM.RES.">
 *       <PDBx:ASTM_code_type>ASTM</PDBx:ASTM_code_type>
 *       <PDBx:ASTM_code_value>ACHRE4</PDBx:ASTM_code_value>
 *       <PDBx:ISSN_code_type>ISSN</PDBx:ISSN_code_type>
 *       <PDBx:ISSN_code_value>0001-4842</PDBx:ISSN_code_value>
 *       <PDBx:country>US</PDBx:country>
 *    </PDBx:pdbx_reference_publication_list>
 * </PDBx:pdbx_reference_publication_listCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_publication_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_publication_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_publication_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ASTM_code_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ASTM_code_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISSN_code_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISSN_code_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="publication_abbrev" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_publication_listType", propOrder = {
    "pdbxReferencePublicationList"
})
public class PdbxReferencePublicationListType {

    @XmlElement(name = "pdbx_reference_publication_list")
    protected List<PdbxReferencePublicationListType.PdbxReferencePublicationList> pdbxReferencePublicationList;

    /**
     * Gets the value of the pdbxReferencePublicationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferencePublicationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferencePublicationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferencePublicationListType.PdbxReferencePublicationList }
     * 
     * 
     */
    public List<PdbxReferencePublicationListType.PdbxReferencePublicationList> getPdbxReferencePublicationList() {
        if (pdbxReferencePublicationList == null) {
            pdbxReferencePublicationList = new ArrayList<PdbxReferencePublicationListType.PdbxReferencePublicationList>();
        }
        return this.pdbxReferencePublicationList;
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
     *         &lt;element name="ASTM_code_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ASTM_code_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISSN_code_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISSN_code_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="publication_abbrev" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferencePublicationList {

        @XmlElementRef(name = "ASTM_code_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> astmCodeType;
        @XmlElementRef(name = "ASTM_code_value", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> astmCodeValue;
        @XmlElementRef(name = "ISSN_code_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> issnCodeType;
        @XmlElementRef(name = "ISSN_code_value", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> issnCodeValue;
        @XmlElementRef(name = "country", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> country;
        @XmlElementRef(name = "end_year", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endYear;
        @XmlElementRef(name = "start_year", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> startYear;
        @XmlAttribute(name = "publication_abbrev", required = true)
        protected String publicationAbbrev;

        /**
         * Gets the value of the astmCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getASTMCodeType() {
            return astmCodeType;
        }

        /**
         * Sets the value of the astmCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setASTMCodeType(JAXBElement<String> value) {
            this.astmCodeType = value;
        }

        /**
         * Gets the value of the astmCodeValue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getASTMCodeValue() {
            return astmCodeValue;
        }

        /**
         * Sets the value of the astmCodeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setASTMCodeValue(JAXBElement<String> value) {
            this.astmCodeValue = value;
        }

        /**
         * Gets the value of the issnCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getISSNCodeType() {
            return issnCodeType;
        }

        /**
         * Sets the value of the issnCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setISSNCodeType(JAXBElement<String> value) {
            this.issnCodeType = value;
        }

        /**
         * Gets the value of the issnCodeValue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getISSNCodeValue() {
            return issnCodeValue;
        }

        /**
         * Sets the value of the issnCodeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setISSNCodeValue(JAXBElement<String> value) {
            this.issnCodeValue = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCountry(JAXBElement<String> value) {
            this.country = value;
        }

        /**
         * Gets the value of the endYear property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndYear() {
            return endYear;
        }

        /**
         * Sets the value of the endYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndYear(JAXBElement<String> value) {
            this.endYear = value;
        }

        /**
         * Gets the value of the startYear property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStartYear() {
            return startYear;
        }

        /**
         * Sets the value of the startYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStartYear(JAXBElement<String> value) {
            this.startYear = value;
        }

        /**
         * Gets the value of the publicationAbbrev property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicationAbbrev() {
            return publicationAbbrev;
        }

        /**
         * Sets the value of the publicationAbbrev property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicationAbbrev(String value) {
            this.publicationAbbrev = value;
        }

    }

}