/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.bootstrap.model.bootstrap;

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
 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.BootstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BootstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bootstrap"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/2012/bootstrap"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bootstrap"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SiteImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Main Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__MAIN_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.PageImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Site</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SITE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.MainPageImpl <em>Main Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.MainPageImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getMainPage()
	 * @generated
	 */
	int MAIN_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Site</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__SITE = 2;

	/**
	 * The number of structural features of the '<em>Main Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SectionImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__WIDGETS = 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PAGE = 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.WidgetImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SECTION = 1;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Form Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FORM_WIDGETS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TableImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_NAMES = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROW_NAMES = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STRIPED = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERED = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Column Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLUMN_NUMBER = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.VideoImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PATH = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.GalleryImpl <em>Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.GalleryImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getGallery()
	 * @generated
	 */
	int GALLERY = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Images Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__IMAGES_PATH = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.ImagesBlockImpl <em>Images Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.ImagesBlockImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getImagesBlock()
	 * @generated
	 */
	int IMAGES_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_BLOCK__TITLE = WIDGET__TITLE;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_BLOCK__SECTION = WIDGET__SECTION;

	/**
	 * The feature id for the '<em><b>Images Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_BLOCK__IMAGES_PATH = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Images Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_BLOCK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormWidgetImpl <em>Form Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormWidgetImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getFormWidget()
	 * @generated
	 */
	int FORM_WIDGET = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_WIDGET__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_WIDGET__FORM = 1;

	/**
	 * The number of structural features of the '<em>Form Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_WIDGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextAreaImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LABEL = FORM_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__FORM = FORM_WIDGET__FORM;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = FORM_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SpinnerImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LABEL = FORM_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__FORM = FORM_WIDGET__FORM;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__VALUES = FORM_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = FORM_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.CheckBoxImpl
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL = FORM_WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__FORM = FORM_WIDGET__FORM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DESCRIPTION = FORM_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = FORM_WIDGET_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getPages()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getMainPage <em>Main Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Page</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getMainPage()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_MainPage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Site#getTitle()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Title();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getDescription()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSections()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Sections();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Site</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getSite()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Site();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage <em>Main Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Page</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage
	 * @generated
	 */
	EClass getMainPage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getTitle()
	 * @see #getMainPage()
	 * @generated
	 */
	EAttribute getMainPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getDescription()
	 * @see #getMainPage()
	 * @generated
	 */
	EAttribute getMainPage_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Site</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.MainPage#getSite()
	 * @see #getMainPage()
	 * @generated
	 */
	EReference getMainPage_Site();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getDescription()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getWidgets()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Widgets();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Section#getPage()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Page();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget#getTitle()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Title();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Section</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Widget#getSection()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Section();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Form#getFormWidgets <em>Form Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Widgets</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Form#getFormWidgets()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_FormWidgets();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#getColumnNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ColumnNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#getRowNames <em>Row Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Row Names</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#getRowNames()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RowNames();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#isStriped <em>Striped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Striped</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#isStriped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Striped();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#isBordered <em>Bordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordered</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Table#isBordered()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Bordered();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Text#getColumnNumber <em>Column Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Number</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Text#getColumnNumber()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ColumnNumber();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Video#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Video#getPath()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Path();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Gallery <em>Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Gallery
	 * @generated
	 */
	EClass getGallery();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Gallery#getImagesPath <em>Images Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Images Path</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Gallery#getImagesPath()
	 * @see #getGallery()
	 * @generated
	 */
	EAttribute getGallery_ImagesPath();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.ImagesBlock <em>Images Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Images Block</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.ImagesBlock
	 * @generated
	 */
	EClass getImagesBlock();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.ImagesBlock#getImagesPath <em>Images Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Images Path</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.ImagesBlock#getImagesPath()
	 * @see #getImagesBlock()
	 * @generated
	 */
	EAttribute getImagesBlock_ImagesPath();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget <em>Form Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Widget</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget
	 * @generated
	 */
	EClass getFormWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getLabel()
	 * @see #getFormWidget()
	 * @generated
	 */
	EAttribute getFormWidget_Label();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.FormWidget#getForm()
	 * @see #getFormWidget()
	 * @generated
	 */
	EReference getFormWidget_Form();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for the attribute list '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Spinner#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.Spinner#getValues()
	 * @see #getSpinner()
	 * @generated
	 */
	EAttribute getSpinner_Values();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.CheckBox#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.CheckBox#getDescription()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BootstrapFactory getBootstrapFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SiteImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__PAGES = eINSTANCE.getSite_Pages();

		/**
		 * The meta object literal for the '<em><b>Main Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__MAIN_PAGE = eINSTANCE.getSite_MainPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__TITLE = eINSTANCE.getSite_Title();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.PageImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DESCRIPTION = eINSTANCE.getPage_Description();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SECTIONS = eINSTANCE.getPage_Sections();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SITE = eINSTANCE.getPage_Site();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.MainPageImpl <em>Main Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.MainPageImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getMainPage()
		 * @generated
		 */
		EClass MAIN_PAGE = eINSTANCE.getMainPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PAGE__TITLE = eINSTANCE.getMainPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PAGE__DESCRIPTION = eINSTANCE.getMainPage_Description();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PAGE__SITE = eINSTANCE.getMainPage_Site();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SectionImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__DESCRIPTION = eINSTANCE.getSection_Description();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__WIDGETS = eINSTANCE.getSection_Widgets();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PAGE = eINSTANCE.getSection_Page();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.WidgetImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TITLE = eINSTANCE.getWidget_Title();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SECTION = eINSTANCE.getWidget_Section();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Form Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__FORM_WIDGETS = eINSTANCE.getForm_FormWidgets();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TableImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__COLUMN_NAMES = eINSTANCE.getTable_ColumnNames();

		/**
		 * The meta object literal for the '<em><b>Row Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ROW_NAMES = eINSTANCE.getTable_RowNames();

		/**
		 * The meta object literal for the '<em><b>Striped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__STRIPED = eINSTANCE.getTable_Striped();

		/**
		 * The meta object literal for the '<em><b>Bordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDERED = eINSTANCE.getTable_Bordered();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Column Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__COLUMN_NUMBER = eINSTANCE.getText_ColumnNumber();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.VideoImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__PATH = eINSTANCE.getVideo_Path();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.GalleryImpl <em>Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.GalleryImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getGallery()
		 * @generated
		 */
		EClass GALLERY = eINSTANCE.getGallery();

		/**
		 * The meta object literal for the '<em><b>Images Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY__IMAGES_PATH = eINSTANCE.getGallery_ImagesPath();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.ImagesBlockImpl <em>Images Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.ImagesBlockImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getImagesBlock()
		 * @generated
		 */
		EClass IMAGES_BLOCK = eINSTANCE.getImagesBlock();

		/**
		 * The meta object literal for the '<em><b>Images Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_BLOCK__IMAGES_PATH = eINSTANCE.getImagesBlock_ImagesPath();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormWidgetImpl <em>Form Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.FormWidgetImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getFormWidget()
		 * @generated
		 */
		EClass FORM_WIDGET = eINSTANCE.getFormWidget();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_WIDGET__LABEL = eINSTANCE.getFormWidget_Label();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_WIDGET__FORM = eINSTANCE.getFormWidget_Form();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.TextAreaImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.SpinnerImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getSpinner()
		 * @generated
		 */
		EClass SPINNER = eINSTANCE.getSpinner();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPINNER__VALUES = eINSTANCE.getSpinner_Values();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.CheckBoxImpl
		 * @see org.obeonetwork.pim.gen.bootstrap.model.bootstrap.impl.BootstrapPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__DESCRIPTION = eINSTANCE.getCheckBox_Description();

	}

} //BootstrapPackage
