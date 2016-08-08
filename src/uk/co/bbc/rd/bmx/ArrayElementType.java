//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour array_element_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="array_element_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "array_element_type")
@XmlSeeAlso({ AncManifestElementType.class, LocatorType.class, SegmentType.class, VbiManifestElementType.class, TrackPackageType.class, TaggedValueType.class, PackageType.class, TrackType.class,
		FileType.class, EventType.class, IdentificationType.class })
public class ArrayElementType {
	
	@XmlAttribute(name = "index", required = true)
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger index;
	
	/**
	 * Obtient la valeur de la propriété index.
	 * @return
	 * 		possible object is
	 *         {@link BigInteger }
	 */
	public BigInteger getIndex() {
		return index;
	}
	
	/**
	 * Définit la valeur de la propriété index.
	 * @param value
	 *        allowed object is
	 *        {@link BigInteger }
	 */
	public void setIndex(BigInteger value) {
		this.index = value;
	}
	
}
