/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getModels <em>Models</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getCollections <em>Collections</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getRouter <em>Router</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference.
	 * @see #setRouter(Router)
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication_Router()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Router getRouter();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getRouter <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' containment reference.
	 * @see #getRouter()
	 * @generated
	 */
	void setRouter(Router value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getApplication_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Application
