//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify 
 * additional annotation relevant to the molecular entities. 
 * 
 *     Example: 1  Actinomycin
 * <PDBx:pdbx_reference_molecule_annotationCategory>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="1">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>KEGG</PDBx:source>
 *       <PDBx:text>RNA polymerase inhibitor</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="2">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>KEGG</PDBx:source>
 *       <PDBx:text>antineoplastic</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="3">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>DrugBank</PDBx:source>
 *       <PDBx:text>Nucleic Acid Synthesis Inhibitor</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="4">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>DrugBank</PDBx:source>
 *       <PDBx:text>Protein Synthesis Inhibitor</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="5">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:text>antibiotic</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="6">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>Norine</PDBx:source>
 *       <PDBx:text>antitumor</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 *    <PDBx:pdbx_reference_molecule_annotation family_prd_id="FAM_000001" ordinal="7">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>PubChem</PDBx:source>
 *       <PDBx:text>transcriptional inhibitor</PDBx:text>
 *       <PDBx:type>Function</PDBx:type>
 *    </PDBx:pdbx_reference_molecule_annotation>
 * </PDBx:pdbx_reference_molecule_annotationCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_annotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_annotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_annotation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prd_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_molecule_annotationType", propOrder = {
    "pdbxReferenceMoleculeAnnotation"
})
public class PdbxReferenceMoleculeAnnotationType {

    @XmlElement(name = "pdbx_reference_molecule_annotation")
    protected List<PdbxReferenceMoleculeAnnotationType.PdbxReferenceMoleculeAnnotation> pdbxReferenceMoleculeAnnotation;

    /**
     * Gets the value of the pdbxReferenceMoleculeAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeAnnotationType.PdbxReferenceMoleculeAnnotation }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeAnnotationType.PdbxReferenceMoleculeAnnotation> getPdbxReferenceMoleculeAnnotation() {
        if (pdbxReferenceMoleculeAnnotation == null) {
            pdbxReferenceMoleculeAnnotation = new ArrayList<PdbxReferenceMoleculeAnnotationType.PdbxReferenceMoleculeAnnotation>();
        }
        return this.pdbxReferenceMoleculeAnnotation;
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
     *         &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prd_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceMoleculeAnnotation {

        @XmlElementRef(name = "chem_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> chemCompId;
        @XmlElementRef(name = "prd_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> prdId;
        @XmlElement(required = true)
        protected String source;
        @XmlElementRef(name = "support", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> support;
        @XmlElement(required = true)
        protected String text;
        @XmlElement(required = true)
        protected String type;
        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the chemCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getChemCompId() {
            return chemCompId;
        }

        /**
         * Sets the value of the chemCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setChemCompId(JAXBElement<String> value) {
            this.chemCompId = value;
        }

        /**
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPrdId(JAXBElement<String> value) {
            this.prdId = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the support property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSupport() {
            return support;
        }

        /**
         * Sets the value of the support property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSupport(JAXBElement<String> value) {
            this.support = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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

        /**
         * Gets the value of the familyPrdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyPrdId() {
            return familyPrdId;
        }

        /**
         * Sets the value of the familyPrdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyPrdId(String value) {
            this.familyPrdId = value;
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
