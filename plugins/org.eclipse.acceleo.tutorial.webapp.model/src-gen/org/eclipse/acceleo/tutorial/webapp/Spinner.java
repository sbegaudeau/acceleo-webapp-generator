/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Spinner#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends FormWidget {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSpinner_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

} // Spinner
