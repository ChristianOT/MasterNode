//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.29 at 10:54:28 PM EST 
//

package org.xml_cml.schema;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.xml-cml.org/schema>nonNegativeAngleType">
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}errorBasis"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}ref"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}id"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}convention"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}min"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}errorValue"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}atomRefs3"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}dictRef"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}max"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}title"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}angleUnits"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class Angle {

	@XmlValue
	protected double value;
	@XmlAttribute(name = "errorBasis")
	protected ErrorBasisType errorBasis;
	@XmlAttribute(name = "ref")
	protected String ref;
	@XmlAttribute(name = "id")
	protected String id;
	@XmlAttribute(name = "convention")
	protected String convention;
	@XmlAttribute(name = "min")
	protected String min;
	@XmlAttribute(name = "errorValue")
	protected Double errorValue;
	@XmlAttribute(name = "atomRefs3")
	protected List<String> atomRefs3;
	@XmlAttribute(name = "dictRef")
	protected String dictRef;
	@XmlAttribute(name = "max")
	protected String max;
	@XmlAttribute(name = "title")
	protected String title;
	@XmlAttribute(name = "units")
	protected AngleUnitsType units;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="summary"&gt;A non-signed angle.&lt;/h:div&gt;
	 * </pre>
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="description"&gt;
	 *                     Re-used by _angle_. Note that we also provide
	 *                     positiveAngleType (e.g. for cell angles) and torsionAngleType for _torsion_.
	 *                 &lt;/h:div&gt;
	 * </pre>
	 * 
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;h:div xmlns:h="http://www.w3.org/1999/xhtml" xmlns="http://www.xml-cml.org/schema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="example" href="nonNegativeAngleType.xml"/&gt;
	 * </pre>
	 * 
	 * 
	 * 
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * Gets the value of the errorBasis property.
	 * 
	 * @return possible object is {@link ErrorBasisType }
	 * 
	 */
	public ErrorBasisType getErrorBasis() {
		return errorBasis;
	}

	/**
	 * Sets the value of the errorBasis property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorBasisType }
	 * 
	 */
	public void setErrorBasis(ErrorBasisType value) {
		this.errorBasis = value;
	}

	/**
	 * Gets the value of the ref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Sets the value of the ref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRef(String value) {
		this.ref = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the convention property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConvention() {
		return convention;
	}

	/**
	 * Sets the value of the convention property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConvention(String value) {
		this.convention = value;
	}

	/**
	 * Gets the value of the min property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMin() {
		return min;
	}

	/**
	 * Sets the value of the min property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMin(String value) {
		this.min = value;
	}

	/**
	 * Gets the value of the errorValue property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getErrorValue() {
		return errorValue;
	}

	/**
	 * Sets the value of the errorValue property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setErrorValue(Double value) {
		this.errorValue = value;
	}

	/**
	 * Gets the value of the atomRefs3 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the atomRefs3 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAtomRefs3().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAtomRefs3() {
		if (atomRefs3 == null) {
			atomRefs3 = new ArrayList<String>();
		}
		return this.atomRefs3;
	}

	/**
	 * Gets the value of the dictRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDictRef() {
		return dictRef;
	}

	/**
	 * Sets the value of the dictRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDictRef(String value) {
		this.dictRef = value;
	}

	/**
	 * Gets the value of the max property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMax() {
		return max;
	}

	/**
	 * Sets the value of the max property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMax(String value) {
		this.max = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the units property.
	 * 
	 * @return possible object is {@link AngleUnitsType }
	 * 
	 */
	public AngleUnitsType getUnits() {
		return units;
	}

	/**
	 * Sets the value of the units property.
	 * 
	 * @param value
	 *            allowed object is {@link AngleUnitsType }
	 * 
	 */
	public void setUnits(AngleUnitsType value) {
		this.units = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
