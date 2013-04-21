/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getSortItem <em>Sort Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getSortItem2 <em>Sort Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getOpItem <em>Op Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getOpItem2 <em>Op Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getPredItem <em>Pred Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getPredItem2 <em>Pred Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getDatatypeDecl <em>Datatype Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.SigItems#getDatatypeDecl2 <em>Datatype Decl2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems()
 * @model
 * @generated
 */
public interface SigItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Item</em>' containment reference.
   * @see #setSortItem(SortItem)
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_SortItem()
   * @model containment="true"
   * @generated
   */
  SortItem getSortItem();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.SigItems#getSortItem <em>Sort Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Item</em>' containment reference.
   * @see #getSortItem()
   * @generated
   */
  void setSortItem(SortItem value);

  /**
   * Returns the value of the '<em><b>Sort Item2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.SortItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Item2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Item2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_SortItem2()
   * @model containment="true"
   * @generated
   */
  EList<SortItem> getSortItem2();

  /**
   * Returns the value of the '<em><b>Op Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Item</em>' containment reference.
   * @see #setOpItem(OpItem)
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_OpItem()
   * @model containment="true"
   * @generated
   */
  OpItem getOpItem();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.SigItems#getOpItem <em>Op Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Item</em>' containment reference.
   * @see #getOpItem()
   * @generated
   */
  void setOpItem(OpItem value);

  /**
   * Returns the value of the '<em><b>Op Item2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.OpItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Item2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Item2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_OpItem2()
   * @model containment="true"
   * @generated
   */
  EList<OpItem> getOpItem2();

  /**
   * Returns the value of the '<em><b>Pred Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Item</em>' containment reference.
   * @see #setPredItem(PredItem)
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_PredItem()
   * @model containment="true"
   * @generated
   */
  PredItem getPredItem();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.SigItems#getPredItem <em>Pred Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Item</em>' containment reference.
   * @see #getPredItem()
   * @generated
   */
  void setPredItem(PredItem value);

  /**
   * Returns the value of the '<em><b>Pred Item2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.PredItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Item2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Item2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_PredItem2()
   * @model containment="true"
   * @generated
   */
  EList<PredItem> getPredItem2();

  /**
   * Returns the value of the '<em><b>Datatype Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype Decl</em>' containment reference.
   * @see #setDatatypeDecl(DatatypeDecl)
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_DatatypeDecl()
   * @model containment="true"
   * @generated
   */
  DatatypeDecl getDatatypeDecl();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.SigItems#getDatatypeDecl <em>Datatype Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype Decl</em>' containment reference.
   * @see #getDatatypeDecl()
   * @generated
   */
  void setDatatypeDecl(DatatypeDecl value);

  /**
   * Returns the value of the '<em><b>Datatype Decl2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.DatatypeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype Decl2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype Decl2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getSigItems_DatatypeDecl2()
   * @model containment="true"
   * @generated
   */
  EList<DatatypeDecl> getDatatypeDecl2();

} // SigItems
