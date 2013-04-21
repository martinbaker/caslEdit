/**
 */
package com.euclideanspace.casl.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getPredType <em>Pred Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getPredName()
 * @model
 * @generated
 */
public interface PredName extends QualVarName
{
  /**
   * Returns the value of the '<em><b>Pred Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Type</em>' containment reference.
   * @see #setPredType(PredType)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredName_PredType()
   * @model containment="true"
   * @generated
   */
  PredType getPredType();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredName#getPredType <em>Pred Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Type</em>' containment reference.
   * @see #getPredType()
   * @generated
   */
  void setPredType(PredType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PredName
