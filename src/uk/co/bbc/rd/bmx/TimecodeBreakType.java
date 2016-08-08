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
 * Classe Java pour timecode_break_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timecode_break_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}event_type">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://bbc.co.uk/rd/bmx/201312}timecode_break_type_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timecode_break_type", propOrder = { "type" })
public class TimecodeBreakType extends EventType {
	
	@XmlElement(required = true)
	@XmlSchemaType(name = "token")
	protected TimecodeBreakTypeType type;
	
	/**
	 * Obtient la valeur de la propriété type.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeBreakTypeType }
	 */
	public TimecodeBreakTypeType getType() {
		return type;
	}
	
	/**
	 * Définit la valeur de la propriété type.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeBreakTypeType }
	 */
	public void setType(TimecodeBreakTypeType value) {
		this.type = value;
	}
	
}
