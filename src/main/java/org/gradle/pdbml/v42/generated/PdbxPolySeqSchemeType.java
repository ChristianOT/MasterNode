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
 * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
 * mapping for polymer entities.
 * 
 *     Example 1 - based on NDB entry DDFB25
 * <PDBx:pdbx_poly_seq_schemeCategory>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DC" seq_id="1">
 *       <PDBx:auth_mon_id>DC</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>1</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>1</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DC</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>1</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DG" seq_id="2">
 *       <PDBx:auth_mon_id>DG</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>2</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>2</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DG</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>2</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DT" seq_id="3">
 *       <PDBx:auth_mon_id>DT</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>3</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>3</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DT</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>3</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DA" seq_id="4">
 *       <PDBx:auth_mon_id>DA</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>4</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>4</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DA</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>4</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DC" seq_id="5">
 *       <PDBx:auth_mon_id>DC</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>5</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>5</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DC</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>5</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 *    <PDBx:pdbx_poly_seq_scheme asym_id="A" entity_id="1" mon_id="DG" seq_id="6">
 *       <PDBx:auth_mon_id>DG</PDBx:auth_mon_id>
 *       <PDBx:auth_seq_num>6</PDBx:auth_seq_num>
 *       <PDBx:ndb_seq_num>6</PDBx:ndb_seq_num>
 *       <PDBx:pdb_ins_code xsi:nil="true" />
 *       <PDBx:pdb_mon_id>DG</PDBx:pdb_mon_id>
 *       <PDBx:pdb_seq_num>6</PDBx:pdb_seq_num>
 *       <PDBx:pdb_strand_id>A</PDBx:pdb_strand_id>
 *    </PDBx:pdbx_poly_seq_scheme>
 * </PDBx:pdbx_poly_seq_schemeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_poly_seq_schemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_poly_seq_schemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_poly_seq_scheme" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hetero" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ndb_seq_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdb_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdb_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="mon_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_poly_seq_schemeType", propOrder = {
    "pdbxPolySeqScheme"
})
public class PdbxPolySeqSchemeType {

    @XmlElement(name = "pdbx_poly_seq_scheme")
    protected List<PdbxPolySeqSchemeType.PdbxPolySeqScheme> pdbxPolySeqScheme;

    /**
     * Gets the value of the pdbxPolySeqScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPolySeqScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPolySeqScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPolySeqSchemeType.PdbxPolySeqScheme }
     * 
     * 
     */
    public List<PdbxPolySeqSchemeType.PdbxPolySeqScheme> getPdbxPolySeqScheme() {
        if (pdbxPolySeqScheme == null) {
            pdbxPolySeqScheme = new ArrayList<PdbxPolySeqSchemeType.PdbxPolySeqScheme>();
        }
        return this.pdbxPolySeqScheme;
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
     *         &lt;element name="auth_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hetero" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ndb_seq_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdb_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdb_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="mon_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxPolySeqScheme {

        @XmlElementRef(name = "auth_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authMonId;
        @XmlElementRef(name = "auth_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authSeqNum;
        @XmlElementRef(name = "hetero", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> hetero;
        @XmlElementRef(name = "ndb_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> ndbSeqNum;
        @XmlElementRef(name = "pdb_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElementRef(name = "pdb_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbMonId;
        @XmlElementRef(name = "pdb_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbSeqNum;
        @XmlElementRef(name = "pdb_strand_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbStrandId;
        @XmlAttribute(name = "asym_id", required = true)
        protected String asymId;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "mon_id", required = true)
        protected String monId;
        @XmlAttribute(name = "seq_id", required = true)
        protected BigInteger seqId;

        /**
         * Gets the value of the authMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthMonId() {
            return authMonId;
        }

        /**
         * Sets the value of the authMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthMonId(JAXBElement<String> value) {
            this.authMonId = value;
        }

        /**
         * Gets the value of the authSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthSeqNum() {
            return authSeqNum;
        }

        /**
         * Sets the value of the authSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthSeqNum(JAXBElement<String> value) {
            this.authSeqNum = value;
        }

        /**
         * Gets the value of the hetero property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHetero() {
            return hetero;
        }

        /**
         * Sets the value of the hetero property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHetero(JAXBElement<String> value) {
            this.hetero = value;
        }

        /**
         * Gets the value of the ndbSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNdbSeqNum() {
            return ndbSeqNum;
        }

        /**
         * Sets the value of the ndbSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNdbSeqNum(JAXBElement<BigInteger> value) {
            this.ndbSeqNum = value;
        }

        /**
         * Gets the value of the pdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbInsCode() {
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
        public void setPdbInsCode(JAXBElement<String> value) {
            this.pdbInsCode = value;
        }

        /**
         * Gets the value of the pdbMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbMonId() {
            return pdbMonId;
        }

        /**
         * Sets the value of the pdbMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbMonId(JAXBElement<String> value) {
            this.pdbMonId = value;
        }

        /**
         * Gets the value of the pdbSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbSeqNum() {
            return pdbSeqNum;
        }

        /**
         * Sets the value of the pdbSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbSeqNum(JAXBElement<String> value) {
            this.pdbSeqNum = value;
        }

        /**
         * Gets the value of the pdbStrandId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbStrandId() {
            return pdbStrandId;
        }

        /**
         * Sets the value of the pdbStrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbStrandId(JAXBElement<String> value) {
            this.pdbStrandId = value;
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
         * Gets the value of the monId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonId() {
            return monId;
        }

        /**
         * Sets the value of the monId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonId(String value) {
            this.monId = value;
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

    }

}
