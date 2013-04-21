/**
 */
package com.euclideanspace.casl.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.casl.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorFactory eINSTANCE = com.euclideanspace.casl.editor.impl.EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Basic Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Spec</em>'.
   * @generated
   */
  BasicSpec createBasicSpec();

  /**
   * Returns a new object of class '<em>Basic Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Items</em>'.
   * @generated
   */
  BasicItems createBasicItems();

  /**
   * Returns a new object of class '<em>Sig Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Items</em>'.
   * @generated
   */
  SigItems createSigItems();

  /**
   * Returns a new object of class '<em>Sort Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Item</em>'.
   * @generated
   */
  SortItem createSortItem();

  /**
   * Returns a new object of class '<em>Op Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Item</em>'.
   * @generated
   */
  OpItem createOpItem();

  /**
   * Returns a new object of class '<em>Op Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Type</em>'.
   * @generated
   */
  OpType createOpType();

  /**
   * Returns a new object of class '<em>Op Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Attr</em>'.
   * @generated
   */
  OpAttr createOpAttr();

  /**
   * Returns a new object of class '<em>Op Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Head</em>'.
   * @generated
   */
  OpHead createOpHead();

  /**
   * Returns a new object of class '<em>Arg Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arg Decl</em>'.
   * @generated
   */
  ArgDecl createArgDecl();

  /**
   * Returns a new object of class '<em>Pred Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Item</em>'.
   * @generated
   */
  PredItem createPredItem();

  /**
   * Returns a new object of class '<em>Pred Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Type</em>'.
   * @generated
   */
  PredType createPredType();

  /**
   * Returns a new object of class '<em>Pred Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Head</em>'.
   * @generated
   */
  PredHead createPredHead();

  /**
   * Returns a new object of class '<em>Datatype Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Decl</em>'.
   * @generated
   */
  DatatypeDecl createDatatypeDecl();

  /**
   * Returns a new object of class '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative</em>'.
   * @generated
   */
  Alternative createAlternative();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Formu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formu</em>'.
   * @generated
   */
  Formu createFormu();

  /**
   * Returns a new object of class '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantifier</em>'.
   * @generated
   */
  Quantifier createQuantifier();

  /**
   * Returns a new object of class '<em>Terms</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms</em>'.
   * @generated
   */
  Terms createTerms();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Mfix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mfix</em>'.
   * @generated
   */
  Mfix createMfix();

  /**
   * Returns a new object of class '<em>Qual Pred Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Pred Name</em>'.
   * @generated
   */
  QualPredName createQualPredName();

  /**
   * Returns a new object of class '<em>Qual Var Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Var Name</em>'.
   * @generated
   */
  QualVarName createQualVarName();

  /**
   * Returns a new object of class '<em>Qual Op Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qual Op Name</em>'.
   * @generated
   */
  QualOpName createQualOpName();

  /**
   * Returns a new object of class '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort</em>'.
   * @generated
   */
  Sort createSort();

  /**
   * Returns a new object of class '<em>Op Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Name</em>'.
   * @generated
   */
  OpName createOpName();

  /**
   * Returns a new object of class '<em>Pred Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Name</em>'.
   * @generated
   */
  PredName createPredName();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Token</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Token</em>'.
   * @generated
   */
  Token createToken();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Formula And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula And</em>'.
   * @generated
   */
  FormulaAnd createFormulaAnd();

  /**
   * Returns a new object of class '<em>Formula Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula Or</em>'.
   * @generated
   */
  FormulaOr createFormulaOr();

  /**
   * Returns a new object of class '<em>Formula Implies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula Implies</em>'.
   * @generated
   */
  FormulaImplies createFormulaImplies();

  /**
   * Returns a new object of class '<em>Formula If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula If</em>'.
   * @generated
   */
  FormulaIf createFormulaIf();

  /**
   * Returns a new object of class '<em>Formula Equiv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula Equiv</em>'.
   * @generated
   */
  FormulaEquiv createFormulaEquiv();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Misfix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Misfix</em>'.
   * @generated
   */
  Misfix createMisfix();

  /**
   * Returns a new object of class '<em>Misfix When</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Misfix When</em>'.
   * @generated
   */
  MisfixWhen createMisfixWhen();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EditorPackage getEditorPackage();

} //EditorFactory
