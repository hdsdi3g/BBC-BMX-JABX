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
 * Classe Java pour array_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="array_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "array_type")
@XmlSeeAlso({ FilesType.class, LogMessagesType.class, UserCommentsType.class, AttributesType.class, LocatorsType.class, SegmentationType.class, VbiManifestType.class, DigibetaDropoutsType.class,
		AncManifestType.class, MaterialPackagesType.class, FileSourcePackagesType.class, TimecodeBreaksType.class, VtrErrorsType.class, TrackPackagesType.class, PhysicalSourcePackagesType.class,
		PseFailuresType.class, TracksType.class, IdentificationsType.class })
public class ArrayType {
	
	@XmlAttribute(name = "size", required = true)
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger size;
	
	/**
	 * Obtient la valeur de la propriété size.
	 * @return
	 * 		possible object is
	 *         {@link BigInteger }
	 */
	public BigInteger getSize() {
		return size;
	}
	
	/**
	 * Définit la valeur de la propriété size.
	 * @param value
	 *        allowed object is
	 *        {@link BigInteger }
	 */
	public void setSize(BigInteger value) {
		this.size = value;
	}
	
}
