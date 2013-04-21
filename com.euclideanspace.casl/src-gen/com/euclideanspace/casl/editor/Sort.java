/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Sort#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Sort#getAlternative2 <em>Alternative2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Sort#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends DatatypeDecl
{
  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference.
   * @see #setAlternative(Alternative)
   * @see com.euclideanspace.casl.editor.EditorPackage#getSort_Alternative()
   * @model containment="true"
   * @generated
   */
  Alternative getAlternative();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Sort#getAlternative <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative</em>' containment reference.
   * @see #getAlternative()
   * @generated
   */
  void setAlternative(Alternative value);

  /**
   * Returns the value of the '<em><b>Alternative2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Alternative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getSort_Alternative2()
   * @model containment="true"
   * @generated
   */
  EList<Alternative> getAlternative2();

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getSort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Sort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Sort
