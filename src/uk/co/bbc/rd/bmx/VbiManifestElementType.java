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
 * Classe Java pour vbi_manifest_element_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vbi_manifest_element_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="line_number" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="wrapping_type" type="{http://bbc.co.uk/rd/bmx/201312}vbi_wrapping_type_type"/>
 *         &lt;element name="sample_coding" type="{http://bbc.co.uk/rd/bmx/201312}vbi_sample_coding_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vbi_manifest_element_type", propOrder = { "lineNumber", "wrappingType", "sampleCoding" })
public class VbiManifestElementType extends ArrayElementType {
	
	@XmlElement(name = "line_number")
	@XmlSchemaType(name = "integer")
	protected int lineNumber;
	@XmlElement(name = "wrapping_type", required = true)
	protected VbiWrappingTypeType wrappingType;
	@XmlElement(name = "sample_coding", required = true)
	protected VbiSampleCodingType sampleCoding;
	
	/**
	 * Obtient la valeur de la propriété lineNumber.
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	
	/**
	 * Définit la valeur de la propriété lineNumber.
	 */
	public void setLineNumber(int value) {
		this.lineNumber = value;
	}
	
	/**
	 * Obtient la valeur de la propriété wrappingType.
	 * @return
	 * 		possible object is
	 *         {@link VbiWrappingTypeType }
	 */
	public VbiWrappingTypeType getWrappingType() {
		return wrappingType;
	}
	
	/**
	 * Définit la valeur de la propriété wrappingType.
	 * @param value
	 *        allowed object is
	 *        {@link VbiWrappingTypeType }
	 */
	public void setWrappingType(VbiWrappingTypeType value) {
		this.wrappingType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété sampleCoding.
	 * @return
	 * 		possible object is
	 *         {@link VbiSampleCodingType }
	 */
	public VbiSampleCodingType getSampleCoding() {
		return sampleCoding;
	}
	
	/**
	 * Définit la valeur de la propriété sampleCoding.
	 * @param value
	 *        allowed object is
	 *        {@link VbiSampleCodingType }
	 */
	public void setSampleCoding(VbiSampleCodingType value) {
		this.sampleCoding = value;
	}
	
}
