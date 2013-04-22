/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getE3 <em>E3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getLeft <em>Left</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getFormu()
 * @model
 * @generated
 */
public interface Formu extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Formula()
   * @model containment="true"
   * @generated
   */
  Formu getFormula();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formu value);

  /**
   * Returns the value of the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E3</em>' attribute.
   * @see #setE3(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_E3()
   * @model
   * @generated
   */
  String getE3();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getE3 <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E3</em>' attribute.
   * @see #getE3()
   * @generated
   */
  void setE3(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Term)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_T()
   * @model containment="true"
   * @generated
   */
  Term getT();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Term value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(Term)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_T2()
   * @model containment="true"
   * @generated
   */
  Term getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(Term value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Left()
   * @model containment="true"
   * @generated
   */
  Formu getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getLeft <em>Left</em>}' containment reference.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getOp <em>Op</em>}' attribute.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Right()
   * @model containment="true"
   * @generated
   */
  Formu getRight();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Formu value);

} // Formu
