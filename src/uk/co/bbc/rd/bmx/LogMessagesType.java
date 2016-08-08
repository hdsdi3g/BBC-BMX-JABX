//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour log_messages_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="log_messages_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_type">
 *       &lt;group ref="{http://bbc.co.uk/rd/bmx/201312}log_message" maxOccurs="unbounded"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "log_messages_type", propOrder = { "logMessage" })
public class LogMessagesType extends ArrayType {
	
	@XmlElementRefs({ @XmlElementRef(name = "info", namespace = "http://bbc.co.uk/rd/bmx/201312", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "warning", namespace = "http://bbc.co.uk/rd/bmx/201312", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "debug", namespace = "http://bbc.co.uk/rd/bmx/201312", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "error", namespace = "http://bbc.co.uk/rd/bmx/201312", type = JAXBElement.class, required = false) })
	protected List<JAXBElement<LogMessageType>> logMessage;
	
	/**
	 * Gets the value of the logMessage property.
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the logMessage property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLogMessage().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link LogMessageType }{@code >}
	 * {@link JAXBElement }{@code <}{@link LogMessageType }{@code >}
	 * {@link JAXBElement }{@code <}{@link LogMessageType }{@code >}
	 * {@link JAXBElement }{@code <}{@link LogMessageType }{@code >}
	 */
	public List<JAXBElement<LogMessageType>> getLogMessage() {
		if (logMessage == null) {
			logMessage = new ArrayList<JAXBElement<LogMessageType>>();
		}
		return this.logMessage;
	}
	
}
