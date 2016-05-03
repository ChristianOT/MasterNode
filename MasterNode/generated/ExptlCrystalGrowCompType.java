//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

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
 * Data items in the EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * (by whatever means) to produce the crystal.
 * 
 * In general, solution 1 is the solution that contains the
 * molecule to be crystallized and solution 2 is the solution
 * that contains the precipitant. However, the number of solutions
 * required to describe the crystallization protocol is not limited
 * to 2.
 * 
 * Details of the crystallization protocol should be given in
 * attribute details in category exptl_crystal_grow_comp using the solutions
 *  described in EXPTL_CRYSTAL_GROW_COMP.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:exptl_crystal_grow_compCategory>
 *    <PDBx:exptl_crystal_grow_comp crystal_id="1" id="1">
 *       <PDBx:conc>6 mg/ml</PDBx:conc>
 *       <PDBx:details> The protein solution was in a buffer containing 25 mM NaCl,
 *  100 mM NaMES/ MES buffer, pH 7.5, 3 mM NaAzide</PDBx:details>
 *       <PDBx:name>HIV-1 protease</PDBx:name>
 *       <PDBx:sol_id>1</PDBx:sol_id>
 *       <PDBx:volume>0.002 ml</PDBx:volume>
 *    </PDBx:exptl_crystal_grow_comp>
 *    <PDBx:exptl_crystal_grow_comp crystal_id="1" id="2">
 *       <PDBx:conc>4    M</PDBx:conc>
 *       <PDBx:details>in 3 mM NaAzide</PDBx:details>
 *       <PDBx:name>NaCl</PDBx:name>
 *       <PDBx:sol_id>2</PDBx:sol_id>
 *       <PDBx:volume>0.200 ml</PDBx:volume>
 *    </PDBx:exptl_crystal_grow_comp>
 *    <PDBx:exptl_crystal_grow_comp crystal_id="1" id="3">
 *       <PDBx:conc>100 mM</PDBx:conc>
 *       <PDBx:details>in 3 mM NaAzide</PDBx:details>
 *       <PDBx:name>Acetic Acid</PDBx:name>
 *       <PDBx:sol_id>2</PDBx:sol_id>
 *       <PDBx:volume>0.047 ml</PDBx:volume>
 *    </PDBx:exptl_crystal_grow_comp>
 *    <PDBx:exptl_crystal_grow_comp crystal_id="1" id="4">
 *       <PDBx:conc>100 mM</PDBx:conc>
 *       <PDBx:details> in 3 mM NaAzide. Buffer components were mixed to produce a
 * pH of 4.7 according to a ratio calculated from the pKa. The
 * actual pH of solution 2 was not measured.</PDBx:details>
 *       <PDBx:name>Na Acetate</PDBx:name>
 *       <PDBx:sol_id>2</PDBx:sol_id>
 *       <PDBx:volume>0.053 ml</PDBx:volume>
 *    </PDBx:exptl_crystal_grow_comp>
 *    <PDBx:exptl_crystal_grow_comp crystal_id="1" id="5">
 *       <PDBx:conc>neat</PDBx:conc>
 *       <PDBx:details>in 3 mM NaAzide</PDBx:details>
 *       <PDBx:name>water</PDBx:name>
 *       <PDBx:sol_id>2</PDBx:sol_id>
 *       <PDBx:volume>0.700 ml</PDBx:volume>
 *    </PDBx:exptl_crystal_grow_comp>
 * </PDBx:exptl_crystal_grow_compCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for exptl_crystal_grow_compType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exptl_crystal_grow_compType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exptl_crystal_grow_comp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "exptl_crystal_grow_compType", propOrder = {
    "exptlCrystalGrowComp"
})
public class ExptlCrystalGrowCompType {

    @XmlElement(name = "exptl_crystal_grow_comp")
    protected List<ExptlCrystalGrowCompType.ExptlCrystalGrowComp> exptlCrystalGrowComp;

    /**
     * Gets the value of the exptlCrystalGrowComp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exptlCrystalGrowComp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExptlCrystalGrowComp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExptlCrystalGrowCompType.ExptlCrystalGrowComp }
     * 
     * 
     */
    public List<ExptlCrystalGrowCompType.ExptlCrystalGrowComp> getExptlCrystalGrowComp() {
        if (exptlCrystalGrowComp == null) {
            exptlCrystalGrowComp = new ArrayList<ExptlCrystalGrowCompType.ExptlCrystalGrowComp>();
        }
        return this.exptlCrystalGrowComp;
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
     *         &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ExptlCrystalGrowComp {

        @XmlElementRef(name = "conc", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> conc;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlElementRef(name = "sol_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> solId;
        @XmlElementRef(name = "volume", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> volume;
        @XmlAttribute(name = "crystal_id", required = true)
        protected String crystalId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the conc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConc() {
            return conc;
        }

        /**
         * Sets the value of the conc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConc(JAXBElement<String> value) {
            this.conc = value;
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
         * Gets the value of the solId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSolId() {
            return solId;
        }

        /**
         * Sets the value of the solId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSolId(JAXBElement<String> value) {
            this.solId = value;
        }

        /**
         * Gets the value of the volume property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVolume(JAXBElement<String> value) {
            this.volume = value;
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
