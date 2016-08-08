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
 * Classe Java pour avid_physical_package_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="avid_physical_package_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://bbc.co.uk/rd/bmx/201312}avid_pp_type"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="package_uid" type="{http://bbc.co.uk/rd/bmx/201312}umid_type"/>
 *         &lt;element name="network_locator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avid_physical_package_type", propOrder = { "type", "name", "packageUid", "networkLocator" })
public class AvidPhysicalPackageType {
	
	@XmlElement(required = true)
	@XmlSchemaType(name = "token")
	protected AvidPpType type;
	protected String name;
	@XmlElement(name = "package_uid", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String packageUid;
	@XmlElement(name = "network_locator")
	protected String networkLocator;
	
	/**
	 * Obtient la valeur de la propriété type.
	 * @return
	 * 		possible object is
	 *         {@link AvidPpType }
	 */
	public AvidPpType getType() {
		return type;
	}
	
	/**
	 * Définit la valeur de la propriété type.
	 * @param value
	 *        allowed object is
	 *        {@link AvidPpType }
	 */
	public void setType(AvidPpType value) {
		this.type = value;
	}
	
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
	
	/**
	 * Obtient la valeur de la propriété packageUid.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPackageUid() {
		return packageUid;
	}
	
	/**
	 * Définit la valeur de la propriété packageUid.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPackageUid(String value) {
		this.packageUid = value;
	}
	
	/**
	 * Obtient la valeur de la propriété networkLocator.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getNetworkLocator() {
		return networkLocator;
	}
	
	/**
	 * Définit la valeur de la propriété networkLocator.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setNetworkLocator(String value) {
		this.networkLocator = value;
	}
	
}
