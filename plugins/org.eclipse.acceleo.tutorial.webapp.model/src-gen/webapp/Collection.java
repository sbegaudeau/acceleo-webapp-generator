/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Collection#getModel <em>Model</em>}</li>
 *   <li>{@link webapp.Collection#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see webapp.WebappPackage#getCollection_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link webapp.Collection#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webapp.Application#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see webapp.WebappPackage#getCollection_Application()
	 * @see webapp.Application#getCollections
	 * @model opposite="collections" required="true" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link webapp.Collection#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Collection
