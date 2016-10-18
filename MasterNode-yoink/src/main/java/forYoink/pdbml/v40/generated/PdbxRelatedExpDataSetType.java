//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_RELATED_DATA_SET category record references 
 * to experimental data sets related to the entry.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_related_exp_data_setCategory>
 *    <PDBx:pdbx_related_exp_data_set ordinal="1">
 *       <PDBx:data_reference>doi:10.000/10002/image_data/cif</PDBx:data_reference>
 *       <PDBx:data_set_type>diffraction image data</PDBx:data_set_type>
 *       <PDBx:details>imgCIF data set containing 500 frames</PDBx:details>
 *       <PDBx:metadata_reference>doi:10.000/10002/image_data/txt</PDBx:metadata_reference>
 *    </PDBx:pdbx_related_exp_data_set>
 * </PDBx:pdbx_related_exp_data_setCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_related_exp_data_setType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_related_exp_data_setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_related_exp_data_set" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="data_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="data_set_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="metadata_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_related_exp_data_setType", propOrder = {
    "pdbxRelatedExpDataSet"
})
public class PdbxRelatedExpDataSetType {

    @XmlElement(name = "pdbx_related_exp_data_set")
    protected List<PdbxRelatedExpDataSetType.PdbxRelatedExpDataSet> pdbxRelatedExpDataSet;

    /**
     * Gets the value of the pdbxRelatedExpDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxRelatedExpDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxRelatedExpDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxRelatedExpDataSetType.PdbxRelatedExpDataSet }
     * 
     * 
     */
    public List<PdbxRelatedExpDataSetType.PdbxRelatedExpDataSet> getPdbxRelatedExpDataSet() {
        if (pdbxRelatedExpDataSet == null) {
            pdbxRelatedExpDataSet = new ArrayList<PdbxRelatedExpDataSetType.PdbxRelatedExpDataSet>();
        }
        return this.pdbxRelatedExpDataSet;
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
     *         &lt;element name="data_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="data_set_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="metadata_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxRelatedExpDataSet {

        @XmlElement(name = "data_reference", required = true, nillable = true)
        protected String dataReference;
        @XmlElement(name = "data_set_type", required = true)
        protected String dataSetType;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "metadata_reference", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> metadataReference;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the dataReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataReference() {
            return dataReference;
        }

        /**
         * Sets the value of the dataReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataReference(String value) {
            this.dataReference = value;
        }

        /**
         * Gets the value of the dataSetType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataSetType() {
            return dataSetType;
        }

        /**
         * Sets the value of the dataSetType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataSetType(String value) {
            this.dataSetType = value;
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
         * Gets the value of the metadataReference property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMetadataReference() {
            return metadataReference;
        }

        /**
         * Sets the value of the metadataReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMetadataReference(JAXBElement<String> value) {
            this.metadataReference = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

    }

}
