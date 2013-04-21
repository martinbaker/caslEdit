/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Component#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Component#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Component#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Op Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Name</em>' containment reference.
   * @see #setOpName(OpName)
   * @see com.euclideanspace.casl.editor.EditorPackage#getComponent_OpName()
   * @model containment="true"
   * @generated
   */
  OpName getOpName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Component#getOpName <em>Op Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Name</em>' containment reference.
   * @see #getOpName()
   * @generated
   */
  void setOpName(OpName value);

  /**
   * Returns the value of the '<em><b>Op Name2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.OpName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Name2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Name2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getComponent_OpName2()
   * @model containment="true"
   * @generated
   */
  EList<OpName> getOpName2();

  /**
   * Returns the value of the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' containment reference.
   * @see #setSort(Sort)
   * @see com.euclideanspace.casl.editor.EditorPackage#getComponent_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Component#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(Sort value);

} // Component
