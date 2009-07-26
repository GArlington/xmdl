/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.EnumLiteral#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.EnumLiteral#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends EObject
{
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
   * @see org.xmdl.wdl.WdlPackage#getEnumLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.EnumLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal</em>' attribute.
   * @see #setOrdinal(int)
   * @see org.xmdl.wdl.WdlPackage#getEnumLiteral_Ordinal()
   * @model
   * @generated
   */
  int getOrdinal();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.EnumLiteral#getOrdinal <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal</em>' attribute.
   * @see #getOrdinal()
   * @generated
   */
  void setOrdinal(int value);

} // EnumLiteral
