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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="core" type="{http://bbc.co.uk/rd/bmx/201312}core_type" minOccurs="0"/>
 *         &lt;element name="uk_dpp" type="{http://bbc.co.uk/rd/bmx/201312}uk_dpp_type" minOccurs="0"/>
 *         &lt;element name="segmentation" type="{http://bbc.co.uk/rd/bmx/201312}segmentation_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "core", "ukDpp", "segmentation" })
@XmlRootElement(name = "as11")
public class As11 {
	
	protected CoreType core;
	@XmlElement(name = "uk_dpp")
	protected UkDppType ukDpp;
	protected SegmentationType segmentation;
	
	/**
	 * Obtient la valeur de la propriété core.
	 * @return
	 * 		possible object is
	 *         {@link CoreType }
	 */
	public CoreType getCore() {
		return core;
	}
	
	/**
	 * Définit la valeur de la propriété core.
	 * @param value
	 *        allowed object is
	 *        {@link CoreType }
	 */
	public void setCore(CoreType value) {
		this.core = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ukDpp.
	 * @return
	 * 		possible object is
	 *         {@link UkDppType }
	 */
	public UkDppType getUkDpp() {
		return ukDpp;
	}
	
	/**
	 * Définit la valeur de la propriété ukDpp.
	 * @param value
	 *        allowed object is
	 *        {@link UkDppType }
	 */
	public void setUkDpp(UkDppType value) {
		this.ukDpp = value;
	}
	
	/**
	 * Obtient la valeur de la propriété segmentation.
	 * @return
	 * 		possible object is
	 *         {@link SegmentationType }
	 */
	public SegmentationType getSegmentation() {
		return segmentation;
	}
	
	/**
	 * Définit la valeur de la propriété segmentation.
	 * @param value
	 *        allowed object is
	 *        {@link SegmentationType }
	 */
	public void setSegmentation(SegmentationType value) {
		this.segmentation = value;
	}
	
}
