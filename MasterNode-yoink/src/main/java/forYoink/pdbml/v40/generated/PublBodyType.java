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
 * Data items in the PUBL_BODY category permit the labelling of
 * different text sections within the body of a paper.
 * Note that these should not be used in a paper which has
 * a standard format with sections tagged by specific data names
 * (such as in Acta Crystallographica Section C). Typically,
 * each journal will supply a list of the specific items it
 * requires in its Notes for Authors.
 * 
 *     Example 1 - based on a paper by R. Restori & D. Schwarzenbach
 *                 [Acta Cryst. (1996), A52, 369-378].
 * <PDBx:publ_bodyCategory>
 *    <PDBx:publ_body element="section" label="1">
 *       <PDBx:contents> X-ray diffraction from a crystalline material provides
 * information on the thermally and spatially averaged
 * electron density in the crystal...</PDBx:contents>
 *       <PDBx:format>cif</PDBx:format>
 *       <PDBx:title>Introduction</PDBx:title>
 *    </PDBx:publ_body>
 *    <PDBx:publ_body element="section" label="2">
 *       <PDBx:contents> In the rigid-atom approximation, the dynamic electron
 * density of an atom is described by the convolution
 * product of the static atomic density and a probability
 * density function,
 * $\rho_{dyn}(\bf r) = \rho_{stat}(\bf r) * P(\bf r). \eqno(1)$</PDBx:contents>
 *       <PDBx:format>tex</PDBx:format>
 *       <PDBx:title>Theory</PDBx:title>
 *    </PDBx:publ_body>
 * </PDBx:publ_bodyCategory>
 * 
 * 
 *     Example 2 - based on a paper by R. J. Papoular, Y. Vekhter & P. Coppens
 *                 [Acta Cryst. (1996), A52, 397-407].
 * <PDBx:publ_bodyCategory>
 *    <PDBx:publ_body element="section" label="3">
 *       <PDBx:contents xsi:nil="true" />
 *       <PDBx:title> The two-channel method for retrieval of the deformation
 * electron density</PDBx:title>
 *    </PDBx:publ_body>
 *    <PDBx:publ_body element="subsection" label="3.1">
 *       <PDBx:contents> As the wide dynamic range involved in the total electron
 * density...</PDBx:contents>
 *       <PDBx:title>The two-channel entropy S[\D\r(r)]</PDBx:title>
 *    </PDBx:publ_body>
 *    <PDBx:publ_body element="subsection" label="3.2">
 *       <PDBx:contents xsi:nil="true" />
 *       <PDBx:title>Uniform vs informative prior model densities</PDBx:title>
 *    </PDBx:publ_body>
 *    <PDBx:publ_body element="subsubsection" label="3.2.1">
 *       <PDBx:contents> Straightforward algebra leads to expressions analogous
 * to...</PDBx:contents>
 *       <PDBx:title>Use of uniform models</PDBx:title>
 *    </PDBx:publ_body>
 * </PDBx:publ_bodyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for publ_bodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publ_bodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publ_body" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="format" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ascii"/>
 *                         &lt;enumeration value="cif"/>
 *                         &lt;enumeration value="latex"/>
 *                         &lt;enumeration value="sgml"/>
 *                         &lt;enumeration value="tex"/>
 *                         &lt;enumeration value="troff"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="element" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="section"/>
 *                       &lt;enumeration value="subsection"/>
 *                       &lt;enumeration value="subsubsection"/>
 *                       &lt;enumeration value="appendix"/>
 *                       &lt;enumeration value="footnote"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "publ_bodyType", propOrder = {
    "publBody"
})
public class PublBodyType {

    @XmlElement(name = "publ_body")
    protected List<PublBodyType.PublBody> publBody;

    /**
     * Gets the value of the publBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublBodyType.PublBody }
     * 
     * 
     */
    public List<PublBodyType.PublBody> getPublBody() {
        if (publBody == null) {
            publBody = new ArrayList<PublBodyType.PublBody>();
        }
        return this.publBody;
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
     *         &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="format" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ascii"/>
     *               &lt;enumeration value="cif"/>
     *               &lt;enumeration value="latex"/>
     *               &lt;enumeration value="sgml"/>
     *               &lt;enumeration value="tex"/>
     *               &lt;enumeration value="troff"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="element" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="section"/>
     *             &lt;enumeration value="subsection"/>
     *             &lt;enumeration value="subsubsection"/>
     *             &lt;enumeration value="appendix"/>
     *             &lt;enumeration value="footnote"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PublBody {

        @XmlElementRef(name = "contents", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contents;
        @XmlElementRef(name = "format", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> format;
        @XmlElementRef(name = "title", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> title;
        @XmlAttribute(name = "element", required = true)
        protected String element;
        @XmlAttribute(name = "label", required = true)
        protected String label;

        /**
         * Gets the value of the contents property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContents() {
            return contents;
        }

        /**
         * Sets the value of the contents property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContents(JAXBElement<String> value) {
            this.contents = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFormat(JAXBElement<String> value) {
            this.format = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTitle(JAXBElement<String> value) {
            this.title = value;
        }

        /**
         * Gets the value of the element property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElement() {
            return element;
        }

        /**
         * Sets the value of the element property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElement(String value) {
            this.element = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

    }

}
