/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpAttr;
import com.euclideanspace.casl.editor.OpHead;
import com.euclideanspace.casl.editor.OpItem;
import com.euclideanspace.casl.editor.OpName;
import com.euclideanspace.casl.editor.OpType;
import com.euclideanspace.casl.editor.Term;

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
 * An implementation of the model object '<em><b>Op Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getOpType <em>Op Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getOpAttr <em>Op Attr</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getOpHead <em>Op Head</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpItemImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpItemImpl extends MinimalEObjectImpl.Container implements OpItem
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
   * The cached value of the '{@link #getOpType() <em>Op Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType()
   * @generated
   * @ordered
   */
  protected OpType opType;

  /**
   * The cached value of the '{@link #getOpAttr() <em>Op Attr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpAttr()
   * @generated
   * @ordered
   */
  protected EList<OpAttr> opAttr;

  /**
   * The cached value of the '{@link #getOpHead() <em>Op Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpHead()
   * @generated
   * @ordered
   */
  protected OpHead opHead;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Term term;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpItemImpl()
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
    return EditorPackage.Literals.OP_ITEM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_NAME, oldOpName, newOpName);
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
        msgs = ((InternalEObject)opName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_NAME, null, msgs);
      if (newOpName != null)
        msgs = ((InternalEObject)newOpName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_NAME, null, msgs);
      msgs = basicSetOpName(newOpName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_NAME, newOpName, newOpName));
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
      opName2 = new EObjectContainmentEList<OpName>(OpName.class, this, EditorPackage.OP_ITEM__OP_NAME2);
    }
    return opName2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType getOpType()
  {
    return opType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpType(OpType newOpType, NotificationChain msgs)
  {
    OpType oldOpType = opType;
    opType = newOpType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_TYPE, oldOpType, newOpType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpType(OpType newOpType)
  {
    if (newOpType != opType)
    {
      NotificationChain msgs = null;
      if (opType != null)
        msgs = ((InternalEObject)opType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_TYPE, null, msgs);
      if (newOpType != null)
        msgs = ((InternalEObject)newOpType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_TYPE, null, msgs);
      msgs = basicSetOpType(newOpType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_TYPE, newOpType, newOpType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OpAttr> getOpAttr()
  {
    if (opAttr == null)
    {
      opAttr = new EObjectContainmentEList<OpAttr>(OpAttr.class, this, EditorPackage.OP_ITEM__OP_ATTR);
    }
    return opAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpHead getOpHead()
  {
    return opHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpHead(OpHead newOpHead, NotificationChain msgs)
  {
    OpHead oldOpHead = opHead;
    opHead = newOpHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_HEAD, oldOpHead, newOpHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpHead(OpHead newOpHead)
  {
    if (newOpHead != opHead)
    {
      NotificationChain msgs = null;
      if (opHead != null)
        msgs = ((InternalEObject)opHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_HEAD, null, msgs);
      if (newOpHead != null)
        msgs = ((InternalEObject)newOpHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__OP_HEAD, null, msgs);
      msgs = basicSetOpHead(newOpHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__OP_HEAD, newOpHead, newOpHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs)
  {
    Term oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Term newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_ITEM__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_ITEM__TERM, newTerm, newTerm));
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
      case EditorPackage.OP_ITEM__OP_NAME:
        return basicSetOpName(null, msgs);
      case EditorPackage.OP_ITEM__OP_NAME2:
        return ((InternalEList<?>)getOpName2()).basicRemove(otherEnd, msgs);
      case EditorPackage.OP_ITEM__OP_TYPE:
        return basicSetOpType(null, msgs);
      case EditorPackage.OP_ITEM__OP_ATTR:
        return ((InternalEList<?>)getOpAttr()).basicRemove(otherEnd, msgs);
      case EditorPackage.OP_ITEM__OP_HEAD:
        return basicSetOpHead(null, msgs);
      case EditorPackage.OP_ITEM__TERM:
        return basicSetTerm(null, msgs);
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
      case EditorPackage.OP_ITEM__OP_NAME:
        return getOpName();
      case EditorPackage.OP_ITEM__OP_NAME2:
        return getOpName2();
      case EditorPackage.OP_ITEM__OP_TYPE:
        return getOpType();
      case EditorPackage.OP_ITEM__OP_ATTR:
        return getOpAttr();
      case EditorPackage.OP_ITEM__OP_HEAD:
        return getOpHead();
      case EditorPackage.OP_ITEM__TERM:
        return getTerm();
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
      case EditorPackage.OP_ITEM__OP_NAME:
        setOpName((OpName)newValue);
        return;
      case EditorPackage.OP_ITEM__OP_NAME2:
        getOpName2().clear();
        getOpName2().addAll((Collection<? extends OpName>)newValue);
        return;
      case EditorPackage.OP_ITEM__OP_TYPE:
        setOpType((OpType)newValue);
        return;
      case EditorPackage.OP_ITEM__OP_ATTR:
        getOpAttr().clear();
        getOpAttr().addAll((Collection<? extends OpAttr>)newValue);
        return;
      case EditorPackage.OP_ITEM__OP_HEAD:
        setOpHead((OpHead)newValue);
        return;
      case EditorPackage.OP_ITEM__TERM:
        setTerm((Term)newValue);
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
      case EditorPackage.OP_ITEM__OP_NAME:
        setOpName((OpName)null);
        return;
      case EditorPackage.OP_ITEM__OP_NAME2:
        getOpName2().clear();
        return;
      case EditorPackage.OP_ITEM__OP_TYPE:
        setOpType((OpType)null);
        return;
      case EditorPackage.OP_ITEM__OP_ATTR:
        getOpAttr().clear();
        return;
      case EditorPackage.OP_ITEM__OP_HEAD:
        setOpHead((OpHead)null);
        return;
      case EditorPackage.OP_ITEM__TERM:
        setTerm((Term)null);
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
      case EditorPackage.OP_ITEM__OP_NAME:
        return opName != null;
      case EditorPackage.OP_ITEM__OP_NAME2:
        return opName2 != null && !opName2.isEmpty();
      case EditorPackage.OP_ITEM__OP_TYPE:
        return opType != null;
      case EditorPackage.OP_ITEM__OP_ATTR:
        return opAttr != null && !opAttr.isEmpty();
      case EditorPackage.OP_ITEM__OP_HEAD:
        return opHead != null;
      case EditorPackage.OP_ITEM__TERM:
        return term != null;
    }
    return super.eIsSet(featureID);
  }

} //OpItemImpl
