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
 * Classe Java pour picture_descriptor_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="picture_descriptor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coding_label" type="{http://bbc.co.uk/rd/bmx/201312}label_type" minOccurs="0"/>
 *         &lt;element name="signal_standard" type="{http://bbc.co.uk/rd/bmx/201312}signal_standard_type"/>
 *         &lt;element name="frame_layout" type="{http://bbc.co.uk/rd/bmx/201312}frame_layout_type"/>
 *         &lt;element name="stored_width" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="stored_height" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="display_width" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="display_height" type="{http://bbc.co.uk/rd/bmx/201312}uint32_type"/>
 *         &lt;element name="display_x_offset" type="{http://bbc.co.uk/rd/bmx/201312}int32_type" minOccurs="0"/>
 *         &lt;element name="display_y_offset" type="{http://bbc.co.uk/rd/bmx/201312}int32_type" minOccurs="0"/>
 *         &lt;element name="aspect_ratio" type="{http://bbc.co.uk/rd/bmx/201312}rational_type"/>
 *         &lt;element name="afd" type="{http://bbc.co.uk/rd/bmx/201312}uint8_type" minOccurs="0"/>
 *         &lt;element name="avci_header" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cdci_descriptor" type="{http://bbc.co.uk/rd/bmx/201312}cdci_descriptor_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picture_descriptor_type", propOrder = { "codingLabel", "signalStandard", "frameLayout", "storedWidth", "storedHeight", "displayWidth", "displayHeight", "displayXOffset",
		"displayYOffset", "aspectRatio", "afd", "avciHeader", "cdciDescriptor" })
public class PictureDescriptorType {
	
	@XmlElement(name = "coding_label")
	@XmlSchemaType(name = "anyURI")
	protected String codingLabel;
	@XmlElement(name = "signal_standard", required = true)
	protected SignalStandardType signalStandard;
	@XmlElement(name = "frame_layout", required = true)
	protected FrameLayoutType frameLayout;
	@XmlElement(name = "stored_width")
	@XmlSchemaType(name = "integer")
	protected long storedWidth;
	@XmlElement(name = "stored_height")
	@XmlSchemaType(name = "integer")
	protected long storedHeight;
	@XmlElement(name = "display_width")
	@XmlSchemaType(name = "integer")
	protected long displayWidth;
	@XmlElement(name = "display_height")
	@XmlSchemaType(name = "integer")
	protected long displayHeight;
	@XmlElement(name = "display_x_offset")
	@XmlSchemaType(name = "integer")
	protected Integer displayXOffset;
	@XmlElement(name = "display_y_offset")
	@XmlSchemaType(name = "integer")
	protected Integer displayYOffset;
	@XmlElement(name = "aspect_ratio", required = true)
	protected String aspectRatio;
	@XmlSchemaType(name = "integer")
	protected Integer afd;
	@XmlElement(name = "avci_header")
	protected Boolean avciHeader;
	@XmlElement(name = "cdci_descriptor")
	protected CdciDescriptorType cdciDescriptor;
	
	/**
	 * Obtient la valeur de la propriété codingLabel.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getCodingLabel() {
		return codingLabel;
	}
	
	/**
	 * Définit la valeur de la propriété codingLabel.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setCodingLabel(String value) {
		this.codingLabel = value;
	}
	
	/**
	 * Obtient la valeur de la propriété signalStandard.
	 * @return
	 * 		possible object is
	 *         {@link SignalStandardType }
	 */
	public SignalStandardType getSignalStandard() {
		return signalStandard;
	}
	
	/**
	 * Définit la valeur de la propriété signalStandard.
	 * @param value
	 *        allowed object is
	 *        {@link SignalStandardType }
	 */
	public void setSignalStandard(SignalStandardType value) {
		this.signalStandard = value;
	}
	
	/**
	 * Obtient la valeur de la propriété frameLayout.
	 * @return
	 * 		possible object is
	 *         {@link FrameLayoutType }
	 */
	public FrameLayoutType getFrameLayout() {
		return frameLayout;
	}
	
	/**
	 * Définit la valeur de la propriété frameLayout.
	 * @param value
	 *        allowed object is
	 *        {@link FrameLayoutType }
	 */
	public void setFrameLayout(FrameLayoutType value) {
		this.frameLayout = value;
	}
	
	/**
	 * Obtient la valeur de la propriété storedWidth.
	 */
	public long getStoredWidth() {
		return storedWidth;
	}
	
	/**
	 * Définit la valeur de la propriété storedWidth.
	 */
	public void setStoredWidth(long value) {
		this.storedWidth = value;
	}
	
	/**
	 * Obtient la valeur de la propriété storedHeight.
	 */
	public long getStoredHeight() {
		return storedHeight;
	}
	
	/**
	 * Définit la valeur de la propriété storedHeight.
	 */
	public void setStoredHeight(long value) {
		this.storedHeight = value;
	}
	
	/**
	 * Obtient la valeur de la propriété displayWidth.
	 */
	public long getDisplayWidth() {
		return displayWidth;
	}
	
	/**
	 * Définit la valeur de la propriété displayWidth.
	 */
	public void setDisplayWidth(long value) {
		this.displayWidth = value;
	}
	
	/**
	 * Obtient la valeur de la propriété displayHeight.
	 */
	public long getDisplayHeight() {
		return displayHeight;
	}
	
	/**
	 * Définit la valeur de la propriété displayHeight.
	 */
	public void setDisplayHeight(long value) {
		this.displayHeight = value;
	}
	
	/**
	 * Obtient la valeur de la propriété displayXOffset.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getDisplayXOffset() {
		return displayXOffset;
	}
	
	/**
	 * Définit la valeur de la propriété displayXOffset.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setDisplayXOffset(Integer value) {
		this.displayXOffset = value;
	}
	
	/**
	 * Obtient la valeur de la propriété displayYOffset.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getDisplayYOffset() {
		return displayYOffset;
	}
	
	/**
	 * Définit la valeur de la propriété displayYOffset.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setDisplayYOffset(Integer value) {
		this.displayYOffset = value;
	}
	
	/**
	 * Obtient la valeur de la propriété aspectRatio.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getAspectRatio() {
		return aspectRatio;
	}
	
	/**
	 * Définit la valeur de la propriété aspectRatio.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setAspectRatio(String value) {
		this.aspectRatio = value;
	}
	
	/**
	 * Obtient la valeur de la propriété afd.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getAfd() {
		return afd;
	}
	
	/**
	 * Définit la valeur de la propriété afd.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setAfd(Integer value) {
		this.afd = value;
	}
	
	/**
	 * Obtient la valeur de la propriété avciHeader.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isAvciHeader() {
		return avciHeader;
	}
	
	/**
	 * Définit la valeur de la propriété avciHeader.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setAvciHeader(Boolean value) {
		this.avciHeader = value;
	}
	
	/**
	 * Obtient la valeur de la propriété cdciDescriptor.
	 * @return
	 * 		possible object is
	 *         {@link CdciDescriptorType }
	 */
	public CdciDescriptorType getCdciDescriptor() {
		return cdciDescriptor;
	}
	
	/**
	 * Définit la valeur de la propriété cdciDescriptor.
	 * @param value
	 *        allowed object is
	 *        {@link CdciDescriptorType }
	 */
	public void setCdciDescriptor(CdciDescriptorType value) {
		this.cdciDescriptor = value;
	}
	
}
