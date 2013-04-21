/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Sort;
import com.euclideanspace.casl.editor.Var;
import com.euclideanspace.casl.editor.VarDecl;

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
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.VarDeclImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.VarDeclImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.VarDeclImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarDeclImpl extends MinimalEObjectImpl.Container implements VarDecl
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Var var;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected EList<Var> var2;

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
  protected VarDeclImpl()
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
    return EditorPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Var newVar, NotificationChain msgs)
  {
    Var oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VAR_DECL__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Var newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VAR_DECL__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VAR_DECL__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VAR_DECL__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Var> getVar2()
  {
    if (var2 == null)
    {
      var2 = new EObjectContainmentEList<Var>(Var.class, this, EditorPackage.VAR_DECL__VAR2);
    }
    return var2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VAR_DECL__SORT, oldSort, newSort);
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
        msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VAR_DECL__SORT, null, msgs);
      if (newSort != null)
        msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VAR_DECL__SORT, null, msgs);
      msgs = basicSetSort(newSort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VAR_DECL__SORT, newSort, newSort));
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
      case EditorPackage.VAR_DECL__VAR:
        return basicSetVar(null, msgs);
      case EditorPackage.VAR_DECL__VAR2:
        return ((InternalEList<?>)getVar2()).basicRemove(otherEnd, msgs);
      case EditorPackage.VAR_DECL__SORT:
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
      case EditorPackage.VAR_DECL__VAR:
        return getVar();
      case EditorPackage.VAR_DECL__VAR2:
        return getVar2();
      case EditorPackage.VAR_DECL__SORT:
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
      case EditorPackage.VAR_DECL__VAR:
        setVar((Var)newValue);
        return;
      case EditorPackage.VAR_DECL__VAR2:
        getVar2().clear();
        getVar2().addAll((Collection<? extends Var>)newValue);
        return;
      case EditorPackage.VAR_DECL__SORT:
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
      case EditorPackage.VAR_DECL__VAR:
        setVar((Var)null);
        return;
      case EditorPackage.VAR_DECL__VAR2:
        getVar2().clear();
        return;
      case EditorPackage.VAR_DECL__SORT:
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
      case EditorPackage.VAR_DECL__VAR:
        return var != null;
      case EditorPackage.VAR_DECL__VAR2:
        return var2 != null && !var2.isEmpty();
      case EditorPackage.VAR_DECL__SORT:
        return sort != null;
    }
    return super.eIsSet(featureID);
  }

} //VarDeclImpl
