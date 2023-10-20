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


    # Visit a parse tree produced by ACMulticapa01Parser#ignoredLines.
    def visitIgnoredLines(self, ctx:ACMulticapa01Parser.IgnoredLinesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#grammarChoice.
    def visitGrammarChoice(self, ctx:ACMulticapa01Parser.GrammarChoiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#stepsChoice.
    def visitStepsChoice(self, ctx:ACMulticapa01Parser.StepsChoiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#durationStandard.
    def visitDurationStandard(self, ctx:ACMulticapa01Parser.DurationStandardContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#durationState.
    def visitDurationState(self, ctx:ACMulticapa01Parser.DurationStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#layer.
    def visitLayer(self, ctx:ACMulticapa01Parser.LayerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#cell.
    def visitCell(self, ctx:ACMulticapa01Parser.CellContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#basicState.
    def visitBasicState(self, ctx:ACMulticapa01Parser.BasicStateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#transitions.
    def visitTransitions(self, ctx:ACMulticapa01Parser.TransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#neighborTransitions.
    def visitNeighborTransitions(self, ctx:ACMulticapa01Parser.NeighborTransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#neighborTransitionRule.
    def visitNeighborTransitionRule(self, ctx:ACMulticapa01Parser.NeighborTransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#durationTransitions.
    def visitDurationTransitions(self, ctx:ACMulticapa01Parser.DurationTransitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#durationTransitionRule.
    def visitDurationTransitionRule(self, ctx:ACMulticapa01Parser.DurationTransitionRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ACMulticapa01Parser#condition.
    def visitCondition(self, ctx:ACMulticapa01Parser.ConditionContext):
        return self.visitChildren(ctx)



del ACMulticapa01Parser