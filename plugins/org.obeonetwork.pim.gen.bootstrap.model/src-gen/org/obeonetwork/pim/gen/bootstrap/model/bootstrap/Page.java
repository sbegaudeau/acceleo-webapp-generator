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
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSections <em>Sections</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite <em>Site</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
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
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getTitle <em>Title</em>}' attribute.
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
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage_Sections()
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getPage
	 * @model opposite="page" containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' container reference.
	 * @see #setSite(Site)
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage_Site()
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getPages
	 * @model opposite="pages" required="true" transient="false"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite <em>Site</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' container reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage#getPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
