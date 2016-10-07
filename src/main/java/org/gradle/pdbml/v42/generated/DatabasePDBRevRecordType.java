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
 * Data items in the DATABASE_PDB_REV_RECORD category record
 * details about specific record types that were changed in a
 * given revision of a PDB entry.
 * 
 * These data items are assigned by the PDB database managers and
 * should only appear in a data block if they originate from that
 * source.
 * 
 *     Example 1 - hypothetical example.
 * <PDBx:database_PDB_rev_recordCategory>
 *    <PDBx:database_PDB_rev_record rev_num="1" type="CONECT">
 *       <PDBx:details> Error fix - incorrect connection between
 * atoms 2312 and 2317</PDBx:details>
 *    </PDBx:database_PDB_rev_record>
 *    <PDBx:database_PDB_rev_record rev_num="2" type="MATRIX">
 *       <PDBx:details>For consistency with 1995-08-04 style-guide</PDBx:details>
 *    </PDBx:database_PDB_rev_record>
 *    <PDBx:database_PDB_rev_record rev_num="3" type="ORIGX">
 *       <PDBx:details>Based on new data from author</PDBx:details>
 *    </PDBx:database_PDB_rev_record>
 * </PDBx:database_PDB_rev_recordCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for database_PDB_rev_recordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="database_PDB_rev_recordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="database_PDB_rev_record" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="rev_num" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "database_PDB_rev_recordType", propOrder = {
    "databasePDBRevRecord"
})
public class DatabasePDBRevRecordType {

    @XmlElement(name = "database_PDB_rev_record")
    protected List<DatabasePDBRevRecordType.DatabasePDBRevRecord> databasePDBRevRecord;

    /**
     * Gets the value of the databasePDBRevRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databasePDBRevRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabasePDBRevRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabasePDBRevRecordType.DatabasePDBRevRecord }
     * 
     * 
     */
    public List<DatabasePDBRevRecordType.DatabasePDBRevRecord> getDatabasePDBRevRecord() {
        if (databasePDBRevRecord == null) {
            databasePDBRevRecord = new ArrayList<DatabasePDBRevRecordType.DatabasePDBRevRecord>();
        }
        return this.databasePDBRevRecord;
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
     *       &lt;/all>
     *       &lt;attribute name="rev_num" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class DatabasePDBRevRecord {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "rev_num", required = true)
        protected BigInteger revNum;
        @XmlAttribute(name = "type", required = true)
        protected String type;

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
         * Gets the value of the revNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRevNum() {
            return revNum;
        }

        /**
         * Sets the value of the revNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRevNum(BigInteger value) {
            this.revNum = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
