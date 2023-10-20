// Generated from c:/Users/ixyz0/Personal/Dev/UV-LP-Certamen1/app/font/gramatica02/ACMulticapa02.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACMulticapa02Parser}.
 */
public interface ACMulticapa02Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ACMulticapa02Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ACMulticapa02Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(ACMulticapa02Parser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(ACMulticapa02Parser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(ACMulticapa02Parser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(ACMulticapa02Parser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#diseaseState}.
	 * @param ctx the parse tree
	 */
	void enterDiseaseState(ACMulticapa02Parser.DiseaseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#diseaseState}.
	 * @param ctx the parse tree
	 */
	void exitDiseaseState(ACMulticapa02Parser.DiseaseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#stateName}.
	 * @param ctx the parse tree
	 */
	void enterStateName(ACMulticapa02Parser.StateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#stateName}.
	 * @param ctx the parse tree
	 */
	void exitStateName(ACMulticapa02Parser.StateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#transitionRule}.
	 * @param ctx the parse tree
	 */
	void enterTransitionRule(ACMulticapa02Parser.TransitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#transitionRule}.
	 * @param ctx the parse tree
	 */
	void exitTransitionRule(ACMulticapa02Parser.TransitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACMulticapa02Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ACMulticapa02Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACMulticapa02Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ACMulticapa02Parser.ConditionContext ctx);
}