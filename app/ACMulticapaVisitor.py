# Generated from ANTLR/ACMulticapa.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ACMulticapaParser import ACMulticapaParser
else:
    from ACMulticapaParser import ACMulticapaParser

# This class defines a complete generic visitor for a parse tree produced by ACMulticapaParser.

class ACMulticapaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ACMulticapaParser#program.
    def visitProgram(self, ctx:ACMulticapaParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#layer.
    def visitLayer(self, ctx:ACMulticapaParser.LayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#cell.
    def visitCell(self, ctx:ACMulticapaParser.CellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#vecindad.
    def visitVecindad(self, ctx:ACMulticapaParser.VecindadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#cellRef.
    def visitCellRef(self, ctx:ACMulticapaParser.CellRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#cellState.
    def visitCellState(self, ctx:ACMulticapaParser.CellStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#transitionRule.
    def visitTransitionRule(self, ctx:ACMulticapaParser.TransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#condition.
    def visitCondition(self, ctx:ACMulticapaParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#simulation.
    def visitSimulation(self, ctx:ACMulticapaParser.SimulationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#step.
    def visitStep(self, ctx:ACMulticapaParser.StepContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#cellAction.
    def visitCellAction(self, ctx:ACMulticapaParser.CellActionContext):
        return self.visitChildren(ctx)



del ACMulticapaParser