/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getOpType <em>Op Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getOpAttr <em>Op Attr</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getOpHead <em>Op Head</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpItem#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem()
 * @model
 * @generated
 */
public interface OpItem extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_OpName()
   * @model containment="true"
   * @generated
   */
  OpName getOpName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpItem#getOpName <em>Op Name</em>}' containment reference.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_OpName2()
   * @model containment="true"
   * @generated
   */
  EList<OpName> getOpName2();

  /**
   * Returns the value of the '<em><b>Op Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type</em>' containment reference.
   * @see #setOpType(OpType)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_OpType()
   * @model containment="true"
   * @generated
   */
  OpType getOpType();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpItem#getOpType <em>Op Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type</em>' containment reference.
   * @see #getOpType()
   * @generated
   */
  void setOpType(OpType value);

  /**
   * Returns the value of the '<em><b>Op Attr</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.OpAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Attr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Attr</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_OpAttr()
   * @model containment="true"
   * @generated
   */
  EList<OpAttr> getOpAttr();

  /**
   * Returns the value of the '<em><b>Op Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Head</em>' containment reference.
   * @see #setOpHead(OpHead)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_OpHead()
   * @model containment="true"
   * @generated
   */
  OpHead getOpHead();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpItem#getOpHead <em>Op Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Head</em>' containment reference.
   * @see #getOpHead()
   * @generated
   */
  void setOpHead(OpHead value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Term)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpItem_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpItem#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

} // OpItem
