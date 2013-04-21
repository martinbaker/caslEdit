/**
 */
package com.euclideanspace.casl.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.FormulaIf#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.FormulaIf#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.FormulaIf#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getFormulaIf()
 * @model
 * @generated
 */
public interface FormulaIf extends Formu
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Formu)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormulaIf_Left()
   * @model containment="true"
   * @generated
   */
  Formu getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.FormulaIf#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Formu value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormulaIf_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.FormulaIf#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Formu)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormulaIf_Right()
   * @model containment="true"
   * @generated
   */
  Formu getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.FormulaIf#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Formu value);

} // FormulaIf
