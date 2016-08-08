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
 * Classe Java pour data_descriptor_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="data_descriptor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="vbi_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}vbi_descriptor_type"/>
 *         &lt;element name="anc_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}anc_descriptor_type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_descriptor_type", propOrder = { "vbiDescriptor", "ancDescriptor" })
public class DataDescriptorType {
	
	@XmlElement(name = "vbi_descriptor")
	protected VbiDescriptorType vbiDescriptor;
	@XmlElement(name = "anc_descriptor")
	protected AncDescriptorType ancDescriptor;
	
	/**
	 * Obtient la valeur de la propriété vbiDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link VbiDescriptorType }
	 */
	public VbiDescriptorType getVbiDescriptor() {
		return vbiDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété vbiDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link VbiDescriptorType }
	 */
	public void setVbiDescriptor(VbiDescriptorType value) {
		this.vbiDescriptor = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ancDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link AncDescriptorType }
	 */
	public AncDescriptorType getAncDescriptor() {
		return ancDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété ancDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link AncDescriptorType }
	 */
	public void setAncDescriptor(AncDescriptorType value) {
		this.ancDescriptor = value;
	}
	
}
