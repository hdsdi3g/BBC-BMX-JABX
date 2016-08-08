//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour file_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="file_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="file_uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="checksum" type="{http://bbc.co.uk/rd/bmx/201312}checksum_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mxf_version" type="{http://bbc.co.uk/rd/bmx/201312}version_type"/>
 *         &lt;element name="op_label" type="{http://bbc.co.uk/rd/bmx/201312}op_label_type"/>
 *         &lt;element name="frame_wrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="identifications" type="{http://bbc.co.uk/rd/bmx/201312}identifications_type"/>
 *         &lt;element name="material_packages" type="{http://bbc.co.uk/rd/bmx/201312}material_packages_type" minOccurs="0"/>
 *         &lt;element name="file_source_packages" type="{http://bbc.co.uk/rd/bmx/201312}file_source_packages_type" minOccurs="0"/>
 *         &lt;element name="physical_source_packages" type="{http://bbc.co.uk/rd/bmx/201312}physical_source_packages_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file_type", propOrder = { "fileUri", "checksum", "mxfVersion", "opLabel", "frameWrapped", "identifications", "materialPackages", "fileSourcePackages", "physicalSourcePackages" })
public class FileType extends ArrayElementType {
	
	@XmlElement(name = "file_uri", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String fileUri;
	protected List<ChecksumType> checksum;
	@XmlElement(name = "mxf_version", required = true)
	protected String mxfVersion;
	@XmlElement(name = "op_label", required = true)
	protected OpLabelType opLabel;
	@XmlElement(name = "frame_wrapped")
	protected Boolean frameWrapped;
	@XmlElement(required = true)
	protected IdentificationsType identifications;
	@XmlElement(name = "material_packages")
	protected MaterialPackagesType materialPackages;
	@XmlElement(name = "file_source_packages")
	protected FileSourcePackagesType fileSourcePackages;
	@XmlElement(name = "physical_source_packages")
	protected PhysicalSourcePackagesType physicalSourcePackages;
	
	/**
	 * Obtient la valeur de la propriété fileUri.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getFileUri() {
		return fileUri;
	}
	
	/**
	 * Définit la valeur de la propriété fileUri.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setFileUri(String value) {
		this.fileUri = value;
	}
	
	/**
	 * Gets the value of the checksum property.
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the checksum property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChecksum().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ChecksumType }
	 */
	public List<ChecksumType> getChecksum() {
		if (checksum == null) {
			checksum = new ArrayList<ChecksumType>();
		}
		return this.checksum;
	}
	
	/**
	 * Obtient la valeur de la propriété mxfVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getMxfVersion() {
		return mxfVersion;
	}
	
	/**
	 * Définit la valeur de la propriété mxfVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setMxfVersion(String value) {
		this.mxfVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété opLabel.
	 * @return
	 * 		possible object is
	 *         {@link OpLabelType }
	 */
	public OpLabelType getOpLabel() {
		return opLabel;
	}
	
	/**
	 * Définit la valeur de la propriété opLabel.
	 * @param value
	 *        allowed object is
	 *        {@link OpLabelType }
	 */
	public void setOpLabel(OpLabelType value) {
		this.opLabel = value;
	}
	
	/**
	 * Obtient la valeur de la propriété frameWrapped.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isFrameWrapped() {
		return frameWrapped;
	}
	
	/**
	 * Définit la valeur de la propriété frameWrapped.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setFrameWrapped(Boolean value) {
		this.frameWrapped = value;
	}
	
	/**
	 * Obtient la valeur de la propriété identifications.
	 * @return
	 * 		possible object is
	 *         {@link IdentificationsType }
	 */
	public IdentificationsType getIdentifications() {
		return identifications;
	}
	
	/**
	 * Définit la valeur de la propriété identifications.
	 * @param value
	 *        allowed object is
	 *        {@link IdentificationsType }
	 */
	public void setIdentifications(IdentificationsType value) {
		this.identifications = value;
	}
	
	/**
	 * Obtient la valeur de la propriété materialPackages.
	 * @return
	 * 		possible object is
	 *         {@link MaterialPackagesType }
	 */
	public MaterialPackagesType getMaterialPackages() {
		return materialPackages;
	}
	
	/**
	 * Définit la valeur de la propriété materialPackages.
	 * @param value
	 *        allowed object is
	 *        {@link MaterialPackagesType }
	 */
	public void setMaterialPackages(MaterialPackagesType value) {
		this.materialPackages = value;
	}
	
	/**
	 * Obtient la valeur de la propriété fileSourcePackages.
	 * @return
	 * 		possible object is
	 *         {@link FileSourcePackagesType }
	 */
	public FileSourcePackagesType getFileSourcePackages() {
		return fileSourcePackages;
	}
	
	/**
	 * Définit la valeur de la propriété fileSourcePackages.
	 * @param value
	 *        allowed object is
	 *        {@link FileSourcePackagesType }
	 */
	public void setFileSourcePackages(FileSourcePackagesType value) {
		this.fileSourcePackages = value;
	}
	
	/**
	 * Obtient la valeur de la propriété physicalSourcePackages.
	 * @return
	 * 		possible object is
	 *         {@link PhysicalSourcePackagesType }
	 */
	public PhysicalSourcePackagesType getPhysicalSourcePackages() {
		return physicalSourcePackages;
	}
	
	/**
	 * Définit la valeur de la propriété physicalSourcePackages.
	 * @param value
	 *        allowed object is
	 *        {@link PhysicalSourcePackagesType }
	 */
	public void setPhysicalSourcePackages(PhysicalSourcePackagesType value) {
		this.physicalSourcePackages = value;
	}
	
}
