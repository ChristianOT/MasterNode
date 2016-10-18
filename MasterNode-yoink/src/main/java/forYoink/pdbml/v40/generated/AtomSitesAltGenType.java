//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package forYoink.pdbml.v40.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Data items in the ATOM_SITES_ALT_GEN category record details
 * about the interpretation of multiple conformations in the
 * structure.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:atom_sites_alt_genCategory>
 *    <PDBx:atom_sites_alt_gen alt_id="1" ens_id="Ensemble 1-A"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="2" ens_id="Ensemble 1-A"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="1" ens_id="Ensemble 1-B"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="4" ens_id="Ensemble 1-B"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="2" ens_id="Ensemble 2-A"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="3" ens_id="Ensemble 2-A"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="2" ens_id="Ensemble 2-B"></PDBx:atom_sites_alt_gen>
 *    <PDBx:atom_sites_alt_gen alt_id="4" ens_id="Ensemble 2-B"></PDBx:atom_sites_alt_gen>
 * </PDBx:atom_sites_alt_genCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for atom_sites_alt_genType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atom_sites_alt_genType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atom_sites_alt_gen" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "atom_sites_alt_genType", propOrder = {
    "atomSitesAltGen"
})
public class AtomSitesAltGenType {

    @XmlElement(name = "atom_sites_alt_gen")
    protected List<AtomSitesAltGenType.AtomSitesAltGen> atomSitesAltGen;

    /**
     * Gets the value of the atomSitesAltGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomSitesAltGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomSitesAltGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomSitesAltGenType.AtomSitesAltGen }
     * 
     * 
     */
    public List<AtomSitesAltGenType.AtomSitesAltGen> getAtomSitesAltGen() {
        if (atomSitesAltGen == null) {
            atomSitesAltGen = new ArrayList<AtomSitesAltGenType.AtomSitesAltGen>();
        }
        return this.atomSitesAltGen;
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
     *       &lt;attribute name="alt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ens_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AtomSitesAltGen {

        @XmlAttribute(name = "alt_id", required = true)
        protected String altId;
        @XmlAttribute(name = "ens_id", required = true)
        protected String ensId;

        /**
         * Gets the value of the altId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltId() {
            return altId;
        }

        /**
         * Sets the value of the altId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltId(String value) {
            this.altId = value;
        }

        /**
         * Gets the value of the ensId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnsId() {
            return ensId;
        }

        /**
         * Sets the value of the ensId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnsId(String value) {
            this.ensId = value;
        }

    }

}
