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
 * Classe Java pour infax_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infax_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programme_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="episode_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmission_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="magazine_prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programme_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="production_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spool_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stock_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="spool_descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://bbc.co.uk/rd/bmx/201312}duration_type" minOccurs="0"/>
 *         &lt;element name="spoolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accession_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogue_detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item_number" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infax_type", propOrder = { "format", "programmeTitle", "episodeTitle", "transmissionDate", "magazinePrefix", "programmeNumber", "productionCode", "spoolStatus", "stockDate",
		"spoolDescriptor", "memo", "duration", "spoolNumber", "accessionNumber", "catalogueDetail", "itemNumber" })
public class InfaxType {
	
	protected String format;
	@XmlElement(name = "programme_title")
	protected String programmeTitle;
	@XmlElement(name = "episode_title")
	protected String episodeTitle;
	@XmlElement(name = "transmission_date")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar transmissionDate;
	@XmlElement(name = "magazine_prefix")
	protected String magazinePrefix;
	@XmlElement(name = "programme_number")
	protected String programmeNumber;
	@XmlElement(name = "production_code")
	protected String productionCode;
	@XmlElement(name = "spool_status")
	protected String spoolStatus;
	@XmlElement(name = "stock_date")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar stockDate;
	@XmlElement(name = "spool_descriptor")
	protected String spoolDescriptor;
	protected String memo;
	protected DurationType duration;
	protected String spoolNumber;
	@XmlElement(name = "accession_number")
	protected String accessionNumber;
	@XmlElement(name = "catalogue_detail")
	protected String catalogueDetail;
	@XmlElement(name = "item_number")
	@XmlSchemaType(name = "integer")
	protected Long itemNumber;
	
	/**
	 * Obtient la valeur de la propriété format.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getFormat() {
		return format;
	}
	
	/**
	 * Définit la valeur de la propriété format.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setFormat(String value) {
		this.format = value;
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
	 * Obtient la valeur de la propriété episodeTitle.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	
	/**
	 * Définit la valeur de la propriété episodeTitle.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setEpisodeTitle(String value) {
		this.episodeTitle = value;
	}
	
	/**
	 * Obtient la valeur de la propriété transmissionDate.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getTransmissionDate() {
		return transmissionDate;
	}
	
	/**
	 * Définit la valeur de la propriété transmissionDate.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setTransmissionDate(XMLGregorianCalendar value) {
		this.transmissionDate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété magazinePrefix.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getMagazinePrefix() {
		return magazinePrefix;
	}
	
	/**
	 * Définit la valeur de la propriété magazinePrefix.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setMagazinePrefix(String value) {
		this.magazinePrefix = value;
	}
	
	/**
	 * Obtient la valeur de la propriété programmeNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProgrammeNumber() {
		return programmeNumber;
	}
	
	/**
	 * Définit la valeur de la propriété programmeNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProgrammeNumber(String value) {
		this.programmeNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété productionCode.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getProductionCode() {
		return productionCode;
	}
	
	/**
	 * Définit la valeur de la propriété productionCode.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setProductionCode(String value) {
		this.productionCode = value;
	}
	
	/**
	 * Obtient la valeur de la propriété spoolStatus.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSpoolStatus() {
		return spoolStatus;
	}
	
	/**
	 * Définit la valeur de la propriété spoolStatus.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSpoolStatus(String value) {
		this.spoolStatus = value;
	}
	
	/**
	 * Obtient la valeur de la propriété stockDate.
	 * @return
	 * 		possible object is
	 *         {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getStockDate() {
		return stockDate;
	}
	
	/**
	 * Définit la valeur de la propriété stockDate.
	 * @param value
	 *        allowed object is
	 *        {@link XMLGregorianCalendar }
	 */
	public void setStockDate(XMLGregorianCalendar value) {
		this.stockDate = value;
	}
	
	/**
	 * Obtient la valeur de la propriété spoolDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSpoolDescriptor() {
		return spoolDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété spoolDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSpoolDescriptor(String value) {
		this.spoolDescriptor = value;
	}
	
	/**
	 * Obtient la valeur de la propriété memo.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getMemo() {
		return memo;
	}
	
	/**
	 * Définit la valeur de la propriété memo.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setMemo(String value) {
		this.memo = value;
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
	 * Obtient la valeur de la propriété spoolNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getSpoolNumber() {
		return spoolNumber;
	}
	
	/**
	 * Définit la valeur de la propriété spoolNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setSpoolNumber(String value) {
		this.spoolNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété accessionNumber.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getAccessionNumber() {
		return accessionNumber;
	}
	
	/**
	 * Définit la valeur de la propriété accessionNumber.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setAccessionNumber(String value) {
		this.accessionNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété catalogueDetail.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getCatalogueDetail() {
		return catalogueDetail;
	}
	
	/**
	 * Définit la valeur de la propriété catalogueDetail.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setCatalogueDetail(String value) {
		this.catalogueDetail = value;
	}
	
	/**
	 * Obtient la valeur de la propriété itemNumber.
	 * @return
	 * 		possible object is
	 *         {@link Long }
	 */
	public Long getItemNumber() {
		return itemNumber;
	}
	
	/**
	 * Définit la valeur de la propriété itemNumber.
	 * @param value
	 *        allowed object is
	 *        {@link Long }
	 */
	public void setItemNumber(Long value) {
		this.itemNumber = value;
	}
	
}
