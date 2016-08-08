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
 * Classe Java pour start_timecodes_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="start_timecodes_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type" minOccurs="0"/>
 *         &lt;element name="material_origin" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type" minOccurs="0"/>
 *         &lt;element name="file_source" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type" minOccurs="0"/>
 *         &lt;element name="physical_source" type="{http://bbc.co.uk/rd/bmx/201312}physical_source_tc_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "start_timecodes_type", propOrder = { "material", "materialOrigin", "fileSource", "physicalSource" })
public class StartTimecodesType {
	
	protected TimecodeType material;
	@XmlElement(name = "material_origin")
	protected TimecodeType materialOrigin;
	@XmlElement(name = "file_source")
	protected TimecodeType fileSource;
	@XmlElement(name = "physical_source")
	protected PhysicalSourceTcType physicalSource;
	
	/**
	 * Obtient la valeur de la propriété material.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getMaterial() {
		return material;
	}
	
	/**
	 * Définit la valeur de la propriété material.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setMaterial(TimecodeType value) {
		this.material = value;
	}
	
	/**
	 * Obtient la valeur de la propriété materialOrigin.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getMaterialOrigin() {
		return materialOrigin;
	}
	
	/**
	 * Définit la valeur de la propriété materialOrigin.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setMaterialOrigin(TimecodeType value) {
		this.materialOrigin = value;
	}
	
	/**
	 * Obtient la valeur de la propriété fileSource.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getFileSource() {
		return fileSource;
	}
	
	/**
	 * Définit la valeur de la propriété fileSource.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setFileSource(TimecodeType value) {
		this.fileSource = value;
	}
	
	/**
	 * Obtient la valeur de la propriété physicalSource.
	 * @return
	 * 		possible object is
	 *         {@link PhysicalSourceTcType }
	 */
	public PhysicalSourceTcType getPhysicalSource() {
		return physicalSource;
	}
	
	/**
	 * Définit la valeur de la propriété physicalSource.
	 * @param value
	 *        allowed object is
	 *        {@link PhysicalSourceTcType }
	 */
	public void setPhysicalSource(PhysicalSourceTcType value) {
		this.physicalSource = value;
	}
	
}
