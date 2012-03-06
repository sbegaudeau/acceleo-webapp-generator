/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.pim.gen.backbone.model.backbone.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BackboneFactoryImpl extends EFactoryImpl implements BackboneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BackboneFactory init() {
		try {
			BackboneFactory theBackboneFactory = (BackboneFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/2012/backbone"); //$NON-NLS-1$ 
			if (theBackboneFactory != null) {
				return theBackboneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BackboneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BackbonePackage.APPLICATION: return createApplication();
			case BackbonePackage.MODEL: return createModel();
			case BackbonePackage.ATTRIBUTE: return createAttribute();
			case BackbonePackage.REFERENCE: return createReference();
			case BackbonePackage.OPERATION: return createOperation();
			case BackbonePackage.PARAMETER: return createParameter();
			case BackbonePackage.COLLECTION: return createCollection();
			case BackbonePackage.ROUTER: return createRouter();
			case BackbonePackage.ROUTER_MAPPING: return createRouterMapping();
			case BackbonePackage.VIEW: return createView();
			case BackbonePackage.CONTENT_PAGE: return createContentPage();
			case BackbonePackage.TEMPLATE_PAGE: return createTemplatePage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterMapping createRouterMapping() {
		RouterMappingImpl routerMapping = new RouterMappingImpl();
		return routerMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPage createContentPage() {
		ContentPageImpl contentPage = new ContentPageImpl();
		return contentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatePage createTemplatePage() {
		TemplatePageImpl templatePage = new TemplatePageImpl();
		return templatePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackbonePackage getBackbonePackage() {
		return (BackbonePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BackbonePackage getPackage() {
		return BackbonePackage.eINSTANCE;
	}

} //BackboneFactoryImpl
