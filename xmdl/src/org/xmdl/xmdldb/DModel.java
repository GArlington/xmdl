/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb;

import org.eclipse.emf.common.util.EList;
import org.xmdl.xmdl.XProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdldb.DModel#getXProject <em>XProject</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DModel#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DModel#getXModel <em>XModel</em>}</li>
 *   <li>{@link org.xmdl.xmdldb.DModel#getDPackages <em>DPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdldb.XmdldbPackage#getDModel()
 * @model
 * @generated
 */
public interface DModel extends DBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XModel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XModel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XModel</em>' attribute.
	 * @see #setXModel(String)
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDModel_XModel()
	 * @model required="true"
	 * @generated
	 */
	String getXModel();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DModel#getXModel <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XModel</em>' attribute.
	 * @see #getXModel()
	 * @generated
	 */
	void setXModel(String value);

	/**
	 * Returns the value of the '<em><b>DPackages</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdldb.DPackage}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdldb.DPackage#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DPackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DPackages</em>' containment reference list.
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDModel_DPackages()
	 * @see org.xmdl.xmdldb.DPackage#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<DPackage> getDPackages();

	/**
	 * Returns the value of the '<em><b>XProject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XProject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XProject</em>' reference.
	 * @see #setXProject(XProject)
	 * @see org.xmdl.xmdldb.XmdldbPackage#getDModel_XProject()
	 * @model required="true"
	 * @generated
	 */
	XProject getXProject();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdldb.DModel#getXProject <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XProject</em>' reference.
	 * @see #getXProject()
	 * @generated
	 */
	void setXProject(XProject value);

} // DModel
