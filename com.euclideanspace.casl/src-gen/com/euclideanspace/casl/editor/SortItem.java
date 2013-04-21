/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.SortItem#getSort <em>Sort</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SortItem#getSort2 <em>Sort2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getSortItem()
 * @model
 * @generated
 */
public interface SortItem extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getSortItem_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.SortItem#getSort <em>Sort</em>}' containment reference.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getSortItem_Sort2()
   * @model containment="true"
   * @generated
   */
  EList<Sort> getSort2();

} // SortItem
