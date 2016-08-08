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
 * Classe Java pour track_package_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="track_package_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://bbc.co.uk/rd/bmx/201312}material_package_ref_type"/>
 *         &lt;element name="file_source" type="{http://bbc.co.uk/rd/bmx/201312}file_source_package_ref_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track_package_type", propOrder = { "material", "fileSource" })
public class TrackPackageType extends ArrayElementType {
	
	@XmlElement(required = true)
	protected MaterialPackageRefType material;
	@XmlElement(name = "file_source", required = true)
	protected FileSourcePackageRefType fileSource;
	
	/**
	 * Obtient la valeur de la propriété material.
	 * @return
	 * 		possible object is
	 *         {@link MaterialPackageRefType }
	 */
	public MaterialPackageRefType getMaterial() {
		return material;
	}
	
	/**
	 * Définit la valeur de la propriété material.
	 * @param value
	 *        allowed object is
	 *        {@link MaterialPackageRefType }
	 */
	public void setMaterial(MaterialPackageRefType value) {
		this.material = value;
	}
	
	/**
	 * Obtient la valeur de la propriété fileSource.
	 * @return
	 * 		possible object is
	 *         {@link FileSourcePackageRefType }
	 */
	public FileSourcePackageRefType getFileSource() {
		return fileSource;
	}
	
	/**
	 * Définit la valeur de la propriété fileSource.
	 * @param value
	 *        allowed object is
	 *        {@link FileSourcePackageRefType }
	 */
	public void setFileSource(FileSourcePackageRefType value) {
		this.fileSource = value;
	}
	
}
