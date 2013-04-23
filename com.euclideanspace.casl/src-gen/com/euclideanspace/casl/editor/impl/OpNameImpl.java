/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpName;
import com.euclideanspace.casl.editor.OpType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getOpType <em>Op Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getNum <em>Num</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getOpName2 <em>Op Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.OpNameImpl#getOpType2 <em>Op Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpNameImpl extends QualOpNameImpl implements OpName
{
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
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

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
   * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected static final String SUFFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected String suffix = SUFFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpName()
   * @generated
   * @ordered
   */
  protected static final String OP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpName()
   * @generated
   * @ordered
   */
  protected String opName = OP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpName2() <em>Op Name2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpName2()
   * @generated
   * @ordered
   */
  protected EList<String> opName2;

  /**
   * The cached value of the '{@link #getOpType2() <em>Op Type2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType2()
   * @generated
   * @ordered
   */
  protected EList<OpType> opType2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpNameImpl()
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
    return EditorPackage.Literals.OP_NAME;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__OP_TYPE, oldOpType, newOpType);
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
        msgs = ((InternalEObject)opType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_NAME__OP_TYPE, null, msgs);
      if (newOpType != null)
        msgs = ((InternalEObject)newOpType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.OP_NAME__OP_TYPE, null, msgs);
      msgs = basicSetOpType(newOpType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__OP_TYPE, newOpType, newOpType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__NUM, oldNum, num));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuffix()
  {
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuffix(String newSuffix)
  {
    String oldSuffix = suffix;
    suffix = newSuffix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__SUFFIX, oldSuffix, suffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpName()
  {
    return opName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpName(String newOpName)
  {
    String oldOpName = opName;
    opName = newOpName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.OP_NAME__OP_NAME, oldOpName, opName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOpName2()
  {
    if (opName2 == null)
    {
      opName2 = new EDataTypeEList<String>(String.class, this, EditorPackage.OP_NAME__OP_NAME2);
    }
    return opName2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OpType> getOpType2()
  {
    if (opType2 == null)
    {
      opType2 = new EObjectContainmentEList<OpType>(OpType.class, this, EditorPackage.OP_NAME__OP_TYPE2);
    }
    return opType2;
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
      case EditorPackage.OP_NAME__OP_TYPE:
        return basicSetOpType(null, msgs);
      case EditorPackage.OP_NAME__OP_TYPE2:
        return ((InternalEList<?>)getOpType2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.OP_NAME__OP_TYPE:
        return getOpType();
      case EditorPackage.OP_NAME__PREFIX:
        return getPrefix();
      case EditorPackage.OP_NAME__NAME:
        return getName();
      case EditorPackage.OP_NAME__NUM:
        return getNum();
      case EditorPackage.OP_NAME__OP:
        return getOp();
      case EditorPackage.OP_NAME__SUFFIX:
        return getSuffix();
      case EditorPackage.OP_NAME__OP_NAME:
        return getOpName();
      case EditorPackage.OP_NAME__OP_NAME2:
        return getOpName2();
      case EditorPackage.OP_NAME__OP_TYPE2:
        return getOpType2();
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
      case EditorPackage.OP_NAME__OP_TYPE:
        setOpType((OpType)newValue);
        return;
      case EditorPackage.OP_NAME__PREFIX:
        setPrefix((String)newValue);
        return;
      case EditorPackage.OP_NAME__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.OP_NAME__NUM:
        setNum((Integer)newValue);
        return;
      case EditorPackage.OP_NAME__OP:
        setOp((String)newValue);
        return;
      case EditorPackage.OP_NAME__SUFFIX:
        setSuffix((String)newValue);
        return;
      case EditorPackage.OP_NAME__OP_NAME:
        setOpName((String)newValue);
        return;
      case EditorPackage.OP_NAME__OP_NAME2:
        getOpName2().clear();
        getOpName2().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.OP_NAME__OP_TYPE2:
        getOpType2().clear();
        getOpType2().addAll((Collection<? extends OpType>)newValue);
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
      case EditorPackage.OP_NAME__OP_TYPE:
        setOpType((OpType)null);
        return;
      case EditorPackage.OP_NAME__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__OP:
        setOp(OP_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__SUFFIX:
        setSuffix(SUFFIX_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__OP_NAME:
        setOpName(OP_NAME_EDEFAULT);
        return;
      case EditorPackage.OP_NAME__OP_NAME2:
        getOpName2().clear();
        return;
      case EditorPackage.OP_NAME__OP_TYPE2:
        getOpType2().clear();
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
      case EditorPackage.OP_NAME__OP_TYPE:
        return opType != null;
      case EditorPackage.OP_NAME__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case EditorPackage.OP_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.OP_NAME__NUM:
        return num != NUM_EDEFAULT;
      case EditorPackage.OP_NAME__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EditorPackage.OP_NAME__SUFFIX:
        return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
      case EditorPackage.OP_NAME__OP_NAME:
        return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
      case EditorPackage.OP_NAME__OP_NAME2:
        return opName2 != null && !opName2.isEmpty();
      case EditorPackage.OP_NAME__OP_TYPE2:
        return opType2 != null && !opType2.isEmpty();
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
    result.append(" (prefix: ");
    result.append(prefix);
    result.append(", name: ");
    result.append(name);
    result.append(", num: ");
    result.append(num);
    result.append(", op: ");
    result.append(op);
    result.append(", suffix: ");
    result.append(suffix);
    result.append(", opName: ");
    result.append(opName);
    result.append(", opName2: ");
    result.append(opName2);
    result.append(')');
    return result.toString();
  }

} //OpNameImpl
