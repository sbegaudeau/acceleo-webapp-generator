/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp.impl;

import org.eclipse.acceleo.tutorial.webapp.AbstractView;
import org.eclipse.acceleo.tutorial.webapp.Application;
import org.eclipse.acceleo.tutorial.webapp.Collection;
import org.eclipse.acceleo.tutorial.webapp.Model;
import org.eclipse.acceleo.tutorial.webapp.Router;
import org.eclipse.acceleo.tutorial.webapp.WebappPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.ApplicationImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.ApplicationImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.ApplicationImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.ApplicationImpl#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends NamedElementImpl implements Application {
	/**
	 * The cached value of the '{@link #getRouter() <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter()
	 * @generated
	 * @ordered
	 */
	protected Router router;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> collections;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractView> views;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router getRouter() {
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouter(Router newRouter, NotificationChain msgs) {
		Router oldRouter = router;
		router = newRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.APPLICATION__ROUTER, oldRouter, newRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouter(Router newRouter) {
		if (newRouter != router) {
			NotificationChain msgs = null;
			if (router != null)
				msgs = ((InternalEObject)router).eInverseRemove(this, WebappPackage.ROUTER__APPLICATION, Router.class, msgs);
			if (newRouter != null)
				msgs = ((InternalEObject)newRouter).eInverseAdd(this, WebappPackage.ROUTER__APPLICATION, Router.class, msgs);
			msgs = basicSetRouter(newRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.APPLICATION__ROUTER, newRouter, newRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentWithInverseEList<Collection>(Collection.class, this, WebappPackage.APPLICATION__COLLECTIONS, WebappPackage.COLLECTION__APPLICATION);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractView> getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList<AbstractView>(AbstractView.class, this, WebappPackage.APPLICATION__VIEWS, WebappPackage.ABSTRACT_VIEW__APPLICATION);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<Model>(Model.class, this, WebappPackage.APPLICATION__MODELS, WebappPackage.MODEL__APPLICATION);
		}
		return models;
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
			case WebappPackage.APPLICATION__ROUTER:
				if (router != null)
					msgs = ((InternalEObject)router).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.APPLICATION__ROUTER, null, msgs);
				return basicSetRouter((Router)otherEnd, msgs);
			case WebappPackage.APPLICATION__COLLECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCollections()).basicAdd(otherEnd, msgs);
			case WebappPackage.APPLICATION__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
			case WebappPackage.APPLICATION__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
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
			case WebappPackage.APPLICATION__ROUTER:
				return basicSetRouter(null, msgs);
			case WebappPackage.APPLICATION__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case WebappPackage.APPLICATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case WebappPackage.APPLICATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.APPLICATION__ROUTER:
				return getRouter();
			case WebappPackage.APPLICATION__COLLECTIONS:
				return getCollections();
			case WebappPackage.APPLICATION__VIEWS:
				return getViews();
			case WebappPackage.APPLICATION__MODELS:
				return getModels();
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
			case WebappPackage.APPLICATION__ROUTER:
				setRouter((Router)newValue);
				return;
			case WebappPackage.APPLICATION__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case WebappPackage.APPLICATION__VIEWS:
				getViews().clear();
				getViews().addAll((java.util.Collection<? extends AbstractView>)newValue);
				return;
			case WebappPackage.APPLICATION__MODELS:
				getModels().clear();
				getModels().addAll((java.util.Collection<? extends Model>)newValue);
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
			case WebappPackage.APPLICATION__ROUTER:
				setRouter((Router)null);
				return;
			case WebappPackage.APPLICATION__COLLECTIONS:
				getCollections().clear();
				return;
			case WebappPackage.APPLICATION__VIEWS:
				getViews().clear();
				return;
			case WebappPackage.APPLICATION__MODELS:
				getModels().clear();
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
			case WebappPackage.APPLICATION__ROUTER:
				return router != null;
			case WebappPackage.APPLICATION__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case WebappPackage.APPLICATION__VIEWS:
				return views != null && !views.isEmpty();
			case WebappPackage.APPLICATION__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
