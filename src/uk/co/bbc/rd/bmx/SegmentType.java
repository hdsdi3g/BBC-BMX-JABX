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
 * Classe Java pour segment_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="segment_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="part_number" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="part_total" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="som" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type"/>
 *         &lt;element name="duration" type="{http://bbc.co.uk/rd/bmx/201312}duration_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segment_type", propOrder = { "partNumber", "partTotal", "som", "duration" })
public class SegmentType extends ArrayElementType {
	
	@XmlElement(name = "part_number")
	@XmlSchemaType(name = "integer")
	protected int partNumber;
	@XmlElement(name = "part_total")
	@XmlSchemaType(name = "integer")
	protected int partTotal;
	@XmlElement(required = true)
	protected TimecodeType som;
	@XmlElement(required = true)
	protected DurationType duration;
	
	/**
	 * Obtient la valeur de la propriété partNumber.
	 */
	public int getPartNumber() {
		return partNumber;
	}
	
	/**
	 * Définit la valeur de la propriété partNumber.
	 */
	public void setPartNumber(int value) {
		this.partNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété partTotal.
	 */
	public int getPartTotal() {
		return partTotal;
	}
	
	/**
	 * Définit la valeur de la propriété partTotal.
	 */
	public void setPartTotal(int value) {
		this.partTotal = value;
	}
	
	/**
	 * Obtient la valeur de la propriété som.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getSom() {
		return som;
	}
	
	/**
	 * Définit la valeur de la propriété som.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setSom(TimecodeType value) {
		this.som = value;
	}
	
	/**
	 * Obtient la valeur de la propriété duration.
	 * @return
	 * 		possible object is
	 *         {@link DurationType }
	 */
	public DurationType getDuration() {
		return duration;
	}
	
	/**
	 * Définit la valeur de la propriété duration.
	 * @param value
	 *        allowed object is
	 *        {@link DurationType }
	 */
	public void setDuration(DurationType value) {
		this.duration = value;
	}
	
}
