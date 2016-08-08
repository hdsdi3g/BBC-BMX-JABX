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
 * Classe Java pour crc32_result_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="crc32_result_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Passed"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Missing"/>
 *     &lt;enumeration value="Not_Checked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "crc32_result_type")
@XmlEnum
public enum Crc32ResultType {
	
	/**
	 * All track frames contained CRC-32 data and all checksums validated
	 */
	@XmlEnumValue("Passed") PASSED("Passed"),
	
	/**
	 * There are track frames that failed CRC-32 checksum validation
	 */
	@XmlEnumValue("Failed") FAILED("Failed"),
	
	/**
	 * The track is missing CRC-32 data
	 */
	@XmlEnumValue("Missing") MISSING("Missing"),
	
	/**
	 * CRC-32 checksum validation was not performed
	 */
	@XmlEnumValue("Not_Checked") NOT_CHECKED("Not_Checked");
	private final String value;
	
	Crc32ResultType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static Crc32ResultType fromValue(String v) {
		for (Crc32ResultType c : Crc32ResultType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
