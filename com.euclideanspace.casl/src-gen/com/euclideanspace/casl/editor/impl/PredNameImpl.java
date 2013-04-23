/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.PredName;
import com.euclideanspace.casl.editor.PredType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pred Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredNameImpl#getPredType <em>Pred Type</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredNameImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredNameImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.PredNameImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredNameImpl extends QualVarNameImpl implements PredName
{
  /**
   * The cached value of the '{@link #getPredType() <em>Pred Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredType()
   * @generated
   * @ordered
   */
  protected PredType predType;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredNameImpl()
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
    return EditorPackage.Literals.PRED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredType getPredType()
  {
    return predType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredType(PredType newPredType, NotificationChain msgs)
  {
    PredType oldPredType = predType;
    predType = newPredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__PRED_TYPE, oldPredType, newPredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredType(PredType newPredType)
  {
    if (newPredType != predType)
    {
      NotificationChain msgs = null;
      if (predType != null)
        msgs = ((InternalEObject)predType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_NAME__PRED_TYPE, null, msgs);
      if (newPredType != null)
        msgs = ((InternalEObject)newPredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRED_NAME__PRED_TYPE, null, msgs);
      msgs = basicSetPredType(newPredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__PRED_TYPE, newPredType, newPredType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__PREFIX, oldPrefix, prefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__OP, oldOp, op));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRED_NAME__SUFFIX, oldSuffix, suffix));
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
      case EditorPackage.PRED_NAME__PRED_TYPE:
        return basicSetPredType(null, msgs);
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
      case EditorPackage.PRED_NAME__PRED_TYPE:
        return getPredType();
      case EditorPackage.PRED_NAME__PREFIX:
        return getPrefix();
      case EditorPackage.PRED_NAME__NAME:
        return getName();
      case EditorPackage.PRED_NAME__OP:
        return getOp();
      case EditorPackage.PRED_NAME__SUFFIX:
        return getSuffix();
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
      case EditorPackage.PRED_NAME__PRED_TYPE:
        setPredType((PredType)newValue);
        return;
      case EditorPackage.PRED_NAME__PREFIX:
        setPrefix((String)newValue);
        return;
      case EditorPackage.PRED_NAME__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.PRED_NAME__OP:
        setOp((String)newValue);
        return;
      case EditorPackage.PRED_NAME__SUFFIX:
        setSuffix((String)newValue);
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
      case EditorPackage.PRED_NAME__PRED_TYPE:
        setPredType((PredType)null);
        return;
      case EditorPackage.PRED_NAME__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case EditorPackage.PRED_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.PRED_NAME__OP:
        setOp(OP_EDEFAULT);
        return;
      case EditorPackage.PRED_NAME__SUFFIX:
        setSuffix(SUFFIX_EDEFAULT);
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
      case EditorPackage.PRED_NAME__PRED_TYPE:
        return predType != null;
      case EditorPackage.PRED_NAME__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case EditorPackage.PRED_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.PRED_NAME__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EditorPackage.PRED_NAME__SUFFIX:
        return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
    result.append(", op: ");
    result.append(op);
    result.append(", suffix: ");
    result.append(suffix);
    result.append(')');
    return result.toString();
  }

} //PredNameImpl
