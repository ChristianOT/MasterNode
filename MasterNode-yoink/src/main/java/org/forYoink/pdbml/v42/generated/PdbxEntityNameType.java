//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.forYoink.pdbml.v42.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * The PDBX_ENTITY_NAME records additional name information for
 * each entity.
 * 
 *     Example 1 -
 * <PDBx:pdbx_entity_nameCategory>
 *    <PDBx:pdbx_entity_name entity_id="1" name="PLASTOCYANIN" name_type="SWS-NAME"></PDBx:pdbx_entity_name>
 *    <PDBx:pdbx_entity_name entity_id="1" name="Electron transport" name_type="SWS-KEYWORD"></PDBx:pdbx_entity_name>
 * </PDBx:pdbx_entity_nameCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_nameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_name" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name_type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="RCSB_NAME"/>
 *                       &lt;enumeration value="RCSB_SYNONYM"/>
 *                       &lt;enumeration value="SWS-NAME"/>
 *                       &lt;enumeration value="SWS-SYNONYM"/>
 *                       &lt;enumeration value="SWS-KEYWORD"/>
 *                       &lt;enumeration value="GB-NAME"/>
 *                       &lt;enumeration value="GB-SYNONYM"/>
 *                       &lt;enumeration value="GB-KEYWORD"/>
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
@XmlType(name = "pdbx_entity_nameType", propOrder = {
    "pdbxEntityName"
})
public class PdbxEntityNameType {

    @XmlElement(name = "pdbx_entity_name")
    protected List<PdbxEntityNameType.PdbxEntityName> pdbxEntityName;

    /**
     * Gets the value of the pdbxEntityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntityNameType.PdbxEntityName }
     * 
     * 
     */
    public List<PdbxEntityNameType.PdbxEntityName> getPdbxEntityName() {
        if (pdbxEntityName == null) {
            pdbxEntityName = new ArrayList<PdbxEntityNameType.PdbxEntityName>();
        }
        return this.pdbxEntityName;
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
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name_type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="RCSB_NAME"/>
     *             &lt;enumeration value="RCSB_SYNONYM"/>
     *             &lt;enumeration value="SWS-NAME"/>
     *             &lt;enumeration value="SWS-SYNONYM"/>
     *             &lt;enumeration value="SWS-KEYWORD"/>
     *             &lt;enumeration value="GB-NAME"/>
     *             &lt;enumeration value="GB-SYNONYM"/>
     *             &lt;enumeration value="GB-KEYWORD"/>
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
    @XmlType(name = "")
    public static class PdbxEntityName {

        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "name_type", required = true)
        protected String nameType;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the nameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameType() {
            return nameType;
        }

        /**
         * Sets the value of the nameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameType(String value) {
            this.nameType = value;
        }

    }

}