# Generated from ANTLR/ACMulticapa.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ACMulticapaParser import ACMulticapaParser
else:
    from ACMulticapaParser import ACMulticapaParser

# This class defines a complete listener for a parse tree produced by ACMulticapaParser.
class ACMulticapaListener(ParseTreeListener):

    # Enter a parse tree produced by ACMulticapaParser#program.
    def enterProgram(self, ctx:ACMulticapaParser.ProgramContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#program.
    def exitProgram(self, ctx:ACMulticapaParser.ProgramContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#layer.
    def enterLayer(self, ctx:ACMulticapaParser.LayerContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#layer.
    def exitLayer(self, ctx:ACMulticapaParser.LayerContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#cell.
    def enterCell(self, ctx:ACMulticapaParser.CellContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#cell.
    def exitCell(self, ctx:ACMulticapaParser.CellContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#vecindad.
    def enterVecindad(self, ctx:ACMulticapaParser.VecindadContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#vecindad.
    def exitVecindad(self, ctx:ACMulticapaParser.VecindadContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#cellRef.
    def enterCellRef(self, ctx:ACMulticapaParser.CellRefContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#cellRef.
    def exitCellRef(self, ctx:ACMulticapaParser.CellRefContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#cellState.
    def enterCellState(self, ctx:ACMulticapaParser.CellStateContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#cellState.
    def exitCellState(self, ctx:ACMulticapaParser.CellStateContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#transitionRule.
    def enterTransitionRule(self, ctx:ACMulticapaParser.TransitionRuleContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#transitionRule.
    def exitTransitionRule(self, ctx:ACMulticapaParser.TransitionRuleContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#condition.
    def enterCondition(self, ctx:ACMulticapaParser.ConditionContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#condition.
    def exitCondition(self, ctx:ACMulticapaParser.ConditionContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#simulation.
    def enterSimulation(self, ctx:ACMulticapaParser.SimulationContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#simulation.
    def exitSimulation(self, ctx:ACMulticapaParser.SimulationContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#step.
    def enterStep(self, ctx:ACMulticapaParser.StepContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#step.
    def exitStep(self, ctx:ACMulticapaParser.StepContext):
        pass


    # Enter a parse tree produced by ACMulticapaParser#cellAction.
    def enterCellAction(self, ctx:ACMulticapaParser.CellActionContext):
        pass

    # Exit a parse tree produced by ACMulticapaParser#cellAction.
    def exitCellAction(self, ctx:ACMulticapaParser.CellActionContext):
        pass



del ACMulticapaParser