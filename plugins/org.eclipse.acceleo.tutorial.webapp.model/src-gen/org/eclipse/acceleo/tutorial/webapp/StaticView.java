/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.StaticView#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getStaticView()
 * @model
 * @generated
 */
public interface StaticView extends AbstractView {

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.acceleo.tutorial.webapp.Section}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.acceleo.tutorial.webapp.Section#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getStaticView_Sections()
	 * @see org.eclipse.acceleo.tutorial.webapp.Section#getView
	 * @model opposite="view" containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();
} // StaticView
