# Generated from ACMulticapa.g4 by ANTLR 4.13.1
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


    # Visit a parse tree produced by ACMulticapaParser#layeredCellRef.
    def visitLayeredCellRef(self, ctx:ACMulticapaParser.LayeredCellRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#diseaseState.
    def visitDiseaseState(self, ctx:ACMulticapaParser.DiseaseStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#transitionRule.
    def visitTransitionRule(self, ctx:ACMulticapaParser.TransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapaParser#condition.
    def visitCondition(self, ctx:ACMulticapaParser.ConditionContext):
        return self.visitChildren(ctx)



del ACMulticapaParser