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
 * Classe Java pour events_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="events_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="digibeta_dropouts" type="{http://bbc.co.uk/rd/bmx/201312}digibeta_dropouts_type" minOccurs="0"/>
 *         &lt;element name="pse_failures" type="{http://bbc.co.uk/rd/bmx/201312}pse_failures_type" minOccurs="0"/>
 *         &lt;element name="timecode_breaks" type="{http://bbc.co.uk/rd/bmx/201312}timecode_breaks_type" minOccurs="0"/>
 *         &lt;element name="vtr_errors" type="{http://bbc.co.uk/rd/bmx/201312}vtr_errors_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "events_type", propOrder = { "digibetaDropouts", "pseFailures", "timecodeBreaks", "vtrErrors" })
public class EventsType {
	
	@XmlElement(name = "digibeta_dropouts")
	protected DigibetaDropoutsType digibetaDropouts;
	@XmlElement(name = "pse_failures")
	protected PseFailuresType pseFailures;
	@XmlElement(name = "timecode_breaks")
	protected TimecodeBreaksType timecodeBreaks;
	@XmlElement(name = "vtr_errors")
	protected VtrErrorsType vtrErrors;
	
	/**
	 * Obtient la valeur de la propriété digibetaDropouts.
	 * @return
	 * 		possible object is
	 *         {@link DigibetaDropoutsType }
	 */
	public DigibetaDropoutsType getDigibetaDropouts() {
		return digibetaDropouts;
	}
	
	/**
	 * Définit la valeur de la propriété digibetaDropouts.
	 * @param value
	 *        allowed object is
	 *        {@link DigibetaDropoutsType }
	 */
	public void setDigibetaDropouts(DigibetaDropoutsType value) {
		this.digibetaDropouts = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pseFailures.
	 * @return
	 * 		possible object is
	 *         {@link PseFailuresType }
	 */
	public PseFailuresType getPseFailures() {
		return pseFailures;
	}
	
	/**
	 * Définit la valeur de la propriété pseFailures.
	 * @param value
	 *        allowed object is
	 *        {@link PseFailuresType }
	 */
	public void setPseFailures(PseFailuresType value) {
		this.pseFailures = value;
	}
	
	/**
	 * Obtient la valeur de la propriété timecodeBreaks.
	 * @return
	 * 		possible object is
	 *         {@link TimecodeBreaksType }
	 */
	public TimecodeBreaksType getTimecodeBreaks() {
		return timecodeBreaks;
	}
	
	/**
	 * Définit la valeur de la propriété timecodeBreaks.
	 * @param value
	 *        allowed object is
	 *        {@link TimecodeBreaksType }
	 */
	public void setTimecodeBreaks(TimecodeBreaksType value) {
		this.timecodeBreaks = value;
	}
	
	/**
	 * Obtient la valeur de la propriété vtrErrors.
	 * @return
	 * 		possible object is
	 *         {@link VtrErrorsType }
	 */
	public VtrErrorsType getVtrErrors() {
		return vtrErrors;
	}
	
	/**
	 * Définit la valeur de la propriété vtrErrors.
	 * @param value
	 *        allowed object is
	 *        {@link VtrErrorsType }
	 */
	public void setVtrErrors(VtrErrorsType value) {
		this.vtrErrors = value;
	}
	
}
