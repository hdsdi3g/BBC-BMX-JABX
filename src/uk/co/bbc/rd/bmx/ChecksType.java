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
 * Classe Java pour checks_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="checks_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is_complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="last_frame" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="no_app_issues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="app_crc32" type="{http://bbc.co.uk/rd/bmx/201312}crc32_result_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checks_type", propOrder = { "isComplete", "lastFrame", "noAppIssues", "appCrc32" })
public class ChecksType {
	
	@XmlElement(name = "is_complete")
	protected Boolean isComplete;
	@XmlElement(name = "last_frame")
	protected Boolean lastFrame;
	@XmlElement(name = "no_app_issues")
	protected Boolean noAppIssues;
	@XmlElement(name = "app_crc32")
	@XmlSchemaType(name = "string")
	protected Crc32ResultType appCrc32;
	
	/**
	 * Obtient la valeur de la propriété isComplete.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isIsComplete() {
		return isComplete;
	}
	
	/**
	 * Définit la valeur de la propriété isComplete.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setIsComplete(Boolean value) {
		this.isComplete = value;
	}
	
	/**
	 * Obtient la valeur de la propriété lastFrame.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isLastFrame() {
		return lastFrame;
	}
	
	/**
	 * Définit la valeur de la propriété lastFrame.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setLastFrame(Boolean value) {
		this.lastFrame = value;
	}
	
	/**
	 * Obtient la valeur de la propriété noAppIssues.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isNoAppIssues() {
		return noAppIssues;
	}
	
	/**
	 * Définit la valeur de la propriété noAppIssues.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setNoAppIssues(Boolean value) {
		this.noAppIssues = value;
	}
	
	/**
	 * Obtient la valeur de la propriété appCrc32.
	 * @return
	 * 		possible object is
	 *         {@link Crc32ResultType }
	 */
	public Crc32ResultType getAppCrc32() {
		return appCrc32;
	}
	
	/**
	 * Définit la valeur de la propriété appCrc32.
	 * @param value
	 *        allowed object is
	 *        {@link Crc32ResultType }
	 */
	public void setAppCrc32(Crc32ResultType value) {
		this.appCrc32 = value;
	}
	
}
