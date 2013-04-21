/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.euclideanspace.casl.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/casl/Editor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorPackage eINSTANCE = com.euclideanspace.casl.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.ModelImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Basic Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BASIC_SPEC = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl <em>Basic Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.BasicSpecImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getBasicSpec()
   * @generated
   */
  int BASIC_SPEC = 1;

  /**
   * The feature id for the '<em><b>Basic Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_SPEC__BASIC_ITEMS = 0;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_SPEC__EMPTY = 1;

  /**
   * The number of structural features of the '<em>Basic Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl <em>Basic Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.BasicItemsImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getBasicItems()
   * @generated
   */
  int BASIC_ITEMS = 2;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__S = 0;

  /**
   * The feature id for the '<em><b>Datatype Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__DATATYPE_DECL = 1;

  /**
   * The feature id for the '<em><b>Datatype Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__DATATYPE_DECL2 = 2;

  /**
   * The feature id for the '<em><b>S2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__S2 = 3;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__VAR_DECL = 4;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__VAR_DECL2 = 5;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__FORMULA = 6;

  /**
   * The feature id for the '<em><b>Formula2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS__FORMULA2 = 7;

  /**
   * The number of structural features of the '<em>Basic Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ITEMS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.SigItemsImpl <em>Sig Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.SigItemsImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSigItems()
   * @generated
   */
  int SIG_ITEMS = 3;

  /**
   * The feature id for the '<em><b>Sort Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__SORT_ITEM = 0;

  /**
   * The feature id for the '<em><b>Sort Item2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__SORT_ITEM2 = 1;

  /**
   * The feature id for the '<em><b>Op Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__OP_ITEM = 2;

  /**
   * The feature id for the '<em><b>Op Item2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__OP_ITEM2 = 3;

  /**
   * The feature id for the '<em><b>Pred Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__PRED_ITEM = 4;

  /**
   * The feature id for the '<em><b>Pred Item2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__PRED_ITEM2 = 5;

  /**
   * The feature id for the '<em><b>Datatype Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__DATATYPE_DECL = 6;

  /**
   * The feature id for the '<em><b>Datatype Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS__DATATYPE_DECL2 = 7;

  /**
   * The number of structural features of the '<em>Sig Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_ITEMS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.SortItemImpl <em>Sort Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.SortItemImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSortItem()
   * @generated
   */
  int SORT_ITEM = 4;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_ITEM__SORT = 0;

  /**
   * The feature id for the '<em><b>Sort2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_ITEM__SORT2 = 1;

  /**
   * The number of structural features of the '<em>Sort Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.OpItemImpl <em>Op Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.OpItemImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpItem()
   * @generated
   */
  int OP_ITEM = 5;

  /**
   * The feature id for the '<em><b>Op Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__OP_NAME = 0;

  /**
   * The feature id for the '<em><b>Op Name2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__OP_NAME2 = 1;

  /**
   * The feature id for the '<em><b>Op Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__OP_TYPE = 2;

  /**
   * The feature id for the '<em><b>Op Attr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__OP_ATTR = 3;

  /**
   * The feature id for the '<em><b>Op Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__OP_HEAD = 4;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM__TERM = 5;

  /**
   * The number of structural features of the '<em>Op Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ITEM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.OpTypeImpl <em>Op Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.OpTypeImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpType()
   * @generated
   */
  int OP_TYPE = 6;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_TYPE__SORT = 0;

  /**
   * The feature id for the '<em><b>Sort2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_TYPE__SORT2 = 1;

  /**
   * The feature id for the '<em><b>Sort3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_TYPE__SORT3 = 2;

  /**
   * The number of structural features of the '<em>Op Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.OpAttrImpl <em>Op Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.OpAttrImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpAttr()
   * @generated
   */
  int OP_ATTR = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ATTR__OP = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ATTR__TERM = 1;

  /**
   * The number of structural features of the '<em>Op Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_ATTR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.OpHeadImpl <em>Op Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.OpHeadImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpHead()
   * @generated
   */
  int OP_HEAD = 8;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_HEAD__SORT = 0;

  /**
   * The feature id for the '<em><b>Arg Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_HEAD__ARG_DECL = 1;

  /**
   * The feature id for the '<em><b>Arg Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_HEAD__ARG_DECL2 = 2;

  /**
   * The number of structural features of the '<em>Op Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_HEAD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.ArgDeclImpl <em>Arg Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.ArgDeclImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getArgDecl()
   * @generated
   */
  int ARG_DECL = 9;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_DECL__VAR = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_DECL__VAR2 = 1;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_DECL__SORT = 2;

  /**
   * The number of structural features of the '<em>Arg Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.PredItemImpl <em>Pred Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.PredItemImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredItem()
   * @generated
   */
  int PRED_ITEM = 10;

  /**
   * The feature id for the '<em><b>Pred Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM__PRED_NAME = 0;

  /**
   * The feature id for the '<em><b>Pred Name2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM__PRED_NAME2 = 1;

  /**
   * The feature id for the '<em><b>Pred Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM__PRED_TYPE = 2;

  /**
   * The feature id for the '<em><b>Pred Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM__PRED_HEAD = 3;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM__FORMULA = 4;

  /**
   * The number of structural features of the '<em>Pred Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_ITEM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.PredTypeImpl <em>Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.PredTypeImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredType()
   * @generated
   */
  int PRED_TYPE = 11;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__SORT = 0;

  /**
   * The feature id for the '<em><b>Sort2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__SORT2 = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__B = 2;

  /**
   * The number of structural features of the '<em>Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.PredHeadImpl <em>Pred Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.PredHeadImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredHead()
   * @generated
   */
  int PRED_HEAD = 12;

  /**
   * The feature id for the '<em><b>Arg Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_HEAD__ARG_DECL = 0;

  /**
   * The feature id for the '<em><b>Arg Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_HEAD__ARG_DECL2 = 1;

  /**
   * The number of structural features of the '<em>Pred Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_HEAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.DatatypeDeclImpl <em>Datatype Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.DatatypeDeclImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getDatatypeDecl()
   * @generated
   */
  int DATATYPE_DECL = 13;

  /**
   * The number of structural features of the '<em>Datatype Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.AlternativeImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 14;

  /**
   * The feature id for the '<em><b>Op Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__OP_NAME = 0;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Component2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__COMPONENT2 = 2;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.ComponentImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 15;

  /**
   * The feature id for the '<em><b>Op Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__OP_NAME = 0;

  /**
   * The feature id for the '<em><b>Op Name2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__OP_NAME2 = 1;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SORT = 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.VarDeclImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 16;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VAR = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VAR2 = 1;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__SORT = 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormuImpl <em>Formu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormuImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormu()
   * @generated
   */
  int FORMU = 17;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__QUANTIFIER = 0;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__VAR_DECL = 1;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__VAR_DECL2 = 2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__FORMULA = 3;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__E3 = 4;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__T = 5;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__T2 = 6;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__FORM = 7;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__MISFIX = 8;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU__MISFIX2 = 9;

  /**
   * The number of structural features of the '<em>Formu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMU_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.QuantifierImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 18;

  /**
   * The feature id for the '<em><b>Q</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__Q = 0;

  /**
   * The number of structural features of the '<em>Quantifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.TermsImpl <em>Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.TermsImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getTerms()
   * @generated
   */
  int TERMS = 19;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__TERM = 0;

  /**
   * The feature id for the '<em><b>Term2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__TERM2 = 1;

  /**
   * The number of structural features of the '<em>Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.TermImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getTerm()
   * @generated
   */
  int TERM = 20;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__MISFIX = 0;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__MISFIX2 = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.MfixImpl <em>Mfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.MfixImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMfix()
   * @generated
   */
  int MFIX = 21;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__MISFIX = 0;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP1 = 1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP2 = 2;

  /**
   * The feature id for the '<em><b>Op3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP3 = 3;

  /**
   * The feature id for the '<em><b>Op4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP4 = 4;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP5 = 5;

  /**
   * The feature id for the '<em><b>Op6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP6 = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__OP = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX__LEFT = 8;

  /**
   * The number of structural features of the '<em>Mfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MFIX_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.QualPredNameImpl <em>Qual Pred Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.QualPredNameImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualPredName()
   * @generated
   */
  int QUAL_PRED_NAME = 22;

  /**
   * The number of structural features of the '<em>Qual Pred Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_PRED_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.QualVarNameImpl <em>Qual Var Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.QualVarNameImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualVarName()
   * @generated
   */
  int QUAL_VAR_NAME = 23;

  /**
   * The number of structural features of the '<em>Qual Var Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_VAR_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.QualOpNameImpl <em>Qual Op Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.QualOpNameImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualOpName()
   * @generated
   */
  int QUAL_OP_NAME = 24;

  /**
   * The number of structural features of the '<em>Qual Op Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUAL_OP_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.SortImpl <em>Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.SortImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSort()
   * @generated
   */
  int SORT = 25;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__ALTERNATIVE = DATATYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alternative2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__ALTERNATIVE2 = DATATYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__NAME = DATATYPE_DECL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_FEATURE_COUNT = DATATYPE_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.OpNameImpl <em>Op Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.OpNameImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpName()
   * @generated
   */
  int OP_NAME = 26;

  /**
   * The feature id for the '<em><b>Op Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_NAME__OP_TYPE = QUAL_OP_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_NAME__NAME = QUAL_OP_NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Op Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_NAME_FEATURE_COUNT = QUAL_OP_NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.PredNameImpl <em>Pred Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.PredNameImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredName()
   * @generated
   */
  int PRED_NAME = 27;

  /**
   * The feature id for the '<em><b>Pred Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_NAME__PRED_TYPE = QUAL_VAR_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_NAME__NAME = QUAL_VAR_NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pred Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_NAME_FEATURE_COUNT = QUAL_VAR_NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.VarImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getVar()
   * @generated
   */
  int VAR = 28;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__SORT = QUAL_PRED_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = QUAL_PRED_NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = QUAL_PRED_NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.TokenImpl <em>Token</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.TokenImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getToken()
   * @generated
   */
  int TOKEN = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN__NUM = 1;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN__T = 2;

  /**
   * The number of structural features of the '<em>Token</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.LiteralImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 30;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__STR = 0;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NUM = 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormulaAndImpl <em>Formula And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormulaAndImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaAnd()
   * @generated
   */
  int FORMULA_AND = 31;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__LEFT = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__OP = FORMU_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND__RIGHT = FORMU_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formula And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_AND_FEATURE_COUNT = FORMU_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormulaOrImpl <em>Formula Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormulaOrImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaOr()
   * @generated
   */
  int FORMULA_OR = 32;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__LEFT = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__OP = FORMU_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR__RIGHT = FORMU_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formula Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_OR_FEATURE_COUNT = FORMU_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormulaImpliesImpl <em>Formula Implies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormulaImpliesImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaImplies()
   * @generated
   */
  int FORMULA_IMPLIES = 33;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__LEFT = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__OP = FORMU_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES__RIGHT = FORMU_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formula Implies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IMPLIES_FEATURE_COUNT = FORMU_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormulaIfImpl <em>Formula If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormulaIfImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaIf()
   * @generated
   */
  int FORMULA_IF = 34;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__LEFT = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__OP = FORMU_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF__RIGHT = FORMU_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formula If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_IF_FEATURE_COUNT = FORMU_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.FormulaEquivImpl <em>Formula Equiv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.FormulaEquivImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaEquiv()
   * @generated
   */
  int FORMULA_EQUIV = 35;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__LEFT = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__OP = FORMU_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV__RIGHT = FORMU_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formula Equiv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EQUIV_FEATURE_COUNT = FORMU_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.UnaryExpressionImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__QUANTIFIER = FORMU__QUANTIFIER;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__VAR_DECL = FORMU__VAR_DECL;

  /**
   * The feature id for the '<em><b>Var Decl2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__VAR_DECL2 = FORMU__VAR_DECL2;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__FORMULA = FORMU__FORMULA;

  /**
   * The feature id for the '<em><b>E3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__E3 = FORMU__E3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__T = FORMU__T;

  /**
   * The feature id for the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__T2 = FORMU__T2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__FORM = FORMU__FORM;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__MISFIX = FORMU__MISFIX;

  /**
   * The feature id for the '<em><b>Misfix2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__MISFIX2 = FORMU__MISFIX2;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UOP = FORMU_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPR = FORMU_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = FORMU_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.MisfixImpl <em>Misfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.MisfixImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMisfix()
   * @generated
   */
  int MISFIX = 37;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__MISFIX = MFIX__MISFIX;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP1 = MFIX__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP2 = MFIX__OP2;

  /**
   * The feature id for the '<em><b>Op3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP3 = MFIX__OP3;

  /**
   * The feature id for the '<em><b>Op4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP4 = MFIX__OP4;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP5 = MFIX__OP5;

  /**
   * The feature id for the '<em><b>Op6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP6 = MFIX__OP6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__OP = MFIX__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__LEFT = MFIX__LEFT;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX__SORT = MFIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Misfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_FEATURE_COUNT = MFIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.casl.editor.impl.MisfixWhenImpl <em>Misfix When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.casl.editor.impl.MisfixWhenImpl
   * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMisfixWhen()
   * @generated
   */
  int MISFIX_WHEN = 38;

  /**
   * The feature id for the '<em><b>Misfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__MISFIX = MFIX__MISFIX;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP1 = MFIX__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP2 = MFIX__OP2;

  /**
   * The feature id for the '<em><b>Op3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP3 = MFIX__OP3;

  /**
   * The feature id for the '<em><b>Op4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP4 = MFIX__OP4;

  /**
   * The feature id for the '<em><b>Op5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP5 = MFIX__OP5;

  /**
   * The feature id for the '<em><b>Op6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP6 = MFIX__OP6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP = MFIX__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__LEFT = MFIX__LEFT;

  /**
   * The feature id for the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__FORMULA = MFIX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op0</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__OP0 = MFIX_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN__RIGHT = MFIX_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Misfix When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISFIX_WHEN_FEATURE_COUNT = MFIX_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.casl.editor.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Model#getBasicSpec <em>Basic Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Spec</em>'.
   * @see com.euclideanspace.casl.editor.Model#getBasicSpec()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BasicSpec();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.BasicSpec <em>Basic Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Spec</em>'.
   * @see com.euclideanspace.casl.editor.BasicSpec
   * @generated
   */
  EClass getBasicSpec();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.BasicSpec#getBasicItems <em>Basic Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Basic Items</em>'.
   * @see com.euclideanspace.casl.editor.BasicSpec#getBasicItems()
   * @see #getBasicSpec()
   * @generated
   */
  EReference getBasicSpec_BasicItems();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.BasicSpec#getEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see com.euclideanspace.casl.editor.BasicSpec#getEmpty()
   * @see #getBasicSpec()
   * @generated
   */
  EAttribute getBasicSpec_Empty();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.BasicItems <em>Basic Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Items</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems
   * @generated
   */
  EClass getBasicItems();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.BasicItems#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getS()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_S();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl <em>Datatype Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype Decl</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_DatatypeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl2 <em>Datatype Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datatype Decl2</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getDatatypeDecl2()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_DatatypeDecl2();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.BasicItems#getS2 <em>S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S2</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getS2()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_S2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.BasicItems#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decl</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getVarDecl()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_VarDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.BasicItems#getVarDecl2 <em>Var Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Decl2</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getVarDecl2()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_VarDecl2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.BasicItems#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formula</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getFormula()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_Formula();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.BasicItems#getFormula2 <em>Formula2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formula2</em>'.
   * @see com.euclideanspace.casl.editor.BasicItems#getFormula2()
   * @see #getBasicItems()
   * @generated
   */
  EReference getBasicItems_Formula2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.SigItems <em>Sig Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sig Items</em>'.
   * @see com.euclideanspace.casl.editor.SigItems
   * @generated
   */
  EClass getSigItems();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.SigItems#getSortItem <em>Sort Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort Item</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getSortItem()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_SortItem();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.SigItems#getSortItem2 <em>Sort Item2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sort Item2</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getSortItem2()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_SortItem2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.SigItems#getOpItem <em>Op Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Item</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getOpItem()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_OpItem();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.SigItems#getOpItem2 <em>Op Item2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Item2</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getOpItem2()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_OpItem2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.SigItems#getPredItem <em>Pred Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred Item</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getPredItem()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_PredItem();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.SigItems#getPredItem2 <em>Pred Item2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pred Item2</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getPredItem2()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_PredItem2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.SigItems#getDatatypeDecl <em>Datatype Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype Decl</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getDatatypeDecl()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_DatatypeDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.SigItems#getDatatypeDecl2 <em>Datatype Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datatype Decl2</em>'.
   * @see com.euclideanspace.casl.editor.SigItems#getDatatypeDecl2()
   * @see #getSigItems()
   * @generated
   */
  EReference getSigItems_DatatypeDecl2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.SortItem <em>Sort Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Item</em>'.
   * @see com.euclideanspace.casl.editor.SortItem
   * @generated
   */
  EClass getSortItem();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.SortItem#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.SortItem#getSort()
   * @see #getSortItem()
   * @generated
   */
  EReference getSortItem_Sort();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.SortItem#getSort2 <em>Sort2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sort2</em>'.
   * @see com.euclideanspace.casl.editor.SortItem#getSort2()
   * @see #getSortItem()
   * @generated
   */
  EReference getSortItem_Sort2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.OpItem <em>Op Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Item</em>'.
   * @see com.euclideanspace.casl.editor.OpItem
   * @generated
   */
  EClass getOpItem();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpItem#getOpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Name</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getOpName()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_OpName();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.OpItem#getOpName2 <em>Op Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Name2</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getOpName2()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_OpName2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpItem#getOpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Type</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getOpType()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_OpType();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.OpItem#getOpAttr <em>Op Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Attr</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getOpAttr()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_OpAttr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpItem#getOpHead <em>Op Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Head</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getOpHead()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_OpHead();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpItem#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see com.euclideanspace.casl.editor.OpItem#getTerm()
   * @see #getOpItem()
   * @generated
   */
  EReference getOpItem_Term();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.OpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Type</em>'.
   * @see com.euclideanspace.casl.editor.OpType
   * @generated
   */
  EClass getOpType();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpType#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.OpType#getSort()
   * @see #getOpType()
   * @generated
   */
  EReference getOpType_Sort();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.OpType#getSort2 <em>Sort2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sort2</em>'.
   * @see com.euclideanspace.casl.editor.OpType#getSort2()
   * @see #getOpType()
   * @generated
   */
  EReference getOpType_Sort2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpType#getSort3 <em>Sort3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort3</em>'.
   * @see com.euclideanspace.casl.editor.OpType#getSort3()
   * @see #getOpType()
   * @generated
   */
  EReference getOpType_Sort3();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.OpAttr <em>Op Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Attr</em>'.
   * @see com.euclideanspace.casl.editor.OpAttr
   * @generated
   */
  EClass getOpAttr();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.OpAttr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.OpAttr#getOp()
   * @see #getOpAttr()
   * @generated
   */
  EAttribute getOpAttr_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpAttr#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see com.euclideanspace.casl.editor.OpAttr#getTerm()
   * @see #getOpAttr()
   * @generated
   */
  EReference getOpAttr_Term();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.OpHead <em>Op Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Head</em>'.
   * @see com.euclideanspace.casl.editor.OpHead
   * @generated
   */
  EClass getOpHead();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpHead#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.OpHead#getSort()
   * @see #getOpHead()
   * @generated
   */
  EReference getOpHead_Sort();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpHead#getArgDecl <em>Arg Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg Decl</em>'.
   * @see com.euclideanspace.casl.editor.OpHead#getArgDecl()
   * @see #getOpHead()
   * @generated
   */
  EReference getOpHead_ArgDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.OpHead#getArgDecl2 <em>Arg Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg Decl2</em>'.
   * @see com.euclideanspace.casl.editor.OpHead#getArgDecl2()
   * @see #getOpHead()
   * @generated
   */
  EReference getOpHead_ArgDecl2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.ArgDecl <em>Arg Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg Decl</em>'.
   * @see com.euclideanspace.casl.editor.ArgDecl
   * @generated
   */
  EClass getArgDecl();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.ArgDecl#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.euclideanspace.casl.editor.ArgDecl#getVar()
   * @see #getArgDecl()
   * @generated
   */
  EReference getArgDecl_Var();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.ArgDecl#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var2</em>'.
   * @see com.euclideanspace.casl.editor.ArgDecl#getVar2()
   * @see #getArgDecl()
   * @generated
   */
  EReference getArgDecl_Var2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.ArgDecl#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.ArgDecl#getSort()
   * @see #getArgDecl()
   * @generated
   */
  EReference getArgDecl_Sort();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.PredItem <em>Pred Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred Item</em>'.
   * @see com.euclideanspace.casl.editor.PredItem
   * @generated
   */
  EClass getPredItem();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredItem#getPredName <em>Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred Name</em>'.
   * @see com.euclideanspace.casl.editor.PredItem#getPredName()
   * @see #getPredItem()
   * @generated
   */
  EReference getPredItem_PredName();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.PredItem#getPredName2 <em>Pred Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pred Name2</em>'.
   * @see com.euclideanspace.casl.editor.PredItem#getPredName2()
   * @see #getPredItem()
   * @generated
   */
  EReference getPredItem_PredName2();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.PredItem#getPredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pred Type</em>'.
   * @see com.euclideanspace.casl.editor.PredItem#getPredType()
   * @see #getPredItem()
   * @generated
   */
  EReference getPredItem_PredType();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredItem#getPredHead <em>Pred Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred Head</em>'.
   * @see com.euclideanspace.casl.editor.PredItem#getPredHead()
   * @see #getPredItem()
   * @generated
   */
  EReference getPredItem_PredHead();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredItem#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formula</em>'.
   * @see com.euclideanspace.casl.editor.PredItem#getFormula()
   * @see #getPredItem()
   * @generated
   */
  EReference getPredItem_Formula();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.PredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred Type</em>'.
   * @see com.euclideanspace.casl.editor.PredType
   * @generated
   */
  EClass getPredType();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredType#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.PredType#getSort()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_Sort();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.PredType#getSort2 <em>Sort2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sort2</em>'.
   * @see com.euclideanspace.casl.editor.PredType#getSort2()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_Sort2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.PredType#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see com.euclideanspace.casl.editor.PredType#getB()
   * @see #getPredType()
   * @generated
   */
  EAttribute getPredType_B();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.PredHead <em>Pred Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred Head</em>'.
   * @see com.euclideanspace.casl.editor.PredHead
   * @generated
   */
  EClass getPredHead();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredHead#getArgDecl <em>Arg Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg Decl</em>'.
   * @see com.euclideanspace.casl.editor.PredHead#getArgDecl()
   * @see #getPredHead()
   * @generated
   */
  EReference getPredHead_ArgDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.PredHead#getArgDecl2 <em>Arg Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg Decl2</em>'.
   * @see com.euclideanspace.casl.editor.PredHead#getArgDecl2()
   * @see #getPredHead()
   * @generated
   */
  EReference getPredHead_ArgDecl2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.DatatypeDecl <em>Datatype Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Decl</em>'.
   * @see com.euclideanspace.casl.editor.DatatypeDecl
   * @generated
   */
  EClass getDatatypeDecl();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see com.euclideanspace.casl.editor.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Alternative#getOpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Name</em>'.
   * @see com.euclideanspace.casl.editor.Alternative#getOpName()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_OpName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Alternative#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see com.euclideanspace.casl.editor.Alternative#getComponent()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Component();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Alternative#getComponent2 <em>Component2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component2</em>'.
   * @see com.euclideanspace.casl.editor.Alternative#getComponent2()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Component2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.euclideanspace.casl.editor.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Component#getOpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Name</em>'.
   * @see com.euclideanspace.casl.editor.Component#getOpName()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_OpName();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Component#getOpName2 <em>Op Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Name2</em>'.
   * @see com.euclideanspace.casl.editor.Component#getOpName2()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_OpName2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Component#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.Component#getSort()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Sort();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see com.euclideanspace.casl.editor.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.VarDecl#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.euclideanspace.casl.editor.VarDecl#getVar()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Var();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.VarDecl#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var2</em>'.
   * @see com.euclideanspace.casl.editor.VarDecl#getVar2()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Var2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.VarDecl#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.VarDecl#getSort()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Sort();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Formu <em>Formu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formu</em>'.
   * @see com.euclideanspace.casl.editor.Formu
   * @generated
   */
  EClass getFormu();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantifier</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getQuantifier()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_Quantifier();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decl</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getVarDecl()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_VarDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Formu#getVarDecl2 <em>Var Decl2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Decl2</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getVarDecl2()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_VarDecl2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formula</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getFormula()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_Formula();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Formu#getE3 <em>E3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>E3</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getE3()
   * @see #getFormu()
   * @generated
   */
  EAttribute getFormu_E3();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getT()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_T();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getT2 <em>T2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T2</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getT2()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_T2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getForm()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_Form();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Formu#getMisfix <em>Misfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Misfix</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getMisfix()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_Misfix();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Formu#getMisfix2 <em>Misfix2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Misfix2</em>'.
   * @see com.euclideanspace.casl.editor.Formu#getMisfix2()
   * @see #getFormu()
   * @generated
   */
  EReference getFormu_Misfix2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantifier</em>'.
   * @see com.euclideanspace.casl.editor.Quantifier
   * @generated
   */
  EClass getQuantifier();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Quantifier#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Q</em>'.
   * @see com.euclideanspace.casl.editor.Quantifier#getQ()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_Q();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms</em>'.
   * @see com.euclideanspace.casl.editor.Terms
   * @generated
   */
  EClass getTerms();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Terms#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see com.euclideanspace.casl.editor.Terms#getTerm()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Term();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Terms#getTerm2 <em>Term2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term2</em>'.
   * @see com.euclideanspace.casl.editor.Terms#getTerm2()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Term2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see com.euclideanspace.casl.editor.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Term#getMisfix <em>Misfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Misfix</em>'.
   * @see com.euclideanspace.casl.editor.Term#getMisfix()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Misfix();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Term#getMisfix2 <em>Misfix2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Misfix2</em>'.
   * @see com.euclideanspace.casl.editor.Term#getMisfix2()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Misfix2();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Mfix <em>Mfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mfix</em>'.
   * @see com.euclideanspace.casl.editor.Mfix
   * @generated
   */
  EClass getMfix();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getMisfix <em>Misfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Misfix</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getMisfix()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Misfix();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp1()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp2()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Op2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Mfix#getOp3 <em>Op3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op3</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp3()
   * @see #getMfix()
   * @generated
   */
  EAttribute getMfix_Op3();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getOp4 <em>Op4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op4</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp4()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Op4();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getOp5 <em>Op5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op5</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp5()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Op5();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getOp6 <em>Op6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op6</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp6()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Op6();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Mfix#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getOp()
   * @see #getMfix()
   * @generated
   */
  EAttribute getMfix_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Mfix#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.Mfix#getLeft()
   * @see #getMfix()
   * @generated
   */
  EReference getMfix_Left();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.QualPredName <em>Qual Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Pred Name</em>'.
   * @see com.euclideanspace.casl.editor.QualPredName
   * @generated
   */
  EClass getQualPredName();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.QualVarName <em>Qual Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Var Name</em>'.
   * @see com.euclideanspace.casl.editor.QualVarName
   * @generated
   */
  EClass getQualVarName();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.QualOpName <em>Qual Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qual Op Name</em>'.
   * @see com.euclideanspace.casl.editor.QualOpName
   * @generated
   */
  EClass getQualOpName();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.Sort
   * @generated
   */
  EClass getSort();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Sort#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see com.euclideanspace.casl.editor.Sort#getAlternative()
   * @see #getSort()
   * @generated
   */
  EReference getSort_Alternative();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.casl.editor.Sort#getAlternative2 <em>Alternative2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternative2</em>'.
   * @see com.euclideanspace.casl.editor.Sort#getAlternative2()
   * @see #getSort()
   * @generated
   */
  EReference getSort_Alternative2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Sort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.casl.editor.Sort#getName()
   * @see #getSort()
   * @generated
   */
  EAttribute getSort_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.OpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Name</em>'.
   * @see com.euclideanspace.casl.editor.OpName
   * @generated
   */
  EClass getOpName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.OpName#getOpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Type</em>'.
   * @see com.euclideanspace.casl.editor.OpName#getOpType()
   * @see #getOpName()
   * @generated
   */
  EReference getOpName_OpType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.OpName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.casl.editor.OpName#getName()
   * @see #getOpName()
   * @generated
   */
  EAttribute getOpName_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.PredName <em>Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred Name</em>'.
   * @see com.euclideanspace.casl.editor.PredName
   * @generated
   */
  EClass getPredName();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.PredName#getPredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred Type</em>'.
   * @see com.euclideanspace.casl.editor.PredName#getPredType()
   * @see #getPredName()
   * @generated
   */
  EReference getPredName_PredType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.PredName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.casl.editor.PredName#getName()
   * @see #getPredName()
   * @generated
   */
  EAttribute getPredName_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see com.euclideanspace.casl.editor.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Var#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.Var#getSort()
   * @see #getVar()
   * @generated
   */
  EReference getVar_Sort();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.casl.editor.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Token <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Token</em>'.
   * @see com.euclideanspace.casl.editor.Token
   * @generated
   */
  EClass getToken();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Token#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.casl.editor.Token#getName()
   * @see #getToken()
   * @generated
   */
  EAttribute getToken_Name();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Token#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see com.euclideanspace.casl.editor.Token#getNum()
   * @see #getToken()
   * @generated
   */
  EAttribute getToken_Num();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Token#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see com.euclideanspace.casl.editor.Token#getT()
   * @see #getToken()
   * @generated
   */
  EReference getToken_T();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.euclideanspace.casl.editor.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Literal#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see com.euclideanspace.casl.editor.Literal#getStr()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Str();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.Literal#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see com.euclideanspace.casl.editor.Literal#getNum()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Num();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.FormulaAnd <em>Formula And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula And</em>'.
   * @see com.euclideanspace.casl.editor.FormulaAnd
   * @generated
   */
  EClass getFormulaAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.FormulaAnd#getLeft()
   * @see #getFormulaAnd()
   * @generated
   */
  EReference getFormulaAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.FormulaAnd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.FormulaAnd#getOp()
   * @see #getFormulaAnd()
   * @generated
   */
  EAttribute getFormulaAnd_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.FormulaAnd#getRight()
   * @see #getFormulaAnd()
   * @generated
   */
  EReference getFormulaAnd_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.FormulaOr <em>Formula Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula Or</em>'.
   * @see com.euclideanspace.casl.editor.FormulaOr
   * @generated
   */
  EClass getFormulaOr();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.FormulaOr#getLeft()
   * @see #getFormulaOr()
   * @generated
   */
  EReference getFormulaOr_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.FormulaOr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.FormulaOr#getOp()
   * @see #getFormulaOr()
   * @generated
   */
  EAttribute getFormulaOr_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.FormulaOr#getRight()
   * @see #getFormulaOr()
   * @generated
   */
  EReference getFormulaOr_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.FormulaImplies <em>Formula Implies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula Implies</em>'.
   * @see com.euclideanspace.casl.editor.FormulaImplies
   * @generated
   */
  EClass getFormulaImplies();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaImplies#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.FormulaImplies#getLeft()
   * @see #getFormulaImplies()
   * @generated
   */
  EReference getFormulaImplies_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.FormulaImplies#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.FormulaImplies#getOp()
   * @see #getFormulaImplies()
   * @generated
   */
  EAttribute getFormulaImplies_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaImplies#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.FormulaImplies#getRight()
   * @see #getFormulaImplies()
   * @generated
   */
  EReference getFormulaImplies_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.FormulaIf <em>Formula If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula If</em>'.
   * @see com.euclideanspace.casl.editor.FormulaIf
   * @generated
   */
  EClass getFormulaIf();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaIf#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.FormulaIf#getLeft()
   * @see #getFormulaIf()
   * @generated
   */
  EReference getFormulaIf_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.FormulaIf#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.FormulaIf#getOp()
   * @see #getFormulaIf()
   * @generated
   */
  EAttribute getFormulaIf_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaIf#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.FormulaIf#getRight()
   * @see #getFormulaIf()
   * @generated
   */
  EReference getFormulaIf_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.FormulaEquiv <em>Formula Equiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula Equiv</em>'.
   * @see com.euclideanspace.casl.editor.FormulaEquiv
   * @generated
   */
  EClass getFormulaEquiv();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaEquiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.euclideanspace.casl.editor.FormulaEquiv#getLeft()
   * @see #getFormulaEquiv()
   * @generated
   */
  EReference getFormulaEquiv_Left();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.FormulaEquiv#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.euclideanspace.casl.editor.FormulaEquiv#getOp()
   * @see #getFormulaEquiv()
   * @generated
   */
  EAttribute getFormulaEquiv_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.FormulaEquiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.FormulaEquiv#getRight()
   * @see #getFormulaEquiv()
   * @generated
   */
  EReference getFormulaEquiv_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see com.euclideanspace.casl.editor.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.UnaryExpression#getUop <em>Uop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uop</em>'.
   * @see com.euclideanspace.casl.editor.UnaryExpression#getUop()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Uop();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.UnaryExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.euclideanspace.casl.editor.UnaryExpression#getExpr()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Expr();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.Misfix <em>Misfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Misfix</em>'.
   * @see com.euclideanspace.casl.editor.Misfix
   * @generated
   */
  EClass getMisfix();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.Misfix#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.euclideanspace.casl.editor.Misfix#getSort()
   * @see #getMisfix()
   * @generated
   */
  EReference getMisfix_Sort();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.casl.editor.MisfixWhen <em>Misfix When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Misfix When</em>'.
   * @see com.euclideanspace.casl.editor.MisfixWhen
   * @generated
   */
  EClass getMisfixWhen();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.MisfixWhen#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formula</em>'.
   * @see com.euclideanspace.casl.editor.MisfixWhen#getFormula()
   * @see #getMisfixWhen()
   * @generated
   */
  EReference getMisfixWhen_Formula();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.casl.editor.MisfixWhen#getOp0 <em>Op0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op0</em>'.
   * @see com.euclideanspace.casl.editor.MisfixWhen#getOp0()
   * @see #getMisfixWhen()
   * @generated
   */
  EAttribute getMisfixWhen_Op0();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.casl.editor.MisfixWhen#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.casl.editor.MisfixWhen#getRight()
   * @see #getMisfixWhen()
   * @generated
   */
  EReference getMisfixWhen_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EditorFactory getEditorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.ModelImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Basic Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BASIC_SPEC = eINSTANCE.getModel_BasicSpec();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.BasicSpecImpl <em>Basic Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.BasicSpecImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getBasicSpec()
     * @generated
     */
    EClass BASIC_SPEC = eINSTANCE.getBasicSpec();

    /**
     * The meta object literal for the '<em><b>Basic Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_SPEC__BASIC_ITEMS = eINSTANCE.getBasicSpec_BasicItems();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_SPEC__EMPTY = eINSTANCE.getBasicSpec_Empty();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.BasicItemsImpl <em>Basic Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.BasicItemsImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getBasicItems()
     * @generated
     */
    EClass BASIC_ITEMS = eINSTANCE.getBasicItems();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__S = eINSTANCE.getBasicItems_S();

    /**
     * The meta object literal for the '<em><b>Datatype Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__DATATYPE_DECL = eINSTANCE.getBasicItems_DatatypeDecl();

    /**
     * The meta object literal for the '<em><b>Datatype Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__DATATYPE_DECL2 = eINSTANCE.getBasicItems_DatatypeDecl2();

    /**
     * The meta object literal for the '<em><b>S2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__S2 = eINSTANCE.getBasicItems_S2();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__VAR_DECL = eINSTANCE.getBasicItems_VarDecl();

    /**
     * The meta object literal for the '<em><b>Var Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__VAR_DECL2 = eINSTANCE.getBasicItems_VarDecl2();

    /**
     * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__FORMULA = eINSTANCE.getBasicItems_Formula();

    /**
     * The meta object literal for the '<em><b>Formula2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_ITEMS__FORMULA2 = eINSTANCE.getBasicItems_Formula2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.SigItemsImpl <em>Sig Items</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.SigItemsImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSigItems()
     * @generated
     */
    EClass SIG_ITEMS = eINSTANCE.getSigItems();

    /**
     * The meta object literal for the '<em><b>Sort Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__SORT_ITEM = eINSTANCE.getSigItems_SortItem();

    /**
     * The meta object literal for the '<em><b>Sort Item2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__SORT_ITEM2 = eINSTANCE.getSigItems_SortItem2();

    /**
     * The meta object literal for the '<em><b>Op Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__OP_ITEM = eINSTANCE.getSigItems_OpItem();

    /**
     * The meta object literal for the '<em><b>Op Item2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__OP_ITEM2 = eINSTANCE.getSigItems_OpItem2();

    /**
     * The meta object literal for the '<em><b>Pred Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__PRED_ITEM = eINSTANCE.getSigItems_PredItem();

    /**
     * The meta object literal for the '<em><b>Pred Item2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__PRED_ITEM2 = eINSTANCE.getSigItems_PredItem2();

    /**
     * The meta object literal for the '<em><b>Datatype Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__DATATYPE_DECL = eINSTANCE.getSigItems_DatatypeDecl();

    /**
     * The meta object literal for the '<em><b>Datatype Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_ITEMS__DATATYPE_DECL2 = eINSTANCE.getSigItems_DatatypeDecl2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.SortItemImpl <em>Sort Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.SortItemImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSortItem()
     * @generated
     */
    EClass SORT_ITEM = eINSTANCE.getSortItem();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT_ITEM__SORT = eINSTANCE.getSortItem_Sort();

    /**
     * The meta object literal for the '<em><b>Sort2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT_ITEM__SORT2 = eINSTANCE.getSortItem_Sort2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.OpItemImpl <em>Op Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.OpItemImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpItem()
     * @generated
     */
    EClass OP_ITEM = eINSTANCE.getOpItem();

    /**
     * The meta object literal for the '<em><b>Op Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__OP_NAME = eINSTANCE.getOpItem_OpName();

    /**
     * The meta object literal for the '<em><b>Op Name2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__OP_NAME2 = eINSTANCE.getOpItem_OpName2();

    /**
     * The meta object literal for the '<em><b>Op Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__OP_TYPE = eINSTANCE.getOpItem_OpType();

    /**
     * The meta object literal for the '<em><b>Op Attr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__OP_ATTR = eINSTANCE.getOpItem_OpAttr();

    /**
     * The meta object literal for the '<em><b>Op Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__OP_HEAD = eINSTANCE.getOpItem_OpHead();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ITEM__TERM = eINSTANCE.getOpItem_Term();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.OpTypeImpl <em>Op Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.OpTypeImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpType()
     * @generated
     */
    EClass OP_TYPE = eINSTANCE.getOpType();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_TYPE__SORT = eINSTANCE.getOpType_Sort();

    /**
     * The meta object literal for the '<em><b>Sort2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_TYPE__SORT2 = eINSTANCE.getOpType_Sort2();

    /**
     * The meta object literal for the '<em><b>Sort3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_TYPE__SORT3 = eINSTANCE.getOpType_Sort3();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.OpAttrImpl <em>Op Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.OpAttrImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpAttr()
     * @generated
     */
    EClass OP_ATTR = eINSTANCE.getOpAttr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_ATTR__OP = eINSTANCE.getOpAttr_Op();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_ATTR__TERM = eINSTANCE.getOpAttr_Term();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.OpHeadImpl <em>Op Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.OpHeadImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpHead()
     * @generated
     */
    EClass OP_HEAD = eINSTANCE.getOpHead();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_HEAD__SORT = eINSTANCE.getOpHead_Sort();

    /**
     * The meta object literal for the '<em><b>Arg Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_HEAD__ARG_DECL = eINSTANCE.getOpHead_ArgDecl();

    /**
     * The meta object literal for the '<em><b>Arg Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_HEAD__ARG_DECL2 = eINSTANCE.getOpHead_ArgDecl2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.ArgDeclImpl <em>Arg Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.ArgDeclImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getArgDecl()
     * @generated
     */
    EClass ARG_DECL = eINSTANCE.getArgDecl();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_DECL__VAR = eINSTANCE.getArgDecl_Var();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_DECL__VAR2 = eINSTANCE.getArgDecl_Var2();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_DECL__SORT = eINSTANCE.getArgDecl_Sort();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.PredItemImpl <em>Pred Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.PredItemImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredItem()
     * @generated
     */
    EClass PRED_ITEM = eINSTANCE.getPredItem();

    /**
     * The meta object literal for the '<em><b>Pred Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_ITEM__PRED_NAME = eINSTANCE.getPredItem_PredName();

    /**
     * The meta object literal for the '<em><b>Pred Name2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_ITEM__PRED_NAME2 = eINSTANCE.getPredItem_PredName2();

    /**
     * The meta object literal for the '<em><b>Pred Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_ITEM__PRED_TYPE = eINSTANCE.getPredItem_PredType();

    /**
     * The meta object literal for the '<em><b>Pred Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_ITEM__PRED_HEAD = eINSTANCE.getPredItem_PredHead();

    /**
     * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_ITEM__FORMULA = eINSTANCE.getPredItem_Formula();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.PredTypeImpl <em>Pred Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.PredTypeImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredType()
     * @generated
     */
    EClass PRED_TYPE = eINSTANCE.getPredType();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_TYPE__SORT = eINSTANCE.getPredType_Sort();

    /**
     * The meta object literal for the '<em><b>Sort2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_TYPE__SORT2 = eINSTANCE.getPredType_Sort2();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRED_TYPE__B = eINSTANCE.getPredType_B();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.PredHeadImpl <em>Pred Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.PredHeadImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredHead()
     * @generated
     */
    EClass PRED_HEAD = eINSTANCE.getPredHead();

    /**
     * The meta object literal for the '<em><b>Arg Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_HEAD__ARG_DECL = eINSTANCE.getPredHead_ArgDecl();

    /**
     * The meta object literal for the '<em><b>Arg Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_HEAD__ARG_DECL2 = eINSTANCE.getPredHead_ArgDecl2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.DatatypeDeclImpl <em>Datatype Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.DatatypeDeclImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getDatatypeDecl()
     * @generated
     */
    EClass DATATYPE_DECL = eINSTANCE.getDatatypeDecl();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.AlternativeImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Op Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__OP_NAME = eINSTANCE.getAlternative_OpName();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__COMPONENT = eINSTANCE.getAlternative_Component();

    /**
     * The meta object literal for the '<em><b>Component2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__COMPONENT2 = eINSTANCE.getAlternative_Component2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.ComponentImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Op Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__OP_NAME = eINSTANCE.getComponent_OpName();

    /**
     * The meta object literal for the '<em><b>Op Name2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__OP_NAME2 = eINSTANCE.getComponent_OpName2();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__SORT = eINSTANCE.getComponent_Sort();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.VarDeclImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VAR = eINSTANCE.getVarDecl_Var();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VAR2 = eINSTANCE.getVarDecl_Var2();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__SORT = eINSTANCE.getVarDecl_Sort();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormuImpl <em>Formu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormuImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormu()
     * @generated
     */
    EClass FORMU = eINSTANCE.getFormu();

    /**
     * The meta object literal for the '<em><b>Quantifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__QUANTIFIER = eINSTANCE.getFormu_Quantifier();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__VAR_DECL = eINSTANCE.getFormu_VarDecl();

    /**
     * The meta object literal for the '<em><b>Var Decl2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__VAR_DECL2 = eINSTANCE.getFormu_VarDecl2();

    /**
     * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__FORMULA = eINSTANCE.getFormu_Formula();

    /**
     * The meta object literal for the '<em><b>E3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMU__E3 = eINSTANCE.getFormu_E3();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__T = eINSTANCE.getFormu_T();

    /**
     * The meta object literal for the '<em><b>T2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__T2 = eINSTANCE.getFormu_T2();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__FORM = eINSTANCE.getFormu_Form();

    /**
     * The meta object literal for the '<em><b>Misfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__MISFIX = eINSTANCE.getFormu_Misfix();

    /**
     * The meta object literal for the '<em><b>Misfix2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMU__MISFIX2 = eINSTANCE.getFormu_Misfix2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.QuantifierImpl <em>Quantifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.QuantifierImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQuantifier()
     * @generated
     */
    EClass QUANTIFIER = eINSTANCE.getQuantifier();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__Q = eINSTANCE.getQuantifier_Q();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.TermsImpl <em>Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.TermsImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getTerms()
     * @generated
     */
    EClass TERMS = eINSTANCE.getTerms();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMS__TERM = eINSTANCE.getTerms_Term();

    /**
     * The meta object literal for the '<em><b>Term2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMS__TERM2 = eINSTANCE.getTerms_Term2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.TermImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Misfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__MISFIX = eINSTANCE.getTerm_Misfix();

    /**
     * The meta object literal for the '<em><b>Misfix2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__MISFIX2 = eINSTANCE.getTerm_Misfix2();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.MfixImpl <em>Mfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.MfixImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMfix()
     * @generated
     */
    EClass MFIX = eINSTANCE.getMfix();

    /**
     * The meta object literal for the '<em><b>Misfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__MISFIX = eINSTANCE.getMfix_Misfix();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__OP1 = eINSTANCE.getMfix_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__OP2 = eINSTANCE.getMfix_Op2();

    /**
     * The meta object literal for the '<em><b>Op3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MFIX__OP3 = eINSTANCE.getMfix_Op3();

    /**
     * The meta object literal for the '<em><b>Op4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__OP4 = eINSTANCE.getMfix_Op4();

    /**
     * The meta object literal for the '<em><b>Op5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__OP5 = eINSTANCE.getMfix_Op5();

    /**
     * The meta object literal for the '<em><b>Op6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__OP6 = eINSTANCE.getMfix_Op6();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MFIX__OP = eINSTANCE.getMfix_Op();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MFIX__LEFT = eINSTANCE.getMfix_Left();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.QualPredNameImpl <em>Qual Pred Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.QualPredNameImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualPredName()
     * @generated
     */
    EClass QUAL_PRED_NAME = eINSTANCE.getQualPredName();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.QualVarNameImpl <em>Qual Var Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.QualVarNameImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualVarName()
     * @generated
     */
    EClass QUAL_VAR_NAME = eINSTANCE.getQualVarName();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.QualOpNameImpl <em>Qual Op Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.QualOpNameImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getQualOpName()
     * @generated
     */
    EClass QUAL_OP_NAME = eINSTANCE.getQualOpName();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.SortImpl <em>Sort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.SortImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getSort()
     * @generated
     */
    EClass SORT = eINSTANCE.getSort();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT__ALTERNATIVE = eINSTANCE.getSort_Alternative();

    /**
     * The meta object literal for the '<em><b>Alternative2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT__ALTERNATIVE2 = eINSTANCE.getSort_Alternative2();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SORT__NAME = eINSTANCE.getSort_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.OpNameImpl <em>Op Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.OpNameImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getOpName()
     * @generated
     */
    EClass OP_NAME = eINSTANCE.getOpName();

    /**
     * The meta object literal for the '<em><b>Op Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_NAME__OP_TYPE = eINSTANCE.getOpName_OpType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_NAME__NAME = eINSTANCE.getOpName_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.PredNameImpl <em>Pred Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.PredNameImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getPredName()
     * @generated
     */
    EClass PRED_NAME = eINSTANCE.getPredName();

    /**
     * The meta object literal for the '<em><b>Pred Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED_NAME__PRED_TYPE = eINSTANCE.getPredName_PredType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRED_NAME__NAME = eINSTANCE.getPredName_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.VarImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__SORT = eINSTANCE.getVar_Sort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.TokenImpl <em>Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.TokenImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getToken()
     * @generated
     */
    EClass TOKEN = eINSTANCE.getToken();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOKEN__NUM = eINSTANCE.getToken_Num();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOKEN__T = eINSTANCE.getToken_T();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.LiteralImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__STR = eINSTANCE.getLiteral_Str();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__NUM = eINSTANCE.getLiteral_Num();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormulaAndImpl <em>Formula And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormulaAndImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaAnd()
     * @generated
     */
    EClass FORMULA_AND = eINSTANCE.getFormulaAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_AND__LEFT = eINSTANCE.getFormulaAnd_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_AND__OP = eINSTANCE.getFormulaAnd_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_AND__RIGHT = eINSTANCE.getFormulaAnd_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormulaOrImpl <em>Formula Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormulaOrImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaOr()
     * @generated
     */
    EClass FORMULA_OR = eINSTANCE.getFormulaOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_OR__LEFT = eINSTANCE.getFormulaOr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_OR__OP = eINSTANCE.getFormulaOr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_OR__RIGHT = eINSTANCE.getFormulaOr_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormulaImpliesImpl <em>Formula Implies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormulaImpliesImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaImplies()
     * @generated
     */
    EClass FORMULA_IMPLIES = eINSTANCE.getFormulaImplies();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_IMPLIES__LEFT = eINSTANCE.getFormulaImplies_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_IMPLIES__OP = eINSTANCE.getFormulaImplies_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_IMPLIES__RIGHT = eINSTANCE.getFormulaImplies_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormulaIfImpl <em>Formula If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormulaIfImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaIf()
     * @generated
     */
    EClass FORMULA_IF = eINSTANCE.getFormulaIf();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_IF__LEFT = eINSTANCE.getFormulaIf_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_IF__OP = eINSTANCE.getFormulaIf_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_IF__RIGHT = eINSTANCE.getFormulaIf_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.FormulaEquivImpl <em>Formula Equiv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.FormulaEquivImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getFormulaEquiv()
     * @generated
     */
    EClass FORMULA_EQUIV = eINSTANCE.getFormulaEquiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EQUIV__LEFT = eINSTANCE.getFormulaEquiv_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_EQUIV__OP = eINSTANCE.getFormulaEquiv_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EQUIV__RIGHT = eINSTANCE.getFormulaEquiv_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.UnaryExpressionImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Uop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__UOP = eINSTANCE.getUnaryExpression_Uop();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.MisfixImpl <em>Misfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.MisfixImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMisfix()
     * @generated
     */
    EClass MISFIX = eINSTANCE.getMisfix();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISFIX__SORT = eINSTANCE.getMisfix_Sort();

    /**
     * The meta object literal for the '{@link com.euclideanspace.casl.editor.impl.MisfixWhenImpl <em>Misfix When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.casl.editor.impl.MisfixWhenImpl
     * @see com.euclideanspace.casl.editor.impl.EditorPackageImpl#getMisfixWhen()
     * @generated
     */
    EClass MISFIX_WHEN = eINSTANCE.getMisfixWhen();

    /**
     * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISFIX_WHEN__FORMULA = eINSTANCE.getMisfixWhen_Formula();

    /**
     * The meta object literal for the '<em><b>Op0</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISFIX_WHEN__OP0 = eINSTANCE.getMisfixWhen_Op0();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MISFIX_WHEN__RIGHT = eINSTANCE.getMisfixWhen_Right();

  }

} //EditorPackage
