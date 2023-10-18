# Generated from ACMulticapa02.g4 by ANTLR 4.13.1
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
        4,1,19,68,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,1,0,4,0,16,8,0,11,0,12,0,17,1,0,4,0,21,8,0,11,0,12,0,22,1,0,1,
        0,1,1,1,1,1,1,1,1,4,1,31,8,1,11,1,12,1,32,1,1,1,1,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,5,2,45,8,2,10,2,12,2,48,9,2,1,2,1,2,1,3,1,3,1,
        3,1,3,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,0,0,7,
        0,2,4,6,8,10,12,0,1,1,0,8,12,64,0,15,1,0,0,0,2,26,1,0,0,0,4,36,1,
        0,0,0,6,51,1,0,0,0,8,55,1,0,0,0,10,57,1,0,0,0,12,64,1,0,0,0,14,16,
        3,2,1,0,15,14,1,0,0,0,16,17,1,0,0,0,17,15,1,0,0,0,17,18,1,0,0,0,
        18,20,1,0,0,0,19,21,3,10,5,0,20,19,1,0,0,0,21,22,1,0,0,0,22,20,1,
        0,0,0,22,23,1,0,0,0,23,24,1,0,0,0,24,25,5,0,0,1,25,1,1,0,0,0,26,
        27,5,1,0,0,27,28,5,18,0,0,28,30,5,2,0,0,29,31,3,4,2,0,30,29,1,0,
        0,0,31,32,1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,34,1,0,0,0,34,35,
        5,3,0,0,35,3,1,0,0,0,36,37,5,4,0,0,37,38,5,18,0,0,38,39,5,5,0,0,
        39,40,5,18,0,0,40,41,5,2,0,0,41,46,3,6,3,0,42,43,5,6,0,0,43,45,3,
        6,3,0,44,42,1,0,0,0,45,48,1,0,0,0,46,44,1,0,0,0,46,47,1,0,0,0,47,
        49,1,0,0,0,48,46,1,0,0,0,49,50,5,3,0,0,50,5,1,0,0,0,51,52,3,8,4,
        0,52,53,5,7,0,0,53,54,5,18,0,0,54,7,1,0,0,0,55,56,7,0,0,0,56,9,1,
        0,0,0,57,58,5,13,0,0,58,59,3,8,4,0,59,60,5,14,0,0,60,61,3,8,4,0,
        61,62,5,15,0,0,62,63,3,12,6,0,63,11,1,0,0,0,64,65,5,16,0,0,65,66,
        3,8,4,0,66,13,1,0,0,0,4,17,22,32,46
    ]

class ACMulticapa02Parser ( Parser ):

    grammarFileName = "ACMulticapa02.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CAPA'", "'{'", "'}'", "'CELDA'", "'POBLACION'", 
                     "','", "':'", "'SUSCEPTIBLE'", "'EXPOSED'", "'INFECTADO'", 
                     "'RECUPERADO'", "'MUERTO'", "'REGLA'", "'->'", "'SI'", 
                     "'VECINOS'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "STRING", "NUMBER", "WS" ]

    RULE_program = 0
    RULE_layer = 1
    RULE_cell = 2
    RULE_diseaseState = 3
    RULE_stateName = 4
    RULE_transitionRule = 5
    RULE_condition = 6

    ruleNames =  [ "program", "layer", "cell", "diseaseState", "stateName", 
                   "transitionRule", "condition" ]

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
    T__15=16
    STRING=17
    NUMBER=18
    WS=19

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
            return self.getToken(ACMulticapa02Parser.EOF, 0)

        def layer(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa02Parser.LayerContext)
            else:
                return self.getTypedRuleContext(ACMulticapa02Parser.LayerContext,i)


        def transitionRule(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa02Parser.TransitionRuleContext)
            else:
                return self.getTypedRuleContext(ACMulticapa02Parser.TransitionRuleContext,i)


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_program

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

        localctx = ACMulticapa02Parser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 14
                self.layer()
                self.state = 17 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

            self.state = 20 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 19
                self.transitionRule()
                self.state = 22 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==13):
                    break

            self.state = 24
            self.match(ACMulticapa02Parser.EOF)
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
            return self.getToken(ACMulticapa02Parser.NUMBER, 0)

        def cell(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa02Parser.CellContext)
            else:
                return self.getTypedRuleContext(ACMulticapa02Parser.CellContext,i)


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_layer

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

        localctx = ACMulticapa02Parser.LayerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_layer)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(ACMulticapa02Parser.T__0)
            self.state = 27
            self.match(ACMulticapa02Parser.NUMBER)
            self.state = 28
            self.match(ACMulticapa02Parser.T__1)
            self.state = 30 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 29
                self.cell()
                self.state = 32 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==4):
                    break

            self.state = 34
            self.match(ACMulticapa02Parser.T__2)
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

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ACMulticapa02Parser.NUMBER)
            else:
                return self.getToken(ACMulticapa02Parser.NUMBER, i)

        def diseaseState(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa02Parser.DiseaseStateContext)
            else:
                return self.getTypedRuleContext(ACMulticapa02Parser.DiseaseStateContext,i)


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_cell

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

        localctx = ACMulticapa02Parser.CellContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_cell)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(ACMulticapa02Parser.T__3)
            self.state = 37
            self.match(ACMulticapa02Parser.NUMBER)
            self.state = 38
            self.match(ACMulticapa02Parser.T__4)
            self.state = 39
            self.match(ACMulticapa02Parser.NUMBER)
            self.state = 40
            self.match(ACMulticapa02Parser.T__1)
            self.state = 41
            self.diseaseState()
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 42
                self.match(ACMulticapa02Parser.T__5)
                self.state = 43
                self.diseaseState()
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 49
            self.match(ACMulticapa02Parser.T__2)
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

        def stateName(self):
            return self.getTypedRuleContext(ACMulticapa02Parser.StateNameContext,0)


        def NUMBER(self):
            return self.getToken(ACMulticapa02Parser.NUMBER, 0)

        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_diseaseState

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

        localctx = ACMulticapa02Parser.DiseaseStateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_diseaseState)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.stateName()
            self.state = 52
            self.match(ACMulticapa02Parser.T__6)
            self.state = 53
            self.match(ACMulticapa02Parser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StateNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_stateName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStateName" ):
                listener.enterStateName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStateName" ):
                listener.exitStateName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStateName" ):
                return visitor.visitStateName(self)
            else:
                return visitor.visitChildren(self)




    def stateName(self):

        localctx = ACMulticapa02Parser.StateNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_stateName)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7936) != 0)):
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

        def stateName(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapa02Parser.StateNameContext)
            else:
                return self.getTypedRuleContext(ACMulticapa02Parser.StateNameContext,i)


        def condition(self):
            return self.getTypedRuleContext(ACMulticapa02Parser.ConditionContext,0)


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_transitionRule

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

        localctx = ACMulticapa02Parser.TransitionRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_transitionRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(ACMulticapa02Parser.T__12)
            self.state = 58
            self.stateName()
            self.state = 59
            self.match(ACMulticapa02Parser.T__13)
            self.state = 60
            self.stateName()
            self.state = 61
            self.match(ACMulticapa02Parser.T__14)
            self.state = 62
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

        def stateName(self):
            return self.getTypedRuleContext(ACMulticapa02Parser.StateNameContext,0)


        def getRuleIndex(self):
            return ACMulticapa02Parser.RULE_condition

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

        localctx = ACMulticapa02Parser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(ACMulticapa02Parser.T__15)
            self.state = 65
            self.stateName()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





