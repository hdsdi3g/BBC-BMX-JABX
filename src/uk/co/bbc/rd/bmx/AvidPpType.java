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
 * Classe Java pour avid_pp_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="avid_pp_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Tape"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="Recording"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "avid_pp_type")
@XmlEnum
public enum AvidPpType {
	
	@XmlEnumValue("Tape") TAPE("Tape"), @XmlEnumValue("Import") IMPORT("Import"), @XmlEnumValue("Recording") RECORDING("Recording");
	private final String value;
	
	AvidPpType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static AvidPpType fromValue(String v) {
		for (AvidPpType c : AvidPpType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
