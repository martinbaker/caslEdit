/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Literal;
import com.euclideanspace.casl.editor.Mfix;
import com.euclideanspace.casl.editor.QualOpName;
import com.euclideanspace.casl.editor.QualPredName;
import com.euclideanspace.casl.editor.QualVarName;
import com.euclideanspace.casl.editor.Token;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mfix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp2 <em>Op2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp3 <em>Op3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp4 <em>Op4</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp5 <em>Op5</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp6 <em>Op6</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.MfixImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MfixImpl extends MinimalEObjectImpl.Container implements Mfix
{
  /**
   * The cached value of the '{@link #getMisfix() <em>Misfix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMisfix()
   * @generated
   * @ordered
   */
  protected Mfix misfix;

  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected Token op1;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected Literal op2;

  /**
   * The default value of the '{@link #getOp3() <em>Op3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp3()
   * @generated
   * @ordered
   */
  protected static final String OP3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp3() <em>Op3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp3()
   * @generated
   * @ordered
   */
  protected String op3 = OP3_EDEFAULT;

  /**
   * The cached value of the '{@link #getOp4() <em>Op4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp4()
   * @generated
   * @ordered
   */
  protected QualPredName op4;

  /**
   * The cached value of the '{@link #getOp5() <em>Op5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp5()
   * @generated
   * @ordered
   */
  protected QualVarName op5;

  /**
   * The cached value of the '{@link #getOp6() <em>Op6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp6()
   * @generated
   * @ordered
   */
  protected QualOpName op6;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MfixImpl()
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
    return EditorPackage.Literals.MFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mfix getMisfix()
  {
    return misfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMisfix(Mfix newMisfix, NotificationChain msgs)
  {
    Mfix oldMisfix = misfix;
    misfix = newMisfix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__MISFIX, oldMisfix, newMisfix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMisfix(Mfix newMisfix)
  {
    if (newMisfix != misfix)
    {
      NotificationChain msgs = null;
      if (misfix != null)
        msgs = ((InternalEObject)misfix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__MISFIX, null, msgs);
      if (newMisfix != null)
        msgs = ((InternalEObject)newMisfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__MISFIX, null, msgs);
      msgs = basicSetMisfix(newMisfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__MISFIX, newMisfix, newMisfix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Token getOp1()
  {
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp1(Token newOp1, NotificationChain msgs)
  {
    Token oldOp1 = op1;
    op1 = newOp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP1, oldOp1, newOp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp1(Token newOp1)
  {
    if (newOp1 != op1)
    {
      NotificationChain msgs = null;
      if (op1 != null)
        msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP1, null, msgs);
      if (newOp1 != null)
        msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP1, null, msgs);
      msgs = basicSetOp1(newOp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP1, newOp1, newOp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp2(Literal newOp2, NotificationChain msgs)
  {
    Literal oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP2, oldOp2, newOp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp2(Literal newOp2)
  {
    if (newOp2 != op2)
    {
      NotificationChain msgs = null;
      if (op2 != null)
        msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP2, null, msgs);
      if (newOp2 != null)
        msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP2, null, msgs);
      msgs = basicSetOp2(newOp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP2, newOp2, newOp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp3()
  {
    return op3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp3(String newOp3)
  {
    String oldOp3 = op3;
    op3 = newOp3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP3, oldOp3, op3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualPredName getOp4()
  {
    return op4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp4(QualPredName newOp4, NotificationChain msgs)
  {
    QualPredName oldOp4 = op4;
    op4 = newOp4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP4, oldOp4, newOp4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp4(QualPredName newOp4)
  {
    if (newOp4 != op4)
    {
      NotificationChain msgs = null;
      if (op4 != null)
        msgs = ((InternalEObject)op4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP4, null, msgs);
      if (newOp4 != null)
        msgs = ((InternalEObject)newOp4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP4, null, msgs);
      msgs = basicSetOp4(newOp4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP4, newOp4, newOp4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualVarName getOp5()
  {
    return op5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp5(QualVarName newOp5, NotificationChain msgs)
  {
    QualVarName oldOp5 = op5;
    op5 = newOp5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP5, oldOp5, newOp5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp5(QualVarName newOp5)
  {
    if (newOp5 != op5)
    {
      NotificationChain msgs = null;
      if (op5 != null)
        msgs = ((InternalEObject)op5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP5, null, msgs);
      if (newOp5 != null)
        msgs = ((InternalEObject)newOp5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP5, null, msgs);
      msgs = basicSetOp5(newOp5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP5, newOp5, newOp5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOpName getOp6()
  {
    return op6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp6(QualOpName newOp6, NotificationChain msgs)
  {
    QualOpName oldOp6 = op6;
    op6 = newOp6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP6, oldOp6, newOp6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp6(QualOpName newOp6)
  {
    if (newOp6 != op6)
    {
      NotificationChain msgs = null;
      if (op6 != null)
        msgs = ((InternalEObject)op6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP6, null, msgs);
      if (newOp6 != null)
        msgs = ((InternalEObject)newOp6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.MFIX__OP6, null, msgs);
      msgs = basicSetOp6(newOp6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP6, newOp6, newOp6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.MFIX__OP, oldOp, op));
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
      case EditorPackage.MFIX__MISFIX:
        return basicSetMisfix(null, msgs);
      case EditorPackage.MFIX__OP1:
        return basicSetOp1(null, msgs);
      case EditorPackage.MFIX__OP2:
        return basicSetOp2(null, msgs);
      case EditorPackage.MFIX__OP4:
        return basicSetOp4(null, msgs);
      case EditorPackage.MFIX__OP5:
        return basicSetOp5(null, msgs);
      case EditorPackage.MFIX__OP6:
        return basicSetOp6(null, msgs);
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
      case EditorPackage.MFIX__MISFIX:
        return getMisfix();
      case EditorPackage.MFIX__OP1:
        return getOp1();
      case EditorPackage.MFIX__OP2:
        return getOp2();
      case EditorPackage.MFIX__OP3:
        return getOp3();
      case EditorPackage.MFIX__OP4:
        return getOp4();
      case EditorPackage.MFIX__OP5:
        return getOp5();
      case EditorPackage.MFIX__OP6:
        return getOp6();
      case EditorPackage.MFIX__OP:
        return getOp();
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
      case EditorPackage.MFIX__MISFIX:
        setMisfix((Mfix)newValue);
        return;
      case EditorPackage.MFIX__OP1:
        setOp1((Token)newValue);
        return;
      case EditorPackage.MFIX__OP2:
        setOp2((Literal)newValue);
        return;
      case EditorPackage.MFIX__OP3:
        setOp3((String)newValue);
        return;
      case EditorPackage.MFIX__OP4:
        setOp4((QualPredName)newValue);
        return;
      case EditorPackage.MFIX__OP5:
        setOp5((QualVarName)newValue);
        return;
      case EditorPackage.MFIX__OP6:
        setOp6((QualOpName)newValue);
        return;
      case EditorPackage.MFIX__OP:
        setOp((String)newValue);
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
      case EditorPackage.MFIX__MISFIX:
        setMisfix((Mfix)null);
        return;
      case EditorPackage.MFIX__OP1:
        setOp1((Token)null);
        return;
      case EditorPackage.MFIX__OP2:
        setOp2((Literal)null);
        return;
      case EditorPackage.MFIX__OP3:
        setOp3(OP3_EDEFAULT);
        return;
      case EditorPackage.MFIX__OP4:
        setOp4((QualPredName)null);
        return;
      case EditorPackage.MFIX__OP5:
        setOp5((QualVarName)null);
        return;
      case EditorPackage.MFIX__OP6:
        setOp6((QualOpName)null);
        return;
      case EditorPackage.MFIX__OP:
        setOp(OP_EDEFAULT);
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
      case EditorPackage.MFIX__MISFIX:
        return misfix != null;
      case EditorPackage.MFIX__OP1:
        return op1 != null;
      case EditorPackage.MFIX__OP2:
        return op2 != null;
      case EditorPackage.MFIX__OP3:
        return OP3_EDEFAULT == null ? op3 != null : !OP3_EDEFAULT.equals(op3);
      case EditorPackage.MFIX__OP4:
        return op4 != null;
      case EditorPackage.MFIX__OP5:
        return op5 != null;
      case EditorPackage.MFIX__OP6:
        return op6 != null;
      case EditorPackage.MFIX__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
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
    result.append(" (op3: ");
    result.append(op3);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //MfixImpl
