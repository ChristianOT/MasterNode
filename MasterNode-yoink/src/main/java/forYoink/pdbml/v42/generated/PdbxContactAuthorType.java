//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the name and address of the author to be contacted
 * concerning the contents of this data block.  This category atomizes
 * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
 * category.
 * 
 *     Example 1 -
 * <PDBx:pdbx_contact_authorCategory>
 *    <PDBx:pdbx_contact_author id="1">
 *       <PDBx:address_1>Department of Biophysical Chemistry</PDBx:address_1>
 *       <PDBx:address_2>Merck Research Laboratories</PDBx:address_2>
 *       <PDBx:address_3>P. O. Box 2000, Ry80M203</PDBx:address_3>
 *       <PDBx:city>Rahway</PDBx:city>
 *       <PDBx:country>UNITED STATES</PDBx:country>
 *       <PDBx:email>paula_fitzgerald@merck.com</PDBx:email>
 *       <PDBx:fax>908 594 6645</PDBx:fax>
 *       <PDBx:name_first>Paula</PDBx:name_first>
 *       <PDBx:name_last>Fitzgerald</PDBx:name_last>
 *       <PDBx:name_mi>M.D.</PDBx:name_mi>
 *       <PDBx:name_salutation>Dr.</PDBx:name_salutation>
 *       <PDBx:organization_type>commercial</PDBx:organization_type>
 *       <PDBx:phone>908 594 5510</PDBx:phone>
 *       <PDBx:postal_code>07065</PDBx:postal_code>
 *       <PDBx:role>principal investigator/group leader</PDBx:role>
 *       <PDBx:state_province>New Jersey</PDBx:state_province>
 *    </PDBx:pdbx_contact_author>
 * </PDBx:pdbx_contact_authorCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_contact_authorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_contact_authorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_contact_author" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="continent" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="AFRICA"/>
 *                         &lt;enumeration value="ANTARTICA"/>
 *                         &lt;enumeration value="ASIA"/>
 *                         &lt;enumeration value="AUSTRALIA"/>
 *                         &lt;enumeration value="EUROPE"/>
 *                         &lt;enumeration value="NORTH AMERICA"/>
 *                         &lt;enumeration value="SOUTH AMERICA"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name_first" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name_last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name_mi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name_salutation">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Dr."/>
 *                         &lt;enumeration value="Prof."/>
 *                         &lt;enumeration value="Mr."/>
 *                         &lt;enumeration value="Ms."/>
 *                         &lt;enumeration value="Mrs."/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="organization_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="academic"/>
 *                         &lt;enumeration value="commercial"/>
 *                         &lt;enumeration value="government"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postal_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="role" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="principal investigator/group leader"/>
 *                         &lt;enumeration value="responsible scientist"/>
 *                         &lt;enumeration value="investigator"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="state_province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                       &lt;enumeration value="4"/>
 *                       &lt;enumeration value="5"/>
 *                       &lt;enumeration value="6"/>
 *                       &lt;enumeration value="7"/>
 *                       &lt;enumeration value="8"/>
 *                       &lt;enumeration value="9"/>
 *                       &lt;enumeration value="10"/>
 *                       &lt;enumeration value="11"/>
 *                       &lt;enumeration value="12"/>
 *                       &lt;enumeration value="13"/>
 *                       &lt;enumeration value="14"/>
 *                       &lt;enumeration value="15"/>
 *                       &lt;enumeration value="16"/>
 *                       &lt;enumeration value="17"/>
 *                       &lt;enumeration value="18"/>
 *                       &lt;enumeration value="19"/>
 *                       &lt;enumeration value="20"/>
 *                       &lt;enumeration value="21"/>
 *                       &lt;enumeration value="22"/>
 *                       &lt;enumeration value="23"/>
 *                       &lt;enumeration value="24"/>
 *                       &lt;enumeration value="25"/>
 *                       &lt;enumeration value="26"/>
 *                       &lt;enumeration value="27"/>
 *                       &lt;enumeration value="28"/>
 *                       &lt;enumeration value="29"/>
 *                       &lt;enumeration value="30"/>
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
@XmlType(name = "pdbx_contact_authorType", propOrder = {
    "pdbxContactAuthor"
})
public class PdbxContactAuthorType {

    @XmlElement(name = "pdbx_contact_author")
    protected List<PdbxContactAuthorType.PdbxContactAuthor> pdbxContactAuthor;

