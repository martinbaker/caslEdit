/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.BasicItems;
import com.euclideanspace.casl.editor.DatatypeDecl;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Formu;
import com.euclideanspace.casl.editor.SigItems;
import com.euclideanspace.casl.editor.VarDecl;

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
 * An implementation of the model object '<em><b>Basic Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getS <em>S</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getDatatypeDecl <em>Datatype Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getDatatypeDecl2 <em>Datatype Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getS2 <em>S2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getVarDecl <em>Var Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getVarDecl2 <em>Var Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl#getFormula2 <em>Formula2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicItemsImpl extends MinimalEObjectImpl.Container implements BasicItems
{
  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected SigItems s;

  /**
   * The cached value of the '{@link #getDatatypeDecl() <em>Datatype Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypeDecl()
   * @generated
   * @ordered
   */
  protected DatatypeDecl datatypeDecl;

  /**
   * The cached value of the '{@link #getDatatypeDecl2() <em>Datatype Decl2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypeDecl2()
   * @generated
   * @ordered
   */
  protected EList<DatatypeDecl> datatypeDecl2;

  /**
   * The cached value of the '{@link #getS2() <em>S2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS2()
   * @generated
   * @ordered
   */
  protected EList<SigItems> s2;

  /**
   * The cached value of the '{@link #getVarDecl() <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecl()
   * @generated
   * @ordered
   */
  protected VarDecl varDecl;

  /**
   * The cached value of the '{@link #getVarDecl2() <em>Var Decl2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecl2()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> varDecl2;

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
   * The cached value of the '{@link #getFormula2() <em>Formula2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula2()
   * @generated
   * @ordered
   */
  protected EList<Formu> formula2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicItemsImpl()
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
    return EditorPackage.Literals.BASIC_ITEMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigItems getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(SigItems newS, NotificationChain msgs)
  {
    SigItems oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(SigItems newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeDecl getDatatypeDecl()
  {
    return datatypeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatypeDecl(DatatypeDecl newDatatypeDecl, NotificationChain msgs)
  {
    DatatypeDecl oldDatatypeDecl = datatypeDecl;
    datatypeDecl = newDatatypeDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__DATATYPE_DECL, oldDatatypeDecl, newDatatypeDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatypeDecl(DatatypeDecl newDatatypeDecl)
  {
    if (newDatatypeDecl != datatypeDecl)
    {
      NotificationChain msgs = null;
      if (datatypeDecl != null)
        msgs = ((InternalEObject)datatypeDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__DATATYPE_DECL, null, msgs);
      if (newDatatypeDecl != null)
        msgs = ((InternalEObject)newDatatypeDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__DATATYPE_DECL, null, msgs);
      msgs = basicSetDatatypeDecl(newDatatypeDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__DATATYPE_DECL, newDatatypeDecl, newDatatypeDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatatypeDecl> getDatatypeDecl2()
  {
    if (datatypeDecl2 == null)
    {
      datatypeDecl2 = new EObjectContainmentEList<DatatypeDecl>(DatatypeDecl.class, this, EditorPackage.BASIC_ITEMS__DATATYPE_DECL2);
    }
    return datatypeDecl2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SigItems> getS2()
  {
    if (s2 == null)
    {
      s2 = new EObjectContainmentEList<SigItems>(SigItems.class, this, EditorPackage.BASIC_ITEMS__S2);
    }
    return s2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVarDecl()
  {
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarDecl(VarDecl newVarDecl, NotificationChain msgs)
  {
    VarDecl oldVarDecl = varDecl;
    varDecl = newVarDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__VAR_DECL, oldVarDecl, newVarDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarDecl(VarDecl newVarDecl)
  {
    if (newVarDecl != varDecl)
    {
      NotificationChain msgs = null;
      if (varDecl != null)
        msgs = ((InternalEObject)varDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__VAR_DECL, null, msgs);
      if (newVarDecl != null)
        msgs = ((InternalEObject)newVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__VAR_DECL, null, msgs);
      msgs = basicSetVarDecl(newVarDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__VAR_DECL, newVarDecl, newVarDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDecl> getVarDecl2()
  {
    if (varDecl2 == null)
    {
      varDecl2 = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, EditorPackage.BASIC_ITEMS__VAR_DECL2);
    }
    return varDecl2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__FORMULA, oldFormula, newFormula);
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
        msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__FORMULA, null, msgs);
      if (newFormula != null)
        msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.BASIC_ITEMS__FORMULA, null, msgs);
      msgs = basicSetFormula(newFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_ITEMS__FORMULA, newFormula, newFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Formu> getFormula2()
  {
    if (formula2 == null)
    {
      formula2 = new EObjectContainmentEList<Formu>(Formu.class, this, EditorPackage.BASIC_ITEMS__FORMULA2);
    }
    return formula2;
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
      case EditorPackage.BASIC_ITEMS__S:
        return basicSetS(null, msgs);
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL:
        return basicSetDatatypeDecl(null, msgs);
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL2:
        return ((InternalEList<?>)getDatatypeDecl2()).basicRemove(otherEnd, msgs);
      case EditorPackage.BASIC_ITEMS__S2:
        return ((InternalEList<?>)getS2()).basicRemove(otherEnd, msgs);
      case EditorPackage.BASIC_ITEMS__VAR_DECL:
        return basicSetVarDecl(null, msgs);
      case EditorPackage.BASIC_ITEMS__VAR_DECL2:
        return ((InternalEList<?>)getVarDecl2()).basicRemove(otherEnd, msgs);
      case EditorPackage.BASIC_ITEMS__FORMULA:
        return basicSetFormula(null, msgs);
      case EditorPackage.BASIC_ITEMS__FORMULA2:
        return ((InternalEList<?>)getFormula2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.BASIC_ITEMS__S:
        return getS();
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL:
        return getDatatypeDecl();
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL2:
        return getDatatypeDecl2();
      case EditorPackage.BASIC_ITEMS__S2:
        return getS2();
      case EditorPackage.BASIC_ITEMS__VAR_DECL:
        return getVarDecl();
      case EditorPackage.BASIC_ITEMS__VAR_DECL2:
        return getVarDecl2();
      case EditorPackage.BASIC_ITEMS__FORMULA:
        return getFormula();
      case EditorPackage.BASIC_ITEMS__FORMULA2:
        return getFormula2();
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
      case EditorPackage.BASIC_ITEMS__S:
        setS((SigItems)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL:
        setDatatypeDecl((DatatypeDecl)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL2:
        getDatatypeDecl2().clear();
        getDatatypeDecl2().addAll((Collection<? extends DatatypeDecl>)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__S2:
        getS2().clear();
        getS2().addAll((Collection<? extends SigItems>)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__VAR_DECL:
        setVarDecl((VarDecl)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__VAR_DECL2:
        getVarDecl2().clear();
        getVarDecl2().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__FORMULA:
        setFormula((Formu)newValue);
        return;
      case EditorPackage.BASIC_ITEMS__FORMULA2:
        getFormula2().clear();
        getFormula2().addAll((Collection<? extends Formu>)newValue);
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
      case EditorPackage.BASIC_ITEMS__S:
        setS((SigItems)null);
        return;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL:
        setDatatypeDecl((DatatypeDecl)null);
        return;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL2:
        getDatatypeDecl2().clear();
        return;
      case EditorPackage.BASIC_ITEMS__S2:
        getS2().clear();
        return;
      case EditorPackage.BASIC_ITEMS__VAR_DECL:
        setVarDecl((VarDecl)null);
        return;
      case EditorPackage.BASIC_ITEMS__VAR_DECL2:
        getVarDecl2().clear();
        return;
      case EditorPackage.BASIC_ITEMS__FORMULA:
        setFormula((Formu)null);
        return;
      case EditorPackage.BASIC_ITEMS__FORMULA2:
        getFormula2().clear();
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
      case EditorPackage.BASIC_ITEMS__S:
        return s != null;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL:
        return datatypeDecl != null;
      case EditorPackage.BASIC_ITEMS__DATATYPE_DECL2:
        return datatypeDecl2 != null && !datatypeDecl2.isEmpty();
      case EditorPackage.BASIC_ITEMS__S2:
        return s2 != null && !s2.isEmpty();
      case EditorPackage.BASIC_ITEMS__VAR_DECL:
        return varDecl != null;
      case EditorPackage.BASIC_ITEMS__VAR_DECL2:
        return varDecl2 != null && !varDecl2.isEmpty();
      case EditorPackage.BASIC_ITEMS__FORMULA:
        return formula != null;
      case EditorPackage.BASIC_ITEMS__FORMULA2:
        return formula2 != null && !formula2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BasicItemsImpl
