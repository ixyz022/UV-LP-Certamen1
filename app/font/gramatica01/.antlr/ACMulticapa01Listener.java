// Generated from c:/Users/ixyz0/Personal/Dev/UV-LP-Certamen1/app/font/gramatica01/ACMulticapa01.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#diseaseState}.
	 * @param ctx the parse tree
	 */
	void enterDiseaseState(ACMulticapa01Parser.DiseaseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#diseaseState}.
	 * @param ctx the parse tree
	 */
	void exitDiseaseState(ACMulticapa01Parser.DiseaseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#transitionRule}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRule(ACMulticapa01Parser.TransitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#transitionRule}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRule(ACMulticapa01Parser.TransitionRuleContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#transitionDiseaseState}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDiseaseState(ACMulticapa01Parser.TransitionDiseaseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#transitionDiseaseState}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDiseaseState(ACMulticapa01Parser.TransitionDiseaseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa01Parser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(ACMulticapa01Parser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa01Parser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(ACMulticapa01Parser.StepContext ctx);
}