/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Collection#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getCollection_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Collection#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Collection
