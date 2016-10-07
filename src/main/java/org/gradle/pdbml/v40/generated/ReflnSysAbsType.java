//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.gradle.pdbml.v40.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the REFLN_SYS_ABS category record details about
 * the reflection data that should be systematically absent,
 * given the designated space group.
 * 
 *     Example 1 - hypothetical example.
 * <PDBx:refln_sys_absCategory>
 *    <PDBx:refln_sys_abs index_h="0" index_k="3" index_l="0">
 *       <PDBx:I>28.32</PDBx:I>
 *       <PDBx:I_over_sigmaI>1.23</PDBx:I_over_sigmaI>
 *       <PDBx:sigmaI>22.95</PDBx:sigmaI>
 *    </PDBx:refln_sys_abs>
 *    <PDBx:refln_sys_abs index_h="0" index_k="5" index_l="0">
 *       <PDBx:I>14.11</PDBx:I>
 *       <PDBx:I_over_sigmaI>0.86</PDBx:I_over_sigmaI>
 *       <PDBx:sigmaI>16.38</PDBx:sigmaI>
 *    </PDBx:refln_sys_abs>
 *    <PDBx:refln_sys_abs index_h="0" index_k="7" index_l="0">
 *       <PDBx:I>114.81</PDBx:I>
 *       <PDBx:I_over_sigmaI>5.67</PDBx:I_over_sigmaI>
 *       <PDBx:sigmaI>20.22</PDBx:sigmaI>
 *    </PDBx:refln_sys_abs>
 *    <PDBx:refln_sys_abs index_h="0" index_k="9" index_l="0">
 *       <PDBx:I>32.99</PDBx:I>
 *       <PDBx:I_over_sigmaI>1.35</PDBx:I_over_sigmaI>
 *       <PDBx:sigmaI>24.51</PDBx:sigmaI>
 *    </PDBx:refln_sys_abs>
 * </PDBx:refln_sys_absCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refln_sys_absType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refln_sys_absType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refln_sys_abs" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="I" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="I_over_sigmaI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sigmaI" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "refln_sys_absType", propOrder = {
    "reflnSysAbs"
})
public class ReflnSysAbsType {

    @XmlElement(name = "refln_sys_abs")
    protected List<ReflnSysAbsType.ReflnSysAbs> reflnSysAbs;

    /**
     * Gets the value of the reflnSysAbs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflnSysAbs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflnSysAbs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflnSysAbsType.ReflnSysAbs }
     * 
     * 
     */
    public List<ReflnSysAbsType.ReflnSysAbs> getReflnSysAbs() {
        if (reflnSysAbs == null) {
            reflnSysAbs = new ArrayList<ReflnSysAbsType.ReflnSysAbs>();
        }
        return this.reflnSysAbs;
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
     *         &lt;element name="I" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="I_over_sigmaI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="sigmaI" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class ReflnSysAbs {

        @XmlElementRef(name = "I", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ReflnSysAbsType.ReflnSysAbs.I> i;
        @XmlElementRef(name = "I_over_sigmaI", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> iOverSigmaI;
        @XmlElementRef(name = "sigmaI", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ReflnSysAbsType.ReflnSysAbs.SigmaI> sigmaI;
        @XmlAttribute(name = "index_h", required = true)
        protected BigInteger indexH;
        @XmlAttribute(name = "index_k", required = true)
        protected BigInteger indexK;
        @XmlAttribute(name = "index_l", required = true)
        protected BigInteger indexL;

        /**
         * Gets the value of the i property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ReflnSysAbsType.ReflnSysAbs.I }{@code >}
         *     
         */
        public JAXBElement<ReflnSysAbsType.ReflnSysAbs.I> getI() {
            return i;
        }

        /**
         * Sets the value of the i property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ReflnSysAbsType.ReflnSysAbs.I }{@code >}
         *     
         */
        public void setI(JAXBElement<ReflnSysAbsType.ReflnSysAbs.I> value) {
            this.i = value;
        }

        /**
         * Gets the value of the iOverSigmaI property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getIOverSigmaI() {
            return iOverSigmaI;
        }

        /**
         * Sets the value of the iOverSigmaI property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setIOverSigmaI(JAXBElement<BigDecimal> value) {
            this.iOverSigmaI = value;
        }

        /**
         * Gets the value of the sigmaI property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ReflnSysAbsType.ReflnSysAbs.SigmaI }{@code >}
         *     
         */
        public JAXBElement<ReflnSysAbsType.ReflnSysAbs.SigmaI> getSigmaI() {
            return sigmaI;
        }

        /**
         * Sets the value of the sigmaI property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ReflnSysAbsType.ReflnSysAbs.SigmaI }{@code >}
         *     
         */
        public void setSigmaI(JAXBElement<ReflnSysAbsType.ReflnSysAbs.SigmaI> value) {
            this.sigmaI = value;
        }

        /**
         * Gets the value of the indexH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexH() {
            return indexH;
        }

        /**
         * Sets the value of the indexH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexH(BigInteger value) {
            this.indexH = value;
        }

        /**
         * Gets the value of the indexK property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexK() {
            return indexK;
        }

        /**
         * Sets the value of the indexK property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexK(BigInteger value) {
            this.indexK = value;
        }

        /**
         * Gets the value of the indexL property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexL() {
            return indexL;
        }

        /**
         * Sets the value of the indexL property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexL(BigInteger value) {
            this.indexL = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class I {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "arbitrary";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SigmaI {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "arbitrary";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
