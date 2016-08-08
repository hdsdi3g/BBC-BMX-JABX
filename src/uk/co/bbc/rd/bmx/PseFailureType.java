//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour pse_failure_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pse_failure_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}event_type">
 *       &lt;sequence>
 *         &lt;element name="red_flash" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="spatial_pattern" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="luminance_flash" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="extended_failure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pse_failure_type", propOrder = { "redFlash", "spatialPattern", "luminanceFlash", "extendedFailure" })
public class PseFailureType extends EventType {
	
	@XmlElement(name = "red_flash")
	protected Float redFlash;
	@XmlElement(name = "spatial_pattern")
	protected Float spatialPattern;
	@XmlElement(name = "luminance_flash")
	protected Float luminanceFlash;
	@XmlElement(name = "extended_failure")
	protected Boolean extendedFailure;
	
	/**
	 * Obtient la valeur de la propriété redFlash.
	 * @return
	 * 		possible object is
	 *         {@link Float }
	 */
	public Float getRedFlash() {
		return redFlash;
	}
	
	/**
	 * Définit la valeur de la propriété redFlash.
	 * @param value
	 *        allowed object is
	 *        {@link Float }
	 */
	public void setRedFlash(Float value) {
		this.redFlash = value;
	}
	
	/**
	 * Obtient la valeur de la propriété spatialPattern.
	 * @return
	 * 		possible object is
	 *         {@link Float }
	 */
	public Float getSpatialPattern() {
		return spatialPattern;
	}
	
	/**
	 * Définit la valeur de la propriété spatialPattern.
	 * @param value
	 *        allowed object is
	 *        {@link Float }
	 */
	public void setSpatialPattern(Float value) {
		this.spatialPattern = value;
	}
	
	/**
	 * Obtient la valeur de la propriété luminanceFlash.
	 * @return
	 * 		possible object is
	 *         {@link Float }
	 */
	public Float getLuminanceFlash() {
		return luminanceFlash;
	}
	
	/**
	 * Définit la valeur de la propriété luminanceFlash.
	 * @param value
	 *        allowed object is
	 *        {@link Float }
	 */
	public void setLuminanceFlash(Float value) {
		this.luminanceFlash = value;
	}
	
	/**
	 * Obtient la valeur de la propriété extendedFailure.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isExtendedFailure() {
		return extendedFailure;
	}
	
	/**
	 * Définit la valeur de la propriété extendedFailure.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setExtendedFailure(Boolean value) {
		this.extendedFailure = value;
	}
	
}
