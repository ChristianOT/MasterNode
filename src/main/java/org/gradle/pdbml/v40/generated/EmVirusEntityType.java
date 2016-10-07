//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the EM_VIRUS_ENTITY category record details
 * of the icosahedral virus.
 *  Example 1 - based on PDB entry 1DYL and laboratory records for the
 *              structure corresponding to PDB entry 1DYL
 * <PDBx:em_virus_entityCategory>
 *    <PDBx:em_virus_entity entity_assembly_id="1" id="1">
 *       <PDBx:empty>NO</PDBx:empty>
 *       <PDBx:enveloped>YES</PDBx:enveloped>
 *       <PDBx:ictvdb_id>00.073.0.01.023</PDBx:ictvdb_id>
 *       <PDBx:virus_host_category>VERTERBRATES</PDBx:virus_host_category>
 *       <PDBx:virus_host_species>HOMO SAPIENS</PDBx:virus_host_species>
 *       <PDBx:virus_isolate>STRAIN</PDBx:virus_isolate>
 *       <PDBx:virus_type>VIRUS</PDBx:virus_type>
 *    </PDBx:em_virus_entity>
 * </PDBx:em_virus_entityCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_virus_entityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_virus_entityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_virus_entity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="empty" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="YES"/>
 *                         &lt;enumeration value="NO"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="enveloped" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="YES"/>
 *                         &lt;enumeration value="NO"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ictvdb_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virus_host_category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virus_host_growth_cell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virus_host_species" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virus_isolate" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="STRAIN"/>
 *                         &lt;enumeration value="SEROTYPE"/>
 *                         &lt;enumeration value="SEROCOMPLEX"/>
 *                         &lt;enumeration value="SUBSPECIES"/>
 *                         &lt;enumeration value="SPECIES"/>
 *                         &lt;enumeration value="OTHER"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="virus_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "em_virus_entityType", propOrder = {
    "emVirusEntity"
})
public class EmVirusEntityType {

    @XmlElement(name = "em_virus_entity")
    protected List<EmVirusEntityType.EmVirusEntity> emVirusEntity;

    /**
     * Gets the value of the emVirusEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emVirusEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmVirusEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmVirusEntityType.EmVirusEntity }
     * 
     * 
     */
    public List<EmVirusEntityType.EmVirusEntity> getEmVirusEntity() {
        if (emVirusEntity == null) {
            emVirusEntity = new ArrayList<EmVirusEntityType.EmVirusEntity>();
        }
        return this.emVirusEntity;
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
     *         &lt;element name="empty" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="YES"/>
     *               &lt;enumeration value="NO"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="enveloped" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="YES"/>
     *               &lt;enumeration value="NO"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ictvdb_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virus_host_category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virus_host_growth_cell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virus_host_species" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virus_isolate" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="STRAIN"/>
     *               &lt;enumeration value="SEROTYPE"/>
     *               &lt;enumeration value="SEROCOMPLEX"/>
     *               &lt;enumeration value="SUBSPECIES"/>
     *               &lt;enumeration value="SPECIES"/>
     *               &lt;enumeration value="OTHER"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="virus_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class EmVirusEntity {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "empty", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> empty;
        @XmlElementRef(name = "enveloped", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> enveloped;
        @XmlElementRef(name = "ictvdb_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ictvdbId;
        @XmlElementRef(name = "virus_host_category", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> virusHostCategory;
        @XmlElementRef(name = "virus_host_growth_cell", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> virusHostGrowthCell;
        @XmlElementRef(name = "virus_host_species", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> virusHostSpecies;
        @XmlElementRef(name = "virus_isolate", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> virusIsolate;
        @XmlElementRef(name = "virus_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> virusType;
        @XmlAttribute(name = "entity_assembly_id", required = true)
        protected String entityAssemblyId;
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
         * Gets the value of the empty property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEmpty() {
            return empty;
        }

        /**
         * Sets the value of the empty property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEmpty(JAXBElement<String> value) {
            this.empty = value;
        }

        /**
         * Gets the value of the enveloped property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEnveloped() {
            return enveloped;
        }

        /**
         * Sets the value of the enveloped property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEnveloped(JAXBElement<String> value) {
            this.enveloped = value;
        }

        /**
         * Gets the value of the ictvdbId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIctvdbId() {
            return ictvdbId;
        }

        /**
         * Sets the value of the ictvdbId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIctvdbId(JAXBElement<String> value) {
            this.ictvdbId = value;
        }

        /**
         * Gets the value of the virusHostCategory property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVirusHostCategory() {
            return virusHostCategory;
        }

        /**
         * Sets the value of the virusHostCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVirusHostCategory(JAXBElement<String> value) {
            this.virusHostCategory = value;
        }

        /**
         * Gets the value of the virusHostGrowthCell property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVirusHostGrowthCell() {
            return virusHostGrowthCell;
        }

        /**
         * Sets the value of the virusHostGrowthCell property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVirusHostGrowthCell(JAXBElement<String> value) {
            this.virusHostGrowthCell = value;
        }

        /**
         * Gets the value of the virusHostSpecies property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVirusHostSpecies() {
            return virusHostSpecies;
        }

        /**
         * Sets the value of the virusHostSpecies property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVirusHostSpecies(JAXBElement<String> value) {
            this.virusHostSpecies = value;
        }

        /**
         * Gets the value of the virusIsolate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVirusIsolate() {
            return virusIsolate;
        }

        /**
         * Sets the value of the virusIsolate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVirusIsolate(JAXBElement<String> value) {
            this.virusIsolate = value;
        }

        /**
         * Gets the value of the virusType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getVirusType() {
            return virusType;
        }

        /**
         * Sets the value of the virusType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setVirusType(JAXBElement<String> value) {
            this.virusType = value;
        }

        /**
         * Gets the value of the entityAssemblyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityAssemblyId() {
            return entityAssemblyId;
        }

        /**
         * Sets the value of the entityAssemblyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityAssemblyId(String value) {
            this.entityAssemblyId = value;
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
