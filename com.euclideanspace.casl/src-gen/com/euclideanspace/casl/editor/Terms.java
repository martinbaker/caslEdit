/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Terms#getTerm <em>Term</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Terms#getTerm2 <em>Term2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getTerms()
 * @model
 * @generated
 */
public interface Terms extends EObject
{
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getTerms_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Terms#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

  /**
   * Returns the value of the '<em><b>Term2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getTerms_Term2()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerm2();

} // Terms
