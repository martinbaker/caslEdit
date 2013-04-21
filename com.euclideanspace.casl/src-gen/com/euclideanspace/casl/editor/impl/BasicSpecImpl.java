/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.BasicItems;
import com.euclideanspace.casl.editor.BasicSpec;
import com.euclideanspace.casl.editor.EditorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getBasicItems <em>Basic Items</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicSpecImpl extends MinimalEObjectImpl.Container implements BasicSpec
{
  /**
   * The cached value of the '{@link #getBasicItems() <em>Basic Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicItems()
   * @generated
   * @ordered
   */
  protected EList<BasicItems> basicItems;

  /**
   * The default value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected static final String EMPTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected String empty = EMPTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EditorPackage.Literals.BASIC_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicItems> getBasicItems()
  {
    if (basicItems == null)
    {
      basicItems = new EObjectContainmentEList<BasicItems>(BasicItems.class, this, EditorPackage.BASIC_SPEC__BASIC_ITEMS);
    }
    return basicItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(String newEmpty)
  {
    String oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_SPEC__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return ((InternalEList<?>)getBasicItems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return getBasicItems();
      case EditorPackage.BASIC_SPEC__EMPTY:
        return getEmpty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        getBasicItems().clear();
        getBasicItems().addAll((Collection<? extends BasicItems>)newValue);
        return;
      case EditorPackage.BASIC_SPEC__EMPTY:
        setEmpty((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        getBasicItems().clear();
        return;
      case EditorPackage.BASIC_SPEC__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return basicItems != null && !basicItems.isEmpty();
      case EditorPackage.BASIC_SPEC__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (empty: ");
    result.append(empty);
    result.append(')');
    return result.toString();
  }

} //BasicSpecImpl
