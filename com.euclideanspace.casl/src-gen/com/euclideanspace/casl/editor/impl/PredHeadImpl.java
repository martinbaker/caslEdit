/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.ArgDecl;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.PredHead;

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
 * An implementation of the model object '<em><b>Pred Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredHeadImpl#getArgDecl <em>Arg Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredHeadImpl#getArgDecl2 <em>Arg Decl2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredHeadImpl extends MinimalEObjectImpl.Container implements PredHead
{
  /**
   * The cached value of the '{@link #getArgDecl() <em>Arg Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgDecl()
   * @generated
   * @ordered
   */
  protected ArgDecl argDecl;

  /**
   * The cached value of the '{@link #getArgDecl2() <em>Arg Decl2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgDecl2()
   * @generated
   * @ordered
   */
  protected EList<ArgDecl> argDecl2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredHeadImpl()
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
    return EditorPackage.Literals.PRED_HEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgDecl getArgDecl()
  {
    return argDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgDecl(ArgDecl newArgDecl, NotificationChain msgs)
  {
    ArgDecl oldArgDecl = argDecl;
    argDecl = newArgDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_HEAD__ARG_DECL, oldArgDecl, newArgDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgDecl(ArgDecl newArgDecl)
  {
    if (newArgDecl != argDecl)
    {
      NotificationChain msgs = null;
      if (argDecl != null)
        msgs = ((InternalEObject)argDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_HEAD__ARG_DECL, null, msgs);
      if (newArgDecl != null)
        msgs = ((InternalEObject)newArgDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_HEAD__ARG_DECL, null, msgs);
      msgs = basicSetArgDecl(newArgDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_HEAD__ARG_DECL, newArgDecl, newArgDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgDecl> getArgDecl2()
  {
    if (argDecl2 == null)
    {
      argDecl2 = new EObjectContainmentEList<ArgDecl>(ArgDecl.class, this, EditorPackage.PRED_HEAD__ARG_DECL2);
    }
    return argDecl2;
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
      case EditorPackage.PRED_HEAD__ARG_DECL:
        return basicSetArgDecl(null, msgs);
      case EditorPackage.PRED_HEAD__ARG_DECL2:
        return ((InternalEList<?>)getArgDecl2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.PRED_HEAD__ARG_DECL:
        return getArgDecl();
      case EditorPackage.PRED_HEAD__ARG_DECL2:
        return getArgDecl2();
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
      case EditorPackage.PRED_HEAD__ARG_DECL:
        setArgDecl((ArgDecl)newValue);
        return;
      case EditorPackage.PRED_HEAD__ARG_DECL2:
        getArgDecl2().clear();
        getArgDecl2().addAll((Collection<? extends ArgDecl>)newValue);
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
      case EditorPackage.PRED_HEAD__ARG_DECL:
        setArgDecl((ArgDecl)null);
        return;
      case EditorPackage.PRED_HEAD__ARG_DECL2:
        getArgDecl2().clear();
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
      case EditorPackage.PRED_HEAD__ARG_DECL:
        return argDecl != null;
      case EditorPackage.PRED_HEAD__ARG_DECL2:
        return argDecl2 != null && !argDecl2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PredHeadImpl
