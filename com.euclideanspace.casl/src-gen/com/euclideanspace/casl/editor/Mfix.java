/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mfix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp2 <em>Op2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp3 <em>Op3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp4 <em>Op4</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp5 <em>Op5</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp6 <em>Op6</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Mfix#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getMfix()
 * @model
 * @generated
 */
public interface Mfix extends EObject
{
  /**
   * Returns the value of the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Misfix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Misfix</em>' containment reference.
   * @see #setMisfix(Mfix)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Misfix()
   * @model containment="true"
   * @generated
   */
  Mfix getMisfix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getMisfix <em>Misfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Misfix</em>' containment reference.
   * @see #getMisfix()
   * @generated
   */
  void setMisfix(Mfix value);

  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(Token)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op1()
   * @model containment="true"
   * @generated
   */
  Token getOp1();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(Token value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(Literal)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op2()
   * @model containment="true"
   * @generated
   */
  Literal getOp2();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(Literal value);

  /**
   * Returns the value of the '<em><b>Op3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op3</em>' attribute.
   * @see #setOp3(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op3()
   * @model
   * @generated
   */
  String getOp3();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp3 <em>Op3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op3</em>' attribute.
   * @see #getOp3()
   * @generated
   */
  void setOp3(String value);

  /**
   * Returns the value of the '<em><b>Op4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op4</em>' containment reference.
   * @see #setOp4(QualPredName)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op4()
   * @model containment="true"
   * @generated
   */
  QualPredName getOp4();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp4 <em>Op4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op4</em>' containment reference.
   * @see #getOp4()
   * @generated
   */
  void setOp4(QualPredName value);

  /**
   * Returns the value of the '<em><b>Op5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op5</em>' containment reference.
   * @see #setOp5(QualVarName)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op5()
   * @model containment="true"
   * @generated
   */
  QualVarName getOp5();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp5 <em>Op5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op5</em>' containment reference.
   * @see #getOp5()
   * @generated
   */
  void setOp5(QualVarName value);

  /**
   * Returns the value of the '<em><b>Op6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op6</em>' containment reference.
   * @see #setOp6(QualOpName)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op6()
   * @model containment="true"
   * @generated
   */
  QualOpName getOp6();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp6 <em>Op6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op6</em>' containment reference.
   * @see #getOp6()
   * @generated
   */
  void setOp6(QualOpName value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Mfix)
   * @see com.euclideanspace.casl.editor.EditorPackage#getMfix_Left()
   * @model containment="true"
   * @generated
   */
  Mfix getLeft();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Mfix#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Mfix value);

} // Mfix
