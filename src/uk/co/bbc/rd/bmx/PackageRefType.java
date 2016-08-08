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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour package_ref_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="package_ref_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="package_uid" type="{http://bbc.co.uk/rd/bmx/201312}umid_type"/>
 *         &lt;element name="track_id" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="track_number" type="{http://bbc.co.uk/rd/bmx/201312}hex_uint32_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "package_ref_type", propOrder = { "packageUid", "trackId", "trackNumber" })
@XmlSeeAlso({ FileSourcePackageRefType.class, MaterialPackageRefType.class })
public class PackageRefType {
	
	@XmlElement(name = "package_uid", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String packageUid;
	@XmlElement(name = "track_id")
	@XmlSchemaType(name = "integer")
	protected long trackId;
	@XmlElement(name = "track_number", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String trackNumber;
	
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
	 * Obtient la valeur de la propriété trackId.
	 */
	public long getTrackId() {
		return trackId;
	}
	
	/**
	 * Définit la valeur de la propriété trackId.
	 */
	public void setTrackId(long value) {
		this.trackId = value;
	}
	
	/**
	 * Obtient la valeur de la propriété trackNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getTrackNumber() {
		return trackNumber;
	}
	
	/**
	 * Définit la valeur de la propriété trackNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setTrackNumber(String value) {
		this.trackNumber = value;
	}
	
}
