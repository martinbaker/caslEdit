/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Term#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Term#getMisfix2 <em>Misfix2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getTerm_Misfix()
   * @model containment="true"
   * @generated
   */
  Mfix getMisfix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Term#getMisfix <em>Misfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Misfix</em>' containment reference.
   * @see #getMisfix()
   * @generated
   */
  void setMisfix(Mfix value);

  /**
   * Returns the value of the '<em><b>Misfix2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Mfix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Misfix2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Misfix2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getTerm_Misfix2()
   * @model containment="true"
   * @generated
   */
  EList<Mfix> getMisfix2();

} // Term
