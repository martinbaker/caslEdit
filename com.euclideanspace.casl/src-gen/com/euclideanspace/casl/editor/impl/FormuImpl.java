/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Formu;
import com.euclideanspace.casl.editor.Mfix;
import com.euclideanspace.casl.editor.Quantifier;
import com.euclideanspace.casl.editor.Term;
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
 * An implementation of the model object '<em><b>Formu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getVarDecl <em>Var Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getVarDecl2 <em>Var Decl2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getE3 <em>E3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getT <em>T</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getForm <em>Form</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getMisfix <em>Misfix</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.FormuImpl#getMisfix2 <em>Misfix2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormuImpl extends MinimalEObjectImpl.Container implements Formu
{
  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected Quantifier quantifier;

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
   * The default value of the '{@link #getE3() <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE3()
   * @generated
   * @ordered
   */
  protected static final String E3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getE3() <em>E3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE3()
   * @generated
   * @ordered
   */
  protected String e3 = E3_EDEFAULT;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Term t;

  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected Term t2;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected Formu form;

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
  protected FormuImpl()
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
    return EditorPackage.Literals.FORMU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifier(Quantifier newQuantifier, NotificationChain msgs)
  {
    Quantifier oldQuantifier = quantifier;
    quantifier = newQuantifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__QUANTIFIER, oldQuantifier, newQuantifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifier(Quantifier newQuantifier)
  {
    if (newQuantifier != quantifier)
    {
      NotificationChain msgs = null;
      if (quantifier != null)
        msgs = ((InternalEObject)quantifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__QUANTIFIER, null, msgs);
      if (newQuantifier != null)
        msgs = ((InternalEObject)newQuantifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__QUANTIFIER, null, msgs);
      msgs = basicSetQuantifier(newQuantifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__QUANTIFIER, newQuantifier, newQuantifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__VAR_DECL, oldVarDecl, newVarDecl);
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
        msgs = ((InternalEObject)varDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__VAR_DECL, null, msgs);
      if (newVarDecl != null)
        msgs = ((InternalEObject)newVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__VAR_DECL, null, msgs);
      msgs = basicSetVarDecl(newVarDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__VAR_DECL, newVarDecl, newVarDecl));
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
      varDecl2 = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, EditorPackage.FORMU__VAR_DECL2);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__FORMULA, oldFormula, newFormula);
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
        msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__FORMULA, null, msgs);
      if (newFormula != null)
        msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__FORMULA, null, msgs);
      msgs = basicSetFormula(newFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__FORMULA, newFormula, newFormula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getE3()
  {
    return e3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE3(String newE3)
  {
    String oldE3 = e3;
    e3 = newE3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__E3, oldE3, e3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Term newT, NotificationChain msgs)
  {
    Term oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Term newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT2(Term newT2, NotificationChain msgs)
  {
    Term oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__T2, oldT2, newT2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(Term newT2)
  {
    if (newT2 != t2)
    {
      NotificationChain msgs = null;
      if (t2 != null)
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__T2, newT2, newT2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formu getForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForm(Formu newForm, NotificationChain msgs)
  {
    Formu oldForm = form;
    form = newForm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__FORM, oldForm, newForm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm(Formu newForm)
  {
    if (newForm != form)
    {
      NotificationChain msgs = null;
      if (form != null)
        msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__FORM, null, msgs);
      if (newForm != null)
        msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__FORM, null, msgs);
      msgs = basicSetForm(newForm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__FORM, newForm, newForm));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__MISFIX, oldMisfix, newMisfix);
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
        msgs = ((InternalEObject)misfix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__MISFIX, null, msgs);
      if (newMisfix != null)
        msgs = ((InternalEObject)newMisfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FORMU__MISFIX, null, msgs);
      msgs = basicSetMisfix(newMisfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FORMU__MISFIX, newMisfix, newMisfix));
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
      misfix2 = new EObjectContainmentEList<Mfix>(Mfix.class, this, EditorPackage.FORMU__MISFIX2);
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
      case EditorPackage.FORMU__QUANTIFIER:
        return basicSetQuantifier(null, msgs);
      case EditorPackage.FORMU__VAR_DECL:
        return basicSetVarDecl(null, msgs);
      case EditorPackage.FORMU__VAR_DECL2:
        return ((InternalEList<?>)getVarDecl2()).basicRemove(otherEnd, msgs);
      case EditorPackage.FORMU__FORMULA:
        return basicSetFormula(null, msgs);
      case EditorPackage.FORMU__T:
        return basicSetT(null, msgs);
      case EditorPackage.FORMU__T2:
        return basicSetT2(null, msgs);
      case EditorPackage.FORMU__FORM:
        return basicSetForm(null, msgs);
      case EditorPackage.FORMU__MISFIX:
        return basicSetMisfix(null, msgs);
      case EditorPackage.FORMU__MISFIX2:
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
      case EditorPackage.FORMU__QUANTIFIER:
        return getQuantifier();
      case EditorPackage.FORMU__VAR_DECL:
        return getVarDecl();
      case EditorPackage.FORMU__VAR_DECL2:
        return getVarDecl2();
      case EditorPackage.FORMU__FORMULA:
        return getFormula();
      case EditorPackage.FORMU__E3:
        return getE3();
      case EditorPackage.FORMU__T:
        return getT();
      case EditorPackage.FORMU__T2:
        return getT2();
      case EditorPackage.FORMU__FORM:
        return getForm();
      case EditorPackage.FORMU__MISFIX:
        return getMisfix();
      case EditorPackage.FORMU__MISFIX2:
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
      case EditorPackage.FORMU__QUANTIFIER:
        setQuantifier((Quantifier)newValue);
        return;
      case EditorPackage.FORMU__VAR_DECL:
        setVarDecl((VarDecl)newValue);
        return;
      case EditorPackage.FORMU__VAR_DECL2:
        getVarDecl2().clear();
        getVarDecl2().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case EditorPackage.FORMU__FORMULA:
        setFormula((Formu)newValue);
        return;
      case EditorPackage.FORMU__E3:
        setE3((String)newValue);
        return;
      case EditorPackage.FORMU__T:
        setT((Term)newValue);
        return;
      case EditorPackage.FORMU__T2:
        setT2((Term)newValue);
        return;
      case EditorPackage.FORMU__FORM:
        setForm((Formu)newValue);
        return;
      case EditorPackage.FORMU__MISFIX:
        setMisfix((Mfix)newValue);
        return;
      case EditorPackage.FORMU__MISFIX2:
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
      case EditorPackage.FORMU__QUANTIFIER:
        setQuantifier((Quantifier)null);
        return;
      case EditorPackage.FORMU__VAR_DECL:
        setVarDecl((VarDecl)null);
        return;
      case EditorPackage.FORMU__VAR_DECL2:
        getVarDecl2().clear();
        return;
      case EditorPackage.FORMU__FORMULA:
        setFormula((Formu)null);
        return;
      case EditorPackage.FORMU__E3:
        setE3(E3_EDEFAULT);
        return;
      case EditorPackage.FORMU__T:
        setT((Term)null);
        return;
      case EditorPackage.FORMU__T2:
        setT2((Term)null);
        return;
      case EditorPackage.FORMU__FORM:
        setForm((Formu)null);
        return;
      case EditorPackage.FORMU__MISFIX:
        setMisfix((Mfix)null);
        return;
      case EditorPackage.FORMU__MISFIX2:
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
      case EditorPackage.FORMU__QUANTIFIER:
        return quantifier != null;
      case EditorPackage.FORMU__VAR_DECL:
        return varDecl != null;
      case EditorPackage.FORMU__VAR_DECL2:
        return varDecl2 != null && !varDecl2.isEmpty();
      case EditorPackage.FORMU__FORMULA:
        return formula != null;
      case EditorPackage.FORMU__E3:
        return E3_EDEFAULT == null ? e3 != null : !E3_EDEFAULT.equals(e3);
      case EditorPackage.FORMU__T:
        return t != null;
      case EditorPackage.FORMU__T2:
        return t2 != null;
      case EditorPackage.FORMU__FORM:
        return form != null;
      case EditorPackage.FORMU__MISFIX:
        return misfix != null;
      case EditorPackage.FORMU__MISFIX2:
        return misfix2 != null && !misfix2.isEmpty();
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
    result.append(" (e3: ");
    result.append(e3);
    result.append(')');
    return result.toString();
  }

} //FormuImpl
