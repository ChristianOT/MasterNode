//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the STRUCT_SHEET_ORDER category record details
 * about the order of the residue ranges that form a beta-sheet.
 * All order links are pairwise and the specified pairs are
 * assumed to be adjacent to one another in the sheet. These data
 * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
 * items and they allow all manner of sheets to be described.
 * 
 *     Example 1 - simple beta-barrel.
 * <PDBx:struct_sheet_orderCategory>
 *    <PDBx:struct_sheet_order range_id_1="strand_a" range_id_2="strand_b" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_b" range_id_2="strand_c" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_c" range_id_2="strand_d" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_d" range_id_2="strand_e" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_e" range_id_2="strand_f" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_f" range_id_2="strand_g" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_g" range_id_2="strand_h" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_h" range_id_2="strand_a" sheet_id="sheet_1">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 * </PDBx:struct_sheet_orderCategory>
 * 
 * 
 *     Example 2 - five stranded mixed-sense sheet with one two-piece strand.
 * <PDBx:struct_sheet_orderCategory>
 *    <PDBx:struct_sheet_order range_id_1="strand_a" range_id_2="strand_b" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>anti-parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_b" range_id_2="strand_c" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_c" range_id_2="strand_d1" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>anti-parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_c" range_id_2="strand_d2" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>anti-parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_d1" range_id_2="strand_e" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>anti-parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 *    <PDBx:struct_sheet_order range_id_1="strand_d2" range_id_2="strand_e" sheet_id="sheet_2">
 *       <PDBx:offset>+1</PDBx:offset>
 *       <PDBx:sense>anti-parallel</PDBx:sense>
 *    </PDBx:struct_sheet_order>
 * </PDBx:struct_sheet_orderCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_sheet_orderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_sheet_orderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_sheet_order" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="sense" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parallel"/>
 *                         &lt;enumeration value="anti-parallel"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="range_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="range_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_sheet_orderType", propOrder = {
    "structSheetOrder"
})
public class StructSheetOrderType {

    @XmlElement(name = "struct_sheet_order")
    protected List<StructSheetOrderType.StructSheetOrder> structSheetOrder;

    /**
     * Gets the value of the structSheetOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSheetOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSheetOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSheetOrderType.StructSheetOrder }
     * 
     * 
     */
    public List<StructSheetOrderType.StructSheetOrder> getStructSheetOrder() {
        if (structSheetOrder == null) {
            structSheetOrder = new ArrayList<StructSheetOrderType.StructSheetOrder>();
        }
        return this.structSheetOrder;
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
     *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="sense" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="parallel"/>
     *               &lt;enumeration value="anti-parallel"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="range_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="range_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sheet_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructSheetOrder {

        @XmlElementRef(name = "offset", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> offset;
        @XmlElementRef(name = "sense", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sense;
        @XmlAttribute(name = "range_id_1", required = true)
        protected String rangeId1;
        @XmlAttribute(name = "range_id_2", required = true)
        protected String rangeId2;
        @XmlAttribute(name = "sheet_id", required = true)
        protected String sheetId;

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setOffset(JAXBElement<BigInteger> value) {
            this.offset = value;
        }

        /**
         * Gets the value of the sense property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSense() {
            return sense;
        }

        /**
         * Sets the value of the sense property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSense(JAXBElement<String> value) {
            this.sense = value;
        }

        /**
         * Gets the value of the rangeId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeId1() {
            return rangeId1;
        }

        /**
         * Sets the value of the rangeId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeId1(String value) {
            this.rangeId1 = value;
        }

        /**
         * Gets the value of the rangeId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeId2() {
            return rangeId2;
        }

        /**
         * Sets the value of the rangeId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeId2(String value) {
            this.rangeId2 = value;
        }

        /**
         * Gets the value of the sheetId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSheetId() {
            return sheetId;
        }

        /**
         * Sets the value of the sheetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSheetId(String value) {
            this.sheetId = value;
        }

    }

}
