/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Table#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Table#getRowNames <em>Row Names</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Table#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.Table#isBordered <em>Bordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Widget {
	/**
	 * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Names</em>' attribute list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getTable_ColumnNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getColumnNames();

	/**
	 * Returns the value of the '<em><b>Row Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Names</em>' attribute list.
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getTable_RowNames()
	 * @model
	 * @generated
	 */
	EList<String> getRowNames();

	/**
	 * Returns the value of the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Striped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Striped</em>' attribute.
	 * @see #setStriped(boolean)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getTable_Striped()
	 * @model required="true"
	 * @generated
	 */
	boolean isStriped();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Table#isStriped <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Striped</em>' attribute.
	 * @see #isStriped()
	 * @generated
	 */
	void setStriped(boolean value);

	/**
	 * Returns the value of the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bordered</em>' attribute.
	 * @see #setBordered(boolean)
	 * @see org.eclipse.acceleo.tutorial.webapp.WebappPackage#getTable_Bordered()
	 * @model required="true"
	 * @generated
	 */
	boolean isBordered();

	/**
	 * Sets the value of the '{@link org.eclipse.acceleo.tutorial.webapp.Table#isBordered <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bordered</em>' attribute.
	 * @see #isBordered()
	 * @generated
	 */
	void setBordered(boolean value);

} // Table
