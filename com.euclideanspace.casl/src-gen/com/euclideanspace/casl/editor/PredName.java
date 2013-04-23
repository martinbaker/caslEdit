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
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.PredName#getSuffix <em>Suffix</em>}</li>
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
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredName_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredName#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

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

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredName_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredName#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' attribute.
   * @see #setSuffix(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getPredName_Suffix()
   * @model
   * @generated
   */
  String getSuffix();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.PredName#getSuffix <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suffix</em>' attribute.
   * @see #getSuffix()
   * @generated
   */
  void setSuffix(String value);

} // PredName
