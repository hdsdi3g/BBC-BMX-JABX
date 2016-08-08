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
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java pour package_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="package_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="package_uid" type="{http://bbc.co.uk/rd/bmx/201312}umid_type"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creation_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "package_type", propOrder = { "packageUid", "name", "creationDate", "modifiedDate" })
public class PackageType extends ArrayElementType {
	
	@XmlElement(name = "package_uid", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String packageUid;
	protected String name;
	@XmlElement(name = "creation_date", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar creationDate;
	@XmlElement(name = "modified_date", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar modifiedDate;
	
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
	 * Obtient la valeur de la propriété creationDate.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}
	
	/**
	 * Définit la valeur de la propriété creationDate.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setCreationDate(XMLGregorianCalendar value) {
		this.creationDate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété modifiedDate.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getModifiedDate() {
		return modifiedDate;
	}
	
	/**
	 * Définit la valeur de la propriété modifiedDate.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setModifiedDate(XMLGregorianCalendar value) {
		this.modifiedDate = value;
	}
	
}
