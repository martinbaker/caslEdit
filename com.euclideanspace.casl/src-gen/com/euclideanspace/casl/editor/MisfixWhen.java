/**
 */
package com.euclideanspace.casl.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misfix When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.MisfixWhen#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.MisfixWhen#getOp0 <em>Op0</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.MisfixWhen#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getMisfixWhen()
 * @model
 * @generated
 */
public interface MisfixWhen extends Mfix
{
  /**
   * Returns the value of the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' containment reference.
   * @see #setFormula(Formu)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMisfixWhen_Formula()
   * @model containment="true"
   * @generated
   */
  Formu getFormula();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.MisfixWhen#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formu value);

  /**
   * Returns the value of the '<em><b>Op0</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op0</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op0</em>' attribute.
   * @see #setOp0(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMisfixWhen_Op0()
   * @model
   * @generated
   */
  String getOp0();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.MisfixWhen#getOp0 <em>Op0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op0</em>' attribute.
   * @see #getOp0()
   * @generated
   */
  void setOp0(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Mfix)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMisfixWhen_Right()
   * @model containment="true"
   * @generated
   */
  Mfix getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.MisfixWhen#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Mfix value);

} // MisfixWhen
