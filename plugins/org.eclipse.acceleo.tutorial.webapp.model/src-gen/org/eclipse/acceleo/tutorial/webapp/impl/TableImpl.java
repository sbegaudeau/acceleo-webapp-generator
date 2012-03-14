/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.acceleo.tutorial.webapp.impl;

import java.util.Collection;

import org.eclipse.acceleo.tutorial.webapp.Table;
import org.eclipse.acceleo.tutorial.webapp.WebappPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.TableImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.TableImpl#getRowNames <em>Row Names</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.TableImpl#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.eclipse.acceleo.tutorial.webapp.impl.TableImpl#isBordered <em>Bordered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends WidgetImpl implements Table {
	/**
	 * The cached value of the '{@link #getColumnNames() <em>Column Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columnNames;

	/**
	 * The cached value of the '{@link #getRowNames() <em>Row Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rowNames;

	/**
	 * The default value of the '{@link #isStriped() <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStriped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStriped() <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStriped()
	 * @generated
	 * @ordered
	 */
	protected boolean striped = STRIPED_EDEFAULT;

	/**
	 * The default value of the '{@link #isBordered() <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBordered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBordered() <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBordered()
	 * @generated
	 * @ordered
	 */
	protected boolean bordered = BORDERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnNames() {
		if (columnNames == null) {
			columnNames = new EDataTypeUniqueEList<String>(String.class, this, WebappPackage.TABLE__COLUMN_NAMES);
		}
		return columnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRowNames() {
		if (rowNames == null) {
			rowNames = new EDataTypeUniqueEList<String>(String.class, this, WebappPackage.TABLE__ROW_NAMES);
		}
		return rowNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStriped() {
		return striped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStriped(boolean newStriped) {
		boolean oldStriped = striped;
		striped = newStriped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.TABLE__STRIPED, oldStriped, striped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBordered() {
		return bordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBordered(boolean newBordered) {
		boolean oldBordered = bordered;
		bordered = newBordered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.TABLE__BORDERED, oldBordered, bordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.TABLE__COLUMN_NAMES:
				return getColumnNames();
			case WebappPackage.TABLE__ROW_NAMES:
				return getRowNames();
			case WebappPackage.TABLE__STRIPED:
				return isStriped();
			case WebappPackage.TABLE__BORDERED:
				return isBordered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebappPackage.TABLE__COLUMN_NAMES:
				getColumnNames().clear();
				getColumnNames().addAll((Collection<? extends String>)newValue);
				return;
			case WebappPackage.TABLE__ROW_NAMES:
				getRowNames().clear();
				getRowNames().addAll((Collection<? extends String>)newValue);
				return;
			case WebappPackage.TABLE__STRIPED:
				setStriped((Boolean)newValue);
				return;
			case WebappPackage.TABLE__BORDERED:
				setBordered((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebappPackage.TABLE__COLUMN_NAMES:
				getColumnNames().clear();
				return;
			case WebappPackage.TABLE__ROW_NAMES:
				getRowNames().clear();
				return;
			case WebappPackage.TABLE__STRIPED:
				setStriped(STRIPED_EDEFAULT);
				return;
			case WebappPackage.TABLE__BORDERED:
				setBordered(BORDERED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebappPackage.TABLE__COLUMN_NAMES:
				return columnNames != null && !columnNames.isEmpty();
			case WebappPackage.TABLE__ROW_NAMES:
				return rowNames != null && !rowNames.isEmpty();
			case WebappPackage.TABLE__STRIPED:
				return striped != STRIPED_EDEFAULT;
			case WebappPackage.TABLE__BORDERED:
				return bordered != BORDERED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnNames: ");
		result.append(columnNames);
		result.append(", rowNames: ");
		result.append(rowNames);
		result.append(", striped: ");
		result.append(striped);
		result.append(", bordered: ");
		result.append(bordered);
		result.append(')');
		return result.toString();
	}

} //TableImpl
