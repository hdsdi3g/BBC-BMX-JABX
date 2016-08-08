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
 * Classe Java pour op_label_name.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="op_label_name">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPAtom"/>
 *     &lt;enumeration value="OP1A"/>
 *     &lt;enumeration value="OP1B"/>
 *     &lt;enumeration value="OP1C"/>
 *     &lt;enumeration value="OP2A"/>
 *     &lt;enumeration value="OP2B"/>
 *     &lt;enumeration value="OP2C"/>
 *     &lt;enumeration value="OP3A"/>
 *     &lt;enumeration value="OP3B"/>
 *     &lt;enumeration value="OP3C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "op_label_name")
@XmlEnum
public enum OpLabelName {
	
	@XmlEnumValue("OPAtom") OP_ATOM("OPAtom"), @XmlEnumValue("OP1A") OP_1_A("OP1A"), @XmlEnumValue("OP1B") OP_1_B("OP1B"), @XmlEnumValue("OP1C") OP_1_C("OP1C"), @XmlEnumValue("OP2A") OP_2_A(
			"OP2A"), @XmlEnumValue("OP2B") OP_2_B(
					"OP2B"), @XmlEnumValue("OP2C") OP_2_C("OP2C"), @XmlEnumValue("OP3A") OP_3_A("OP3A"), @XmlEnumValue("OP3B") OP_3_B("OP3B"), @XmlEnumValue("OP3C") OP_3_C("OP3C");
	private final String value;
	
	OpLabelName(String v) {
		value = v;
	}
	
	public String value() {
		return value;
	}
	
	public static OpLabelName fromValue(String v) {
		for (OpLabelName c : OpLabelName.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
