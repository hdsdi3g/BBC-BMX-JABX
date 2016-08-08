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
 * Classe Java pour sound_descriptor_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sound_descriptor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampling_rate" type="{http://bbc.co.uk/rd/bmx/201312}rational_type"/>
 *         &lt;element name="bits_per_sample" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="block_align" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="channel_count" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="d10_aes3_valid_flags" type="{http://bbc.co.uk/rd/bmx/201312}d10_aes3_valid_flags_type" minOccurs="0"/>
 *         &lt;element name="sequence_offset" type="{http://bbc.co.uk/rd/bmx/201312}uint8_type" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audio_ref_level" type="{http://bbc.co.uk/rd/bmx/201312}int8_type" minOccurs="0"/>
 *         &lt;element name="dial_norm" type="{http://bbc.co.uk/rd/bmx/201312}int8_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sound_descriptor_type", propOrder = { "samplingRate", "bitsPerSample", "blockAlign", "channelCount", "d10Aes3ValidFlags", "sequenceOffset", "locked", "audioRefLevel", "dialNorm" })
public class SoundDescriptorType {
	
	@XmlElement(name = "sampling_rate", required = true)
	protected String samplingRate;
	@XmlElement(name = "bits_per_sample")
	@XmlSchemaType(name = "integer")
	protected long bitsPerSample;
	@XmlElement(name = "block_align")
	@XmlSchemaType(name = "integer")
	protected int blockAlign;
	@XmlElement(name = "channel_count")
	@XmlSchemaType(name = "integer")
	protected long channelCount;
	@XmlElement(name = "d10_aes3_valid_flags")
	protected String d10Aes3ValidFlags;
	@XmlElement(name = "sequence_offset")
	@XmlSchemaType(name = "integer")
	protected Integer sequenceOffset;
	protected Boolean locked;
	@XmlElement(name = "audio_ref_level")
	@XmlSchemaType(name = "integer")
	protected Integer audioRefLevel;
	@XmlElement(name = "dial_norm")
	@XmlSchemaType(name = "integer")
	protected Integer dialNorm;
	
	/**
	 * Obtient la valeur de la propriété samplingRate.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSamplingRate() {
		return samplingRate;
	}
	
	/**
	 * Définit la valeur de la propriété samplingRate.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSamplingRate(String value) {
		this.samplingRate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété bitsPerSample.
	 */
	public long getBitsPerSample() {
		return bitsPerSample;
	}
	
	/**
	 * Définit la valeur de la propriété bitsPerSample.
	 */
	public void setBitsPerSample(long value) {
		this.bitsPerSample = value;
	}
	
	/**
	 * Obtient la valeur de la propriété blockAlign.
	 */
	public int getBlockAlign() {
		return blockAlign;
	}
	
	/**
	 * Définit la valeur de la propriété blockAlign.
	 */
	public void setBlockAlign(int value) {
		this.blockAlign = value;
	}
	
	/**
	 * Obtient la valeur de la propriété channelCount.
	 */
	public long getChannelCount() {
		return channelCount;
	}
	
	/**
	 * Définit la valeur de la propriété channelCount.
	 */
	public void setChannelCount(long value) {
		this.channelCount = value;
	}
	
	/**
	 * Obtient la valeur de la propriété d10Aes3ValidFlags.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getD10Aes3ValidFlags() {
		return d10Aes3ValidFlags;
	}
	
	/**
	 * Définit la valeur de la propriété d10Aes3ValidFlags.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setD10Aes3ValidFlags(String value) {
		this.d10Aes3ValidFlags = value;
	}
	
	/**
	 * Obtient la valeur de la propriété sequenceOffset.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getSequenceOffset() {
		return sequenceOffset;
	}
	
	/**
	 * Définit la valeur de la propriété sequenceOffset.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setSequenceOffset(Integer value) {
		this.sequenceOffset = value;
	}
	
	/**
	 * Obtient la valeur de la propriété locked.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isLocked() {
		return locked;
	}
	
	/**
	 * Définit la valeur de la propriété locked.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setLocked(Boolean value) {
		this.locked = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioRefLevel.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getAudioRefLevel() {
		return audioRefLevel;
	}
	
	/**
	 * Définit la valeur de la propriété audioRefLevel.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setAudioRefLevel(Integer value) {
		this.audioRefLevel = value;
	}
	
	/**
	 * Obtient la valeur de la propriété dialNorm.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getDialNorm() {
		return dialNorm;
	}
	
	/**
	 * Définit la valeur de la propriété dialNorm.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setDialNorm(Integer value) {
		this.dialNorm = value;
	}
	
}
