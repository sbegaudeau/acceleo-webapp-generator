/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.omega.model.omega;

import org.obeonetwork.pim.gen.backbone.model.backbone.View;

import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backbone Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.omega.model.omega.BackbonePage#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#getBackbonePage()
 * @model
 * @generated
 */
public interface BackbonePage extends Page {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#getBackbonePage_View()
	 * @model required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.omega.model.omega.BackbonePage#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // BackbonePage
