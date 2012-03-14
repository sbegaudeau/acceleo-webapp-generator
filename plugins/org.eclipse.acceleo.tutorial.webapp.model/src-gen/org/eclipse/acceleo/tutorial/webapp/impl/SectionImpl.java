/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp.impl;

import java.util.Collection;

import org.eclipse.acceleo.tutorial.webapp.Section;
import org.eclipse.acceleo.tutorial.webapp.StaticView;
import org.eclipse.acceleo.tutorial.webapp.WebappPackage;
import org.eclipse.acceleo.tutorial.webapp.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.SectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.SectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.SectionImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.SectionImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends EObjectImpl implements Section {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.SECTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.SECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentWithInverseEList<Widget>(Widget.class, this, WebappPackage.SECTION__WIDGETS, WebappPackage.WIDGET__SECTION);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticView getView() {
		if (eContainerFeatureID() != WebappPackage.SECTION__VIEW) return null;
		return (StaticView)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(StaticView newView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newView, WebappPackage.SECTION__VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(StaticView newView) {
		if (newView != eInternalContainer() || (eContainerFeatureID() != WebappPackage.SECTION__VIEW && newView != null)) {
			if (EcoreUtil.isAncestor(this, newView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, WebappPackage.STATIC_VIEW__SECTIONS, StaticView.class, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.SECTION__VIEW, newView, newView));
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
			case WebappPackage.SECTION__WIDGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWidgets()).basicAdd(otherEnd, msgs);
			case WebappPackage.SECTION__VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetView((StaticView)otherEnd, msgs);
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
			case WebappPackage.SECTION__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case WebappPackage.SECTION__VIEW:
				return basicSetView(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebappPackage.SECTION__VIEW:
				return eInternalContainer().eInverseRemove(this, WebappPackage.STATIC_VIEW__SECTIONS, StaticView.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.SECTION__TITLE:
				return getTitle();
			case WebappPackage.SECTION__DESCRIPTION:
				return getDescription();
			case WebappPackage.SECTION__WIDGETS:
				return getWidgets();
			case WebappPackage.SECTION__VIEW:
				return getView();
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
			case WebappPackage.SECTION__TITLE:
				setTitle((String)newValue);
				return;
			case WebappPackage.SECTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebappPackage.SECTION__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case WebappPackage.SECTION__VIEW:
				setView((StaticView)newValue);
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
			case WebappPackage.SECTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebappPackage.SECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebappPackage.SECTION__WIDGETS:
				getWidgets().clear();
				return;
			case WebappPackage.SECTION__VIEW:
				setView((StaticView)null);
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
			case WebappPackage.SECTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebappPackage.SECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebappPackage.SECTION__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case WebappPackage.SECTION__VIEW:
				return getView() != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
