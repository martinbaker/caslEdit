/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.OpHead#getSort <em>Sort</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpHead#getArgDecl <em>Arg Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.OpHead#getArgDecl2 <em>Arg Decl2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getOpHead()
 * @model
 * @generated
 */
public interface OpHead extends EObject
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpHead_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpHead#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(Sort value);

  /**
   * Returns the value of the '<em><b>Arg Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Decl</em>' containment reference.
   * @see #setArgDecl(ArgDecl)
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpHead_ArgDecl()
   * @model containment="true"
   * @generated
   */
  ArgDecl getArgDecl();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.OpHead#getArgDecl <em>Arg Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Decl</em>' containment reference.
   * @see #getArgDecl()
   * @generated
   */
  void setArgDecl(ArgDecl value);

  /**
   * Returns the value of the '<em><b>Arg Decl2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.ArgDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Decl2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Decl2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getOpHead_ArgDecl2()
   * @model containment="true"
   * @generated
   */
  EList<ArgDecl> getArgDecl2();

} // OpHead
