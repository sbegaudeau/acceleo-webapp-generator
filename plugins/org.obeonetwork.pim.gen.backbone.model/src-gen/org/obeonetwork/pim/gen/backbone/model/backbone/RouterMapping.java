/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getPath <em>Path</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getRouterMapping()
 * @model
 * @generated
 */
public interface RouterMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getRouterMapping_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getRouterMapping_View()
	 * @model required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // RouterMapping
