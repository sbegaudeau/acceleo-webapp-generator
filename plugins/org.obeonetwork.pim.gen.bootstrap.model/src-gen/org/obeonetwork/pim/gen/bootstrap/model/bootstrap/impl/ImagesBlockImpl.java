/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage;
import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.ImagesBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Images Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.ImagesBlockImpl#getImagesPath <em>Images Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagesBlockImpl extends WidgetImpl implements ImagesBlock {
	/**
	 * The cached value of the '{@link #getImagesPath() <em>Images Path</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagesPath()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imagesPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagesBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.IMAGES_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImagesPath() {
		if (imagesPath == null) {
			imagesPath = new EDataTypeEList<String>(String.class, this, BootstrapPackage.IMAGES_BLOCK__IMAGES_PATH);
		}
		return imagesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.IMAGES_BLOCK__IMAGES_PATH:
				return getImagesPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.IMAGES_BLOCK__IMAGES_PATH:
				getImagesPath().clear();
				getImagesPath().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.IMAGES_BLOCK__IMAGES_PATH:
				getImagesPath().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.IMAGES_BLOCK__IMAGES_PATH:
				return imagesPath != null && !imagesPath.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imagesPath: "); //$NON-NLS-1$
		result.append(imagesPath);
		result.append(')');
		return result.toString();
	}

} //ImagesBlockImpl
