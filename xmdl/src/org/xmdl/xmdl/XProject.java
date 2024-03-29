package org.xmdl.xmdl;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 */
public interface XProject extends XBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * @model
	 */
	public String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdl.XPackage}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdl.XPackage#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.xmdl.xmdl.XmdlPackage#getXProject_Packages()
	 * @see org.xmdl.xmdl.XPackage#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<XPackage> getPackages();

}
