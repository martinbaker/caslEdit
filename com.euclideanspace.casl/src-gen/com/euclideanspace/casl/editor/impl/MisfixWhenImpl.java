/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Formu;
import com.euclideanspace.casl.editor.Mfix;
import com.euclideanspace.casl.editor.MisfixWhen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Misfix When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MisfixWhenImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MisfixWhenImpl#getOp0 <em>Op0</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MisfixWhenImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MisfixWhenImpl extends MfixImpl implements MisfixWhen
{
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
   * The default value of the '{@link #getOp0() <em>Op0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp0()
   * @generated
   * @ordered
   */
  protected static final String OP0_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp0() <em>Op0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp0()
   * @generated
   * @ordered
   */
  protected String op0 = OP0_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Mfix right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MisfixWhenImpl()
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
    return EditorPackage.Literals.MISFIX_WHEN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MISFIX_WHEN__FORMULA, oldFormula, newFormula);
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
        msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MISFIX_WHEN__FORMULA, null, msgs);
      if (newFormula != null)
        msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MISFIX_WHEN__FORMULA, null, msgs);
      msgs = basicSetFormula(newFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MISFIX_WHEN__FORMULA, newFormula, newFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp0()
  {
    return op0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp0(String newOp0)
  {
    String oldOp0 = op0;
    op0 = newOp0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MISFIX_WHEN__OP0, oldOp0, op0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mfix getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Mfix newRight, NotificationChain msgs)
  {
    Mfix oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MISFIX_WHEN__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Mfix newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MISFIX_WHEN__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MISFIX_WHEN__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MISFIX_WHEN__RIGHT, newRight, newRight));
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
      case EditorPackage.MISFIX_WHEN__FORMULA:
        return basicSetFormula(null, msgs);
      case EditorPackage.MISFIX_WHEN__RIGHT:
        return basicSetRight(null, msgs);
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
      case EditorPackage.MISFIX_WHEN__FORMULA:
        return getFormula();
      case EditorPackage.MISFIX_WHEN__OP0:
        return getOp0();
      case EditorPackage.MISFIX_WHEN__RIGHT:
        return getRight();
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
      case EditorPackage.MISFIX_WHEN__FORMULA:
        setFormula((Formu)newValue);
        return;
      case EditorPackage.MISFIX_WHEN__OP0:
        setOp0((String)newValue);
        return;
      case EditorPackage.MISFIX_WHEN__RIGHT:
        setRight((Mfix)newValue);
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
      case EditorPackage.MISFIX_WHEN__FORMULA:
        setFormula((Formu)null);
        return;
      case EditorPackage.MISFIX_WHEN__OP0:
        setOp0(OP0_EDEFAULT);
        return;
      case EditorPackage.MISFIX_WHEN__RIGHT:
        setRight((Mfix)null);
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
      case EditorPackage.MISFIX_WHEN__FORMULA:
        return formula != null;
      case EditorPackage.MISFIX_WHEN__OP0:
        return OP0_EDEFAULT == null ? op0 != null : !OP0_EDEFAULT.equals(op0);
      case EditorPackage.MISFIX_WHEN__RIGHT:
        return right != null;
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
    result.append(" (op0: ");
    result.append(op0);
    result.append(')');
    return result.toString();
  }

} //MisfixWhenImpl
