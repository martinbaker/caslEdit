/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.BasicItems;
import com.euclideanspace.casl.editor.BasicSpec;
import com.euclideanspace.casl.editor.EditorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getName3 <em>Name3</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getName4 <em>Name4</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getBasicItems <em>Basic Items</em>}</li>
 *   <li>{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicSpecImpl extends MinimalEObjectImpl.Container implements BasicSpec
{
  /**
   * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected static final String NAME1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected String name1 = NAME1_EDEFAULT;

  /**
   * The cached value of the '{@link #getName2() <em>Name2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected EList<String> name2;

  /**
   * The default value of the '{@link #getName3() <em>Name3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName3()
   * @generated
   * @ordered
   */
  protected static final int NAME3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getName3() <em>Name3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName3()
   * @generated
   * @ordered
   */
  protected int name3 = NAME3_EDEFAULT;

  /**
   * The cached value of the '{@link #getName4() <em>Name4</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName4()
   * @generated
   * @ordered
   */
  protected EList<Integer> name4;

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
   * The cached value of the '{@link #getBasicItems() <em>Basic Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicItems()
   * @generated
   * @ordered
   */
  protected EList<BasicItems> basicItems;

  /**
   * The default value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected static final String EMPTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected String empty = EMPTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicSpecImpl()
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
    return EditorPackage.Literals.BASIC_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName1()
  {
    return name1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName1(String newName1)
  {
    String oldName1 = name1;
    name1 = newName1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_SPEC__NAME1, oldName1, name1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName2()
  {
    if (name2 == null)
    {
      name2 = new EDataTypeEList<String>(String.class, this, EditorPackage.BASIC_SPEC__NAME2);
    }
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getName3()
  {
    return name3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName3(int newName3)
  {
    int oldName3 = name3;
    name3 = newName3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_SPEC__NAME3, oldName3, name3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getName4()
  {
    if (name4 == null)
    {
      name4 = new EDataTypeEList<Integer>(Integer.class, this, EditorPackage.BASIC_SPEC__NAME4);
    }
    return name4;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_SPEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicItems> getBasicItems()
  {
    if (basicItems == null)
    {
      basicItems = new EObjectContainmentEList<BasicItems>(BasicItems.class, this, EditorPackage.BASIC_SPEC__BASIC_ITEMS);
    }
    return basicItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(String newEmpty)
  {
    String oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.BASIC_SPEC__EMPTY, oldEmpty, empty));
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
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return ((InternalEList<?>)getBasicItems()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.BASIC_SPEC__NAME1:
        return getName1();
      case EditorPackage.BASIC_SPEC__NAME2:
        return getName2();
      case EditorPackage.BASIC_SPEC__NAME3:
        return getName3();
      case EditorPackage.BASIC_SPEC__NAME4:
        return getName4();
      case EditorPackage.BASIC_SPEC__NAME:
        return getName();
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return getBasicItems();
      case EditorPackage.BASIC_SPEC__EMPTY:
        return getEmpty();
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
      case EditorPackage.BASIC_SPEC__NAME1:
        setName1((String)newValue);
        return;
      case EditorPackage.BASIC_SPEC__NAME2:
        getName2().clear();
        getName2().addAll((Collection<? extends String>)newValue);
        return;
      case EditorPackage.BASIC_SPEC__NAME3:
        setName3((Integer)newValue);
        return;
      case EditorPackage.BASIC_SPEC__NAME4:
        getName4().clear();
        getName4().addAll((Collection<? extends Integer>)newValue);
        return;
      case EditorPackage.BASIC_SPEC__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        getBasicItems().clear();
        getBasicItems().addAll((Collection<? extends BasicItems>)newValue);
        return;
      case EditorPackage.BASIC_SPEC__EMPTY:
        setEmpty((String)newValue);
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
      case EditorPackage.BASIC_SPEC__NAME1:
        setName1(NAME1_EDEFAULT);
        return;
      case EditorPackage.BASIC_SPEC__NAME2:
        getName2().clear();
        return;
      case EditorPackage.BASIC_SPEC__NAME3:
        setName3(NAME3_EDEFAULT);
        return;
      case EditorPackage.BASIC_SPEC__NAME4:
        getName4().clear();
        return;
      case EditorPackage.BASIC_SPEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        getBasicItems().clear();
        return;
      case EditorPackage.BASIC_SPEC__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
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
      case EditorPackage.BASIC_SPEC__NAME1:
        return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
      case EditorPackage.BASIC_SPEC__NAME2:
        return name2 != null && !name2.isEmpty();
      case EditorPackage.BASIC_SPEC__NAME3:
        return name3 != NAME3_EDEFAULT;
      case EditorPackage.BASIC_SPEC__NAME4:
        return name4 != null && !name4.isEmpty();
      case EditorPackage.BASIC_SPEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.BASIC_SPEC__BASIC_ITEMS:
        return basicItems != null && !basicItems.isEmpty();
      case EditorPackage.BASIC_SPEC__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
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
    result.append(" (name1: ");
    result.append(name1);
    result.append(", name2: ");
    result.append(name2);
    result.append(", name3: ");
    result.append(name3);
    result.append(", name4: ");
    result.append(name4);
    result.append(", name: ");
    result.append(name);
    result.append(", empty: ");
    result.append(empty);
    result.append(')');
    return result.toString();
  }

} //BasicSpecImpl
