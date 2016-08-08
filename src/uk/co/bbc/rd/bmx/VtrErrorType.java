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
 * Classe Java pour vtr_error_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vtr_error_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}event_type">
 *       &lt;sequence>
 *         &lt;element name="error_code" type="{http://bbc.co.uk/rd/bmx/201312}hex_uint8_type"/>
 *         &lt;element name="video_status" type="{http://bbc.co.uk/rd/bmx/201312}vtr_error_status_type"/>
 *         &lt;element name="audio_status" type="{http://bbc.co.uk/rd/bmx/201312}vtr_error_status_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vtr_error_type", propOrder = { "errorCode", "videoStatus", "audioStatus" })
public class VtrErrorType extends EventType {
	
	@XmlElement(name = "error_code", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String errorCode;
	@XmlElement(name = "video_status", required = true)
	protected VtrErrorStatusType videoStatus;
	@XmlElement(name = "audio_status", required = true)
	protected VtrErrorStatusType audioStatus;
	
	/**
	 * Obtient la valeur de la propriété errorCode.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getErrorCode() {
		return errorCode;
	}
	
	/**
	 * Définit la valeur de la propriété errorCode.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setErrorCode(String value) {
		this.errorCode = value;
	}
	
	/**
	 * Obtient la valeur de la propriété videoStatus.
	 * @return
	 * 		possible object is
	 *         {@link VtrErrorStatusType }
	 */
	public VtrErrorStatusType getVideoStatus() {
		return videoStatus;
	}
	
	/**
	 * Définit la valeur de la propriété videoStatus.
	 * @param value
	 *        allowed object is
	 *        {@link VtrErrorStatusType }
	 */
	public void setVideoStatus(VtrErrorStatusType value) {
		this.videoStatus = value;
	}
	
	/**
	 * Obtient la valeur de la propriété audioStatus.
	 * @return
	 * 		possible object is
	 *         {@link VtrErrorStatusType }
	 */
	public VtrErrorStatusType getAudioStatus() {
		return audioStatus;
	}
	
	/**
	 * Définit la valeur de la propriété audioStatus.
	 * @param value
	 *        allowed object is
	 *        {@link VtrErrorStatusType }
	 */
	public void setAudioStatus(VtrErrorStatusType value) {
		this.audioStatus = value;
	}
	
}
