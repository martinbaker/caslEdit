/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.PredType#getSort <em>Sort</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredType#getSort2 <em>Sort2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredType#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getPredType()
 * @model
 * @generated
 */
public interface PredType extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' containment reference.
   * @see #setSort(Sort)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredType_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredType#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(Sort value);

  /**
   * Returns the value of the '<em><b>Sort2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Sort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredType_Sort2()
   * @model containment="true"
   * @generated
   */
  EList<Sort> getSort2();

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute.
   * @see #setB(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredType_B()
   * @model
   * @generated
   */
  String getB();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredType#getB <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' attribute.
   * @see #getB()
   * @generated
   */
  void setB(String value);

} // PredType
