/**
 */
package com.euclideanspace.casl.editor.impl;

import com.euclideanspace.casl.editor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorFactoryImpl extends EFactoryImpl implements EditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditorFactory init()
  {
    try
    {
      EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.euclideanspace.com/casl/Editor"); 
      if (theEditorFactory != null)
      {
        return theEditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EditorPackage.MODEL: return createModel();
      case EditorPackage.BASIC_SPEC: return createBasicSpec();
      case EditorPackage.BASIC_ITEMS: return createBasicItems();
      case EditorPackage.SIG_ITEMS: return createSigItems();
      case EditorPackage.SORT_ITEM: return createSortItem();
      case EditorPackage.OP_ITEM: return createOpItem();
      case EditorPackage.OP_TYPE: return createOpType();
      case EditorPackage.OP_ATTR: return createOpAttr();
      case EditorPackage.OP_HEAD: return createOpHead();
      case EditorPackage.ARG_DECL: return createArgDecl();
      case EditorPackage.PRED_ITEM: return createPredItem();
      case EditorPackage.PRED_TYPE: return createPredType();
      case EditorPackage.PRED_HEAD: return createPredHead();
      case EditorPackage.DATATYPE_DECL: return createDatatypeDecl();
      case EditorPackage.ALTERNATIVE: return createAlternative();
      case EditorPackage.COMPONENT: return createComponent();
      case EditorPackage.VAR_DECL: return createVarDecl();
      case EditorPackage.FORMU: return createFormu();
      case EditorPackage.QUANTIFIER: return createQuantifier();
      case EditorPackage.TERMS: return createTerms();
      case EditorPackage.TERM: return createTerm();
      case EditorPackage.MFIX: return createMfix();
      case EditorPackage.QUAL_PRED_NAME: return createQualPredName();
      case EditorPackage.QUAL_VAR_NAME: return createQualVarName();
      case EditorPackage.QUAL_OP_NAME: return createQualOpName();
      case EditorPackage.SORT: return createSort();
      case EditorPackage.OP_NAME: return createOpName();
      case EditorPackage.PRED_NAME: return createPredName();
      case EditorPackage.VAR: return createVar();
      case EditorPackage.TOKEN: return createToken();
      case EditorPackage.LITERAL: return createLiteral();
      case EditorPackage.FORMULA_AND: return createFormulaAnd();
      case EditorPackage.FORMULA_OR: return createFormulaOr();
      case EditorPackage.FORMULA_IMPLIES: return createFormulaImplies();
      case EditorPackage.FORMULA_IF: return createFormulaIf();
      case EditorPackage.FORMULA_EQUIV: return createFormulaEquiv();
      case EditorPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case EditorPackage.MISFIX: return createMisfix();
      case EditorPackage.MISFIX_WHEN: return createMisfixWhen();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicSpec createBasicSpec()
  {
    BasicSpecImpl basicSpec = new BasicSpecImpl();
    return basicSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicItems createBasicItems()
  {
    BasicItemsImpl basicItems = new BasicItemsImpl();
    return basicItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigItems createSigItems()
  {
    SigItemsImpl sigItems = new SigItemsImpl();
    return sigItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortItem createSortItem()
  {
    SortItemImpl sortItem = new SortItemImpl();
    return sortItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpItem createOpItem()
  {
    OpItemImpl opItem = new OpItemImpl();
    return opItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType createOpType()
  {
    OpTypeImpl opType = new OpTypeImpl();
    return opType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpAttr createOpAttr()
  {
    OpAttrImpl opAttr = new OpAttrImpl();
    return opAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpHead createOpHead()
  {
    OpHeadImpl opHead = new OpHeadImpl();
    return opHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgDecl createArgDecl()
  {
    ArgDeclImpl argDecl = new ArgDeclImpl();
    return argDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredItem createPredItem()
  {
    PredItemImpl predItem = new PredItemImpl();
    return predItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredType createPredType()
  {
    PredTypeImpl predType = new PredTypeImpl();
    return predType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredHead createPredHead()
  {
    PredHeadImpl predHead = new PredHeadImpl();
    return predHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeDecl createDatatypeDecl()
  {
    DatatypeDeclImpl datatypeDecl = new DatatypeDeclImpl();
    return datatypeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formu createFormu()
  {
    FormuImpl formu = new FormuImpl();
    return formu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier createQuantifier()
  {
    QuantifierImpl quantifier = new QuantifierImpl();
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terms createTerms()
  {
    TermsImpl terms = new TermsImpl();
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mfix createMfix()
  {
    MfixImpl mfix = new MfixImpl();
    return mfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualPredName createQualPredName()
  {
    QualPredNameImpl qualPredName = new QualPredNameImpl();
    return qualPredName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualVarName createQualVarName()
  {
    QualVarNameImpl qualVarName = new QualVarNameImpl();
    return qualVarName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualOpName createQualOpName()
  {
    QualOpNameImpl qualOpName = new QualOpNameImpl();
    return qualOpName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort createSort()
  {
    SortImpl sort = new SortImpl();
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpName createOpName()
  {
    OpNameImpl opName = new OpNameImpl();
    return opName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredName createPredName()
  {
    PredNameImpl predName = new PredNameImpl();
    return predName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Token createToken()
  {
    TokenImpl token = new TokenImpl();
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaAnd createFormulaAnd()
  {
    FormulaAndImpl formulaAnd = new FormulaAndImpl();
    return formulaAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaOr createFormulaOr()
  {
    FormulaOrImpl formulaOr = new FormulaOrImpl();
    return formulaOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaImplies createFormulaImplies()
  {
    FormulaImpliesImpl formulaImplies = new FormulaImpliesImpl();
    return formulaImplies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaIf createFormulaIf()
  {
    FormulaIfImpl formulaIf = new FormulaIfImpl();
    return formulaIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaEquiv createFormulaEquiv()
  {
    FormulaEquivImpl formulaEquiv = new FormulaEquivImpl();
    return formulaEquiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Misfix createMisfix()
  {
    MisfixImpl misfix = new MisfixImpl();
    return misfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MisfixWhen createMisfixWhen()
  {
    MisfixWhenImpl misfixWhen = new MisfixWhenImpl();
    return misfixWhen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorPackage getEditorPackage()
  {
    return (EditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EditorPackage getPackage()
  {
    return EditorPackage.eINSTANCE;
  }

} //EditorFactoryImpl
