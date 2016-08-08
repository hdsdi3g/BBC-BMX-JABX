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
 * Classe Java pour did_type_1_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="did_type_1_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="did" type="{http://bbc.co.uk/rd/bmx/201312}hex_uint8_type"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "did_type_1_type", propOrder = { "did", "description" })
public class DidType1Type {
	
	@XmlElement(required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String did;
	protected String description;
	
	/**
	 * Obtient la valeur de la propriété did.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getDid() {
		return did;
	}
	
	/**
	 * Définit la valeur de la propriété did.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setDid(String value) {
		this.did = value;
	}
	
	/**
	 * Obtient la valeur de la propriété description.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Définit la valeur de la propriété description.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setDescription(String value) {
		this.description = value;
	}
	
}
