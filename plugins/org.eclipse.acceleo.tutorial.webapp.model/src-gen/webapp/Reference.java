/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Reference#getType <em>Type</em>}</li>
 *   <li>{@link webapp.Reference#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Model)
	 * @see webapp.WebappPackage#getReference_Type()
	 * @model required="true"
	 * @generated
	 */
	Model getType();

	/**
	 * Sets the value of the '{@link webapp.Reference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Model value);

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
	 * @see webapp.WebappPackage#getReference_Cardinality()
	 * @model default="0" required="true"
	 * @generated
	 */
	CardinalityKind getCardinality();

	/**
	 * Sets the value of the '{@link webapp.Reference#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see webapp.CardinalityKind
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityKind value);

} // Reference
