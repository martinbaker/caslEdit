/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.PredItem#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredItem#getPredName2 <em>Pred Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredItem#getPredType <em>Pred Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredItem#getPredHead <em>Pred Head</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredItem#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem()
 * @model
 * @generated
 */
public interface PredItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Pred Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Name</em>' containment reference.
   * @see #setPredName(PredName)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem_PredName()
   * @model containment="true"
   * @generated
   */
  PredName getPredName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredItem#getPredName <em>Pred Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Name</em>' containment reference.
   * @see #getPredName()
   * @generated
   */
  void setPredName(PredName value);

  /**
   * Returns the value of the '<em><b>Pred Name2</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.PredName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Name2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Name2</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem_PredName2()
   * @model containment="true"
   * @generated
   */
  EList<PredName> getPredName2();

  /**
   * Returns the value of the '<em><b>Pred Type</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.PredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Type</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem_PredType()
   * @model containment="true"
   * @generated
   */
  EList<PredType> getPredType();

  /**
   * Returns the value of the '<em><b>Pred Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Head</em>' containment reference.
   * @see #setPredHead(PredHead)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem_PredHead()
   * @model containment="true"
   * @generated
   */
  PredHead getPredHead();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredItem#getPredHead <em>Pred Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Head</em>' containment reference.
   * @see #getPredHead()
   * @generated
   */
  void setPredHead(PredHead value);

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredItem_Formula()
   * @model containment="true"
   * @generated
   */
  Formu getFormula();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredItem#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formu value);

} // PredItem
