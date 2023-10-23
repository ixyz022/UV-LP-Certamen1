// Generated from d:/Documentos/Development Projects/UV-LP-Certamen1/app/font/gramatica01/ACMulticapa01.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACMulticapa01Parser}.
 */
public interface ACMulticapa01Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ACMulticapa01Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ACMulticapa01Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#ignoredLines}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredLines(ACMulticapa01Parser.IgnoredLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#ignoredLines}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredLines(ACMulticapa01Parser.IgnoredLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#grammarChoice}.
	 * @param ctx the parse tree
	 */
	void enterGrammarChoice(ACMulticapa01Parser.GrammarChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#grammarChoice}.
	 * @param ctx the parse tree
	 */
	void exitGrammarChoice(ACMulticapa01Parser.GrammarChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#stepsChoice}.
	 * @param ctx the parse tree
	 */
	void enterStepsChoice(ACMulticapa01Parser.StepsChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#stepsChoice}.
	 * @param ctx the parse tree
	 */
	void exitStepsChoice(ACMulticapa01Parser.StepsChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#durationStandard}.
	 * @param ctx the parse tree
	 */
	void enterDurationStandard(ACMulticapa01Parser.DurationStandardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#durationStandard}.
	 * @param ctx the parse tree
	 */
	void exitDurationStandard(ACMulticapa01Parser.DurationStandardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#durationState}.
	 * @param ctx the parse tree
	 */
	void enterDurationState(ACMulticapa01Parser.DurationStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#durationState}.
	 * @param ctx the parse tree
	 */
	void exitDurationState(ACMulticapa01Parser.DurationStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(ACMulticapa01Parser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(ACMulticapa01Parser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(ACMulticapa01Parser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(ACMulticapa01Parser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#basicState}.
	 * @param ctx the parse tree
	 */
	void enterBasicState(ACMulticapa01Parser.BasicStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#basicState}.
	 * @param ctx the parse tree
	 */
	void exitBasicState(ACMulticapa01Parser.BasicStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(ACMulticapa01Parser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(ACMulticapa01Parser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#neighborTransitions}.
	 * @param ctx the parse tree
	 */
	void enterNeighborTransitions(ACMulticapa01Parser.NeighborTransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#neighborTransitions}.
	 * @param ctx the parse tree
	 */
	void exitNeighborTransitions(ACMulticapa01Parser.NeighborTransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#neighborTransitionRule}.
	 * @param ctx the parse tree
	 */
	void enterNeighborTransitionRule(ACMulticapa01Parser.NeighborTransitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#neighborTransitionRule}.
	 * @param ctx the parse tree
	 */
	void exitNeighborTransitionRule(ACMulticapa01Parser.NeighborTransitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#durationTransitions}.
	 * @param ctx the parse tree
	 */
	void enterDurationTransitions(ACMulticapa01Parser.DurationTransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#durationTransitions}.
	 * @param ctx the parse tree
	 */
	void exitDurationTransitions(ACMulticapa01Parser.DurationTransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#durationTransitionRule}.
	 * @param ctx the parse tree
	 */
	void enterDurationTransitionRule(ACMulticapa01Parser.DurationTransitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#durationTransitionRule}.
	 * @param ctx the parse tree
	 */
	void exitDurationTransitionRule(ACMulticapa01Parser.DurationTransitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ACMulticapa01Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ACMulticapa01Parser.ConditionContext ctx);
}