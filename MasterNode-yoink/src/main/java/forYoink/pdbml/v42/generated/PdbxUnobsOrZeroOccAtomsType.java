//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
 * atoms within the entry that are either unobserved or have zero occupancy/
 * 
 *      Example 1
 * <PDBx:pdbx_unobs_or_zero_occ_atomsCategory>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>CG</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="2">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>CD</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="3">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>NE</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="4">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>CZ</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="5">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>NH1</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 *    <PDBx:pdbx_unobs_or_zero_occ_atoms id="6">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_atom_id>NH2</PDBx:auth_atom_id>
 *       <PDBx:auth_comp_id>ARG</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>412</PDBx:auth_seq_id>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:occupancy_flag>1</PDBx:occupancy_flag>
 *       <PDBx:polymer_flag>Y</PDBx:polymer_flag>
 *    </PDBx:pdbx_unobs_or_zero_occ_atoms>
 * </PDBx:pdbx_unobs_or_zero_occ_atomsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_unobs_or_zero_occ_atomsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_unobs_or_zero_occ_atomsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_unobs_or_zero_occ_atoms" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="occupancy_flag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="polymer_flag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "pdbx_unobs_or_zero_occ_atomsType", propOrder = {
    "pdbxUnobsOrZeroOccAtoms"
})
public class PdbxUnobsOrZeroOccAtomsType {

    @XmlElement(name = "pdbx_unobs_or_zero_occ_atoms")
    protected List<PdbxUnobsOrZeroOccAtomsType.PdbxUnobsOrZeroOccAtoms> pdbxUnobsOrZeroOccAtoms;

    /**
     * Gets the value of the pdbxUnobsOrZeroOccAtoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxUnobsOrZeroOccAtoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxUnobsOrZeroOccAtoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxUnobsOrZeroOccAtomsType.PdbxUnobsOrZeroOccAtoms }
     * 
     * 
     */
    public List<PdbxUnobsOrZeroOccAtomsType.PdbxUnobsOrZeroOccAtoms> getPdbxUnobsOrZeroOccAtoms() {
        if (pdbxUnobsOrZeroOccAtoms == null) {
            pdbxUnobsOrZeroOccAtoms = new ArrayList<PdbxUnobsOrZeroOccAtomsType.PdbxUnobsOrZeroOccAtoms>();
        }
        return this.pdbxUnobsOrZeroOccAtoms;
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
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="occupancy_flag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="polymer_flag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
    public static class PdbxUnobsOrZeroOccAtoms {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElement(name = "PDB_model_num", required = true)
        protected BigInteger pdbModelNum;
        @XmlElement(name = "auth_asym_id", required = true)
        protected String authAsymId;
        @XmlElement(name = "auth_atom_id", required = true)
        protected String authAtomId;
        @XmlElement(name = "auth_comp_id", required = true)
        protected String authCompId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElementRef(name = "label_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAsymId;
        @XmlElementRef(name = "label_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAtomId;
        @XmlElementRef(name = "label_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelCompId;
        @XmlElementRef(name = "label_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> labelSeqId;
        @XmlElement(name = "occupancy_flag", required = true)
        protected BigInteger occupancyFlag;
        @XmlElement(name = "polymer_flag", required = true)
        protected String polymerFlag;
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
         * Gets the value of the labelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAltId() {
            return labelAltId;
        }

        /**
         * Sets the value of the labelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAltId(JAXBElement<String> value) {
            this.labelAltId = value;
        }

        /**
         * Gets the value of the labelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAsymId() {
            return labelAsymId;
        }

        /**
         * Sets the value of the labelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAsymId(JAXBElement<String> value) {
            this.labelAsymId = value;
        }

        /**
         * Gets the value of the labelAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAtomId() {
            return labelAtomId;
        }

        /**
         * Sets the value of the labelAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAtomId(JAXBElement<String> value) {
            this.labelAtomId = value;
        }

        /**
         * Gets the value of the labelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelCompId() {
            return labelCompId;
        }

        /**
         * Sets the value of the labelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelCompId(JAXBElement<String> value) {
            this.labelCompId = value;
        }

        /**
         * Gets the value of the labelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getLabelSeqId() {
            return labelSeqId;
        }

        /**
         * Sets the value of the labelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setLabelSeqId(JAXBElement<BigInteger> value) {
            this.labelSeqId = value;
        }

        /**
         * Gets the value of the occupancyFlag property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOccupancyFlag() {
            return occupancyFlag;
        }

        /**
         * Sets the value of the occupancyFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOccupancyFlag(BigInteger value) {
            this.occupancyFlag = value;
        }

        /**
         * Gets the value of the polymerFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolymerFlag() {
            return polymerFlag;
        }

        /**
         * Sets the value of the polymerFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolymerFlag(String value) {
            this.polymerFlag = value;
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

    }

}
