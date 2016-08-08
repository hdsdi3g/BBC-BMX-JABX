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
 * Classe Java pour anc_manifest_element_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="anc_manifest_element_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_element_type">
 *       &lt;sequence>
 *         &lt;element name="line_number" type="{http://bbc.co.uk/rd/bmx/201312}uint16_type"/>
 *         &lt;element name="wrapping_type" type="{http://bbc.co.uk/rd/bmx/201312}anc_wrapping_type_type"/>
 *         &lt;element name="sample_coding" type="{http://bbc.co.uk/rd/bmx/201312}anc_sample_coding_type"/>
 *         &lt;element name="did_type_1" type="{http://bbc.co.uk/rd/bmx/201312}did_type_1_type" minOccurs="0"/>
 *         &lt;element name="did_type_2" type="{http://bbc.co.uk/rd/bmx/201312}did_type_2_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anc_manifest_element_type", propOrder = { "lineNumber", "wrappingType", "sampleCoding", "didType1", "didType2" })
public class AncManifestElementType extends ArrayElementType {
	
	@XmlElement(name = "line_number")
	@XmlSchemaType(name = "integer")
	protected int lineNumber;
	@XmlElement(name = "wrapping_type", required = true)
	protected AncWrappingTypeType wrappingType;
	@XmlElement(name = "sample_coding", required = true)
	protected AncSampleCodingType sampleCoding;
	@XmlElement(name = "did_type_1")
	protected DidType1Type didType1;
	@XmlElement(name = "did_type_2")
	protected DidType2Type didType2;
	
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
	 *         {@link AncWrappingTypeType }
	 */
	public AncWrappingTypeType getWrappingType() {
		return wrappingType;
	}
	
	/**
	 * Définit la valeur de la propriété wrappingType.
	 * @param value
	 *        allowed object is
	 *        {@link AncWrappingTypeType }
	 */
	public void setWrappingType(AncWrappingTypeType value) {
		this.wrappingType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété sampleCoding.
	 * @return
	 * 		possible object is
	 *         {@link AncSampleCodingType }
	 */
	public AncSampleCodingType getSampleCoding() {
		return sampleCoding;
	}
	
	/**
	 * Définit la valeur de la propriété sampleCoding.
	 * @param value
	 *        allowed object is
	 *        {@link AncSampleCodingType }
	 */
	public void setSampleCoding(AncSampleCodingType value) {
		this.sampleCoding = value;
	}
	
	/**
	 * Obtient la valeur de la propriété didType1.
	 * @return
	 * 		possible object is
	 *         {@link DidType1Type }
	 */
	public DidType1Type getDidType1() {
		return didType1;
	}
	
	/**
	 * Définit la valeur de la propriété didType1.
	 * @param value
	 *        allowed object is
	 *        {@link DidType1Type }
	 */
	public void setDidType1(DidType1Type value) {
		this.didType1 = value;
	}
	
	/**
	 * Obtient la valeur de la propriété didType2.
	 * @return
	 * 		possible object is
	 *         {@link DidType2Type }
	 */
	public DidType2Type getDidType2() {
		return didType2;
	}
	
	/**
	 * Définit la valeur de la propriété didType2.
	 * @param value
	 *        allowed object is
	 *        {@link DidType2Type }
	 */
	public void setDidType2(DidType2Type value) {
		this.didType2 = value;
	}
	
}
