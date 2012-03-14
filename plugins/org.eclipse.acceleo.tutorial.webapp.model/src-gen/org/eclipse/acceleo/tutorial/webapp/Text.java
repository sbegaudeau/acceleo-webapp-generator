/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Text#getColumnNumber <em>Column Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Widget {
	/**
	 * Returns the value of the '<em><b>Column Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Number</em>' attribute.
	 * @see #setColumnNumber(int)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getText_ColumnNumber()
	 * @model required="true"
	 * @generated
	 */
	int getColumnNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Text#getColumnNumber <em>Column Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Number</em>' attribute.
	 * @see #getColumnNumber()
	 * @generated
	 */
	void setColumnNumber(int value);

} // Text
