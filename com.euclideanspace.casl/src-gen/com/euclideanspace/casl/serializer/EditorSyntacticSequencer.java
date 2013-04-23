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
	protected AbstractElementAlias match_Alternative_QuestionMarkKeyword_1_3_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_1_0_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_2_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_3_4_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_4_3_q;
	protected AbstractElementAlias match_BasicItems_SemicolonKeyword_1_5_6_q;
	protected AbstractElementAlias match_BasicItems_TypeKeyword_1_1_0_1_0_or_TypesKeyword_1_1_0_1_1;
	protected AbstractElementAlias match_BasicItems_TypeKeyword_1_2_1_0_or_TypesKeyword_1_2_1_1;
	protected AbstractElementAlias match_BasicItems_VarKeyword_1_4_0_0_or_VarsKeyword_1_4_0_1;
	protected AbstractElementAlias match_BasicItems___ImpliesKeyword_0_1_or_MonoKeyword_0_0__a;
	protected AbstractElementAlias match_BasicSpec___AUTHORSTerminalRuleCall_0_3_or_DATETerminalRuleCall_0_4_or_DISPLAYTerminalRuleCall_0_5_or_FLOATINGTerminalRuleCall_0_8_or_ImpliesKeyword_0_0_or_LEFTASSOCTerminalRuleCall_0_6_or_NUMBERTerminalRuleCall_0_7_or_PREC1TerminalRuleCall_0_9_or_PRECTerminalRuleCall_0_10__a;
	protected AbstractElementAlias match_Component_QuestionMarkKeyword_0_3_q;
	protected AbstractElementAlias match_OpHead_QuestionMarkKeyword_0_1_q;
	protected AbstractElementAlias match_OpHead_QuestionMarkKeyword_1_3_q;
	protected AbstractElementAlias match_OpItem_ImpliesKeyword_0_q;
	protected AbstractElementAlias match_OpType_QuestionMarkKeyword_0_0_q;
	protected AbstractElementAlias match_OpType_QuestionMarkKeyword_1_3_q;
	protected AbstractElementAlias match_PredItem_ImpliesKeyword_0_q;
	protected AbstractElementAlias match_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1;
	protected AbstractElementAlias match_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_0_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_1_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_2_3_q;
	protected AbstractElementAlias match_SigItems_SemicolonKeyword_3_3_q;
	protected AbstractElementAlias match_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1;
	protected AbstractElementAlias match_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1;
	protected AbstractElementAlias match_SortItem_ImpliesKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_Alternative_QuestionMarkKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getAlternativeAccess().getQuestionMarkKeyword_1_3());
		match_BasicItems_SemicolonKeyword_1_1_0_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_1_0_4());
		match_BasicItems_SemicolonKeyword_1_2_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_2_4());
		match_BasicItems_SemicolonKeyword_1_3_4_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_3_4());
		match_BasicItems_SemicolonKeyword_1_4_3_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_4_3());
		match_BasicItems_SemicolonKeyword_1_5_6_q = new TokenAlias(false, true, grammarAccess.getBasicItemsAccess().getSemicolonKeyword_1_5_6());
		match_BasicItems_TypeKeyword_1_1_0_1_0_or_TypesKeyword_1_1_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypeKeyword_1_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypesKeyword_1_1_0_1_1()));
		match_BasicItems_TypeKeyword_1_2_1_0_or_TypesKeyword_1_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypeKeyword_1_2_1_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getTypesKeyword_1_2_1_1()));
		match_BasicItems_VarKeyword_1_4_0_0_or_VarsKeyword_1_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getVarKeyword_1_4_0_0()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getVarsKeyword_1_4_0_1()));
		match_BasicItems___ImpliesKeyword_0_1_or_MonoKeyword_0_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getImpliesKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getBasicItemsAccess().getMonoKeyword_0_0()));
		match_BasicSpec___AUTHORSTerminalRuleCall_0_3_or_DATETerminalRuleCall_0_4_or_DISPLAYTerminalRuleCall_0_5_or_FLOATINGTerminalRuleCall_0_8_or_ImpliesKeyword_0_0_or_LEFTASSOCTerminalRuleCall_0_6_or_NUMBERTerminalRuleCall_0_7_or_PREC1TerminalRuleCall_0_9_or_PRECTerminalRuleCall_0_10__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getAUTHORSTerminalRuleCall_0_3()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getDATETerminalRuleCall_0_4()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getDISPLAYTerminalRuleCall_0_5()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getFLOATINGTerminalRuleCall_0_8()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getImpliesKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getLEFTASSOCTerminalRuleCall_0_6()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getNUMBERTerminalRuleCall_0_7()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getPREC1TerminalRuleCall_0_9()), new TokenAlias(false, false, grammarAccess.getBasicSpecAccess().getPRECTerminalRuleCall_0_10()));
		match_Component_QuestionMarkKeyword_0_3_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getQuestionMarkKeyword_0_3());
		match_OpHead_QuestionMarkKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getOpHeadAccess().getQuestionMarkKeyword_0_1());
		match_OpHead_QuestionMarkKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getOpHeadAccess().getQuestionMarkKeyword_1_3());
		match_OpItem_ImpliesKeyword_0_q = new TokenAlias(false, true, grammarAccess.getOpItemAccess().getImpliesKeyword_0());
		match_OpType_QuestionMarkKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getOpTypeAccess().getQuestionMarkKeyword_0_0());
		match_OpType_QuestionMarkKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getOpTypeAccess().getQuestionMarkKeyword_1_3());
		match_PredItem_ImpliesKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPredItemAccess().getImpliesKeyword_0());
		match_SigItems_OpKeyword_1_0_0_or_OpsKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getOpKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getOpsKeyword_1_0_1()));
		match_SigItems_PredKeyword_2_0_0_or_PredsKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getPredKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getPredsKeyword_2_0_1()));
		match_SigItems_SemicolonKeyword_0_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_0_3());
		match_SigItems_SemicolonKeyword_1_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_1_3());
		match_SigItems_SemicolonKeyword_2_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_2_3());
		match_SigItems_SemicolonKeyword_3_3_q = new TokenAlias(false, true, grammarAccess.getSigItemsAccess().getSemicolonKeyword_3_3());
		match_SigItems_SortKeyword_0_0_0_or_SortsKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getSortKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getSortsKeyword_0_0_1()));
		match_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getTypeKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSigItemsAccess().getTypesKeyword_3_0_1()));
		match_SortItem_ImpliesKeyword_0_q = new TokenAlias(false, true, grammarAccess.getSortItemAccess().getImpliesKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAUTHORSRule())
			return getAUTHORSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDATERule())
			return getDATEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDISPLAYRule())
			return getDISPLAYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFLOATINGRule())
			return getFLOATINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLEFTASSOCRule())
			return getLEFTASSOCToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPRECRule())
			return getPRECToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPREC1Rule())
			return getPREC1Token(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AUTHORS :'%authors' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getAUTHORSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%authors";
	}
	
	/**
	 * terminal DATE :'%date' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getDATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%date";
	}
	
	/**
	 * terminal DISPLAY :'%display' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getDISPLAYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%display";
	}
	
	/**
	 * terminal FLOATING :'%floating' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getFLOATINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%floating";
	}
	
	/**
	 * terminal LEFTASSOC :'%left_assoc' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getLEFTASSOCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%left_assoc";
	}
	
	/**
	 * terminal NUMBER :'%number' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%number";
	}
	
	/**
	 * terminal PREC : '%prec(' -> ')%';
	 */
	protected String getPRECToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%prec(";
	}
	
	/**
	 * terminal PREC1 :'%prec' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getPREC1Token(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%prec";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Alternative_QuestionMarkKeyword_1_3_q.equals(syntax))
				emit_Alternative_QuestionMarkKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_1_0_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_1_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_2_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_2_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_3_4_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_3_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_4_3_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_4_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_SemicolonKeyword_1_5_6_q.equals(syntax))
				emit_BasicItems_SemicolonKeyword_1_5_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_TypeKeyword_1_1_0_1_0_or_TypesKeyword_1_1_0_1_1.equals(syntax))
				emit_BasicItems_TypeKeyword_1_1_0_1_0_or_TypesKeyword_1_1_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_TypeKeyword_1_2_1_0_or_TypesKeyword_1_2_1_1.equals(syntax))
				emit_BasicItems_TypeKeyword_1_2_1_0_or_TypesKeyword_1_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems_VarKeyword_1_4_0_0_or_VarsKeyword_1_4_0_1.equals(syntax))
				emit_BasicItems_VarKeyword_1_4_0_0_or_VarsKeyword_1_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicItems___ImpliesKeyword_0_1_or_MonoKeyword_0_0__a.equals(syntax))
				emit_BasicItems___ImpliesKeyword_0_1_or_MonoKeyword_0_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BasicSpec___AUTHORSTerminalRuleCall_0_3_or_DATETerminalRuleCall_0_4_or_DISPLAYTerminalRuleCall_0_5_or_FLOATINGTerminalRuleCall_0_8_or_ImpliesKeyword_0_0_or_LEFTASSOCTerminalRuleCall_0_6_or_NUMBERTerminalRuleCall_0_7_or_PREC1TerminalRuleCall_0_9_or_PRECTerminalRuleCall_0_10__a.equals(syntax))
				emit_BasicSpec___AUTHORSTerminalRuleCall_0_3_or_DATETerminalRuleCall_0_4_or_DISPLAYTerminalRuleCall_0_5_or_FLOATINGTerminalRuleCall_0_8_or_ImpliesKeyword_0_0_or_LEFTASSOCTerminalRuleCall_0_6_or_NUMBERTerminalRuleCall_0_7_or_PREC1TerminalRuleCall_0_9_or_PRECTerminalRuleCall_0_10__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_QuestionMarkKeyword_0_3_q.equals(syntax))
				emit_Component_QuestionMarkKeyword_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpHead_QuestionMarkKeyword_0_1_q.equals(syntax))
				emit_OpHead_QuestionMarkKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpHead_QuestionMarkKeyword_1_3_q.equals(syntax))
				emit_OpHead_QuestionMarkKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpItem_ImpliesKeyword_0_q.equals(syntax))
				emit_OpItem_ImpliesKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpType_QuestionMarkKeyword_0_0_q.equals(syntax))
				emit_OpType_QuestionMarkKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpType_QuestionMarkKeyword_1_3_q.equals(syntax))
				emit_OpType_QuestionMarkKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredItem_ImpliesKeyword_0_q.equals(syntax))
				emit_PredItem_ImpliesKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_SortItem_ImpliesKeyword_0_q.equals(syntax))
				emit_SortItem_ImpliesKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_Alternative_QuestionMarkKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_1_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_2_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_3_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_4_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BasicItems_SemicolonKeyword_1_5_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'types' | 'type'
	 */
	protected void emit_BasicItems_TypeKeyword_1_1_0_1_0_or_TypesKeyword_1_1_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'type' | 'types'
	 */
	protected void emit_BasicItems_TypeKeyword_1_2_1_0_or_TypesKeyword_1_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var' | 'vars'
	 */
	protected void emit_BasicItems_VarKeyword_1_4_0_0_or_VarsKeyword_1_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('%implies' | '%mono')*
	 */
	protected void emit_BasicItems___ImpliesKeyword_0_1_or_MonoKeyword_0_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     AUTHORS | 
	     DISPLAY | 
	     NUMBER | 
	     DATE | 
	     FLOATING | 
	     LEFTASSOC | 
	     PREC | 
	     '%implies' | 
	     PREC1
	 )*
	 */
	protected void emit_BasicSpec___AUTHORSTerminalRuleCall_0_3_or_DATETerminalRuleCall_0_4_or_DISPLAYTerminalRuleCall_0_5_or_FLOATINGTerminalRuleCall_0_8_or_ImpliesKeyword_0_0_or_LEFTASSOCTerminalRuleCall_0_6_or_NUMBERTerminalRuleCall_0_7_or_PREC1TerminalRuleCall_0_9_or_PRECTerminalRuleCall_0_10__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '%implies'?
	 */
	protected void emit_OpItem_ImpliesKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_OpType_QuestionMarkKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '%implies'?
	 */
	protected void emit_PredItem_ImpliesKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'preds' | 'pred'
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
	 *     'types' | 'type'
	 */
	protected void emit_SigItems_TypeKeyword_3_0_0_or_TypesKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '%implies'?
	 */
	protected void emit_SortItem_ImpliesKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
