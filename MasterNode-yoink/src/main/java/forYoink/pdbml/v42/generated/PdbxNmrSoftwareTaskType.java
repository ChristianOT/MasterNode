//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package forYoink.pdbml.v42.generated;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_software_taskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_software_taskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_software_task" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="software_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="task" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="collection"/>
 *                       &lt;enumeration value="chemical shift assignment"/>
 *                       &lt;enumeration value="chemical shift calculation"/>
 *                       &lt;enumeration value="data analysis"/>
 *                       &lt;enumeration value="geometry optimization"/>
 *                       &lt;enumeration value="peak picking"/>
 *                       &lt;enumeration value="processing"/>
 *                       &lt;enumeration value="refinement"/>
 *                       &lt;enumeration value="structure solution"/>
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
@XmlType(name = "pdbx_nmr_software_taskType", propOrder = {
    "pdbxNmrSoftwareTask"
})
public class PdbxNmrSoftwareTaskType {

    @XmlElement(name = "pdbx_nmr_software_task")
    protected List<PdbxNmrSoftwareTaskType.PdbxNmrSoftwareTask> pdbxNmrSoftwareTask;

    /**
     * Gets the value of the pdbxNmrSoftwareTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSoftwareTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSoftwareTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSoftwareTaskType.PdbxNmrSoftwareTask }
     * 
     * 
     */
    public List<PdbxNmrSoftwareTaskType.PdbxNmrSoftwareTask> getPdbxNmrSoftwareTask() {
        if (pdbxNmrSoftwareTask == null) {
            pdbxNmrSoftwareTask = new ArrayList<PdbxNmrSoftwareTaskType.PdbxNmrSoftwareTask>();
        }
        return this.pdbxNmrSoftwareTask;
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
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="software_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="task" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="collection"/>
     *             &lt;enumeration value="chemical shift assignment"/>
     *             &lt;enumeration value="chemical shift calculation"/>
     *             &lt;enumeration value="data analysis"/>
     *             &lt;enumeration value="geometry optimization"/>
     *             &lt;enumeration value="peak picking"/>
     *             &lt;enumeration value="processing"/>
     *             &lt;enumeration value="refinement"/>
     *             &lt;enumeration value="structure solution"/>
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
    @XmlType(name = "")
    public static class PdbxNmrSoftwareTask {

        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "software_ordinal", required = true)
        protected BigInteger softwareOrdinal;
        @XmlAttribute(name = "task", required = true)
        protected String task;

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

        /**
         * Gets the value of the softwareOrdinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSoftwareOrdinal() {
            return softwareOrdinal;
        }

        /**
         * Sets the value of the softwareOrdinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSoftwareOrdinal(BigInteger value) {
            this.softwareOrdinal = value;
        }

        /**
         * Gets the value of the task property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTask(String value) {
            this.task = value;
        }

    }

}
