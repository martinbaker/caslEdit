/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getName1 <em>Name1</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getName2 <em>Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getName3 <em>Name3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getName4 <em>Name4</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getBasicItems <em>Basic Items</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.BasicSpec#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec()
 * @model
 * @generated
 */
public interface BasicSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name1</em>' attribute.
   * @see #setName1(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Name1()
   * @model
   * @generated
   */
  String getName1();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicSpec#getName1 <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name1</em>' attribute.
   * @see #getName1()
   * @generated
   */
  void setName1(String value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' attribute list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Name2()
   * @model unique="false"
   * @generated
   */
  EList<String> getName2();

  /**
   * Returns the value of the '<em><b>Name3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name3</em>' attribute.
   * @see #setName3(int)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Name3()
   * @model
   * @generated
   */
  int getName3();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicSpec#getName3 <em>Name3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name3</em>' attribute.
   * @see #getName3()
   * @generated
   */
  void setName3(int value);

  /**
   * Returns the value of the '<em><b>Name4</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name4</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name4</em>' attribute list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Name4()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getName4();

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
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicSpec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Basic Items</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.casl.editor.BasicItems}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Items</em>' containment reference list.
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_BasicItems()
   * @model containment="true"
   * @generated
   */
  EList<BasicItems> getBasicItems();

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(String)
   * @see com.euclideanspace.casl.editor.EditorPackage#getBasicSpec_Empty()
   * @model
   * @generated
   */
  String getEmpty();

  /**
   * Sets the value of the '{@link com.euclideanspace.casl.editor.BasicSpec#getEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #getEmpty()
   * @generated
   */
  void setEmpty(String value);

} // BasicSpec
