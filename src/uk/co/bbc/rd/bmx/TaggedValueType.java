//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour tagged_value_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tagged_value_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attributes" type="{http://bbc.co.uk/rd/bmx/201312}attributes_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagged_value_type", propOrder = { "name", "value", "attributes" })
public class TaggedValueType extends ArrayElementType {
	
	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String value;
	protected AttributesType attributes;
	
	/**
	 * Obtient la valeur de la propriété name.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Définit la valeur de la propriété name.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setName(String value) {
		this.name = value;
	}
	
	/**
	 * Obtient la valeur de la propriété value.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Définit la valeur de la propriété value.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Obtient la valeur de la propriété attributes.
	 * @return
	 * 		possible object is
	 *         {@link AttributesType }
	 */
	public AttributesType getAttributes() {
		return attributes;
	}
	
	/**
	 * Définit la valeur de la propriété attributes.
	 * @param value
	 *        allowed object is
	 *        {@link AttributesType }
	 */
	public void setAttributes(AttributesType value) {
		this.attributes = value;
	}
	
}
