/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getBasicItems <em>Basic Items</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec()
 * @model
 * @generated
 */
public interface BasicSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic Items</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.BasicItems}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Items</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_BasicItems()
   * @model containment="true"
   * @generated
   */
  EList<BasicItems> getBasicItems();

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Empty()
   * @model
   * @generated
   */
  String getEmpty();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicSpec#getEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #getEmpty()
   * @generated
   */
  void setEmpty(String value);

} // BasicSpec
