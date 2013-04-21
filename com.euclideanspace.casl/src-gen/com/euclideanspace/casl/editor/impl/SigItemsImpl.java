/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.DatatypeDecl;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.OpItem;
import com.euclideanspace.casl.editor.PredItem;
import com.euclideanspace.casl.editor.SigItems;
import com.euclideanspace.casl.editor.SortItem;

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
 * An implementation of the model object '<em><b>Sig Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getSortItem <em>Sort Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getSortItem2 <em>Sort Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getOpItem <em>Op Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getOpItem2 <em>Op Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getPredItem <em>Pred Item</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getPredItem2 <em>Pred Item2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getDatatypeDecl <em>Datatype Decl</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.SigItemsImpl#getDatatypeDecl2 <em>Datatype Decl2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SigItemsImpl extends MinimalEObjectImpl.Container implements SigItems
{
  /**
   * The cached value of the '{@link #getSortItem() <em>Sort Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortItem()
   * @generated
   * @ordered
   */
  protected SortItem sortItem;

  /**
   * The cached value of the '{@link #getSortItem2() <em>Sort Item2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortItem2()
   * @generated
   * @ordered
   */
  protected EList<SortItem> sortItem2;

  /**
   * The cached value of the '{@link #getOpItem() <em>Op Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpItem()
   * @generated
   * @ordered
   */
  protected OpItem opItem;

  /**
   * The cached value of the '{@link #getOpItem2() <em>Op Item2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpItem2()
   * @generated
   * @ordered
   */
  protected EList<OpItem> opItem2;

  /**
   * The cached value of the '{@link #getPredItem() <em>Pred Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredItem()
   * @generated
   * @ordered
   */
  protected PredItem predItem;

  /**
   * The cached value of the '{@link #getPredItem2() <em>Pred Item2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredItem2()
   * @generated
   * @ordered
   */
  protected EList<PredItem> predItem2;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SigItemsImpl()
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
    return EditorPackage.Literals.SIG_ITEMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortItem getSortItem()
  {
    return sortItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSortItem(SortItem newSortItem, NotificationChain msgs)
  {
    SortItem oldSortItem = sortItem;
    sortItem = newSortItem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__SORT_ITEM, oldSortItem, newSortItem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortItem(SortItem newSortItem)
  {
    if (newSortItem != sortItem)
    {
      NotificationChain msgs = null;
      if (sortItem != null)
        msgs = ((InternalEObject)sortItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__SORT_ITEM, null, msgs);
      if (newSortItem != null)
        msgs = ((InternalEObject)newSortItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__SORT_ITEM, null, msgs);
      msgs = basicSetSortItem(newSortItem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__SORT_ITEM, newSortItem, newSortItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SortItem> getSortItem2()
  {
    if (sortItem2 == null)
    {
      sortItem2 = new EObjectContainmentEList<SortItem>(SortItem.class, this, EditorPackage.SIG_ITEMS__SORT_ITEM2);
    }
    return sortItem2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpItem getOpItem()
  {
    return opItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpItem(OpItem newOpItem, NotificationChain msgs)
  {
    OpItem oldOpItem = opItem;
    opItem = newOpItem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__OP_ITEM, oldOpItem, newOpItem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpItem(OpItem newOpItem)
  {
    if (newOpItem != opItem)
    {
      NotificationChain msgs = null;
      if (opItem != null)
        msgs = ((InternalEObject)opItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__OP_ITEM, null, msgs);
      if (newOpItem != null)
        msgs = ((InternalEObject)newOpItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__OP_ITEM, null, msgs);
      msgs = basicSetOpItem(newOpItem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__OP_ITEM, newOpItem, newOpItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OpItem> getOpItem2()
  {
    if (opItem2 == null)
    {
      opItem2 = new EObjectContainmentEList<OpItem>(OpItem.class, this, EditorPackage.SIG_ITEMS__OP_ITEM2);
    }
    return opItem2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredItem getPredItem()
  {
    return predItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredItem(PredItem newPredItem, NotificationChain msgs)
  {
    PredItem oldPredItem = predItem;
    predItem = newPredItem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__PRED_ITEM, oldPredItem, newPredItem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredItem(PredItem newPredItem)
  {
    if (newPredItem != predItem)
    {
      NotificationChain msgs = null;
      if (predItem != null)
        msgs = ((InternalEObject)predItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__PRED_ITEM, null, msgs);
      if (newPredItem != null)
        msgs = ((InternalEObject)newPredItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__PRED_ITEM, null, msgs);
      msgs = basicSetPredItem(newPredItem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__PRED_ITEM, newPredItem, newPredItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PredItem> getPredItem2()
  {
    if (predItem2 == null)
    {
      predItem2 = new EObjectContainmentEList<PredItem>(PredItem.class, this, EditorPackage.SIG_ITEMS__PRED_ITEM2);
    }
    return predItem2;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__DATATYPE_DECL, oldDatatypeDecl, newDatatypeDecl);
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
        msgs = ((InternalEObject)datatypeDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__DATATYPE_DECL, null, msgs);
      if (newDatatypeDecl != null)
        msgs = ((InternalEObject)newDatatypeDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SIG_ITEMS__DATATYPE_DECL, null, msgs);
      msgs = basicSetDatatypeDecl(newDatatypeDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SIG_ITEMS__DATATYPE_DECL, newDatatypeDecl, newDatatypeDecl));
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
      datatypeDecl2 = new EObjectContainmentEList<DatatypeDecl>(DatatypeDecl.class, this, EditorPackage.SIG_ITEMS__DATATYPE_DECL2);
    }
    return datatypeDecl2;
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
      case EditorPackage.SIG_ITEMS__SORT_ITEM:
        return basicSetSortItem(null, msgs);
      case EditorPackage.SIG_ITEMS__SORT_ITEM2:
        return ((InternalEList<?>)getSortItem2()).basicRemove(otherEnd, msgs);
      case EditorPackage.SIG_ITEMS__OP_ITEM:
        return basicSetOpItem(null, msgs);
      case EditorPackage.SIG_ITEMS__OP_ITEM2:
        return ((InternalEList<?>)getOpItem2()).basicRemove(otherEnd, msgs);
      case EditorPackage.SIG_ITEMS__PRED_ITEM:
        return basicSetPredItem(null, msgs);
      case EditorPackage.SIG_ITEMS__PRED_ITEM2:
        return ((InternalEList<?>)getPredItem2()).basicRemove(otherEnd, msgs);
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL:
        return basicSetDatatypeDecl(null, msgs);
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL2:
        return ((InternalEList<?>)getDatatypeDecl2()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.SIG_ITEMS__SORT_ITEM:
        return getSortItem();
      case EditorPackage.SIG_ITEMS__SORT_ITEM2:
        return getSortItem2();
      case EditorPackage.SIG_ITEMS__OP_ITEM:
        return getOpItem();
      case EditorPackage.SIG_ITEMS__OP_ITEM2:
        return getOpItem2();
      case EditorPackage.SIG_ITEMS__PRED_ITEM:
        return getPredItem();
      case EditorPackage.SIG_ITEMS__PRED_ITEM2:
        return getPredItem2();
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL:
        return getDatatypeDecl();
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL2:
        return getDatatypeDecl2();
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
      case EditorPackage.SIG_ITEMS__SORT_ITEM:
        setSortItem((SortItem)newValue);
        return;
      case EditorPackage.SIG_ITEMS__SORT_ITEM2:
        getSortItem2().clear();
        getSortItem2().addAll((Collection<? extends SortItem>)newValue);
        return;
      case EditorPackage.SIG_ITEMS__OP_ITEM:
        setOpItem((OpItem)newValue);
        return;
      case EditorPackage.SIG_ITEMS__OP_ITEM2:
        getOpItem2().clear();
        getOpItem2().addAll((Collection<? extends OpItem>)newValue);
        return;
      case EditorPackage.SIG_ITEMS__PRED_ITEM:
        setPredItem((PredItem)newValue);
        return;
      case EditorPackage.SIG_ITEMS__PRED_ITEM2:
        getPredItem2().clear();
        getPredItem2().addAll((Collection<? extends PredItem>)newValue);
        return;
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL:
        setDatatypeDecl((DatatypeDecl)newValue);
        return;
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL2:
        getDatatypeDecl2().clear();
        getDatatypeDecl2().addAll((Collection<? extends DatatypeDecl>)newValue);
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
      case EditorPackage.SIG_ITEMS__SORT_ITEM:
        setSortItem((SortItem)null);
        return;
      case EditorPackage.SIG_ITEMS__SORT_ITEM2:
        getSortItem2().clear();
        return;
      case EditorPackage.SIG_ITEMS__OP_ITEM:
        setOpItem((OpItem)null);
        return;
      case EditorPackage.SIG_ITEMS__OP_ITEM2:
        getOpItem2().clear();
        return;
      case EditorPackage.SIG_ITEMS__PRED_ITEM:
        setPredItem((PredItem)null);
        return;
      case EditorPackage.SIG_ITEMS__PRED_ITEM2:
        getPredItem2().clear();
        return;
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL:
        setDatatypeDecl((DatatypeDecl)null);
        return;
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL2:
        getDatatypeDecl2().clear();
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
      case EditorPackage.SIG_ITEMS__SORT_ITEM:
        return sortItem != null;
      case EditorPackage.SIG_ITEMS__SORT_ITEM2:
        return sortItem2 != null && !sortItem2.isEmpty();
      case EditorPackage.SIG_ITEMS__OP_ITEM:
        return opItem != null;
      case EditorPackage.SIG_ITEMS__OP_ITEM2:
        return opItem2 != null && !opItem2.isEmpty();
      case EditorPackage.SIG_ITEMS__PRED_ITEM:
        return predItem != null;
      case EditorPackage.SIG_ITEMS__PRED_ITEM2:
        return predItem2 != null && !predItem2.isEmpty();
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL:
        return datatypeDecl != null;
      case EditorPackage.SIG_ITEMS__DATATYPE_DECL2:
        return datatypeDecl2 != null && !datatypeDecl2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SigItemsImpl
