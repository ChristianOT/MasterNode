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
 * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
 * the linkages between entities within reference molecules.
 * 
 *     Example 1 - quinoxaline
 * <PDBx:pdbx_reference_entity_linkCategory>
 *    <PDBx:pdbx_reference_entity_link link_id="1" prd_id="PRD_000001">
 *       <PDBx:atom_id_1>N</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>C</PDBx:atom_id_2>
 *       <PDBx:comp_id_1>DSN</PDBx:comp_id_1>
 *       <PDBx:comp_id_2>QUI</PDBx:comp_id_2>
 *       <PDBx:component_1>1</PDBx:component_1>
 *       <PDBx:component_2>2</PDBx:component_2>
 *       <PDBx:entity_seq_num_1>1</PDBx:entity_seq_num_1>
 *       <PDBx:entity_seq_num_2 xsi:nil="true" />
 *       <PDBx:link_class>PN</PDBx:link_class>
 *       <PDBx:ref_entity_id_1>1</PDBx:ref_entity_id_1>
 *       <PDBx:ref_entity_id_2>2</PDBx:ref_entity_id_2>
 *       <PDBx:value_order>single</PDBx:value_order>
 *    </PDBx:pdbx_reference_entity_link>
 *    <PDBx:pdbx_reference_entity_link link_id="2" prd_id="PRD_000001">
 *       <PDBx:atom_id_1>N</PDBx:atom_id_1>
 *       <PDBx:atom_id_2>C</PDBx:atom_id_2>
 *       <PDBx:comp_id_1>DSN</PDBx:comp_id_1>
 *       <PDBx:comp_id_2>QUI</PDBx:comp_id_2>
 *       <PDBx:component_1>1</PDBx:component_1>
 *       <PDBx:component_2>3</PDBx:component_2>
 *       <PDBx:entity_seq_num_1>5</PDBx:entity_seq_num_1>
 *       <PDBx:entity_seq_num_2 xsi:nil="true" />
 *       <PDBx:link_class>PN</PDBx:link_class>
 *       <PDBx:ref_entity_id_1>1</PDBx:ref_entity_id_1>
 *       <PDBx:ref_entity_id_2>3</PDBx:ref_entity_id_2>
 *       <PDBx:value_order>single</PDBx:value_order>
 *    </PDBx:pdbx_reference_entity_link>
 * </PDBx:pdbx_reference_entity_linkCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_linkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_linkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_link" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="comp_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="comp_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="component_1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="component_2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="entity_seq_num_1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="entity_seq_num_2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="link_class" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="PP"/>
 *                         &lt;enumeration value="PN"/>
 *                         &lt;enumeration value="NP"/>
 *                         &lt;enumeration value="NN"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nonpoly_res_num_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nonpoly_res_num_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ref_entity_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ref_entity_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value_order" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="sing"/>
 *                         &lt;enumeration value="doub"/>
 *                         &lt;enumeration value="trip"/>
 *                         &lt;enumeration value="quad"/>
 *                         &lt;enumeration value="arom"/>
 *                         &lt;enumeration value="poly"/>
 *                         &lt;enumeration value="delo"/>
 *                         &lt;enumeration value="pi"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_reference_entity_linkType", propOrder = {
    "pdbxReferenceEntityLink"
})
public class PdbxReferenceEntityLinkType {

    @XmlElement(name = "pdbx_reference_entity_link")
    protected List<PdbxReferenceEntityLinkType.PdbxReferenceEntityLink> pdbxReferenceEntityLink;

