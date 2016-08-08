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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour locator_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="locator_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://bbc.co.uk/rd/bmx/201312}position_type"/>
 *         &lt;element name="color" type="{http://bbc.co.uk/rd/bmx/201312}avid_color_type"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locator_type", propOrder = { "position", "color", "comment" })
public class LocatorType extends ArrayElementType {
	
	@XmlElement(required = true)
	protected PositionType position;
	@XmlElement(required = true)
	@XmlSchemaType(name = "token")
	protected AvidColorType color;
	protected String comment;
	
	/**
	 * Obtient la valeur de la propriété position.
	 * @return
	 * 		possible object is
	 *         {@link PositionType }
	 */
	public PositionType getPosition() {
		return position;
	}
	
	/**
	 * Définit la valeur de la propriété position.
	 * @param value
	 *        allowed object is
	 *        {@link PositionType }
	 */
	public void setPosition(PositionType value) {
		this.position = value;
	}
	
	/**
	 * Obtient la valeur de la propriété color.
	 * @return
	 * 		possible object is
	 *         {@link AvidColorType }
	 */
	public AvidColorType getColor() {
		return color;
	}
	
	/**
	 * Définit la valeur de la propriété color.
	 * @param value
	 *        allowed object is
	 *        {@link AvidColorType }
	 */
	public void setColor(AvidColorType value) {
		this.color = value;
	}
	
	/**
	 * Obtient la valeur de la propriété comment.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Définit la valeur de la propriété comment.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setComment(String value) {
		this.comment = value;
	}
	
}
