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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Data items in the PDBX_CHEM_COMP_AUDIT category records
 * the status and tracking information for this component.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_auditCategory>
 *    <PDBx:pdbx_chem_comp_audit action_type="Create componenet" comp_id="ATP" date="2007-12-01">
 *       <PDBx:annotator>JY</PDBx:annotator>
 *       <PDBx:processing_site>RCSB</PDBx:processing_site>
 *    </PDBx:pdbx_chem_comp_audit>
 *    <PDBx:pdbx_chem_comp_audit action_type="Modify leaving atom flag" comp_id="ATP" date="2008-10-03">
 *       <PDBx:annotator>CS</PDBx:annotator>
 *       <PDBx:processing_site>RCSB</PDBx:processing_site>
 *    </PDBx:pdbx_chem_comp_audit>
 *    <PDBx:pdbx_chem_comp_audit action_type="Modify synonyms" comp_id="ATP" date="2009-07-03">
 *       <PDBx:annotator>MZ</PDBx:annotator>
 *       <PDBx:processing_site>RCSB</PDBx:processing_site>
 *    </PDBx:pdbx_chem_comp_audit>
 * </PDBx:pdbx_chem_comp_auditCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_auditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_auditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_audit" maxOccurs="unbounded" minOccurs="0">
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
 *                       &lt;enumeration value="Create component"/>
 *                       &lt;enumeration value="Modify name"/>
 *                       &lt;enumeration value="Modify formula"/>
 *                       &lt;enumeration value="Modify synonyms"/>
 *                       &lt;enumeration value="Modify linking type"/>
 *                       &lt;enumeration value="Modify internal type"/>
 *                       &lt;enumeration value="Modify parent residue"/>
 *                       &lt;enumeration value="Modify processing site"/>
 *                       &lt;enumeration value="Modify subcomponent list"/>
 *                       &lt;enumeration value="Modify one letter code"/>
 *                       &lt;enumeration value="Modify model coordinates code"/>
 *                       &lt;enumeration value="Modify formal charge"/>
 *                       &lt;enumeration value="Modify atom id"/>
 *                       &lt;enumeration value="Modify charge"/>
 *                       &lt;enumeration value="Modify aromatic_flag"/>
 *                       &lt;enumeration value="Modify leaving atom flag"/>
 *                       &lt;enumeration value="Modify component atom id"/>
 *                       &lt;enumeration value="Modify component comp_id"/>
 *                       &lt;enumeration value="Modify value order"/>
 *                       &lt;enumeration value="Modify descriptor"/>
 *                       &lt;enumeration value="Modify identifier"/>
 *                       &lt;enumeration value="Modify coordinates"/>
 *                       &lt;enumeration value="Other modification"/>
 *                       &lt;enumeration value="Obsolete component"/>
 *                       &lt;enumeration value="Initial release"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "pdbx_chem_comp_auditType", propOrder = {
    "pdbxChemCompAudit"
})
public class PdbxChemCompAuditType {

    @XmlElement(name = "pdbx_chem_comp_audit")
    protected List<PdbxChemCompAuditType.PdbxChemCompAudit> pdbxChemCompAudit;

    /**
     * Gets the value of the pdbxChemCompAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompAuditType.PdbxChemCompAudit }
     * 
     * 
     */
    public List<PdbxChemCompAuditType.PdbxChemCompAudit> getPdbxChemCompAudit() {
        if (pdbxChemCompAudit == null) {
            pdbxChemCompAudit = new ArrayList<PdbxChemCompAuditType.PdbxChemCompAudit>();
        }
        return this.pdbxChemCompAudit;
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
     *             &lt;enumeration value="Create component"/>
     *             &lt;enumeration value="Modify name"/>
     *             &lt;enumeration value="Modify formula"/>
     *             &lt;enumeration value="Modify synonyms"/>
     *             &lt;enumeration value="Modify linking type"/>
     *             &lt;enumeration value="Modify internal type"/>
     *             &lt;enumeration value="Modify parent residue"/>
     *             &lt;enumeration value="Modify processing site"/>
     *             &lt;enumeration value="Modify subcomponent list"/>
     *             &lt;enumeration value="Modify one letter code"/>
     *             &lt;enumeration value="Modify model coordinates code"/>
     *             &lt;enumeration value="Modify formal charge"/>
     *             &lt;enumeration value="Modify atom id"/>
     *             &lt;enumeration value="Modify charge"/>
     *             &lt;enumeration value="Modify aromatic_flag"/>
     *             &lt;enumeration value="Modify leaving atom flag"/>
     *             &lt;enumeration value="Modify component atom id"/>
     *             &lt;enumeration value="Modify component comp_id"/>
     *             &lt;enumeration value="Modify value order"/>
     *             &lt;enumeration value="Modify descriptor"/>
     *             &lt;enumeration value="Modify identifier"/>
     *             &lt;enumeration value="Modify coordinates"/>
     *             &lt;enumeration value="Other modification"/>
     *             &lt;enumeration value="Obsolete component"/>
     *             &lt;enumeration value="Initial release"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
    public static class PdbxChemCompAudit {

        @XmlElementRef(name = "annotator", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> annotator;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "processing_site", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> processingSite;
        @XmlAttribute(name = "action_type", required = true)
        protected String actionType;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

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

    }

}
