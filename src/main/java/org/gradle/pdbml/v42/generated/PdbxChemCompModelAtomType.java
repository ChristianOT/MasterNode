//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
 * for the chemical component model instance.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_model_atomCategory>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAA" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>2.180</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>6.561</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>8.402</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>1</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAB" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>5.709</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>6.659</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>8.211</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>2</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="OAC" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>1.912</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.185</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>12.303</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>3</PDBx:ordinal_id>
 *       <PDBx:type_symbol>O</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="OAD" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>4.002</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>7.560</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>6.491</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>4</PDBx:ordinal_id>
 *       <PDBx:type_symbol>O</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="OAE" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>4.992</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>9.134</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>8.117</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>5</PDBx:ordinal_id>
 *       <PDBx:type_symbol>O</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="OAF" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>2.970</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>10.013</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>13.854</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>6</PDBx:ordinal_id>
 *       <PDBx:type_symbol>O</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="FAG" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>-3.392</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.249</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>6.995</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>7</PDBx:ordinal_id>
 *       <PDBx:type_symbol>F</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAH" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>4.361</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>5.472</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>12.379</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>8</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAI" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>4.277</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>6.182</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>13.595</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>9</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAJ" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>-2.132</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.408</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>8.958</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>10</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAK" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>-1.112</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.651</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>6.807</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>11</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAL" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>-0.902</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.579</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>9.557</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>12</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAM" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>0.139</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>12.801</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>7.421</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>13</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 *    <PDBx:pdbx_chem_comp_model_atom atom_id="CAN" model_id="M_ZZV_00001">
 *       <PDBx:charge>0</PDBx:charge>
 *       <PDBx:model_Cartn_x>4.004</PDBx:model_Cartn_x>
 *       <PDBx:model_Cartn_y>6.101</PDBx:model_Cartn_y>
 *       <PDBx:model_Cartn_z>11.237</PDBx:model_Cartn_z>
 *       <PDBx:ordinal_id>14</PDBx:ordinal_id>
 *       <PDBx:type_symbol>C</PDBx:type_symbol>
 *    </PDBx:pdbx_chem_comp_model_atom>
 * </PDBx:pdbx_chem_comp_model_atomCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_model_atomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_model_atomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_model_atom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="charge" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="-8"/>
 *                         &lt;maxInclusive value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="model_Cartn_x" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="model_Cartn_y" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="model_Cartn_z" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ordinal_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="type_symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_chem_comp_model_atomType", propOrder = {
    "pdbxChemCompModelAtom"
})
public class PdbxChemCompModelAtomType {

    @XmlElement(name = "pdbx_chem_comp_model_atom")
    protected List<PdbxChemCompModelAtomType.PdbxChemCompModelAtom> pdbxChemCompModelAtom;

    /**
     * Gets the value of the pdbxChemCompModelAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompModelAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompModelAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom }
     * 
     * 
     */
    public List<PdbxChemCompModelAtomType.PdbxChemCompModelAtom> getPdbxChemCompModelAtom() {
        if (pdbxChemCompModelAtom == null) {
            pdbxChemCompModelAtom = new ArrayList<PdbxChemCompModelAtomType.PdbxChemCompModelAtom>();
        }
        return this.pdbxChemCompModelAtom;
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
     *         &lt;element name="charge" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="-8"/>
     *               &lt;maxInclusive value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="model_Cartn_x" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="model_Cartn_y" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="model_Cartn_z" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ordinal_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="type_symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxChemCompModelAtom {

        @XmlElementRef(name = "charge", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> charge;
        @XmlElementRef(name = "model_Cartn_x", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnX> modelCartnX;
        @XmlElementRef(name = "model_Cartn_y", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnY> modelCartnY;
        @XmlElementRef(name = "model_Cartn_z", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnZ> modelCartnZ;
        @XmlElement(name = "ordinal_id", required = true)
        protected BigInteger ordinalId;
        @XmlElement(name = "type_symbol", required = true)
        protected String typeSymbol;
        @XmlAttribute(name = "atom_id", required = true)
        protected String atomId;
        @XmlAttribute(name = "model_id", required = true)
        protected String modelId;

        /**
         * Gets the value of the charge property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getCharge() {
            return charge;
        }

        /**
         * Sets the value of the charge property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setCharge(JAXBElement<Integer> value) {
            this.charge = value;
        }

        /**
         * Gets the value of the modelCartnX property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnX }{@code >}
         *     
         */
        public JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnX> getModelCartnX() {
            return modelCartnX;
        }

        /**
         * Sets the value of the modelCartnX property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnX }{@code >}
         *     
         */
        public void setModelCartnX(JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnX> value) {
            this.modelCartnX = value;
        }

        /**
         * Gets the value of the modelCartnY property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnY }{@code >}
         *     
         */
        public JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnY> getModelCartnY() {
            return modelCartnY;
        }

        /**
         * Sets the value of the modelCartnY property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnY }{@code >}
         *     
         */
        public void setModelCartnY(JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnY> value) {
            this.modelCartnY = value;
        }

        /**
         * Gets the value of the modelCartnZ property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnZ }{@code >}
         *     
         */
        public JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnZ> getModelCartnZ() {
            return modelCartnZ;
        }

        /**
         * Sets the value of the modelCartnZ property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnZ }{@code >}
         *     
         */
        public void setModelCartnZ(JAXBElement<PdbxChemCompModelAtomType.PdbxChemCompModelAtom.ModelCartnZ> value) {
            this.modelCartnZ = value;
        }

        /**
         * Gets the value of the ordinalId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinalId() {
            return ordinalId;
        }

        /**
         * Sets the value of the ordinalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinalId(BigInteger value) {
            this.ordinalId = value;
        }

        /**
         * Gets the value of the typeSymbol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeSymbol() {
            return typeSymbol;
        }

        /**
         * Sets the value of the typeSymbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeSymbol(String value) {
            this.typeSymbol = value;
        }

        /**
         * Gets the value of the atomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId() {
            return atomId;
        }

        /**
         * Sets the value of the atomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId(String value) {
            this.atomId = value;
        }

        /**
         * Gets the value of the modelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelId() {
            return modelId;
        }

        /**
         * Sets the value of the modelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelId(String value) {
            this.modelId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ModelCartnX {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ModelCartnY {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ModelCartnZ {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
