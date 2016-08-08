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
 * Classe Java pour crc32_check_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="crc32_check_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://bbc.co.uk/rd/bmx/201312}crc32_result_type"/>
 *         &lt;element name="error_count" type="{http://bbc.co.uk/rd/bmx/201312}duration_count_type"/>
 *         &lt;element name="check_count" type="{http://bbc.co.uk/rd/bmx/201312}duration_count_type"/>
 *         &lt;element name="total_read" type="{http://bbc.co.uk/rd/bmx/201312}duration_count_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crc32_check_type", propOrder = { "result", "errorCount", "checkCount", "totalRead" })
public class Crc32CheckType {
	
	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected Crc32ResultType result;
	@XmlElement(name = "error_count")
	@XmlSchemaType(name = "integer")
	protected long errorCount;
	@XmlElement(name = "check_count")
	@XmlSchemaType(name = "integer")
	protected long checkCount;
	@XmlElement(name = "total_read")
	@XmlSchemaType(name = "integer")
	protected long totalRead;
	
	/**
	 * Obtient la valeur de la propriété result.
	 * @return
	 * 		possible object is
	 *         {@link Crc32ResultType }
	 */
	public Crc32ResultType getResult() {
		return result;
	}
	
	/**
	 * Définit la valeur de la propriété result.
	 * @param value
	 *        allowed object is
	 *        {@link Crc32ResultType }
	 */
	public void setResult(Crc32ResultType value) {
		this.result = value;
	}
	
	/**
	 * Obtient la valeur de la propriété errorCount.
	 */
	public long getErrorCount() {
		return errorCount;
	}
	
	/**
	 * Définit la valeur de la propriété errorCount.
	 */
	public void setErrorCount(long value) {
		this.errorCount = value;
	}
	
	/**
	 * Obtient la valeur de la propriété checkCount.
	 */
	public long getCheckCount() {
		return checkCount;
	}
	
	/**
	 * Définit la valeur de la propriété checkCount.
	 */
	public void setCheckCount(long value) {
		this.checkCount = value;
	}
	
	/**
	 * Obtient la valeur de la propriété totalRead.
	 */
	public long getTotalRead() {
		return totalRead;
	}
	
	/**
	 * Définit la valeur de la propriété totalRead.
	 */
	public void setTotalRead(long value) {
		this.totalRead = value;
	}
	
}
