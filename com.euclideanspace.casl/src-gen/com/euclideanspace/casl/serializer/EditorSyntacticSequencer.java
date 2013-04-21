package com.euclideanspace.casl.serializer;

import com.euclideanspace.casl.services.EditorGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EditorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Alternative_QuestionMarkKeyword_1_2_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_2_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_3_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_4_3_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_5_6_q;
	protected AbstractElementAlias match_BasicItems_TypeKeyword_1_1_0_or_TypesKeyword_1_1_1;
	protected AbstractElementAlias match_BasicItems_TypeKeyword_2_1_0_or_TypesKeyword_2_1_1;
	protected AbstractElementAlias match_BasicItems_VarKeyword_4_0_0_or_VarsKeyword_4_0_1;
	protected AbstractElementAlias match_Component_QuestionMarkKeyword_0_3_q;
	protected AbstractElementAlias match_OpHead_QuestionMarkKeyword_0_1_q;
	protected AbstractElementAlias match_OpHead_QuestionMarkKeyword_1_3_q;
	protected AbstractElementAlias match_OpType_QuestionMarkKeyword_0_0_q;
	protected AbstractElementAlias match_OpType_QuestionMarkKeyword_1_2_q;
	protected AbstractElementAlias match_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1;
	protected AbstractElementAlias match_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_0_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_1_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_2_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_3_3_q;
	protected AbstractElementAlias match_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1;
	protected AbstractElementAlias match_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_Alternative_QuestionMarkKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getAlternativeAccess().getQuestionMarkKeyword_1_2());
		match_BasicItems_SemicolonKeyword_1_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_4());
		match_BasicItems_SemicolonKeyword_2_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_2_4());
		match_BasicItems_SemicolonKeyword_3_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_3_4());
		match_BasicItems_SemicolonKeyword_4_3_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_4_3());
		match_BasicItems_SemicolonKeyword_5_6_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_5_6());
		match_BasicItems_TypeKeyword_1_1_0_or_TypesKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypeKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypesKeyword_1_1_1()));
		match_BasicItems_TypeKeyword_2_1_0_or_TypesKeyword_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypeKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypesKeyword_2_1_1()));
		match_BasicItems_VarKeyword_4_0_0_or_VarsKeyword_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getVarKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getVarsKeyword_4_0_1()));
		match_Component_QuestionMarkKeyword_0_3_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getQuestionMarkKeyword_0_3());
		match_OpHead_QuestionMarkKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getOpHeadAccess().getQuestionMarkKeyword_0_1());
		match_OpHead_QuestionMarkKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getOpHeadAccess().getQuestionMarkKeyword_1_3());
		match_OpType_QuestionMarkKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getOpTypeAccess().getQuestionMarkKeyword_0_0());
		match_OpType_QuestionMarkKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getOpTypeAccess().getQuestionMarkKeyword_1_2());
		match_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getOpKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getOpsKeyword_1_0_1()));
		match_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getPredKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getPredsKeyword_2_0_1()));
		match_SigItems_SemicolonKeyword_0_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_0_3());
		match_SigItems_SemicolonKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_1_3());
		match_SigItems_SemicolonKeyword_2_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_2_3());
		match_SigItems_SemicolonKeyword_3_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_3_3());
		match_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getSortKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getSortsKeyword_0_0_1()));
		match_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getTypeKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getTypesKeyword_3_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Alternative_QuestionMarkKeyword_1_2_q.equals(syntax))
				emit_Alternative_QuestionMarkKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_2_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_2_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_3_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_3_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_4_3_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_4_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_5_6_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_5_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_TypeKeyword_1_1_0_or_TypesKeyword_1_1_1.equals(syntax))
				emit_BasicItems_TypeKeyword_1_1_0_or_TypesKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_TypeKeyword_2_1_0_or_TypesKeyword_2_1_1.equals(syntax))
				emit_BasicItems_TypeKeyword_2_1_0_or_TypesKeyword_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_VarKeyword_4_0_0_or_VarsKeyword_4_0_1.equals(syntax))
				emit_BasicItems_VarKeyword_4_0_0_or_VarsKeyword_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_QuestionMarkKeyword_0_3_q.equals(syntax))
				emit_Component_QuestionMarkKeyword_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpHead_QuestionMarkKeyword_0_1_q.equals(syntax))
				emit_OpHead_QuestionMarkKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpHead_QuestionMarkKeyword_1_3_q.equals(syntax))
				emit_OpHead_QuestionMarkKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpType_QuestionMarkKeyword_0_0_q.equals(syntax))
				emit_OpType_QuestionMarkKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpType_QuestionMarkKeyword_1_2_q.equals(syntax))
				emit_OpType_QuestionMarkKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1.equals(syntax))
				emit_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1.equals(syntax))
				emit_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_SemicolonKeyword_0_3_q.equals(syntax))
				emit_SigItems_SemicolonKeyword_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_SemicolonKeyword_1_3_q.equals(syntax))
				emit_SigItems_SemicolonKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_SemicolonKeyword_2_3_q.equals(syntax))
				emit_SigItems_SemicolonKeyword_2_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_SemicolonKeyword_3_3_q.equals(syntax))
				emit_SigItems_SemicolonKeyword_3_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1.equals(syntax))
				emit_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1.equals(syntax))
				emit_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_Alternative_QuestionMarkKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_2_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_3_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_4_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_5_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type' | 'types'
	 */
	protected void emit_BasicItems_TypeKeyword_1_1_0_or_TypesKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'types' | 'type'
	 */
	protected void emit_BasicItems_TypeKeyword_2_1_0_or_TypesKeyword_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var' | 'vars'
	 */
	protected void emit_BasicItems_VarKeyword_4_0_0_or_VarsKeyword_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_Component_QuestionMarkKeyword_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_OpHead_QuestionMarkKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_OpHead_QuestionMarkKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_OpType_QuestionMarkKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_OpType_QuestionMarkKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ops' | 'op'
	 */
	protected void emit_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'pred' | 'preds'
	 */
	protected void emit_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_SigItems_SemicolonKeyword_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_SigItems_SemicolonKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_SigItems_SemicolonKeyword_2_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_SigItems_SemicolonKeyword_3_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'sort' | 'sorts'
	 */
	protected void emit_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type' | 'types'
	 */
	protected void emit_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
