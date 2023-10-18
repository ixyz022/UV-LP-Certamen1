# Generated from ACMulticapa02.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ACMulticapa02Parser import ACMulticapa02Parser
else:
    from ACMulticapa02Parser import ACMulticapa02Parser

# This class defines a complete generic visitor for a parse tree produced by ACMulticapa02Parser.

class ACMulticapa02Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by ACMulticapa02Parser#program.
    def visitProgram(self, ctx:ACMulticapa02Parser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#layer.
    def visitLayer(self, ctx:ACMulticapa02Parser.LayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#cell.
    def visitCell(self, ctx:ACMulticapa02Parser.CellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#diseaseState.
    def visitDiseaseState(self, ctx:ACMulticapa02Parser.DiseaseStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#stateName.
    def visitStateName(self, ctx:ACMulticapa02Parser.StateNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#transitionRule.
    def visitTransitionRule(self, ctx:ACMulticapa02Parser.TransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#condition.
    def visitCondition(self, ctx:ACMulticapa02Parser.ConditionContext):
        return self.visitChildren(ctx)



del ACMulticapa02Parser