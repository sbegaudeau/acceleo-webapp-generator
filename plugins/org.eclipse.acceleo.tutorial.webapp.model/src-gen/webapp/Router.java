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
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Router#getMappings <em>Mappings</em>}</li>
 *   <li>{@link webapp.Router#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.RouterMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see webapp.WebappPackage#getRouter_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouterMapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webapp.Application#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see webapp.WebappPackage#getRouter_Application()
	 * @see webapp.Application#getRouter
	 * @model opposite="router" required="true" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link webapp.Router#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Router
