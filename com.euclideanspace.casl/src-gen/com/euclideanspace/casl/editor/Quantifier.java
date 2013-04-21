/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Quantifier#getQ <em>Q</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getQuantifier()
 * @model
 * @generated
 */
public interface Quantifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Q</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Q</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' attribute.
   * @see #setQ(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getQuantifier_Q()
   * @model
   * @generated
   */
  String getQ();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Quantifier#getQ <em>Q</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' attribute.
   * @see #getQ()
   * @generated
   */
  void setQ(String value);

} // Quantifier
