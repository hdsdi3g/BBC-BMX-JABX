//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour avid_color_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="avid_color_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Cyan"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Magenta"/>
 *     &lt;enumeration value="Black"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "avid_color_type")
@XmlEnum
public enum AvidColorType {
	
	@XmlEnumValue("White") WHITE("White"), @XmlEnumValue("Red") RED("Red"), @XmlEnumValue("Yellow") YELLOW("Yellow"), @XmlEnumValue("Green") GREEN("Green"), @XmlEnumValue("Cyan") CYAN(
			"Cyan"), @XmlEnumValue("Blue") BLUE("Blue"), @XmlEnumValue("Magenta") MAGENTA("Magenta"), @XmlEnumValue("Black") BLACK("Black");
	private final String value;
	
	AvidColorType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static AvidColorType fromValue(String v) {
		for (AvidColorType c : AvidColorType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
