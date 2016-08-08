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
 * Classe Java pour application_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="application_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lib_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lib_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="build_timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scm_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application_type", propOrder = { "name", "libName", "libVersion", "buildTimestamp", "scmVersion" })
public class ApplicationType {
	
	@XmlElement(required = true)
	protected String name;
	@XmlElement(name = "lib_name", required = true)
	protected String libName;
	@XmlElement(name = "lib_version", required = true)
	protected String libVersion;
	@XmlElement(name = "build_timestamp", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar buildTimestamp;
	@XmlElement(name = "scm_version")
	protected String scmVersion;
	
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
	 * Obtient la valeur de la propriété libName.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getLibName() {
		return libName;
	}
	
	/**
	 * Définit la valeur de la propriété libName.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setLibName(String value) {
		this.libName = value;
	}
	
	/**
	 * Obtient la valeur de la propriété libVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getLibVersion() {
		return libVersion;
	}
	
	/**
	 * Définit la valeur de la propriété libVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setLibVersion(String value) {
		this.libVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété buildTimestamp.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getBuildTimestamp() {
		return buildTimestamp;
	}
	
	/**
	 * Définit la valeur de la propriété buildTimestamp.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setBuildTimestamp(XMLGregorianCalendar value) {
		this.buildTimestamp = value;
	}
	
	/**
	 * Obtient la valeur de la propriété scmVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getScmVersion() {
		return scmVersion;
	}
	
	/**
	 * Définit la valeur de la propriété scmVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setScmVersion(String value) {
		this.scmVersion = value;
	}
	
}
