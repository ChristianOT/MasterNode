//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * to produce the crystal.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_exptl_crystal_grow_compCategory>
 *    <PDBx:pdbx_exptl_crystal_grow_comp comp_id="1" crystal_id="4">
 *       <PDBx:comp_name>protein</PDBx:comp_name>
 *       <PDBx:conc>25.</PDBx:conc>
 *       <PDBx:conc_range xsi:nil="true" />
 *       <PDBx:conc_units>mg/ml</PDBx:conc_units>
 *       <PDBx:sol_id>protein</PDBx:sol_id>
 *    </PDBx:pdbx_exptl_crystal_grow_comp>
 *    <PDBx:pdbx_exptl_crystal_grow_comp comp_id="2" crystal_id="4">
 *       <PDBx:comp_name>Tris HCl</PDBx:comp_name>
 *       <PDBx:conc>20.</PDBx:conc>
 *       <PDBx:conc_range xsi:nil="true" />
 *       <PDBx:conc_units>millimolar</PDBx:conc_units>
 *       <PDBx:sol_id>protein</PDBx:sol_id>
 *    </PDBx:pdbx_exptl_crystal_grow_comp>
 *    <PDBx:pdbx_exptl_crystal_grow_comp comp_id="3" crystal_id="4">
 *       <PDBx:comp_name>NaCl</PDBx:comp_name>
 *       <PDBx:conc>0.2</PDBx:conc>
 *       <PDBx:conc_range xsi:nil="true" />
 *       <PDBx:conc_units>molar</PDBx:conc_units>
 *       <PDBx:sol_id>protein</PDBx:sol_id>
 *    </PDBx:pdbx_exptl_crystal_grow_comp>
 *    <PDBx:pdbx_exptl_crystal_grow_comp comp_id="1" crystal_id="4">
 *       <PDBx:comp_name>PEG 4000</PDBx:comp_name>
 *       <PDBx:conc>12.5</PDBx:conc>
 *       <PDBx:conc_range xsi:nil="true" />
 *       <PDBx:conc_units>percent_weight_by_volume</PDBx:conc_units>
 *       <PDBx:sol_id>precipitant</PDBx:sol_id>
 *    </PDBx:pdbx_exptl_crystal_grow_comp>
 *    <PDBx:pdbx_exptl_crystal_grow_comp comp_id="2" crystal_id="4">
 *       <PDBx:comp_name>MES</PDBx:comp_name>
 *       <PDBx:conc>0.1</PDBx:conc>
 *       <PDBx:conc_range xsi:nil="true" />
 *       <PDBx:conc_units>molar</PDBx:conc_units>
 *       <PDBx:sol_id>precipitant</PDBx:sol_id>
 *    </PDBx:pdbx_exptl_crystal_grow_comp>
 * </PDBx:pdbx_exptl_crystal_grow_compCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_exptl_crystal_grow_compType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_exptl_crystal_grow_compType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_exptl_crystal_grow_comp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="comp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="conc_range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="conc_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_exptl_crystal_grow_compType", propOrder = {
    "pdbxExptlCrystalGrowComp"
})
public class PdbxExptlCrystalGrowCompType {

    @XmlElement(name = "pdbx_exptl_crystal_grow_comp")
    protected List<PdbxExptlCrystalGrowCompType.PdbxExptlCrystalGrowComp> pdbxExptlCrystalGrowComp;

    /**
     * Gets the value of the pdbxExptlCrystalGrowComp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxExptlCrystalGrowComp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxExptlCrystalGrowComp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxExptlCrystalGrowCompType.PdbxExptlCrystalGrowComp }
     * 
     * 
     */
    public List<PdbxExptlCrystalGrowCompType.PdbxExptlCrystalGrowComp> getPdbxExptlCrystalGrowComp() {
        if (pdbxExptlCrystalGrowComp == null) {
            pdbxExptlCrystalGrowComp = new ArrayList<PdbxExptlCrystalGrowCompType.PdbxExptlCrystalGrowComp>();
        }
        return this.pdbxExptlCrystalGrowComp;
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
     *         &lt;element name="comp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="conc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="conc_range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="conc_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxExptlCrystalGrowComp {

        @XmlElementRef(name = "comp_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> compName;
        @XmlElementRef(name = "conc", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> conc;
        @XmlElementRef(name = "conc_range", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> concRange;
        @XmlElementRef(name = "conc_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> concUnits;
        @XmlElementRef(name = "sol_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> solId;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "crystal_id", required = true)
        protected String crystalId;

        /**
         * Gets the value of the compName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCompName() {
            return compName;
        }

        /**
         * Sets the value of the compName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCompName(JAXBElement<String> value) {
            this.compName = value;
        }

        /**
         * Gets the value of the conc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getConc() {
            return conc;
        }

        /**
         * Sets the value of the conc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setConc(JAXBElement<BigDecimal> value) {
            this.conc = value;
        }

        /**
         * Gets the value of the concRange property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConcRange() {
            return concRange;
        }

        /**
         * Sets the value of the concRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConcRange(JAXBElement<String> value) {
            this.concRange = value;
        }

        /**
         * Gets the value of the concUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConcUnits() {
            return concUnits;
        }

        /**
         * Sets the value of the concUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConcUnits(JAXBElement<String> value) {
            this.concUnits = value;
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
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
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

    }

}
