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
 * Classe Java pour track_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="track_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="essence_kind" type="{http://bbc.co.uk/rd/bmx/201312}essence_kind_type"/>
 *         &lt;element name="essence_type" type="{http://bbc.co.uk/rd/bmx/201312}essence_type_type"/>
 *         &lt;element name="ec_label" type="{http://bbc.co.uk/rd/bmx/201312}label_type"/>
 *         &lt;element name="edit_rate" type="{http://bbc.co.uk/rd/bmx/201312}rational_type"/>
 *         &lt;element name="duration" type="{http://bbc.co.uk/rd/bmx/201312}duration_type"/>
 *         &lt;element name="lead_filler_offset" type="{http://bbc.co.uk/rd/bmx/201312}position_type" minOccurs="0"/>
 *         &lt;element name="precharge" type="{http://bbc.co.uk/rd/bmx/201312}int16_type" minOccurs="0"/>
 *         &lt;element name="rollout" type="{http://bbc.co.uk/rd/bmx/201312}int16_type" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://bbc.co.uk/rd/bmx/201312}checksum_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="crc32_check" type="{http://bbc.co.uk/rd/bmx/201312}crc32_check_type" minOccurs="0"/>
 *         &lt;element name="packages" type="{http://bbc.co.uk/rd/bmx/201312}track_packages_type"/>
 *         &lt;element name="picture_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}picture_descriptor_type" minOccurs="0"/>
 *         &lt;element name="sound_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}sound_descriptor_type" minOccurs="0"/>
 *         &lt;element name="data_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}data_descriptor_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track_type", propOrder = { "essenceKind", "essenceType", "ecLabel", "editRate", "duration", "leadFillerOffset", "precharge", "rollout", "checksum", "crc32Check", "packages",
		"pictureDescriptor", "soundDescriptor", "dataDescriptor" })
public class TrackType extends ArrayElementType {
	
