//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
 * atoms in a plane in a link between two chemical components.
 * 
 *          
 * 
 * <p>Java class for chem_link_plane_atomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_link_plane_atomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_link_plane_atom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_comp_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="plane_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_link_plane_atomType", propOrder = {
    "chemLinkPlaneAtom"
})
public class ChemLinkPlaneAtomType {

    @XmlElement(name = "chem_link_plane_atom")
    protected List<ChemLinkPlaneAtomType.ChemLinkPlaneAtom> chemLinkPlaneAtom;

    /**
     * Gets the value of the chemLinkPlaneAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemLinkPlaneAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemLinkPlaneAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemLinkPlaneAtomType.ChemLinkPlaneAtom }
     * 
     * 
     */
    public List<ChemLinkPlaneAtomType.ChemLinkPlaneAtom> getChemLinkPlaneAtom() {
        if (chemLinkPlaneAtom == null) {
            chemLinkPlaneAtom = new ArrayList<ChemLinkPlaneAtomType.ChemLinkPlaneAtom>();
        }
        return this.chemLinkPlaneAtom;
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
     *         &lt;element name="atom_comp_id" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="plane_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemLinkPlaneAtom {

        @XmlElementRef(name = "atom_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atomCompId;
        @XmlAttribute(name = "atom_id", required = true)
        protected String atomId;
        @XmlAttribute(name = "plane_id", required = true)
        protected String planeId;

        /**
         * Gets the value of the atomCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtomCompId() {
            return atomCompId;
        }

        /**
         * Sets the value of the atomCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtomCompId(JAXBElement<String> value) {
            this.atomCompId = value;
        }

        /**
         * Gets the value of the atomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId() {
            return atomId;
        }

        /**
         * Sets the value of the atomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId(String value) {
            this.atomId = value;
        }

        /**
         * Gets the value of the planeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaneId() {
            return planeId;
        }

        /**
         * Sets the value of the planeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaneId(String value) {
            this.planeId = value;
        }

    }

}