    /**
     * Gets the value of the pdbxContactAuthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxContactAuthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxContactAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxContactAuthorType.PdbxContactAuthor }
     * 
     * 
     */
    public List<PdbxContactAuthorType.PdbxContactAuthor> getPdbxContactAuthor() {
        if (pdbxContactAuthor == null) {
            pdbxContactAuthor = new ArrayList<PdbxContactAuthorType.PdbxContactAuthor>();
        }
        return this.pdbxContactAuthor;
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
     *         &lt;element name="address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="continent" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="AFRICA"/>
     *               &lt;enumeration value="ANTARTICA"/>
     *               &lt;enumeration value="ASIA"/>
     *               &lt;enumeration value="AUSTRALIA"/>
     *               &lt;enumeration value="EUROPE"/>
     *               &lt;enumeration value="NORTH AMERICA"/>
     *               &lt;enumeration value="SOUTH AMERICA"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name_first" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name_last" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name_mi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name_salutation">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Dr."/>
     *               &lt;enumeration value="Prof."/>
     *               &lt;enumeration value="Mr."/>
     *               &lt;enumeration value="Ms."/>
     *               &lt;enumeration value="Mrs."/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="organization_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="academic"/>
     *               &lt;enumeration value="commercial"/>
     *               &lt;enumeration value="government"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postal_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="role" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="principal investigator/group leader"/>
     *               &lt;enumeration value="responsible scientist"/>
     *               &lt;enumeration value="investigator"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="state_province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *             &lt;enumeration value="4"/>
     *             &lt;enumeration value="5"/>
     *             &lt;enumeration value="6"/>
     *             &lt;enumeration value="7"/>
     *             &lt;enumeration value="8"/>
     *             &lt;enumeration value="9"/>
     *             &lt;enumeration value="10"/>
     *             &lt;enumeration value="11"/>
     *             &lt;enumeration value="12"/>
     *             &lt;enumeration value="13"/>
     *             &lt;enumeration value="14"/>
     *             &lt;enumeration value="15"/>
     *             &lt;enumeration value="16"/>
     *             &lt;enumeration value="17"/>
     *             &lt;enumeration value="18"/>
     *             &lt;enumeration value="19"/>
     *             &lt;enumeration value="20"/>
     *             &lt;enumeration value="21"/>
     *             &lt;enumeration value="22"/>
     *             &lt;enumeration value="23"/>
     *             &lt;enumeration value="24"/>
     *             &lt;enumeration value="25"/>
     *             &lt;enumeration value="26"/>
     *             &lt;enumeration value="27"/>
     *             &lt;enumeration value="28"/>
     *             &lt;enumeration value="29"/>
     *             &lt;enumeration value="30"/>
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
    @XmlType(name = "", propOrder = {

    })
    public static class PdbxContactAuthor {

        @XmlElementRef(name = "address_1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> address1;
        @XmlElementRef(name = "address_2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> address2;
        @XmlElementRef(name = "address_3", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> address3;
        @XmlElementRef(name = "city", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> city;
        @XmlElementRef(name = "continent", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> continent;
        @XmlElement(required = true)
        protected String country;
        @XmlElement(required = true)
        protected String email;
        @XmlElementRef(name = "fax", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fax;
        @XmlElement(name = "name_first", required = true)
        protected String nameFirst;
        @XmlElement(name = "name_last", required = true)
        protected String nameLast;
        @XmlElementRef(name = "name_mi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nameMi;
        @XmlElement(name = "name_salutation", required = true)
        protected String nameSalutation;
        @XmlElementRef(name = "organization_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> organizationType;
        @XmlElementRef(name = "phone", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> phone;
        @XmlElementRef(name = "postal_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> postalCode;
        @XmlElementRef(name = "role", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> role;
        @XmlElementRef(name = "state_province", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> stateProvince;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the address1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAddress1() {
            return address1;
        }

        /**
         * Sets the value of the address1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAddress1(JAXBElement<String> value) {
            this.address1 = value;
        }

        /**
         * Gets the value of the address2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAddress2() {
            return address2;
        }

        /**
         * Sets the value of the address2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAddress2(JAXBElement<String> value) {
            this.address2 = value;
        }

        /**
         * Gets the value of the address3 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAddress3() {
            return address3;
        }

        /**
         * Sets the value of the address3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAddress3(JAXBElement<String> value) {
            this.address3 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCity(JAXBElement<String> value) {
            this.city = value;
        }

        /**
         * Gets the value of the continent property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContinent() {
            return continent;
        }

        /**
         * Sets the value of the continent property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContinent(JAXBElement<String> value) {
            this.continent = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFax() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFax(JAXBElement<String> value) {
            this.fax = value;
        }

        /**
         * Gets the value of the nameFirst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameFirst() {
            return nameFirst;
        }

        /**
         * Sets the value of the nameFirst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameFirst(String value) {
            this.nameFirst = value;
        }

        /**
         * Gets the value of the nameLast property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameLast() {
            return nameLast;
        }

        /**
         * Sets the value of the nameLast property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameLast(String value) {
            this.nameLast = value;
        }

        /**
         * Gets the value of the nameMi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNameMi() {
            return nameMi;
        }

        /**
         * Sets the value of the nameMi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNameMi(JAXBElement<String> value) {
            this.nameMi = value;
        }

        /**
         * Gets the value of the nameSalutation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameSalutation() {
            return nameSalutation;
        }

        /**
         * Sets the value of the nameSalutation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameSalutation(String value) {
            this.nameSalutation = value;
        }

        /**
         * Gets the value of the organizationType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getOrganizationType() {
            return organizationType;
        }

        /**
         * Sets the value of the organizationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setOrganizationType(JAXBElement<String> value) {
            this.organizationType = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPhone(JAXBElement<String> value) {
            this.phone = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPostalCode(JAXBElement<String> value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRole(JAXBElement<String> value) {
            this.role = value;
        }

        /**
         * Gets the value of the stateProvince property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStateProvince() {
            return stateProvince;
        }

        /**
         * Sets the value of the stateProvince property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStateProvince(JAXBElement<String> value) {
            this.stateProvince = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

    }

}
