/**
 */
package com.euclideanspace.casl.editor.util;

import com.euclideanspace.casl.editor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.casl.editor.EditorPackage
 * @generated
 */
public class EditorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EditorPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BASIC_SPEC:
      {
        BasicSpec basicSpec = (BasicSpec)theEObject;
        T result = caseBasicSpec(basicSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BASIC_ITEMS:
      {
        BasicItems basicItems = (BasicItems)theEObject;
        T result = caseBasicItems(basicItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SIG_ITEMS:
      {
        SigItems sigItems = (SigItems)theEObject;
        T result = caseSigItems(sigItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SORT_ITEM:
      {
        SortItem sortItem = (SortItem)theEObject;
        T result = caseSortItem(sortItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_ITEM:
      {
        OpItem opItem = (OpItem)theEObject;
        T result = caseOpItem(opItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_TYPE:
      {
        OpType opType = (OpType)theEObject;
        T result = caseOpType(opType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_ATTR:
      {
        OpAttr opAttr = (OpAttr)theEObject;
        T result = caseOpAttr(opAttr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_HEAD:
      {
        OpHead opHead = (OpHead)theEObject;
        T result = caseOpHead(opHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ARG_DECL:
      {
        ArgDecl argDecl = (ArgDecl)theEObject;
        T result = caseArgDecl(argDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PRED_ITEM:
      {
        PredItem predItem = (PredItem)theEObject;
        T result = casePredItem(predItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PRED_TYPE:
      {
        PredType predType = (PredType)theEObject;
        T result = casePredType(predType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PRED_HEAD:
      {
        PredHead predHead = (PredHead)theEObject;
        T result = casePredHead(predHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.DATATYPE_DECL:
      {
        DatatypeDecl datatypeDecl = (DatatypeDecl)theEObject;
        T result = caseDatatypeDecl(datatypeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ALTERNATIVE:
      {
        Alternative alternative = (Alternative)theEObject;
        T result = caseAlternative(alternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.VAR_DECL:
      {
        VarDecl varDecl = (VarDecl)theEObject;
        T result = caseVarDecl(varDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMU:
      {
        Formu formu = (Formu)theEObject;
        T result = caseFormu(formu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUANTIFIER:
      {
        Quantifier quantifier = (Quantifier)theEObject;
        T result = caseQuantifier(quantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TERMS:
      {
        Terms terms = (Terms)theEObject;
        T result = caseTerms(terms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MFIX:
      {
        Mfix mfix = (Mfix)theEObject;
        T result = caseMfix(mfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_PRED_NAME:
      {
        QualPredName qualPredName = (QualPredName)theEObject;
        T result = caseQualPredName(qualPredName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_VAR_NAME:
      {
        QualVarName qualVarName = (QualVarName)theEObject;
        T result = caseQualVarName(qualVarName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUAL_OP_NAME:
      {
        QualOpName qualOpName = (QualOpName)theEObject;
        T result = caseQualOpName(qualOpName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SORT:
      {
        Sort sort = (Sort)theEObject;
        T result = caseSort(sort);
        if (result == null) result = caseDatatypeDecl(sort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.OP_NAME:
      {
        OpName opName = (OpName)theEObject;
        T result = caseOpName(opName);
        if (result == null) result = caseQualOpName(opName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PRED_NAME:
      {
        PredName predName = (PredName)theEObject;
        T result = casePredName(predName);
        if (result == null) result = caseQualVarName(predName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = caseQualPredName(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TOKEN:
      {
        Token token = (Token)theEObject;
        T result = caseToken(token);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMULA_AND:
      {
        FormulaAnd formulaAnd = (FormulaAnd)theEObject;
        T result = caseFormulaAnd(formulaAnd);
        if (result == null) result = caseFormu(formulaAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMULA_OR:
      {
        FormulaOr formulaOr = (FormulaOr)theEObject;
        T result = caseFormulaOr(formulaOr);
        if (result == null) result = caseFormu(formulaOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMULA_IMPLIES:
      {
        FormulaImplies formulaImplies = (FormulaImplies)theEObject;
        T result = caseFormulaImplies(formulaImplies);
        if (result == null) result = caseFormu(formulaImplies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMULA_IF:
      {
        FormulaIf formulaIf = (FormulaIf)theEObject;
        T result = caseFormulaIf(formulaIf);
        if (result == null) result = caseFormu(formulaIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FORMULA_EQUIV:
      {
        FormulaEquiv formulaEquiv = (FormulaEquiv)theEObject;
        T result = caseFormulaEquiv(formulaEquiv);
        if (result == null) result = caseFormu(formulaEquiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseFormu(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MISFIX:
      {
        Misfix misfix = (Misfix)theEObject;
        T result = caseMisfix(misfix);
        if (result == null) result = caseMfix(misfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MISFIX_WHEN:
      {
        MisfixWhen misfixWhen = (MisfixWhen)theEObject;
        T result = caseMisfixWhen(misfixWhen);
        if (result == null) result = caseMfix(misfixWhen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicSpec(BasicSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicItems(BasicItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigItems(SigItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortItem(SortItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpItem(OpItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpType(OpType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpAttr(OpAttr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpHead(OpHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgDecl(ArgDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredItem(PredItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredType(PredType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredHead(PredHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeDecl(DatatypeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternative(Alternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecl(VarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormu(Formu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifier(Quantifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerms(Terms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMfix(Mfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Pred Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Pred Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualPredName(QualPredName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Var Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Var Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualVarName(QualVarName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qual Op Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qual Op Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualOpName(QualOpName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSort(Sort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpName(OpName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredName(PredName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar(Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToken(Token object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaAnd(FormulaAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaOr(FormulaOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula Implies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula Implies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaImplies(FormulaImplies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaIf(FormulaIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula Equiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula Equiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaEquiv(FormulaEquiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Misfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Misfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMisfix(Misfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Misfix When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Misfix When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMisfixWhen(MisfixWhen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EditorSwitch
