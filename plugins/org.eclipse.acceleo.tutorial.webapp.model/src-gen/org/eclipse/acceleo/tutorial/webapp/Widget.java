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
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Widget#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Widget#getSection <em>Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getWidget()
 * @model abstract="true"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getWidget_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Widget#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.Section#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' container reference.
	 * @see #setSection(Section)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getWidget_Section()
	 * @see org.eclipse.acceleo.tutorial.webapp.Section#getWidgets
	 * @model opposite="widgets" required="true" transient="false"
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Widget#getSection <em>Section</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' container reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

} // Widget
