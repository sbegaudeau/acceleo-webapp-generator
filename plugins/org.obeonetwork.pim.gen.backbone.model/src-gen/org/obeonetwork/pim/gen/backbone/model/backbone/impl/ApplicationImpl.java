/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.pim.gen.backbone.model.backbone.Application;
import org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage;
import org.obeonetwork.pim.gen.backbone.model.backbone.Collection;
import org.obeonetwork.pim.gen.backbone.model.backbone.Model;
import org.obeonetwork.pim.gen.backbone.model.backbone.Page;
import org.obeonetwork.pim.gen.backbone.model.backbone.Router;
import org.obeonetwork.pim.gen.backbone.model.backbone.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
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
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> collections;

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
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

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
		return BackbonePackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, BackbonePackage.APPLICATION__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<Collection>(Collection.class, this, BackbonePackage.APPLICATION__COLLECTIONS);
		}
		return collections;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BackbonePackage.APPLICATION__ROUTER, oldRouter, newRouter);
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
				msgs = ((InternalEObject)router).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BackbonePackage.APPLICATION__ROUTER, null, msgs);
			if (newRouter != null)
				msgs = ((InternalEObject)newRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BackbonePackage.APPLICATION__ROUTER, null, msgs);
			msgs = basicSetRouter(newRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackbonePackage.APPLICATION__ROUTER, newRouter, newRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, BackbonePackage.APPLICATION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, BackbonePackage.APPLICATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BackbonePackage.APPLICATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case BackbonePackage.APPLICATION__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case BackbonePackage.APPLICATION__ROUTER:
				return basicSetRouter(null, msgs);
			case BackbonePackage.APPLICATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case BackbonePackage.APPLICATION__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case BackbonePackage.APPLICATION__MODELS:
				return getModels();
			case BackbonePackage.APPLICATION__COLLECTIONS:
				return getCollections();
			case BackbonePackage.APPLICATION__ROUTER:
				return getRouter();
			case BackbonePackage.APPLICATION__VIEWS:
				return getViews();
			case BackbonePackage.APPLICATION__PAGES:
				return getPages();
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
			case BackbonePackage.APPLICATION__MODELS:
				getModels().clear();
				getModels().addAll((java.util.Collection<? extends Model>)newValue);
				return;
			case BackbonePackage.APPLICATION__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case BackbonePackage.APPLICATION__ROUTER:
				setRouter((Router)newValue);
				return;
			case BackbonePackage.APPLICATION__VIEWS:
				getViews().clear();
				getViews().addAll((java.util.Collection<? extends View>)newValue);
				return;
			case BackbonePackage.APPLICATION__PAGES:
				getPages().clear();
				getPages().addAll((java.util.Collection<? extends Page>)newValue);
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
			case BackbonePackage.APPLICATION__MODELS:
				getModels().clear();
				return;
			case BackbonePackage.APPLICATION__COLLECTIONS:
				getCollections().clear();
				return;
			case BackbonePackage.APPLICATION__ROUTER:
				setRouter((Router)null);
				return;
			case BackbonePackage.APPLICATION__VIEWS:
				getViews().clear();
				return;
			case BackbonePackage.APPLICATION__PAGES:
				getPages().clear();
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
			case BackbonePackage.APPLICATION__MODELS:
				return models != null && !models.isEmpty();
			case BackbonePackage.APPLICATION__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case BackbonePackage.APPLICATION__ROUTER:
				return router != null;
			case BackbonePackage.APPLICATION__VIEWS:
				return views != null && !views.isEmpty();
			case BackbonePackage.APPLICATION__PAGES:
				return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
