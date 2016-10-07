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
 * Data items in the CITATION category record details about the
 * literature cited as being relevant to the contents of the data
 * block.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:citationCategory>
 *    <PDBx:citation id="primary">
 *       <PDBx:book_id_ISBN xsi:nil="true" />
 *       <PDBx:book_publisher xsi:nil="true" />
 *       <PDBx:book_title xsi:nil="true" />
 *       <PDBx:coordinate_linkage>yes</PDBx:coordinate_linkage>
 *       <PDBx:country>US</PDBx:country>
 *       <PDBx:details> The publication that directly relates to this coordinate
 * set.</PDBx:details>
 *       <PDBx:journal_abbrev>J. Biol. Chem.</PDBx:journal_abbrev>
 *       <PDBx:journal_id_ASTM>HBCHA3</PDBx:journal_id_ASTM>
 *       <PDBx:journal_id_CSD>071</PDBx:journal_id_CSD>
 *       <PDBx:journal_id_ISSN>0021-9258</PDBx:journal_id_ISSN>
 *       <PDBx:journal_issue xsi:nil="true" />
 *       <PDBx:journal_volume>265</PDBx:journal_volume>
 *       <PDBx:page_first>14209</PDBx:page_first>
 *       <PDBx:page_last>14219</PDBx:page_last>
 *       <PDBx:title> Crystallographic analysis of a complex between human
 * immunodeficiency virus type 1 protease and acetyl-pepstatin
 * at 2.0-Angstroms resolution.</PDBx:title>
 *       <PDBx:year>1990</PDBx:year>
 *    </PDBx:citation>
 *    <PDBx:citation id="2">
 *       <PDBx:book_id_ISBN xsi:nil="true" />
 *       <PDBx:book_publisher xsi:nil="true" />
 *       <PDBx:book_title xsi:nil="true" />
 *       <PDBx:coordinate_linkage>no</PDBx:coordinate_linkage>
 *       <PDBx:country>UK</PDBx:country>
 *       <PDBx:details> Determination of the structure of the unliganded enzyme.</PDBx:details>
 *       <PDBx:journal_abbrev>Nature</PDBx:journal_abbrev>
 *       <PDBx:journal_id_ASTM>NATUAS</PDBx:journal_id_ASTM>
 *       <PDBx:journal_id_CSD>006</PDBx:journal_id_CSD>
 *       <PDBx:journal_id_ISSN>0028-0836</PDBx:journal_id_ISSN>
 *       <PDBx:journal_issue xsi:nil="true" />
 *       <PDBx:journal_volume>337</PDBx:journal_volume>
 *       <PDBx:page_first>615</PDBx:page_first>
 *       <PDBx:page_last>619</PDBx:page_last>
 *       <PDBx:title> Three-dimensional structure of aspartyl-protease from human
 * immunodeficiency virus HIV-1.</PDBx:title>
 *       <PDBx:year>1989</PDBx:year>
 *    </PDBx:citation>
 *    <PDBx:citation id="3">
 *       <PDBx:book_id_ISBN xsi:nil="true" />
 *       <PDBx:book_publisher xsi:nil="true" />
 *       <PDBx:book_title xsi:nil="true" />
 *       <PDBx:coordinate_linkage>no</PDBx:coordinate_linkage>
 *       <PDBx:country>US</PDBx:country>
 *       <PDBx:details> Crystallization of the unliganded enzyme.</PDBx:details>
 *       <PDBx:journal_abbrev>J. Biol. Chem.</PDBx:journal_abbrev>
 *       <PDBx:journal_id_ASTM>HBCHA3</PDBx:journal_id_ASTM>
 *       <PDBx:journal_id_CSD>071</PDBx:journal_id_CSD>
 *       <PDBx:journal_id_ISSN>0021-9258</PDBx:journal_id_ISSN>
 *       <PDBx:journal_issue xsi:nil="true" />
 *       <PDBx:journal_volume>264</PDBx:journal_volume>
 *       <PDBx:page_first>1919</PDBx:page_first>
 *       <PDBx:page_last>1921</PDBx:page_last>
 *       <PDBx:title> Crystallization of the aspartylprotease from human
 * immunodeficiency virus, HIV-1.</PDBx:title>
 *       <PDBx:year>1989</PDBx:year>
 *    </PDBx:citation>
 *    <PDBx:citation id="4">
 *       <PDBx:book_id_ISBN xsi:nil="true" />
 *       <PDBx:book_publisher xsi:nil="true" />
 *       <PDBx:book_title xsi:nil="true" />
 *       <PDBx:coordinate_linkage>no</PDBx:coordinate_linkage>
 *       <PDBx:country>US</PDBx:country>
 *       <PDBx:details> Expression and purification of the enzyme.</PDBx:details>
 *       <PDBx:journal_abbrev>J. Biol. Chem.</PDBx:journal_abbrev>
 *       <PDBx:journal_id_ASTM>HBCHA3</PDBx:journal_id_ASTM>
 *       <PDBx:journal_id_CSD>071</PDBx:journal_id_CSD>
 *       <PDBx:journal_id_ISSN>0021-9258</PDBx:journal_id_ISSN>
 *       <PDBx:journal_issue xsi:nil="true" />
 *       <PDBx:journal_volume>264</PDBx:journal_volume>
 *       <PDBx:page_first>2307</PDBx:page_first>
 *       <PDBx:page_last>2312</PDBx:page_last>
 *       <PDBx:title> Human immunodeficiency virus protease. Bacterial expression
 * and characterization of the purified aspartic protease.</PDBx:title>
 *       <PDBx:year>1989</PDBx:year>
 *    </PDBx:citation>
 * </PDBx:citationCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for citationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="abstract_id_CAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="book_id_ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="book_publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="book_publisher_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="book_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="coordinate_linkage" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="database_id_CSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="database_id_Medline" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_abbrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_id_ASTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_id_CSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_id_ISSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="journal_volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="page_first" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="page_last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_database_id_DOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_database_id_PubMed" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="-1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unpublished_flag" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "citationType", propOrder = {
    "citation"
})
public class CitationType {

