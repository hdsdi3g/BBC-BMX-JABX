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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour cdci_descriptor_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cdci_descriptor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="component_depth" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="horiz_subsamp" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="vert_subsamp" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="color_siting" type="{http://bbc.co.uk/rd/bmx/201312}color_siting_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cdci_descriptor_type", propOrder = { "componentDepth", "horizSubsamp", "vertSubsamp", "colorSiting" })
public class CdciDescriptorType {
	
	@XmlElement(name = "component_depth")
	@XmlSchemaType(name = "integer")
	protected long componentDepth;
	@XmlElement(name = "horiz_subsamp")
	@XmlSchemaType(name = "integer")
	protected long horizSubsamp;
	@XmlElement(name = "vert_subsamp")
	@XmlSchemaType(name = "integer")
	protected long vertSubsamp;
	@XmlElement(name = "color_siting", required = true)
	protected ColorSitingType colorSiting;
	
	/**
	 * Obtient la valeur de la propriété componentDepth.
	 */
	public long getComponentDepth() {
		return componentDepth;
	}
	
	/**
	 * Définit la valeur de la propriété componentDepth.
	 */
	public void setComponentDepth(long value) {
		this.componentDepth = value;
	}
	
	/**
	 * Obtient la valeur de la propriété horizSubsamp.
	 */
	public long getHorizSubsamp() {
		return horizSubsamp;
	}
	
	/**
	 * Définit la valeur de la propriété horizSubsamp.
	 */
	public void setHorizSubsamp(long value) {
		this.horizSubsamp = value;
	}
	
	/**
	 * Obtient la valeur de la propriété vertSubsamp.
	 */
	public long getVertSubsamp() {
		return vertSubsamp;
	}
	
	/**
	 * Définit la valeur de la propriété vertSubsamp.
	 */
	public void setVertSubsamp(long value) {
		this.vertSubsamp = value;
	}
	
	/**
	 * Obtient la valeur de la propriété colorSiting.
	 * @return
	 * 		possible object is
	 *         {@link ColorSitingType }
	 */
	public ColorSitingType getColorSiting() {
		return colorSiting;
	}
	
	/**
	 * Définit la valeur de la propriété colorSiting.
	 * @param value
	 *        allowed object is
	 *        {@link ColorSitingType }
	 */
	public void setColorSiting(ColorSitingType value) {
		this.colorSiting = value;
	}
	
}
