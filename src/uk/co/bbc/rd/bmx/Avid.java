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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="project_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolution_id" type="{http://bbc.co.uk/rd/bmx/201312}int32_type" minOccurs="0"/>
 *         &lt;element name="physical_package" type="{http://bbc.co.uk/rd/bmx/201312}avid_physical_package_type" minOccurs="0"/>
 *         &lt;element name="user_comments" type="{http://bbc.co.uk/rd/bmx/201312}user_comments_type" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://bbc.co.uk/rd/bmx/201312}attributes_type" minOccurs="0"/>
 *         &lt;element name="locators" type="{http://bbc.co.uk/rd/bmx/201312}locators_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "projectName", "resolutionId", "physicalPackage", "userComments", "attributes", "locators" })
@XmlRootElement(name = "avid")
public class Avid {
	
	@XmlElement(name = "project_name")
	protected String projectName;
	@XmlElement(name = "resolution_id")
	@XmlSchemaType(name = "integer")
	protected Integer resolutionId;
	@XmlElement(name = "physical_package")
	protected AvidPhysicalPackageType physicalPackage;
	@XmlElement(name = "user_comments")
	protected UserCommentsType userComments;
	protected AttributesType attributes;
	protected LocatorsType locators;
	
	/**
	 * Obtient la valeur de la propriété projectName.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * Définit la valeur de la propriété projectName.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProjectName(String value) {
		this.projectName = value;
	}
	
	/**
	 * Obtient la valeur de la propriété resolutionId.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getResolutionId() {
		return resolutionId;
	}
	
	/**
	 * Définit la valeur de la propriété resolutionId.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setResolutionId(Integer value) {
		this.resolutionId = value;
	}
	
	/**
	 * Obtient la valeur de la propriété physicalPackage.
	 * @return
	 * 		possible object is
	 *         {@link AvidPhysicalPackageType }
	 */
	public AvidPhysicalPackageType getPhysicalPackage() {
		return physicalPackage;
	}
	
	/**
	 * Définit la valeur de la propriété physicalPackage.
	 * @param value
	 *        allowed object is
	 *        {@link AvidPhysicalPackageType }
	 */
	public void setPhysicalPackage(AvidPhysicalPackageType value) {
		this.physicalPackage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété userComments.
	 * @return
	 * 		possible object is
	 *         {@link UserCommentsType }
	 */
	public UserCommentsType getUserComments() {
		return userComments;
	}
	
	/**
	 * Définit la valeur de la propriété userComments.
	 * @param value
	 *        allowed object is
	 *        {@link UserCommentsType }
	 */
	public void setUserComments(UserCommentsType value) {
		this.userComments = value;
	}
	
	/**
	 * Obtient la valeur de la propriété attributes.
	 * @return
	 * 		possible object is
	 *         {@link AttributesType }
	 */
	public AttributesType getAttributes() {
		return attributes;
	}
	
	/**
	 * Définit la valeur de la propriété attributes.
	 * @param value
	 *        allowed object is
	 *        {@link AttributesType }
	 */
	public void setAttributes(AttributesType value) {
		this.attributes = value;
	}
	
	/**
	 * Obtient la valeur de la propriété locators.
	 * @return
	 * 		possible object is
	 *         {@link LocatorsType }
	 */
	public LocatorsType getLocators() {
		return locators;
	}
	
	/**
	 * Définit la valeur de la propriété locators.
	 * @param value
	 *        allowed object is
	 *        {@link LocatorsType }
	 */
	public void setLocators(LocatorsType value) {
		this.locators = value;
	}
	
}
