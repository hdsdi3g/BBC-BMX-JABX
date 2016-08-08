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
 * Classe Java pour clip_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="clip_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edit_rate" type="{http://bbc.co.uk/rd/bmx/201312}rational_type"/>
 *         &lt;element name="duration" type="{http://bbc.co.uk/rd/bmx/201312}duration_type"/>
 *         &lt;element name="max_precharge" type="{http://bbc.co.uk/rd/bmx/201312}int16_type" minOccurs="0"/>
 *         &lt;element name="max_rollout" type="{http://bbc.co.uk/rd/bmx/201312}int16_type" minOccurs="0"/>
 *         &lt;element name="start_timecodes" type="{http://bbc.co.uk/rd/bmx/201312}start_timecodes_type"/>
 *         &lt;element name="tracks" type="{http://bbc.co.uk/rd/bmx/201312}tracks_type"/>
 *         &lt;element ref="{http://bbc.co.uk/rd/bmx/201312}bbc_archive" minOccurs="0"/>
 *         &lt;element ref="{http://bbc.co.uk/rd/bmx/201312}avid" minOccurs="0"/>
 *         &lt;element ref="{http://bbc.co.uk/rd/bmx/201312}as11" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clip_type", propOrder = { "editRate", "duration", "maxPrecharge", "maxRollout", "startTimecodes", "tracks", "bbcArchive", "avid", "as11" })
public class ClipType {
	
	@XmlElement(name = "edit_rate", required = true)
	protected String editRate;
	@XmlElement(required = true)
	protected DurationType duration;
	@XmlElement(name = "max_precharge")
	@XmlSchemaType(name = "integer")
	protected Integer maxPrecharge;
	@XmlElement(name = "max_rollout")
	@XmlSchemaType(name = "integer")
	protected Integer maxRollout;
	@XmlElement(name = "start_timecodes", required = true)
	protected StartTimecodesType startTimecodes;
	@XmlElement(required = true)
	protected TracksType tracks;
	@XmlElement(name = "bbc_archive")
	protected BbcArchive bbcArchive;
	protected Avid avid;
	protected As11 as11;
	
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
	 * Obtient la valeur de la propriété maxPrecharge.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getMaxPrecharge() {
		return maxPrecharge;
	}
	
	/**
	 * Définit la valeur de la propriété maxPrecharge.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setMaxPrecharge(Integer value) {
		this.maxPrecharge = value;
	}
	
	/**
	 * Obtient la valeur de la propriété maxRollout.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getMaxRollout() {
		return maxRollout;
	}
	
	/**
	 * Définit la valeur de la propriété maxRollout.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setMaxRollout(Integer value) {
		this.maxRollout = value;
	}
	
	/**
	 * Obtient la valeur de la propriété startTimecodes.
	 * @return
	 * 		possible object is
	 *         {@link StartTimecodesType }
	 */
	public StartTimecodesType getStartTimecodes() {
		return startTimecodes;
	}
	
	/**
	 * Définit la valeur de la propriété startTimecodes.
	 * @param value
	 *        allowed object is
	 *        {@link StartTimecodesType }
	 */
	public void setStartTimecodes(StartTimecodesType value) {
		this.startTimecodes = value;
	}
	
	/**
	 * Obtient la valeur de la propriété tracks.
	 * @return
	 * 		possible object is
	 *         {@link TracksType }
	 */
	public TracksType getTracks() {
		return tracks;
	}
	
	/**
	 * Définit la valeur de la propriété tracks.
	 * @param value
	 *        allowed object is
	 *        {@link TracksType }
	 */
	public void setTracks(TracksType value) {
		this.tracks = value;
	}
	
	/**
	 * Obtient la valeur de la propriété bbcArchive.
	 * @return
	 * 		possible object is
	 *         {@link BbcArchive }
	 */
	public BbcArchive getBbcArchive() {
		return bbcArchive;
	}
	
	/**
	 * Définit la valeur de la propriété bbcArchive.
	 * @param value
	 *        allowed object is
	 *        {@link BbcArchive }
	 */
	public void setBbcArchive(BbcArchive value) {
		this.bbcArchive = value;
	}
	
	/**
	 * Obtient la valeur de la propriété avid.
	 * @return
	 * 		possible object is
	 *         {@link Avid }
	 */
	public Avid getAvid() {
		return avid;
	}
	
	/**
	 * Définit la valeur de la propriété avid.
	 * @param value
	 *        allowed object is
	 *        {@link Avid }
	 */
	public void setAvid(Avid value) {
		this.avid = value;
	}
	
	/**
	 * Obtient la valeur de la propriété as11.
	 * @return
	 * 		possible object is
	 *         {@link As11 }
	 */
	public As11 getAs11() {
		return as11;
	}
	
	/**
	 * Définit la valeur de la propriété as11.
	 * @param value
	 *        allowed object is
	 *        {@link As11 }
	 */
	public void setAs11(As11 value) {
		this.as11 = value;
	}
	
}
