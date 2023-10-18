# Generated from ACMulticapa01.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,18,53,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,4,
        0,14,8,0,11,0,12,0,15,1,0,4,0,19,8,0,11,0,12,0,20,1,0,1,0,1,1,1,
        1,1,1,1,1,4,1,29,8,1,11,1,12,1,30,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,
        2,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,0,0,6,0,2,
        4,6,8,10,0,1,1,0,7,11,49,0,13,1,0,0,0,2,24,1,0,0,0,4,34,1,0,0,0,
        6,40,1,0,0,0,8,42,1,0,0,0,10,49,1,0,0,0,12,14,3,2,1,0,13,12,1,0,
        0,0,14,15,1,0,0,0,15,13,1,0,0,0,15,16,1,0,0,0,16,18,1,0,0,0,17,19,
        3,8,4,0,18,17,1,0,0,0,19,20,1,0,0,0,20,18,1,0,0,0,20,21,1,0,0,0,
        21,22,1,0,0,0,22,23,5,0,0,1,23,1,1,0,0,0,24,25,5,1,0,0,25,26,5,17,
        0,0,26,28,5,2,0,0,27,29,3,4,2,0,28,27,1,0,0,0,29,30,1,0,0,0,30,28,
        1,0,0,0,30,31,1,0,0,0,31,32,1,0,0,0,32,33,5,3,0,0,33,3,1,0,0,0,34,
        35,5,4,0,0,35,36,5,17,0,0,36,37,5,5,0,0,37,38,3,6,3,0,38,39,5,6,
        0,0,39,5,1,0,0,0,40,41,7,0,0,0,41,7,1,0,0,0,42,43,5,12,0,0,43,44,
        3,6,3,0,44,45,5,13,0,0,45,46,3,6,3,0,46,47,5,14,0,0,47,48,3,10,5,
        0,48,9,1,0,0,0,49,50,5,15,0,0,50,51,3,6,3,0,51,11,1,0,0,0,3,15,20,
        30
    ]

class ACMulticapa01Parser ( Parser ):

    grammarFileName = "ACMulticapa01.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", 
                     "')'", "'SUSCEPTIBLE'", "'EXPOSED'", "'INFECTADO'", 
                     "'RECUPERADO'", "'MUERTO'", "'REGLA'", "'->'", "'SI'", 
                     "'VECINOS'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "STRING", "NUMBER", "WS" ]

    RULE_program = 0
    RULE_layer = 1
    RULE_cell = 2
    RULE_diseaseState = 3
    RULE_transitionRule = 4
    RULE_condition = 5

    ruleNames =  [ "program", "layer", "cell", "diseaseState", "transitionRule", 
                   "condition" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    STRING=16
    NUMBER=17
    WS=18

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ACMulticapa01Parser.EOF, 0)

        def layer(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa01Parser.LayerContext)
            else:
                return self.getTypedRuleContext(ACMulticapa01Parser.LayerContext,i)


        def transitionRule(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa01Parser.TransitionRuleContext)
            else:
                return self.getTypedRuleContext(ACMulticapa01Parser.TransitionRuleContext,i)


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = ACMulticapa01Parser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 12
                self.layer()
                self.state = 15 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

            self.state = 18 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 17
                self.transitionRule()
                self.state = 20 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==12):
                    break

            self.state = 22
            self.match(ACMulticapa01Parser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LayerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(ACMulticapa01Parser.NUMBER, 0)

        def cell(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa01Parser.CellContext)
            else:
                return self.getTypedRuleContext(ACMulticapa01Parser.CellContext,i)


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_layer

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLayer" ):
                listener.enterLayer(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLayer" ):
                listener.exitLayer(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLayer" ):
                return visitor.visitLayer(self)
            else:
                return visitor.visitChildren(self)




    def layer(self):

        localctx = ACMulticapa01Parser.LayerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_layer)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(ACMulticapa01Parser.T__0)
            self.state = 25
            self.match(ACMulticapa01Parser.NUMBER)
            self.state = 26
            self.match(ACMulticapa01Parser.T__1)
            self.state = 28 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 27
                self.cell()
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==4):
                    break

            self.state = 32
            self.match(ACMulticapa01Parser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CellContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(ACMulticapa01Parser.NUMBER, 0)

        def diseaseState(self):
            return self.getTypedRuleContext(ACMulticapa01Parser.DiseaseStateContext,0)


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_cell

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCell" ):
                listener.enterCell(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCell" ):
                listener.exitCell(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCell" ):
                return visitor.visitCell(self)
            else:
                return visitor.visitChildren(self)




    def cell(self):

        localctx = ACMulticapa01Parser.CellContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_cell)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.match(ACMulticapa01Parser.T__3)
            self.state = 35
            self.match(ACMulticapa01Parser.NUMBER)
            self.state = 36
            self.match(ACMulticapa01Parser.T__4)
            self.state = 37
            self.diseaseState()
            self.state = 38
            self.match(ACMulticapa01Parser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DiseaseStateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_diseaseState

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDiseaseState" ):
                listener.enterDiseaseState(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDiseaseState" ):
                listener.exitDiseaseState(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDiseaseState" ):
                return visitor.visitDiseaseState(self)
            else:
                return visitor.visitChildren(self)




    def diseaseState(self):

        localctx = ACMulticapa01Parser.DiseaseStateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_diseaseState)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3968) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TransitionRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def diseaseState(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa01Parser.DiseaseStateContext)
            else:
                return self.getTypedRuleContext(ACMulticapa01Parser.DiseaseStateContext,i)


        def condition(self):
            return self.getTypedRuleContext(ACMulticapa01Parser.ConditionContext,0)


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_transitionRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTransitionRule" ):
                listener.enterTransitionRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTransitionRule" ):
                listener.exitTransitionRule(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTransitionRule" ):
                return visitor.visitTransitionRule(self)
            else:
                return visitor.visitChildren(self)




    def transitionRule(self):

        localctx = ACMulticapa01Parser.TransitionRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_transitionRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(ACMulticapa01Parser.T__11)
            self.state = 43
            self.diseaseState()
            self.state = 44
            self.match(ACMulticapa01Parser.T__12)
            self.state = 45
            self.diseaseState()
            self.state = 46
            self.match(ACMulticapa01Parser.T__13)
            self.state = 47
            self.condition()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def diseaseState(self):
            return self.getTypedRuleContext(ACMulticapa01Parser.DiseaseStateContext,0)


        def getRuleIndex(self):
            return ACMulticapa01Parser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = ACMulticapa01Parser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(ACMulticapa01Parser.T__14)
            self.state = 50
            self.diseaseState()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





