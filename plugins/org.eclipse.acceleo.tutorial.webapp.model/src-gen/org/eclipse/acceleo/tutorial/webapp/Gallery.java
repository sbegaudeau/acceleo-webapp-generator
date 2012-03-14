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
 * A representation of the model object '<em><b>Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Gallery#getImagesPath <em>Images Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getGallery()
 * @model
 * @generated
 */
public interface Gallery extends Widget {
	/**
	 * Returns the value of the '<em><b>Images Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images Path</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images Path</em>' attribute list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getGallery_ImagesPath()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getImagesPath();

} // Gallery
