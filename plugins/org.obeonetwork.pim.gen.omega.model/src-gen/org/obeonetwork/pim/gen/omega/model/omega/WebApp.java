/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.omega.model.omega;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.pim.gen.backbone.model.backbone.Application;

import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getSite <em>Site</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#getWebApp()
 * @model
 * @generated
 */
public interface WebApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(Site)
	 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#getWebApp_Site()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(Application)
	 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#getWebApp_Application()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // WebApp
