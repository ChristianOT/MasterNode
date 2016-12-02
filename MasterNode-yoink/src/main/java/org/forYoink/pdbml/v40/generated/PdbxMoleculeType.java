//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.forYoink.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_MOLECULE category identify reference molecules
 * within a PDB entry.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_moleculeCategory>
 *    <PDBx:pdbx_molecule asym_id="X" instance_id="1" prd_id="PRD_050001"></PDBx:pdbx_molecule>
 *    <PDBx:pdbx_molecule asym_id="Y" instance_id="1" prd_id="PRD_050001"></PDBx:pdbx_molecule>
 *    <PDBx:pdbx_molecule asym_id="Z" instance_id="1" prd_id="PRD_050001"></PDBx:pdbx_molecule>
 * </PDBx:pdbx_moleculeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_moleculeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_moleculeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_molecule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="instance_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_moleculeType", propOrder = {
    "pdbxMolecule"
})
public class PdbxMoleculeType {

    @XmlElement(name = "pdbx_molecule")
    protected List<PdbxMoleculeType.PdbxMolecule> pdbxMolecule;

    /**
     * Gets the value of the pdbxMolecule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxMolecule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxMolecule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxMoleculeType.PdbxMolecule }
     * 
     * 
     */
    public List<PdbxMoleculeType.PdbxMolecule> getPdbxMolecule() {
        if (pdbxMolecule == null) {
            pdbxMolecule = new ArrayList<PdbxMoleculeType.PdbxMolecule>();
        }
        return this.pdbxMolecule;
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
     *       &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="instance_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxMolecule {

        @XmlAttribute(name = "asym_id", required = true)
        protected String asymId;
        @XmlAttribute(name = "instance_id", required = true)
        protected BigInteger instanceId;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;

        /**
         * Gets the value of the asymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsymId() {
            return asymId;
        }

        /**
         * Sets the value of the asymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsymId(String value) {
            this.asymId = value;
        }

        /**
         * Gets the value of the instanceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInstanceId() {
            return instanceId;
        }

        /**
         * Sets the value of the instanceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInstanceId(BigInteger value) {
            this.instanceId = value;
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