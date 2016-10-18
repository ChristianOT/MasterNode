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
 * Data items in the EM_SAMPLE_SUPPORT category record details
 * of the electron microscope grid type, grid support film and pretreatment
 * of whole before sample is applied
 *   Example 1 - based on PDB entry 1DYL and laboratory records for the
 *                 structure corresponding to PDB entry 1DYL
 * <PDBx:em_sample_supportCategory>
 *    <PDBx:em_sample_support id="1">
 *       <PDBx:citation_id>2</PDBx:citation_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:film_material>HOLEY CARBON</PDBx:film_material>
 *       <PDBx:grid_material>COPPER</PDBx:grid_material>
 *       <PDBx:grid_mesh_size>400</PDBx:grid_mesh_size>
 *       <PDBx:grid_type>MESH</PDBx:grid_type>
 *       <PDBx:method xsi:nil="true" />
 *       <PDBx:pretreatment>GLOW DISCHARGE</PDBx:pretreatment>
 *    </PDBx:em_sample_support>
 * </PDBx:em_sample_supportCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_sample_supportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_sample_supportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_sample_support" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="film_material" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CARBON"/>
 *                         &lt;enumeration value="FORMVAR PLUS CARBON"/>
 *                         &lt;enumeration value="CELLULOSE ACETATE PLUS CARBON"/>
 *                         &lt;enumeration value="PARLODION PLUS CARBON"/>
 *                         &lt;enumeration value="HOLEY CARBON"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="grid_material" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="COPPER"/>
 *                         &lt;enumeration value="COPPER/PALLADIUM"/>
 *                         &lt;enumeration value="COPPER/RHODIUM"/>
 *                         &lt;enumeration value="GOLD"/>
 *                         &lt;enumeration value="NICKEL"/>
 *                         &lt;enumeration value="PLATINUM"/>
 *                         &lt;enumeration value="TUNGSTEN"/>
 *                         &lt;enumeration value="TITANIUM"/>
 *                         &lt;enumeration value="MOLYBDENUM"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="grid_mesh_size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="grid_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="SLOT"/>
 *                         &lt;enumeration value="APERTURE"/>
 *                         &lt;enumeration value="DIAMOND"/>
 *                         &lt;enumeration value="HEXAGONAL"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pretreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "em_sample_supportType", propOrder = {
    "emSampleSupport"
})
public class EmSampleSupportType {

    @XmlElement(name = "em_sample_support")
    protected List<EmSampleSupportType.EmSampleSupport> emSampleSupport;

    /**
     * Gets the value of the emSampleSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emSampleSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmSampleSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmSampleSupportType.EmSampleSupport }
     * 
     * 
     */
    public List<EmSampleSupportType.EmSampleSupport> getEmSampleSupport() {
        if (emSampleSupport == null) {
            emSampleSupport = new ArrayList<EmSampleSupportType.EmSampleSupport>();
        }
        return this.emSampleSupport;
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
     *         &lt;element name="citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="film_material" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="CARBON"/>
     *               &lt;enumeration value="FORMVAR PLUS CARBON"/>
     *               &lt;enumeration value="CELLULOSE ACETATE PLUS CARBON"/>
     *               &lt;enumeration value="PARLODION PLUS CARBON"/>
     *               &lt;enumeration value="HOLEY CARBON"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="grid_material" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="COPPER"/>
     *               &lt;enumeration value="COPPER/PALLADIUM"/>
     *               &lt;enumeration value="COPPER/RHODIUM"/>
     *               &lt;enumeration value="GOLD"/>
     *               &lt;enumeration value="NICKEL"/>
     *               &lt;enumeration value="PLATINUM"/>
     *               &lt;enumeration value="TUNGSTEN"/>
     *               &lt;enumeration value="TITANIUM"/>
     *               &lt;enumeration value="MOLYBDENUM"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="grid_mesh_size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="grid_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="SLOT"/>
     *               &lt;enumeration value="APERTURE"/>
     *               &lt;enumeration value="DIAMOND"/>
     *               &lt;enumeration value="HEXAGONAL"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pretreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
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
    public static class EmSampleSupport {

        @XmlElementRef(name = "citation_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> citationId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "film_material", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> filmMaterial;
        @XmlElementRef(name = "grid_material", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gridMaterial;
        @XmlElementRef(name = "grid_mesh_size", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> gridMeshSize;
        @XmlElementRef(name = "grid_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gridType;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "pretreatment", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pretreatment;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the citationId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCitationId() {
            return citationId;
        }

        /**
         * Sets the value of the citationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCitationId(JAXBElement<String> value) {
            this.citationId = value;
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
         * Gets the value of the filmMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFilmMaterial() {
            return filmMaterial;
        }

        /**
         * Sets the value of the filmMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFilmMaterial(JAXBElement<String> value) {
            this.filmMaterial = value;
        }

        /**
         * Gets the value of the gridMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getGridMaterial() {
            return gridMaterial;
        }

        /**
         * Sets the value of the gridMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setGridMaterial(JAXBElement<String> value) {
            this.gridMaterial = value;
        }

        /**
         * Gets the value of the gridMeshSize property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getGridMeshSize() {
            return gridMeshSize;
        }

        /**
         * Sets the value of the gridMeshSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setGridMeshSize(JAXBElement<BigInteger> value) {
            this.gridMeshSize = value;
        }

        /**
         * Gets the value of the gridType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getGridType() {
            return gridType;
        }

        /**
         * Sets the value of the gridType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setGridType(JAXBElement<String> value) {
            this.gridType = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethod(JAXBElement<String> value) {
            this.method = value;
        }

        /**
         * Gets the value of the pretreatment property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPretreatment() {
            return pretreatment;
        }

        /**
         * Sets the value of the pretreatment property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPretreatment(JAXBElement<String> value) {
            this.pretreatment = value;
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
