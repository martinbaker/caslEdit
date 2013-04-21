/**
 */
package com.euclideanspace.casl.editor.util;

import com.euclideanspace.casl.editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.casl.editor.EditorPackage
 * @generated
 */
public class EditorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorSwitch<Adapter> modelSwitch =
    new EditorSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseBasicSpec(BasicSpec object)
      {
        return createBasicSpecAdapter();
      }
      @Override
      public Adapter caseBasicItems(BasicItems object)
      {
        return createBasicItemsAdapter();
      }
      @Override
      public Adapter caseSigItems(SigItems object)
      {
        return createSigItemsAdapter();
      }
      @Override
      public Adapter caseSortItem(SortItem object)
      {
        return createSortItemAdapter();
      }
      @Override
      public Adapter caseOpItem(OpItem object)
      {
        return createOpItemAdapter();
      }
      @Override
      public Adapter caseOpType(OpType object)
      {
        return createOpTypeAdapter();
      }
      @Override
      public Adapter caseOpAttr(OpAttr object)
      {
        return createOpAttrAdapter();
      }
      @Override
      public Adapter caseOpHead(OpHead object)
      {
        return createOpHeadAdapter();
      }
      @Override
      public Adapter caseArgDecl(ArgDecl object)
      {
        return createArgDeclAdapter();
      }
      @Override
      public Adapter casePredItem(PredItem object)
      {
        return createPredItemAdapter();
      }
      @Override
      public Adapter casePredType(PredType object)
      {
        return createPredTypeAdapter();
      }
      @Override
      public Adapter casePredHead(PredHead object)
      {
        return createPredHeadAdapter();
      }
      @Override
      public Adapter caseDatatypeDecl(DatatypeDecl object)
      {
        return createDatatypeDeclAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseVarDecl(VarDecl object)
      {
        return createVarDeclAdapter();
      }
      @Override
      public Adapter caseFormu(Formu object)
      {
        return createFormuAdapter();
      }
      @Override
      public Adapter caseQuantifier(Quantifier object)
      {
        return createQuantifierAdapter();
      }
      @Override
      public Adapter caseTerms(Terms object)
      {
        return createTermsAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseMfix(Mfix object)
      {
        return createMfixAdapter();
      }
      @Override
      public Adapter caseQualPredName(QualPredName object)
      {
        return createQualPredNameAdapter();
      }
      @Override
      public Adapter caseQualVarName(QualVarName object)
      {
        return createQualVarNameAdapter();
      }
      @Override
      public Adapter caseQualOpName(QualOpName object)
      {
        return createQualOpNameAdapter();
      }
      @Override
      public Adapter caseSort(Sort object)
      {
        return createSortAdapter();
      }
      @Override
      public Adapter caseOpName(OpName object)
      {
        return createOpNameAdapter();
      }
      @Override
      public Adapter casePredName(PredName object)
      {
        return createPredNameAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter caseToken(Token object)
      {
        return createTokenAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseFormulaAnd(FormulaAnd object)
      {
        return createFormulaAndAdapter();
      }
      @Override
      public Adapter caseFormulaOr(FormulaOr object)
      {
        return createFormulaOrAdapter();
      }
      @Override
      public Adapter caseFormulaImplies(FormulaImplies object)
      {
        return createFormulaImpliesAdapter();
      }
      @Override
      public Adapter caseFormulaIf(FormulaIf object)
      {
        return createFormulaIfAdapter();
      }
      @Override
      public Adapter caseFormulaEquiv(FormulaEquiv object)
      {
        return createFormulaEquivAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseMisfix(Misfix object)
      {
        return createMisfixAdapter();
      }
      @Override
      public Adapter caseMisfixWhen(MisfixWhen object)
      {
        return createMisfixWhenAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.BasicSpec <em>Basic Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.BasicSpec
   * @generated
   */
  public Adapter createBasicSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.BasicItems <em>Basic Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.BasicItems
   * @generated
   */
  public Adapter createBasicItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.SigItems <em>Sig Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.SigItems
   * @generated
   */
  public Adapter createSigItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.SortItem <em>Sort Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.SortItem
   * @generated
   */
  public Adapter createSortItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.OpItem <em>Op Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.OpItem
   * @generated
   */
  public Adapter createOpItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.OpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.OpType
   * @generated
   */
  public Adapter createOpTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.OpAttr <em>Op Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.OpAttr
   * @generated
   */
  public Adapter createOpAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.OpHead <em>Op Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.OpHead
   * @generated
   */
  public Adapter createOpHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.ArgDecl <em>Arg Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.ArgDecl
   * @generated
   */
  public Adapter createArgDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.PredItem <em>Pred Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.PredItem
   * @generated
   */
  public Adapter createPredItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.PredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.PredType
   * @generated
   */
  public Adapter createPredTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.PredHead <em>Pred Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.PredHead
   * @generated
   */
  public Adapter createPredHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.DatatypeDecl <em>Datatype Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.DatatypeDecl
   * @generated
   */
  public Adapter createDatatypeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.VarDecl
   * @generated
   */
  public Adapter createVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Formu <em>Formu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Formu
   * @generated
   */
  public Adapter createFormuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Quantifier
   * @generated
   */
  public Adapter createQuantifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Terms
   * @generated
   */
  public Adapter createTermsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Mfix <em>Mfix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Mfix
   * @generated
   */
  public Adapter createMfixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.QualPredName <em>Qual Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.QualPredName
   * @generated
   */
  public Adapter createQualPredNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.QualVarName <em>Qual Var Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.QualVarName
   * @generated
   */
  public Adapter createQualVarNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.QualOpName <em>Qual Op Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.QualOpName
   * @generated
   */
  public Adapter createQualOpNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Sort
   * @generated
   */
  public Adapter createSortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.OpName <em>Op Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.OpName
   * @generated
   */
  public Adapter createOpNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.PredName <em>Pred Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.PredName
   * @generated
   */
  public Adapter createPredNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Token <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Token
   * @generated
   */
  public Adapter createTokenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.FormulaAnd <em>Formula And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.FormulaAnd
   * @generated
   */
  public Adapter createFormulaAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.FormulaOr <em>Formula Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.FormulaOr
   * @generated
   */
  public Adapter createFormulaOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.FormulaImplies <em>Formula Implies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.FormulaImplies
   * @generated
   */
  public Adapter createFormulaImpliesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.FormulaIf <em>Formula If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.FormulaIf
   * @generated
   */
  public Adapter createFormulaIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.FormulaEquiv <em>Formula Equiv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.FormulaEquiv
   * @generated
   */
  public Adapter createFormulaEquivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.Misfix <em>Misfix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.Misfix
   * @generated
   */
  public Adapter createMisfixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.casl.editor.MisfixWhen <em>Misfix When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.casl.editor.MisfixWhen
   * @generated
   */
  public Adapter createMisfixWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EditorAdapterFactory
