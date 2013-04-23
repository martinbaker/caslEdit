/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Alternative#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Alternative#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getAlternative_OpName()
   * @model containment="true"
   * @generated
   */
  OpName getOpName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Alternative#getOpName <em>Op Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Name</em>' containment reference.
   * @see #getOpName()
   * @generated
   */
  void setOpName(OpName value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(Component)
   * @see com.euclideanspace.casl.editor.EditorPackage#getAlternative_Component()
   * @model containment="true"
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Alternative#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

} // Alternative
