/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link webapp.Attribute#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see webapp.WebappPackage#getAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link webapp.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link webapp.CardinalityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see webapp.CardinalityKind
	 * @see #setCardinality(CardinalityKind)
	 * @see webapp.WebappPackage#getAttribute_Cardinality()
	 * @model default="0" required="true"
	 * @generated
	 */
	CardinalityKind getCardinality();

	/**
	 * Sets the value of the '{@link webapp.Attribute#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see webapp.CardinalityKind
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityKind value);

} // Attribute
