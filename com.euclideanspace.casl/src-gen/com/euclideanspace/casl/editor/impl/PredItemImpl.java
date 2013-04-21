/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Formu;
import com.euclideanspace.casl.editor.PredHead;
import com.euclideanspace.casl.editor.PredItem;
import com.euclideanspace.casl.editor.PredName;
import com.euclideanspace.casl.editor.PredType;

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
 * An implementation of the model object '<em><b>Pred Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredItemImpl#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredItemImpl#getPredName2 <em>Pred Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredItemImpl#getPredType <em>Pred Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredItemImpl#getPredHead <em>Pred Head</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredItemImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredItemImpl extends MinimalEObjectImpl.Container implements PredItem
{
  /**
   * The cached value of the '{@link #getPredName() <em>Pred Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredName()
   * @generated
   * @ordered
   */
  protected PredName predName;

  /**
   * The cached value of the '{@link #getPredName2() <em>Pred Name2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredName2()
   * @generated
   * @ordered
   */
  protected EList<PredName> predName2;

  /**
   * The cached value of the '{@link #getPredType() <em>Pred Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredType()
   * @generated
   * @ordered
   */
  protected EList<PredType> predType;

  /**
   * The cached value of the '{@link #getPredHead() <em>Pred Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredHead()
   * @generated
   * @ordered
   */
  protected PredHead predHead;

  /**
   * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula()
   * @generated
   * @ordered
   */
  protected Formu formula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredItemImpl()
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
    return EditorPackage.Literals.PRED_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredName getPredName()
  {
    return predName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredName(PredName newPredName, NotificationChain msgs)
  {
    PredName oldPredName = predName;
    predName = newPredName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__PRED_NAME, oldPredName, newPredName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredName(PredName newPredName)
  {
    if (newPredName != predName)
    {
      NotificationChain msgs = null;
      if (predName != null)
        msgs = ((InternalEObject)predName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__PRED_NAME, null, msgs);
      if (newPredName != null)
        msgs = ((InternalEObject)newPredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__PRED_NAME, null, msgs);
      msgs = basicSetPredName(newPredName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__PRED_NAME, newPredName, newPredName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PredName> getPredName2()
  {
    if (predName2 == null)
    {
      predName2 = new EObjectContainmentEList<PredName>(PredName.class, this, EditorPackage.PRED_ITEM__PRED_NAME2);
    }
    return predName2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PredType> getPredType()
  {
    if (predType == null)
    {
      predType = new EObjectContainmentEList<PredType>(PredType.class, this, EditorPackage.PRED_ITEM__PRED_TYPE);
    }
    return predType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredHead getPredHead()
  {
    return predHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredHead(PredHead newPredHead, NotificationChain msgs)
  {
    PredHead oldPredHead = predHead;
    predHead = newPredHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__PRED_HEAD, oldPredHead, newPredHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredHead(PredHead newPredHead)
  {
    if (newPredHead != predHead)
    {
      NotificationChain msgs = null;
      if (predHead != null)
        msgs = ((InternalEObject)predHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__PRED_HEAD, null, msgs);
      if (newPredHead != null)
        msgs = ((InternalEObject)newPredHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__PRED_HEAD, null, msgs);
      msgs = basicSetPredHead(newPredHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__PRED_HEAD, newPredHead, newPredHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formu getFormula()
  {
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormula(Formu newFormula, NotificationChain msgs)
  {
    Formu oldFormula = formula;
    formula = newFormula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__FORMULA, oldFormula, newFormula);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormula(Formu newFormula)
  {
    if (newFormula != formula)
    {
      NotificationChain msgs = null;
      if (formula != null)
        msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__FORMULA, null, msgs);
      if (newFormula != null)
        msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_ITEM__FORMULA, null, msgs);
      msgs = basicSetFormula(newFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_ITEM__FORMULA, newFormula, newFormula));
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
      case EditorPackage.PRED_ITEM__PRED_NAME:
        return basicSetPredName(null, msgs);
      case EditorPackage.PRED_ITEM__PRED_NAME2:
        return ((InternalEList<?>)getPredName2()).basicRemove(otherEnd, msgs);
      case EditorPackage.PRED_ITEM__PRED_TYPE:
        return ((InternalEList<?>)getPredType()).basicRemove(otherEnd, msgs);
      case EditorPackage.PRED_ITEM__PRED_HEAD:
        return basicSetPredHead(null, msgs);
      case EditorPackage.PRED_ITEM__FORMULA:
        return basicSetFormula(null, msgs);
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
      case EditorPackage.PRED_ITEM__PRED_NAME:
        return getPredName();
      case EditorPackage.PRED_ITEM__PRED_NAME2:
        return getPredName2();
      case EditorPackage.PRED_ITEM__PRED_TYPE:
        return getPredType();
      case EditorPackage.PRED_ITEM__PRED_HEAD:
        return getPredHead();
      case EditorPackage.PRED_ITEM__FORMULA:
        return getFormula();
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
      case EditorPackage.PRED_ITEM__PRED_NAME:
        setPredName((PredName)newValue);
        return;
      case EditorPackage.PRED_ITEM__PRED_NAME2:
        getPredName2().clear();
        getPredName2().addAll((Collection<? extends PredName>)newValue);
        return;
      case EditorPackage.PRED_ITEM__PRED_TYPE:
        getPredType().clear();
        getPredType().addAll((Collection<? extends PredType>)newValue);
        return;
      case EditorPackage.PRED_ITEM__PRED_HEAD:
        setPredHead((PredHead)newValue);
        return;
      case EditorPackage.PRED_ITEM__FORMULA:
        setFormula((Formu)newValue);
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
      case EditorPackage.PRED_ITEM__PRED_NAME:
        setPredName((PredName)null);
        return;
      case EditorPackage.PRED_ITEM__PRED_NAME2:
        getPredName2().clear();
        return;
      case EditorPackage.PRED_ITEM__PRED_TYPE:
        getPredType().clear();
        return;
      case EditorPackage.PRED_ITEM__PRED_HEAD:
        setPredHead((PredHead)null);
        return;
      case EditorPackage.PRED_ITEM__FORMULA:
        setFormula((Formu)null);
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
      case EditorPackage.PRED_ITEM__PRED_NAME:
        return predName != null;
      case EditorPackage.PRED_ITEM__PRED_NAME2:
        return predName2 != null && !predName2.isEmpty();
      case EditorPackage.PRED_ITEM__PRED_TYPE:
        return predType != null && !predType.isEmpty();
      case EditorPackage.PRED_ITEM__PRED_HEAD:
        return predHead != null;
      case EditorPackage.PRED_ITEM__FORMULA:
        return formula != null;
    }
    return super.eIsSet(featureID);
  }

} //PredItemImpl
