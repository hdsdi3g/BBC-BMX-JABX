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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="original_filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event_counts" type="{http://bbc.co.uk/rd/bmx/201312}event_counts_type"/>
 *         &lt;element name="source_infax" type="{http://bbc.co.uk/rd/bmx/201312}infax_type" minOccurs="0"/>
 *         &lt;element name="lto_infax" type="{http://bbc.co.uk/rd/bmx/201312}infax_type" minOccurs="0"/>
 *         &lt;element name="events" type="{http://bbc.co.uk/rd/bmx/201312}events_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "originalFilename", "eventCounts", "sourceInfax", "ltoInfax", "events" })
@XmlRootElement(name = "bbc_archive")
public class BbcArchive {
	
	@XmlElement(name = "original_filename", required = true)
	protected String originalFilename;
	@XmlElement(name = "event_counts", required = true)
	protected EventCountsType eventCounts;
	@XmlElement(name = "source_infax")
	protected InfaxType sourceInfax;
	@XmlElement(name = "lto_infax")
	protected InfaxType ltoInfax;
	protected EventsType events;
	
	/**
	 * Obtient la valeur de la propriété originalFilename.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getOriginalFilename() {
		return originalFilename;
	}
	
	/**
	 * Définit la valeur de la propriété originalFilename.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setOriginalFilename(String value) {
		this.originalFilename = value;
	}
	
	/**
	 * Obtient la valeur de la propriété eventCounts.
	 * @return
	 * 		possible object is
	 *         {@link EventCountsType }
	 */
	public EventCountsType getEventCounts() {
		return eventCounts;
	}
	
	/**
	 * Définit la valeur de la propriété eventCounts.
	 * @param value
	 *        allowed object is
	 *        {@link EventCountsType }
	 */
	public void setEventCounts(EventCountsType value) {
		this.eventCounts = value;
	}
	
	/**
	 * Obtient la valeur de la propriété sourceInfax.
	 * @return
	 * 		possible object is
	 *         {@link InfaxType }
	 */
	public InfaxType getSourceInfax() {
		return sourceInfax;
	}
	
	/**
	 * Définit la valeur de la propriété sourceInfax.
	 * @param value
	 *        allowed object is
	 *        {@link InfaxType }
	 */
	public void setSourceInfax(InfaxType value) {
		this.sourceInfax = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ltoInfax.
	 * @return
	 * 		possible object is
	 *         {@link InfaxType }
	 */
	public InfaxType getLtoInfax() {
		return ltoInfax;
	}
	
	/**
	 * Définit la valeur de la propriété ltoInfax.
	 * @param value
	 *        allowed object is
	 *        {@link InfaxType }
	 */
	public void setLtoInfax(InfaxType value) {
		this.ltoInfax = value;
	}
	
	/**
	 * Obtient la valeur de la propriété events.
	 * @return
	 * 		possible object is
	 *         {@link EventsType }
	 */
	public EventsType getEvents() {
		return events;
	}
	
	/**
	 * Définit la valeur de la propriété events.
	 * @param value
	 *        allowed object is
	 *        {@link EventsType }
	 */
	public void setEvents(EventsType value) {
		this.events = value;
	}
	
}
