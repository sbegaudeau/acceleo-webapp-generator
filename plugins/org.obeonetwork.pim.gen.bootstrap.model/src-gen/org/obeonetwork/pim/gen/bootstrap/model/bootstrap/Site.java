/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.bootstrap.model.bootstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getPages <em>Pages</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getMainPage <em>Main Page</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getSite_Pages()
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite
	 * @model opposite="site" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Main Page</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Page</em>' containment reference.
	 * @see #setMainPage(MainPage)
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getSite_MainPage()
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getSite
	 * @model opposite="site" containment="true" required="true"
	 * @generated
	 */
	MainPage getMainPage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getMainPage <em>Main Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Page</em>' containment reference.
	 * @see #getMainPage()
	 * @generated
	 */
	void setMainPage(MainPage value);

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
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getSite_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Site
