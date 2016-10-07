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
 * Data items in the STRUCT_BIOL_GEN category record details about
 * the generation of each biological unit. The STRUCT_BIOL_GEN
 * data items provide the specifications of the components that
 * constitute that biological unit, which may include symmetry
 * elements.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_biol_genCategory>
 *    <PDBx:struct_biol_gen asym_id="A" biol_id="1" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="B" biol_id="1" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="A" biol_id="2" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="B" biol_id="2" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="C" biol_id="2" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="A" biol_id="3" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="B" biol_id="3" symmetry="1_555"></PDBx:struct_biol_gen>
 *    <PDBx:struct_biol_gen asym_id="D" biol_id="3" symmetry="1_555"></PDBx:struct_biol_gen>
 * </PDBx:struct_biol_genCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_biol_genType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_biol_genType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_biol_gen" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_PDB_order" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_full_symmetry_operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="biol_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_biol_genType", propOrder = {
    "structBiolGen"
})
public class StructBiolGenType {

    @XmlElement(name = "struct_biol_gen")
    protected List<StructBiolGenType.StructBiolGen> structBiolGen;

    /**
     * Gets the value of the structBiolGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structBiolGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructBiolGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructBiolGenType.StructBiolGen }
     * 
     * 
     */
    public List<StructBiolGenType.StructBiolGen> getStructBiolGen() {
        if (structBiolGen == null) {
            structBiolGen = new ArrayList<StructBiolGenType.StructBiolGen>();
        }
        return this.structBiolGen;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_PDB_order" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_full_symmetry_operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="biol_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructBiolGen {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "pdbx_PDB_order", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxPDBOrder;
        @XmlElementRef(name = "pdbx_full_symmetry_operation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxFullSymmetryOperation;
        @XmlAttribute(name = "asym_id", required = true)
        protected String asymId;
        @XmlAttribute(name = "biol_id", required = true)
        protected String biolId;
        @XmlAttribute(name = "symmetry", required = true)
        protected String symmetry;

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
         * Gets the value of the pdbxPDBOrder property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxPDBOrder() {
            return pdbxPDBOrder;
        }

        /**
         * Sets the value of the pdbxPDBOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxPDBOrder(JAXBElement<BigInteger> value) {
            this.pdbxPDBOrder = value;
        }

        /**
         * Gets the value of the pdbxFullSymmetryOperation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxFullSymmetryOperation() {
            return pdbxFullSymmetryOperation;
        }

        /**
         * Sets the value of the pdbxFullSymmetryOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxFullSymmetryOperation(JAXBElement<String> value) {
            this.pdbxFullSymmetryOperation = value;
        }

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
         * Gets the value of the biolId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiolId() {
            return biolId;
        }

        /**
         * Sets the value of the biolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiolId(String value) {
            this.biolId = value;
        }

        /**
         * Gets the value of the symmetry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSymmetry() {
            return symmetry;
        }

        /**
         * Sets the value of the symmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSymmetry(String value) {
            this.symmetry = value;
        }

    }

}
