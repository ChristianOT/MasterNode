//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
 * reference information about small polymer molecules.
 * 
 *     Example: 1  Actinomycin
 * <PDBx:pdbx_reference_molecule_listCategory>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000001"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000002"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000003"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000004"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000005"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000006"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000007"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000008"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000009"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000010"></PDBx:pdbx_reference_molecule_list>
 *    <PDBx:pdbx_reference_molecule_list family_prd_id="FAM_000001" prd_id="PRD_000011"></PDBx:pdbx_reference_molecule_list>
 * </PDBx:pdbx_reference_molecule_listCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_molecule_listType", propOrder = {
    "pdbxReferenceMoleculeList"
})
public class PdbxReferenceMoleculeListType {

    @XmlElement(name = "pdbx_reference_molecule_list")
    protected List<PdbxReferenceMoleculeListType.PdbxReferenceMoleculeList> pdbxReferenceMoleculeList;

    /**
     * Gets the value of the pdbxReferenceMoleculeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeListType.PdbxReferenceMoleculeList }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeListType.PdbxReferenceMoleculeList> getPdbxReferenceMoleculeList() {
        if (pdbxReferenceMoleculeList == null) {
            pdbxReferenceMoleculeList = new ArrayList<PdbxReferenceMoleculeListType.PdbxReferenceMoleculeList>();
        }
        return this.pdbxReferenceMoleculeList;
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
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxReferenceMoleculeList {

        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;

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
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrdId(String value) {
            this.prdId = value;
        }

    }

}
