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
 * Classe Java pour essence_kind_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="essence_kind_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Picture"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Timecode"/>
 *     &lt;enumeration value="Data"/>
 *     &lt;enumeration value="Descriptive_Metadata"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "essence_kind_type")
@XmlEnum
public enum EssenceKindType {
	
	@XmlEnumValue("Picture") PICTURE("Picture"), @XmlEnumValue("Sound") SOUND("Sound"), @XmlEnumValue("Timecode") TIMECODE("Timecode"), @XmlEnumValue("Data") DATA(
			"Data"), @XmlEnumValue("Descriptive_Metadata") DESCRIPTIVE_METADATA("Descriptive_Metadata");
	private final String value;
	
	EssenceKindType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static EssenceKindType fromValue(String v) {
		for (EssenceKindType c : EssenceKindType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
