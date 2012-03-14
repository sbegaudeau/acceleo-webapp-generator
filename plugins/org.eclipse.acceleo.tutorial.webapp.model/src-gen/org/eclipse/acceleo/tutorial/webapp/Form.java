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
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Form#getFormWidgets <em>Form Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Widget {
	/**
	 * Returns the value of the '<em><b>Form Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.acceleo.tutorial.webapp.FormWidget}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.FormWidget#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Widgets</em>' containment reference list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getForm_FormWidgets()
	 * @see org.eclipse.acceleo.tutorial.webapp.FormWidget#getForm
	 * @model opposite="form" containment="true" required="true"
	 * @generated
	 */
	EList<FormWidget> getFormWidgets();

} // Form
