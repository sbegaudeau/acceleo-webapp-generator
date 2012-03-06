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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.Operation#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.pim.gen.backbone.model.backbone.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Operation
