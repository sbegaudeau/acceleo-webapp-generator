/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.FormWidget#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.FormWidget#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getFormWidget()
 * @model abstract="true"
 * @generated
 */
public interface FormWidget extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getFormWidget_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.FormWidget#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.Form#getFormWidgets <em>Form Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' container reference.
	 * @see #setForm(Form)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getFormWidget_Form()
	 * @see org.eclipse.acceleo.tutorial.webapp.Form#getFormWidgets
	 * @model opposite="formWidgets" required="true" transient="false"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.FormWidget#getForm <em>Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' container reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

} // FormWidget
