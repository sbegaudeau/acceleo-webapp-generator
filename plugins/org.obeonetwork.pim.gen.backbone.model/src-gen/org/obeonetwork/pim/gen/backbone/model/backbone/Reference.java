/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Reference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getReference_Type()
	 * @model
	 * @generated
	 */
	EList<Model> getType();

} // Reference
