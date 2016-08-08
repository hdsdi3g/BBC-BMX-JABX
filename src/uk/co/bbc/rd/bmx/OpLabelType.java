//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Classe Java pour op_label_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="op_label_type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="multi_source_clip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="multi_essence_track" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="external_essence" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="non_stream" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="multi_track" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="label" use="required" type="{http://bbc.co.uk/rd/bmx/201312}label_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "op_label_type", propOrder = { "value" })
public class OpLabelType {
	
	@XmlValue
	protected String value;
	@XmlAttribute(name = "multi_source_clip")
	protected Boolean multiSourceClip;
	@XmlAttribute(name = "multi_essence_track")
	protected Boolean multiEssenceTrack;
	@XmlAttribute(name = "external_essence")
	protected Boolean externalEssence;
	@XmlAttribute(name = "non_stream")
	protected Boolean nonStream;
	@XmlAttribute(name = "multi_track")
	protected Boolean multiTrack;
	@XmlAttribute(name = "label", required = true)
	protected String label;
	
	/**
	 * Obtient la valeur de la propriété value.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Définit la valeur de la propriété value.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Obtient la valeur de la propriété multiSourceClip.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isMultiSourceClip() {
		return multiSourceClip;
	}
	
	/**
	 * Définit la valeur de la propriété multiSourceClip.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setMultiSourceClip(Boolean value) {
		this.multiSourceClip = value;
	}
	
	/**
	 * Obtient la valeur de la propriété multiEssenceTrack.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isMultiEssenceTrack() {
		return multiEssenceTrack;
	}
	
	/**
	 * Définit la valeur de la propriété multiEssenceTrack.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setMultiEssenceTrack(Boolean value) {
		this.multiEssenceTrack = value;
	}
	
	/**
	 * Obtient la valeur de la propriété externalEssence.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isExternalEssence() {
		return externalEssence;
	}
	
	/**
	 * Définit la valeur de la propriété externalEssence.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setExternalEssence(Boolean value) {
		this.externalEssence = value;
	}
	
	/**
	 * Obtient la valeur de la propriété nonStream.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isNonStream() {
		return nonStream;
	}
	
	/**
	 * Définit la valeur de la propriété nonStream.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setNonStream(Boolean value) {
		this.nonStream = value;
	}
	
	/**
	 * Obtient la valeur de la propriété multiTrack.
	 * @return
	 * 		possible object is
	 *         {@link Boolean }
	 */
	public Boolean isMultiTrack() {
		return multiTrack;
	}
	
	/**
	 * Définit la valeur de la propriété multiTrack.
	 * @param value
	 *        allowed object is
	 *        {@link Boolean }
	 */
	public void setMultiTrack(Boolean value) {
		this.multiTrack = value;
	}
	
	/**
	 * Obtient la valeur de la propriété label.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Définit la valeur de la propriété label.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setLabel(String value) {
		this.label = value;
	}
	
}
