/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getS <em>S</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl <em>Datatype Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl2 <em>Datatype Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getS2 <em>S2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getVarDecl <em>Var Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getVarDecl2 <em>Var Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicItems#getFormula2 <em>Formula2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems()
 * @model
 * @generated
 */
public interface BasicItems extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(SigItems)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_S()
   * @model containment="true"
   * @generated
   */
  SigItems getS();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicItems#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(SigItems value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_DatatypeDecl()
   * @model containment="true"
   * @generated
   */
  DatatypeDecl getDatatypeDecl();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl <em>Datatype Decl</em>}' containment reference.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_DatatypeDecl2()
   * @model containment="true"
   * @generated
   */
  EList<DatatypeDecl> getDatatypeDecl2();

  /**
   * Returns the value of the '<em><b>S2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.SigItems}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_S2()
   * @model containment="true"
   * @generated
   */
  EList<SigItems> getS2();

  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference.
   * @see #setVarDecl(VarDecl)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_VarDecl()
   * @model containment="true"
   * @generated
   */
  VarDecl getVarDecl();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicItems#getVarDecl <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Decl</em>' containment reference.
   * @see #getVarDecl()
   * @generated
   */
  void setVarDecl(VarDecl value);

  /**
   * Returns the value of the '<em><b>Var Decl2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.VarDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_VarDecl2()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getVarDecl2();

  /**
   * Returns the value of the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' containment reference.
   * @see #setFormula(Formu)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_Formula()
   * @model containment="true"
   * @generated
   */
  Formu getFormula();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicItems#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formu value);

  /**
   * Returns the value of the '<em><b>Formula2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Formu}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicItems_Formula2()
   * @model containment="true"
   * @generated
   */
  EList<Formu> getFormula2();

} // BasicItems
