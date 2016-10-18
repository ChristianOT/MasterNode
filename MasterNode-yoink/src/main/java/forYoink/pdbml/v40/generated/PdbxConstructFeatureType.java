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
 * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
 * specify various properties of a nucleic acid sequence used during
 * protein production.
 * 
 *     Example 1 - vector pUC28
 * <PDBx:pdbx_construct_featureCategory>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="1">
 *       <PDBx:details>pKK84-1 ClaI 5260bp 5247..5247 ptac11 TaqI-TaqI 192bp, -35 trp promoter -&gt; pEA300 5452bp</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type xsi:nil="true" />
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="2">
 *       <PDBx:details>pKK84-1 1..5246 5246bp ClaI = AT^CGAT TaqI =  T^CGA cgact...</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type xsi:nil="true" />
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="3">
 *       <PDBx:details>ptac11 190bp ...cat TaqI =  T^CGA ClaI = AT^CGAT</PDBx:details>
 *       <PDBx:end_seq>5436</PDBx:end_seq>
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq>5247</PDBx:start_seq>
 *       <PDBx:type xsi:nil="true" />
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="4">
 *       <PDBx:details>pKK84-1 5247..5260 14bp</PDBx:details>
 *       <PDBx:end_seq>5450</PDBx:end_seq>
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq>5437</PDBx:start_seq>
 *       <PDBx:type xsi:nil="true" />
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="5">
 *       <PDBx:details>SIT unique EcoRI-ClaI-HindIII-BamHI-PvuII</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type>misc_binding</PDBx:type>
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="6">
 *       <PDBx:details>ORI E. coli pMB1 (ColE1 and pBR322)</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type>rep_origin</PDBx:type>
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="7">
 *       <PDBx:details>PRO E. coli trp</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type>promoter</PDBx:type>
 *    </PDBx:pdbx_construct_feature>
 *    <PDBx:pdbx_construct_feature construct_id="1" id="8">
 *       <PDBx:details>ANT E. coli beta-lactamase gene (bla) ampicillin resistance gene (apr/amp)</PDBx:details>
 *       <PDBx:end_seq xsi:nil="true" />
 *       <PDBx:entry_id>111000111</PDBx:entry_id>
 *       <PDBx:start_seq xsi:nil="true" />
 *       <PDBx:type>CDS</PDBx:type>
 *    </PDBx:pdbx_construct_feature>
 * </PDBx:pdbx_construct_featureCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_construct_featureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_construct_featureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_construct_feature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_seq" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="start_seq" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="1"/>
 *                             &lt;maxInclusive value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="construct_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_construct_featureType", propOrder = {
    "pdbxConstructFeature"
})
public class PdbxConstructFeatureType {

    @XmlElement(name = "pdbx_construct_feature")
    protected List<PdbxConstructFeatureType.PdbxConstructFeature> pdbxConstructFeature;

    /**
     * Gets the value of the pdbxConstructFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxConstructFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxConstructFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxConstructFeatureType.PdbxConstructFeature }
     * 
     * 
     */
    public List<PdbxConstructFeatureType.PdbxConstructFeature> getPdbxConstructFeature() {
        if (pdbxConstructFeature == null) {
            pdbxConstructFeature = new ArrayList<PdbxConstructFeatureType.PdbxConstructFeature>();
        }
        return this.pdbxConstructFeature;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_seq" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="start_seq" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="1"/>
     *                   &lt;maxInclusive value="1"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="construct_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxConstructFeature {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "end_seq", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endSeq;
        @XmlElement(name = "entry_id", required = true)
        protected String entryId;
        @XmlElementRef(name = "start_seq", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> startSeq;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "construct_id", required = true)
        protected String constructId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the endSeq property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndSeq() {
            return endSeq;
        }

        /**
         * Sets the value of the endSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndSeq(JAXBElement<String> value) {
            this.endSeq = value;
        }

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

        /**
         * Gets the value of the startSeq property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStartSeq() {
            return startSeq;
        }

        /**
         * Sets the value of the startSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStartSeq(JAXBElement<String> value) {
            this.startSeq = value;
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
         * Gets the value of the constructId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstructId() {
            return constructId;
        }

        /**
         * Sets the value of the constructId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstructId(String value) {
            this.constructId = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
