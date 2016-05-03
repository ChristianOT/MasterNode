//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

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
 * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
 * entity families.
 * 
 *     Example: 1  Actinomycin
 * <PDBx:pdbx_reference_molecule_familyCategory>
 *    <PDBx:pdbx_reference_molecule_family family_prd_id="FAM_000001">
 *       <PDBx:name>ACTINOMYCIN</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_family>
 * </PDBx:pdbx_reference_molecule_familyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_familyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_familyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_family" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="release_status" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="REL"/>
 *                         &lt;enumeration value="HOLD"/>
 *                         &lt;enumeration value="OBS"/>
 *                         &lt;enumeration value="WAIT"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="replaced_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="replaces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_molecule_familyType", propOrder = {
    "pdbxReferenceMoleculeFamily"
})
public class PdbxReferenceMoleculeFamilyType {

    @XmlElement(name = "pdbx_reference_molecule_family")
    protected List<PdbxReferenceMoleculeFamilyType.PdbxReferenceMoleculeFamily> pdbxReferenceMoleculeFamily;

    /**
     * Gets the value of the pdbxReferenceMoleculeFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeFamilyType.PdbxReferenceMoleculeFamily }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeFamilyType.PdbxReferenceMoleculeFamily> getPdbxReferenceMoleculeFamily() {
        if (pdbxReferenceMoleculeFamily == null) {
            pdbxReferenceMoleculeFamily = new ArrayList<PdbxReferenceMoleculeFamilyType.PdbxReferenceMoleculeFamily>();
        }
        return this.pdbxReferenceMoleculeFamily;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="release_status" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="REL"/>
     *               &lt;enumeration value="HOLD"/>
     *               &lt;enumeration value="OBS"/>
     *               &lt;enumeration value="WAIT"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="replaced_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="replaces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceMoleculeFamily {

        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlElementRef(name = "release_status", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> releaseStatus;
        @XmlElementRef(name = "replaced_by", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> replacedBy;
        @XmlElementRef(name = "replaces", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> replaces;
        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setName(JAXBElement<String> value) {
            this.name = value;
        }

        /**
         * Gets the value of the releaseStatus property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReleaseStatus() {
            return releaseStatus;
        }

        /**
         * Sets the value of the releaseStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReleaseStatus(JAXBElement<String> value) {
            this.releaseStatus = value;
        }

        /**
         * Gets the value of the replacedBy property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReplacedBy() {
            return replacedBy;
        }

        /**
         * Sets the value of the replacedBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReplacedBy(JAXBElement<String> value) {
            this.replacedBy = value;
        }

        /**
         * Gets the value of the replaces property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReplaces() {
            return replaces;
        }

        /**
         * Sets the value of the replaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReplaces(JAXBElement<String> value) {
            this.replaces = value;
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

    }

}
