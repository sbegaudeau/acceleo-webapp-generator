/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp.impl;

import java.util.Collection;

import org.eclipse.acceleo.tutorial.webapp.Form;
import org.eclipse.acceleo.tutorial.webapp.FormWidget;
import org.eclipse.acceleo.tutorial.webapp.WebappPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.FormImpl#getFormWidgets <em>Form Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends WidgetImpl implements Form {
	/**
	 * The cached value of the '{@link #getFormWidgets() <em>Form Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<FormWidget> formWidgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormWidget> getFormWidgets() {
		if (formWidgets == null) {
			formWidgets = new EObjectContainmentWithInverseEList<FormWidget>(FormWidget.class, this, WebappPackage.FORM__FORM_WIDGETS, WebappPackage.FORM_WIDGET__FORM);
		}
		return formWidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.FORM__FORM_WIDGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormWidgets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.FORM__FORM_WIDGETS:
				return ((InternalEList<?>)getFormWidgets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.FORM__FORM_WIDGETS:
				return getFormWidgets();
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
			case WebappPackage.FORM__FORM_WIDGETS:
				getFormWidgets().clear();
				getFormWidgets().addAll((Collection<? extends FormWidget>)newValue);
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
			case WebappPackage.FORM__FORM_WIDGETS:
				getFormWidgets().clear();
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
			case WebappPackage.FORM__FORM_WIDGETS:
				return formWidgets != null && !formWidgets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormImpl
