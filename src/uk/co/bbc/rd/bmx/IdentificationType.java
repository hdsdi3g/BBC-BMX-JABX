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
 * Classe Java pour identification_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="identification_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="generation_uid" type="{http://bbc.co.uk/rd/bmx/201312}label_type"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_version" type="{http://bbc.co.uk/rd/bmx/201312}product_version_type" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_uid" type="{http://bbc.co.uk/rd/bmx/201312}label_type"/>
 *         &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="toolkit_version" type="{http://bbc.co.uk/rd/bmx/201312}product_version_type" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identification_type", propOrder = { "generationUid", "companyName", "productName", "productVersion", "versionString", "productUid", "modifiedDate", "toolkitVersion", "platform" })
public class IdentificationType extends ArrayElementType {
	
	@XmlElement(name = "generation_uid", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String generationUid;
	@XmlElement(name = "company_name", required = true)
	protected String companyName;
	@XmlElement(name = "product_name", required = true)
	protected String productName;
	@XmlElement(name = "product_version")
	protected String productVersion;
	@XmlElement(name = "version_string", required = true)
	protected String versionString;
	@XmlElement(name = "product_uid", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String productUid;
	@XmlElement(name = "modified_date", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar modifiedDate;
	@XmlElement(name = "toolkit_version")
	protected String toolkitVersion;
	protected String platform;
	
	/**
	 * Obtient la valeur de la propriété generationUid.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getGenerationUid() {
		return generationUid;
	}
	
	/**
	 * Définit la valeur de la propriété generationUid.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setGenerationUid(String value) {
		this.generationUid = value;
	}
	
	/**
	 * Obtient la valeur de la propriété companyName.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getCompanyName() {
		return companyName;
	}
	
	/**
	 * Définit la valeur de la propriété companyName.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setCompanyName(String value) {
		this.companyName = value;
	}
	
	/**
	 * Obtient la valeur de la propriété productName.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Définit la valeur de la propriété productName.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProductName(String value) {
		this.productName = value;
	}
	
	/**
	 * Obtient la valeur de la propriété productVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProductVersion() {
		return productVersion;
	}
	
	/**
	 * Définit la valeur de la propriété productVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProductVersion(String value) {
		this.productVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété versionString.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getVersionString() {
		return versionString;
	}
	
	/**
	 * Définit la valeur de la propriété versionString.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setVersionString(String value) {
		this.versionString = value;
	}
	
	/**
	 * Obtient la valeur de la propriété productUid.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProductUid() {
		return productUid;
	}
	
	/**
	 * Définit la valeur de la propriété productUid.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProductUid(String value) {
		this.productUid = value;
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
	
	/**
	 * Obtient la valeur de la propriété toolkitVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getToolkitVersion() {
		return toolkitVersion;
	}
	
	/**
	 * Définit la valeur de la propriété toolkitVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setToolkitVersion(String value) {
		this.toolkitVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété platform.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPlatform() {
		return platform;
	}
	
	/**
	 * Définit la valeur de la propriété platform.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPlatform(String value) {
		this.platform = value;
	}
	
}
