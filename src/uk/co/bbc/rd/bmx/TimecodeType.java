//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Classe Java pour timecode_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timecode_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://bbc.co.uk/rd/bmx/201312>timecode_string_type">
 *       &lt;attribute name="rate" type="{http://bbc.co.uk/rd/bmx/201312}rational_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timecode_type", propOrder = { "value" })
@XmlSeeAlso({ PhysicalSourceTcType.class })
public class TimecodeType {
	
	@XmlValue
	protected String value;
	@XmlAttribute(name = "rate")
	protected String rate;
	
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
	 * Obtient la valeur de la propriété rate.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getRate() {
		return rate;
	}
	
	/**
	 * Définit la valeur de la propriété rate.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setRate(String value) {
		this.rate = value;
	}
	
}
