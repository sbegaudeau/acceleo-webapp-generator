/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.backbone.model.backbone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.obeonetwork.pim.gen.backbone.model.backbone.BackboneFactory
 * @model kind="package"
 * @generated
 */
public interface BackbonePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "backbone"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/2012/backbone"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "backbone"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackbonePackage eINSTANCE = org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODELS = 0;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COLLECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROUTER = 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VIEWS = 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PAGES = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.NamedElementImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ModelImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.AttributeImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ReferenceImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.OperationImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ParameterImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.CollectionImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterMappingImpl <em>Router Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterMappingImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getRouterMapping()
	 * @generated
	 */
	int ROUTER_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MAPPING__PATH = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MAPPING__VIEW = 1;

	/**
	 * The number of structural features of the '<em>Router Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ViewImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.PageImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ContentPageImpl <em>Content Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ContentPageImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getContentPage()
	 * @generated
	 */
	int CONTENT_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PAGE__NAME = PAGE__NAME;

	/**
	 * The number of structural features of the '<em>Content Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.TemplatePageImpl <em>Template Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.TemplatePageImpl
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getTemplatePage()
	 * @generated
	 */
	int TEMPLATE_PAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PAGE__NAME = PAGE__NAME;

	/**
	 * The number of structural features of the '<em>Template Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application#getModels()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application#getCollections()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Collections();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Router</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application#getRouter()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Router();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application#getViews()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Application#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Application#getPages()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Pages();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.backbone.model.backbone.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Model#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Model#getAttributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Model#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Model#getReferences()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_References();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Model#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Model#getOperations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Operations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Collection#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Collection#getModel()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Model();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Router#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Router#getMappings()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Mappings();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping <em>Router Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Mapping</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping
	 * @generated
	 */
	EClass getRouterMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getPath()
	 * @see #getRouterMapping()
	 * @generated
	 */
	EAttribute getRouterMapping_Path();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.RouterMapping#getView()
	 * @see #getRouterMapping()
	 * @generated
	 */
	EReference getRouterMapping_View();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.pim.gen.backbone.model.backbone.View#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.View#getOperations()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Operations();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.pim.gen.backbone.model.backbone.View#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.View#getPage()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Page();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.ContentPage <em>Content Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Page</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.ContentPage
	 * @generated
	 */
	EClass getContentPage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.backbone.model.backbone.TemplatePage <em>Template Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Page</em>'.
	 * @see org.obeonetwork.pim.gen.backbone.model.backbone.TemplatePage
	 * @generated
	 */
	EClass getTemplatePage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BackboneFactory getBackboneFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ApplicationImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODELS = eINSTANCE.getApplication_Models();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COLLECTIONS = eINSTANCE.getApplication_Collections();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ROUTER = eINSTANCE.getApplication_Router();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__VIEWS = eINSTANCE.getApplication_Views();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PAGES = eINSTANCE.getApplication_Pages();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.NamedElementImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ModelImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REFERENCES = eINSTANCE.getModel_References();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPERATIONS = eINSTANCE.getModel_Operations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.AttributeImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ReferenceImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.OperationImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ParameterImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.CollectionImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__MODEL = eINSTANCE.getCollection_Model();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__MAPPINGS = eINSTANCE.getRouter_Mappings();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterMappingImpl <em>Router Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.RouterMappingImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getRouterMapping()
		 * @generated
		 */
		EClass ROUTER_MAPPING = eINSTANCE.getRouterMapping();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_MAPPING__PATH = eINSTANCE.getRouterMapping_Path();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_MAPPING__VIEW = eINSTANCE.getRouterMapping_View();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ViewImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__OPERATIONS = eINSTANCE.getView_Operations();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__PAGE = eINSTANCE.getView_Page();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.PageImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.ContentPageImpl <em>Content Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.ContentPageImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getContentPage()
		 * @generated
		 */
		EClass CONTENT_PAGE = eINSTANCE.getContentPage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.backbone.model.backbone.impl.TemplatePageImpl <em>Template Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.TemplatePageImpl
		 * @see org.obeonetwork.pim.gen.backbone.model.backbone.impl.BackbonePackageImpl#getTemplatePage()
		 * @generated
		 */
		EClass TEMPLATE_PAGE = eINSTANCE.getTemplatePage();

	}

} //BackbonePackage
