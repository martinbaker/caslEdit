/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.Alternative;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Sort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SortImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SortImpl#getAlternative2 <em>Alternative2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SortImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortImpl extends DatatypeDeclImpl implements Sort
{
  /**
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected Alternative alternative;

  /**
   * The cached value of the '{@link #getAlternative2() <em>Alternative2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative2()
   * @generated
   * @ordered
   */
  protected EList<Alternative> alternative2;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortImpl()
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
    return EditorPackage.Literals.SORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(Alternative newAlternative, NotificationChain msgs)
  {
    Alternative oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SORT__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(Alternative newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SORT__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SORT__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SORT__ALTERNATIVE, newAlternative, newAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alternative> getAlternative2()
  {
    if (alternative2 == null)
    {
      alternative2 = new EObjectContainmentEList<Alternative>(Alternative.class, this, EditorPackage.SORT__ALTERNATIVE2);
    }
    return alternative2;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SORT__NAME, oldName, name));
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
      case EditorPackage.SORT__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
      case EditorPackage.SORT__ALTERNATIVE2:
        return ((InternalEList<?>)getAlternative2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.SORT__ALTERNATIVE:
        return getAlternative();
      case EditorPackage.SORT__ALTERNATIVE2:
        return getAlternative2();
      case EditorPackage.SORT__NAME:
        return getName();
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
      case EditorPackage.SORT__ALTERNATIVE:
        setAlternative((Alternative)newValue);
        return;
      case EditorPackage.SORT__ALTERNATIVE2:
        getAlternative2().clear();
        getAlternative2().addAll((Collection<? extends Alternative>)newValue);
        return;
      case EditorPackage.SORT__NAME:
        setName((String)newValue);
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
      case EditorPackage.SORT__ALTERNATIVE:
        setAlternative((Alternative)null);
        return;
      case EditorPackage.SORT__ALTERNATIVE2:
        getAlternative2().clear();
        return;
      case EditorPackage.SORT__NAME:
        setName(NAME_EDEFAULT);
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
      case EditorPackage.SORT__ALTERNATIVE:
        return alternative != null;
      case EditorPackage.SORT__ALTERNATIVE2:
        return alternative2 != null && !alternative2.isEmpty();
      case EditorPackage.SORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SortImpl
