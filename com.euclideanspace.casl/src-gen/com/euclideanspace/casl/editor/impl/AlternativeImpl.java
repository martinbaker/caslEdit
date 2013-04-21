/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.Alternative;
import com.euclideanspace.casl.editor.Component;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpName;

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
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.AlternativeImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.AlternativeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.AlternativeImpl#getComponent2 <em>Component2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends MinimalEObjectImpl.Container implements Alternative
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
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Component component;

  /**
   * The cached value of the '{@link #getComponent2() <em>Component2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent2()
   * @generated
   * @ordered
   */
  protected EList<Component> component2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeImpl()
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
    return EditorPackage.Literals.ALTERNATIVE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ALTERNATIVE__OP_NAME, oldOpName, newOpName);
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
        msgs = ((InternalEObject)opName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALTERNATIVE__OP_NAME, null, msgs);
      if (newOpName != null)
        msgs = ((InternalEObject)newOpName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALTERNATIVE__OP_NAME, null, msgs);
      msgs = basicSetOpName(newOpName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ALTERNATIVE__OP_NAME, newOpName, newOpName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
  {
    Component oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.ALTERNATIVE__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Component newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALTERNATIVE__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.ALTERNATIVE__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.ALTERNATIVE__COMPONENT, newComponent, newComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponent2()
  {
    if (component2 == null)
    {
      component2 = new EObjectContainmentEList<Component>(Component.class, this, EditorPackage.ALTERNATIVE__COMPONENT2);
    }
    return component2;
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
      case EditorPackage.ALTERNATIVE__OP_NAME:
        return basicSetOpName(null, msgs);
      case EditorPackage.ALTERNATIVE__COMPONENT:
        return basicSetComponent(null, msgs);
      case EditorPackage.ALTERNATIVE__COMPONENT2:
        return ((InternalEList<?>)getComponent2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.ALTERNATIVE__OP_NAME:
        return getOpName();
      case EditorPackage.ALTERNATIVE__COMPONENT:
        return getComponent();
      case EditorPackage.ALTERNATIVE__COMPONENT2:
        return getComponent2();
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
      case EditorPackage.ALTERNATIVE__OP_NAME:
        setOpName((OpName)newValue);
        return;
      case EditorPackage.ALTERNATIVE__COMPONENT:
        setComponent((Component)newValue);
        return;
      case EditorPackage.ALTERNATIVE__COMPONENT2:
        getComponent2().clear();
        getComponent2().addAll((Collection<? extends Component>)newValue);
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
      case EditorPackage.ALTERNATIVE__OP_NAME:
        setOpName((OpName)null);
        return;
      case EditorPackage.ALTERNATIVE__COMPONENT:
        setComponent((Component)null);
        return;
      case EditorPackage.ALTERNATIVE__COMPONENT2:
        getComponent2().clear();
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
      case EditorPackage.ALTERNATIVE__OP_NAME:
        return opName != null;
      case EditorPackage.ALTERNATIVE__COMPONENT:
        return component != null;
      case EditorPackage.ALTERNATIVE__COMPONENT2:
        return component2 != null && !component2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AlternativeImpl
