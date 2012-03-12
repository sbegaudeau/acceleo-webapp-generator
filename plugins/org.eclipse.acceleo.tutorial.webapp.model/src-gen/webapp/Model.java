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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Model#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link webapp.Model#getReferences <em>References</em>}</li>
 *   <li>{@link webapp.Model#getOperations <em>Operations</em>}</li>
 *   <li>{@link webapp.Model#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see webapp.WebappPackage#getModel_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see webapp.WebappPackage#getModel_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see webapp.WebappPackage#getModel_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webapp.Application#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see webapp.WebappPackage#getModel_Application()
	 * @see webapp.Application#getModels
	 * @model opposite="models" required="true" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link webapp.Model#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Model
