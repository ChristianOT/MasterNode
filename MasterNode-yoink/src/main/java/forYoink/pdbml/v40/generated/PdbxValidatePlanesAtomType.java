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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
 * residues that contain unexpected deviations from planes
 * centers.
 * 
 *     Example 1 
 * <PDBx:pdbx_validate_planes_atomCategory>
 *    <PDBx:pdbx_validate_planes_atom id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.003</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N1</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="2">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.011</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C2</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="3">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.074</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N2</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="4">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.005</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N3</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="5">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.010</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C4</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="6">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.029</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C5</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="7">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.039</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C6</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="8">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.074</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>O6</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="9">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.050</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N7</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="10">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.129</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C8</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="11">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.033</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N9</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="12">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.147</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DG</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>C1&apos;</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>3</PDBx:auth_seq_id>
 *       <PDBx:plane_id>1</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 *    <PDBx:pdbx_validate_planes_atom id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:atom_deviation>0.069</PDBx:atom_deviation>
 *       <PDBx:auth_asym_id>DT</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>N1</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>A</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>4</PDBx:auth_seq_id>
 *       <PDBx:plane_id>2</PDBx:plane_id>
 *    </PDBx:pdbx_validate_planes_atom>
 * </PDBx:pdbx_validate_planes_atomCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_validate_planes_atomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_validate_planes_atomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_validate_planes_atom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="atom_deviation">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="plane_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_validate_planes_atomType", propOrder = {
    "pdbxValidatePlanesAtom"
})
public class PdbxValidatePlanesAtomType {

    @XmlElement(name = "pdbx_validate_planes_atom")
    protected List<PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom> pdbxValidatePlanesAtom;

    /**
     * Gets the value of the pdbxValidatePlanesAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxValidatePlanesAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxValidatePlanesAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom }
     * 
     * 
     */
    public List<PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom> getPdbxValidatePlanesAtom() {
        if (pdbxValidatePlanesAtom == null) {
            pdbxValidatePlanesAtom = new ArrayList<PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom>();
        }
        return this.pdbxValidatePlanesAtom;
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
     *         &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="atom_deviation">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="plane_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxValidatePlanesAtom {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElement(name = "PDB_model_num", required = true)
        protected BigInteger pdbModelNum;
        @XmlElement(name = "atom_deviation", required = true)
        protected PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom.AtomDeviation atomDeviation;
        @XmlElement(name = "auth_asym_id", required = true)
        protected String authAsymId;
        @XmlElement(name = "auth_atom_id", required = true)
        protected String authAtomId;
        @XmlElement(name = "auth_comp_id", required = true)
        protected String authCompId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElement(name = "plane_id", required = true)
        protected BigInteger planeId;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the pdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPDBInsCode() {
            return pdbInsCode;
        }

        /**
         * Sets the value of the pdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPDBInsCode(JAXBElement<String> value) {
            this.pdbInsCode = value;
        }

        /**
         * Gets the value of the pdbModelNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPDBModelNum(BigInteger value) {
            this.pdbModelNum = value;
        }

        /**
         * Gets the value of the atomDeviation property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom.AtomDeviation }
         *     
         */
        public PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom.AtomDeviation getAtomDeviation() {
            return atomDeviation;
        }

        /**
         * Sets the value of the atomDeviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom.AtomDeviation }
         *     
         */
        public void setAtomDeviation(PdbxValidatePlanesAtomType.PdbxValidatePlanesAtom.AtomDeviation value) {
            this.atomDeviation = value;
        }

        /**
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAsymId(String value) {
            this.authAsymId = value;
        }

        /**
         * Gets the value of the authAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAtomId() {
            return authAtomId;
        }

        /**
         * Sets the value of the authAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAtomId(String value) {
            this.authAtomId = value;
        }

        /**
         * Gets the value of the authCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCompId() {
            return authCompId;
        }

        /**
         * Sets the value of the authCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCompId(String value) {
            this.authCompId = value;
        }

        /**
         * Gets the value of the authSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthSeqId() {
            return authSeqId;
        }

        /**
         * Sets the value of the authSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthSeqId(String value) {
            this.authSeqId = value;
        }

        /**
         * Gets the value of the planeId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPlaneId() {
            return planeId;
        }

        /**
         * Sets the value of the planeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPlaneId(BigInteger value) {
            this.planeId = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms_squared" />
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
        public static class AtomDeviation {

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
                    return "angstroms_squared";
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
