//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the DIFFRN_STANDARD_REFLN category record details
 * about the reflections treated as standards during the measurement
 * of a set of diffraction intensities.
 * 
 * Note that these are the individual standard reflections, not the
 * results of the analysis of the standard reflections.
 * 
 *     Example 2 - based on data set TOZ of Willis, Beckwith & Tozer
 *                 [Acta Cryst. (1991), C47, 2276-2277].
 * <PDBx:diffrn_standard_reflnCategory>
 *    <PDBx:diffrn_standard_refln code="1" diffrn_id="s1">
 *       <PDBx:index_h>3</PDBx:index_h>
 *       <PDBx:index_k>2</PDBx:index_k>
 *       <PDBx:index_l>4</PDBx:index_l>
 *    </PDBx:diffrn_standard_refln>
 *    <PDBx:diffrn_standard_refln code="1" diffrn_id="s1">
 *       <PDBx:index_h>1</PDBx:index_h>
 *       <PDBx:index_k>9</PDBx:index_k>
 *       <PDBx:index_l>1</PDBx:index_l>
 *    </PDBx:diffrn_standard_refln>
 *    <PDBx:diffrn_standard_refln code="1" diffrn_id="s1">
 *       <PDBx:index_h>3</PDBx:index_h>
 *       <PDBx:index_k>0</PDBx:index_k>
 *       <PDBx:index_l>10</PDBx:index_l>
 *    </PDBx:diffrn_standard_refln>
 * </PDBx:diffrn_standard_reflnCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for diffrn_standard_reflnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diffrn_standard_reflnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diffrn_standard_refln" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="index_h" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="index_k" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="index_l" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "diffrn_standard_reflnType", propOrder = {
    "diffrnStandardRefln"
})
public class DiffrnStandardReflnType {

    @XmlElement(name = "diffrn_standard_refln")
    protected List<DiffrnStandardReflnType.DiffrnStandardRefln> diffrnStandardRefln;

    /**
     * Gets the value of the diffrnStandardRefln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diffrnStandardRefln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiffrnStandardRefln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiffrnStandardReflnType.DiffrnStandardRefln }
     * 
     * 
     */
    public List<DiffrnStandardReflnType.DiffrnStandardRefln> getDiffrnStandardRefln() {
        if (diffrnStandardRefln == null) {
            diffrnStandardRefln = new ArrayList<DiffrnStandardReflnType.DiffrnStandardRefln>();
        }
        return this.diffrnStandardRefln;
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
     *         &lt;element name="index_h" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="index_k" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="index_l" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class DiffrnStandardRefln {

        @XmlElement(name = "index_h", required = true)
        protected BigInteger indexH;
        @XmlElement(name = "index_k", required = true)
        protected BigInteger indexK;
        @XmlElement(name = "index_l", required = true)
        protected BigInteger indexL;
        @XmlAttribute(name = "code", required = true)
        protected String code;
        @XmlAttribute(name = "diffrn_id", required = true)
        protected String diffrnId;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the diffrnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiffrnId() {
            return diffrnId;
        }

        /**
         * Sets the value of the diffrnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiffrnId(String value) {
            this.diffrnId = value;
        }

    }

}
