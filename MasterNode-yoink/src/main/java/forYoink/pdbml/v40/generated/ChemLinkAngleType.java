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
 * Data items in the CHEM_LINK_ANGLE category record details
 * about angles in a link between chemical components.
 * 
 *     Example 1 - Engh & Huber parameters [Acta Cryst. (1991), A47,
 *                 392-400] as interpreted by J. P. Priestle (1995). Consistent
 *                 Stereochemical Dictionaries for Refinement and Model
 *                 Building. CCP4 Daresbury Study Weekend,
 *                 DL-CONF-95-001, ISSN 1358-6254. Warrington: Daresbury
 *                 Laboratory.
 * <PDBx:chem_link_angleCategory>
 *    <PDBx:chem_link_angle atom_id_1="N" atom_id_2="CA" atom_id_3="C" link_id="PEPTIDE">
 *       <PDBx:atom_1_comp_id>1</PDBx:atom_1_comp_id>
 *       <PDBx:atom_2_comp_id>1</PDBx:atom_2_comp_id>
 *       <PDBx:atom_3_comp_id>1</PDBx:atom_3_comp_id>
 *       <PDBx:value_angle>111.2</PDBx:value_angle>
 *       <PDBx:value_angle_esd>2.8</PDBx:value_angle_esd>
 *    </PDBx:chem_link_angle>
 *    <PDBx:chem_link_angle atom_id_1="CA" atom_id_2="C" atom_id_3="O" link_id="PEPTIDE">
 *       <PDBx:atom_1_comp_id>1</PDBx:atom_1_comp_id>
 *       <PDBx:atom_2_comp_id>1</PDBx:atom_2_comp_id>
 *       <PDBx:atom_3_comp_id>1</PDBx:atom_3_comp_id>
 *       <PDBx:value_angle>120.8</PDBx:value_angle>
 *       <PDBx:value_angle_esd>1.7</PDBx:value_angle_esd>
 *    </PDBx:chem_link_angle>
 *    <PDBx:chem_link_angle atom_id_1="CA" atom_id_2="C" atom_id_3="N" link_id="PEPTIDE">
 *       <PDBx:atom_1_comp_id>1</PDBx:atom_1_comp_id>
 *       <PDBx:atom_2_comp_id>1</PDBx:atom_2_comp_id>
 *       <PDBx:atom_3_comp_id>2</PDBx:atom_3_comp_id>
 *       <PDBx:value_angle>116.2</PDBx:value_angle>
 *       <PDBx:value_angle_esd>2.0</PDBx:value_angle_esd>
 *    </PDBx:chem_link_angle>
 *    <PDBx:chem_link_angle atom_id_1="O" atom_id_2="C" atom_id_3="N" link_id="PEPTIDE">
 *       <PDBx:atom_1_comp_id>1</PDBx:atom_1_comp_id>
 *       <PDBx:atom_2_comp_id>1</PDBx:atom_2_comp_id>
 *       <PDBx:atom_3_comp_id>2</PDBx:atom_3_comp_id>
 *       <PDBx:value_angle>123.0</PDBx:value_angle>
 *       <PDBx:value_angle_esd>1.6</PDBx:value_angle_esd>
 *    </PDBx:chem_link_angle>
 *    <PDBx:chem_link_angle atom_id_1="C" atom_id_2="N" atom_id_3="CA" link_id="PEPTIDE">
 *       <PDBx:atom_1_comp_id>1</PDBx:atom_1_comp_id>
 *       <PDBx:atom_2_comp_id>2</PDBx:atom_2_comp_id>
 *       <PDBx:atom_3_comp_id>2</PDBx:atom_3_comp_id>
 *       <PDBx:value_angle>121.7</PDBx:value_angle>
 *       <PDBx:value_angle_esd>1.8</PDBx:value_angle_esd>
 *    </PDBx:chem_link_angle>
 * </PDBx:chem_link_angleCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chem_link_angleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_link_angleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_link_angle" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_1_comp_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="atom_2_comp_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="atom_3_comp_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_angle" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="180.0"/>
 *                             &lt;maxInclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_angle_esd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="180.0"/>
 *                             &lt;maxInclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="180.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_dist" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value_dist_esd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_3" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_link_angleType", propOrder = {
    "chemLinkAngle"
})
public class ChemLinkAngleType {

