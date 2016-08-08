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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour event_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="event_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://bbc.co.uk/rd/bmx/201312}position_type"/>
 *         &lt;element name="vitc" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type" minOccurs="0"/>
 *         &lt;element name="ltc" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_type", propOrder = { "position", "vitc", "ltc" })
@XmlSeeAlso({ PseFailureType.class, DigibetaDropoutType.class, TimecodeBreakType.class, VtrErrorType.class })
public class EventType extends ArrayElementType {
	
	@XmlElement(required = true)
	protected PositionType position;
	protected TimecodeType vitc;
	protected TimecodeType ltc;
	
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
	 * Obtient la valeur de la propriété vitc.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getVitc() {
		return vitc;
	}
	
	/**
	 * Définit la valeur de la propriété vitc.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setVitc(TimecodeType value) {
		this.vitc = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ltc.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getLtc() {
		return ltc;
	}
	
	/**
	 * Définit la valeur de la propriété ltc.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setLtc(TimecodeType value) {
		this.ltc = value;
	}
	
}
