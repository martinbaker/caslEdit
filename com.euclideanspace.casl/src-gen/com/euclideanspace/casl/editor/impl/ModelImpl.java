/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.BasicSpec;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.ModelImpl#getBasicSpec <em>Basic Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getBasicSpec() <em>Basic Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicSpec()
   * @generated
   * @ordered
   */
  protected BasicSpec basicSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return EditorPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicSpec getBasicSpec()
  {
    return basicSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicSpec(BasicSpec newBasicSpec, NotificationChain msgs)
  {
    BasicSpec oldBasicSpec = basicSpec;
    basicSpec = newBasicSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MODEL__BASIC_SPEC, oldBasicSpec, newBasicSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicSpec(BasicSpec newBasicSpec)
  {
    if (newBasicSpec != basicSpec)
    {
      NotificationChain msgs = null;
      if (basicSpec != null)
        msgs = ((InternalEObject)basicSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MODEL__BASIC_SPEC, null, msgs);
      if (newBasicSpec != null)
        msgs = ((InternalEObject)newBasicSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MODEL__BASIC_SPEC, null, msgs);
      msgs = basicSetBasicSpec(newBasicSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MODEL__BASIC_SPEC, newBasicSpec, newBasicSpec));
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
      case EditorPackage.MODEL__BASIC_SPEC:
        return basicSetBasicSpec(null, msgs);
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
      case EditorPackage.MODEL__BASIC_SPEC:
        return getBasicSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.MODEL__BASIC_SPEC:
        setBasicSpec((BasicSpec)newValue);
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
      case EditorPackage.MODEL__BASIC_SPEC:
        setBasicSpec((BasicSpec)null);
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
      case EditorPackage.MODEL__BASIC_SPEC:
        return basicSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
