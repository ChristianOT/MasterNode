//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.gradle.pdbml.v42.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Additional features associated with the chemical component.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_model_referenceCategory>
 *    <PDBx:pdbx_chem_comp_model_reference db_code="PIWVIB" db_name="CSD" model_id="M_ZZV_00001"></PDBx:pdbx_chem_comp_model_reference>
 * </PDBx:pdbx_chem_comp_model_referenceCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_model_referenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_model_referenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_model_reference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="db_code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="db_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_chem_comp_model_referenceType", propOrder = {
    "pdbxChemCompModelReference"
})
public class PdbxChemCompModelReferenceType {

    @XmlElement(name = "pdbx_chem_comp_model_reference")
    protected List<PdbxChemCompModelReferenceType.PdbxChemCompModelReference> pdbxChemCompModelReference;

    /**
     * Gets the value of the pdbxChemCompModelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompModelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompModelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompModelReferenceType.PdbxChemCompModelReference }
     * 
     * 
     */
    public List<PdbxChemCompModelReferenceType.PdbxChemCompModelReference> getPdbxChemCompModelReference() {
        if (pdbxChemCompModelReference == null) {
            pdbxChemCompModelReference = new ArrayList<PdbxChemCompModelReferenceType.PdbxChemCompModelReference>();
        }
        return this.pdbxChemCompModelReference;
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
     *       &lt;attribute name="db_code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="db_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxChemCompModelReference {

        @XmlAttribute(name = "db_code", required = true)
        protected String dbCode;
        @XmlAttribute(name = "db_name", required = true)
        protected String dbName;
        @XmlAttribute(name = "model_id", required = true)
        protected String modelId;

        /**
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbCode(String value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbName(String value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the modelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelId() {
            return modelId;
        }

        /**
         * Sets the value of the modelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelId(String value) {
            this.modelId = value;
        }

    }

}