    /**
     * Gets the value of the pdbxReferenceEntityLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntityLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntityLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntityLinkType.PdbxReferenceEntityLink }
     * 
     * 
     */
    public List<PdbxReferenceEntityLinkType.PdbxReferenceEntityLink> getPdbxReferenceEntityLink() {
        if (pdbxReferenceEntityLink == null) {
            pdbxReferenceEntityLink = new ArrayList<PdbxReferenceEntityLinkType.PdbxReferenceEntityLink>();
        }
        return this.pdbxReferenceEntityLink;
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
     *         &lt;element name="atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="comp_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="comp_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="component_1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="component_2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="entity_seq_num_1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="entity_seq_num_2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="link_class" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="PP"/>
     *               &lt;enumeration value="PN"/>
     *               &lt;enumeration value="NP"/>
     *               &lt;enumeration value="NN"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nonpoly_res_num_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nonpoly_res_num_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ref_entity_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ref_entity_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value_order" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="sing"/>
     *               &lt;enumeration value="doub"/>
     *               &lt;enumeration value="trip"/>
     *               &lt;enumeration value="quad"/>
     *               &lt;enumeration value="arom"/>
     *               &lt;enumeration value="poly"/>
     *               &lt;enumeration value="delo"/>
     *               &lt;enumeration value="pi"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxReferenceEntityLink {

        @XmlElement(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlElement(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlElement(name = "comp_id_1", required = true)
        protected String compId1;
        @XmlElement(name = "comp_id_2", required = true)
        protected String compId2;
        @XmlElement(name = "component_1", required = true)
        protected BigInteger component1;
        @XmlElement(name = "component_2", required = true)
        protected BigInteger component2;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "entity_seq_num_1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> entitySeqNum1;
        @XmlElementRef(name = "entity_seq_num_2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> entitySeqNum2;
        @XmlElementRef(name = "link_class", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> linkClass;
        @XmlElementRef(name = "nonpoly_res_num_1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nonpolyResNum1;
        @XmlElementRef(name = "nonpoly_res_num_2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nonpolyResNum2;
        @XmlElement(name = "ref_entity_id_1", required = true)
        protected String refEntityId1;
        @XmlElement(name = "ref_entity_id_2", required = true)
        protected String refEntityId2;
        @XmlElementRef(name = "value_order", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueOrder;
        @XmlAttribute(name = "link_id", required = true)
        protected BigInteger linkId;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;

        /**
         * Gets the value of the atomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId1() {
            return atomId1;
        }

        /**
         * Sets the value of the atomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId1(String value) {
            this.atomId1 = value;
        }

        /**
         * Gets the value of the atomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId2() {
            return atomId2;
        }

        /**
         * Sets the value of the atomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId2(String value) {
            this.atomId2 = value;
        }

        /**
         * Gets the value of the compId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId1() {
            return compId1;
        }

        /**
         * Sets the value of the compId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId1(String value) {
            this.compId1 = value;
        }

        /**
         * Gets the value of the compId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId2() {
            return compId2;
        }

        /**
         * Sets the value of the compId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId2(String value) {
            this.compId2 = value;
        }

        /**
         * Gets the value of the component1 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComponent1() {
            return component1;
        }

        /**
         * Sets the value of the component1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComponent1(BigInteger value) {
            this.component1 = value;
        }

        /**
         * Gets the value of the component2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComponent2() {
            return component2;
        }

        /**
         * Sets the value of the component2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComponent2(BigInteger value) {
            this.component2 = value;
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
         * Gets the value of the entitySeqNum1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getEntitySeqNum1() {
            return entitySeqNum1;
        }

        /**
         * Sets the value of the entitySeqNum1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setEntitySeqNum1(JAXBElement<BigInteger> value) {
            this.entitySeqNum1 = value;
        }

        /**
         * Gets the value of the entitySeqNum2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getEntitySeqNum2() {
            return entitySeqNum2;
        }

        /**
         * Sets the value of the entitySeqNum2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setEntitySeqNum2(JAXBElement<BigInteger> value) {
            this.entitySeqNum2 = value;
        }

        /**
         * Gets the value of the linkClass property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLinkClass() {
            return linkClass;
        }

        /**
         * Sets the value of the linkClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLinkClass(JAXBElement<String> value) {
            this.linkClass = value;
        }

        /**
         * Gets the value of the nonpolyResNum1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNonpolyResNum1() {
            return nonpolyResNum1;
        }

        /**
         * Sets the value of the nonpolyResNum1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNonpolyResNum1(JAXBElement<String> value) {
            this.nonpolyResNum1 = value;
        }

        /**
         * Gets the value of the nonpolyResNum2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNonpolyResNum2() {
            return nonpolyResNum2;
        }

        /**
         * Sets the value of the nonpolyResNum2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNonpolyResNum2(JAXBElement<String> value) {
            this.nonpolyResNum2 = value;
        }

        /**
         * Gets the value of the refEntityId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefEntityId1() {
            return refEntityId1;
        }

        /**
         * Sets the value of the refEntityId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefEntityId1(String value) {
            this.refEntityId1 = value;
        }

        /**
         * Gets the value of the refEntityId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefEntityId2() {
            return refEntityId2;
        }

        /**
         * Sets the value of the refEntityId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefEntityId2(String value) {
            this.refEntityId2 = value;
        }

        /**
         * Gets the value of the valueOrder property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueOrder() {
            return valueOrder;
        }

        /**
         * Sets the value of the valueOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueOrder(JAXBElement<String> value) {
            this.valueOrder = value;
        }

        /**
         * Gets the value of the linkId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLinkId() {
            return linkId;
        }

        /**
         * Sets the value of the linkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLinkId(BigInteger value) {
            this.linkId = value;
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
