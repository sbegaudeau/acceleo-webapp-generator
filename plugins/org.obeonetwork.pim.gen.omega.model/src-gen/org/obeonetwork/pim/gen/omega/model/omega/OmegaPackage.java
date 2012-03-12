/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.omega.model.omega;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaFactory
 * @model kind="package"
 * @generated
 */
public interface OmegaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "omega";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/omega";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "omega";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OmegaPackage eINSTANCE = org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.omega.model.omega.impl.WebAppImpl <em>Web App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.WebAppImpl
	 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaPackageImpl#getWebApp()
	 * @generated
	 */
	int WEB_APP = 0;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__SITE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__APPLICATION = 1;

	/**
	 * The number of structural features of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.omega.model.omega.impl.BackbonePageImpl <em>Backbone Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.BackbonePageImpl
	 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaPackageImpl#getBackbonePage()
	 * @generated
	 */
	int BACKBONE_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__TITLE = BootstrapPackage.PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__DESCRIPTION = BootstrapPackage.PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__SECTIONS = BootstrapPackage.PAGE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Site</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__SITE = BootstrapPackage.PAGE__SITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__NAME = BootstrapPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE__VIEW = BootstrapPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_PAGE_FEATURE_COUNT = BootstrapPackage.PAGE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App</em>'.
	 * @see org.obeonetwork.pim.gen.omega.model.omega.WebApp
	 * @generated
	 */
	EClass getWebApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see org.obeonetwork.pim.gen.omega.model.omega.WebApp#getSite()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Site();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.pim.gen.omega.model.omega.WebApp#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see org.obeonetwork.pim.gen.omega.model.omega.WebApp#getApplication()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Application();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.omega.model.omega.BackbonePage <em>Backbone Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Page</em>'.
	 * @see org.obeonetwork.pim.gen.omega.model.omega.BackbonePage
	 * @generated
	 */
	EClass getBackbonePage();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.pim.gen.omega.model.omega.BackbonePage#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.obeonetwork.pim.gen.omega.model.omega.BackbonePage#getView()
	 * @see #getBackbonePage()
	 * @generated
	 */
	EReference getBackbonePage_View();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OmegaFactory getOmegaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.omega.model.omega.impl.WebAppImpl <em>Web App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.WebAppImpl
		 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaPackageImpl#getWebApp()
		 * @generated
		 */
		EClass WEB_APP = eINSTANCE.getWebApp();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__SITE = eINSTANCE.getWebApp_Site();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__APPLICATION = eINSTANCE.getWebApp_Application();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.omega.model.omega.impl.BackbonePageImpl <em>Backbone Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.BackbonePageImpl
		 * @see org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaPackageImpl#getBackbonePage()
		 * @generated
		 */
		EClass BACKBONE_PAGE = eINSTANCE.getBackbonePage();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_PAGE__VIEW = eINSTANCE.getBackbonePage_View();

	}

} //OmegaPackage
