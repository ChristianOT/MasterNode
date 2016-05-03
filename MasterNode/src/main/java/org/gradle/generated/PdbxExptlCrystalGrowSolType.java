//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.generated;

import java.math.BigDecimal;
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
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
 * details about the solutions that were 'mixed'
 * to produce the crystal.
 * 
 *  Example 1
 * <PDBx:pdbx_exptl_crystal_grow_solCategory>
 *    <PDBx:pdbx_exptl_crystal_grow_sol crystal_id="1" sol_id="protein">
 *       <PDBx:pH>7.5</PDBx:pH>
 *       <PDBx:volume>0.5</PDBx:volume>
 *       <PDBx:volume_units>microliter</PDBx:volume_units>
 *    </PDBx:pdbx_exptl_crystal_grow_sol>
 *    <PDBx:pdbx_exptl_crystal_grow_sol crystal_id="1" sol_id="precipitant">
 *       <PDBx:pH>7.3</PDBx:pH>
 *       <PDBx:volume>0.5</PDBx:volume>
 *       <PDBx:volume_units>microliter</PDBx:volume_units>
 *    </PDBx:pdbx_exptl_crystal_grow_sol>
 *    <PDBx:pdbx_exptl_crystal_grow_sol crystal_id="1" sol_id="reservoir">
 *       <PDBx:pH>7.3</PDBx:pH>
 *       <PDBx:volume>0.5</PDBx:volume>
 *       <PDBx:volume_units>milliliter</PDBx:volume_units>
 *    </PDBx:pdbx_exptl_crystal_grow_sol>
 * </PDBx:pdbx_exptl_crystal_grow_solCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_exptl_crystal_grow_solType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_exptl_crystal_grow_solType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_exptl_crystal_grow_sol" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="pH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="volume_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sol_id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="precipitant"/>
 *                       &lt;enumeration value="reservoir"/>
 *                       &lt;enumeration value="macromolecule"/>
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
@XmlType(name = "pdbx_exptl_crystal_grow_solType", propOrder = {
    "pdbxExptlCrystalGrowSol"
})
public class PdbxExptlCrystalGrowSolType {

    @XmlElement(name = "pdbx_exptl_crystal_grow_sol")
    protected List<PdbxExptlCrystalGrowSolType.PdbxExptlCrystalGrowSol> pdbxExptlCrystalGrowSol;

    /**
     * Gets the value of the pdbxExptlCrystalGrowSol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxExptlCrystalGrowSol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxExptlCrystalGrowSol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxExptlCrystalGrowSolType.PdbxExptlCrystalGrowSol }
     * 
     * 
     */
    public List<PdbxExptlCrystalGrowSolType.PdbxExptlCrystalGrowSol> getPdbxExptlCrystalGrowSol() {
        if (pdbxExptlCrystalGrowSol == null) {
            pdbxExptlCrystalGrowSol = new ArrayList<PdbxExptlCrystalGrowSolType.PdbxExptlCrystalGrowSol>();
        }
        return this.pdbxExptlCrystalGrowSol;
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
     *         &lt;element name="pH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="volume_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sol_id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="precipitant"/>
     *             &lt;enumeration value="reservoir"/>
     *             &lt;enumeration value="macromolecule"/>
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
    public static class PdbxExptlCrystalGrowSol {

        @XmlElementRef(name = "pH", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> ph;
        @XmlElementRef(name = "volume", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> volume;
        @XmlElementRef(name = "volume_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> volumeUnits;
        @XmlAttribute(name = "crystal_id", required = true)
        protected String crystalId;
        @XmlAttribute(name = "sol_id", required = true)
        protected String solId;

        /**
         * Gets the value of the ph property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPH() {
            return ph;
        }

        /**
         * Sets the value of the ph property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPH(JAXBElement<BigDecimal> value) {
            this.ph = value;
        }

        /**
         * Gets the value of the volume property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setVolume(JAXBElement<BigDecimal> value) {
            this.volume = value;
        }

        /**
         * Gets the value of the volumeUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVolumeUnits() {
            return volumeUnits;
        }

        /**
         * Sets the value of the volumeUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVolumeUnits(JAXBElement<String> value) {
            this.volumeUnits = value;
        }

        /**
         * Gets the value of the crystalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrystalId() {
            return crystalId;
        }

        /**
         * Sets the value of the crystalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrystalId(String value) {
            this.crystalId = value;
        }

        /**
         * Gets the value of the solId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSolId() {
            return solId;
        }

        /**
         * Sets the value of the solId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSolId(String value) {
            this.solId = value;
        }

    }

}
