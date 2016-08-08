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
 * Classe Java pour core_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="core_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shim_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shim_version" type="{http://bbc.co.uk/rd/bmx/201312}version_type" minOccurs="0"/>
 *         &lt;element name="series_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programme_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="episode_title_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audio_track_layout" type="{http://bbc.co.uk/rd/bmx/201312}audio_track_layout_type"/>
 *         &lt;element name="primary_audio_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type"/>
 *         &lt;element name="closed_captions_present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="closed_captions_type" type="{http://bbc.co.uk/rd/bmx/201312}captions_type_type" minOccurs="0"/>
 *         &lt;element name="closed_captions_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "core_type", propOrder = { "shimName", "shimVersion", "seriesTitle", "programmeTitle", "episodeTitleNumber", "audioTrackLayout", "primaryAudioLanguage", "closedCaptionsPresent",
		"closedCaptionsType", "closedCaptionsLanguage" })
public class CoreType {
	
	@XmlElement(name = "shim_name", required = true)
	protected String shimName;
	@XmlElement(name = "shim_version")
	protected String shimVersion;
	@XmlElement(name = "series_title", required = true)
	protected String seriesTitle;
	@XmlElement(name = "programme_title", required = true)
	protected String programmeTitle;
	@XmlElement(name = "episode_title_number", required = true)
	protected String episodeTitleNumber;
	@XmlElement(name = "audio_track_layout", required = true)
	protected AudioTrackLayoutType audioTrackLayout;
	@XmlElement(name = "primary_audio_language", required = true)
	protected String primaryAudioLanguage;
	@XmlElement(name = "closed_captions_present")
	protected boolean closedCaptionsPresent;
	@XmlElement(name = "closed_captions_type")
	protected CaptionsTypeType closedCaptionsType;
	@XmlElement(name = "closed_captions_language")
	protected String closedCaptionsLanguage;
	
	/**
	 * Obtient la valeur de la propriété shimName.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getShimName() {
		return shimName;
	}
	
	/**
	 * Définit la valeur de la propriété shimName.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setShimName(String value) {
		this.shimName = value;
	}
	
	/**
	 * Obtient la valeur de la propriété shimVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getShimVersion() {
		return shimVersion;
	}
	
	/**
	 * Définit la valeur de la propriété shimVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setShimVersion(String value) {
		this.shimVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété seriesTitle.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSeriesTitle() {
		return seriesTitle;
	}
	
	/**
	 * Définit la valeur de la propriété seriesTitle.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSeriesTitle(String value) {
		this.seriesTitle = value;
	}
	
	/**
	 * Obtient la valeur de la propriété programmeTitle.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProgrammeTitle() {
		return programmeTitle;
	}
	
	/**
	 * Définit la valeur de la propriété programmeTitle.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProgrammeTitle(String value) {
		this.programmeTitle = value;
	}
	
	/**
	 * Obtient la valeur de la propriété episodeTitleNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getEpisodeTitleNumber() {
		return episodeTitleNumber;
	}
	
	/**
	 * Définit la valeur de la propriété episodeTitleNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setEpisodeTitleNumber(String value) {
		this.episodeTitleNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioTrackLayout.
	 * @return
	 * 		possible object is
	 *         {@link AudioTrackLayoutType }
	 */
	public AudioTrackLayoutType getAudioTrackLayout() {
		return audioTrackLayout;
	}
	
	/**
	 * Définit la valeur de la propriété audioTrackLayout.
	 * @param value
	 *        allowed object is
	 *        {@link AudioTrackLayoutType }
	 */
	public void setAudioTrackLayout(AudioTrackLayoutType value) {
		this.audioTrackLayout = value;
	}
	
	/**
	 * Obtient la valeur de la propriété primaryAudioLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPrimaryAudioLanguage() {
		return primaryAudioLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété primaryAudioLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPrimaryAudioLanguage(String value) {
		this.primaryAudioLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété closedCaptionsPresent.
	 */
	public boolean isClosedCaptionsPresent() {
		return closedCaptionsPresent;
	}
	
	/**
	 * Définit la valeur de la propriété closedCaptionsPresent.
	 */
	public void setClosedCaptionsPresent(boolean value) {
		this.closedCaptionsPresent = value;
	}
	
	/**
	 * Obtient la valeur de la propriété closedCaptionsType.
	 * @return
	 * 		possible object is
	 *         {@link CaptionsTypeType }
	 */
	public CaptionsTypeType getClosedCaptionsType() {
		return closedCaptionsType;
	}
	
	/**
	 * Définit la valeur de la propriété closedCaptionsType.
	 * @param value
	 *        allowed object is
	 *        {@link CaptionsTypeType }
	 */
	public void setClosedCaptionsType(CaptionsTypeType value) {
		this.closedCaptionsType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété closedCaptionsLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getClosedCaptionsLanguage() {
		return closedCaptionsLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété closedCaptionsLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setClosedCaptionsLanguage(String value) {
		this.closedCaptionsLanguage = value;
	}
	
}
