/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Application#getRouter <em>Router</em>}</li>
 *   <li>{@link webapp.Application#getCollections <em>Collections</em>}</li>
 *   <li>{@link webapp.Application#getViews <em>Views</em>}</li>
 *   <li>{@link webapp.Application#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webapp.Router#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference.
	 * @see #setRouter(Router)
	 * @see webapp.WebappPackage#getApplication_Router()
	 * @see webapp.Router#getApplication
	 * @model opposite="application" containment="true" required="true"
	 * @generated
	 */
	Router getRouter();

	/**
	 * Sets the value of the '{@link webapp.Application#getRouter <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' containment reference.
	 * @see #getRouter()
	 * @generated
	 */
	void setRouter(Router value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Collection}.
	 * It is bidirectional and its opposite is '{@link webapp.Collection#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see webapp.WebappPackage#getApplication_Collections()
	 * @see webapp.Collection#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.AbstractView}.
	 * It is bidirectional and its opposite is '{@link webapp.AbstractView#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see webapp.WebappPackage#getApplication_Views()
	 * @see webapp.AbstractView#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<AbstractView> getViews();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Model}.
	 * It is bidirectional and its opposite is '{@link webapp.Model#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see webapp.WebappPackage#getApplication_Models()
	 * @see webapp.Model#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // Application
