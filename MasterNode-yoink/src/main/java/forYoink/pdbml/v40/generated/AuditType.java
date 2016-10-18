//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the AUDIT category record details about the
 * creation and subsequent updating of the data block.
 * 
 * Note that these items apply only to the creation and updating of
 * the data block, and should not be confused with the data items
 * in the JOURNAL category that record different stages in the
 * publication of the material in the data block.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:auditCategory>
 *    <PDBx:audit revision_id="1">
 *       <PDBx:creation_date>1992-12-08</PDBx:creation_date>
 *       <PDBx:creation_method> Created by hand from PDB entry 5HVP, from the J. Biol.
 * Chem. paper describing this structure and from
 * laboratory records</PDBx:creation_method>
 *       <PDBx:update_record> 1992-12-09  adjusted to reflect comments from B. McKeever
 *  1992-12-10  adjusted to reflect comments from H. Berman
 *  1992-12-12  adjusted to reflect comments from K. Watenpaugh</PDBx:update_record>
 *    </PDBx:audit>
 * </PDBx:auditCategory>
 * 
 * 
 *     Example 2 - based on data set TOZ of Willis, Beckwith & Tozer
 *                 [Acta Cryst. (1991), C47, 2276-2277].
 * <PDBx:auditCategory>
 *    <PDBx:audit revision_id="2">
 *       <PDBx:creation_date>1991-03-20</PDBx:creation_date>
 *       <PDBx:creation_method>from_xtal_archive_file_using_CIFIO</PDBx:creation_method>
 *       <PDBx:update_record> 1991-04-09  text and data added by Tony Willis.
 *  1991-04-15  rec&apos;d by co-editor as manuscript HL0007.
 *  1991-04-17  adjustments based on first referee report.
 *  1991-04-18  adjustments based on second referee report.</PDBx:update_record>
 *    </PDBx:audit>
 * </PDBx:auditCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for auditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="creation_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="creation_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="update_record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="revision_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "auditType", propOrder = {
    "audit"
})
public class AuditType {

    protected List<AuditType.Audit> audit;

    /**
     * Gets the value of the audit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditType.Audit }
     * 
     * 
     */
    public List<AuditType.Audit> getAudit() {
        if (audit == null) {
            audit = new ArrayList<AuditType.Audit>();
        }
        return this.audit;
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
     *         &lt;element name="creation_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="creation_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="update_record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="revision_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Audit {

        @XmlElementRef(name = "creation_date", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> creationDate;
        @XmlElementRef(name = "creation_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> creationMethod;
        @XmlElementRef(name = "update_record", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> updateRecord;
        @XmlAttribute(name = "revision_id", required = true)
        protected String revisionId;

        /**
         * Gets the value of the creationDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getCreationDate() {
            return creationDate;
        }

        /**
         * Sets the value of the creationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
            this.creationDate = value;
        }

        /**
         * Gets the value of the creationMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCreationMethod() {
            return creationMethod;
        }

        /**
         * Sets the value of the creationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCreationMethod(JAXBElement<String> value) {
            this.creationMethod = value;
        }

        /**
         * Gets the value of the updateRecord property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getUpdateRecord() {
            return updateRecord;
        }

        /**
         * Sets the value of the updateRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setUpdateRecord(JAXBElement<String> value) {
            this.updateRecord = value;
        }

        /**
         * Gets the value of the revisionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRevisionId() {
            return revisionId;
        }

        /**
         * Sets the value of the revisionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRevisionId(String value) {
            this.revisionId = value;
        }

    }

}
