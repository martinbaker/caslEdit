/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Model#getBasicSpec <em>Basic Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Spec</em>' containment reference.
   * @see #setBasicSpec(BasicSpec)
   * @see com.euclideanspace.casl.editor.EditorPackage#getModel_BasicSpec()
   * @model containment="true"
   * @generated
   */
  BasicSpec getBasicSpec();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Model#getBasicSpec <em>Basic Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Spec</em>' containment reference.
   * @see #getBasicSpec()
   * @generated
   */
  void setBasicSpec(BasicSpec value);

} // Model
