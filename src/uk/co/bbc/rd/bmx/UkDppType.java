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
 * Classe Java pour uk_dpp_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uk_dpp_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="production_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synopsis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copyright_year" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="other_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other_identifier_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picture_ratio" type="{http://bbc.co.uk/rd/bmx/201312}rational_type" minOccurs="0"/>
 *         &lt;element name="three_d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="three_d_type" type="{http://bbc.co.uk/rd/bmx/201312}three_d_type_type" minOccurs="0"/>
 *         &lt;element name="product_placement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pse_pass" type="{http://bbc.co.uk/rd/bmx/201312}pse_pass_type" minOccurs="0"/>
 *         &lt;element name="pse_manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pse_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="video_comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondary_audio_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type"/>
 *         &lt;element name="tertiary_audio_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type"/>
 *         &lt;element name="audio_loudness_standard" type="{http://bbc.co.uk/rd/bmx/201312}audio_loudness_standard_type"/>
 *         &lt;element name="audio_comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line_up_start" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type"/>
 *         &lt;element name="ident_clock_start" type="{http://bbc.co.uk/rd/bmx/201312}timecode_type"/>
 *         &lt;element name="total_number_of_parts" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="total_programme_duration" type="{http://bbc.co.uk/rd/bmx/201312}duration_type"/>
 *         &lt;element name="audio_description_present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="audio_description_type" type="{http://bbc.co.uk/rd/bmx/201312}audio_description_type_type" minOccurs="0"/>
 *         &lt;element name="open_captions_present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="open_captions_type" type="{http://bbc.co.uk/rd/bmx/201312}captions_type_type" minOccurs="0"/>
 *         &lt;element name="open_captions_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type" minOccurs="0"/>
 *         &lt;element name="signing_present" type="{http://bbc.co.uk/rd/bmx/201312}signing_present_type"/>
 *         &lt;element name="sign_language" type="{http://bbc.co.uk/rd/bmx/201312}sign_language_type" minOccurs="0"/>
 *         &lt;element name="completion_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="textless_elements_exist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="programme_has_text" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="programme_text_language" type="{http://bbc.co.uk/rd/bmx/201312}language_type" minOccurs="0"/>
 *         &lt;element name="contact_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_telephone_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uk_dpp_type", propOrder = { "productionNumber", "synopsis", "originator", "copyrightYear", "otherIdentifier", "otherIdentifierType", "genre", "distributor", "pictureRatio", "threeD",
		"threeDType", "productPlacement", "psePass", "pseManufacturer", "pseVersion", "videoComments", "secondaryAudioLanguage", "tertiaryAudioLanguage", "audioLoudnessStandard", "audioComments",
		"lineUpStart", "identClockStart", "totalNumberOfParts", "totalProgrammeDuration", "audioDescriptionPresent", "audioDescriptionType", "openCaptionsPresent", "openCaptionsType",
		"openCaptionsLanguage", "signingPresent", "signLanguage", "completionDate", "textlessElementsExist", "programmeHasText", "programmeTextLanguage", "contactEmail", "contactTelephoneNumber" })
public class UkDppType {
	
	@XmlElement(name = "production_number", required = true)
	protected String productionNumber;
	@XmlElement(required = true)
	protected String synopsis;
	@XmlElement(required = true)
	protected String originator;
	@XmlElement(name = "copyright_year")
	@XmlSchemaType(name = "integer")
	protected int copyrightYear;
	@XmlElement(name = "other_identifier")
	protected String otherIdentifier;
	@XmlElement(name = "other_identifier_type")
	protected String otherIdentifierType;
	protected String genre;
	protected String distributor;
	@XmlElement(name = "picture_ratio")
	protected String pictureRatio;
	@XmlElement(name = "three_d")
	protected boolean threeD;
	@XmlElement(name = "three_d_type")
	protected ThreeDTypeType threeDType;
	@XmlElement(name = "product_placement")
	protected Boolean productPlacement;
	@XmlElement(name = "pse_pass")
	protected PsePassType psePass;
	@XmlElement(name = "pse_manufacturer")
	protected String pseManufacturer;
	@XmlElement(name = "pse_version")
	protected String pseVersion;
	@XmlElement(name = "video_comments")
	protected String videoComments;
	@XmlElement(name = "secondary_audio_language", required = true)
	protected String secondaryAudioLanguage;
	@XmlElement(name = "tertiary_audio_language", required = true)
	protected String tertiaryAudioLanguage;
	@XmlElement(name = "audio_loudness_standard", required = true)
	protected AudioLoudnessStandardType audioLoudnessStandard;
	@XmlElement(name = "audio_comments")
	protected String audioComments;
	@XmlElement(name = "line_up_start", required = true)
	protected TimecodeType lineUpStart;
	@XmlElement(name = "ident_clock_start", required = true)
	protected TimecodeType identClockStart;
	@XmlElement(name = "total_number_of_parts")
	@XmlSchemaType(name = "integer")
	protected int totalNumberOfParts;
	@XmlElement(name = "total_programme_duration", required = true)
	protected DurationType totalProgrammeDuration;
	@XmlElement(name = "audio_description_present")
	protected boolean audioDescriptionPresent;
	@XmlElement(name = "audio_description_type")
	protected AudioDescriptionTypeType audioDescriptionType;
	@XmlElement(name = "open_captions_present")
	protected boolean openCaptionsPresent;
	@XmlElement(name = "open_captions_type")
	protected CaptionsTypeType openCaptionsType;
	@XmlElement(name = "open_captions_language")
	protected String openCaptionsLanguage;
	@XmlElement(name = "signing_present", required = true)
	protected SigningPresentType signingPresent;
	@XmlElement(name = "sign_language")
	protected SignLanguageType signLanguage;
	@XmlElement(name = "completion_date", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar completionDate;
	@XmlElement(name = "textless_elements_exist")
	protected Boolean textlessElementsExist;
	@XmlElement(name = "programme_has_text")
	protected Boolean programmeHasText;
	@XmlElement(name = "programme_text_language")
	protected String programmeTextLanguage;
	@XmlElement(name = "contact_email", required = true)
	protected String contactEmail;
	@XmlElement(name = "contact_telephone_number", required = true)
	protected String contactTelephoneNumber;
	
	/**
	 * Obtient la valeur de la propriété productionNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProductionNumber() {
		return productionNumber;
	}
	
	/**
	 * Définit la valeur de la propriété productionNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProductionNumber(String value) {
		this.productionNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété synopsis.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSynopsis() {
		return synopsis;
	}
	
	/**
	 * Définit la valeur de la propriété synopsis.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSynopsis(String value) {
		this.synopsis = value;
	}
	
	/**
	 * Obtient la valeur de la propriété originator.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getOriginator() {
		return originator;
	}
	
	/**
	 * Définit la valeur de la propriété originator.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setOriginator(String value) {
		this.originator = value;
	}
	
	/**
	 * Obtient la valeur de la propriété copyrightYear.
	 */
	public int getCopyrightYear() {
		return copyrightYear;
	}
	
	/**
	 * Définit la valeur de la propriété copyrightYear.
	 */
	public void setCopyrightYear(int value) {
		this.copyrightYear = value;
	}
	
	/**
	 * Obtient la valeur de la propriété otherIdentifier.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getOtherIdentifier() {
		return otherIdentifier;
	}
	
	/**
	 * Définit la valeur de la propriété otherIdentifier.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setOtherIdentifier(String value) {
		this.otherIdentifier = value;
	}
	
	/**
	 * Obtient la valeur de la propriété otherIdentifierType.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getOtherIdentifierType() {
		return otherIdentifierType;
	}
	
	/**
	 * Définit la valeur de la propriété otherIdentifierType.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setOtherIdentifierType(String value) {
		this.otherIdentifierType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété genre.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getGenre() {
		return genre;
	}
	
	/**
	 * Définit la valeur de la propriété genre.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setGenre(String value) {
		this.genre = value;
	}
	
	/**
	 * Obtient la valeur de la propriété distributor.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getDistributor() {
		return distributor;
	}
	
	/**
	 * Définit la valeur de la propriété distributor.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setDistributor(String value) {
		this.distributor = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pictureRatio.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPictureRatio() {
		return pictureRatio;
	}
	
	/**
	 * Définit la valeur de la propriété pictureRatio.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPictureRatio(String value) {
		this.pictureRatio = value;
	}
	
	/**
	 * Obtient la valeur de la propriété threeD.
	 */
	public boolean isThreeD() {
		return threeD;
	}
	
	/**
	 * Définit la valeur de la propriété threeD.
	 */
	public void setThreeD(boolean value) {
		this.threeD = value;
	}
	
	/**
	 * Obtient la valeur de la propriété threeDType.
	 * @return
	 * 		possible object is
	 *         {@link ThreeDTypeType }
	 */
	public ThreeDTypeType getThreeDType() {
		return threeDType;
	}
	
	/**
	 * Définit la valeur de la propriété threeDType.
	 * @param value
	 *        allowed object is
	 *        {@link ThreeDTypeType }
	 */
	public void setThreeDType(ThreeDTypeType value) {
		this.threeDType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété productPlacement.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isProductPlacement() {
		return productPlacement;
	}
	
	/**
	 * Définit la valeur de la propriété productPlacement.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setProductPlacement(Boolean value) {
		this.productPlacement = value;
	}
	
	/**
	 * Obtient la valeur de la propriété psePass.
	 * @return
	 * 		possible object is
	 *         {@link PsePassType }
	 */
	public PsePassType getPsePass() {
		return psePass;
	}
	
	/**
	 * Définit la valeur de la propriété psePass.
	 * @param value
	 *        allowed object is
	 *        {@link PsePassType }
	 */
	public void setPsePass(PsePassType value) {
		this.psePass = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pseManufacturer.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPseManufacturer() {
		return pseManufacturer;
	}
	
	/**
	 * Définit la valeur de la propriété pseManufacturer.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPseManufacturer(String value) {
		this.pseManufacturer = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pseVersion.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getPseVersion() {
		return pseVersion;
	}
	
	/**
	 * Définit la valeur de la propriété pseVersion.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setPseVersion(String value) {
		this.pseVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété videoComments.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getVideoComments() {
		return videoComments;
	}
	
	/**
	 * Définit la valeur de la propriété videoComments.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setVideoComments(String value) {
		this.videoComments = value;
	}
	
	/**
	 * Obtient la valeur de la propriété secondaryAudioLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSecondaryAudioLanguage() {
		return secondaryAudioLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété secondaryAudioLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSecondaryAudioLanguage(String value) {
		this.secondaryAudioLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété tertiaryAudioLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getTertiaryAudioLanguage() {
		return tertiaryAudioLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété tertiaryAudioLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setTertiaryAudioLanguage(String value) {
		this.tertiaryAudioLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioLoudnessStandard.
	 * @return
	 * 		possible object is
	 *         {@link AudioLoudnessStandardType }
	 */
	public AudioLoudnessStandardType getAudioLoudnessStandard() {
		return audioLoudnessStandard;
	}
	
	/**
	 * Définit la valeur de la propriété audioLoudnessStandard.
	 * @param value
	 *        allowed object is
	 *        {@link AudioLoudnessStandardType }
	 */
	public void setAudioLoudnessStandard(AudioLoudnessStandardType value) {
		this.audioLoudnessStandard = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioComments.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getAudioComments() {
		return audioComments;
	}
	
	/**
	 * Définit la valeur de la propriété audioComments.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setAudioComments(String value) {
		this.audioComments = value;
	}
	
	/**
	 * Obtient la valeur de la propriété lineUpStart.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getLineUpStart() {
		return lineUpStart;
	}
	
	/**
	 * Définit la valeur de la propriété lineUpStart.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setLineUpStart(TimecodeType value) {
		this.lineUpStart = value;
	}
	
	/**
	 * Obtient la valeur de la propriété identClockStart.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeType }
	 */
	public TimecodeType getIdentClockStart() {
		return identClockStart;
	}
	
	/**
	 * Définit la valeur de la propriété identClockStart.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeType }
	 */
	public void setIdentClockStart(TimecodeType value) {
		this.identClockStart = value;
	}
	
	/**
	 * Obtient la valeur de la propriété totalNumberOfParts.
	 */
	public int getTotalNumberOfParts() {
		return totalNumberOfParts;
	}
	
	/**
	 * Définit la valeur de la propriété totalNumberOfParts.
	 */
	public void setTotalNumberOfParts(int value) {
		this.totalNumberOfParts = value;
	}
	
	/**
	 * Obtient la valeur de la propriété totalProgrammeDuration.
	 * @return
	 * 		possible object is
	 *         {@link DurationType }
	 */
	public DurationType getTotalProgrammeDuration() {
		return totalProgrammeDuration;
	}
	
	/**
	 * Définit la valeur de la propriété totalProgrammeDuration.
	 * @param value
	 *        allowed object is
	 *        {@link DurationType }
	 */
	public void setTotalProgrammeDuration(DurationType value) {
		this.totalProgrammeDuration = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioDescriptionPresent.
	 */
	public boolean isAudioDescriptionPresent() {
		return audioDescriptionPresent;
	}
	
	/**
	 * Définit la valeur de la propriété audioDescriptionPresent.
	 */
	public void setAudioDescriptionPresent(boolean value) {
		this.audioDescriptionPresent = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioDescriptionType.
	 * @return
	 * 		possible object is
	 *         {@link AudioDescriptionTypeType }
	 */
	public AudioDescriptionTypeType getAudioDescriptionType() {
		return audioDescriptionType;
	}
	
	/**
	 * Définit la valeur de la propriété audioDescriptionType.
	 * @param value
	 *        allowed object is
	 *        {@link AudioDescriptionTypeType }
	 */
	public void setAudioDescriptionType(AudioDescriptionTypeType value) {
		this.audioDescriptionType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété openCaptionsPresent.
	 */
	public boolean isOpenCaptionsPresent() {
		return openCaptionsPresent;
	}
	
	/**
	 * Définit la valeur de la propriété openCaptionsPresent.
	 */
	public void setOpenCaptionsPresent(boolean value) {
		this.openCaptionsPresent = value;
	}
	
	/**
	 * Obtient la valeur de la propriété openCaptionsType.
	 * @return
	 * 		possible object is
	 *         {@link CaptionsTypeType }
	 */
	public CaptionsTypeType getOpenCaptionsType() {
		return openCaptionsType;
	}
	
	/**
	 * Définit la valeur de la propriété openCaptionsType.
	 * @param value
	 *        allowed object is
	 *        {@link CaptionsTypeType }
	 */
	public void setOpenCaptionsType(CaptionsTypeType value) {
		this.openCaptionsType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété openCaptionsLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getOpenCaptionsLanguage() {
		return openCaptionsLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété openCaptionsLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setOpenCaptionsLanguage(String value) {
		this.openCaptionsLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété signingPresent.
	 * @return
	 * 		possible object is
	 *         {@link SigningPresentType }
	 */
	public SigningPresentType getSigningPresent() {
		return signingPresent;
	}
	
	/**
	 * Définit la valeur de la propriété signingPresent.
	 * @param value
	 *        allowed object is
	 *        {@link SigningPresentType }
	 */
	public void setSigningPresent(SigningPresentType value) {
		this.signingPresent = value;
	}
	
	/**
	 * Obtient la valeur de la propriété signLanguage.
	 * @return
	 * 		possible object is
	 *         {@link SignLanguageType }
	 */
	public SignLanguageType getSignLanguage() {
		return signLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété signLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link SignLanguageType }
	 */
	public void setSignLanguage(SignLanguageType value) {
		this.signLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété completionDate.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getCompletionDate() {
		return completionDate;
	}
	
	/**
	 * Définit la valeur de la propriété completionDate.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setCompletionDate(XMLGregorianCalendar value) {
		this.completionDate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété textlessElementsExist.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isTextlessElementsExist() {
		return textlessElementsExist;
	}
	
	/**
	 * Définit la valeur de la propriété textlessElementsExist.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setTextlessElementsExist(Boolean value) {
		this.textlessElementsExist = value;
	}
	
	/**
	 * Obtient la valeur de la propriété programmeHasText.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isProgrammeHasText() {
		return programmeHasText;
	}
	
	/**
	 * Définit la valeur de la propriété programmeHasText.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setProgrammeHasText(Boolean value) {
		this.programmeHasText = value;
	}
	
	/**
	 * Obtient la valeur de la propriété programmeTextLanguage.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProgrammeTextLanguage() {
		return programmeTextLanguage;
	}
	
	/**
	 * Définit la valeur de la propriété programmeTextLanguage.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProgrammeTextLanguage(String value) {
		this.programmeTextLanguage = value;
	}
	
	/**
	 * Obtient la valeur de la propriété contactEmail.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	
	/**
	 * Définit la valeur de la propriété contactEmail.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setContactEmail(String value) {
		this.contactEmail = value;
	}
	
	/**
	 * Obtient la valeur de la propriété contactTelephoneNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getContactTelephoneNumber() {
		return contactTelephoneNumber;
	}
	
	/**
	 * Définit la valeur de la propriété contactTelephoneNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setContactTelephoneNumber(String value) {
		this.contactTelephoneNumber = value;
	}
	
}