    protected List<CitationType.Citation> citation;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationType.Citation }
     * 
     * 
     */
    public List<CitationType.Citation> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CitationType.Citation>();
        }
        return this.citation;
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
     *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="abstract_id_CAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="book_id_ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="book_publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="book_publisher_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="book_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="coordinate_linkage" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="database_id_CSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="database_id_Medline" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_abbrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_id_ASTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_id_CSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_id_ISSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="journal_volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="page_first" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="page_last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_database_id_DOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_database_id_PubMed" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="-1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unpublished_flag" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
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
    public static class Citation {

        @XmlElementRef(name = "abstract", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> _abstract;
        @XmlElementRef(name = "abstract_id_CAS", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> abstractIdCAS;
        @XmlElementRef(name = "book_id_ISBN", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bookIdISBN;
        @XmlElementRef(name = "book_publisher", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bookPublisher;
        @XmlElementRef(name = "book_publisher_city", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bookPublisherCity;
        @XmlElementRef(name = "book_title", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bookTitle;
        @XmlElementRef(name = "coordinate_linkage", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> coordinateLinkage;
        @XmlElementRef(name = "country", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> country;
        @XmlElementRef(name = "database_id_CSD", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> databaseIdCSD;
        @XmlElementRef(name = "database_id_Medline", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> databaseIdMedline;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "journal_abbrev", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalAbbrev;
        @XmlElementRef(name = "journal_full", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalFull;
        @XmlElementRef(name = "journal_id_ASTM", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalIdASTM;
        @XmlElementRef(name = "journal_id_CSD", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalIdCSD;
        @XmlElementRef(name = "journal_id_ISSN", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalIdISSN;
        @XmlElementRef(name = "journal_issue", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalIssue;
        @XmlElementRef(name = "journal_volume", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> journalVolume;
        @XmlElementRef(name = "language", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> language;
        @XmlElementRef(name = "page_first", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pageFirst;
        @XmlElementRef(name = "page_last", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pageLast;
        @XmlElementRef(name = "pdbx_database_id_DOI", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDatabaseIdDOI;
        @XmlElementRef(name = "pdbx_database_id_PubMed", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxDatabaseIdPubMed;
        @XmlElementRef(name = "title", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> title;
        @XmlElementRef(name = "unpublished_flag", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> unpublishedFlag;
        @XmlElementRef(name = "year", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> year;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the abstract property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAbstract() {
            return _abstract;
        }

        /**
         * Sets the value of the abstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAbstract(JAXBElement<String> value) {
            this._abstract = value;
        }

        /**
         * Gets the value of the abstractIdCAS property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAbstractIdCAS() {
            return abstractIdCAS;
        }

        /**
         * Sets the value of the abstractIdCAS property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAbstractIdCAS(JAXBElement<String> value) {
            this.abstractIdCAS = value;
        }

        /**
         * Gets the value of the bookIdISBN property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBookIdISBN() {
            return bookIdISBN;
        }

        /**
         * Sets the value of the bookIdISBN property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBookIdISBN(JAXBElement<String> value) {
            this.bookIdISBN = value;
        }

        /**
         * Gets the value of the bookPublisher property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBookPublisher() {
            return bookPublisher;
        }

        /**
         * Sets the value of the bookPublisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBookPublisher(JAXBElement<String> value) {
            this.bookPublisher = value;
        }

        /**
         * Gets the value of the bookPublisherCity property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBookPublisherCity() {
            return bookPublisherCity;
        }

        /**
         * Sets the value of the bookPublisherCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBookPublisherCity(JAXBElement<String> value) {
            this.bookPublisherCity = value;
        }

        /**
         * Gets the value of the bookTitle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBookTitle() {
            return bookTitle;
        }

        /**
         * Sets the value of the bookTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBookTitle(JAXBElement<String> value) {
            this.bookTitle = value;
        }

        /**
         * Gets the value of the coordinateLinkage property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCoordinateLinkage() {
            return coordinateLinkage;
        }

        /**
         * Sets the value of the coordinateLinkage property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCoordinateLinkage(JAXBElement<String> value) {
            this.coordinateLinkage = value;
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
         * Gets the value of the databaseIdCSD property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDatabaseIdCSD() {
            return databaseIdCSD;
        }

        /**
         * Sets the value of the databaseIdCSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDatabaseIdCSD(JAXBElement<String> value) {
            this.databaseIdCSD = value;
        }

        /**
         * Gets the value of the databaseIdMedline property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getDatabaseIdMedline() {
            return databaseIdMedline;
        }

        /**
         * Sets the value of the databaseIdMedline property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setDatabaseIdMedline(JAXBElement<BigInteger> value) {
            this.databaseIdMedline = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDetails(JAXBElement<String> value) {
            this.details = value;
        }

        /**
         * Gets the value of the journalAbbrev property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalAbbrev() {
            return journalAbbrev;
        }

        /**
         * Sets the value of the journalAbbrev property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalAbbrev(JAXBElement<String> value) {
            this.journalAbbrev = value;
        }

        /**
         * Gets the value of the journalFull property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalFull() {
            return journalFull;
        }

        /**
         * Sets the value of the journalFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalFull(JAXBElement<String> value) {
            this.journalFull = value;
        }

        /**
         * Gets the value of the journalIdASTM property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalIdASTM() {
            return journalIdASTM;
        }

        /**
         * Sets the value of the journalIdASTM property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalIdASTM(JAXBElement<String> value) {
            this.journalIdASTM = value;
        }

        /**
         * Gets the value of the journalIdCSD property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalIdCSD() {
            return journalIdCSD;
        }

        /**
         * Sets the value of the journalIdCSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalIdCSD(JAXBElement<String> value) {
            this.journalIdCSD = value;
        }

        /**
         * Gets the value of the journalIdISSN property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalIdISSN() {
            return journalIdISSN;
        }

        /**
         * Sets the value of the journalIdISSN property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalIdISSN(JAXBElement<String> value) {
            this.journalIdISSN = value;
        }

        /**
         * Gets the value of the journalIssue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalIssue() {
            return journalIssue;
        }

        /**
         * Sets the value of the journalIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalIssue(JAXBElement<String> value) {
            this.journalIssue = value;
        }

        /**
         * Gets the value of the journalVolume property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJournalVolume() {
            return journalVolume;
        }

        /**
         * Sets the value of the journalVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJournalVolume(JAXBElement<String> value) {
            this.journalVolume = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLanguage(JAXBElement<String> value) {
            this.language = value;
        }

        /**
         * Gets the value of the pageFirst property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPageFirst() {
            return pageFirst;
        }

        /**
         * Sets the value of the pageFirst property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPageFirst(JAXBElement<String> value) {
            this.pageFirst = value;
        }

        /**
         * Gets the value of the pageLast property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPageLast() {
            return pageLast;
        }

        /**
         * Sets the value of the pageLast property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPageLast(JAXBElement<String> value) {
            this.pageLast = value;
        }

        /**
         * Gets the value of the pdbxDatabaseIdDOI property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDatabaseIdDOI() {
            return pdbxDatabaseIdDOI;
        }

        /**
         * Sets the value of the pdbxDatabaseIdDOI property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDatabaseIdDOI(JAXBElement<String> value) {
            this.pdbxDatabaseIdDOI = value;
        }

        /**
         * Gets the value of the pdbxDatabaseIdPubMed property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxDatabaseIdPubMed() {
            return pdbxDatabaseIdPubMed;
        }

        /**
         * Sets the value of the pdbxDatabaseIdPubMed property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxDatabaseIdPubMed(JAXBElement<BigInteger> value) {
            this.pdbxDatabaseIdPubMed = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTitle(JAXBElement<String> value) {
            this.title = value;
        }

        /**
         * Gets the value of the unpublishedFlag property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getUnpublishedFlag() {
            return unpublishedFlag;
        }

        /**
         * Sets the value of the unpublishedFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setUnpublishedFlag(JAXBElement<String> value) {
            this.unpublishedFlag = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setYear(JAXBElement<BigInteger> value) {
            this.year = value;
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
