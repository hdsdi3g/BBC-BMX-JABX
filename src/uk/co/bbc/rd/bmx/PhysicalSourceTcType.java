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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour physical_source_tc_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="physical_source_tc_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://bbc.co.uk/rd/bmx/201312>timecode_type">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physical_source_tc_type")
public class PhysicalSourceTcType extends TimecodeType {
	
	@XmlAttribute(name = "name")
	protected String name;
	
	/**
	 * Obtient la valeur de la propriété name.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Définit la valeur de la propriété name.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setName(String value) {
		this.name = value;
	}
	
}
