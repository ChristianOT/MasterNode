//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_PRD_AUDIT category records
 * the status and tracking information for this molecule.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_prd_auditCategory>
 *    <PDBx:pdbx_prd_audit action_type="Create molecule" date="2011-12-01" prd_id="PRD_0000001">
 *       <PDBx:annotator>JY</PDBx:annotator>
 *       <PDBx:processing_site>RCSB</PDBx:processing_site>
 *    </PDBx:pdbx_prd_audit>
 *    <PDBx:pdbx_prd_audit action_type="Modify sequence" date="2011-12-05" prd_id="PRD_0000001">
 *       <PDBx:annotator>MZ</PDBx:annotator>
 *       <PDBx:processing_site>RCSB</PDBx:processing_site>
 *    </PDBx:pdbx_prd_audit>
 * </PDBx:pdbx_prd_auditCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_prd_auditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_prd_auditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_prd_audit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="annotator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="processing_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="action_type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Initial release"/>
 *                       &lt;enumeration value="Create molecule"/>
 *                       &lt;enumeration value="Modify type"/>
 *                       &lt;enumeration value="Modify class"/>
 *                       &lt;enumeration value="Modify molecule name"/>
 *                       &lt;enumeration value="Modify representation"/>
 *                       &lt;enumeration value="Modify sequence"/>
 *                       &lt;enumeration value="Modify linkage"/>
 *                       &lt;enumeration value="Modify taxonomy organism"/>
 *                       &lt;enumeration value="Modify audit"/>
 *                       &lt;enumeration value="Other modification"/>
 *                       &lt;enumeration value="Obsolete molecule"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_prd_auditType", propOrder = {
    "pdbxPrdAudit"
})
public class PdbxPrdAuditType {

    @XmlElement(name = "pdbx_prd_audit")
    protected List<PdbxPrdAuditType.PdbxPrdAudit> pdbxPrdAudit;

    /**
     * Gets the value of the pdbxPrdAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPrdAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPrdAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPrdAuditType.PdbxPrdAudit }
     * 
     * 
     */
    public List<PdbxPrdAuditType.PdbxPrdAudit> getPdbxPrdAudit() {
        if (pdbxPrdAudit == null) {
            pdbxPrdAudit = new ArrayList<PdbxPrdAuditType.PdbxPrdAudit>();
        }
        return this.pdbxPrdAudit;
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
     *         &lt;element name="annotator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="processing_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="action_type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Initial release"/>
     *             &lt;enumeration value="Create molecule"/>
     *             &lt;enumeration value="Modify type"/>
     *             &lt;enumeration value="Modify class"/>
     *             &lt;enumeration value="Modify molecule name"/>
     *             &lt;enumeration value="Modify representation"/>
     *             &lt;enumeration value="Modify sequence"/>
     *             &lt;enumeration value="Modify linkage"/>
     *             &lt;enumeration value="Modify taxonomy organism"/>
     *             &lt;enumeration value="Modify audit"/>
     *             &lt;enumeration value="Other modification"/>
     *             &lt;enumeration value="Obsolete molecule"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxPrdAudit {

        @XmlElementRef(name = "annotator", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> annotator;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "processing_site", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> processingSite;
        @XmlAttribute(name = "action_type", required = true)
        protected String actionType;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;

        /**
         * Gets the value of the annotator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAnnotator() {
            return annotator;
        }

        /**
         * Sets the value of the annotator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAnnotator(JAXBElement<String> value) {
            this.annotator = value;
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
         * Gets the value of the processingSite property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getProcessingSite() {
            return processingSite;
        }

        /**
         * Sets the value of the processingSite property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setProcessingSite(JAXBElement<String> value) {
            this.processingSite = value;
        }

        /**
         * Gets the value of the actionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrdId(String value) {
            this.prdId = value;
        }

    }

}
