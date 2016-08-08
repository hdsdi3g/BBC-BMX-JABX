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
 * Classe Java pour enum_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="enum_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="vvalue" use="required" type="{http://bbc.co.uk/rd/bmx/201312}uint8_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enum_type", propOrder = { "value" })
@XmlSeeAlso({ AncSampleCodingType.class, AncWrappingTypeType.class, ColorSitingType.class, VbiWrappingTypeType.class, SignLanguageType.class, VbiSampleCodingType.class, AudioTrackLayoutType.class,
		AudioLoudnessStandardType.class, ThreeDTypeType.class, VtrErrorStatusType.class, AudioDescriptionTypeType.class, SignalStandardType.class, PsePassType.class, SigningPresentType.class,
		CaptionsTypeType.class, FrameLayoutType.class })
public class EnumType {
	
	@XmlValue
	protected String value;
	@XmlAttribute(name = "value", required = true)
	protected int int_value;
	
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
	 * Obtient la valeur de la propriété vvalue.
	 */
	public int getIntValue() {
		return int_value;
	}
	
	/**
	 * Définit la valeur de la propriété vvalue.
	 */
	public void setIntValue(int value) {
		this.int_value = value;
	}
	
}