	@XmlElement(name = "essence_kind", required = true)
	@XmlSchemaType(name = "token")
	protected EssenceKindType essenceKind;
	@XmlElement(name = "essence_type", required = true)
	@XmlSchemaType(name = "token")
	protected EssenceTypeType essenceType;
	@XmlElement(name = "ec_label", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String ecLabel;
	@XmlElement(name = "edit_rate", required = true)
	protected String editRate;
	@XmlElement(required = true)
	protected DurationType duration;
	@XmlElement(name = "lead_filler_offset")
	protected PositionType leadFillerOffset;
	@XmlSchemaType(name = "integer")
	protected Integer precharge;
	@XmlSchemaType(name = "integer")
	protected Integer rollout;
	protected List<ChecksumType> checksum;
	@XmlElement(name = "crc32_check")
	protected Crc32CheckType crc32Check;
	@XmlElement(required = true)
	protected TrackPackagesType packages;
	@XmlElement(name = "picture_descriptor")
	protected PictureDescriptorType pictureDescriptor;
	@XmlElement(name = "sound_descriptor")
	protected SoundDescriptorType soundDescriptor;
	@XmlElement(name = "data_descriptor")
	protected DataDescriptorType dataDescriptor;
	
	/**
	 * Obtient la valeur de la propriété essenceKind.
	 * @return
	 * 		possible object is
	 *         {@link EssenceKindType }
	 */
	public EssenceKindType getEssenceKind() {
		return essenceKind;
	}
	
	/**
	 * Définit la valeur de la propriété essenceKind.
	 * @param value
	 *        allowed object is
	 *        {@link EssenceKindType }
	 */
	public void setEssenceKind(EssenceKindType value) {
		this.essenceKind = value;
	}
	
	/**
	 * Obtient la valeur de la propriété essenceType.
	 * @return
	 * 		possible object is
	 *         {@link EssenceTypeType }
	 */
	public EssenceTypeType getEssenceType() {
		return essenceType;
	}
	
	/**
	 * Définit la valeur de la propriété essenceType.
	 * @param value
	 *        allowed object is
	 *        {@link EssenceTypeType }
	 */
	public void setEssenceType(EssenceTypeType value) {
		this.essenceType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ecLabel.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getEcLabel() {
		return ecLabel;
	}
	
	/**
	 * Définit la valeur de la propriété ecLabel.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setEcLabel(String value) {
		this.ecLabel = value;
	}
	
	/**
	 * Obtient la valeur de la propriété editRate.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getEditRate() {
		return editRate;
	}
	
	/**
	 * Définit la valeur de la propriété editRate.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setEditRate(String value) {
		this.editRate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété duration.
	 * @return
	 * 		possible object is
	 *         {@link DurationType }
	 */
	public DurationType getDuration() {
		return duration;
	}
	
	/**
	 * Définit la valeur de la propriété duration.
	 * @param value
	 *        allowed object is
	 *        {@link DurationType }
	 */
	public void setDuration(DurationType value) {
		this.duration = value;
	}
	
	/**
	 * Obtient la valeur de la propriété leadFillerOffset.
	 * @return
	 * 		possible object is
	 *         {@link PositionType }
	 */
	public PositionType getLeadFillerOffset() {
		return leadFillerOffset;
	}
	
	/**
	 * Définit la valeur de la propriété leadFillerOffset.
	 * @param value
	 *        allowed object is
	 *        {@link PositionType }
	 */
	public void setLeadFillerOffset(PositionType value) {
		this.leadFillerOffset = value;
	}
	
	/**
	 * Obtient la valeur de la propriété precharge.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getPrecharge() {
		return precharge;
	}
	
	/**
	 * Définit la valeur de la propriété precharge.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setPrecharge(Integer value) {
		this.precharge = value;
	}
	
	/**
	 * Obtient la valeur de la propriété rollout.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getRollout() {
		return rollout;
	}
	
	/**
	 * Définit la valeur de la propriété rollout.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setRollout(Integer value) {
		this.rollout = value;
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
	 * Obtient la valeur de la propriété crc32Check.
	 * @return
	 * 		possible object is
	 *         {@link Crc32CheckType }
	 */
	public Crc32CheckType getCrc32Check() {
		return crc32Check;
	}
	
	/**
	 * Définit la valeur de la propriété crc32Check.
	 * @param value
	 *        allowed object is
	 *        {@link Crc32CheckType }
	 */
	public void setCrc32Check(Crc32CheckType value) {
		this.crc32Check = value;
	}
	
	/**
	 * Obtient la valeur de la propriété packages.
	 * @return
	 * 		possible object is
	 *         {@link TrackPackagesType }
	 */
	public TrackPackagesType getPackages() {
		return packages;
	}
	
	/**
	 * Définit la valeur de la propriété packages.
	 * @param value
	 *        allowed object is
	 *        {@link TrackPackagesType }
	 */
	public void setPackages(TrackPackagesType value) {
		this.packages = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pictureDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link PictureDescriptorType }
	 */
	public PictureDescriptorType getPictureDescriptor() {
		return pictureDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété pictureDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link PictureDescriptorType }
	 */
	public void setPictureDescriptor(PictureDescriptorType value) {
		this.pictureDescriptor = value;
	}
	
	/**
	 * Obtient la valeur de la propriété soundDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link SoundDescriptorType }
	 */
	public SoundDescriptorType getSoundDescriptor() {
		return soundDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété soundDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link SoundDescriptorType }
	 */
	public void setSoundDescriptor(SoundDescriptorType value) {
		this.soundDescriptor = value;
	}
	
	/**
	 * Obtient la valeur de la propriété dataDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link DataDescriptorType }
	 */
	public DataDescriptorType getDataDescriptor() {
		return dataDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété dataDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link DataDescriptorType }
	 */
	public void setDataDescriptor(DataDescriptorType value) {
		this.dataDescriptor = value;
	}
	
}
