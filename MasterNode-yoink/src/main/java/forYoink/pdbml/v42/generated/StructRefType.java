//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the STRUCT_REF category allow the author of a
 * data block to relate the entities or biological units
 * described in the data block to information archived in external
 * databases.
 * 
 * For references to the sequence of a polymer, the value of
 * the data item attribute seq_align in category struct_ref is used to indicate
 *  whether the correspondence between the sequence of the entity
 * or biological unit in the data block and the sequence in the
 * referenced database entry is 'complete' or 'partial'. If
 * this value is 'partial', the region (or regions) of the
 * alignment may be delimited using data items in the
 * STRUCT_REF_SEQ category.
 * 
 * Similarly, the value of attribute seq_dif in category struct_ref is used to indicate
 *  whether the two sequences contain point differences. If the
 * value is 'yes', the differences may be identified and annotated
 * using data items in the STRUCT_REF_SEQ_DIF category.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_refCategory>
 *    <PDBx:struct_ref id="1">
 *       <PDBx:biol_id xsi:nil="true" />
 *       <PDBx:db_code>12345</PDBx:db_code>
 *       <PDBx:db_name>Genbank</PDBx:db_name>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:entity_id>1</PDBx:entity_id>
 *       <PDBx:seq_align>entire</PDBx:seq_align>
 *       <PDBx:seq_dif>yes</PDBx:seq_dif>
 *    </PDBx:struct_ref>
 *    <PDBx:struct_ref id="2">
 *       <PDBx:biol_id>2</PDBx:biol_id>
 *       <PDBx:db_code>1ABC</PDBx:db_code>
 *       <PDBx:db_name>PDB</PDBx:db_name>
 *       <PDBx:details> The structure of the closely related compound,
 * isobutyryl-pepstatin (pepstatin A) in complex with
 * rhizopuspepsin</PDBx:details>
 *       <PDBx:entity_id xsi:nil="true" />
 *       <PDBx:seq_align xsi:nil="true" />
 *       <PDBx:seq_dif xsi:nil="true" />
 *    </PDBx:struct_ref>
 * </PDBx:struct_refCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_ref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="biol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="entity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pdbx_align_begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_align_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_db_isoform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_one_letter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seq_align" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="complete"/>
 *                         &lt;enumeration value="partial"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="seq_dif" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "struct_refType", propOrder = {
    "structRef"
})
public class StructRefType {

    @XmlElement(name = "struct_ref")
    protected List<StructRefType.StructRef> structRef;

    /**
     * Gets the value of the structRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructRefType.StructRef }
     * 
     * 
     */
    public List<StructRefType.StructRef> getStructRef() {
        if (structRef == null) {
            structRef = new ArrayList<StructRefType.StructRef>();
        }
        return this.structRef;
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
     *         &lt;element name="biol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="entity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pdbx_align_begin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_align_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_db_isoform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_one_letter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seq_align" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="complete"/>
     *               &lt;enumeration value="partial"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="seq_dif" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
    public static class StructRef {

        @XmlElementRef(name = "biol_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> biolId;
        @XmlElement(name = "db_code", required = true)
        protected String dbCode;
        @XmlElement(name = "db_name", required = true)
        protected String dbName;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElement(name = "entity_id", required = true)
        protected String entityId;
        @XmlElementRef(name = "pdbx_align_begin", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAlignBegin;
        @XmlElementRef(name = "pdbx_align_end", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAlignEnd;
        @XmlElementRef(name = "pdbx_db_accession", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDbAccession;
        @XmlElementRef(name = "pdbx_db_isoform", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDbIsoform;
        @XmlElementRef(name = "pdbx_seq_one_letter_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqOneLetterCode;
        @XmlElementRef(name = "seq_align", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> seqAlign;
        @XmlElementRef(name = "seq_dif", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> seqDif;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the biolId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBiolId() {
            return biolId;
        }

        /**
         * Sets the value of the biolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBiolId(JAXBElement<String> value) {
            this.biolId = value;
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
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
        }

        /**
         * Gets the value of the pdbxAlignBegin property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAlignBegin() {
            return pdbxAlignBegin;
        }

        /**
         * Sets the value of the pdbxAlignBegin property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAlignBegin(JAXBElement<String> value) {
            this.pdbxAlignBegin = value;
        }

        /**
         * Gets the value of the pdbxAlignEnd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAlignEnd() {
            return pdbxAlignEnd;
        }

        /**
         * Sets the value of the pdbxAlignEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAlignEnd(JAXBElement<String> value) {
            this.pdbxAlignEnd = value;
        }

        /**
         * Gets the value of the pdbxDbAccession property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDbAccession() {
            return pdbxDbAccession;
        }

        /**
         * Sets the value of the pdbxDbAccession property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDbAccession(JAXBElement<String> value) {
            this.pdbxDbAccession = value;
        }

        /**
         * Gets the value of the pdbxDbIsoform property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDbIsoform() {
            return pdbxDbIsoform;
        }

        /**
         * Sets the value of the pdbxDbIsoform property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDbIsoform(JAXBElement<String> value) {
            this.pdbxDbIsoform = value;
        }

        /**
         * Gets the value of the pdbxSeqOneLetterCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqOneLetterCode() {
            return pdbxSeqOneLetterCode;
        }

        /**
         * Sets the value of the pdbxSeqOneLetterCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqOneLetterCode(JAXBElement<String> value) {
            this.pdbxSeqOneLetterCode = value;
        }

        /**
         * Gets the value of the seqAlign property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSeqAlign() {
            return seqAlign;
        }

        /**
         * Sets the value of the seqAlign property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSeqAlign(JAXBElement<String> value) {
            this.seqAlign = value;
        }

        /**
         * Gets the value of the seqDif property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSeqDif() {
            return seqDif;
        }

        /**
         * Sets the value of the seqDif property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSeqDif(JAXBElement<String> value) {
            this.seqDif = value;
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
