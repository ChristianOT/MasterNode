//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category 
 * annotate insertions in the sequence of the entity described 
 * in the referenced database entry.
 * 
 *     Example 1 
 * <PDBx:pdbx_struct_ref_seq_insertionCategory>
 *    <PDBx:pdbx_struct_ref_seq_insertion id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:asym_id>A</PDBx:asym_id>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_seq_id>104</PDBx:auth_seq_id>
 *       <PDBx:comp_id>GLY</PDBx:comp_id>
 *       <PDBx:db_code>P00752</PDBx:db_code>
 *       <PDBx:db_name>UNP</PDBx:db_name>
 *       <PDBx:details>INSERTION</PDBx:details>
 *       <PDBx:seq_id>102</PDBx:seq_id>
 *    </PDBx:pdbx_struct_ref_seq_insertion>
 *    <PDBx:pdbx_struct_ref_seq_insertion id="2">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:asym_id>A</PDBx:asym_id>
 *       <PDBx:auth_asym_id>A</PDBx:auth_asym_id>
 *       <PDBx:auth_seq_id>105</PDBx:auth_seq_id>
 *       <PDBx:comp_id>TRP</PDBx:comp_id>
 *       <PDBx:db_code>P00752</PDBx:db_code>
 *       <PDBx:db_name>UNP</PDBx:db_name>
 *       <PDBx:details>INSERTION</PDBx:details>
 *       <PDBx:seq_id>103</PDBx:seq_id>
 *    </PDBx:pdbx_struct_ref_seq_insertion>
 * </PDBx:pdbx_struct_ref_seq_insertionCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_ref_seq_insertionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_ref_seq_insertionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_ref_seq_insertion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
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
@XmlType(name = "pdbx_struct_ref_seq_insertionType", propOrder = {
    "pdbxStructRefSeqInsertion"
})
public class PdbxStructRefSeqInsertionType {

    @XmlElement(name = "pdbx_struct_ref_seq_insertion")
    protected List<PdbxStructRefSeqInsertionType.PdbxStructRefSeqInsertion> pdbxStructRefSeqInsertion;

    /**
     * Gets the value of the pdbxStructRefSeqInsertion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructRefSeqInsertion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructRefSeqInsertion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructRefSeqInsertionType.PdbxStructRefSeqInsertion }
     * 
     * 
     */
    public List<PdbxStructRefSeqInsertionType.PdbxStructRefSeqInsertion> getPdbxStructRefSeqInsertion() {
        if (pdbxStructRefSeqInsertion == null) {
            pdbxStructRefSeqInsertion = new ArrayList<PdbxStructRefSeqInsertionType.PdbxStructRefSeqInsertion>();
        }
        return this.pdbxStructRefSeqInsertion;
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
     *         &lt;element name="asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
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
    public static class PdbxStructRefSeqInsertion {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElement(name = "asym_id", required = true)
        protected String asymId;
        @XmlElementRef(name = "auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAsymId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElement(name = "comp_id", required = true)
        protected String compId;
        @XmlElement(name = "db_code", required = true)
        protected String dbCode;
        @XmlElement(name = "db_name", required = true)
        protected String dbName;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElement(name = "seq_id", required = true)
        protected BigInteger seqId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAsymId(JAXBElement<String> value) {
            this.authAsymId = value;
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
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbCode(String value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbName(String value) {
            this.dbName = value;
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
         * Gets the value of the seqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqId() {
            return seqId;
        }

        /**
         * Sets the value of the seqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqId(BigInteger value) {
            this.seqId = value;
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
