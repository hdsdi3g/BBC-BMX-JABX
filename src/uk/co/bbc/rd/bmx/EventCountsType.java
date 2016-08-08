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
 * Classe Java pour event_counts_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="event_counts_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vtr_errors" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="pse_failures" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="digibeta_dropouts" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="timecode_breaks" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_counts_type", propOrder = { "vtrErrors", "pseFailures", "digibetaDropouts", "timecodeBreaks" })
public class EventCountsType {
	
	@XmlElement(name = "vtr_errors")
	@XmlSchemaType(name = "integer")
	protected long vtrErrors;
	@XmlElement(name = "pse_failures")
	@XmlSchemaType(name = "integer")
	protected long pseFailures;
	@XmlElement(name = "digibeta_dropouts")
	@XmlSchemaType(name = "integer")
	protected long digibetaDropouts;
	@XmlElement(name = "timecode_breaks")
	@XmlSchemaType(name = "integer")
	protected long timecodeBreaks;
	
	/**
	 * Obtient la valeur de la propriété vtrErrors.
	 */
	public long getVtrErrors() {
		return vtrErrors;
	}
	
	/**
	 * Définit la valeur de la propriété vtrErrors.
	 */
	public void setVtrErrors(long value) {
		this.vtrErrors = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pseFailures.
	 */
	public long getPseFailures() {
		return pseFailures;
	}
	
	/**
	 * Définit la valeur de la propriété pseFailures.
	 */
	public void setPseFailures(long value) {
		this.pseFailures = value;
	}
	
	/**
	 * Obtient la valeur de la propriété digibetaDropouts.
	 */
	public long getDigibetaDropouts() {
		return digibetaDropouts;
	}
	
	/**
	 * Définit la valeur de la propriété digibetaDropouts.
	 */
	public void setDigibetaDropouts(long value) {
		this.digibetaDropouts = value;
	}
	
	/**
	 * Obtient la valeur de la propriété timecodeBreaks.
	 */
	public long getTimecodeBreaks() {
		return timecodeBreaks;
	}
	
	/**
	 * Définit la valeur de la propriété timecodeBreaks.
	 */
	public void setTimecodeBreaks(long value) {
		this.timecodeBreaks = value;
	}
	
}
