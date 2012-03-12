/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.bootstrap.model.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Form#getFormWidgets <em>Form Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Widget {
	/**
	 * Returns the value of the '<em><b>Form Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Widgets</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getForm_FormWidgets()
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getForm
	 * @model opposite="form" containment="true" required="true"
	 * @generated
	 */
	EList<FormWidget> getFormWidgets();

} // Form
