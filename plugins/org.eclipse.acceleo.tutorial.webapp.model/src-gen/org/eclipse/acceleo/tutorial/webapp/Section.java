/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Section#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Section#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Section#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
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
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSection_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Section#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSection_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Section#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.acceleo.tutorial.webapp.Widget}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.Widget#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSection_Widgets()
	 * @see org.eclipse.acceleo.tutorial.webapp.Widget#getSection
	 * @model opposite="section" containment="true" required="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

	/**
	 * Returns the value of the '<em><b>View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.StaticView#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' container reference.
	 * @see #setView(StaticView)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getSection_View()
	 * @see org.eclipse.acceleo.tutorial.webapp.StaticView#getSections
	 * @model opposite="sections" required="true" transient="false"
	 * @generated
	 */
	StaticView getView();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Section#getView <em>View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' container reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(StaticView value);

} // Section