    @XmlElement(name = "chem_link_angle")
    protected List<ChemLinkAngleType.ChemLinkAngle> chemLinkAngle;

    /**
     * Gets the value of the chemLinkAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemLinkAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemLinkAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemLinkAngleType.ChemLinkAngle }
     * 
     * 
     */
    public List<ChemLinkAngleType.ChemLinkAngle> getChemLinkAngle() {
        if (chemLinkAngle == null) {
            chemLinkAngle = new ArrayList<ChemLinkAngleType.ChemLinkAngle>();
        }
        return this.chemLinkAngle;
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
     *         &lt;element name="atom_1_comp_id" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="atom_2_comp_id" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="atom_3_comp_id" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_angle" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="180.0"/>
     *                   &lt;maxInclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_angle_esd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="180.0"/>
     *                   &lt;maxInclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="180.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_dist" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value_dist_esd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_3" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="link_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemLinkAngle {

        @XmlElementRef(name = "atom_1_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atom1CompId;
        @XmlElementRef(name = "atom_2_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atom2CompId;
        @XmlElementRef(name = "atom_3_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atom3CompId;
        @XmlElementRef(name = "value_angle", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueAngle;
        @XmlElementRef(name = "value_angle_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueAngleEsd;
        @XmlElementRef(name = "value_dist", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueDist;
        @XmlElementRef(name = "value_dist_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> valueDistEsd;
        @XmlAttribute(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlAttribute(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlAttribute(name = "atom_id_3", required = true)
        protected String atomId3;
        @XmlAttribute(name = "link_id", required = true)
        protected String linkId;

        /**
         * Gets the value of the atom1CompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtom1CompId() {
            return atom1CompId;
        }

        /**
         * Sets the value of the atom1CompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtom1CompId(JAXBElement<String> value) {
            this.atom1CompId = value;
        }

        /**
         * Gets the value of the atom2CompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtom2CompId() {
            return atom2CompId;
        }

        /**
         * Sets the value of the atom2CompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtom2CompId(JAXBElement<String> value) {
            this.atom2CompId = value;
        }

        /**
         * Gets the value of the atom3CompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtom3CompId() {
            return atom3CompId;
        }

        /**
         * Sets the value of the atom3CompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtom3CompId(JAXBElement<String> value) {
            this.atom3CompId = value;
        }

        /**
         * Gets the value of the valueAngle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueAngle() {
            return valueAngle;
        }

        /**
         * Sets the value of the valueAngle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueAngle(JAXBElement<String> value) {
            this.valueAngle = value;
        }

        /**
         * Gets the value of the valueAngleEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueAngleEsd() {
            return valueAngleEsd;
        }

        /**
         * Sets the value of the valueAngleEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueAngleEsd(JAXBElement<String> value) {
            this.valueAngleEsd = value;
        }

        /**
         * Gets the value of the valueDist property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueDist() {
            return valueDist;
        }

        /**
         * Sets the value of the valueDist property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueDist(JAXBElement<String> value) {
            this.valueDist = value;
        }

        /**
         * Gets the value of the valueDistEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValueDistEsd() {
            return valueDistEsd;
        }

        /**
         * Sets the value of the valueDistEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValueDistEsd(JAXBElement<String> value) {
            this.valueDistEsd = value;
        }

        /**
         * Gets the value of the atomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId1() {
            return atomId1;
        }

        /**
         * Sets the value of the atomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId1(String value) {
            this.atomId1 = value;
        }

        /**
         * Gets the value of the atomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId2() {
            return atomId2;
        }

        /**
         * Sets the value of the atomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId2(String value) {
            this.atomId2 = value;
        }

        /**
         * Gets the value of the atomId3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId3() {
            return atomId3;
        }

        /**
         * Sets the value of the atomId3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId3(String value) {
            this.atomId3 = value;
        }

        /**
         * Gets the value of the linkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkId() {
            return linkId;
        }

        /**
         * Sets the value of the linkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkId(String value) {
            this.linkId = value;
        }

    }

}
