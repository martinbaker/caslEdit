/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.ArgDecl#getVar <em>Var</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.ArgDecl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.ArgDecl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getArgDecl()
 * @model
 * @generated
 */
public interface ArgDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Var)
   * @see com.euclideanspace.casl.editor.EditorPackage#getArgDecl_Var()
   * @model containment="true"
   * @generated
   */
  Var getVar();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.ArgDecl#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Var value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Var}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getArgDecl_Var2()
   * @model containment="true"
   * @generated
   */
  EList<Var> getVar2();

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getArgDecl_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.ArgDecl#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(Sort value);

} // ArgDecl
