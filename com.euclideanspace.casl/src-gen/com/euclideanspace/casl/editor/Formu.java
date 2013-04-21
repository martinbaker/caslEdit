/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getVarDecl <em>Var Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getVarDecl2 <em>Var Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getE3 <em>E3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getForm <em>Form</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.Formu#getMisfix2 <em>Misfix2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getFormu()
 * @model
 * @generated
 */
public interface Formu extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' containment reference.
   * @see #setQuantifier(Quantifier)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Quantifier()
   * @model containment="true"
   * @generated
   */
  Quantifier getQuantifier();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getQuantifier <em>Quantifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' containment reference.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(Quantifier value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_VarDecl()
   * @model containment="true"
   * @generated
   */
  VarDecl getVarDecl();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getVarDecl <em>Var Decl</em>}' containment reference.
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_VarDecl2()
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
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Formula()
   * @model containment="true"
   * @generated
   */
  Formu getFormula();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formu value);

  /**
   * Returns the value of the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E3</em>' attribute.
   * @see #setE3(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_E3()
   * @model
   * @generated
   */
  String getE3();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getE3 <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E3</em>' attribute.
   * @see #getE3()
   * @generated
   */
  void setE3(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Term)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_T()
   * @model containment="true"
   * @generated
   */
  Term getT();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Term value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(Term)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_T2()
   * @model containment="true"
   * @generated
   */
  Term getT2();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(Term value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference.
   * @see #setForm(Formu)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Form()
   * @model containment="true"
   * @generated
   */
  Formu getForm();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getForm <em>Form</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form</em>' containment reference.
   * @see #getForm()
   * @generated
   */
  void setForm(Formu value);

  /**
   * Returns the value of the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Misfix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Misfix</em>' containment reference.
   * @see #setMisfix(Mfix)
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Misfix()
   * @model containment="true"
   * @generated
   */
  Mfix getMisfix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.Formu#getMisfix <em>Misfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Misfix</em>' containment reference.
   * @see #getMisfix()
   * @generated
   */
  void setMisfix(Mfix value);

  /**
   * Returns the value of the '<em><b>Misfix2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.Mfix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Misfix2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Misfix2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getFormu_Misfix2()
   * @model containment="true"
   * @generated
   */
  EList<Mfix> getMisfix2();

} // Formu
