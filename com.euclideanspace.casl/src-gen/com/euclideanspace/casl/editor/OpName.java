/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getOpType <em>Op Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getNum <em>Num</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpName#getOpType2 <em>Op Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getOpName()
 * @model
 * @generated
 */
public interface OpName extends QualOpName
{
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_OpType()
   * @model containment="true"
   * @generated
   */
  OpType getOpType();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getOpType <em>Op Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type</em>' containment reference.
   * @see #getOpType()
   * @generated
   */
  void setOpType(OpType value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' attribute.
   * @see #setSuffix(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_Suffix()
   * @model
   * @generated
   */
  String getSuffix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getSuffix <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suffix</em>' attribute.
   * @see #getSuffix()
   * @generated
   */
  void setSuffix(String value);

  /**
   * Returns the value of the '<em><b>Op Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Name</em>' attribute.
   * @see #setOpName(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_OpName()
   * @model
   * @generated
   */
  String getOpName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpName#getOpName <em>Op Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Name</em>' attribute.
   * @see #getOpName()
   * @generated
   */
  void setOpName(String value);

  /**
   * Returns the value of the '<em><b>Op Name2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Name2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Name2</em>' attribute list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_OpName2()
   * @model unique="false"
   * @generated
   */
  EList<String> getOpName2();

  /**
   * Returns the value of the '<em><b>Op Type2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.OpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpName_OpType2()
   * @model containment="true"
   * @generated
   */
  EList<OpType> getOpType2();

} // OpName
