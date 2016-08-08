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
 * Classe Java pour checksum_type_type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="checksum_type_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CRC32"/>
 *     &lt;enumeration value="MD5"/>
 *     &lt;enumeration value="SHA1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "checksum_type_type")
@XmlEnum
public enum ChecksumTypeType {
	
	@XmlEnumValue("CRC32") CRC_32("CRC32"), @XmlEnumValue("MD5") MD_5("MD5"), @XmlEnumValue("SHA1") SHA_1("SHA1");
	private final String value;
	
	ChecksumTypeType(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static ChecksumTypeType fromValue(String v) {
		for (ChecksumTypeType c : ChecksumTypeType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
