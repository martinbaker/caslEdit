package com.euclideanspace.casl.serializer;

import com.euclideanspace.casl.editor.Alternative;
import com.euclideanspace.casl.editor.ArgDecl;
import com.euclideanspace.casl.editor.BasicItems;
import com.euclideanspace.casl.editor.BasicSpec;
import com.euclideanspace.casl.editor.Component;
import com.euclideanspace.casl.editor.EditorPackage;
import com.euclideanspace.casl.editor.Formu;
import com.euclideanspace.casl.editor.FormulaAnd;
import com.euclideanspace.casl.editor.FormulaEquiv;
import com.euclideanspace.casl.editor.FormulaIf;
import com.euclideanspace.casl.editor.FormulaImplies;
import com.euclideanspace.casl.editor.FormulaOr;
import com.euclideanspace.casl.editor.Literal;
import com.euclideanspace.casl.editor.Mfix;
import com.euclideanspace.casl.editor.Misfix;
import com.euclideanspace.casl.editor.MisfixWhen;
import com.euclideanspace.casl.editor.Model;
import com.euclideanspace.casl.editor.OpAttr;
import com.euclideanspace.casl.editor.OpHead;
import com.euclideanspace.casl.editor.OpItem;
import com.euclideanspace.casl.editor.OpName;
import com.euclideanspace.casl.editor.OpType;
import com.euclideanspace.casl.editor.PredHead;
import com.euclideanspace.casl.editor.PredItem;
import com.euclideanspace.casl.editor.PredName;
import com.euclideanspace.casl.editor.PredType;
import com.euclideanspace.casl.editor.Quantifier;
import com.euclideanspace.casl.editor.SigItems;
import com.euclideanspace.casl.editor.Sort;
import com.euclideanspace.casl.editor.SortItem;
import com.euclideanspace.casl.editor.Term;
import com.euclideanspace.casl.editor.Terms;
import com.euclideanspace.casl.editor.Token;
import com.euclideanspace.casl.editor.UnaryExpression;
import com.euclideanspace.casl.editor.Var;
import com.euclideanspace.casl.editor.VarDecl;
import com.euclideanspace.casl.services.EditorGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EditorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EditorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EditorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EditorPackage.ALTERNATIVE:
				if(context == grammarAccess.getAlternativeRule()) {
					sequence_Alternative(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.ARG_DECL:
				if(context == grammarAccess.getArgDeclRule()) {
					sequence_ArgDecl(context, (ArgDecl) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BASIC_ITEMS:
				if(context == grammarAccess.getBasicItemsRule()) {
					sequence_BasicItems(context, (BasicItems) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.BASIC_SPEC:
				if(context == grammarAccess.getBasicSpecRule()) {
					sequence_BasicSpec(context, (BasicSpec) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMU:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaEquivRule() ||
				   context == grammarAccess.getFormulaEquivAccess().getFormulaEquivLeftAction_1_0() ||
				   context == grammarAccess.getFormulaIfRule() ||
				   context == grammarAccess.getFormulaIfAccess().getFormulaIfLeftAction_1_0() ||
				   context == grammarAccess.getFormulaImpliesRule() ||
				   context == grammarAccess.getFormulaImpliesAccess().getFormulaImpliesLeftAction_1_0() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0() ||
				   context == grammarAccess.getFormulaUnaryRule()) {
					sequence_FormulaUnary(context, (Formu) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFormulaRule()) {
					sequence_Formula(context, (Formu) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMULA_AND:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0()) {
					sequence_FormulaAnd(context, (FormulaAnd) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMULA_EQUIV:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaEquivRule() ||
				   context == grammarAccess.getFormulaIfRule() ||
				   context == grammarAccess.getFormulaIfAccess().getFormulaIfLeftAction_1_0() ||
				   context == grammarAccess.getFormulaImpliesRule() ||
				   context == grammarAccess.getFormulaImpliesAccess().getFormulaImpliesLeftAction_1_0() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0()) {
					sequence_FormulaEquiv(context, (FormulaEquiv) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMULA_IF:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaIfRule() ||
				   context == grammarAccess.getFormulaImpliesRule() ||
				   context == grammarAccess.getFormulaImpliesAccess().getFormulaImpliesLeftAction_1_0() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0()) {
					sequence_FormulaIf(context, (FormulaIf) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMULA_IMPLIES:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaImpliesRule() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0()) {
					sequence_FormulaImplies(context, (FormulaImplies) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.FORMULA_OR:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0()) {
					sequence_FormulaOr(context, (FormulaOr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MFIX:
				if(context == grammarAccess.getMisfixRule() ||
				   context == grammarAccess.getMisfixUnaryRule() ||
				   context == grammarAccess.getMisfixWhenRule() ||
				   context == grammarAccess.getMisfixWhenAccess().getMisfixWhenLeftAction_1_0() ||
				   context == grammarAccess.getMisfixAccess().getMisfixLeftAction_1_0()) {
					sequence_MisfixUnary(context, (Mfix) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MISFIX:
				if(context == grammarAccess.getMisfixRule()) {
					sequence_Misfix(context, (Misfix) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MISFIX_WHEN:
				if(context == grammarAccess.getMisfixRule() ||
				   context == grammarAccess.getMisfixWhenRule() ||
				   context == grammarAccess.getMisfixAccess().getMisfixLeftAction_1_0()) {
					sequence_MisfixWhen(context, (MisfixWhen) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_ATTR:
				if(context == grammarAccess.getOpAttrRule()) {
					sequence_OpAttr(context, (OpAttr) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_HEAD:
				if(context == grammarAccess.getOpHeadRule()) {
					sequence_OpHead(context, (OpHead) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_ITEM:
				if(context == grammarAccess.getOpItemRule()) {
					sequence_OpItem(context, (OpItem) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_NAME:
				if(context == grammarAccess.getOpNameRule()) {
					sequence_OpName(context, (OpName) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQualOpNameRule()) {
					sequence_OpName_QualOpName(context, (OpName) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.OP_TYPE:
				if(context == grammarAccess.getOpTypeRule()) {
					sequence_OpType(context, (OpType) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRED_HEAD:
				if(context == grammarAccess.getPredHeadRule()) {
					sequence_PredHead(context, (PredHead) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRED_ITEM:
				if(context == grammarAccess.getPredItemRule()) {
					sequence_PredItem(context, (PredItem) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRED_NAME:
				if(context == grammarAccess.getPredNameRule()) {
					sequence_PredName(context, (PredName) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQualVarNameRule()) {
					sequence_PredName_QualVarName(context, (PredName) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.PRED_TYPE:
				if(context == grammarAccess.getPredTypeRule()) {
					sequence_PredType(context, (PredType) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.QUANTIFIER:
				if(context == grammarAccess.getQuantifierRule()) {
					sequence_Quantifier(context, (Quantifier) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SIG_ITEMS:
				if(context == grammarAccess.getSigItemsRule()) {
					sequence_SigItems(context, (SigItems) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SORT:
				if(context == grammarAccess.getDatatypeDeclRule()) {
					sequence_DatatypeDecl_Sort(context, (Sort) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSortRule()) {
					sequence_Sort(context, (Sort) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.SORT_ITEM:
				if(context == grammarAccess.getSortItemRule()) {
					sequence_SortItem(context, (SortItem) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TERMS:
				if(context == grammarAccess.getTermsRule()) {
					sequence_Terms(context, (Terms) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.TOKEN:
				if(context == grammarAccess.getTokenRule()) {
					sequence_Token(context, (Token) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getFormulaAndRule() ||
				   context == grammarAccess.getFormulaAndAccess().getFormulaAndLeftAction_1_0() ||
				   context == grammarAccess.getFormulaEquivRule() ||
				   context == grammarAccess.getFormulaEquivAccess().getFormulaEquivLeftAction_1_0() ||
				   context == grammarAccess.getFormulaIfRule() ||
				   context == grammarAccess.getFormulaIfAccess().getFormulaIfLeftAction_1_0() ||
				   context == grammarAccess.getFormulaImpliesRule() ||
				   context == grammarAccess.getFormulaImpliesAccess().getFormulaImpliesLeftAction_1_0() ||
				   context == grammarAccess.getFormulaOrRule() ||
				   context == grammarAccess.getFormulaOrAccess().getFormulaOrLeftAction_1_0() ||
				   context == grammarAccess.getFormulaUnaryRule()) {
					sequence_FormulaUnary(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VAR:
				if(context == grammarAccess.getQualPredNameRule()) {
					sequence_QualPredName_Var(context, (Var) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case EditorPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (opName=OpName (component=Component component2+=Component*)?)
	 */
	protected void sequence_Alternative(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Var var2+=Var* sort=Sort)
	 */
	protected void sequence_ArgDecl(EObject context, ArgDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         s=SigItems | 
	 *         (datatypeDecl=DatatypeDecl datatypeDecl2+=DatatypeDecl*) | 
	 *         (datatypeDecl=DatatypeDecl datatypeDecl2+=DatatypeDecl*) | 
	 *         s2+=SigItems+ | 
	 *         (varDecl=VarDecl varDecl2+=VarDecl*) | 
	 *         (varDecl=VarDecl varDecl2+=VarDecl* formula=Formula formula2+=Formula*)
	 *     )
	 */
	protected void sequence_BasicItems(EObject context, BasicItems semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (basicItems+=BasicItems+ | empty='{')
	 */
	protected void sequence_BasicSpec(EObject context, BasicSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opName=OpName opName2+=OpName* sort=Sort)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID alternative=Alternative alternative2+=Alternative*)
	 */
	protected void sequence_DatatypeDecl_Sort(EObject context, Sort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FormulaAnd_FormulaAnd_1_0 op='/\' right=FormulaOr)
	 */
	protected void sequence_FormulaAnd(EObject context, FormulaAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FormulaEquiv_FormulaEquiv_1_0 op='<=>' right=FormulaUnary)
	 */
	protected void sequence_FormulaEquiv(EObject context, FormulaEquiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FormulaIf_FormulaIf_1_0 op='if' right=FormulaEquiv)
	 */
	protected void sequence_FormulaIf(EObject context, FormulaIf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FormulaImplies_FormulaImplies_1_0 op='=>' right=FormulaIf)
	 */
	protected void sequence_FormulaImplies(EObject context, FormulaImplies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FormulaOr_FormulaOr_1_0 op='\/' right=FormulaImplies)
	 */
	protected void sequence_FormulaOr(EObject context, FormulaOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         e3='true' | 
	 *         e3='false' | 
	 *         (e3='def' t=Term) | 
	 *         (t=Term t2=Term) | 
	 *         (t=Term t2=Term) | 
	 *         (e3='(' form=Formula) | 
	 *         (misfix=Misfix misfix2+=Misfix*)
	 *     )
	 */
	protected void sequence_FormulaUnary(EObject context, Formu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uop='not' expr=Formula)
	 */
	protected void sequence_FormulaUnary(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quantifier=Quantifier varDecl=VarDecl varDecl2+=VarDecl* formula=Formula) | formula=FormulaAnd)
	 */
	protected void sequence_Formula(EObject context, Formu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (str=STRING | num=INT)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         misfix=Misfix | 
	 *         misfix=Misfix | 
	 *         misfix=Misfix | 
	 *         op1=Token | 
	 *         op2=Literal | 
	 *         op3=Place | 
	 *         op4=QualPredName | 
	 *         op5=QualVarName | 
	 *         op6=QualOpName | 
	 *         op='[' | 
	 *         op='{'
	 *     )
	 */
	protected void sequence_MisfixUnary(EObject context, Mfix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MisfixWhen_MisfixWhen_1_0 op='when' formula=Formula op0='when' right=MisfixUnary)
	 */
	protected void sequence_MisfixWhen(EObject context, MisfixWhen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Misfix_Misfix_1_0 op=':' sort=Sort)
	 */
	protected void sequence_Misfix(EObject context, Misfix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     basicSpec=BasicSpec
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.MODEL__BASIC_SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.MODEL__BASIC_SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getBasicSpecBasicSpecParserRuleCall_0(), semanticObject.getBasicSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op='assoc' | op='comm' | op='idem' | (op='unit' term=Term))
	 */
	protected void sequence_OpAttr(EObject context, OpAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sort=Sort | (argDecl=ArgDecl argDecl2+=ArgDecl* sort=Sort))
	 */
	protected void sequence_OpHead(EObject context, OpHead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((opName=OpName opName2+=OpName* opType=OpType opAttr+=OpAttr*) | (opName=OpName opHead=OpHead term=Term))
	 */
	protected void sequence_OpItem(EObject context, OpItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_OpName(EObject context, OpName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID opType=OpType)
	 */
	protected void sequence_OpName_QualOpName(EObject context, OpName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.OP_NAME__OP_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.OP_NAME__OP_TYPE));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.OP_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.OP_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQualOpNameAccess().getOpTypeOpTypeParserRuleCall_4_0(), semanticObject.getOpType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sort=Sort | (sort=Sort sort2+=Sort* sort3=Sort))
	 */
	protected void sequence_OpType(EObject context, OpType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (argDecl=ArgDecl argDecl2+=ArgDecl*)
	 */
	protected void sequence_PredHead(EObject context, PredHead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((predName=PredName predName2+=PredName* predType+=PredType) | (predName=PredName predHead=PredHead? formula=Formula))
	 */
	protected void sequence_PredItem(EObject context, PredItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PredName(EObject context, PredName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID predType=PredType)
	 */
	protected void sequence_PredName_QualVarName(EObject context, PredName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.PRED_NAME__PRED_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.PRED_NAME__PRED_TYPE));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.PRED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.PRED_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQualVarNameAccess().getPredTypePredTypeParserRuleCall_4_0(), semanticObject.getPredType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((sort=Sort sort2+=Sort*) | b='(')
	 */
	protected void sequence_PredType(EObject context, PredType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sort=Sort)
	 */
	protected void sequence_QualPredName_Var(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.VAR__SORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.VAR__SORT));
			if(transientValues.isValueTransient(semanticObject, EditorPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EditorPackage.Literals.VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQualPredNameAccess().getSortSortParserRuleCall_4_0(), semanticObject.getSort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (q='forall' | q='exists' | q='exists!')
	 */
	protected void sequence_Quantifier(EObject context, Quantifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (sortItem=SortItem sortItem2+=SortItem*) | 
	 *         (opItem=OpItem opItem2+=OpItem*) | 
	 *         (predItem=PredItem predItem2+=PredItem*) | 
	 *         (datatypeDecl=DatatypeDecl datatypeDecl2+=DatatypeDecl*)
	 *     )
	 */
	protected void sequence_SigItems(EObject context, SigItems semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sort=Sort sort2+=Sort*)
	 */
	protected void sequence_SortItem(EObject context, SortItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Sort(EObject context, Sort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (misfix=Misfix misfix2+=Misfix*)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term=Term term2+=Term*)
	 */
	protected void sequence_Terms(EObject context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | num=INT | (name=ID t=Token))
	 */
	protected void sequence_Token(EObject context, Token semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Var var2+=Var* sort=Sort)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
