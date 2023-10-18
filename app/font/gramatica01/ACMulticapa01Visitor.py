# Generated from ACMulticapa01.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ACMulticapa01Parser import ACMulticapa01Parser
else:
    from ACMulticapa01Parser import ACMulticapa01Parser

# This class defines a complete generic visitor for a parse tree produced by ACMulticapa01Parser.

class ACMulticapa01Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by ACMulticapa01Parser#program.
    def visitProgram(self, ctx:ACMulticapa01Parser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#layer.
    def visitLayer(self, ctx:ACMulticapa01Parser.LayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#cell.
    def visitCell(self, ctx:ACMulticapa01Parser.CellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#diseaseState.
    def visitDiseaseState(self, ctx:ACMulticapa01Parser.DiseaseStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#transitionRule.
    def visitTransitionRule(self, ctx:ACMulticapa01Parser.TransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#condition.
    def visitCondition(self, ctx:ACMulticapa01Parser.ConditionContext):
        return self.visitChildren(ctx)



del ACMulticapa01Parser