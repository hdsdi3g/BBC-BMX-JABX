//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.08.05 à 03:51:24 AM CEST 
//

package uk.co.bbc.rd.bmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour user_comments_type complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="user_comments_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bbc.co.uk/rd/bmx/201312}array_type">
 *       &lt;sequence>
 *         &lt;element name="user_comment" type="{http://bbc.co.uk/rd/bmx/201312}tagged_value_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_comments_type", propOrder = { "userComment" })
public class UserCommentsType extends ArrayType {
	
	@XmlElement(name = "user_comment", required = true)
	protected List<TaggedValueType> userComment;
	
	/**
	 * Gets the value of the userComment property.
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the userComment property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getUserComment().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TaggedValueType }
	 */
	public List<TaggedValueType> getUserComment() {
		if (userComment == null) {
			userComment = new ArrayList<TaggedValueType>();
		}
		return this.userComment;
	}
	
}
