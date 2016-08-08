//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="application" type="{http://bbc.co.uk/rd/bmx/201312}application_type"/>
 *         &lt;element name="files" type="{http://bbc.co.uk/rd/bmx/201312}files_type"/>
 *         &lt;element name="clip" type="{http://bbc.co.uk/rd/bmx/201312}clip_type"/>
 *         &lt;element name="checks" type="{http://bbc.co.uk/rd/bmx/201312}checks_type" minOccurs="0"/>
 *         &lt;element name="log_messages" type="{http://bbc.co.uk/rd/bmx/201312}log_messages_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://bbc.co.uk/rd/bmx/201312}version_type" />
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "application", "files", "clip", "checks", "logMessages" })
@XmlRootElement(name = "bmx")
public class Bmx {
	
	@XmlElement(required = true)
	protected ApplicationType application;
	@XmlElement(required = true)
	protected FilesType files;
	@XmlElement(required = true)
	protected ClipType clip;
	protected ChecksType checks;
	@XmlElement(name = "log_messages")
	protected LogMessagesType logMessages;
	@XmlAttribute(name = "version", required = true)
	protected String version;
	@XmlAttribute(name = "created", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar created;
	
	/**
	 * Obtient la valeur de la propriété application.
	 * @return
	 * 		possible object is
	 *         {@link ApplicationType }
	 */
	public ApplicationType getApplication() {
		return application;
	}
	
	/**
	 * Définit la valeur de la propriété application.
	 * @param value
	 *        allowed object is
	 *        {@link ApplicationType }
	 */
	public void setApplication(ApplicationType value) {
		this.application = value;
	}
	
	/**
	 * Obtient la valeur de la propriété files.
	 * @return
	 * 		possible object is
	 *         {@link FilesType }
	 */
	public FilesType getFiles() {
		return files;
	}
	
	/**
	 * Définit la valeur de la propriété files.
	 * @param value
	 *        allowed object is
	 *        {@link FilesType }
	 */
	public void setFiles(FilesType value) {
		this.files = value;
	}
	
	/**
	 * Obtient la valeur de la propriété clip.
	 * @return
	 * 		possible object is
	 *         {@link ClipType }
	 */
	public ClipType getClip() {
		return clip;
	}
	
	/**
	 * Définit la valeur de la propriété clip.
	 * @param value
	 *        allowed object is
	 *        {@link ClipType }
	 */
	public void setClip(ClipType value) {
		this.clip = value;
	}
	
	/**
	 * Obtient la valeur de la propriété checks.
	 * @return
	 * 		possible object is
	 *         {@link ChecksType }
	 */
	public ChecksType getChecks() {
		return checks;
	}
	
	/**
	 * Définit la valeur de la propriété checks.
	 * @param value
	 *        allowed object is
	 *        {@link ChecksType }
	 */
	public void setChecks(ChecksType value) {
		this.checks = value;
	}
	
	/**
	 * Obtient la valeur de la propriété logMessages.
	 * @return
	 * 		possible object is
	 *         {@link LogMessagesType }
	 */
	public LogMessagesType getLogMessages() {
		return logMessages;
	}
	
	/**
	 * Définit la valeur de la propriété logMessages.
	 * @param value
	 *        allowed object is
	 *        {@link LogMessagesType }
	 */
	public void setLogMessages(LogMessagesType value) {
		this.logMessages = value;
	}
	
	/**
	 * Obtient la valeur de la propriété version.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * Définit la valeur de la propriété version.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setVersion(String value) {
		this.version = value;
	}
	
	/**
	 * Obtient la valeur de la propriété created.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getCreated() {
		return created;
	}
	
	/**
	 * Définit la valeur de la propriété created.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setCreated(XMLGregorianCalendar value) {
		this.created = value;
	}
	
}
