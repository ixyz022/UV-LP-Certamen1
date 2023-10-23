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


    # Visit a parse tree produced by ACMulticapa02Parser#ignoredLines.
    def visitIgnoredLines(self, ctx:ACMulticapa02Parser.IgnoredLinesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#grammarChoice.
    def visitGrammarChoice(self, ctx:ACMulticapa02Parser.GrammarChoiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#stepsChoice.
    def visitStepsChoice(self, ctx:ACMulticapa02Parser.StepsChoiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#durationStandard.
    def visitDurationStandard(self, ctx:ACMulticapa02Parser.DurationStandardContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#durationState.
    def visitDurationState(self, ctx:ACMulticapa02Parser.DurationStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#layer.
    def visitLayer(self, ctx:ACMulticapa02Parser.LayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#cell.
    def visitCell(self, ctx:ACMulticapa02Parser.CellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#diseaseStateSet.
    def visitDiseaseStateSet(self, ctx:ACMulticapa02Parser.DiseaseStateSetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#diseaseState.
    def visitDiseaseState(self, ctx:ACMulticapa02Parser.DiseaseStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#basicState.
    def visitBasicState(self, ctx:ACMulticapa02Parser.BasicStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#transitions.
    def visitTransitions(self, ctx:ACMulticapa02Parser.TransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#durationTransitions.
    def visitDurationTransitions(self, ctx:ACMulticapa02Parser.DurationTransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#durationTransitionRule.
    def visitDurationTransitionRule(self, ctx:ACMulticapa02Parser.DurationTransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#cellTransitions.
    def visitCellTransitions(self, ctx:ACMulticapa02Parser.CellTransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#cellTransitionRule.
    def visitCellTransitionRule(self, ctx:ACMulticapa02Parser.CellTransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#condition.
    def visitCondition(self, ctx:ACMulticapa02Parser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa02Parser#comparison.
    def visitComparison(self, ctx:ACMulticapa02Parser.ComparisonContext):
        return self.visitChildren(ctx)



del ACMulticapa02Parser