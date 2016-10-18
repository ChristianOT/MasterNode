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
 * Data items in the ENTITY_POLY_SEQ category specify the sequence
 * of monomers in a polymer. Allowance is made for the possibility
 * of microheterogeneity in a sample by allowing a given sequence
 * number to be correlated with more than one monomer ID. The
 * corresponding ATOM_SITE entries should reflect this
 * heterogeneity.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:entity_poly_seqCategory>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="PRO" num="1"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLN" num="2"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ILE" num="3"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="THR" num="4"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LEU" num="5"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="TRP" num="6"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLN" num="7"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ARG" num="8"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="PRO" num="9"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LEU" num="10"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="VAL" num="11"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="THR" num="12"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ILE" num="13"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LYS" num="14"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ILE" num="15"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLY" num="16"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLY" num="17"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLN" num="18"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LEU" num="19"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LYS" num="20"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="GLU" num="21"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ALA" num="22"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LEU" num="23"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="LEU" num="24"></PDBx:entity_poly_seq>
 *    <PDBx:entity_poly_seq entity_id="1" mon_id="ASP" num="25"></PDBx:entity_poly_seq>
 * </PDBx:entity_poly_seqCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for entity_poly_seqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity_poly_seqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity_poly_seq" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
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
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="mon_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="num" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "entity_poly_seqType", propOrder = {
    "entityPolySeq"
})
public class EntityPolySeqType {

    @XmlElement(name = "entity_poly_seq")
    protected List<EntityPolySeqType.EntityPolySeq> entityPolySeq;

    /**
     * Gets the value of the entityPolySeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityPolySeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityPolySeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityPolySeqType.EntityPolySeq }
     * 
     * 
     */
    public List<EntityPolySeqType.EntityPolySeq> getEntityPolySeq() {
        if (entityPolySeq == null) {
            entityPolySeq = new ArrayList<EntityPolySeqType.EntityPolySeq>();
        }
        return this.entityPolySeq;
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
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="mon_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="num" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class EntityPolySeq {

        @XmlElementRef(name = "hetero", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> hetero;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "mon_id", required = true)
        protected String monId;
        @XmlAttribute(name = "num", required = true)
        protected BigInteger num;

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
         * Gets the value of the num property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNum() {
            return num;
        }

        /**
         * Sets the value of the num property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNum(BigInteger value) {
            this.num = value;
        }

    }

}
