//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the STRUCT_NCS_ENS_GEN category list domains
 * related by a noncrystallographic symmetry operation and
 * identify the operator.
 * 
 *     Example 1 - based on laboratory records for the collagen-like
 *                 peptide, HYP-.
 * <PDBx:struct_ncs_ens_genCategory>
 *    <PDBx:struct_ncs_ens_gen dom_id_1="d1" dom_id_2="d2" ens_id="en1" oper_id="ncsop1"></PDBx:struct_ncs_ens_gen>
 * </PDBx:struct_ncs_ens_genCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_ncs_ens_genType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_ncs_ens_genType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_ncs_ens_gen" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="dom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="oper_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_ncs_ens_genType", propOrder = {
    "structNcsEnsGen"
})
public class StructNcsEnsGenType {

    @XmlElement(name = "struct_ncs_ens_gen")
    protected List<StructNcsEnsGenType.StructNcsEnsGen> structNcsEnsGen;

    /**
     * Gets the value of the structNcsEnsGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structNcsEnsGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructNcsEnsGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructNcsEnsGenType.StructNcsEnsGen }
     * 
     * 
     */
    public List<StructNcsEnsGenType.StructNcsEnsGen> getStructNcsEnsGen() {
        if (structNcsEnsGen == null) {
            structNcsEnsGen = new ArrayList<StructNcsEnsGenType.StructNcsEnsGen>();
        }
        return this.structNcsEnsGen;
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
     *       &lt;attribute name="dom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="dom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="oper_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StructNcsEnsGen {

        @XmlAttribute(name = "dom_id_1", required = true)
        protected String domId1;
        @XmlAttribute(name = "dom_id_2", required = true)
        protected String domId2;
        @XmlAttribute(name = "ens_id", required = true)
        protected String ensId;
        @XmlAttribute(name = "oper_id", required = true)
        protected String operId;

        /**
         * Gets the value of the domId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomId1() {
            return domId1;
        }

        /**
         * Sets the value of the domId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomId1(String value) {
            this.domId1 = value;
        }

        /**
         * Gets the value of the domId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomId2() {
            return domId2;
        }

        /**
         * Sets the value of the domId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomId2(String value) {
            this.domId2 = value;
        }

        /**
         * Gets the value of the ensId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnsId() {
            return ensId;
        }

        /**
         * Sets the value of the ensId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnsId(String value) {
            this.ensId = value;
        }

        /**
         * Gets the value of the operId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperId() {
            return operId;
        }

        /**
         * Sets the value of the operId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperId(String value) {
            this.operId = value;
        }

    }

}
