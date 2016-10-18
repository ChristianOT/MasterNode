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
 * Contains information about the symmetry operations of the
 * space group.
 * 
 *     Example 1 - The symmetry operations for the space group P21/c.
 * <PDBx:space_group_symopCategory>
 *    <PDBx:space_group_symop id="1">
 *       <PDBx:operation_xyz>x,y,z</PDBx:operation_xyz>
 *    </PDBx:space_group_symop>
 *    <PDBx:space_group_symop id="2">
 *       <PDBx:operation_xyz>-x,-y,-z</PDBx:operation_xyz>
 *    </PDBx:space_group_symop>
 *    <PDBx:space_group_symop id="3">
 *       <PDBx:operation_xyz>-x,1/2+y,1/2-z</PDBx:operation_xyz>
 *    </PDBx:space_group_symop>
 *    <PDBx:space_group_symop id="4">
 *       <PDBx:operation_xyz>x,1/2-y,1/2+z</PDBx:operation_xyz>
 *    </PDBx:space_group_symop>
 * </PDBx:space_group_symopCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for space_group_symopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="space_group_symopType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="space_group_symop" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="operation_xyz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sg_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "space_group_symopType", propOrder = {
    "spaceGroupSymop"
})
public class SpaceGroupSymopType {

    @XmlElement(name = "space_group_symop")
    protected List<SpaceGroupSymopType.SpaceGroupSymop> spaceGroupSymop;

    /**
     * Gets the value of the spaceGroupSymop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceGroupSymop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaceGroupSymop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceGroupSymopType.SpaceGroupSymop }
     * 
     * 
     */
    public List<SpaceGroupSymopType.SpaceGroupSymop> getSpaceGroupSymop() {
        if (spaceGroupSymop == null) {
            spaceGroupSymop = new ArrayList<SpaceGroupSymopType.SpaceGroupSymop>();
        }
        return this.spaceGroupSymop;
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
     *         &lt;element name="operation_xyz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sg_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SpaceGroupSymop {

        @XmlElementRef(name = "operation_xyz", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> operationXyz;
        @XmlElementRef(name = "sg_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sgId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the operationXyz property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getOperationXyz() {
            return operationXyz;
        }

        /**
         * Sets the value of the operationXyz property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setOperationXyz(JAXBElement<String> value) {
            this.operationXyz = value;
        }

        /**
         * Gets the value of the sgId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSgId() {
            return sgId;
        }

        /**
         * Sets the value of the sgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSgId(JAXBElement<String> value) {
            this.sgId = value;
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
