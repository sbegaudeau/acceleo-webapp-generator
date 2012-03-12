/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.pim.gen.omega.model.omega;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.pim.gen.omega.model.omega.OmegaPackage
 * @generated
 */
public interface OmegaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OmegaFactory eINSTANCE = org.obeonetwork.pim.gen.omega.model.omega.impl.OmegaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web App</em>'.
	 * @generated
	 */
	WebApp createWebApp();

	/**
	 * Returns a new object of class '<em>Backbone Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backbone Page</em>'.
	 * @generated
	 */
	BackbonePage createBackbonePage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OmegaPackage getOmegaPackage();

} //OmegaFactory
