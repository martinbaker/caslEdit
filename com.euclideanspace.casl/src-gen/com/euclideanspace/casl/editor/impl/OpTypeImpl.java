/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpType;
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
 * An implementation of the model object '<em><b>Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpTypeImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpTypeImpl#getSort2 <em>Sort2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpTypeImpl#getSort3 <em>Sort3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpTypeImpl extends MinimalEObjectImpl.Container implements OpType
{
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
   * The cached value of the '{@link #getSort2() <em>Sort2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort2()
   * @generated
   * @ordered
   */
  protected EList<Sort> sort2;

  /**
   * The cached value of the '{@link #getSort3() <em>Sort3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort3()
   * @generated
   * @ordered
   */
  protected Sort sort3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpTypeImpl()
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
    return EditorPackage.Literals.OP_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_TYPE__SORT, oldSort, newSort);
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
        msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_TYPE__SORT, null, msgs);
      if (newSort != null)
        msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_TYPE__SORT, null, msgs);
      msgs = basicSetSort(newSort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_TYPE__SORT, newSort, newSort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sort> getSort2()
  {
    if (sort2 == null)
    {
      sort2 = new EObjectContainmentEList<Sort>(Sort.class, this, EditorPackage.OP_TYPE__SORT2);
    }
    return sort2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort getSort3()
  {
    return sort3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSort3(Sort newSort3, NotificationChain msgs)
  {
    Sort oldSort3 = sort3;
    sort3 = newSort3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_TYPE__SORT3, oldSort3, newSort3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort3(Sort newSort3)
  {
    if (newSort3 != sort3)
    {
      NotificationChain msgs = null;
      if (sort3 != null)
        msgs = ((InternalEObject)sort3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_TYPE__SORT3, null, msgs);
      if (newSort3 != null)
        msgs = ((InternalEObject)newSort3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_TYPE__SORT3, null, msgs);
      msgs = basicSetSort3(newSort3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_TYPE__SORT3, newSort3, newSort3));
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
      case EditorPackage.OP_TYPE__SORT:
        return basicSetSort(null, msgs);
      case EditorPackage.OP_TYPE__SORT2:
        return ((InternalEList<?>)getSort2()).basicRemove(otherEnd, msgs);
      case EditorPackage.OP_TYPE__SORT3:
        return basicSetSort3(null, msgs);
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
      case EditorPackage.OP_TYPE__SORT:
        return getSort();
      case EditorPackage.OP_TYPE__SORT2:
        return getSort2();
      case EditorPackage.OP_TYPE__SORT3:
        return getSort3();
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
      case EditorPackage.OP_TYPE__SORT:
        setSort((Sort)newValue);
        return;
      case EditorPackage.OP_TYPE__SORT2:
        getSort2().clear();
        getSort2().addAll((Collection<? extends Sort>)newValue);
        return;
      case EditorPackage.OP_TYPE__SORT3:
        setSort3((Sort)newValue);
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
      case EditorPackage.OP_TYPE__SORT:
        setSort((Sort)null);
        return;
      case EditorPackage.OP_TYPE__SORT2:
        getSort2().clear();
        return;
      case EditorPackage.OP_TYPE__SORT3:
        setSort3((Sort)null);
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
      case EditorPackage.OP_TYPE__SORT:
        return sort != null;
      case EditorPackage.OP_TYPE__SORT2:
        return sort2 != null && !sort2.isEmpty();
      case EditorPackage.OP_TYPE__SORT3:
        return sort3 != null;
    }
    return super.eIsSet(featureID);
  }

} //OpTypeImpl
