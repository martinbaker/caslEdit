/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.Component;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpName;
import com.euclideanspace.casl.editor.Sort;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.ComponentImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.ComponentImpl#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.ComponentImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
{
  /**
   * The cached value of the '{@link #getOpName() <em>Op Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpName()
   * @generated
   * @ordered
   */
  protected OpName opName;

  /**
   * The cached value of the '{@link #getOpName2() <em>Op Name2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpName2()
   * @generated
   * @ordered
   */
  protected EList<OpName> opName2;

  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected Sort sort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return EditorPackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpName getOpName()
  {
    return opName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpName(OpName newOpName, NotificationChain msgs)
  {
    OpName oldOpName = opName;
    opName = newOpName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMPONENT__OP_NAME, oldOpName, newOpName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpName(OpName newOpName)
  {
    if (newOpName != opName)
    {
      NotificationChain msgs = null;
      if (opName != null)
        msgs = ((InternalEObject)opName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPONENT__OP_NAME, null, msgs);
      if (newOpName != null)
        msgs = ((InternalEObject)newOpName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPONENT__OP_NAME, null, msgs);
      msgs = basicSetOpName(newOpName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPONENT__OP_NAME, newOpName, newOpName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OpName> getOpName2()
  {
    if (opName2 == null)
    {
      opName2 = new EObjectContainmentEList<OpName>(OpName.class, this, EditorPackage.COMPONENT__OP_NAME2);
    }
    return opName2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort getSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs)
  {
    Sort oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMPONENT__SORT, oldSort, newSort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(Sort newSort)
  {
    if (newSort != sort)
    {
      NotificationChain msgs = null;
      if (sort != null)
        msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPONENT__SORT, null, msgs);
      if (newSort != null)
        msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPONENT__SORT, null, msgs);
      msgs = basicSetSort(newSort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPONENT__SORT, newSort, newSort));
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
      case EditorPackage.COMPONENT__OP_NAME:
        return basicSetOpName(null, msgs);
      case EditorPackage.COMPONENT__OP_NAME2:
        return ((InternalEList<?>)getOpName2()).basicRemove(otherEnd, msgs);
      case EditorPackage.COMPONENT__SORT:
        return basicSetSort(null, msgs);
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
      case EditorPackage.COMPONENT__OP_NAME:
        return getOpName();
      case EditorPackage.COMPONENT__OP_NAME2:
        return getOpName2();
      case EditorPackage.COMPONENT__SORT:
        return getSort();
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
      case EditorPackage.COMPONENT__OP_NAME:
        setOpName((OpName)newValue);
        return;
      case EditorPackage.COMPONENT__OP_NAME2:
        getOpName2().clear();
        getOpName2().addAll((Collection<? extends OpName>)newValue);
        return;
      case EditorPackage.COMPONENT__SORT:
        setSort((Sort)newValue);
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
      case EditorPackage.COMPONENT__OP_NAME:
        setOpName((OpName)null);
        return;
      case EditorPackage.COMPONENT__OP_NAME2:
        getOpName2().clear();
        return;
      case EditorPackage.COMPONENT__SORT:
        setSort((Sort)null);
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
      case EditorPackage.COMPONENT__OP_NAME:
        return opName != null;
      case EditorPackage.COMPONENT__OP_NAME2:
        return opName2 != null && !opName2.isEmpty();
      case EditorPackage.COMPONENT__SORT:
        return sort != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentImpl
