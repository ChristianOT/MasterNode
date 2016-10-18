//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_REFERENCE_ENTITY_POLY category record details about 
 * the polymer, such as the type of the polymer, the number of
 * monomers and whether it has nonstandard features.
 * 
 *     Example: 1  Actinomycin
 *                 
 * <PDBx:pdbx_reference_entity_polyCategory>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000001" ref_entity_id="1">
 *       <PDBx:db_code>NOR00228</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000006" ref_entity_id="2">
 *       <PDBx:db_name>Semi-synthetic</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000007" ref_entity_id="3">
 *       <PDBx:db_code>NOR00232</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000009" ref_entity_id="4">
 *       <PDBx:db_code>NOR00237</PDBx:db_code>
 *       <PDBx:db_name>Norine</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000010" ref_entity_id="5">
 *       <PDBx:db_name>Semi-synthetic</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 *    <PDBx:pdbx_reference_entity_poly prd_id="PRD_000011" ref_entity_id="6">
 *       <PDBx:db_name>Semi-synthetic</PDBx:db_name>
 *       <PDBx:type>peptide-like</PDBx:type>
 *    </PDBx:pdbx_reference_entity_poly>
 * </PDBx:pdbx_reference_entity_polyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_entity_polyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_entity_polyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_entity_poly" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="peptide-like"/>
 *                         &lt;enumeration value="nucleic-acid-like"/>
 *                         &lt;enumeration value="polysaccharide-like"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_entity_polyType", propOrder = {
    "pdbxReferenceEntityPoly"
})
public class PdbxReferenceEntityPolyType {

    @XmlElement(name = "pdbx_reference_entity_poly")
    protected List<PdbxReferenceEntityPolyType.PdbxReferenceEntityPoly> pdbxReferenceEntityPoly;

    /**
     * Gets the value of the pdbxReferenceEntityPoly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceEntityPoly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceEntityPoly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceEntityPolyType.PdbxReferenceEntityPoly }
     * 
     * 
     */
    public List<PdbxReferenceEntityPolyType.PdbxReferenceEntityPoly> getPdbxReferenceEntityPoly() {
        if (pdbxReferenceEntityPoly == null) {
            pdbxReferenceEntityPoly = new ArrayList<PdbxReferenceEntityPolyType.PdbxReferenceEntityPoly>();
        }
        return this.pdbxReferenceEntityPoly;
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
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="peptide-like"/>
     *               &lt;enumeration value="nucleic-acid-like"/>
     *               &lt;enumeration value="polysaccharide-like"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ref_entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceEntityPoly {

        @XmlElementRef(name = "db_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbCode;
        @XmlElementRef(name = "db_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbName;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;
        @XmlAttribute(name = "ref_entity_id", required = true)
        protected String refEntityId;

        /**
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbCode(JAXBElement<String> value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbName(JAXBElement<String> value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
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

        /**
         * Gets the value of the refEntityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefEntityId() {
            return refEntityId;
        }

        /**
         * Sets the value of the refEntityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefEntityId(String value) {
            this.refEntityId = value;
        }

    }

}
