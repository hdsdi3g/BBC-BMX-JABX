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
 * Classe Java pour vbi_descriptor_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vbi_descriptor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifest" type="{http://bbc.co.uk/rd/bmx/201312}vbi_manifest_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbi_descriptor_type", propOrder = { "manifest" })
public class VbiDescriptorType {
	
	@XmlElement(required = true)
	protected VbiManifestType manifest;
	
	/**
	 * Obtient la valeur de la propriété manifest.
	 * @return
	 * 		possible object is
	 *         {@link VbiManifestType }
	 */
	public VbiManifestType getManifest() {
		return manifest;
	}
	
	/**
	 * Définit la valeur de la propriété manifest.
	 * @param value
	 *        allowed object is
	 *        {@link VbiManifestType }
	 */
	public void setManifest(VbiManifestType value) {
		this.manifest = value;
	}
	
}
