/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Mfix;
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
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.TermImpl#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.TermImpl#getMisfix2 <em>Misfix2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
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
   * The cached value of the '{@link #getMisfix2() <em>Misfix2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMisfix2()
   * @generated
   * @ordered
   */
  protected EList<Mfix> misfix2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return EditorPackage.Literals.TERM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.TERM__MISFIX, oldMisfix, newMisfix);
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
        msgs = ((InternalEObject)misfix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TERM__MISFIX, null, msgs);
      if (newMisfix != null)
        msgs = ((InternalEObject)newMisfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.TERM__MISFIX, null, msgs);
      msgs = basicSetMisfix(newMisfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TERM__MISFIX, newMisfix, newMisfix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mfix> getMisfix2()
  {
    if (misfix2 == null)
    {
      misfix2 = new EObjectContainmentEList<Mfix>(Mfix.class, this, EditorPackage.TERM__MISFIX2);
    }
    return misfix2;
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
      case EditorPackage.TERM__MISFIX:
        return basicSetMisfix(null, msgs);
      case EditorPackage.TERM__MISFIX2:
        return ((InternalEList<?>)getMisfix2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.TERM__MISFIX:
        return getMisfix();
      case EditorPackage.TERM__MISFIX2:
        return getMisfix2();
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
      case EditorPackage.TERM__MISFIX:
        setMisfix((Mfix)newValue);
        return;
      case EditorPackage.TERM__MISFIX2:
        getMisfix2().clear();
        getMisfix2().addAll((Collection<? extends Mfix>)newValue);
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
      case EditorPackage.TERM__MISFIX:
        setMisfix((Mfix)null);
        return;
      case EditorPackage.TERM__MISFIX2:
        getMisfix2().clear();
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
      case EditorPackage.TERM__MISFIX:
        return misfix != null;
      case EditorPackage.TERM__MISFIX2:
        return misfix2 != null && !misfix2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TermImpl
