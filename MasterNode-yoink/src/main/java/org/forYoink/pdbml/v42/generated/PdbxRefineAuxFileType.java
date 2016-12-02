//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 * Auxilary parameter and topology files used in refinement.
 * <PDBx:pdbx_refine_aux_fileCategory>
 *    <PDBx:pdbx_refine_aux_file pdbx_refine_id="x-ray" serial_no="1">
 *       <PDBx:file_name>parm_hol.dat</PDBx:file_name>
 *       <PDBx:file_type>PARAMETER</PDBx:file_type>
 *    </PDBx:pdbx_refine_aux_file>
 * </PDBx:pdbx_refine_aux_fileCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_refine_aux_fileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_refine_aux_fileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_refine_aux_file" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="file_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="file_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="PARAMETER"/>
 *                         &lt;enumeration value="TOPOLOGY"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="serial_no" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_refine_aux_fileType", propOrder = {
    "pdbxRefineAuxFile"
})
public class PdbxRefineAuxFileType {

    @XmlElement(name = "pdbx_refine_aux_file")
    protected List<PdbxRefineAuxFileType.PdbxRefineAuxFile> pdbxRefineAuxFile;

    /**
     * Gets the value of the pdbxRefineAuxFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxRefineAuxFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxRefineAuxFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxRefineAuxFileType.PdbxRefineAuxFile }
     * 
     * 
     */
    public List<PdbxRefineAuxFileType.PdbxRefineAuxFile> getPdbxRefineAuxFile() {
        if (pdbxRefineAuxFile == null) {
            pdbxRefineAuxFile = new ArrayList<PdbxRefineAuxFileType.PdbxRefineAuxFile>();
        }
        return this.pdbxRefineAuxFile;
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
     *         &lt;element name="file_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="file_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="PARAMETER"/>
     *               &lt;enumeration value="TOPOLOGY"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="serial_no" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxRefineAuxFile {

        @XmlElementRef(name = "file_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fileName;
        @XmlElementRef(name = "file_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fileType;
        @XmlAttribute(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;
        @XmlAttribute(name = "serial_no", required = true)
        protected String serialNo;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFileName(JAXBElement<String> value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the fileType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFileType() {
            return fileType;
        }

        /**
         * Sets the value of the fileType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFileType(JAXBElement<String> value) {
            this.fileType = value;
        }

        /**
         * Gets the value of the pdbxRefineId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxRefineId() {
            return pdbxRefineId;
        }

        /**
         * Sets the value of the pdbxRefineId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxRefineId(String value) {
            this.pdbxRefineId = value;
        }

        /**
         * Gets the value of the serialNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerialNo() {
            return serialNo;
        }

        /**
         * Sets the value of the serialNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerialNo(String value) {
            this.serialNo = value;
        }

    }

}