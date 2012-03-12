/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.omega.model.omega.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.pim.gen.backbone.model.backbone.BackbonePackage;

import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage;

import org.obeonetwork.pim.gen.omega.model.omega.BackbonePage;
import org.obeonetwork.pim.gen.omega.model.omega.OmegaFactory;
import org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage;
import org.obeonetwork.pim.gen.omega.model.omega.WebApp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmegaPackageImpl extends EPackageImpl implements OmegaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backbonePageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OmegaPackageImpl() {
		super(eNS_URI, OmegaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OmegaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OmegaPackage init() {
		if (isInited) return (OmegaPackage)EPackage.Registry.INSTANCE.getEPackage(OmegaPackage.eNS_URI);

		// Obtain or create and register package
		OmegaPackageImpl theOmegaPackage = (OmegaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OmegaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OmegaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BackbonePackage.eINSTANCE.eClass();
		BootstrapPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOmegaPackage.createPackageContents();

		// Initialize created meta-data
		theOmegaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOmegaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OmegaPackage.eNS_URI, theOmegaPackage);
		return theOmegaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApp() {
		return webAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApp_Site() {
		return (EReference)webAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebApp_Application() {
		return (EReference)webAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackbonePage() {
		return backbonePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackbonePage_View() {
		return (EReference)backbonePageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmegaFactory getOmegaFactory() {
		return (OmegaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webAppEClass = createEClass(WEB_APP);
		createEReference(webAppEClass, WEB_APP__SITE);
		createEReference(webAppEClass, WEB_APP__APPLICATION);

		backbonePageEClass = createEClass(BACKBONE_PAGE);
		createEReference(backbonePageEClass, BACKBONE_PAGE__VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		BackbonePackage theBackbonePackage = (BackbonePackage)EPackage.Registry.INSTANCE.getEPackage(BackbonePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		backbonePageEClass.getESuperTypes().add(theBootstrapPackage.getPage());

		// Initialize classes and features; add operations and parameters
		initEClass(webAppEClass, WebApp.class, "WebApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebApp_Site(), theBootstrapPackage.getSite(), null, "site", null, 1, 1, WebApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebApp_Application(), theBackbonePackage.getApplication(), null, "application", null, 1, 1, WebApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backbonePageEClass, BackbonePage.class, "BackbonePage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackbonePage_View(), theBackbonePackage.getView(), null, "view", null, 1, 1, BackbonePage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OmegaPackageImpl
